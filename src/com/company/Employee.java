package com.company;

public class Employee {
    String surname, name, patronymic, position, email;
    int salary, telephone, age;

    Employee(String surname,
             String name,
             String patronymic,
             String position,
             String email,
             int salary,
             int telephone,
             int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.telephone = telephone;
        this.age = age;

    }

    void getFullInfo() {
        System.out.println("Фамилия: " + surname + " | Имя: " + name
                + " | Отчество: " + patronymic + " | Должность: " + position
                + " | email: " + email + " | телефон: " + telephone + " | Зарплата: " + salary + " | Возраст: "
                + age);
    }

    int getAge() {

        return age;
    }
}
