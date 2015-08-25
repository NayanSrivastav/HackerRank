import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nayan
 */
public class Pairs
{
    /**
     * function first sorts the list and then checks if there are one or more number in the list with value of picked number plus given difference.
     * @param list
     * @param period
     * @return the total pairs with given difference
     */
    private static int countPairs(List<Integer> list, int period)
    {
        Collections.sort(list);
        int lCount = 0, totalCount = 0;
        boolean flag = false;
        for (int i = 0; i < list.size(); i++)
        {
            int position = Collections.binarySearch(list, list.get(i) + period);
            if (position > -1)
            {
                lCount = 1;
                for (int j = position + 1, k = position - 1; j > list.size() && k > 0; j++, k--)
                {
                    if (list.get(j).equals(list.get(i)))
                    {
                        lCount++;
                        flag = true;
                    }
                    if (list.get(k).equals(list.get(i)))
                    {
                        lCount++;
                        flag = true;
                    }
                    if (!flag)
                    {
                        break;
                    }
                }
            }
            totalCount += lCount;
            lCount = 0;
        }
        return totalCount;
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        /**
         * period is the desired difference between two numbers
         */
        int len = scanner.nextInt(), period = scanner.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < len; i++)
        {
            list.add(scanner.nextInt());
        }
        System.out.println(countPairs(list, period));
    }
}

