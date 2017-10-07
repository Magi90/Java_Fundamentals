import java.util.Scanner;



public class NestedLoopsToRecrusion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int[n];
        printLoops(arr, n, 0);

    }

    private static void printLoops(int[] arr, int n, int loop) {
        if(loop == n){
            print(arr, n);
            return;}
            for(int i =1; i<=n; i++){
                arr[loop] = i;
                printLoops(arr, n, loop+1);
            }

    }

    private static void print(int[] array, int n) {
        int c = 0;
        for (int i : array) {
            if (c % n == 0) {
                System.out.println();
            }
            System.out.print(i + " ");
            c++;
        }

    }
}
