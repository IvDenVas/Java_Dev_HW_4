package org.example;

public class Main {
    public static void main(String[] args) {
        GuideEmployee guideEmployee = new GuideEmployee();

        guideEmployee.addEmployee(123, "Denis", "89837309627", 56);
        guideEmployee.addEmployee(523, "Denis", "89034561232", 48);
        guideEmployee.addEmployee(100, "Mike", "89037456789", 56);
        guideEmployee.addEmployee(12, "Olga", "89096993625", 13);
        guideEmployee.addEmployee(53, "Irina", "89271616161", 15);
        guideEmployee.addEmployee(203, "Dmitriy", "89999999999", 56);
        guideEmployee.addEmployee(302, "Alex", "89697894512", 32);
        guideEmployee.addEmployee(300, "Petr", "89024568956", 40);

        System.out.println(guideEmployee.findEmployeeByExperience(56));
        System.out.println(guideEmployee.findPhoneNumberByName("Denis"));
        System.out.println(guideEmployee.findEmployeeById(53));
    }
}
