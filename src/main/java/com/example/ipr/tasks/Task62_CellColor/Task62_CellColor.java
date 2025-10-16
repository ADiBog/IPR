package com.example.ipr.tasks.Task62_CellColor;

import java.util.Scanner;

/**
 * Задача 62: Цвет клетки
 * 
 * Источник: https://acmp.ru/index.asp?main=task&id_task=62
 * 
 * Известно, что шахматная доска имеет размерность 8х8 и состоит из клеток двух цветов, 
 * например, черного и белого. Каждая клетка имеет координату, состоящую из буквы и цифры. 
 * Горизонтальное расположение клетки определяется буквой от A до H, а вертикальное – 
 * цифрой от 1 до 8. Заметим, что клетка с координатой А1 имеет черный цвет. 
 * Требуется по заданной координате определить цвет клетки.
 * 
 * Входные данные:
 * В единственной строке входного файла INPUT.TXT записана координата клетки на 
 * шахматной доске: всего два символа – буква и цифра (без пробелов).
 * 
 * Выходные данные:
 * В выходной файл OUTPUT.TXT нужно вывести «WHITE», если указанная клетка имеет 
 * белый цвет и «BLACK», если она черная.
 * 
 * Примеры:
 * Вход: C3
 * Выход: BLACK
 * 
 * Вход: G8
 * Выход: WHITE
 */
public class Task62_CellColor {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Задача 62: Цвет клетки ===");
        System.out.println("Источник: https://acmp.ru/index.asp?main=task&id_task=62");
        System.out.println("Определение цвета клетки на шахматной доске");
        System.out.println();
        
        // Вводим координату клетки
        System.out.print("Введите координату клетки (например, A1, C3, G8): ");
        String coordinate = scanner.nextLine().trim().toUpperCase();
        
        // Определяем цвет клетки
        String cellColor = determineCellColor(coordinate);
        
        // Выводим результат
        System.out.println();
        System.out.println("=== Результат ===");
        System.out.println("Цвет клетки " + coordinate + ": " + cellColor);
        
        scanner.close();
    }
    
    /**
     * Определяет цвет клетки на шахматной доске
     * 
     * Шахматная доска 8x8 имеет шахматный порядок цветов:
     * - A1 (левый нижний угол) - черная
     * - Цвет чередуется по горизонтали и вертикали
     * 
     * @param coordinate координата клетки (например, "A1", "C3", "G8")
     * @return "BLACK" или "WHITE"
     */
    private static String determineCellColor(String coordinate) {
        // Проверяем корректность входных данных
        if (coordinate == null || coordinate.length() != 2) {
            System.out.println("Ошибка: координата должна состоять из буквы и цифры (например, A1)");
            return "ERROR";
        }
        
        char letter = coordinate.charAt(0);
        char digit = coordinate.charAt(1);
        
        // Проверяем диапазон букв (A-H)
        if (letter < 'A' || letter > 'H') {
            System.out.println("Ошибка: буква должна быть от A до H");
            return "ERROR";
        }
        
        // Проверяем диапазон цифр (1-8)
        if (digit < '1' || digit > '8') {
            System.out.println("Ошибка: цифра должна быть от 1 до 8");
            return "ERROR";
        }

        // TODO: Реализовать алгоритм определения цвета
        // Нужно:
        // 1. Преобразовать букву в число (A=1, B=2, ..., H=8)
        // 2. Преобразовать цифру в число (1=1, 2=2, ..., 8=8)
        // 3. Найти закономерность: когда сумма координат четная/нечетная
        // 4. Вернуть соответствующий цвет

		int letterNumber;
		int digitNumber = digit - '0';

		switch (letter) {
			case 'A': letterNumber = 1; break;
			case 'B': letterNumber = 2; break;
			case 'C': letterNumber = 3; break;
			case 'D': letterNumber = 4; break;
			case 'E': letterNumber = 5; break;
			case 'F': letterNumber = 6; break;
			case 'G': letterNumber = 7; break;
			case 'H': letterNumber = 8; break;
			default: return "ERROR";
		}

		return (letterNumber + digitNumber) % 2 == 0 ? "BLACK" : "WHITE";
    }

}
