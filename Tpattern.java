package Star_Pattern;

import java.util.Scanner;

public class Tpattern
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                if(i==1||j==(num/2)+1)
                    System.out.print("*"+" ");
                else System.out.print(" "+" ");
            }
















            System.out.println();
        }
    }
}
