import java.util.*;

public class JavaCollection
{
    public static void main(String[] args)
    {
        Deque<Integer> queue = new LinkedList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        try
        {
            int intNumber = 9;
            queue.add(6);
            queue.add(2);
            queue.add(6);
            queue.add(8);
            queue.add(3);
            queue.add(7);
            queue.add(1);
            queue.add(4);
            queue.add(4);

            set.addAll(queue);
            List<Integer> list = Arrays.asList(6,2,6,8,3,7,1,4,4);

            int n = 3;
            for (int i = 0; i <= list.size()-n; i++)
            {
                System.out.println(list.subList(i,i + n));
            }

            System.out.println("intnum = "+intNumber);
            System.out.println("queue = "+list);
            System.out.println("Output:\n"+set.size());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
