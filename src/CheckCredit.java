import java.util.Scanner;

/**
 * Класс служит для проверки максимальной суммы кредита
 *
 * @author Veronika
 */

class CheckCredit extends InputData {
    public void checkcredit(int i) {
        Scanner scanner = new Scanner(System.in);
        Crediting Crediting = new Crediting();
        Sum = scanner.nextDouble();
        switch (i) {
            case 1:
                if (Sum > 1_500_000) {
                    System.out.println("Максимальная сумма кредита 1 500 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 2:
                if (Sum > 3_000_000) {
                    System.out.println("Максимальная сумма кредита 3 000 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 3:
                if (Sum > 10_000_000) {
                    System.out.println("Максимальная сумма кредита 10 000 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 4:
                if (Sum > 1_900_000) {
                    System.out.println("Максимальная сумма кредита 1 900 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
            case 5:
                if (Sum > 600_000) {
                    System.out.println("Максимальная сумма кредита 600 000. Введите еще раз.");
                    checkcredit(i);
                }
                break;
        }

    }
}
