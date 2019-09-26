package controlador;



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


//	public void actionPerformed(ActionEvent e) {
//		String komandoa= e.getActionCommand();
//		switch (komandoa) {
//			case "KARGATU":
//				OharrakKudeatu.kargatuOharrakFitxategitik();
//				break;
//			case "GEHITU":
//				new OharrenInprimakia();
//				OharrakKudeatu.gehituOharra();
//				break;
//			case "Gorde":
//				OharrakKudeatu.gordeOharrakFitxategian();
//				break;
//			case "INPRIMATU":
//				new Inprimatu(OharrakKudeatu.imprimatuOharrak());
//				break;	
//			default: 
//				
//		}
}
