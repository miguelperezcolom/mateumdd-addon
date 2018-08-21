package io.mateu.demo;

import io.mateu.demo.model.Persona;
import io.mateu.mdd.core.annotations.Action;
import io.mateu.mdd.core.annotations.Caption;
import io.mateu.mdd.core.app.AbstractAction;
import io.mateu.mdd.core.app.MDDOpenCRUDAction;
import io.mateu.mdd.core.app.SimpleMDDApplication;

@Caption("My demo app")
public class DemoApp extends SimpleMDDApplication {

    @Action
    public String hello(String name) {
        return "Hello " + name;
    }


    @Action
    public AbstractAction people() {
        return new MDDOpenCRUDAction(Persona.class);
    }

}
