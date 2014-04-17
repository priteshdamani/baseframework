package com.pir.services.impl;

import com.pir.dao.DaoFactory;
import com.pir.dao.IUserDao;
import com.pir.domain.User;
import com.pir.exceptions.EmailAlreadyUsedException;
import com.pir.exceptions.UsernameAlreadyUsedException;
import com.pir.services.IUserService;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service("userService")
@Transactional(readOnly = true)
public class UserService implements IUserService{

	private PasswordEncoder encoder = new ShaPasswordEncoder();

    @Autowired
    private IUserDao userDao;

	
	@Autowired
	private DaoFactory daoFactory;
	
	public User findByUsername(String username) {
		User user = daoFactory.getDao(User.class).findOneByCriteria(Restrictions.eq("username",  username));
		return user;
	}

	public User findByEmail(String email) {
		User user = daoFactory.getDao(User.class).findOneByCriteria(Restrictions.eq("email",  email));
		return user;
	}
	
	@Transactional
	public void installNewUser(User user) {
		user.setPassword(encoder.encodePassword(user.getPassword(), user.getUsername()));
		daoFactory.getDao(User.class).save(user);
	}

    @Transactional(readOnly = false)
    public User registerUser(User user) throws UsernameAlreadyUsedException, EmailAlreadyUsedException {
        User dbUser = userDao.searchUserByUsername(user.getUsername());
        if (dbUser != null) {
            throw new UsernameAlreadyUsedException("Username " + user.getUsername() + " is taken.");
        }
        dbUser = userDao.SearchUserByEmail(user.getEmail());
        if (dbUser != null) {
            throw new EmailAlreadyUsedException("Email " + user.getEmail() + " is taken.");
        }

        user.setPassword(encoder.encodePassword(user.getPassword(), user.getUsername()));

        user = userDao.save(user);

        return user;
    }

    public Long authenticate(String identifier, String password) {
        User user = findByUsername(identifier);
        if (user != null){
            return user.getId();
        }
        user = findByEmail(identifier);
        if (user != null){
            return user.getId();
        }
        return null;
    }
}
