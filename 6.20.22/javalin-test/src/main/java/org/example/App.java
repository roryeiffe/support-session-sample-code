package org.example;
import io.javalin.Javalin;

import static io.javalin.apibuilder.ApiBuilder.path;
import static io.javalin.apibuilder.ApiBuilder.post;


/**
 * Hello world!
 *
 */
// RORY TODO: Get this example to Dan
public class App 
{
    public static void main( String[] args )
    {
        // starting our app on port 7070
        Javalin app = Javalin.create().start(7070);

        // setting up a get request that returns the string "Hello Worlds"
        app.get("/", ctx -> ctx.result("Hello Worlds"));


        // given an endpoint (/fruits or /cat) we return some corresponding value:
        app.get("/fruit", ctx -> ctx.result("apples, banana, orange"));
        // we are returning an object rather than a string here:
        app.get("/cat", ctx -> ctx.result(new Pet("cat", "ashes").toString()));

        // instead of setting up each route individually, we can set up multiple/nested routes at one time:
        app.routes(() -> {
            // the endpoint "cat":
            path("/cat", () -> {
                // we're going to POST a cat object
                post(ctx -> {
//                  // we take the body from the request and print it out:
                    Pet cat = ctx.bodyAsClass(Pet.class);
                    // we just print out
                    System.out.println(cat);
                });

                // because this endpoint is specified within the scope of the /cats endpoint, it's "nested"
                // so the endpoint becomes /cat/{id} where id refers to a path variable that we can specify
                // when we call this request in Postman or Chrome or wherever:
                path("/{id}", () -> {
                    // within this post, we're just defining what happens when this endpoint is called:
                    post(ctx -> {
                        String pathParam = ctx.pathParam("id");
                        System.out.println(pathParam);
                    });
               });

            });
        });
    }
}


/**
 *
 */