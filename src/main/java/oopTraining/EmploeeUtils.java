package main.java.oopTraining;

import java.util.ArrayList;
import java.util.Collections;

public class EmploeeUtils {
    ArrayList<Integer> numbersOfWorkersEachManagerArrayList;
    ArrayList<Integer> salaryOfManagersArrayList;
    static ArrayList<Manager> managerArrayList;


    public int minNumberOfWorkers() {
        managerArrayList.forEach(i -> numbersOfWorkersEachManagerArrayList.add(i.getNumberOfSubordinates()));
        return Collections.min(numbersOfWorkersEachManagerArrayList);
    }

    public int maxNumberOfWorkers() {
        managerArrayList.forEach(i -> numbersOfWorkersEachManagerArrayList.add(i.getNumberOfSubordinates()));
        return Collections.max(numbersOfWorkersEachManagerArrayList);
    }

    public int minSalaryOfManagers() {
        managerArrayList.forEach(i -> salaryOfManagersArrayList.add(i.getSalary()));
        return Collections.min(salaryOfManagersArrayList);
    }

    public int maxSalaryOfManagers() {
        managerArrayList.forEach(i -> salaryOfManagersArrayList.add(i.getSalary()));
        return Collections.max(salaryOfManagersArrayList);
    }
}
