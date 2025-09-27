import java.io.File;
public  class filehandling{
    public static void main(String[] args) {
        try {
            File Obj=new File("myfile.txt");
            if(Obj.createNewFile()){
                System.out.println("File Creted"+ Obj.getName());
            }
            else{
                System.out.println("File Already exits");
            }
        } catch (Exception e) {
            System.out.println("Am error has Occured");
            e.printStackTrace();
        }
    }
}
