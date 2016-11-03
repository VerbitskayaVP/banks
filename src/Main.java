
public class Main {
    /**
     * Объявление входных значений веществнного типа: процентная ставка, сумма кредита, срок кредита
     */
    static double interest_rate = 16, sum = 100_000, loan_term = 12;
    /**
     * Объявление входных значений строкого типа: валюта: рубли/евро/доллары, типа платежа: аннуитетный(annuity)/дифференцированный
     */
    static String currency = "rub", payment_type = "differentiated";

    public static void main(String[] args) {
        System.out.println("График платежей: (" + currency + ") \n");

        /** Вывод расчетов по дифференцированной или аннуитетной схеме.
         * Создание объекта классов дифференцированного и аннуитетного расчетов, вывод на экран */
        for (int i = 0; i < loan_term; i++) {
            if (payment_type == "differentiated") {
                differentiated_payment dif = new differentiated_payment();
                dif.calculation(sum, interest_rate, loan_term, i);
            }
            //else //TODO:

        }
    }
}
