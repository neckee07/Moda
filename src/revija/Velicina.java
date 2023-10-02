package revija;

public class Velicina {
	
	public enum Oznaka{S,M,L};
	
	private Oznaka ozn;
	
	public Velicina(Oznaka o) {
		super();
		this.ozn = o;
	}
	
	
	public Oznaka dohvOznaku() {
		return ozn;
	}
	
	public boolean manja(Velicina v) {
		if(this.ozn == Oznaka.L) {
			
				return false;
		}
		if(this.ozn == Oznaka.M) {
			if(v.ozn == Oznaka.L ) {
				return true;
			}else
				return false;	
			}
		if(this.ozn == Oznaka.S) {
			if(v.ozn == Oznaka.S) 
				return false;
			else
				return true;
		}
		return false;
		}
		
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ozn);
		return sb.toString();
	}
		
		
}


