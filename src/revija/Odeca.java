package revija;

import revija.Velicina.Oznaka;

public class Odeca extends Nosivo {
	
	

	public Odeca(String string, Velicina velicina) {
		this.ime = string;
		this.v = velicina;
	}

	public Velicina dohvVelicinu() {
		
		return v;
	}

	public String dohvNaziv() {
		
		return ime;
	}

	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("odeća ").append(ime).append(" ").append(v);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Velicina mala = new Velicina(Oznaka.L);
		Odeca o = new Odeca("Pantalone", mala);
		Nosivo n = new Odeca("Majica", mala);
		
		System.out.println(o);
		System.out.println(n);
	}
	
}
