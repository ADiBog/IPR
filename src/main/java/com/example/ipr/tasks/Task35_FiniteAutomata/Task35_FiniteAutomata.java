package com.example.ipr.tasks.Task35_FiniteAutomata;

import java.util.Scanner;

/**
 * Задача 35: Нетривиальность конечных автоматов
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=35
 * 
 * Однажды известный профессор обнаружил описания k конечных автоматов. По его мнению, нетривиальность 
 * конечного автомата, имеющего n состояний и m переходов, можно описать целым числом 
 * d = 19m + (n + 239)*(n + 366) / 2
 * 
 * Чем больше d, тем больший интерес для науки представляет изучение его свойств.
 * 
 * Входные данные:
 * Первая строка содержит целое число k (1 ≤ k ≤ 10000) – количество конечных автоматов.
 * Следующие k строк содержат по два целых числа ni (0 ≤ ni ≤ 1000) и mi (0 ≤ mi ≤ 26ni²) – 
 * число состояний и переходов i-го автомата.
 * 
 * Выходные данные:
 * Выведите k строк. На i-й строке выведите одно число – нетривиальность i-го автомата.
 */
public class Task35_FiniteAutomata {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 35: Нетривиальность конечных автоматов ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=35");
        System.out.println("Формула нетривиальности: d = 19m + (n + 239)*(n + 366) / 2");
        System.out.println();
        
        // Вводим количество автоматов
        System.out.print("Введите количество конечных автоматов (k): ");
        int k = scanner.nextInt();
        
        // Массивы для хранения данных об автоматах
        int[] states = new int[k];      // количество состояний
        int[] transitions = new int[k];  // количество переходов
        
        // Вводим данные о каждом автомате
        System.out.println();
        System.out.println("Введите данные о каждом автомате:");
        for (int i = 0; i < k; i++) {
            System.out.print("Автомат " + (i + 1) + " - количество состояний (n): ");
            states[i] = scanner.nextInt();
            
            System.out.print("Автомат " + (i + 1) + " - количество переходов (m): ");
            transitions[i] = scanner.nextInt();
        }
        
        // Вычисляем нетривиальность для каждого автомата
        System.out.println();
        System.out.println("=== Результаты ===");
        System.out.println("Нетривиальность каждого автомата:");
        
        for (int i = 0; i < k; i++) {
            long triviality = calculateTriviality(states[i], transitions[i]);
            System.out.println("Автомат " + (i + 1) + ": " + triviality);
        }
        
        scanner.close();
    }
    
    /**
     * Вычисляет нетривиальность конечного автомата
     * 
     * Формула: d = 19m + (n + 239)*(n + 366) / 2
     * 
     * @param n количество состояний
     * @param m количество переходов
     * @return нетривиальность автомата
     */
    private static long calculateTriviality(int n, int m) {
        // Проверяем ограничения задачи
        if (n < 0 || n > 1000) {
            System.out.println("Ошибка: количество состояний должно быть от 0 до 1000");
            return -1;
        }
        if (m < 0 || m > 26 * n * n) {
            System.out.println("Ошибка: количество переходов должно быть от 0 до 26*n²");
            return -1;
        }
        
        return 19L * m + (long)(n + 239) * (long)(n + 366) / 2L;
    
    }
}
