package main.java.oopTraining;


public class Manager extends Emploee {
    int numberOfSubordinates;


    public Manager(String name) {
        super(name);
        EmploeeUtils.managerArrayList.add(this);
    }

    public Manager(String name, int numberOfSubordinates) {
        super(name);
        this.numberOfSubordinates = numberOfSubordinates;
        EmploeeUtils.managerArrayList.add(this);
    }

    public int getSalary() {
        if (numberOfSubordinates < 34) return BASE_SALARY_NIS;
        else {
            return (BASE_SALARY_NIS * numberOfSubordinates * 3) / 100;
        }
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
}
