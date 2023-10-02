package revija;

import revija.Velicina.Oznaka;

public class Model {

	private static int sledeciID = 0;
	private int id = sledeciID++;
	private Velicina v;
	
	public Model(Velicina v) {
		super();
		this.v = v;
	}

	public Velicina dohvVelicinu() {
		
		return v;
	}

	public int dohvId() {
		
		return id;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Model ").append(id).append(" (").append(v).append(")");
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Velicina mala = new Velicina(Oznaka.S);
		Model m1 = new Model(mala);
		Model m2 = new Model(mala);
		
		System.out.println(m1.dohvId());
		System.out.println(m2.dohvId());
		System.out.println(m1);
		System.out.println(m2);
	}
	
}
