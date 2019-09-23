package modelo;

import java.util.ArrayList;

public class Oharra {
	private String data, ordua, nori,nork, titulua, edukia;
	
	//konstruktorea
	public Oharra(String data, String ordua, String nori, String nork, String titulua,
			String edukia) {
		this.data = data;
		this.ordua = ordua;
		this.nori = nori;
		this.nork = nork;
		this.titulua = titulua;
		this.edukia = edukia;
	}
	
	@Override
	public String toString() {
		return "Ohar data=" + data + ", ordua=" + ordua + ", nori=" + nori + ", nork="
				+ nork + ", titulua=" + titulua + ", edukia=" + edukia + "]";
	}

}
