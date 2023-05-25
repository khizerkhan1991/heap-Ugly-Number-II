import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("out put " + nthUglyNumber(1407));
    }


     static int nthUglyNumber(int n) {

         PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
         Set<Integer> uniqueValue = new HashSet<>();
         PriorityQueue<Integer> queue = new PriorityQueue<>();
         queue.add(1);
         queue.add(2);
         queue.add(3);
         queue.add(5);
         pq.add(1);



         int i=0;
         while (i <= n){

             i ++;
             int number = queue.poll();
             int twoTable = 2 *number;
             int threeTable = 3 *number;
             int fiveTable = 5 *number;

             if(!uniqueValue.contains(twoTable)){
                 pq.add(twoTable);
                 queue.add(twoTable);
                 uniqueValue.add(twoTable);
             }
             if(!uniqueValue.contains(threeTable)){
                 pq.add(threeTable);
                 queue.add(threeTable);
                 uniqueValue.add(threeTable);
             }
             if(!uniqueValue.contains(fiveTable)){
                 pq.add(fiveTable);
                 queue.add(fiveTable);
                 uniqueValue.add(fiveTable);
             }
         }

         while (pq.size() > n)
             pq.poll();

        return pq.poll();
    }

}