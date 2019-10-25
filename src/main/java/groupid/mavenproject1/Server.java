/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupid.mavenproject1;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

/**
 *
 * @author brian
 */
public class Server {

    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.addStaticFiles("./static", Location.EXTERNAL);

        }).start(7000);

        app.get("/ajax", ctx -> {

            ctx.result("This text came from the server via ajax");

        });
    }

}
