/**
 * Класс служит для подсчета всех выплат по кредиту
 *
 * @author Veronika
 */
class Sum extends InputData {
    /**
     * Выводит сумму всех выплат
     */
    void printOut() {
        FormatClass f = new FormatClass();
        System.out.println("Сумма всех выплат составит: " + f.format(AnnuityPayment.monthlyPayment * loanTerm));
    }
}
