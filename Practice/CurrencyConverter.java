public class CurrencyConverter{

	double exchange_rates[] = {13.4324,41234.234,1234.2314};
	void printCurrencies(){
		System.out.println(exchange_rates[0]);
		System.out.println(exchange_rates[1]);
		System.out.println(exchange_rates[2]);
	}
	public static void main(String [] args){

		CurrencyConverter cc = new CurrencyConverter();
		cc.printCurrencies();

	}
}