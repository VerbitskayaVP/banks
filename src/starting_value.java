/**
 * Класс сужит для отображения всех введенных значений
 *
 * @author Veronika
 */
public class starting_value extends input_data {
    void startingValue() {
        System.out.println("Начальные значения: ");
        System.out.println("Размер кредита: " + sum);
        System.out.println("Валюта кредита: " + currency);
        System.out.println("Срок кредита: " + loan_term + " месяцев");
        System.out.println("Процентная ставка по кредиту: " + interest_rate + " %");
        System.out.println("Тип платежа: " + payment_type + "\n");
    }
}
