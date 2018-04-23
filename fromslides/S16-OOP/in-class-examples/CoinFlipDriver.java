
/**
 * Driver to use the coin toss logic class
 *
 * @author     PMCampbell
 * @version    2016-04-25
 */

public class CoinFlipDriver
{
	public static void main (String[] args)
	{
	CoinFlip coin = new CoinFlip();
	CoinFlip penny = new CoinFlip();
	CoinFlip toonie = new CoinFlip();
	CoinFlip loonie = new CoinFlip();

	for (int i=0; i<10000 ; i++) {
		coin.coinToss();
		penny.coinToss();
		loonie.coinToss();
		toonie.coinToss();
	}
	System.out.println("10000 tosses\ncoin ");
	System.out.println("heads "+coin.getHeads());
	System.out.println("tails "+coin.getTails());
	System.out.println("penny ");
	System.out.println("heads "+penny.getHeads());
	System.out.println("tails "+penny.getTails());
	System.out.println("loonie ");
		System.out.println("heads "+loonie.getHeads());
	System.out.println("tails "+loonie.getTails());
	System.out.println("toonie ");
		System.out.println("heads "+toonie.getHeads());
	System.out.println("tails "+toonie.getTails());
	loonie.setCounters();
	for (int i=0; i<100 ; i++) {
			loonie.coinToss();
	}
	System.out.println("loonie ");
		System.out.println("heads "+loonie.getHeads());
	System.out.println("tails "+loonie.getTails());


	} //end main method
} //end CoinFlipDriver class




