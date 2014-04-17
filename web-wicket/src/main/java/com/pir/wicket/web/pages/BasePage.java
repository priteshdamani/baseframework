package com.pir.wicket.web.pages;

import com.pir.wicket.web.components.CustomSession;
import org.apache.wicket.markup.html.WebPage;

/**
 * Created with IntelliJ IDEA.
 * User: pritesh
 * Date: 12/5/13
 * Time: 1:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasePage extends WebPage {


    @Override
    public CustomSession getSession() {
        return (CustomSession) super.getSession();
    }
}
