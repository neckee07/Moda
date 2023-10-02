package revija;

import revija.Velicina.Oznaka;

public class Kombinacija {

	private Nosivo[] niz;
	private int vrh = 0;
	
	public Kombinacija(int n) {
		this.niz = new Nosivo[n];
	}
	
	public void dodaj(Nosivo n) throws GDodavanje{
		if(vrh == niz.length) {
			throw new GDodavanje("niz je pun");
		}
		niz[vrh++]=n;
	}

	public int dohvBrStvari() {
		
		return vrh;
	}

	public int dohvMaxBrStvari() {
		
		return niz.length;
	}

	public Nosivo dohvStvar(int i) throws GIndeks{
		if(i <0 || i >= niz.length || i>= vrh) {
			throw new GIndeks("nije u opsegu");
		}
		return niz[i];
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i = 0; i<vrh;i++) {
			sb.append(niz[i]);
			if(i != vrh-1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
	
	
	public static void main(String[] args) {
		Kombinacija k = new Kombinacija(2);
		Velicina mala = new Velicina(Oznaka.S);
		Nosivo n1 = new Odeca("Pantole", mala);
		Odeca n2 = new Odeca("Majica", mala);
		try {
			k.dodaj(n1);
			k.dodaj(n2);
		} catch (GDodavanje e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		System.out.println(k);
		
	}
	
}
