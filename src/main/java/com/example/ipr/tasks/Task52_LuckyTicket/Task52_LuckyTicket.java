package com.example.ipr.tasks.Task52_LuckyTicket;

import java.util.Scanner;

/**
 * Задача 52: Счастливый билет
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=52
 * 
 * Счастливым билетом называют такой билет с шестизначным номером, где сумма первых трех цифр 
 * равна сумме последних трех. Т.е. билет с номером 385916 – счастливый, т.к. 3+8+5=9+1+6.
 * 
 * Вам требуется написать программу, которая проверяет счастливость билета.
 * 
 * Входные данные:
 * В единственной строке входного файла INPUT.TXT записано одно целое число N (100000 ≤ N ≤ 999999).
 * 
 * Выходные данные:
 * В выходной файл OUTPUT.TXT выведите "YES", если билет с номером N счастливый и "NO" в противном случае.
 * 
 * Примеры:
 * Вход: 385916
 * Выход: YES
 * 
 * Вход: 123456
 * Выход: NO
 */
public class Task52_LuckyTicket {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 52: Счастливый билет ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=52");
        System.out.println("Проверка счастливости шестизначного билета");
        System.out.println();
        
        // Вводим номер билета
        System.out.print("Введите номер билета (6 цифр): ");
        int ticketNumber = scanner.nextInt();
        
        // Проверяем счастливость билета
        boolean isLucky = checkLuckyTicket(ticketNumber);
        
        // Выводим результат
        System.out.println();
        System.out.println("=== Результат ===");
        if (isLucky) {
            System.out.println("YES - Билет счастливый!");
        } else {
            System.out.println("NO - Билет не счастливый");
        }
        
        scanner.close();
    }
    
    /**
     * Проверяет, является ли билет счастливым
     * 
     * Счастливый билет - это билет, где сумма первых трех цифр равна сумме последних трех цифр
     * 
     * @param ticketNumber номер билета (6-значное число)
     * @return true если билет счастливый, false в противном случае
     */
    private static boolean checkLuckyTicket(int ticketNumber) {
        // Проверяем ограничения задачи
        if (ticketNumber < 100000 || ticketNumber > 999999) {
            System.out.println("Ошибка: номер билета должен быть шестизначным (100000-999999)");
            return false;
        }
        
        // TODO: Реализовать проверку счастливости билета
        // Нужно:
        // 1. Разделить номер на первые 3 цифры и последние 3 цифры
        // 2. Вычислить сумму первых трех цифр
        // 3. Вычислить сумму последних трех цифр
        // 4. Сравнить суммы
        
        return false; // Заглушка
    }
}
