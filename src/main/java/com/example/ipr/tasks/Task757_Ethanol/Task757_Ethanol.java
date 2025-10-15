package com.example.ipr.tasks.Task757_Ethanol;

import java.util.Scanner;

/**
 * Задача 757: Этиловый спирт
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=757
 * 
 * Каждому школьнику из курса органической химии известна формула молекулы этилового спирта – C2H5(OH).
 * Откуда видно, что молекула спирта состоит из двух атомов углерода (C), шести атомов водорода (H) и одного атома кислорода (O).
 * 
 * По заданному количеству атомов каждого из описанных выше элементов требуется определить максимально 
 * возможное количество молекул спирта, которые могут образоваться в процессе их соединения.
 * 
 * Входные данные:
 * Первая строка входного файла INPUT.TXT содержит 3 натуральных числа: C, Н и O – количество атомов 
 * углерода, водорода и кислорода соответственно. Все числа разделены пробелом и не превосходят 10^18.
 * 
 * Выходные данные:
 * В выходной файл OUTPUT.TXT выведите максимально возможное число молекул спирта, которые могут 
 * получиться из атомов, представленных во входных данных.
 */
public class Task757_Ethanol {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 757: Максимальное количество молекул этилового спирта ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=757");
        System.out.println("Формула этилового спирта: C2H6O");
        System.out.println();
        
        // Вводим количество атомов
        System.out.print("Введите количество атомов углерода (C): ");
        long carbon = scanner.nextLong();
        
        System.out.print("Введите количество атомов водорода (H): ");
        long hydrogen = scanner.nextLong();
        
        System.out.print("Введите количество атомов кислорода (O): ");
        long oxygen = scanner.nextLong();
        
        // Решаем задачу
        long result = solve(carbon, hydrogen, oxygen);
        
        // Выводим результат
        System.out.println();
        System.out.println("=== Результат ===");
        System.out.println("Максимальное количество молекул этилового спирта: " + result);
        
        scanner.close();
    }
    
    /**
     * Решает задачу о максимальном количестве молекул этилового спирта
     * 
     * Формула этилового спирта: C2H6O
     * Для одной молекулы нужно: 2 атома C, 6 атомов H, 1 атом O
     * 
     * @param carbon количество атомов углерода
     * @param hydrogen количество атомов водорода  
     * @param oxygen количество атомов кислорода
     * @return максимальное количество молекул спирта
     */
    private static long solve(long carbon, long hydrogen, long oxygen) {
        // Проверяем ограничения задачи (числа не превосходят 10^18)
        if (carbon < 0 || hydrogen < 0 || oxygen < 0) {
            System.out.println("Ошибка: количество атомов не может быть отрицательным");
            return -1;
        }

        return Math.min(carbon/2, Math.min(hydrogen/6, oxygen));
    
    }
}
