package AbstractFactory;

public abstract class JasperinVaatetus {
	Vaatteet vaatteet = null;
	 
	public abstract Vaatteet createAdidas();
	public abstract Vaatteet createBoss();
	
	public void esitteleVaatteita() {
		esittaydy();
		esitteleAdidas();
		System.out.println("Valmistuin Insinööriksi!");
		esitteleBoss();
	}
	
	public void esittaydy() {
		System.out.println("Nimeni on Jasper!");
	}
	
	public void esitteleAdidas() {
		if(vaatteet == null)
			vaatteet = createAdidas();
		System.out.println("Vaatetukseeni kuuluu " + vaatteet);
		vaatteet = null;
	}
	
	public void esitteleBoss() {
		if(vaatteet == null)
			vaatteet = createBoss();
		System.out.println("Vaatetukseeni kuuluu " + vaatteet);
		vaatteet = null;
	}
	
}
