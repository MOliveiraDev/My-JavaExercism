public class Variaveis {
    public static void main(String[] args) {

        // Tipos & Variáveis
        ///////////////////////////////////////

        // Declara-se variáveis usando <tipo> <nome> [
        // Byte - inteiro de 8 bits com sinal complementado a dois
        // (-128 <= byte <= 127)
        byte fooByte = 100;

        // Short - inteiro de 16 bits com sinal complementado a dois
        // (-32,768 <= short <= 32,767)
        short fooShort = 10000;

        // Integer - inteiro de 32 bits com sinal complementado a dois
        // (-2,147,483,648 <= int <= 2,147,483,647)
        int fooInt = 1;

        // Long - inteiro de 64 bits com sinal complementado a dois
        // (-9,223,372,036,854,775,808 <= long <= 9,223,372,036,854,775,807)
        long fooLong = 100000L;
        // L é usado para indicar que o valor da variável é do tipo Long;
        // sem o L, tudo é tratado como inteiro por padrão.

        // Nota: Java não tem tipos sem sinal

        // Float - Ponto Flutuante 32-bits, de precisão simples no padrão IEEE 754
        float fooFloat = 234.5f;
        // f é usado para indicar que o valor da variável é do tipo float;
        // caso contrário, ela é tratada como double.

        // Double - Ponto Flutuante 64-bits, de precisão dupla no padrão IEEE 754
        double fooDouble = 123.4;

        // Boolean - true & false
        boolean fooBoolean = true;
        boolean barBoolean = false;

        // Char - Um caractere Unicode de 16 bits
        char fooChar = 'A';

        // Usa-se o final para fazer com que a variável seja imutável.
        final int HORAS_QUE_TRABALHEI_POR_SEMANA = 9001;

        // Strings
        String fooString = "Aqui está minha String!";

        // \n é um caractere de escape que inicia uma nova linha
        String barString = "Imprimir em uma nova linha?\nSem problemas!";
        // \t é um caractere de escape que adiciona um caractere de tabulação
        String bazString = "Você quer adicionar tabulação?\tSem problemas!";
        System.out.println(fooString);
        System.out.println(barString);
        System.out.println(bazString);

        //Feito pelo site "Learn Java in Y Minutes

    }
}
