package io.mateu.demo;

import io.mateu.mdd.core.annotations.MateuUI;
import io.mateu.mdd.shared.annotations.Home;

@MateuUI(path = "")
public class MyApp {

    @Home
    String home = "<h1>Hello, World!</h1>";

}
