public class Sb{

	public static void main(String [] args){

		StringBuilder sb = new StringBuilder();

		sb.append("Uzumaki");
		sb.append(" Naruto");
		System.out.println(sb);
		sb.append(" Retro").append(" Crush");
		System.out.println(sb.toString());
		System.out.println("Length of the string is :: " + sb.length());

		// delete
		sb.delete(1,5);
		System.out.println(sb);
		System.out.println("Deletion performed");

		// length
		System.out.println("Length of the string is :: " + sb.length());

		// Insertion
		sb.insert(1,"Uchiha");
		System.out.println("Insertion Performed");
		System.out.println(sb.toString());
	}
}