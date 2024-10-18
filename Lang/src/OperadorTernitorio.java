public class OperadorTernitorio {
    public static void main(String[] args) {
        Operador1();
        Operador2();
        LogicOperator();

    }

    static void Operador1(){

        int n1, n2 ,r;
        n1 = 4;
        n2 = 10;
        r = (n1>n2) ? 0 : 1;
        System.out.println("");
        System.out.println(r);

    }

    static void Operador2(){

        String nome1 = "Maicon";
        String nome2 = "Maicon";
        String nome3 = new String("Maicon");
        String nome4 = new String("Maicon");
        String r;
        r = (nome1.equals(nome3)) ? "É Igual" : "É diferente";
        System.out.println("");
        System.out.println(r);

    }

    static void LogicOperator(){

        int x, y, z;
        x = 4;
        y = 7;
        z = 12;
        boolean r;

        r = (x==y ^ y<z)? true : false;
        System.out.println("");
        System.out.println(r);    }
}
