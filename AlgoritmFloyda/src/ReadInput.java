import java.io.*;
import java.util.ArrayList;

public class ReadInput {
    public ArrayList<int[][]> arrays = new ArrayList<>();
    public int size;
    public String fileName;

    public ReadInput(String fileName) {
        this.fileName = fileName;
    }


    public ArrayList<int[][]> ReadInput() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        String line = bufferedReader.readLine();
        while (line != null) {
            int size = Integer.parseInt(line);
            int[] arr = new int[size*size];
            line = bufferedReader.readLine();
            String[] values = line.split(" ");
            int[][] values2 = new int[size][size];
            for (int i = 0; i < size*size; i++) {
                arr[i] = Integer.parseInt(values[i]);
            }
            int in = 0;
            while (in < values.length) {
                for (int i = 0; i < size; i++) {
                    for (int j = 0; j < size; j++) {
                        values2[i][j] = arr[in++];
                    }
                }
            }
            arrays.add(values2);
            line = bufferedReader.readLine();
        }
        return arrays;
    }
}


