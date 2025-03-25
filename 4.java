//1. Создать массив с набором слов...

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsCounter {
    public static void main(String[] args) {
        // Создаем массив с набором слов
        String[] words = {
            "яблоко", "банан", "апельсин", "груша",
            "яблоко", "апельсин", "груша", "яблоко",
            "банан", "персик", "вишня", "груша",
            "персик", "апельсин", "вишня", "вишня"
        };

        // Используем HashMap для хранения уникальных слов и их количества
        Map<String, Integer> wordCount = new HashMap<>();

        // Проходим по массиву слов
        for (String word : words) {
            // Если слово уже есть в мапе, увеличиваем счетчик
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // Если слово новое, добавляем его в мапу с счетчиком 1
                wordCount.put(word, 1);
            }
        }

        // Выводим уникальные слова и количество их вхождений
        System.out.println("Уникальные слова и их количества:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

//Пояснение:
//Создание массива слов:
//В массив words добавлено несколько слов, среди которых есть повторы.

//Использование HashMap:
//Мы создаем экземпляр HashMap, где ключ — это слово, а значение — количество его вхождений.

//Перебор элементов массива:
//Мы проходим по каждому слову в массиве. Если слово уже есть в HashMap, увеличиваем его счетчик. Если нет — добавляем слово с начальным значением счетчика 1.

//Вывод результатов:
//В конце мы выводим уникальные слова и количество их повторений.

//2. Написать простой класс Телефонный Справочник...

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Интерфейс телефонного справочника
interface Phonebook {
    void add(String lastName, String phoneNumber);
    List<String> get(String lastName);
}

// Реализация телефонного справочника
class SimplePhonebook implements Phonebook {
    private Map<String, List<String>> contacts;

    // Конструктор, инициализирующий внутреннюю структуру данных
    public SimplePhonebook() {
        contacts = new HashMap<>();
    }

    // Метод для добавления фамилии и телефонного номера
    @Override
    public void add(String lastName, String phoneNumber) {
        contacts.putIfAbsent(lastName, new ArrayList<>());
        contacts.get(lastName).add(phoneNumber);
    }

    // Метод для получения списков телефонов по фамилии
    @Override
    public List<String> get(String lastName) {
        return contacts.getOrDefault(lastName, new ArrayList<>());
    }
}

// Главный класс для тестирования телефонного справочника
public class Main {
    public static void main(String[] args) {
        SimplePhonebook phonebook = new SimplePhonebook();
        
        // Добавляем записи
        phonebook.add("Жирафов", "123-456");
        phonebook.add("Трамп", "789-012");
        phonebook.add("Дед", "345-678");
        
        // Получаем номера телефонов по фамилии
        System.out.println("Телефоны Иванова: " + phonebook.get("Жирафов"));
        System.out.println("Телефоны Петрова: " + phonebook.get("Трамп"));
        System.out.println("Телефоны Сидорова: " + phonebook.get("Дед"));
    }
}

//Описание:
//Интерфейс Phonebook: Содержит два метода: add для добавления фамилий
//и номеров телефонов и get для получения списка телефонов по фамилии.

//Класс SimplePhonebook:

//Хранит контакты в виде Map, где ключ — это фамилия, а значение — список телефонов.
//Метод add добавляет новый телефон к фамилии, создавая новый список, если такой фамилии еще нет.
//Метод get возвращает список телефонов по фамилии или пустой список, если такая фамилия не найдена.
//Класс Main: Служит для тестирования функциональности справочника,
//где мы добавляем записи и затем запрашиваем номера телефонов по фамилиям.
