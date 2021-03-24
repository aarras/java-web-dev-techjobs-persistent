package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank
    @Size(max=150, message="Location cannot be longer than 150 characters.")
    private String location;

    public Employer() {}

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

}
