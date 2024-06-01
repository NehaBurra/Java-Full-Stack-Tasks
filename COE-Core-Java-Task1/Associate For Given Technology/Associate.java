/*
Create class Associate with below attributes:
id - int
name - String
technology - String
experienceInYears - int
 */

 public class Associate {
    private int id;
    private String name;
    private String technology;
    private int experienceInYears;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTechnology(String technology) {
        this.technology = technology;
    }
    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getTechnology() {
        return technology;
    }
    public int getExperienceInYears() {
        return experienceInYears;
    }
    public Associate(int id, String name, String technology, int experienceInYears) {
        this.id = id;
        this.name = name;
        this.technology = technology;
        this.experienceInYears = experienceInYears;
    }
 }