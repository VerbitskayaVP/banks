import java.util.Scanner;

/**
 * Класс служит для вызова программы снова, если нужно рассчитать другой кредит с другими данными
 *
 * @author Veronika
 */
class Again {
    /**
     * @see Again - вызов программы еще раз
     */
    public void again() {
        System.out.println("\n************************************************");
        System.out.println("Хотите сделать расчет заново? \n 1. Да \n 2. Нет");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        if (i == 1) Main.start();
    }
}
