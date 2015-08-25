import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class Pangrams
{
    public static void main(String[] args)
    {
        int[] alphabetArray = new int[26];
        Scanner scanner = new Scanner(System.in);
        alphabetArray[0] = 0;
        String inputString = scanner.nextLine().toLowerCase();
        for (int i = 0; i < inputString.length(); i++)
        {
            if (inputString.charAt(i) >= 97 && inputString.charAt(i) <= 'z')
            {
                alphabetArray[inputString.charAt(i) - 97]++;
            }
        }
        // reusing input string to store result
        inputString = "pangram";
        for (int i = 0; i < 26; i++)
        {
            if (alphabetArray[i] == 0)
            {
                inputString = "not pangram";
                break;
            }
        }
        System.out.println(inputString);
    }
}

