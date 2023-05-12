package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1(){
        // Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        // и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
        // Если длины массивов не равны, необходимо как-то оповестить пользователя.

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 1, 5, 3};
        int[] result;
        try{
            result = arrayDifference(array1, array2);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(Arrays.toString(result));
    }

    public static void ex2(){
        //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
        // каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
        // Если длины массивов не равны, необходимо как-то оповестить пользователя.
        // Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 1, 5, 1};
        double[] result;
        try{
            result = arrayDivision(array1, array2);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(Arrays.toString(result));

    }

    public static void ex3(){
        //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
        // и возвращающий новый массив, каждый элемент которого равен сумме элементов двух входящих массивов в той же ячейке.
        // Если длины массивов не равны, необходимо как-то оповестить пользователя.

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {2, 1, 5, 1};
        int[] result;
        try{
            result = arraySum(array1, array2);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(Arrays.toString(result));

    }

    public static void ex4(){
        // Реализуйте метод, принимающий в качестве аргументов двумерный массив.
        // Метод должен проверить что длина строк и столбцов с одинаковым индексом одинакова,
        // детализировать какие строки со столбцами не требуется. Как бы вы реализовали подобный метод?
        int[][] array ={{1, 2, 3}, {1, 1, 1}, {1, 1}};
        try {
            checkSize2DArray(array);
        }catch (Exception e){
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("Массив корректный");
    }

    public static void checkSize2DArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            int line = array[i].length;
            int column = 0;
            for (int j = 0; j < array.length; j++){
                if (index2ArrayExists(array, j, i)){
                    column++;
                }
            }

            if (line != column){
                throw new RuntimeException("Есть ошибки в заполнении массива");
            }
        }
    }

    public static boolean index2ArrayExists(int[][] array, int i, int j){
        if (i > array.length - 1){
            return false;
        }
        if (j > array[i].length - 1){
            return false;
        }
        return true;
    }

    public static int[] arraySum(int[] array1, int[] array2) throws RuntimeException{
        checkArrays(array1, array2);

        int[] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++){
            result[i] = array1[i] + array2[i];
        }

        return result;
    }

    public static double[] arrayDivision(int[] array1, int[] array2) throws RuntimeException{
        checkArrayDivision(array1, array2);

        double[] result = new double[array1.length];

        for (int i = 0; i < array1.length; i++){
            result[i] = array1[i] / array2[i];

        }
        return result;
    }

    public static void checkArrayDivision(int[] array1, int[] array2) throws RuntimeException{
        checkArrays(array1, array2);

        for (int value : array2){
            if (value == 0){
                throw new RuntimeException("В массиве 2 встрачаются значения 0");
            }
        }

    }

    public static int[] arrayDifference(int[] array1, int[] array2) throws RuntimeException{
        checkArrays(array1, array2);

        int [] result = new int[array1.length];

        for (int i = 0; i < array1.length; i++){
            result[i] = array1[i] - array2[i];
        }

        return result;
    }

    public static void checkArrays(int[] array1, int[] array2) throws RuntimeException{
        if (array2.length != array1.length){
            throw new RuntimeException("Длины массивов различны");
        }

        if (array1 == null){
            throw new RuntimeException("Параметр 1 должен быть массивом и не можеть быть null");
        }

        if (array2 == null){
            throw new RuntimeException("Параметр 2 должен быть массивом и не можеть быть null");
        }
    }


}