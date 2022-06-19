/**
 * Java. первая программа
 */
import java.io.FileWriter; // для записи в консоль
import java.io.IOException; // для записи в консоль


public class lesson01 {
    public static void main(String[] args)  {
        System.out.println("Hello world");
        int a = 123; // тип целый
        double b = 12.23; // тип дабл
        System.out.println(b);
        String c = "hello"; //   тип строка
        String c1 = "world";
        String c2 = c + c1;
        System.out.println(c2);
        float d = 2.4f; // тип float
        System.out.println(d);
        char ch = 124; // тип чар преобразует число 124 в символ |
        System.out.println(ch);
        char cv = '1';
        System.out.println(Character.isDigit(cv)); // првоерка на число True
        boolean flag1 = 123 >= 125;
        System.out.println(flag1); // false
        boolean flag2 = true ^ false; // дизъюнкция, истина когда одно из двух истина
        System.out.println(flag2); // true
        var e = 123; // неявный тип данных
        System.out.println(getType(e)); // используем метод getType к переменной 'e'
        var g = 123.123;
        System.out.println(getType(g)); // double
        System.out.println(Integer.MIN_VALUE); // класс обертка Integer
        String str = "qwer";
        var str1 = str.charAt(3); // присваивание элемента под номеров 3
        System.out.println(str1);
        System.out.println(str.length());  // длина строки
        double num1 = 12;
        int num2 = 2;
        System.out.println(num1 / num2);
        int num3 = 123;
        num3 = --num3 - num3--; // непонятка
        System.out.println(num3);
        int[] arr = new int[10];  // создание одномерного массива
        System.out.println(arr.length); // длина массива
        arr = new int[]{1, 3, 5, 7, 8}; // созданние одномерного массива
        System.out.println(arr.length);
        System.out.println(arr[2]);
        int [][] array = new int[3][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%d", array[i][j]);

            }
            System.out.println();
        }
        int num4 = 13; double num5 = num4;
        System.out.println(num5);// 13.0
        double num6 = 13.56; int num7 = (int)num6;
        System.out.println(num7); // 13
/*        Scanner data = new Scanner(System.in);  // ввод в переменную data
        System.out.println("name: ");  //
        String name = data.nextLine(); // присваивание name переменную data
        System.out.printf("Hi, %s!\n", name);
        data.close();*/
/*        Scanner number = new Scanner(System.in);
        System.out.println("Number: ");
        int x = number.nextInt();
        System.out.println(x);
        number.close();*/
/*        Scanner number = new Scanner(System.in);
        System.out.println("int a: ");
        boolean flag = number.hasNextInt();
        System.out.println(flag);
        int as = number.nextInt();
        System.out.println(as);
        number.close();*/
        int z = 1;
        int n = 2;
        int zb = z + n;
        String res = String.format("%d + %d = %d \n", z, n, zb); // %d - целочисленные, %f - с плавающей точкой, %s - строки
        System.out.printf("%d + %d = %d \n", z, n, zb);
        System.out.println(res);

        System.out.println(sun(3,5));
        System.out.println(fector(3));
        int z1 = 6;
        int z2= 4;
        int z3;
        if (z1 > z2){
            z3 = z1;
        } else{
            z3 = z2;
        }
        System.out.println(z3);
        int x1 = 4;
        int x2 = 5;
        int min = x1 > x2 ? x1 : x2;
        System.out.println(min);

        switch (x1){
            case 1:
            case 2:
            case 3:
                System.out.println("w");
            case 4:
                System.out.println("q");
                break;
        }

        int value = 123;
        int count = 0;
        while (value != 0){
            value /= 10;
            count++;
        }
        System.out.println(count);

        int value1 = 123;
        int count1 = 0;
        do {
            value1 /= 10;
            count1++;
        } while (value1 != 0);
        System.out.println(count1);

        for (int i = 0; i < 10; i++) {
            if(i%2 == 1){
                continue; // если условие не выполняется , то выолнение останавливается и переходит на след шаг
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if(i%2 == 1){
                break; // если условие выполняется, то ближайший цикл останвливается
            }
            System.out.println(i);
        }

        int [] az = new int [] {2,4,6,8,0,5};
        for (int item : az) {   /// перебор коллекции
            System.out.println(item);
        }

        try (FileWriter fw = new FileWriter("file.txt", false)){ // false - перезапись, true - дозапись
            fw.write("line1");
            fw.append("\n");
            fw.write("резльтат\n");
            fw.flush();

        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }






    }

    static int sun(int a, int b){
        return a + b;
    }
    static String getType(Object o) {  // метод getType
        return o.getClass().getSimpleName();
    }
    static double fector(int n){
        if(n==1) return 1;
        return n * fector(n - 1);
    }
}
