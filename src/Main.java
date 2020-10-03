import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num;
        System.out.println("Enter a number of ticket: ");
        String str = br.readLine();
        num = Integer.valueOf(str);
        br.close();
        switch (num){
            case 111:
            case 222:
            case 333:
                System.out.println("You will get the book.");
                break;
            case 444:
            case 555:
                System.out.println("You will get the Smartphone.");
                break;
            case 777:
                System.out.println("You will get the Laptop.");
                break;
            default:
                System.out.println("You will get the Nothing.");
        }
    }
}
