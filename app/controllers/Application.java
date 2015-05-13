package controllers;

import java.util.Arrays;
import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;
import views.html.tasks;
import views.html.help;
import models.Task;
import java.util.Date;

public class Application extends Controller {

    public static Result index() {
    	int foo = 3;
    	System.out.println(foo);
        return ok(index.render("Your new application is ready."));
    }

    public static Result tasks() {
    	 Task task   = new Task();
         task.name   = "Pizza を食べる";
         task.period = new Date();
         task.save();

         List<Task> taskList = Task.find.all();
         return ok(tasks.render(taskList));
    }

    public static Result help() {
    	return ok(help.render());
    }
}
