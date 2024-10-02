import java.util.Locale;

public class lang {
    public static void main(String[] args) {
        //Java consegue detectar a lingua que eu estou usando no momento
        Locale locale = new Locale("PORTUGUESE", "PT");
        System.out.println("Lingua do sistema operacional: " + locale.getDisplayLanguage());
    }
}
