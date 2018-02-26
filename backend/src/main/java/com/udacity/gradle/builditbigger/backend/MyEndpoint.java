package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.hendercine.android.javajoker.JokeSource;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that pulls a joke from the JokeSource and returns it */
    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {
        MyBean response = new MyBean();
        response.setData(JokeSource.getJoke());

        return response;
    }
    //    @ApiMethod(name = "getJokeFromServer")
//    public MyBean getJokeFromServer() {
//        MyBean response = new MyBean();
//        response.setData(JokeSource.getJoke());
//
//        return response;
//    }

}
