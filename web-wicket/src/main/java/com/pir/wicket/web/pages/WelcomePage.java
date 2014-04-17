package com.pir.wicket.web.pages;

import com.pir.domain.User;
import com.pir.services.impl.UserService;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.spring.injection.annot.SpringBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created with IntelliJ IDEA.
 * User: pritesh
 * Date: 12/4/13
 * Time: 7:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class WelcomePage extends WebPage {


    private final Logger logger = LoggerFactory.getLogger(WelcomePage.class);

    @SpringBean
    private UserService userService;

    public WelcomePage(final PageParameters parameters) {
        super(parameters);

        User user = new User();
        user.setUsername("admin");
        user.setPassword("password");
        userService.installNewUser(user);
    }
}
