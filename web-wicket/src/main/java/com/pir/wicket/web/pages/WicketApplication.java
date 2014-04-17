package com.pir.wicket.web.pages;

import com.pir.wicket.web.components.CustomSession;
import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.Request;
import org.apache.wicket.request.Response;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.HashMap;
import java.util.Map;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see com.pir.Start#main(String[])
 */
public class WicketApplication extends WebApplication implements ApplicationContextAware
{

    // used in testing instead of getting from servletcontext when deployed in tomcat
    private ApplicationContext applicationContext;
    private Map<String,Class> pathMountPageMap = new HashMap<String, Class>();

	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

    @Override
    public Session newSession(Request request, Response response) {
        return new CustomSession(request);
    }

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();

        // for @SpringBean
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, applicationContext));


        pathMountPageMap.put("/welcome", WelcomePage.class);
        // this creates a test user.
        pathMountPageMap.put("/signup", WelcomePage.class);
        pathMountPageMap.put("/home", HomePage.class);
        pathMountPageMap.put("/login", LoginPage.class);

        // mount all the pages
        for (Map.Entry<String,Class> entry : pathMountPageMap.entrySet()) {
            mountPage(entry.getKey(), entry.getValue());
        }


        // add your configuration here
	}

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
