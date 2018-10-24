package ru.osmanov.hw;

public class App {

    public static void main(String[] args) {
    }

    /*
    Задание1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
    0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    */
    public void invertArray() {

        int[] arr = new int[]{1, 0, 1, 0, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;
            else arr[i] = 0;
        }
    }

    /*
    Задание2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его
    значениями 0 3 6 9 12 15 18 21;
    */
    public static void fillArray() {

        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
    }

    /*
    Задание3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
    умножить на 2;
    */
    public static void changeArray() {

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
     
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 2;
        }
    }

    /*
    Задание4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов
    одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    */
    public static void fillDiagonal() {

        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
    }


}
