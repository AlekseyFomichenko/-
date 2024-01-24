import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Modul.Toy;

/** 
 * Класс сохранения результата с методами <b>createFile</b> и <b>save</b>.
*/
public class Saving {
    //region fields

    private static File file;

    //endregion

    /** 
     * Метод создания файла {@link Saving#file}
     * @return создаёт файл, если такой уже есть, перезаписывает его.
     */
    public static void createFile() {
        file = new File("result.txt");
        if (file.exists()) {
            file.delete();
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("File is not created. " + e.getMessage());
            }
        }
    }

    /** 
     * Метод сохранения результата в файл
     * @param toy - экземпляр игрушки в виде строки
     */
    public static void save(Toy toy) {
        try (FileWriter fw = new FileWriter(file, true)) {
            if (toy == null) {
                fw.write("[null]");
                fw.write(System.lineSeparator());
            } else {
                fw.write(toy.toString());
                fw.write(System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println("File is not found. " + e.getMessage());
        }
    }
}
