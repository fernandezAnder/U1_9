package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class OharrakKudeatu {
	ArrayList<Oharra> lista_oharrak;
public static ArrayList<Oharra> irakurriOharrak() throws FileNotFoundException {
		
	//BARIABLEAK
		ArrayList<Oharra> lista_oharrak = new ArrayList<Oharra>();
		FileReader fitxeroa = new FileReader("src/Oharrak.txt");
		BufferedReader br = new BufferedReader(fitxeroa);
		int kont = 1;
		
		//OHARRAREN BARIABLEAK
		String data="";
		String ordua="";
		String nori="";
		String nork="";
		String titulua="";
		String edukia="";
		boolean oharra_bete=false;
		String[] cadena;
		try {
			String linea;
			while ((linea = br.readLine()) != null) {
				// lerro zuriak ez irakurtzeko
				if (!linea.equals("")) {
					//while(!linea.isEmpty()) {
						cadena= linea.split(":");
						if (cadena[0].equals("data")) {
							data=cadena[1];
						}else if(cadena[0].equals("ordua")) {
							ordua=cadena[1]+":"+cadena[2];
						}else if(cadena[0].equals("nori")) {
							nori=cadena[1];
						}else if(cadena[0].equals("nork")) {
							nork=cadena[1];
						}else if(cadena[0].equals("titulua")) {
							titulua=cadena[1];
						}else if(cadena[0].equals("edukia")) {
							edukia=cadena[1];
							oharra_bete=true;
						}
					//}
					
					//System.out.println(kont + " " + linea);
					kont++;
				} else {
					//System.out.println(linea);
				}
				if (oharra_bete) {
					Oharra oharra= new Oharra(data, ordua, nori, nork, titulua, edukia);
					System.out.println(oharra);
					lista_oharrak.add(oharra);
					oharra_bete=false;
				}
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lista_oharrak;
}



}
