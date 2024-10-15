import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] numerosinteiros = {1, 2, 3, 4, 5};

        String[] nomes = {"Fernando", "Julia", "Adriel", "Carlinhos", "Caue"};

        System.out.println("\nO numero que aparecer vai está dentro dos numeros inteiros\n");

        System.out.println(numerosinteiros[0]);
        System.out.println("-------------------------\n");
        System.out.println("O nome que aparecer vai está dentro dos nomes\n");
        System.out.println(nomes[0]);
        System.out.println("-------------------------\n");
        System.out.println("");
        Alfabeto();

    }

    static void Alfabeto() {

        String [] letras = {"A", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","Y","Z"}; //Array de letras

        Scanner digitar = new Scanner(System.in); //momento de digitar

        System.out.println("digite um numero que está no alfabeto");

        int numero = digitar.nextInt(); /*agora a variável "digitar" vai ter
                                        o valor que eu adicionei ao inteiro "numero"*/


        System.out.println(letras[numero]);

        /*O sistema vai mostrar a posição que eu escolhi do alfabeto
        e de acordo com essa posição, vai me retorna uma palavra */




    }
}