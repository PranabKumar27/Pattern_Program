package Star_Pattern;

public class HollowPyramid
{
    public static void main(String[] args) {
        int num=9;
        int space=num-1;
        int star=1;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for(int j=1;j<=star;j++)
            {
                if(j==1 || j==star|| i==num)
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
            space--;
            star+=2;
        }
    }
}
