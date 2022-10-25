package com.example.exampl;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="exmp")
public class Example {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    public String name;
}
