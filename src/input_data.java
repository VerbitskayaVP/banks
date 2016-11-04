import java.util.Scanner;

/**
 * Класс служит для ввода начальных значений (меню)
 *
 * @author Veronika
 */


public class input_data {
    /**
     * @value interest_rate - процентная ставка
     * @value sum - сумма кредита
     * @loan_term - срок кредита
     */
    static double interest_rate, sum, loan_term;

    /**
     * @value currency - валюта кредита
     * @value payment_type - тип платежа
     */
    public static String currency, payment_type;


    /**
     * Метод для ввода начальных значений (меню)
     *
     * @see input_data#inputValue()
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
        crediting Crediting = new crediting();
        Crediting.crediting();

        /**Проверка на превышение макисмального кредита
         * в зависимости от программы кредитования
         * @param i - номер программы кредитования*/
        System.out.println("Введите размер кредита:");
        checkCredit Check = new checkCredit();
        Check.checkcredit(Crediting.i);

        /** Назначение валюты
         * */
        System.out.println("Выберите валюту кредита:\n 1. Рубли \n 2. Евро \n 3. Доллары");
        currency Currency = new currency();
        Currency.currency();

        /**
         * @param loan_term- срок кредита
         * */
        System.out.println("Срок кредита:");
        loan_term = scanner.nextDouble();

        /** Назначение типа платежа
         * */
        System.out.println("Введите тип платежа: \n 1. Аннуитетный \n 2. Дифференцированный");
        payment_type Pay = new payment_type();
        Pay.payment_type();
    }

    /**
     * Метод для вывода расчетов в зависимости от типа платежа
     *
     * @see input_data#calculation()
     */
    public void calculation() {
        sum Sum = new sum();
        System.out.println("*************График платежей*************** \n");
        for (int i = 0; i < loan_term; i++) {
            if (payment_type == "Дифференцированный") {
                /** Вызов метода для расчета оплаты кредита по дифференцированному типу платежа
                 * */
                differentiated_payment dif = new differentiated_payment();
                dif.calculation(i);
                dif.print_out(i);
            } else if (payment_type == "Аннуитетный") {
                /** Вызов метода для расчета оплаты кредита по аннуитетному типу платежа
                 * */
                annuity_payment an_pay = new annuity_payment();
                an_pay.calculation(i);
            }
        }
        /** Вывод суммы всех выплат
         * */
        Sum.print_out();
    }
}
