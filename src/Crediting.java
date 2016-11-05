import java.util.Scanner;

/**
 * Класс служит для назначени япроцентной ставки в зависимости от программы кредитования
 *
 * @author Veronika
 */
public class Crediting extends InputData {
    public int i;

    public void crediting() {
        Scanner scanner = new Scanner(System.in);
        i = scanner.nextInt();
        switch (i) {
            case 1:
                interestRate = 18;
                break;
            case 2:
                interestRate = 17;
                break;
            case 3:
                interestRate = 15.5;
                break;
            case 4:
                interestRate = 12;
                break;
            case 5:
                interestRate = 28;
                break;
            default:
                System.out.println("Неверные данные. Выберите цифру из списка.");
                crediting();
        }
    }

}
