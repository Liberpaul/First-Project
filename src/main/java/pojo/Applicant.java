package main.java.pojo;


public class Applicant {
    private String name;
    private int age;
    private String country;

    private String educationDegree;
    private int salary;


    public Applicant(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Applicant(String name, int age, String country, int salary, String educationDegree) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.salary = salary;
        this.educationDegree = educationDegree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEducationDegree(String educationDegree) {
        this.educationDegree = educationDegree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public int getSalary() {
        return salary;
    }

    public String getEducationDegree() {
        return educationDegree.toString();
    }

    @Override
    public String toString() {
        return String.format("\n name: %s  \n age: %d  \n country: %s  \n salary: %d \n Degree of Education : %s\n",name,age,country,salary,educationDegree);
    }

}
