package FactoryMethod;

public abstract class AterioivaOtus {

    Juoma juoma = null;

    public abstract Juoma createJuoma();
    // Toivottavasti tajusin oikean idean.
    public abstract Juoma createMaito();
    public abstract Juoma createPiima();


    public void aterioi(){
        syö();
        juo();
        
        syö();
        juoMaito();
        
        syö();
        juoPiima();
    }

    public void syö(){
        System.out.println("Kylläpä ruoka maistuukin hyvältä");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
        juoma = null;
    }
    
    public void juoMaito() {
    	if(juoma == null)
    		juoma = createMaito();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
        juoma = null;
    }
    
    public void juoPiima() {
    	if(juoma == null)
    		juoma = createPiima();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}
