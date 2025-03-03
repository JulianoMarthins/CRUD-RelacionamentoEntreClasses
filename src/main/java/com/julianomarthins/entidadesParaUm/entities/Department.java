package com.julianomarthins.entidadesParaUm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_department")
public class Department {


    // Atributos de Classe
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "department")
    private List<Person> people = new ArrayList<>();


    // Construtores
    public Department() {

    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }


    // Métodos
    public void addPeople(Person people) {
        this.people.add(people);
    }


    // Getters & Setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPeople() {
        return people;
    }
}
