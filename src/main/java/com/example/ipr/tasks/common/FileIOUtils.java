package com.example.ipr.tasks.common;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Утилиты для работы с файлами ввода-вывода для алгоритмических задач
 */
public class FileIOUtils {
    
    private static final String INPUT_DIR = "src/main/resources/tasks/input/";
    private static final String OUTPUT_DIR = "src/main/resources/tasks/output/";
    
    /**
     * Читает входной файл
     * 
     * @param fileName имя файла относительно папки input
     * @return содержимое файла
     * @throws IOException если файл не найден или не может быть прочитан
     */
    public static String readInput(String fileName) throws IOException {
        Path filePath = Paths.get(INPUT_DIR + fileName);
        return Files.readString(filePath);
    }
    
    /**
     * Записывает результат в выходной файл
     * 
     * @param fileName имя файла относительно папки output
     * @param content содержимое для записи
     * @throws IOException если файл не может быть создан или записан
     */
    public static void writeOutput(String fileName, String content) throws IOException {
        Path filePath = Paths.get(OUTPUT_DIR + fileName);
        
        // Создаем директорию если она не существует
        Files.createDirectories(filePath.getParent());
        
        Files.writeString(filePath, content);
    }
    
    /**
     * Проверяет существование входного файла
     * 
     * @param fileName имя файла относительно папки input
     * @return true если файл существует
     */
    public static boolean inputFileExists(String fileName) {
        Path filePath = Paths.get(INPUT_DIR + fileName);
        return Files.exists(filePath);
    }
}
