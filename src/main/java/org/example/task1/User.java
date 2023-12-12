package org.example.task1;

import lombok.ToString;
import lombok.experimental.SuperBuilder;

@ToString(callSuper = true)
@SuperBuilder
public class User {
    private String name;
    private int age;
    private String gender;
    private double weight;
    private double height;
}