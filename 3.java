//1 Создать классы Кот и Собака...

class Animal {
    protected String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }
    
    public void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}

class Cat extends Animal {
    private static int count = 0; // Счетчик котов
    private static int animalCount = 0; // Счетчик всех животных

    public Cat(String name) {
        super(name);
        count++;
        animalCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(name + " не может пробежать более 200 м.");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public static int getCount() {
        return count;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int count = 0; // Счетчик собак
    private static int animalCount = 0; // Счетчик всех животных

    public Dog(String name) {
        super(name);
        count++;
        animalCount++;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + " не может пробежать более 500 м.");
        } else {
            super.run(distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + " не может проплыть более 10 м.");
        } else {
            super.swim(distance);
        }
    }

    public static int getCount() {
        return count;
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Dog dog1 = new Dog("Бобик");

        cat1.run(150); // Мурзик пробежал 150 м.
        cat1.run(250); // Мурзик не может пробежать более 200 м.
        cat1.swim(5);  // Мурзик не умеет плавать.

        dog1.run(400); // Бобик пробежал 400 м.
        dog1.run(600); // Бобик не может пробежать более 500 м.
        dog1.swim(8);  // Бобик проплыл 8 м.
        dog1.swim(15); // Бобик не может проплыть более 10 м.

        System.out.println("Создано котов: " + Cat.getCount());
        System.out.println("Создано собак: " + Dog.getCount());
        System.out.println("Создано всех животных: " + Cat.getAnimalCount());
    }
}


//Описание:
//Animal — базовый класс для всех животных с методами run и swim.
//Cat и Dog — производные классы с ограничениями на бег и плавание,
//а также методы для учета созданных объектов.
//В main методе создаются экземпляры Cat и Dog, и вызываются их методы run и swim,
//в результате чего выводится соответствующая информация в консоль.
//Также отображается количество созданных котов, собак и всех животных.

//2. Создать класс Сотрудник...

// Класс Сотрудник
class Employee {
    private String fullName; // ФИО
    private String position;  // Должность
    private String email;     // Email
    private String phone;     // Телефон
    private double salary;    // Зарплата
    private int age;         // Возраст

    // Конструктор класса
    public Employee(String fullName, String position, String email, String phone, double salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    // Метод для вывода информации о сотруднике
    public void printInfo() {
        System.out.printf("ФИО: %s, Должность: %s, Email: %s, Телефон: %s, Зарплата: %.2f, Возраст: %d%n",
                fullName, position, email, phone, salary, age);
    }

    // Геттер для возраста
    public int getAge() {
        return age;
    }
}

// Главный класс
public class Main {
    public static void main(String[] args) {
        // Создание массива из 5 сотрудников
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", "Менеджер", "ivanov@mail.com", "123-456", 50000, 45),
                new Employee("Петров Петр Петрович", "Разработчик", "petrov@mail.com", "789-012", 60000, 35),
                new Employee("Сидоров Сидор Сидорович", "Дизайнер", "sidorov@mail.com", "345-678", 55000, 42),
                new Employee("Кузнецов Николай Николаевич", "Администратор", "kuznetsov@mail.com", "901-234", 45000, 50),
                new Employee("Семёнов Семён Семёнович", "Аналитик", "semenov@mail.com", "567-890", 65000, 28),
        };

        // Вывод информации о сотрудниках старше 40 лет
        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                employee.printInfo();
            }
        }
    }
}

//Описание:
//Класс Employee: Содержит поля для хранения информации о сотрудниках (ФИО, должность, email, телефон, зарплата и возраст).
//Конструктор позволяет инициализировать все эти поля при создании объекта,
//а метод printInfo выводит информацию о сотруднике в читабельном формате.
//Класс Main: В этом классе создается массив из пяти сотрудников.
//Далее с помощью цикла for-each происходит проверка возраста сотрудников,
//и если возраст больше 40 лет, информация о таком сотруднике выводится на экран.