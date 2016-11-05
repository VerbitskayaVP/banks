/**
 * Класс служит для расчета выплат по аннуитетному типу кредитования
 *
 * @author Veronika
 */
class AnnuityPayment extends InputData {
    /**
     * Объявление переменной 1/12 для сокращения следующей строки в формуле
     *
     * @value oneTwelfth
     */
    private static double oneTwelfth = interestRate / 100 / 12;
    /**
     * Расчет ежемесячного платежа
     *
     * @value monthlyPayment - месячный платеж
     */
    static double monthlyPayment = Sum * (oneTwelfth + (oneTwelfth / (Math.pow((1 + oneTwelfth), loanTerm) - 1)));
    private static double balance = monthlyPayment * loanTerm;
    private static double procent = 0;

    /**
     *
     * */
    public void calculation(int i) {
        FormatClass f = new FormatClass();
        System.out.println(" \nМесяц " + (i + 1) + ":");

        balance = balance - monthlyPayment - procent;
        procent = Sum * oneTwelfth;
        Sum -= monthlyPayment - procent;
        System.out.println("Основной долг: " + f.format(monthlyPayment - procent));
        System.out.println("Проценты: " + f.format(procent));


    }


}
