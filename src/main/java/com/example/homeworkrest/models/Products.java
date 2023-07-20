package com.example.homeworkrest.models;
import lombok.*;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Products {

    private String name;
    private int number;
    private int year;

}
