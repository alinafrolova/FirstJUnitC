package com.frolova;

import java.util.Scanner;

/**
 * Created by иарвар on 02.04.2015.
 */
public class Calculator {
    private static double Resault;
    public Divis divis;

    MyOpFactory myOpFactory;
    public Calculator(MyOpFactory myOpFactory) {
    }


    public void exec() {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Выберите операцию:");
            System.out.print("0 - сумма\t");
            System.out.print("1 - разность\t");
            System.out.print("2 - уменожение\t");
            System.out.print("3 - деление\t");
            int operation = in.nextInt();

            // Ввод превого аргумента
            System.out.println("Введите первый аргумент");
            double MyValueOne = in.nextDouble(); // Ввод числа с
            // клавиатуры
            // Ввод второго агрумента
            System.out.println("Введите второй аргумент");
            double myValueTwo = in.nextDouble();

            // Обработка операций над аргемунтами
            System.out.print("Результат равен:\t");
            Operation op = new MyOpFactory().getOpInstance(operation);
            Resault = op.exec(MyValueOne, myValueTwo);
            System.out.println(Resault);
        }
        catch (ArithmeticException exception){
            System.out.println("Делить на ноль нельзя");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
