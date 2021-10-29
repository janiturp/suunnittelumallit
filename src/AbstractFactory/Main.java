package AbstractFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Main {

	public static void main(String[] args) {
		
		/*
		Class c = null;
		Vaatteet tehdas = null;
		
		Properties properties = new Properties();
		
		try {
			properties.load(new FileInputStream("tehdas.properties"));
			
		} catch (IOException e) {e.printStackTrace();}
		
		try {
			c = Class.forName(properties.getProperty("tehdas"));
			tehdas = (Vaatteet)c.getDeclaredConstructor().newInstance()
					
		} catch(Exception e) {e.printStackTrace();}
		
		Vaatteet adidas = tehdas.createAdidas();
		Vaatteet boss = tehdas.createBoss();
		jasper.esitteleVaatteita();
		*/
		
		/* Ilman reflektiota main
		*/
		
		JasperinVaatetus jasper = new Jasper();
		jasper.esitteleVaatteita();
		
	}

}
