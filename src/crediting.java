import java.util.Scanner;
/** Класс служит для назначени япроцентной ставки в зависимости от программы кредитования
 * @author Veronika
 * */
public class crediting extends input_data {
    public int i;
    public void crediting(){
        Scanner scanner=new Scanner(System.in);
        i= scanner.nextInt();
        switch (i) {
            case 1:
                interest_rate = 18;
                break;
            case 2:
                interest_rate = 17;
                break;
            case 3:
                interest_rate = 15.5;
                break;
            case 4:
                interest_rate = 12;
                break;
            case 5:
                interest_rate = 28;
                break;
            default:
                System.out.println("Неверные данные. Выберите цифру из списка.");
                crediting();
        }
    }

}
