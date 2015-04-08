package com.frolova;

/**
 * Created by иарвар on 02.04.2015.
 */
public class Main {
    public static void main(String[]args){

        MyOpFactory myOpFactory = new MyOpFactory();

        Calculator calc;
        calc = new Calculator(myOpFactory);

        //  ЗАПУСКАЕМ КАЛЬКУЛЯТОР
        calc.exec();
    }
}
