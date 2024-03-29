package com.cyberoxi.sevadathink.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(exclude = "projects", callSuper = false)
@Entity
public class Employee extends AuditModel {

    private String avatar;

    private String firstName;

    private String lastName;

    private String email;

    private String phoneNumber;

    @Lob
    private String address;

    @ManyToMany
    private List<Project> projects = new ArrayList<>();

    @ManyToOne
    private Company company;

    public void addProject(Project project){
        this.projects.add(project);
    }
}
