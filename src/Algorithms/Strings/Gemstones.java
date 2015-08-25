import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class Gemstones
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numberOfSteps = scanner.nextInt();
        String inputString = scanner.next();
        int charCount[] = new int[26];

        //assign one to index of charcount array with ascii values of characters in input string
        for (int i = 0; i < inputString.length(); i++)
        {
            charCount[inputString.charAt(i) - 'a'] = 1;
        }

        //keep checking for common characters in array and input strings, 
        // if value in array is one and that character is absent in input string make zero in array
        for (int i = 1; i < numberOfSteps; i++)
        {
            inputString = scanner.next();
            for (int j = 0; j < 26; j++)
            {
                char c = (char) (j + 'a');
                if (charCount[j] > 0 && !inputString.contains(((char) (j + 'a')) + ""))
                {
                    charCount[j] = 0;
                }
            }
        }
        int result = 0;
        // take a count of non-zero values and it will be result
        for (int i : charCount)
        {
            if (i > 0)
            {
                result++;
            }
        }
        System.out.println(result);
    }
}

