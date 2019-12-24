package com.caojunjie.demo.controller;

import com.caojunjie.demo.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private Person person;

    @RequestMapping(value = "/{user}",method = RequestMethod.GET)
    public Person getPerson(@PathVariable String user){
        person.setAddress("beijing");
        person.setId(1);
        person.setName(user);

        return person;
    }
}
