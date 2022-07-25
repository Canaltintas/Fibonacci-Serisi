import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a=0,b=1,c=0,n;
        Scanner input = new Scanner(System.in);
        System.out.print("Seri Kaç adımdan oluşacak :");
        n=input.nextInt();
        for (int i=1;i<=n;i++){
            c=a+b;
            a=b;
            b=c;

            System.out.println(a+" + "+b+" = "+c);
        }


    }
}
