import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class IceCreamParlor
{

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0)
        {
            int m = scanner.nextInt(), n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
            {
                arr[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (i == j)
                    {
                        continue;
                    }
                    if (arr[i] + arr[j] == m)
                    {
                        if (i < j)
                        {
                            m = j;
                            j = i;
                            i = m;
                            m = -1;
                        }
                        System.out.println((j + 1) + " " + (i + 1));
                    }
                    if (m == 0)
                    {
                        break;
                    }
                }
            }
        }
    }
}

