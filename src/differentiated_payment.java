
public class differentiated_payment extends input_data{
    public static double answer;

    /**
     * Создание метода с аргументами.
     * Вывод наэкран месяц выплаты и сумма выплаты.
     */

    /** Создание метода @calculation с аргументами класса @differentiated_payment */
    public void calculation(int i) {
        answer = ((sum / loan_term) + (sum - (sum / loan_term) * i) * (interest_rate / 100) / 12);

    }
    public void print_out(int i){
        format_class f=new format_class();

        System.out.println("Месяц " + (i + 1) + ": ");
        System.out.println(" Основной долг: "+f.format(sum/loan_term)+"\n Сумма платежа с процентами: "+f.format(answer));
        System.out.println("");
    }
}
