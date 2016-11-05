/**
 * @author Veronika
 */

public class Main {
    public static void main(String[] args) {
        start();
    }

    public static void start() {

        /* Вызов меню
           @see InputData#inputValue()
         *  */
        InputData.inputValue();

        /** Вывод введенных значений
         * @see StartingValue#startingValue()
         * */
        StartingValue start = new StartingValue();
        start.startingValue();

        /** Расчет кредита
         * @see InputData#calculation()
         * */
        InputData calc = new InputData();
        calc.calculation();

        /** Расчитать снова
         * @see Again#again()
         * */
        Again againMenu = new Again();
        againMenu.again();
    }

}
