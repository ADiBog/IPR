package com.example.ipr.tasks.Task529_SegmentLength;

import java.util.Scanner;

/**
 * Задача 529: Длина отрезка
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=529
 * 
 * Отрезок задан координатами своих концевых точек. Требуется вычислить длину этого отрезка.
 * 
 * Входные данные:
 * Первая строка входного файла INPUT.TXT содержит координаты концов отрезка в формате X1 Y1 X2 Y2.
 * Все координаты – целые числа, не превышающие 1000 по абсолютной величине.
 * 
 * Выходные данные:
 * В выходной файл OUTPUT.TXT выведите длину отрезка с точностью 10^-5.
 * 
 * Пример:
 * Вход: 1 3 4 8
 * Выход: 5.00000
 */
public class Task529_SegmentLength {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 529: Длина отрезка ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=529");
        System.out.println("Вычисление длины отрезка по координатам концевых точек");
        System.out.println();
        
        // Вводим координаты первой точки
        System.out.println("Введите координаты первой точки:");
        System.out.print("X1: ");
        int x1 = scanner.nextInt();
        
        System.out.print("Y1: ");
        int y1 = scanner.nextInt();
        
        // Вводим координаты второй точки
        System.out.println();
        System.out.println("Введите координаты второй точки:");
        System.out.print("X2: ");
        int x2 = scanner.nextInt();
        
        System.out.print("Y2: ");
        int y2 = scanner.nextInt();
        
        // Вычисляем длину отрезка
        double length = calculateSegmentLength(x1, y1, x2, y2);
        
        // Выводим результат
        System.out.println();
        System.out.println("=== Результат ===");
        System.out.printf("Длина отрезка: %.5f%n", length);
        
        scanner.close();
    }
    
    /**
     * Вычисляет длину отрезка по координатам концевых точек
     * 
     * @param x1 координата X первой точки
     * @param y1 координата Y первой точки
     * @param x2 координата X второй точки
     * @param y2 координата Y второй точки
     * @return длина отрезка
     */
    private static double calculateSegmentLength(int x1, int y1, int x2, int y2) {
        // Проверяем ограничения задачи
        if (Math.abs(x1) > 1000 || Math.abs(y1) > 1000 || 
            Math.abs(x2) > 1000 || Math.abs(y2) > 1000) {
            System.out.println("Ошибка: координаты не должны превышать 1000 по абсолютной величине");
            return -1;
        }

        return Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2));
    }
}
