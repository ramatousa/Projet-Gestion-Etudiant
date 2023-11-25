package requetes;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import crud.CRUD_etudiant;


/*Pour s'authentifier afin d'entrer dans la page de gestion:
 * login: idi
 * mot de passe: idi*/

public class Requetes_liste  extends JFrame implements ActionListener {
	JLabel lab1;
	JButton jb0,jb1,jb2,jb3,jb4,jb5,jb6;
	public Requetes_liste(){
		this.setTitle("GESTION DES ETUDIANTS");
		this.setSize(1000,600);
		this.setResizable(false);
		this.setLocation(350,30);
		JPanel pn=new JPanel();
		pn.setLayout(null);
		//pn.setBackground(Color.cyan);
		add(pn);
		//
		lab1=new JLabel("LISTE DE TOUTES LES REQUETES");
		lab1.setBounds(250,10,430,30);
		lab1.setFont(new Font("Arial",Font.BOLD,25));
		lab1.setBorder(BorderFactory.createLineBorder(Color.black));
		pn.add(lab1);
		//
		//
		jb1=new JButton("Liste des étudiants d'un niveau d'une filière");
		jb1.setBounds(40,80,280,30);
		//jb1.setBackground(Color.white);
		jb1.setForeground(Color.blue);
		jb1.addActionListener(this);
		pn.add(jb1);
		//
		jb2=new JButton("Liste des matières d'un niveau d'une filière");
		jb2.setBounds(40,120,280,30);
		//jb2.setBackground(Color.white);
		jb2.setForeground(Color.blue);
		jb2.addActionListener(this);
		pn.add(jb2);
		//
		jb3=new JButton("Liste des notes des étudiants dans une matière");
		jb3.setBounds(40,160,320,30);
		//jb3.setBackground(Color.white);
		jb3.setForeground(Color.blue);
		jb3.addActionListener(this);
		pn.add(jb3);
		//
		jb4=new JButton("Liste des notes d'un étudiant dans ses matières");
		jb4.setBounds(40,200,320,30);
		//jb4.setBackground(Color.white);
		jb4.setForeground(Color.blue);
		jb4.addActionListener(this);
		pn.add(jb4);
		//
		jb5=new JButton("Liste des moyennes des etudiants dans une matière");
		jb5.setBounds(40,240,340,30);
		//jb5.setBackground(Color.white);
		jb5.setForeground(Color.blue);
		jb5.addActionListener(this);
		pn.add(jb5);
		//
		
	}
	public static void main(String[] args){
		
		Requetes_liste ls=new Requetes_liste();
		ls.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent p) {
		// TODO Auto-generated method stub
		
		//
		if(p.getSource()==jb1){
			List_etd_nv_fl ls=new List_etd_nv_fl();
			ls.setVisible(true);
			
		}
		//
		if(p.getSource()==jb2){
			List_mat_nv_fl ls=new List_mat_nv_fl();
			ls.setVisible(true);
			
		}
		//
		if(p.getSource()==jb3){
			List_notes_mat ls=new List_notes_mat();
			ls.setVisible(true);
			
		}
		//
		if(p.getSource()==jb4){
			List_notes_etd ls=new List_notes_etd();
			ls.setVisible(true);
			
		}
		//
		if(p.getSource()==jb5){
			List_moy_mat ls=new List_moy_mat();
			ls.setVisible(true);
			
		}
		//
		
		
	}

}
