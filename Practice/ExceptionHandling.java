import java.io.FileNotFoundException;

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
		
		System.out.println("\n End of share");
	}
}