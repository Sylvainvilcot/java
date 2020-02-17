import java.util.*;


public class Chef extends Personne{

	ArrayList<Personne> liste;
	private int funFactor;
	Iterator<Personne> iterator;
	int count;
	public Chef(int funFactor){
		super(funFactor);
		this.liste = new ArrayList<Personne>();
		this.iterator = this.liste.iterator();
	}

	public void addSubalterne(Personne p){
		this.liste.add(p);
	}

	public int bestParty(){
		return max(bestPartyAvec(), bestPartySans());
	}

	public int bestPartySans(){
		count = 0;
		this.iterator = liste.iterator();
		while (iterator.hasNext()){
			count += iterator.next().bestParty();
		}
		return count;
	}

	public int bestPartyAvec(){
		count = 0;
		this.iterator = liste.iterator();
		while (iterator.hasNext()){
			count += iterator.next().bestPartySans();
		}
		count += funFactor;
		return count;
	}
}