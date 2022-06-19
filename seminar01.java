//Реализовать функцию возведения числа а в степень b. a, b ∈ Z.
// Сводя количество выполняемых действий к минимуму.
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
//Пример 4: а = 0, b = 0, ответ: не определено
//Пример 5
//входные данные находятся в файле input.txt в виде
//b 3
//a 10
//Результат нужно сохранить в файле output.txt
// 1000

import java.io.*;
import java.io.IOException;

public class seminar01 {
    public static void main(String[] args) throws Exception {
        int a = 3;
        int b = 2;
        double result = stepen(a, b);
        System.out.printf("result = %.0f\n", result); // выввод 0 знаков после запятой
        double result2 = stepen(2, -2);
        System.out.printf("result2 = %.2f\n", result2); // выввод 2 занкка после запятой
        double result3 = stepen(3, 0);
        System.out.printf("result = %.0f\n", result3);
        double result4 = stepen(0, 0);
        System.out.printf("резултат = %f\n", result4);

        BufferedReader data = new BufferedReader(new FileReader("input.txt"));

        String str;
        int[] arr = new int[2];

        while ((str = data.readLine()) != null) {
            // System.out.printf("%s\n", str);
            char c = str.charAt(0);
            if (c == 'a') {
                String number = str.substring(2);
                arr[0] = Integer.parseInt(number);
            }
            if (c == 'b') {
                String number = str.substring(2);
                arr[1] = Integer.parseInt(number);
            }

        }
        data.close();
        for (int i : arr) {
            System.out.println(i);
        }
        String res;
        if (arr[0] == 0 && arr[1] == 0 ){
            res = "Не определено";
        }
        else{
            double resultat = stepen(arr[0], arr[1]);
            res = Double.toString(resultat);
        }

        try (FileWriter fw = new FileWriter("output.txt", false)) {
            fw.write(res);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


    }

    static double stepen(int a, int b) {
        return Math.pow(a, b);
    }
}
