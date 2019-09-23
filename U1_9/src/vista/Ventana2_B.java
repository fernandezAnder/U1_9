package vista;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Font;
import javax.swing.*;

import com.toedter.calendar.JDateChooser;

import controlador.MenuKontroladorea;

public class Ventana2_B extends JFrame {

	private static final long serialVersionUID = 1L;
	//panelan ikusten diren bariableak
	private JTextField noriTxtF, NorkTxtF,tituluaTxtF, edukiaTxtF;
	private JLabel lblData1, lblOrdua2, lblNori, lblNork, lblTitulua, lblEdukia;
	private JComboBox orduaHCB1, orduaMinCB2;
	private JButton btnGorde, btnUtzi;
	private JDateChooser data;
	
	private String[] hilabeteak = {"Urtarrila", "Otsaila", "Martxoa", "Apirila", "Maiatza",
			"Ekaina", "Uztaila", "Abuztua", "Iraila", "Urria", "Azaroa", "Abendua"};
	
	public Ventana2_B() {
		//panelaren propietateak
		setIconImage(Toolkit.getDefaultToolkit().getImage(".\\Argazkiak\\logoa.png")); 
		getContentPane().setLayout(null);
		this.setBounds(300,300,300,300);
		this.setTitle("OHARREN INPRIMAKIA");
		this.setResizable(false); // neurketak ez aldatzeko
		this.setSize(new Dimension(600, 600));
		
		
	//	MenuKontroladorea.hirugarrenLeihoa();
	//	dispose();
		
		//data
		lblData1 = new JLabel("Data:");
		lblData1.setFont(new Font("Dialog", Font.BOLD, 20));
		lblData1.setBounds(26, 36, 55, 17);
		getContentPane().add(lblData1);
		
		data = new JDateChooser();
		
		
		//ordua
	
		
		orduaHCB1 = new JComboBox();
		orduaHCB1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		orduaHCB1.setBounds(103, 80, 42, 20);
		for (int i = 0; i < 24; i++) {
			if (i<10) 
				orduaHCB1.addItem("0"+i);
			else
				orduaHCB1.addItem(i);
		}
		getContentPane().add(orduaHCB1);
		
		lblOrdua2 = new JLabel(":");
		lblOrdua2.setFont(new Font("Dialog", Font.BOLD, 20));
		lblOrdua2.setBounds(155, 80, 15, 17);
		getContentPane().add(lblOrdua2);
		
		orduaMinCB2 = new JComboBox();
		orduaMinCB2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		orduaMinCB2.setBounds(165, 80, 42, 20);
		for (int i = 0; i < 24; i++) {
			if (i<10) 
				orduaMinCB2.addItem("0"+i);
			else
				orduaMinCB2.addItem(i);
		}
		getContentPane().add(orduaMinCB2);
		
		//nori
		lblNori = new JLabel("Nori:");
		lblNori.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNori.setBounds(26, 127, 55, 17);
		getContentPane().add(lblNori);
		
		noriTxtF = new JTextField();
		noriTxtF.setColumns(10);
		noriTxtF.setBounds(76, 129, 242, 20);
		getContentPane().add(noriTxtF);
		
		//nork
		NorkTxtF = new JTextField();
		NorkTxtF.setColumns(10);
		NorkTxtF.setBounds(92, 174, 226, 20);
		getContentPane().add(NorkTxtF);
		
		lblNork = new JLabel("Nork:");
		lblNork.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNork.setBounds(26, 172, 60, 17);
		getContentPane().add(lblNork);
		
		//titulua
		lblTitulua = new JLabel("Titulua:");
		lblTitulua.setFont(new Font("Dialog", Font.BOLD, 20));
		lblTitulua.setBounds(26, 222, 82, 17);
		getContentPane().add(lblTitulua);
		
		tituluaTxtF = new JTextField();
		tituluaTxtF.setColumns(10);
		tituluaTxtF.setBounds(113, 222, 205, 20);
		getContentPane().add(tituluaTxtF);
		
		//edukia
		lblEdukia = new JLabel("Edukia:");
		lblEdukia.setFont(new Font("Dialog", Font.BOLD, 20));
		lblEdukia.setBounds(26, 269, 82, 17);
		getContentPane().add(lblEdukia);
		
		edukiaTxtF = new JTextField();
		edukiaTxtF.setColumns(10);
		edukiaTxtF.setBounds(99, 269, 485, 258);
		getContentPane().add(edukiaTxtF);
		
		//botoiak
		btnGorde = new JButton("Gorde");
		btnGorde.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnGorde.setBounds(406, 538, 87, 23);
		getContentPane().add(btnGorde);

		btnUtzi = new JButton("Utzi");
		btnUtzi.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnUtzi.setBounds(503, 538, 67, 23);
		getContentPane().add(btnUtzi);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(99, 33, 95, 20);
		getContentPane().add(dateChooser);
		
		JLabel lblOrdua = new JLabel("Ordua:");
		lblOrdua.setFont(new Font("Dialog", Font.BOLD, 20));
		lblOrdua.setBounds(26, 80, 79, 17);
		getContentPane().add(lblOrdua);
		
		
	}		
}
