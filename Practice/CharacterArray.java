public class CharacterArray{

	public static void main(String [] args){


		char [] cArray = {'K','O','E','N','I','S','E','G','G',' ','A','G','E','R','A'};
		String t = new String(cArray);
		System.out.println(t);

		// String Methods

		String s = "amaterasu";
		String s1 = "Amaterasu";

		System.out.println(s.length());
		System.out.println(s.isEmpty());
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s1));
		System.out.println(s.compareTo(s1));

		char c = 'A';
		int d = 5;
		System.out.println(c+d);
	}
}