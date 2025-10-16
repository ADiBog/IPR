package com.example.ipr.tasks.Task23_Divination;

import java.util.Scanner;

/**
 * Задача 23: Гадание
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=23
 * 
 * Как и многие другие девочки, Маша любит разные гадания. Некоторое время назад Маша узнала 
 * новый способ гадать на числах – для какого-нибудь интересующего ее натурального числа n 
 * надо посчитать сумму всех чисел, на которые n делится без остатка.
 * 
 * Маша не очень любит арифметику, и попросила вас написать программу, которая автоматизирует 
 * процесс гадания.
 * 
 * Входные данные:
 * В единственной строке входного файла INPUT.TXT записано натуральное число n (n ≤ 1000), 
 * которое Маша была вынуждена сообщить.
 * 
 * Выходные данные:
 * В выходной файл OUTPUT.TXT выведите сумму всех натуральных делителей числа n.
 * 
 * Примеры:
 * Вход: 6
 * Выход: 12
 * 
 * Вход: 2
 * Выход: 3
 */
public class Task23_Divination {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 23: Гадание ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=23");
        System.out.println("Сумма всех делителей числа");
        System.out.println();
        
        // Вводим число для гадания
        System.out.print("Введите число n для гадания: ");
        int n = scanner.nextInt();
        
        // Вычисляем сумму делителей
        int sumOfDivisors = calculateSumOfDivisors(n);
        
        // Выводим результат
        System.out.println();
        System.out.println("=== Результат гадания ===");
        System.out.println("Сумма всех делителей числа " + n + ": " + sumOfDivisors);
        
        scanner.close();
    }
    
    /**
     * Вычисляет сумму всех натуральных делителей числа
     * 
     * Делитель числа n - это такое число d, что n делится на d без остатка
     * 
     * @param n число, для которого ищем делители
     * @return сумма всех делителей числа n
     */
    private static int calculateSumOfDivisors(int number) {
        // Проверяем ограничения задачи
        if (number <= 0 || number > 1000) {
            System.out.println("Ошибка: число должно быть натуральным и не больше 1000");
            return -1;
        }
        
        // TODO: Реализовать поиск всех делителей и их суммирование
        // Нужно:
        // 1. Найти все числа от 1 до n, на которые n делится без остатка
        // 2. Сложить все найденные делители
        // 3. Вернуть сумму

		int result = 0;

		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {
				result += i;
			}

		}

		return result;

    }
}
