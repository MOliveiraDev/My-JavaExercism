import java.util.Scanner;

public class typesprimite {

    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        String nome = "\nAdriel tirou ";
        var nota = 2.1;
        String frase2 = " em matemática";
        System.out.println(nome + nota + frase2);
        System.out.println("qual é a sua opinião ?");
        String opiniao = digitar.nextLine(); 

        if(opiniao.equalsIgnoreCase("burro demais")) {
            System.out.println("\nConcordo plenamente");
        }

        digitar.close();
        
    }
}