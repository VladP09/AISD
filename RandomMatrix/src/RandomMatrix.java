import java.util.Random;

public class RandomMatrix {
    final int MAX_VEIGHT = Integer.MAX_VALUE;
    int size;
    int[][] matrix;

    public RandomMatrix(int size){
        Random random = new Random();
        this.matrix=new int[size][size];
        this.size = size;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt();
            }
        }
    }
    public int[][] getMatrix(){
        return matrix;
    }
    public int getAmountОfElements(){
        return size*size;
    }

}
