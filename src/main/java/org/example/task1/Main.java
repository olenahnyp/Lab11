package org.example.task1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        User user = Student.builder()
                .name("Oles")
                .age(32)
                .mark(61)
                .mark(100)
                .grades(Arrays.asList(62, 63))
                .gender("m").build();
        System.out.println(user);
    };
}