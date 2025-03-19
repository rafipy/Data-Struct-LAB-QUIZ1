import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class FoodQueue {

    Queue<String> q = new LinkedList<String>();
    PriorityQueue<String> pq = new PriorityQueue<>();

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

    public boolean search(String search){

        if (pq.isEmpty() && q.isEmpty()) {
            return false;
        }

        else if (!pq.isEmpty()){
            for(String s: pq){
                if(s.equals(search)){
                    return true;
                }
            }
            return false;
        }

        else {
            for(String s: q){
                if(s.equals(search)){
                    return true;
                }
            }
            return false;
        }

    }

}
