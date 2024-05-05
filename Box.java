package Star_Pattern;

public class Box
{
    public static void main(String[] args) {
        int num=5;
        int star=1;
        int hatch=num-1;
        for (int i=1;i<=num;i++)
        {
            for (int j=1;j<=star;j++)
            {
                System.out.print("*"+" ");
            }
            for (int j=1;j<=hatch;j++)
            {
                System.out.print("# ");
            }
            System.out.println();
            star++;
            hatch--;
        }
    }
}
