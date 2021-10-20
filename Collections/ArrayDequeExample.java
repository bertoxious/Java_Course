import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeExample{

	public static void main(String [] args){
		ArrayDeque <Integer> ad = new ArrayDeque<>();

		ad.offer(23);
		ad.offer(33);
		ad.offer(43);
		ad.offer(53);
		ad.offer(63);

		

		System.out.println(ad.peek());
		System.out.println(ad);

		System.out.println(ad.peekLast());

		System.out.println(ad.poll());
		System.out.println("After polling :: ");
		System.out.println(ad);
		System.out.println("Polling first :: ");
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println("Polling Last :: ");
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}
}