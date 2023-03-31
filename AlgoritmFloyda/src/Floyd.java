import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class Floyd {
    int[][] matrix;
    int peaks;
    int count;


    public Floyd(int[][] matrix) {
        this.matrix = matrix;
        this.count = 0;
        this.peaks = matrix.length;
    }
    public int goFloyd(){
        for(int i = 0; i < peaks; i++){
            for(int j = 0; j < peaks; j++){
                for(int k = 0; k < peaks; k++){
                        matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);
                        count++;
                }
            }
        }
        return count;
    }



}
