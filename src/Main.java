/**
 * @author Veronika
 */

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {

        /** Вызов меню
         *  @see input_data#inputValue()
         *  */
        input_data.inputValue();

        /** Вывод введенных значений
         * @see starting_value#starting_value()
         * */
        starting_value start = new starting_value();
        start.startingValue();

        /** Расчет кредита
         * @see input_data#calculation()
         * */
        input_data calc = new input_data();
        calc.calculation();

        /** Расчитать снова
         * @see again#again()
         * */
        again again_main = new again();
        again_main.again();
    }

}
