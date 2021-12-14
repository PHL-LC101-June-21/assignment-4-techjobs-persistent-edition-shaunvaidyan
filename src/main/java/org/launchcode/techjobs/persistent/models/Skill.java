package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.NotBlank;

@Entity
public class Skill extends AbstractEntity {
    @NotBlank(message ="Description can't be Null")
    @Size(min=1, max=255, message="Description must be between 1 and 255 characters.")

    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();
    public Skill(String description) {
        this.description = description;
    }
    public Skill() {

    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}