package controlador;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import vista.*;

public class MenuKontroladorea {
	public static void menua() {
		Ventana1 Leiho1 = new Ventana1();
		Leiho1.setVisible(true);
	}

	public static void oharrenInprimakia() {
		Ventana2_B Leiho2 = new Ventana2_B();
		Leiho2.setVisible(true);
	}

	public static void inprimatu() {
		Ventana2_A Leiho3 = new Ventana2_A();
		Leiho3.setVisible(true);
	}

	public static void irakurriOharrak() throws FileNotFoundException {
		FileReader fitxeroa = new FileReader("src/Oharrak.txt");
		BufferedReader br = new BufferedReader(fitxeroa);
		int kont = 1;
		try {
			String linea;
			while ((linea = br.readLine()) != null) {
				// lerro zuriak ez irakurtzeko
				if (!linea.equals("")) {
					System.out.println(kont + " " + linea);
					kont++;
				} else {
					System.out.println(linea);
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
