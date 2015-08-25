import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class GameOfThrones_I
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        int alphabetArray[] = new int[26];
        alphabetArray[0] = 0;
        for (int i = 0; i < inputString.length(); i++)
        {
            alphabetArray[inputString.charAt(i) - 97] += 1;
        }
        // check if occurrence of all the alphabets is even otherwise print NO
        for (int i = 0; i < 26; i++)
        {
            if (alphabetArray[i] % 2 != 0)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}

