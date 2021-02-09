package com.company;

public class Main {

    public static void main(String[] args) {
	// 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
        //2. Конструктор класса должен заполнять эти поля при создании объекта.
        //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
        //4. Создать массив из 5 сотрудников.
        //Пример:
        //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
        //persArray[1] = new Person(...);
        //...
        //persArray[4] = new Person(...);
        //
        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.

        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov", "Ivan", "Ivanovich",
                "Engineer", "ivivan@mailbox.com", 60000, 892312312, 30);

        employees[1] = new Employee("Petrov", "Petr", "Ivanovich",
                "Engineer", "ivivan@mailbox.com", 55000, 892312345, 35);

        employees[2] = new Employee("Sidorov", "Sidor", "Ivanovich", "Engineer",
                "ivivan@mailbox.com", 50000, 892312312, 41);

        employees[3] = new Employee("Pupkin", "Vasilii", "Ivanovich",
                "manager", "pupkinvi@mail.me",60000, 892312312, 43 );

        employees[4] = new Employee("Semenov", "Semen", "Semenovich",
                "manager", "semenovss@mail.me", 50000, 892312312, 55);


        for (Employee array :
                employees) {
            if (array.getAge() > 40) {
                array.getFullInfo();
            }
        }
    }
}



