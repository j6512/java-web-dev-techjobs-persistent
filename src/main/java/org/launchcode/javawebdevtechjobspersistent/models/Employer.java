package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "This field can not be left empty.")
    @Size(min = 1, max = 100, message = "The location must be between 1 and 100 characters.")
    private String location;

    public Employer(String location) {
        this.location = location;
    }

    public Employer() {}

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
