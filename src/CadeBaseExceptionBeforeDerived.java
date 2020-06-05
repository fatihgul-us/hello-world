import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CadeBaseExceptionBeforeDerived {

    public static void main(String[] args) {
        FileInputStream fis = null;

        try {

            fis = new FileInputStream("file.txt");
            fis.close();
        }        catch(FileNotFoundException fnfe){
            System.out.println("File not found");
        }
        catch (IOException io){
            System.out.println("IOException");
        }
        finally {
            System.out.println("final");
        }

    }
}
