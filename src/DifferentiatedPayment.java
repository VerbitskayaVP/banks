/**
 * Расчет кредита по дифференцированному типу
 *
 * @author Veronika
 */
class DifferentiatedPayment extends InputData {
    private static double answer;


    /**
     * Расчет суммы платежа с процентами
     *
     * @value answer - сумма платежа с процентами
     * @see DifferentiatedPayment#calculation()
     */
    public void calculation(int i) {
        answer = ((Sum / loanTerm) + (Sum - (Sum / loanTerm) * i) * (interestRate / 100) / 12);

    }

    /**
     * Вывод значения
     *
     * @see DifferentiatedPayment#printOut(int)
     */
    void printOut(int i) {
        FormatClass f = new FormatClass();

        System.out.println("Месяц " + (i + 1) + ": ");
        System.out.println(" Основной долг: " + f.format(Sum / loanTerm) + "\n Сумма платежа с процентами: " + f.format(answer));
        System.out.println("");
    }
}
