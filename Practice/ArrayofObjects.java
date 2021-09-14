public class ArrayofObjects{

	class Characters{
		static String name;

		Characters(String name){
			this.name = name;
		}
	}

	public static void main(String [] args){
		Characters[] sapling = new Characters[3];

		Characters naruto = new Characters("Naruto Uzumaki");
		Characters sasuke = new Characters("Sasuke Uchiha");
		Characters sakura = new Characters("Sakura Haruno");

		sapling[0] = naruto;
		sapling[1] = sasuke;
		sapling[2] = sakura;
	}
}