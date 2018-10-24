package ru.osmanov.hw;
/*
Задание1. Создать пустой класс и прописать метод main.
*/
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    /*
    Задание2. Создать переменные всех пройденных типов данных, и инициализировать их значения.
    */
    final int x = 1;
    final double w = 2.34;
    final char e = 'F';
    final byte r = 22;
    final long t = 7384384L;
    final short u = 543;
    final float i = 43.55f;
    final boolean n = true;
    /*
    Задание3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    где a, b, c, d – входные параметры этого метода;
    */
    public static int calculate(int a, int b, int c, int d) {

        int x;
        return x = a * (b + (c / d));
    }
    /*
    Задание 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в
    пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
    */
    public static boolean range(int x1, int x2) {

        return (10 <= x1 + x2 && x1 + x2 <= 20);
    }
    /*
    Задание5. Написать метод, которому в качестве параметра передается целое число, метод должен
    напечатать в консоль положительное ли число передали, или отрицательное; Замечание:
    ноль считаем положительным числом.
    */
    public static void isPositiveOrNegative(int x) {

        if (x < 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    /*
    Задание6. Написать метод, которому в качестве параметра передается целое число, метод должен
    вернуть true, если число отрицательное;
    */
    public static boolean isNegative(int x) {

        return (x < 0);
    }
    /*
    Задание7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
       */
    public static void sayHello(String name) {
        System.out.println("Привет," + name);
    }
     /*
     Задание8. Написать метод, который определяет является ли год високосным, и выводит сообщение в
     консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
     високосный.
     */
    public static boolean leapYearCount(int year) {
        return year % 100 != 0 && year % 4 == 0 || year % 400 == 0;
    }
}
