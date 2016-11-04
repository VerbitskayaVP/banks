import java.util.Scanner;
/** Класс служит для проверки правильность ввода цифр из меню
 * @author Veronika
 * */
public class currency extends input_data{
    public void currency(){
        Scanner scanner=new Scanner(System.in);
        int i = scanner.nextInt();
        switch (i) {
            case 1:
                currency = "Рубли";
                break;
            case 2:
                currency = "Евро";
                break;
            case 3:
                currency = "Доллары";
                break;
            default:
                System.out.println("Неверные данные. Выберите цифру из списка.");
                currency();
        }
    }
}
