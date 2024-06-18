import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_catch_close_resource {
    public static void main(String[] args) throws IOException {
        
    /*
     * Auto close resource with try
     */
    try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)))
    {
        System.out.println("Enter your name : ");
        String name = bf.readLine();
        System.out.println("Hello "+name);
    }
    }
}
