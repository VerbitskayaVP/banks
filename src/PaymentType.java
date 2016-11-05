import java.util.Scanner;

/**
 * Класс служит для проверки на правильность ввода цифр из меню
 *
 * @author Veronika
 */
class PaymentType extends InputData {
    void paymentType() {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                paymentType = "Аннуитетный";
                break;
            case 2:
                paymentType = "Дифференцированный";
                break;
            default:
                System.out.println("Неверные данные. Выберите цифру из списка.");
                paymentType();
        }
    }
}
