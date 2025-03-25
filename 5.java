//1. Написать метод, который меняет 2 элемента...

public class ArrayUtils {
    
    public static <T> void swapElements(T[] array, int index1, int index2) {
        // Проверяем, чтобы индексы были в пределах массива
        if (array == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        
        // Производим обмен элементов
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Пример использования
        String[] array = {"apple", "banana", "cherry", "date"};
        
        System.out.println("Before swap: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
        
        // Меняем местами элементы с индексами 1 и 2 (banana и cherry)
        swapElements(array, 1, 2);
        
        System.out.println("\nAfter swap: ");
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}

//описание:
//Метод swapElements использует дженерики <T>, чтобы поддерживать массивы любого ссылочного типа.
//Принимает массив и два индекса для обмена.
//Проверяет, что массив не равен null, а также чтобы индексы были в пределах допустимого диапазона.
//Меняет местами элементы массива.
//Метод main:

//Создаёт пример массива строк.
//Выводит массив до и после обмена элементов.

//2. Создать класс Box с тремя....

import java.util.ArrayList;
import java.util.List;

class Box<T> {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем коробки
        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        Box<Float> floatBox = new Box<>();

        // Добавляем элементы в коробки
        stringBox.addItem("Hello");
        stringBox.addItem("World");
        
        integerBox.addItem(10);
        integerBox.addItem(20);
        
        floatBox.addItem(5.5f);
        floatBox.addItem(4.5f);

        // Считаем сумму чисел
        int sum = 0;

        for (Integer number : integerBox.getItems()) {
            sum += number;
        }

        float floatSum = 0.0f;
        for (Float number : floatBox.getItems()) {
            floatSum += number;
        }

        // Выводим результат
        System.out.println("Сумма чисел в коробках: " + (sum + floatSum));
    }
}


//Описание:
//Класс Box<T>: Этот класс содержит список элементов типа T и методы для добавления элементов и получения списка элементов.
//Создание коробок: Мы создаем три коробки с различными типами.
//Добавление элементов: В каждую коробку добавляем соответствующие типы данных.
//Суммирование: Мы суммируем все числовые значения из коробок типа Integer и Float, игнорируя значения из коробки типа String.
//Вывод результата: Выводим общую сумму в консоль.


//3. Написать метод, который принимает строку...

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        
        try {
            checkString(input);
            System.out.println("Строка корректная: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkString(String input) throws Exception {
        // Проверяем, содержит ли строка цифры
        if (input.matches(".*\\d.*")) {
            throw new Exception("Строка не должна содержать число!");
        }
    }
}
