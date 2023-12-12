package org.example.task1;

import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@ToString(callSuper = true)
@SuperBuilder
public class Student extends User {
    @Singular("mark")
    private List<Integer> grades;

}
