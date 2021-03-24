package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message="Description cannot be blank.")
    @Size(max=255, message="Description cannot be longer than 255 characters.")
    private String description;

    public Skill() {}

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

}