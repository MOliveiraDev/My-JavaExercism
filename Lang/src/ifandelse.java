public class ifandelse {
    public static void main(String[] args) {
        ifelse();
        whileloop();
        

    }

    static void ifelse(){

        int j = 3;
        if (j == 2) {
            System.out.println("O valor de j é igual a 2");
        }
        else if (j > 1) {
            System.out.println("Então j é maior que 1");
        }
        else {
            System.out.println("Então quer dizer que j é menor que 1");
        }
    }

    static void whileloop(){
    // O Loop While
        int fooWhile = 0;
        while(fooWhile < 100)
    {
                     //System.out.println(fooWhile);
                     //Incrementando o contador
                     //Iteração feita 99 vezes, fooWhile 0->99
             fooWhile++;
          }
            System.out.println("Valor do fooWhile: " + fooWhile);

        }

}
