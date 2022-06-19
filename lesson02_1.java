public class lesson02_1 {
    public static void main(String[] args) {
/*        var t = System.currentTimeMillis();
        StringBuilder s = new StringBuilder();  // быстрее в 1000 раз
        for (int i = 0; i < 1000000; i++) {
            s.append("+");

        }
        System.out.println(System.currentTimeMillis() - t);
        System.out.println(s);*/


/*        var v = System.currentTimeMillis();
        String str = "";                            // медленнее
        for (int i = 0; i < 1000000; i++) {
            str += "+";

        }
        System.out.println(System.currentTimeMillis() - v);
        System.out.println(s);*/

        String [] name = {"S", "e", "r","g","e", "i"};
        String sk = "Sergei Ka";
        System.out.println(sk.toLowerCase());
        System.out.println(String.join("", name)); // без соеденителя
        System.out.println(String.join(" ", name)); // пробел между строк
        System.out.println(String.join(",", name)); // запятая между строк

/*        concat(): объединение строк
        valueOf(): преобразует Object в строковое представление (завязан на toString())
        join(): объединяет набор строк в одну с учетом разделителя
        charAt(): получение символа по индексу
        indexOf(): первый индекс вхождения подстроки
        lastIndexOf(): последний индекс вхождения подстроки
        startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
        replace(): замена одной подстроки на другую*/
/*        trim(): удаляет начальные и конечные пробелы
        substring(): возвращает подстроку, см.аргументы
        toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
        сompareTo(): сравнивает две строки
        equals(): сравнивает строки с учетом регистра
        equalsIgnoreCase(): сравнивает строки без учета регистра
        regionMatches(): сравнивает подстроки в строках*/



    }
}
