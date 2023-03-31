import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/vlad/Desktop/random.txt";
        ArrayList<int[][]> arrays = new ReadInput(fileName).ReadInput();
        for (int i = 0; i < arrays.size(); i++) {
            int[][] arr = arrays.get(i);
            long startTime = System.nanoTime(); // время начала сортировки
            System.out.println("\n" + "Iterations: " + new Floyd(arr).goFloyd());
            long endTime = System.nanoTime(); // время окончания сортировки
            long timeElapsed = endTime - startTime; // время выполнения сортировки

            int size = arr.length; // определение размера массива

            System.out.println("Array #" + (i + 1) + " (amount of elements: " + (size*size) + "): "); // вывод размера и отсортированного массива
            System.out.println("Time taken: " + timeElapsed + " nanoseconds");


        }
    }
}