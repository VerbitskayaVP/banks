
public class differentiated_payment {
    public static double answer;

    /**
     * Создание метода с аргументами.
     * Вывод наэкран месяц выплаты и сумма выплаты.
     */

    /** Создание метода @calculation с аргументами класса @differentiated_payment */
    public void calculation(double sum, double interest_rate, double loan_term, int i) {
        System.out.print("Месяц " + (i + 1) + " = ");
        answer = ((sum / loan_term) + (sum - (sum / loan_term) * i) * (interest_rate / 100) / 12);
        System.out.printf("%.2f", answer);
        System.out.println("");
        sum Sum = new sum();
        Sum.overpayment_sum(i);
    }
}
