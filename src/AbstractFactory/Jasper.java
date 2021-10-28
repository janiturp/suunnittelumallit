package AbstractFactory;

public class Jasper extends JasperinVaatetus{
	
	public Vaatteet createAdidas() {
		return new Adidas();
	}
	
	public Vaatteet createBoss() {
		return new Boss();
	}
}
