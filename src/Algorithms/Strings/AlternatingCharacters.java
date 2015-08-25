import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class AlternatingCharacters
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0)
        {
            String inputString = scanner.next();
            int count = 0;
            for (int i = 0; i < inputString.length() - 1; i++)
            {
                if (inputString.charAt(i) == inputString.charAt(i + 1))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

