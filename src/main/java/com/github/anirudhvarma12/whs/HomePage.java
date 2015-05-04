package com.github.anirudhvarma12.whs;

import org.apache.log4j.Logger;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class HomePage extends WebPage {

    @SpringBean
    public SpringInterface inteface;

    private static final long serialVersionUID = 1L;

    private static Logger LOG = Logger.getLogger(HomePage.class);

    public HomePage(final PageParameters parameters) {
        super(parameters);
        LOG.debug("Implmentation says " + inteface.getString());

        // TODO Add your page's components here

    }

}
