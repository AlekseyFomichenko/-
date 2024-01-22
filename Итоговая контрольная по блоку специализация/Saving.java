import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Saving {
    private static File file;

    public static void createFile(){
        file = new File("result.txt");
    }

    public static void save(Integer get){
        try (FileWriter fw = new FileWriter(file, false)) {
            fw.write(get); // записываем результат метода get из класса ToyStore
            fw.write(System.lineSeparator());
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
