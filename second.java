import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class second {
    public static void main(String[] args) {

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int res=0;

        try {
            res = Integer.parseInt(bf.readLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(res);
        try {
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
