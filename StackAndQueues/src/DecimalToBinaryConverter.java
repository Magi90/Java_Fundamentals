import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int decimal = Integer.valueOf(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if(decimal ==0){
            System.out.print("0");
            return;}

        while (decimal!=0){stack.push(decimal % 2);
        decimal /=2;
        while(!stack.isEmpty()){
            System.out.print(stack.pop());


        }
    }
}
}