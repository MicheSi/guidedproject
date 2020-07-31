package com.lambdaschool.guidedproject.models;

// Note that Java Spring provides its own implementation of javax

import javax.persistence.*;

// This annotation says that Cat is a Bean and will be managed by Spring
// Entity says that this is a class whose objects will be saved in a database
@Entity

// Table annotation gives the name to use for the table in the database where the object data will be saved
// It is customary to give the table an explicit name like this.
// Notice how the table is plural and the class is singular. Another common practice.
@Table(name = "cats")

public class Cat {
    // In a database setting, each object must have a unique "primary key"
    // The Id annotation marks which field will serve as the primary key
    // The GeneratedValue annotation directs the database on how to generate a primary key.
    // a Strategy of GenerationType.AUTO tells the database to generate a primary key as best the database sees fit.
    // Note the annotations affect the field immediantly following the annotations.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long catid;

    // The column annotation allows for modifications to the field that get reflected in the database,
    // in this case all catnames must be unique across all cat objects and each object must have a catname.
    // Note the annotation affects the field immediantly following the annotation!
    @Column(unique = true, nullable = false)
    String catname;

    // Spring Data requires the default constructor, regardless of any other constructors made available.
    public Cat() {
    }

    // Spring uses getters to return data to clients
    public long getCatid() {
        return catid;
    }

    // Spring uses setters to set dat in the object

    public void setCatid(long catid) {
        this.catid = catid;
    }

    public String getCatname() {
        return catname;
    }

    public void setCatname(String catname) {
        this.catname = catname;
    }
}
