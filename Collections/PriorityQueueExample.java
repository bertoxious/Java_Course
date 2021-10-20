import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueExample{

	public static void main(String args []){

		PriorityQueue <String> pq = new PriorityQueue<>(Comparator.reverseOrder());
		pq.offer("Amazon");
		pq.offer("Google");
		pq.offer("Microsoft");
		pq.offer("Netflix");
		pq.offer("Facebook");

		System.out.println(pq);
	}
}