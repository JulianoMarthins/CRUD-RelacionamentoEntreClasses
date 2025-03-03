package com.julianomarthins.entidadesParaUm.services;

import com.julianomarthins.entidadesParaUm.dto.PersonDTO;
import com.julianomarthins.entidadesParaUm.dto.PersonDepartmentDTO;
import com.julianomarthins.entidadesParaUm.entities.Department;
import com.julianomarthins.entidadesParaUm.entities.Person;
import com.julianomarthins.entidadesParaUm.repositories.DepartmentRepository;
import com.julianomarthins.entidadesParaUm.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonServices {

    // Atributos de classe

    @Autowired
    private PersonRepository repositoryPerson;
    @Autowired
    private DepartmentRepository repositoryDepartment;

    // Atributos

    /*
            Adiciona um usuário ao banco de dados utilizando o Json no formato de objeto alinhado:

                    {
                        "name": "Juliano ",
                        "salary": 4500.0,
                        "department": {
                            "id": 2
                        }
                    }
     */
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
        Person entity = new Person();

        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department department = repositoryDepartment.getReferenceById(dto.getDepartment().getId());

        entity.setDepartment(department);
        entity = repositoryPerson.save(entity);

        return new PersonDepartmentDTO(entity);

    }

        /*
            Adiciona um usuário ao banco de dados utilizando o Json no formato:

                    {
                        "name": "Juliano ",
                        "salary": 4500.0,
                        "departmentId": 1
                    }
     */

    public PersonDTO insert(PersonDTO dto){
        Person entity = new Person();
        entity.setName(dto.getName());
        entity.setSalary(dto.getSalary());

        Department department = new Department( );
        department.setId(dto.getDepartmentId());


        entity.setDepartment(department);
        entity = repositoryPerson.save(entity);

        return new PersonDTO(entity);
    }








}
