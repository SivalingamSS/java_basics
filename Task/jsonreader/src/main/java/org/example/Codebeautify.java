package org.example;

import java.util.ArrayList;

public class Codebeautify {
    private String university;
    private String location;
    ArrayList<Object> courses = new ArrayList<Object>();


    // Getter Methods

    public String getUniversity() {
        return university;
    }

    public String getLocation() {
        return location;
    }

    // Setter Methods

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
