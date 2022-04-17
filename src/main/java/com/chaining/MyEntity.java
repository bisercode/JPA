package com.chaining;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MyEntity {
    @Id
    @GeneratedValue
    private int id;

    @Embedded
    private ClassB classBRef;

    public ClassB getClassBRef() {
        return classBRef;
    }

    public void setClassBRef(ClassB classBRef) {
        this.classBRef = classBRef;
    }

    @Override
    public String toString() {
        return "EntityB{" +
                "id=" + id +
                ", classBRef=" + classBRef +
                '}';
    }
}
