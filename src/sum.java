
public class sum extends differentiated_payment {
    /**  Подсчет суммы всех выплат*/
    /**
     * Объявление перменной, хранящей сумму всех выплат
     */
    double benefits_amount = 0;

    public void overpayment_sum(int i) {
        double[] overpayment_sum = new double[(int) Main.loan_term];
        overpayment_sum[i] = answer;
        benefits_amount+=overpayment_sum[i];
    }

}
