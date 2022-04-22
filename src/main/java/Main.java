import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        Scanner scanner = new Scanner(System.in);

        logger.log("Просим пользователя ввести входные данные для списка\n");
        System.out.println("Введите размер списка:");

        int n = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений:");

        int maxValue = scanner.nextInt();
        logger.log("Создаём и наполняем список");

        Random random = new Random();
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            randomNumbers.add(i, random.nextInt(maxValue));
        }
        System.out.println("Вот случайный список:" + randomNumbers);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра:");

        int f = scanner.nextInt();

        logger.log("Запускаем фильтрацию");

        Filter filter = new Filter(f);
        List<Integer> listFiltered = filter.filterOut(randomNumbers);

        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + listFiltered);

        logger.log("Завершаем программу");
    }
}
