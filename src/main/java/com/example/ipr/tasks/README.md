# Алгоритмические задачи IPR

Этот проект содержит структуру для решения алгоритмических задач.

## Структура проекта

```
src/main/java/com/example/ipr/tasks/
├── common/                          # Общие утилиты
│   └── FileIOUtils.java            # Утилиты для работы с файлами
├── Task01_Ethanol/                 # Задача 1: Этиловый спирт
│   └── Task01_Ethanol.java
├── Task02_*/                       # Задача 2 (будущая)
├── Task03_*/                       # Задача 3 (будущая)
└── ...                            # Остальные задачи

src/main/resources/tasks/
├── input/                          # Входные файлы
│   ├── Task01_Ethanol/
│   │   └── INPUT.TXT
│   └── Task02_*/
└── output/                         # Выходные файлы
    ├── Task01_Ethanol/
    │   └── OUTPUT.TXT
    └── Task02_*/
```

## Как использовать

1. **Создание новой задачи:**
   - Создайте папку `TaskXX_Name` в `src/main/java/com/example/ipr/tasks/`
   - Создайте класс `TaskXX_Name.java` с методом `main`
   - Создайте соответствующие папки в `src/main/resources/tasks/input/` и `output/`

2. **Шаблон задачи:**
   ```java
   public class TaskXX_Name {
       public static void main(String[] args) {
           try {
               // Читаем входные данные
               String input = FileIOUtils.readInput("TaskXX_Name/INPUT.TXT");
               
               // Парсим и решаем
               long result = solve(input);
               
               // Записываем результат
               FileIOUtils.writeOutput("TaskXX_Name/OUTPUT.TXT", String.valueOf(result));
               
           } catch (IOException e) {
               System.err.println("Ошибка: " + e.getMessage());
           }
       }
       
       private static long solve(String input) {
           // Ваш алгоритм здесь
           return 0;
       }
   }
   ```

3. **Запуск задачи:**
   - Запустите метод `main` соответствующего класса
   - Или используйте IDE для запуска конкретной задачи

## Задача 1: Этиловый спирт

**Описание:** Определить максимальное количество молекул этилового спирта C2H6O из заданного количества атомов.

**Формула:** C2H6O (2 атома C, 6 атомов H, 1 атом O)

**Алгоритм:** Найти минимум из `carbon/2`, `hydrogen/6`, `oxygen/1`

**Файлы:**
- Входной: `src/main/resources/tasks/input/Task01_Ethanol/INPUT.TXT`
- Выходной: `src/main/resources/tasks/output/Task01_Ethanol/OUTPUT.TXT`
