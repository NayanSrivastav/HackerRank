import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class MissingNumber
{
    /**
     * The function sorts both the lists and then picks items from first list and keep counting its frequency in first list. 
     * Then if the the same number is present in second list, counts its frequency in second list as well. If frequency in second list is greater than frequency in first list prints the number.
     * each number which is present in both the list simply negate the value in second list to mark it as visited. 
     * In the end traverse the second list again and if there are still un-visited numbers print them.
     * @param list1
     * @param list2 
     */

    private static void printMissingNumbers(List<Integer> list1,
            List<Integer> list2)
    {

        Collections.sort(list2);
        Collections.sort(list1);
        int outFreq = 1, inFreq = 0;
        int currentNumber = list1.get(0);
        boolean flag = false;
        for (int i = 1;; i++)
        {
            if (i < list1.size() && currentNumber == list1.get(i))
            {
                outFreq++;
            }
            else
            {
                int positionInList2 = Collections.binarySearch(list2, currentNumber);
                if (positionInList2 > -1)
                {
                    list2.set(positionInList2, currentNumber * -1);
                    inFreq++;
                    for (int j = positionInList2 + 1, k = positionInList2 - 1;; j++, k--)
                    {
                        if (j < list2.size() && list2.get(j) == currentNumber)
                        {
                            list2.set(j, currentNumber * -1);
                            inFreq++;
                            flag = true;
                        }
                        if (k > -1 && list2.get(k) == currentNumber)
                        {
                            list2.set(k, currentNumber * -1);
                            inFreq++;
                            flag = true;
                        }
                        if (!flag)
                        {
                            break;
                        }
                        flag = false;
                    }
                }
                if (inFreq > outFreq)
                {
                    System.out.print(currentNumber + " ");
                }
                inFreq = 0;
                outFreq = 1;
                if (i == list1.size())
                {
                    break;
                }
                currentNumber = list1.get(i);

            }
        }
        for(int num: list2)
        {
            if(num>0)
            {
                System.out.print((num)+" ");
            }
        }
    }

    public static void main(String[] args)
    {
        List<Integer> list1, list2;

        try (Scanner scanner = new Scanner(System.in))
        {
            int lengthOfList1 = scanner.nextInt(), lengthOfList2;
            list1 = new ArrayList<>(lengthOfList1);
            for (int i = 0; i < lengthOfList1; i++)
            {
                list1.add(scanner.nextInt());
            }
            lengthOfList2 = scanner.nextInt();
            list2 = new ArrayList<>(lengthOfList2);
            for (int i = 0; i < lengthOfList2; i++)
            {
                list2.add(scanner.nextInt());
            }
            scanner.close();
        }
        printMissingNumbers(list1, list2);
    }
}

