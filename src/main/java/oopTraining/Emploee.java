package main.java.oopTraining;

public class Emploee extends BaseEmploee {
    int baseSalary;
    public final static int BASE_SALARY_NIS = 5300;

    public Emploee(String name) {
        super(name);
    }


    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }


    public int getSalary() {
        return salary;
    }

    @Override
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
