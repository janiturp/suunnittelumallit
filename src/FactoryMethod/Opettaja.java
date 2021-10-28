package FactoryMethod;

public class Opettaja extends AterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };
    
    public Juoma createMaito() {
    	return new Maito();
    };
    
    public Juoma createPiima() {
    	return new Piima();
    };

}
