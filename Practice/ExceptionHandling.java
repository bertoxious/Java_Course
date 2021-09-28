import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling{

	public static void main(String [] args){
		System.out.println("\n Inside main function ");
		share();
		System.out.println("\n Inside main function ");
	}
	public static void share(){
		System.out.println("\n Starting of share function ");
		try{
			HttpConnect.send(0,"hello","http:/www.goodsnips.com");	
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			System.out.println("\n Connecting to a different server.... ");
		}
		finally{
			System.out.println("\n Inside finally block !");
		}
		System.out.println("\n End of share");
	}
}