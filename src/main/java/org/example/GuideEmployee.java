package org.example;

import java.util.ArrayList;
import java.util.List;

public class GuideEmployee {
    List<Employee> list = new ArrayList<>();

    public GuideEmployee() {
    }

    //добавление нового сотрудника в справочник сотрудников
    public void addEmployee(int id, String name, String phoneNum, int experience) {
        list.add(new Employee(id,name,phoneNum,experience));
    }

    @Override
    public String toString() {
        return list + "";
    }

    //метод, который ищет сотрудника по стажу (может быть список)
    public List<Employee> findEmployeeByExperience(int num) {
        return list.stream()
                .filter(employee -> employee.getExperience() == num)
                .toList();
    }

    //метод, который выводит номер телефона сотрудника по имени (может быть список)
    public List<String> findPhoneNumberByName(String name) {
        return list.stream()
                .filter(employee -> employee.getName().equals(name))
                .map(Employee::getPhoneNum)
                .toList();
    }

    //метод, который ищет сотрудника по табельному номеру
    public Employee findEmployeeById(int num) {
        for(Employee employee:list) {
            if(employee.getId() == num) return employee;
        }
        return null;
    }
}
