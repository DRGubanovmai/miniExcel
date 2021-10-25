package main;

import project.MiniExcel;

import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        MiniExcel miniExcel = new MiniExcel();

        System.out.println("Введите один из запросов:\n" +
                "1.Установка формулы: A1=B2+C3 \n" +
                "2.Установка значения: D4=7.0\n" +
                "3.Вывод значения из ячейки: В5");

        while (true) {

            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            String UpperInput = input.toUpperCase().replace(" ", "");

            Pattern pattern = Pattern.compile("[+*-/]");
            Matcher matcher = pattern.matcher(UpperInput);

            if (matcher.find()) {
                int start=matcher.start();
                int end=matcher.end();
                String c = UpperInput.substring(start,end);

                switch (c) {
                    case "+":
                        try {
                            MiniExcel.sum(UpperInput);
                        } catch (NullPointerException e) {
                            System.out.println("Задайте значение для обоих операндов");
                        }
                        break;
                    case "-":
                        try {
                            MiniExcel.subtract(UpperInput);
                        } catch (NullPointerException e) {
                            System.out.println("Задайте значение для обоих операндов");
                        }
                        break;
                    case "*":
                        try {
                            MiniExcel.multiplic(UpperInput);
                        } catch (NullPointerException e) {
                            System.out.println("Задайте значение для обоих операндов");
                        }
                        break;
                    case "/":
                        try {
                            MiniExcel.divide(UpperInput);
                        } catch(ArithmeticException e) {
                            System.out.println("На ноль делить нельзя!");
                        } catch (NullPointerException e) {
                            System.out.println("Задайте значение для обоих операндов");
                        }
                        break;
                    default:
                        break;
                        }
                }

            if (UpperInput.contains("=") && !(UpperInput.contains("+") || UpperInput.contains("-") || UpperInput.contains("*") || UpperInput.contains("/"))) {
                int i = (int) UpperInput.charAt(0) - 65;
                int j = Integer.parseInt(UpperInput.substring(1, UpperInput.indexOf("=")));
                if (UpperInput.contains(".")) {
                    double value = Double.parseDouble(UpperInput.substring(UpperInput.indexOf("=") + 1, UpperInput.length()));
                    try {
                        MiniExcel.setDoubleValueToTable(i, j, value);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Адреса ячеек находятся в диапазоне от А1 до Z256");
                    } catch (Exception e) {
                        System.out.println("В ячайку можно присвоить число типа int или float");
                    }
                } else {
                    try {
                        int value = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("=") + 1, UpperInput.length()));
                        MiniExcel.setIntValueToTable(i, j, value);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Адреса ячеек находятся в диапазоне от А1 до Z256");
                    } catch (NumberFormatException e) {
                        System.out.println("В ячайку можно присвоить число типа int или float");
                    }
                }
            } else if (!(UpperInput.contains("=") ||
                    UpperInput.contains("+") ||
                    UpperInput.contains("-") ||
                    UpperInput.contains("*") ||
                    UpperInput.contains("/"))) {
                        int i = (int) UpperInput.charAt(0) - 65;
                        int j = Integer.parseInt(UpperInput.substring(1));
                        try {
                            System.out.println(MiniExcel.getValueFromTable(i, j));
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Адреса ячеек находятся в диапазоне от А1 до Z256");
                        }
            }
        }
    }
}

