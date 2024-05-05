package Star_Pattern;

public class ReversePyramid_02
{
    public static void main(String[] args) {
        int num=9;
        int space=0;
        int star=num;
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print("  ");
            }
            for (int j=1;j<=star;j++)
            {
                System.out.print("*"+"   ");
            }
            System.out.println();
            star--;
            space++;
        }
    }
}
