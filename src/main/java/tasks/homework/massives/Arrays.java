package main.java.tasks.homework.massives;

public class Arrays {
    //написать метод, который подсчитает сумму каждого n-ого элемента в целочисленном массиве,
    //где n - целое число, передаваемое в сигнатуру этого метода

    public void sumNumber(int x) {
        int[] array = {1, 2, 4, 8, 16, 32, 64, 128, 356};
        int sum = 0;

        for (int i = x; i < array.length; i += x) // заявляю что i равен заданному (например 4); итый меньше длинны; присваиваю i-ый элемент т.е = заданому x (т.е например 4-ый элемнт = 8;
            sum += array[i]; //делаю прибавление с присвоением
        System.out.println(sum);
    }
//написать метод, который вернет целочисленный массив, состоящий только из тех элементов исходного целочисленного массива,
//которые больше, чем число n, где n - целое число,
//передаваемое в сигнатуру этого метода, элементы в результирующем массиве должны быть расположены в обратном порядке

    public void wholeMassive(int c) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = new int [array.length]; //массив2 = интовой длинне  первого массива
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > c){ //указываю что i-ый элемент должен быть больше чем переменка которую я ввожу
                array2[i] = array[i];
            }
        }
        for (int i = array2.length - 1; i >= 0; i--){ //length - 1 (длинна масива - 1 т.к начинает с 0)
            System.out.println(array2[i]);
        }

    }
//Ослик
    public void picture (){
        System.out.println("  ^__^");
        System.out.println("  (oo)\\\\_______");
        System.out.println(" (__)\\ ) \\/\\  \\");
        System.out.println("      ||----w |\\");
        System.out.println("      ||     ||");

    }
}
