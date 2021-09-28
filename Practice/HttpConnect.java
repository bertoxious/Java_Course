import java.io.FileNotFoundException;

public class HttpConnect{
	public static void send(int destination, String data, String partner) throws FileNotFoundException{
		System.out.println("\n Inside send function");

		if (destination == 0){
			throw new FileNotFoundException();
		}

		System.out.println("\n Send function ended ");
	}
}