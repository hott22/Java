import java.io.File;

public class lesson02_2 {
    public static void main(String[] args) {
        try{
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file2.txt");
            File f3 = new File(pathFile);
            if (f3.createNewFile()) {
                System.out.println("f3 created");
            }
            else {
                System.out.println("f3 existed");
            }



        } catch (Exception e){
            System.out.println("catch");
        } finally {
            System.out.println("finaly");
        }

/*        isHidden(): возвращает истину, если каталог или файл является скрытым
        length(): возвращает размер файла в байтах
        lastModified(): возвращает время последнего изменения файла или каталога
        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        listFiles(): возвращает массив файлов и подкаталогов, которые находятся
        в определенном каталоге

        mkdir(): создает новый каталог
        renameTo(File dest): переименовывает файл или каталог
        length(): возвращает размер файла в байтах
        lastModified(): возвращает время последнего изменения
        файла или каталога

        list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
        listFiles(): возвращает массив файлов и подкаталогов, которые
        находятся в определенном каталоге

        mkdir(): создает новый каталог
        renameTo(File dest): переименовывает файл или каталог*/


    }
}
