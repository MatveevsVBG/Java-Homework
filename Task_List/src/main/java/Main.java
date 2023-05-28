// Пусть дан произвольный список целых чисел.
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее значение

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(11));
        }
        System.out.println(numbers);

        // Находим минимальное значение
        int minValue = Collections.min(numbers);
        System.out.println("Минимальное значение: " + minValue);

        // Находим максимальное значение
        int maxValue = Collections.max(numbers);
        System.out.println("Максимальное значение: " + maxValue);

        // Находим среднее значение
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double averageValue = sum / numbers.size();
        System.out.println("Среднее значение: " + averageValue);

        // Удаление чётных чисел
        numbers.removeIf(n -> n % 2 == 0);
        System.out.println("Удалены чётные числа: " + numbers);
    }
}
