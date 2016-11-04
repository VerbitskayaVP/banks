/** Класс служит для расчета выплат по аннуитетному типу кредитования
 * @author Veronika
 * */
public class annuity_payment extends input_data {
    /**
     * Объявление переменной 1/12 для сокращения следующей строки в формуле
     */
    static double one_twelfth = interest_rate / 100 / 12;
    /**
     * Расчет ежемесячного платежа
     */
    static double monthly_payment = sum * (one_twelfth + (one_twelfth / (Math.pow((1 + one_twelfth), loan_term) - 1)));
    static double balance = monthly_payment * loan_term;
    static double procent = 0;

    public void calculation(int i) {
        format_class f = new format_class();
        System.out.println(" \nМесяц " + (i + 1) + ":");

        balance = balance - monthly_payment - procent;
        procent = sum * one_twelfth;
        sum -= monthly_payment - procent;
        System.out.println("Основной долг: " + f.format(monthly_payment - procent));
        System.out.println("Проценты: " + f.format(procent));


    }


}
