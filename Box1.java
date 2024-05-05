package Star_Pattern;

public class Box1
{
    public static void main(String[] args) {
        int num=7;
        int space=num-1;
        int star=1;
        for(int i=1;i<=num;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=star;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            star+=2;
            space--;
        }
            int temp=num-1;
            star=star-2;
            space=1;
        for (int i=1;i<=temp;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=star-2;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            star-=2;
            space++;
        }
    }
}
