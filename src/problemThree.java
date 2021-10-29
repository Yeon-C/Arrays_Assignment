import java.util.*;
import java.util.Scanner;
public class problemThree {

    public static int[] toPower(int size, int power){
        int[] daArray;
        int i;
        daArray = new int[size];
        
        for(i = 0; i < size; i++){
          daArray[i] = i;
        }
        for(i = 0; i < size; i++){
            daArray[i] = (int) Math.pow(i, power);
        }

        return daArray;
      }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Size: ");
        int size = myObj.nextInt();
        System.out.print("Enter Power: ");
        int power = myObj.nextInt();

        System.out.println("The resulting array is: ");
        System.out.println(Arrays.toString(problemThree.toPower(size, power)));
        myObj.close();
    }
}
