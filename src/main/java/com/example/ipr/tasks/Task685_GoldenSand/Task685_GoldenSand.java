package com.example.ipr.tasks.Task685_GoldenSand;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Задача 685: Золотой песок
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=685
 * 
 * Сотрудники завода по производству золотого песка из воздуха решили поправить свое финансовое положение. 
 * Они пробрались на склад завода, где хранился золотой песок трех видов. Один килограмм золотого песка 
 * первого вида они смогли бы продать за A1 рублей, второго вида – за A2 рублей, а третьего вида – за A3 рублей.
 * 
 * У сотрудников оказалось с собой только три емкости: первая была рассчитана на B1 килограмм груза, 
 * вторая на B2 килограмм, а третья на B3 килограмм. Им надо было заполнить полностью все емкости 
 * таким образом, чтобы получить как можно больше денег за весь песок.
 * 
 * Ограничения:
 * - В одну емкость помещать более одного вида песка нельзя
 * - Один вид песка не может находиться более чем в одной емкости
 * 
 * Входные данные:
 * 6 натуральных чисел A1, A2, A3, B1, B2, B3 (все числа не превосходят 100)
 * 
 * Выходные данные:
 * Максимальная сумма в рублях, которую смогут заработать сотрудники
 */
public class Task685_GoldenSand {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 685: Золотой песок ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=685");
        System.out.println();
        
        // Вводим цены за килограмм песка
        System.out.println("Введите цены за килограмм песка:");
        System.out.print("Цена песка 1-го вида (A1): ");
        int a1 = scanner.nextInt();
        
        System.out.print("Цена песка 2-го вида (A2): ");
        int a2 = scanner.nextInt();
        
        System.out.print("Цена песка 3-го вида (A3): ");
        int a3 = scanner.nextInt();
        
        // Вводим вместимость емкостей
        System.out.println();
        System.out.println("Введите вместимость емкостей:");
        System.out.print("Вместимость емкости 1 (B1): ");
        int b1 = scanner.nextInt();
        
        System.out.print("Вместимость емкости 2 (B2): ");
        int b2 = scanner.nextInt();
        
        System.out.print("Вместимость емкости 3 (B3): ");
        int b3 = scanner.nextInt();
        
        // Решаем задачу
        int maxProfit = calculateMaxProfit(a1, a2, a3, b1, b2, b3);
        
        // Выводим результат
        System.out.println();
        System.out.println("=== Результат ===");
        System.out.println("Максимальная прибыль: " + maxProfit + " рублей");
        
        scanner.close();
    }
    
    /**
     * Вычисляет максимальную прибыль от продажи золотого песка
     * 
     * @param a1 цена за кг песка 1-го вида
     * @param a2 цена за кг песка 2-го вида
     * @param a3 цена за кг песка 3-го вида
     * @param b1 вместимость емкости 1
     * @param b2 вместимость емкости 2
     * @param b3 вместимость емкости 3
     * @return максимальная прибыль
     */
    private static int calculateMaxProfit(int a1, int a2, int a3, int b1, int b2, int b3) {
        // Проверяем ограничения задачи
        if (a1 > 100 || a2 > 100 || a3 > 100 || b1 > 100 || b2 > 100 || b3 > 100) {
            System.out.println("Ошибка: все числа должны быть не больше 100");
            return -1;
        }

		List<Integer> prices = priceRange(List.of(a1, a2, a3));

		List<Integer> capacity = capacityRange(List.of(b1, b2, b3));

		return profits(prices, capacity);

	}

	private static Integer profits(List<Integer> prices, List<Integer> capacity) {
		return (prices.get(0) * capacity.get(0) + prices.get(1) * capacity.get(1) + prices.get(2) * capacity.get(2));
	}

	private static List<Integer> priceRange(List<Integer> prices) {
		return prices.stream()
			.sorted()
			.toList();
	}

	private static List<Integer> capacityRange(List<Integer> capacity) {
		return capacity.stream()
			.sorted()
			.toList();
	}

}
