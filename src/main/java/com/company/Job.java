package com.company;

import java.util.Objects;

public class Job {
    private static int nextId = 1;

    private int id;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: add two constructors - one to initialize a unique ID and a second to initialize the other five fields. The second constructor should also call the first in order to initialize the 'id' field

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && Objects.equals(name, job.name) && Objects.equals(employer, job.employer) && Objects.equals(location, job.location) && Objects.equals(positionType, job.positionType) && Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    @Override
    public String toString() {
        String nameValue = this.name;
        String employerValue = this.getEmployer().toString();
        String locationValue = this.getLocation().toString();
        String positionTypeValue = this.getPositionType().toString();
        String coreCompetencyValue = this.getCoreCompetency().toString();

        if (this.name.equals("")) {
            nameValue = "Data not available";
        }
        if (this.employer.getValue().equals("")) {
            employerValue = "Data not available";
        }
        if (this.location.getValue().equals("")) {
            locationValue = "Data not available";
        }
        if (this.positionType.getValue().equals("")) {
            positionTypeValue = "Data not available";
        }
        if (this.coreCompetency.getValue().equals("")) {
            coreCompetencyValue = "Data not available";
        }

        return "\nID: " + this.id + "\nName: " + nameValue + "\nEmployer: " + employerValue + "\nLocation: " + locationValue + "\nPosition Type: " + positionTypeValue + "\nCore Competency: " + coreCompetencyValue + "\n";
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID and id.


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
