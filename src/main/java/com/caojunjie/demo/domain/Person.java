package com.caojunjie.demo.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Person {
    private int id;
    private String name;
    private String address;

}