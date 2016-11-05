/**
 * Класс сужит для отображения всех введенных значений
 *
 * @author Veronika
 */
class StartingValue extends InputData {
    void startingValue() {
        System.out.println("Начальные значения: ");
        System.out.println("Размер кредита: " + Sum);
        System.out.println("Валюта кредита: " + currency);
        System.out.println("Срок кредита: " + loanTerm + " месяцев");
        System.out.println("Процентная ставка по кредиту: " + interestRate + " %");
        System.out.println("Тип платежа: " + paymentType + "\n");
    }
}
