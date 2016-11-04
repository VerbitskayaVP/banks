/**
 * Класс служит для подсчета всех выплат по кредиту
 *
 * @author Veronika
 */
public class sum extends input_data {
    /**
     * Выводит сумму всех выплат
     */
    void print_out() {
        format_class f = new format_class();
        System.out.println("Сумма всех выплат составит: " + f.format(annuity_payment.monthly_payment * loan_term));
    }
}
