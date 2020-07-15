import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class cli{
    public static void main(String agrs[]) throws UnknownHostException, IOException{
        int number,temp;
        Scanner sc = new Scanner(System.in);
        Socket s = new Socket("127.0.0.1",8000);
        Scanner src1 = new Scanner(s.getInputStream());
        System.out.println("Enter any number");
        number = sc.nextInt();
        PrintStream p = new PrintStream(s.getOutputStream());
        p.println(number);
        temp = sc1.nextInt();
        System.out.println(temp);
    }
}