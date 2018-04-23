


public class CoinToss
{
private int coinStatus,
	countHeads,countTails;

public int toss()  {
	coinStatus = (int)(Math.random()
			*2 + 0);
	if (coinStatus == 0 )
			countHeads++;
	else
		countTails++;
    return coinStatus;
}
// mutators (aka setters)
public void setCounters() {
	countTails=0;
	countHeads=0;
}
// accessors (aka getters)
public int getResult() {
	return coinStatus;
}
public int getHeads() {
	return countHeads;
}
public int getTails() {
	return countTails;
}

} // end CoinTossDriver class