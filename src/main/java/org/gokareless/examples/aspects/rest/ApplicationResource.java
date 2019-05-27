package org.gokareless.examples.aspects.rest;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/application",
        produces = MediaType.APPLICATION_JSON_VALUE
)
public class ApplicationResource {

    @GetMapping
    public String list() {
        System.out.println("!!!YEAH!!! I'm in ApplicationResource");
        return "success";
    }
}
