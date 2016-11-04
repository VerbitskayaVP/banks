import java.util.Scanner;
/** Класс служит для проверки на правильность ввода цифр из меню
 * @author Veronika
 *
 * */
public class payment_type extends input_data {
    public void payment_type(){
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();

        switch (i) {
            case 1:
                payment_type = "Аннуитетный";
                break;
            case 2:
                payment_type = "Дифференцированный";
                break;
            default:
                System.out.println("Неверные данные. Выберите цифру из списка.");
                payment_type();
        }
    }
}
