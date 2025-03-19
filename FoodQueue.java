import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class FoodQueue {

    Queue<String> q = new LinkedList<String>();
    Queue<String> pq = new PriorityQueue<>();

    public void addRegular(String food) {
        try {
            q.add(food);
        }
        catch (Exception e) {
            System.out.println("Whoopsies, something went wrong: " + e);
        }
    }

    public void addPriority(String food) {
        try {
            pq.add(food);
        }
        catch (Exception e) {
            System.out.println("Whoopsies, something went wrong: " + e);
        }
    }

    public boolean takeOrder() {
        if (!pq.isEmpty()) {
            pq.remove();
            return true;
        } else if (!q.isEmpty()) {
            q.remove();
            return true;
        } else {
            return false;
        }
    }



    public void display() {
        System.out.println("Priority:");
        System.out.println(pq);
        System.out.println();

        System.out.println("Regular:");
        System.out.println(q);
    }

    public void cancel(String search) {
        if (!pq.isEmpty() && recurseSearch(search, pq)){
            pq.remove(search);
            System.out.println(search + " removed.");
        }

        else if (!q.isEmpty() && recurseSearch(search, q)){
            q.remove(search);
            System.out.println(search + " removed.");
        }

        else {
            System.out.println("Not there budster.");
        }
    }

    public boolean recurseSearch(String search, Queue<String> queue) {

        if (queue.isEmpty()) {
            return false;
        }

        else if (search.equals(queue.peek())) {
            return true;
        }

        queue.remove();
        recurseSearch(search, queue);
        return false;

    }

}
