package io.mateu.demo;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;
import io.mateu.mdd.core.app.AbstractApplication;
import io.mateu.mdd.vaadinport.vaadin.MDDUI;

import javax.servlet.annotation.WebServlet;

@Theme("demo")
@Title("MyComponent Add-on Demo")
@SuppressWarnings("serial")
public class DemoUI extends MDDUI
{

    @WebServlet(value = "/*", asyncSupported = true)
    @VaadinServletConfiguration(productionMode = false, ui = DemoUI.class)
    public static class Servlet extends VaadinServlet {
    }


    @Override
    public AbstractApplication createApp() {
        return new DemoApp();
    }

}
