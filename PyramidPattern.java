package Star_Pattern;
public class PyramidPattern
{
    public static void main(String[] args)
    {
        int num=5;
        int space=num-1;
        int star=1;
        for(int i=1;i<=num;i++)
        {
            for (int j=1;j<=space;j++)
            {
                System.out.print(" "+" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            space--;
            star+=2;
        }
    }
}
