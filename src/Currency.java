import java.util.Scanner;

/**
 * Класс служит для проверки правильность ввода цифр из меню
 *
 * @author Veronika
 */
class Currency extends InputData {
    public static void currency() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                currency = "Рубли";
                break;
            case 2:
                currency = "Евро";
                break;
            case 3:
                currency = "Доллары";
                break;
            default:
                System.out.println("Неверные данные. Выберите цифру из списка.");
                Currency.currency();
        }
    }
}
