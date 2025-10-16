package com.example.ipr.tasks.Task331_TrainTime;

import java.util.Scanner;

/**
 * Задача 331: Время прибытия поезда
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=331
 * 
 * Задано время отправления поезда и время в пути до конечной станции. Требуется написать 
 * программу, которая найдет время прибытия этого поезда (возможно, в другие сутки).
 * 
 * Входные данные:
 * Входной файл INPUT.TXT содержит две строки. В первой строке задано время отправления, 
 * а во второй строке – время в пути. Время отправления задается в формате «HH:MM», где HH 
 * время в часах (00-23), ММ – время в минутах (00-59). Время в пути задается двумя 
 * неотрицательными целыми числами – количество часов и количество минут. Числа разделяются 
 * одним пробелом. Количество часов не превышает 120, минут – 59.
 * 
 * Выходные данные:
 * Выходной файл OUTPUT.TXT должен содержать одну строку – время прибытия поезда на 
 * конечную станцию в формате HH:MM.
 * 
 * Примеры:
 * Вход: 00:00
 *       10 10
 * Выход: 10:10
 * 
 * Вход: 10:10
 *       20 1
 * Выход: 06:11
 */
public class Task331_TrainTime {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 331: Время прибытия поезда ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=331");
        System.out.println("Вычисление времени прибытия поезда");
        System.out.println();
        
        // Вводим время отправления
        System.out.print("Введите время отправления (HH:MM): ");
        String departureTime = scanner.nextLine().trim();
        
        // Вводим время в пути
        System.out.print("Введите время в пути (часы минуты): ");
        String travelTime = scanner.nextLine().trim();
        
        // Вычисляем время прибытия
        String arrivalTime = calculateArrivalTime(departureTime, travelTime);
        
        // Выводим результат
        System.out.println();
        System.out.println("=== Результат ===");
        System.out.println("Время прибытия: " + arrivalTime);
        
        scanner.close();
    }
    
    /**
     * Вычисляет время прибытия поезда
     * 
     * @param departureTime время отправления в формате HH:MM
     * @param travelTime время в пути в формате "часы минуты"
     * @return время прибытия в формате HH:MM
     */
    private static String calculateArrivalTime(String departureTime, String travelTime) {
        // Проверяем корректность входных данных
        if (departureTime == null || !departureTime.matches("\\d{2}:\\d{2}")) {
            System.out.println("Ошибка: время отправления должно быть в формате HH:MM");
            return "ERROR";
        }
        
        if (travelTime == null || !travelTime.matches("\\d+\\s+\\d+")) {
            System.out.println("Ошибка: время в пути должно быть в формате 'часы минуты'");
            return "ERROR";
        }
        
        // TODO: Реализовать алгоритм вычисления времени прибытия
        // Нужно:
        // 1. Разобрать время отправления на часы и минуты
        // 2. Разобрать время в пути на часы и минуты
        // 3. Сложить время отправления и время в пути
        // 4. Учесть переход через полночь (24 часа = 0 часов)
        // 5. Вернуть результат в формате HH:MM
        
        return "00:00"; // Заглушка
    }
}
