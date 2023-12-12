package org.example.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Id;

@AllArgsConstructor @Getter
public class Client {
    @Id
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String mail;
}
