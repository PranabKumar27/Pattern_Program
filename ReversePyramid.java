package Star_Pattern;

public class ReversePyramid
{
    public static void main(String[] args) {
        int num=5;
        int space=0;
        int star=num*2-1;
        for(int i=1;i<=num;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" "+" ");
            }
            for (int j=1;j<=star;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            star-=2;
            space++;
        }
    }
}
