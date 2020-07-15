import.util.Scanner;
import java.net.*;
import java.io.*;

public class server{
    public static void main(String[] agrs) throws IOException{
        //Scanner.sc = new Scanner(System.in);
        //String s = sc.next();
        //System.out.println("Helllo "+s);
        ServerSocket ss = new ServerSocket(8000);
        Socket s = ss.accept();
        System.out.println("client connected");

        InputStreamReader in = new InputStreamReader(s.getInputStream());
        BufferedReader bf = new BufferedReader(in);

        String str = bf.readLine();
        System.out.println("client : "+str);

        PrintWriter pr = new PrintWriter(s.getOutputStream());
        pr.println("hello client");
        pr.flush();

        
    }
}