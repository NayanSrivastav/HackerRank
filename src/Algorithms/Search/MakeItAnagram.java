import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class MakeItAnagram
{

    public static void main(String[] args)
    {
        int alphabetArray[] = new int[26];
        Scanner scanner = new Scanner(System.in);
        alphabetArray[0] = 0;
        String s1 = scanner.next();
        for (int i = 0; i < s1.length(); i++)
        {
            alphabetArray[s1.charAt(i) - 97]++;
        }
        s1 = scanner.next();
        int result= 0;
        for (int i = 0; i < s1.length(); i++)
        {
            if (alphabetArray[s1.charAt(i) - 97] > 0)
            {
                alphabetArray[s1.charAt(i) - 97]--;
            }
            else
            {
                result++;
            }
        }

        for (int i = 0; i < 26; i++)
        {
            result += alphabetArray[i];
        }
        System.out.println(result);
    }
}
