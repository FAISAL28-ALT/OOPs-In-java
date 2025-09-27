import java.io.*;
class trow{
    public static void main (String args[]){
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br =new BufferedReader(in);
        int a,b,c;
        System.out.println("ENTER FIRST NUMBER");
        a=Integer.parseInt(br.readLine());
        System.out.println("Enter second number");
        b=Integer.parseInt(br.readLine());
        c=a=b;
        System.out.println("Sum="+c);

    }
}
