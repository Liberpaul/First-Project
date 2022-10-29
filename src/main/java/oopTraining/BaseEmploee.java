package main.java.oopTraining;

public abstract class BaseEmploee {
    public int salary;
    public String name;

    public BaseEmploee(String name) {
        this.name = name;
    }

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getSalary();

    public abstract void setSalary(int salary);
}
