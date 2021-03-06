
public interface Currency {
	double dollarvalue();
	public static double convert(Currency source, Currency target, double amount)
	{
		double rate = target.dollarvalue()/ source.dollarvalue() ;
		return rate*amount;
	}
     static Currency INR = ()-> 72.50;
     static Currency USD = ()-> 1.0;
     static Currency AED = ()->3.50;
}
 

  class CurrencyDemo{
	public static void main(String[] args) {
		System.out.println(Currency.convert(Currency.USD,Currency.INR, 100));
	}
}
