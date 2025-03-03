package com.julianomarthins.entidadesParaUm.dto;


import com.julianomarthins.entidadesParaUm.entities.Person;

public class PersonDTO {

    // Atributos
    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;


    // Construtores
    public PersonDTO(){

    }

    public PersonDTO(Long id, String name, Double salary, Long departmentId){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.departmentId = departmentId;

    }

    public PersonDTO(Person entity){
        id = entity.getId();
        name = entity.getName();
        salary = entity.getSalary();
        departmentId = entity.getDepartment().getId();
    }


    // Getters & Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }
}
