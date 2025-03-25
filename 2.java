import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        // Инициализируем генератор случайных чисел
        Random random = new Random();
        // Генерируем случайное число от 0 до 10
        int numberToGuess = random.nextInt(11);
        // Количество попыток
        int attempts = 3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Угадайте число от 0 до 10. У вас есть " + attempts + " попытки:");

        // Начинаем игровой цикл
        for (int i = 0; i < attempts; i++) {
            System.out.print("Введите ваше предположение: ");
            int userGuess = scanner.nextInt();
            
            // Проверяем предположение пользователя
            if (userGuess < numberToGuess) {
                System.out.println("Загаданное число больше.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Загаданное число меньше.");
            } else {
                System.out.println("Поздравляем, вы угадали число!");
                break; // Выход из цикла, если число угадано
            }
            // Если осталось попытки, выводим сообщение
            if (i == attempts - 1) {
                System.out.println("Игра окончена! Загаданное число было: " + numberToGuess);
            } else {
                System.out.println("Попробуйте еще раз.");
            }
        }
        
        // Закрываем сканер
        scanner.close();
    }
}

//Описание:
//Генерируется случайное число от 0 до 10 с помощью Random.
//Пользователь имеет 3 попытки, чтобы угадать число.
//В каждом цикле пользователь вводит свое предположение, и программа сообщает, больше или меньше загаданное число.
//Если пользователь угадывает число, игра завершается с сообщением о победе.
//Если пользователь не угадывает за 3 попытки, игра заканчивается, и выводится загаданное число.