package Star_Pattern;

import java.util.Scanner;

public class Border_RightAnglePattern_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for (int i = 1; i <= num; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if(i==j || j==1 || i==num)
                System.out.print("*"+" ");
                else System.out.print(" "+ " ");
            }

            System.out.println();
        }
    }
}
