package io.mateu.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Getter@Setter
public class Persona {

    @Id@GeneratedValue
    private long id;

    @NotEmpty
    private String name;

    private int age;

    @NotNull
    private Gender gender;

}
