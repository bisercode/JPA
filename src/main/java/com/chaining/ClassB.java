package com.chaining;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Embeddable
public class ClassB {
    private String myStrB;
    @Embedded
    private ClassA classARef;

    public String getMyStrB() {
        return myStrB;
    }

    public void setMyStrB(String myStrB) {
        this.myStrB = myStrB;
    }

    public ClassA getClassARef() {
        return classARef;
    }

    public void setClassARef(ClassA classARef) {
        this.classARef = classARef;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "myStrB='" + myStrB + '\'' +
                ", classARef=" + classARef +
                '}';
    }
}
