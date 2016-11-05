import java.util.Scanner;

/**
 * Класс служит для ввода начальных значений (меню)
 *
 * @author Veronika
 */


public class InputData {
    /**
     * @value interestRate - процентная ставка
     * @value sum - сумма кредита
     * @value loanTerm- срок кредита
     */
    static double interestRate, Sum, loanTerm;

    /**
     * @value currency - валюта кредита
     * @value paymentType - тип платежа
     */
    static String currency, paymentType;


    /**
     * Метод для ввода начальных значений (меню)
     *
     * @see InputData#inputValue()
     */
    public static void inputValue() {
        int i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите программу кредитования: ");
        System.out.println(" 1. Потребительский кредит без обеспечения");
        System.out.println(" 2. Потребительский кредит под поручительство физических лиц");
        System.out.println(" 3. Нецелевой кредит под залог недвижимости");
        System.out.println(" 4. Военная ипотека");
        System.out.println(" 5. Кредитные карты");

        /**
         * Вызов метода для назначения процентной ставки
         * в зависимости от программы кредитования
         * */
        Crediting Crediting = new Crediting();
        Crediting.crediting();

        /**Проверка на превышение макисмального кредита
         * в зависимости от программы кредитования
         * @param i - номер программы кредитования*/
        System.out.println("Введите размер кредита:");
        CheckCredit Check = new CheckCredit();
        Check.checkcredit(Crediting.i);

        /** Назначение валюты
         * */
        System.out.println("Выберите валюту кредита:\n 1. Рубли \n 2. Евро \n 3. Доллары");

        Currency.currency();

        /**
         * @param loanTerm- срок кредита
         * */
        System.out.println("Срок кредита:");
        loanTerm = scanner.nextDouble();

        /** Назначение типа платежа
         * */
        System.out.println("Введите тип платежа: \n 1. Аннуитетный \n 2. Дифференцированный");
        PaymentType Pay = new PaymentType();
        Pay.paymentType();
    }

    /**
     * Метод для вывода расчетов в зависимости от типа платежа
     *
     * @see InputData#calculation()
     */
    public void calculation() {
        Sum sum = new Sum();
        System.out.println("*************График платежей*************** \n");
        for (int i = 0; i < loanTerm; i++) {
            if (paymentType == "Дифференцированный") {
                /** Вызов метода для расчета оплаты кредита по дифференцированному типу платежа
                 * */
                DifferentiatedPayment dif = new DifferentiatedPayment();
                dif.calculation(i);
                dif.printOut(i);
            } else if (paymentType == "Аннуитетный") {
                /** Вызов метода для расчета оплаты кредита по аннуитетному типу платежа
                 * */
                AnnuityPayment anPay = new AnnuityPayment();
                anPay.calculation(i);
            }
        }
        /** Вывод суммы всех выплат
         * */
        sum.printOut();
    }
}
