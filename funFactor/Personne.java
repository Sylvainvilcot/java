public abstract class Personne{

	protected int funFactor;

	public Personne(int funFactor){
		this.funFactor = funFactor;
	}

	public int max(int a, int b)
	{
		if(a > b){
			return a;
		}
		else{
			return b;
		}
	}

	public abstract int bestParty();

	public abstract int bestPartySans();

	public abstract int bestPartyAvec();
}