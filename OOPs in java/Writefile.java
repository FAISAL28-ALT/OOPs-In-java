import java.io.FileWriter;
public class Writefile{
    public static void main(String[] args) {
        try {
            FileWriter Writer= new FileWriter("myfile.txt");
            Writer.write("hello my self chandan kumar mandal from iilm universty gerater noida my origin is from bhair");
            Writer.close();
            System.out.println("Successfully written");
        } catch (Exception e) {
            System.out.println("An error has occured");
            e.printStackTrace();
        }
    }
}