// Написать программу вычисления n-ого треугольного числа.
import java.util.Scanner;

public class home_work_01 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("number = ");
        int number = num.nextInt();
        num.close();

        int t = number * (number + 1) / 2;
        System.out.printf("number = %d", t);
    }



}
