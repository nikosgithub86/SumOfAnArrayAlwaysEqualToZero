package sumalwaysequalstozero;
//write in the console a number ,
//the following program will produce an array with length equals to
//the number you gave AND will fill the array with elements
//that their sum is equal to zero

import java.util.Scanner;

public class SumAlwaysEqualsToZero {

    public static void main(String[] args) {
        ArrayFiller a = new ArrayFiller();
        Scanner input = new Scanner(System.in);
        System.out.println("write a number");
        int num = input.nextInt();

        a.setN(num);
        a.setA(a.makeAnArray());
        a.fill();
        int[] x = a.getA();
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }
        System.out.println(a.returnSumAlwaysZero(x));
    }

}
