import java.util.Scanner;

/**
 * Класс служит для проверки максимальной суммы кредита
 *
 * @author Veronika
 */

public class checkCredit extends input_data {
    public void checkcredit(int i) {
        Scanner scanner = new Scanner(System.in);
        crediting Crediting = new crediting();
        sum = scanner.nextDouble();
        switch (i) {
            case 1:
                if (sum > 1_500_000) {
                    System.out.println("Максимальная сумма кредита 1 500 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 2:
                if (sum > 3_000_000) {
                    System.out.println("Максимальная сумма кредита 3 000 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 3:
                if (sum > 10_000_000) {
                    System.out.println("Максимальная сумма кредита 10 000 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 4:
                if (sum > 1_900_000) {
                    System.out.println("Максимальная сумма кредита 1 900 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 5:
                if (sum > 600_000) {
                    System.out.println("Максимальная сумма кредита 600 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
        }

    }
}
