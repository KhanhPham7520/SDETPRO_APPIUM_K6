package main.lesson_07.exercise;

import main.lesson_07.exercise.model.ContractEmployee;
import main.lesson_07.exercise.model.FullTimeEmployee;

public class Lab_07_01_Salary_Calculator {
    public static void main(String[] args) {
        int numberOfFTE = 3;
        int numberOfContractors = 2;
        int total ;

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(numberOfFTE);
        int fullTimeEmployeeSalary = fullTimeEmployee.getSalary();

        ContractEmployee contractEmployee = new ContractEmployee(numberOfContractors);
        int contractorSalary = contractEmployee.getSalary();

        total = fullTimeEmployeeSalary * numberOfFTE + contractorSalary * numberOfContractors;

        System.out.println("Total salary is " + total);

    }
}
