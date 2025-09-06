
import java.util.*;
class Amstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the number to check Amstrong number: ");
        int n=sc.nextInt();
        int amg=0;
        int temp=n;
        int c=0;
        while(temp!=0){
            temp=temp/10;
            c++;
        }
        temp=n;
        while(temp!=0){
            int d=temp%10;
            amg+=(int)Math.pow(d,c);
            temp=temp/10;
        }
        if(n==amg){
            System.out.print("Number is amstrong: "+n);
        }
        else{
            System.out.print("Number is not amstrong: "+n);
        }
    }
}
