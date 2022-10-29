package main.java.oopTraining;

public class Worker extends Emploee {

    int actualWorkingHoursThisMonth;
    int actualSalary;

    public Worker(String name) {
        super(name);
    }

    public int getActualSalary(int actualWorkingHoursThisMonth) {
        return BASE_SALARY_NIS * actualWorkingHoursThisMonth;
    }

    public int getActualSalary() {
        return BASE_SALARY_NIS * actualWorkingHoursThisMonth;
    }

    public int getActualWorkingHoursThisMonth() {
        return actualWorkingHoursThisMonth;
    }

    public void setActualWorkingHoursThisMonth(int actualWorkingHoursThisMonth) {
        this.actualWorkingHoursThisMonth = actualWorkingHoursThisMonth;
    }

    public final int getBaseSalary() {
        return BASE_SALARY_NIS;
    }


}
