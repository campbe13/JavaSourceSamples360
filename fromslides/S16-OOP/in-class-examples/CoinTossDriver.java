
/**
 * Uses the coin toss class
 *
 * @author     PMCampbell
 * @version    2016-04-25
 */

public class CoinTossDriver
{
	public static void main (String[] args)
	{
	int tossValue, countTails=0,
	   countHeads=0;
	CoinToss coin = new CoinToss();

	for (int i = 0; i < 20; i++) {
		tossValue = coin.toss();
	}
	System.out.println("20 coin tosses\n"+
	 	"heads " +coin.getHeads() +
	 	"\ntails " +coin.getTails());
	coin.setCounters();
	for (int i = 0; i < 100; i++) {
		tossValue = coin.toss();
	}
	System.out.println("100 coin tosses\n"+
	 	"heads " +coin.getHeads() +
	 	"\ntails " +coin.getTails());

	CoinToss penny = new CoinToss();

	for (int i = 0; i < 1000; i++) {
		tossValue = penny.toss();
	}
	System.out.println("1000 penny tosses\n"+
	 	"heads " +penny.getHeads() +
	 	"\ntails " +penny.getTails());
	} //end main method
} //end CoinTossDriver class




