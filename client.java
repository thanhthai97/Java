import.util.Scanner;
import java.net.*;
import java.io.*;

public class client{
    public static void main(String[] agrs) throws IOException{
        //Scanner.sc = new Scanner(System.in);
        //String s = sc.next();
        //System.out.println("Helllo "+s);
        Socket s = new Socket("localhost",8000);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("hello server");
        pr.flush();

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("Server : "+str);
    }
}