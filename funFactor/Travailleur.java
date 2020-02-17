public class Travailleur extends Personne{
	public Travailleur(int funFactor){
		super(funFactor);
	}

	public int bestParty(){
		return max(bestPartyAvec(), bestPartySans());
	}

	public int bestPartyAvec(){
		return this.funFactor;
	}

	public int bestPartySans(){
		return 0;
	}
}