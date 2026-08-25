import java.util.*;

public class Result {

    public static void matrixRotation(List<List<Integer>> matrix, int r) {

        int m = matrix.size();
        int n = matrix.get(0).size();

        int layers = Math.min(m, n) / 2;

        for (int layer = 0; layer < layers; layer++) {

            List<Integer> temp = new ArrayList<>();

            // Top
            for (int j = layer; j < n - layer; j++)
                temp.add(matrix.get(layer).get(j));

            // Right
            for (int i = layer + 1; i < m - layer; i++)
                temp.add(matrix.get(i).get(n - layer - 1));

            // Bottom
            for (int j = n - layer - 2; j >= layer; j--)
                temp.add(matrix.get(m - layer - 1).get(j));

            // Left
            for (int i = m - layer - 2; i > layer; i--)
                temp.add(matrix.get(i).get(layer));

            int size = temp.size();
            int shift = r % size;

            int index = shift;

            // Top
            for (int j = layer; j < n - layer; j++) {
                matrix.get(layer).set(j, temp.get(index));
                index = (index + 1) % size;
            }

            // Right
            for (int i = layer + 1; i < m - layer; i++) {
                matrix.get(i).set(n - layer - 1, temp.get(index));
                index = (index + 1) % size;
            }

            // Bottom
            for (int j = n - layer - 2; j >= layer; j--) {
                matrix.get(m - layer - 1).set(j, temp.get(index));
                index = (index + 1) % size;
            }

            // Left
            for (int i = m - layer - 2; i > layer; i--) {
                matrix.get(i).set(layer, temp.get(index));
                index = (index + 1) % size;
            }
        }

        for (List<Integer> row : matrix) {
            for (int x : row) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
