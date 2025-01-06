import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);

        float n1 = digitar.nextFloat();
        float n2 = digitar.nextFloat();
        float media = (n1 + n2)/2;

        System.out.println(media);
        if(media>9) {
            System.out.println("você é fera");
        }


    }
}
