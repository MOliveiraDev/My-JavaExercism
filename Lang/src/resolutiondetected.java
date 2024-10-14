import java.awt.*;

public class resolutiondetected {
    public static void main(String[] args) {
        // Obtém o tamanho da tela
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        // Largura e altura da tela
        int screenWidth = screenSize.width;
        int screenHeight = screenSize.height;
        
        System.out.println("Resolução da tela: " + screenWidth  +" x "+ screenHeight);
    }
}