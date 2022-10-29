package main.java.oopTraining;


public final class Director extends Manager {
    public Director(String name) {
        super(name);
    }

    @Override
    public int getSalary() {
        if (numberOfSubordinates < 12) return BASE_SALARY_NIS;
        else {
            return (BASE_SALARY_NIS * numberOfSubordinates * 9) / 100;
        }
    }
}
