/**
 * Расчет кредита по дифференцированному типу
 *
 * @author Veronika
 */
public class differentiated_payment extends input_data {
    private static double answer;


    /**
     * Расчет суммы платежа с процентами
     *
     * @value answer - сумма платежа с процентами
     * @see differentiated_payment#calculation()
     */
    public void calculation(int i) {
        answer = ((sum / loan_term) + (sum - (sum / loan_term) * i) * (interest_rate / 100) / 12);

    }

    /**
     * Вывод значения
     *
     * @see differentiated_payment#print_out(int)
     */
    void print_out(int i) {
        format_class f = new format_class();

        System.out.println("Месяц " + (i + 1) + ": ");
        System.out.println(" Основной долг: " + f.format(sum / loan_term) + "\n Сумма платежа с процентами: " + f.format(answer));
        System.out.println("");
    }
}
