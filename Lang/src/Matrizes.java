import java.util.ArrayList;
import java.util.List;

public class Matrizes {
    public static void main(String[] args) {

        // Eu não faço ideia do que eu fiz eu só peguei o código mesmo ksksksksksks

        List<List<Integer>> matriz1 = new ArrayList<List<Integer>>();
        List<List<Integer>> matriz2 = new ArrayList<List<Integer>>();

        for (int i = 0; i < 10; i++) {
            List<Integer> aa  = new ArrayList<>();
            for (int j = 0; j < 10; j++) {
                aa.add(i + j);
            }
            matriz1.add(aa);
            matriz2.add(aa);
        }
        List<List<Integer>> resultMatriz = addMatriz(matriz1, matriz2);

        for (List<Integer> row : resultMatriz) {
            System.out.println(row.toString());
        }
    }

    private static List<List<Integer>> addMatriz(List<List<Integer>> matriz1, List<List<Integer>> matriz2) {
        List<Integer> mainMatriz = new ArrayList<>();

        for (int i = 0; i < matriz1.size(); i++) {
         List<Integer> temporaryMatriz = matriz1.get(i);
         List<Integer> secondTemporaryMatriz = matriz2.get(i);
         List<Integer> resultMatriz = new ArrayList<>();

         for (int j = 0; j < temporaryMatriz.size(); j++) {
             resultMatriz.add(temporaryMatriz.get(j)+ secondTemporaryMatriz.get(j));
         }
        }
        return matriz1;
    }
}
