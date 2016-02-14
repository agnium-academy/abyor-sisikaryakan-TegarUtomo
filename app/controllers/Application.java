package controllers;

import model.manager.ManagerDrilling;
import play.*;
import play.libs.Json;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {

        ManagerDrilling tegar = new ManagerDrilling(1,"Tegar","Cilacap");
        tegar.setJenisManager("CEO");
        tegar.tampilInformasi();
        return ok(Json.toJson(tegar));
    }

}
