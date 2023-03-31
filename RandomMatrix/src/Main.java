import java.io.*;

public class Main {
    public static void main(String[] args) {
        int quantityArr = 100;
        String fileName = "/Users/vlad/Desktop/random.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (int i = 1; i < quantityArr; i++){
                int size = 10+i;
                RandomMatrix randomMatrix = new RandomMatrix(size);
                writer.write(size + "\n");
                int[][] matrix = randomMatrix.getMatrix();
                for ( int j = 0; j < size; j++){
                    for(int w = 0; w < size; w++){
                        writer.write(matrix[j][w] + " ");
                    }
                }
                writer.write("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}