import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] line = getArray();
        reverse(line);
        System.out.println(Arrays.toString(line).replace(",", "")
                .replace("[", "")  //remove the right bracket
                .replace("]", "")  //remove the left bracket
                .trim());

    }
    private static void reverse(int[] line) {
    reverse(line, 0, line.length-1);
    }

    public static void reverse (int[] line, int i, int j){
    if (i>=j){
        return;
    }
    swap(line, i, j);
    reverse(line, i+1,j-1);
    }

    private static void swap(int[] line, int i, int j) {
        int a = line[i];
        line[i] = line[j];
        line[j] =a;
    }


    private static int[] getArray() {
        Scanner scanner = new Scanner(System.in);

            String[] input = scanner.nextLine().split(" ");
            int[] line = new int[input.length];
            for (int i = 0; i < line.length; i++) {
            line[i] = Integer.parseInt(input[i]);
            }
            return line;
        }

    }

