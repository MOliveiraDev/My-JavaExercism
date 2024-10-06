import java.util.Scanner;

public class typesprimite {

    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        System.out.println("Digite o nome do aluno");
        String nome = digitar.nextLine();
        System.out.println("Digite a nota que ele receberá");
        var nota = digitar.nextLine();
        System.out.println("A nota de " + nome + " é " + nota);
        System.out.println("qual é a sua opinião ?");
        String opiniao = digitar.nextLine(); 

        if(opiniao.equalsIgnoreCase("burro do krl")) {
            System.out.println("\nConcordo plenamente\n");
        }

        digitar.close();
        
    }
}