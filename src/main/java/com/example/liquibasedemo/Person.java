package com.example.liquibasedemo;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tbl_person")
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;

    @Column(length = 50)
    private String name;

    @Column(length = 20)
    private String height;

    @Column(length = 100)
    private String address;

    public Person() {
        super();
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public Person(String name, String height) {
        this.name = name;
        this.height = height;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
