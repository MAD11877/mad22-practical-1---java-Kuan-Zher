import java.util.*;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    List<Integer> numList = new ArrayList<Integer>();
    Scanner in = new Scanner(System.in);
    //System.out.print("Enter number: ");
    int num = in.nextInt();
    for (int i = 0; i < num; i++)
    {
    //System.out.print("Enter integer: ");
    int numbers = in.nextInt();
    numList.add(numbers);
    }
    int highest = 0;
    int count = 0;
    for (int i : numList)
    {
      if (Collections.frequency(numList, i) > count)
      {
        highest = i;
        count = Collections.frequency(numList, i);
      }
    }
    System.out.println(highest);
  }
}
