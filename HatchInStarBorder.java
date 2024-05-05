package Star_Pattern;

public class HatchInStarBorder
{
    public static void main(String[] args) {
        int num=19;
        for(int i=1;i<=num;i++)
        {
            for (int j=1;j<=num;j++)
            {
                if(i==num/2+1 && j==2)
                {
                    System.out.print(" ");
                    continue;
                }
                if(i==j && i+j==num+1)
                {
                    System.out.print("#");
                }
                if(  j==1 || j==num || i==num || i==1 )
                {
                    System.out.print("* ");
                }
                else System.out.print("  ");

                }
            System.out.println();
            }

        }
    }

