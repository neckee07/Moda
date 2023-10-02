package revija;

public abstract class Nosivo {
	
	protected String ime;
	protected Velicina v;

	public boolean odgovara(Model m) {
		if(this.v == m.dohvVelicinu() || !this.v.manja(m.dohvVelicinu())) {
			return true;
		}
		return false;
	}
	

	
}
