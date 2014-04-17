package com.pir.services;

import com.pir.domain.User;
import com.pir.exceptions.EmailAlreadyUsedException;
import com.pir.exceptions.UsernameAlreadyUsedException;

/**
 * Created with IntelliJ IDEA.
 * User: pritesh
 * Date: 12/8/13
 * Time: 6:06 PM
 * To change this template use File | Settings | File Templates.
 */
public interface IUserService {

    User registerUser(User user) throws UsernameAlreadyUsedException, EmailAlreadyUsedException;
}
