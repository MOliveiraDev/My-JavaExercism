import java.util.Timer;

public class systemtimer {
    public static void main(String[] args) {
        Timer relogio = new Timer();
        printartempo();
        System.out.println(relogio);
        
    }

    static void printartempo()
    {
        System.out.println("Este código diz a hora, o mês, a semana, o ano em quem nos estamos");
        
    }
}
