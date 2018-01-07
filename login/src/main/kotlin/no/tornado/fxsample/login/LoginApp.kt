package no.tornado.fxsample.login

import javafx.application.Application
import javafx.stage.Stage
import tornadofx.App
import tornadofx.importStylesheet

class LoginApp : App(LoginScreen::class) {
    val loginController: LoginController by inject()

    override fun start(stage: Stage) {
        importStylesheet(Styles::class)
        super.start(stage)
        loginController.init()
    }
}

fun main(args: Array<String>) {

    Runtime.getRuntime().addShutdownHook(Thread {
        System.out.println("JVM shutdown: " + System.currentTimeMillis())
    })
    System.out.println("Application started: " + System.currentTimeMillis())
    Application.launch(LoginApp::class.java, *args)
    System.out.println("Application closed: " + System.currentTimeMillis())
}