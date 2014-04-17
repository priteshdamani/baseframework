package com.pir.wicket.web.components;

import org.apache.wicket.feedback.IFeedbackMessageFilter;
import org.apache.wicket.markup.html.panel.FeedbackPanel;

/**
 * Created with IntelliJ IDEA.
 * User: pritesh
 * Date: 12/5/13
 * Time: 1:24 PM
 * To change this template use File | Settings | File Templates.
 */

public class ErrorPanel extends FeedbackPanel {
    private static final long serialVersionUID = 1L;


    public ErrorPanel(String id, IFeedbackMessageFilter filter) {
        super(id, filter);
    }


    public ErrorPanel(String id) {
        super(id);
    }
}