package com.company;

/**
 * В этом главном классе, примере создадим локальный класс и вызовем его
 */
public class Main {

    /**
     * Здесь создадим переменные, в том числе статические и приватные
     */
    static int a = 2;
    int b = 7;
    private static int c = 3;
    private int d = 1;

    /**
     * Но создать локальный класс, мы можем только внутри метода (︶︹︺)
     */
    void method(){
        int e = 4;

        class Local{
            void string(){
                System.out.println(a+b+c+d+e);
            }
        }
        Local local = new Local();
        local.string();
    }

    /**
     * Даже создать в другом методе класс с таким же методом, так как всё равно локальный
     * Но нельзя ему присвоить модификатор доступа, он по умолчанию default
     */
    void otherMethod(){
        class Local{
        }
    }

    /**
     * Создадим и вызовем метод с локальным Классом
     * @param args
     */
    public static void main(String[] args) {
        Main main = new Main();
        main.method();
    }
}
