/**
 *
 * @author nayan
 */
import java.math.BigInteger;
import java.util.*;

public class CounterGame
{

  public static void main(String[] args)
    {
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        String[] arr =
        {
            "Louise", "Richard"
        };
        int resultIndex;
        while (testCases-- > 0)
        {
            BigInteger inputNumber = sc.nextBigInteger();
            resultIndex = 0;
            while (true)
            {
                if (inputNumber.compareTo(BigInteger.ONE) == 0)
                {
                    break;
                }
                if (inputNumber.compareTo(BigInteger.ZERO) < 0
                        || (inputNumber.and(inputNumber.subtract(BigInteger.ONE))).
                        compareTo(BigInteger.ZERO) > 0)
                {
                    String tmp = inputNumber.toString(2);
                    int temp = tmp.length() - 1;
                    BigInteger temp1 = BigInteger.valueOf(2).pow(temp);
                    inputNumber = inputNumber.subtract(temp1);

                }
                else
                {
                    String binaryString = inputNumber.toString(2);
                    resultIndex += binaryString.length();
                    resultIndex--;
                    break;
                }
                resultIndex++;
            }
            if (resultIndex % 2 == 0)
            {
                System.out.println(arr[1]);
            }
            else
            {
                System.out.println(arr[0]);
            }
        }
    }

}

