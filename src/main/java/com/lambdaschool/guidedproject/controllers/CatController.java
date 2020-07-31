package com.lambdaschool.guidedproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// This is where we say this class contains REST endpoints.
// Being a "controller" this controls what Java method gets invoked when an endpoint to called by a client.
// Since the CatController class is annotated with a Spring Annotation, it becomes a Bean, a Java class managed by Spring
@RestController
public class CatController {
    // This annotation automatically connects the resource Cat to this controller and thus these endpoints.
    @Autowired
    private CatRepository catRepos;

    // This sets up a route call /cats. By saying "produces = ", the annotation also sets that the body of any response will be in JSON format.
    // The HTTP method connected with this route is GET
    // A response is returned to the client.
    // The response includes all of the cats in the database
    // The response includes an HTTP Status Code of OK
    @GetMapping(value = "/cats", produces = {"application/json"})
    public ResponseEntity<?> findAllCats() {
        return new ResponseEntity<>(catRepos.findAll(), HTTPStatus.OK);
    }
}
