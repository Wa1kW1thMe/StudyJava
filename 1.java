1. Java
//Создать переменные всех пройденных типов данных и инициализировать их значения.

public class VariableTypesExample {
    public static void main(String[] args) {
        // Переменные примитивных типов
        int integerVariable = 42;                  // Целое число
        double doubleVariable = 3.14;              // Число с плавающей точкой
        char charVariable = 'A';                    // Символ
        boolean booleanVariable = true;             // Логическая переменная

        // Переменные ссылочных типов
        String stringVariable = "Hello, World!";   // Строка
        int[] arrayVariable = {1, 2, 3, 4, 5};     // Массив целых чисел
        ExampleClass objectVariable = new ExampleClass("Пример объекта"); // Объект пользовательского класса

        // Вывод значений переменных на экран
        System.out.println("Целочисленная переменная: " + integerVariable);
        System.out.println("Переменная с плавающей точкой: " + doubleVariable);
        System.out.println("Символьная переменная: " + charVariable);
        System.out.println("Логическая переменная: " + booleanVariable);
        System.out.println("Строковая переменная: " + stringVariable);
        System.out.print("Массив целых чисел: ");
        for (int num : arrayVariable) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Объект класса: " + objectVariable);
    }
}

class ExampleClass {
    String name;

    ExampleClass(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ExampleClass{name='" + name + "'}";
    }
}

2. Java
 //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
 //Метод должен вывести в консоль сообщение «Привет, указанное_имя!»
 
 public class Main {
    public static void main(String[] args) {
        // Пример вызова метода с именем
        greet("Алексей");
    }

    // Метод, который принимает строку с именем и выводит приветственное сообщение
    public static void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }
}

3. Java
//Написать метод, которому в качестве параметра передается целое число.
//Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

public class Main {
    public static void main(String[] args) {
        // Примеры использования метода
        System.out.println(isNegative(-5)); // true
        System.out.println(isNegative(10));  // false
        System.out.println(isNegative(0));   // false
    }

    // Метод, проверяющий, является ли число отрицательным
    public static boolean isNegative(int number) {
        return number < 0; // Возвращает true, если число меньше нуля, иначе false
    }
}

//Метод isNegative принимает целое число number в качестве параметра.
//Он проверяет, меньше ли это число нуля (number < 0).
//Возвращает true, если число отрицательное, и false, если оно положительное или равно нулю.
//Вы можете протестировать метод, вызывая его с разными значениями в методе main.

4. Java
//Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
//положительное ли число передали или отрицательное.

public class Main {
    public static void main(String[] args) {
        // Пример вызова метода с разными числами
        checkNumber(5);
        checkNumber(-3);
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println(number + " - положительное число.");
        } else if (number < 0) {
            System.out.println(number + " - отрицательное число.");
        } else {
            System.out.println(number + " - ноль.");
        }
    }
}

5. Java
//Написать метод, который выводит последовательность чисел от 1000 до 0, кратных 3

public class Main {
    public static void main(String[] args) {
        printMultiplesOfThree();
    }

    public static void printMultiplesOfThree() {
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

//Основной класс: В коде определен основной класс Main, в котором содержится метод main, точка входа в программу.
//Метод printMultiplesOfThree: Этот метод выполняет цикл от 1000 до 0. Для каждого числа проверяется, делится ли оно на 3 без остатка. Если делится, число выводится на экран.
//Цикл for: Используется цикл for, начинающийся с 1000 и уменьшающийся до 0.