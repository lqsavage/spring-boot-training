package com.example.threadsafe.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private int age;

    public User() {
        super();
    }
}
