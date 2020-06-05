import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReThrowException {

    static FileInputStream soccer;
    public static void myMthod() throws IOException {

            soccer = new FileInputStream("file.txt");
    }

    public static void main(String[] args) {

      //  myMthod();

}}
