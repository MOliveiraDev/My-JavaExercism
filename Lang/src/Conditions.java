import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        Scanner digitar = new Scanner(System.in);
        System.out.println("Nota Parcial do Aluno: ");
        float n1 = digitar.nextFloat();
        System.out.println("Nota Bimestral do Aluno: ");
        float n2 = digitar.nextFloat();
        System.out.println("Sua média: ");
        float media = (n1 + n2) / 2;
        System.out.println(media+"\n");
        String resultado = (media > 5) ? "Sua nota está na média!" : "Precisa melhora a sua nota";   //como substituir o if e o else

        System.out.println(resultado);

    }
}
