package AbstractFactory;

public class Boss implements Vaatteet {
	
	public Lippis createLippis() {
		Lippis lippis = factory.makeLippis();
		
	}
}
