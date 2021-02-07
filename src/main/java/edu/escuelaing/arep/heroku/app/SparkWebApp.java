package edu.escuelaing.arep.heroku.app;

/**
 * Hello world!
 *
 */

import edu.escuelaing.arep.heroku.app.model.LinkedList;
import edu.escuelaing.arep.heroku.app.services.Calculator;

import java.sql.ClientInfoStatus;

import static spark.Spark.*;

public class SparkWebApp {

    public static void main(String[] args) {

        LinkedList dataset = new LinkedList();
        Calculator calculator = new Calculator();

        port(getPort());
        staticFiles.location("/public");

        get("/hello", (request, response) -> {
            return dataset.getTail().getValue();
        });

        post("/add/:number",(request, response) -> {
            dataset.add(Double.parseDouble(request.params(":number")));
            return true;
        });

        post("/clear",(request, response) -> {
            dataset.clear();
            return true;
        });

        get("/list",(request, response) -> dataset.toString());

        get("/mean",(request, response) -> calculator.mean(dataset));

        get("/deviation",(request, response) -> calculator.standarDeviation(dataset));

    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set(i.e. on localhost)
    }
}

