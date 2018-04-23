/**
 *  Logic class for coin flip
 *
  * @author     class
  * @version    2016-04-25
 */

 public class CoinFlip {
	 private int countTails, countHeads;
	 private boolean coinState;

     public boolean getState() {
		 return coinState;
	 }
 	public int getHeads() {
 		 return countHeads;
	 }
	 public int getTails() {
	 		 return countTails;
	 }
	 public void setCounters() {
	 	 countTails=0;
	 	 countHeads=0;
	 }
    public boolean coinToss() {
		double toss;
		toss = Math.random();
		if (toss <= 0.4999) {
		    coinState = true;
		    countHeads++;
		}
		else  {
		    coinState = false;
		    countTails++;
	 }
	    return coinState;
	}
} // end CoinFlip class