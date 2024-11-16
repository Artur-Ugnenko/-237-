import java.util.Scanner;

import static java.lang.System.in;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Swirch {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner (in);
        System.out.println("Введите день недели - ");
        int N = Scanner.nextInt();
        switch (N) {
            case 1:
                System.out.println("Понедельник");
                break; //выход
            case 2:
                System.out.println("Вторник");
                break; //выход
            case 3:
                System.out.println("Среда");
                break; //выход
            case 4:
                System.out.println("Четверг");
                break; //выход
            case 5:
                System.out.println("Пятница");
                break; //выход
            case 6:
                System.out.println("Суббота");
                break; //выход
            case 7:
                System.out.println("Воскресенье");
                break; //выход
            default:
                System.out.println("Ошибка");
        }
    }
}