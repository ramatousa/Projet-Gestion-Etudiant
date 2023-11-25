package crud;



import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import ig.Connecteur;
import requetes.Requetes_liste;

import java.sql.*;

public class CRUD_matiere extends JFrame  implements ActionListener{
	Statement st;
	ResultSet rst;
	Connecteur cn=new Connecteur();
	JLabel lb0, lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9;
	JTextField jtf2,jtf3,jtf4,jtf5;
	JButton jb1,jb2,jb3,jb4,jb5,jb7,jb8,jb9;
    JRadioButton rb1,rb2;
    JComboBox jcb,jcb2;
	JTable tb;
	JScrollPane scrl;
	
	
	public CRUD_matiere(){
		this.setTitle("GESTION DES ETUDIANTS");
		this.setSize(1000,650);
		this.setResizable(false);
		this.setLocation(350,30);
	JPanel jp=new JPanel();
	jp.setLayout(null);
	//jp.setBackground(Color.cyan);
	add(jp);
	lb1=new JLabel("Gestion des mati�res");
	lb1.setFont(new Font("Arial",Font.BOLD,20));
	lb1.setForeground(Color.blue);
	lb1.setBounds(70,10,400,30);
	jp.add(lb1);
	
	lb0=new JLabel("MATIERE");
	lb0.setFont(new Font("Arial",Font.BOLD,16));
	lb0.setForeground(Color.black);
	lb0.setBounds(150,50,100,30);
	jp.add(lb0);
	// identifiant matiere
	lb2=new JLabel("Identifiant");
	lb2.setFont(new Font("Arial",Font.BOLD,15));
	lb2.setForeground(Color.blue);
	lb2.setBounds(50,90,100,30);
	jp.add(lb2);
	
	jtf2=new JTextField();
	jtf2.setBounds(130,90,150,30);
	jp.add(jtf2);
	
	
	// appelation
	lb3=new JLabel("Appellation");
	lb3.setFont(new Font("Arial",Font.BOLD,15));
	lb3.setForeground(Color.blue);
	lb3.setBounds(40,130,100,30);
	jp.add(lb3);
	
	jtf3=new JTextField();
	jtf3.setBounds(130,130,150,30);
	jp.add(jtf3);
	
	//filiere
			lb7=new JLabel("Filiere");
			lb7.setFont(new Font("Arial",Font.BOLD,15));
			lb7.setForeground(Color.blue);
			lb7.setBounds(65,170,100,30);
			jp.add(lb7);
			
			jcb=new JComboBox();
			jcb.addItem("GTR");
			jcb.addItem("Ginfos");
			jcb.addItem("Gindus");
			jcb.addItem("GPMC");
			jcb.setBounds(130,170,100,25);
			jp.add(jcb);
	
			//Niveau
			lb8=new JLabel("Niveau");
			lb8.setFont(new Font("Arial",Font.BOLD,15));
			lb8.setForeground(Color.blue);
			lb8.setBounds(65,210,100,30);
			jp.add(lb8);
			
			jcb2=new JComboBox();
			jcb2.addItem("1");
			jcb2.addItem("2");
			jcb2.addItem("3");
			jcb2.setBounds(130,210,100,25);
			jp.add(jcb2);
			//
			lb9=new JLabel("Aller �:");
			lb9.setFont(new Font("Arial",Font.BOLD,18));
			lb9.setForeground(Color.blue);
			lb9.setBounds(30,490,100,30);
			jp.add(lb9);
			
	//les boutons
	  //insertion
	jb1=new JButton("Ajouter");
	jb1.setBounds(130,390,90,30);
	jb1.setForeground(Color.blue);
	//jb1.setBackground(Color.green);
	jb1.addActionListener(this);
	jp.add(jb1);
	//supression
	jb2=new JButton("Suppression");
	jb2.setBounds(240,390,110,30);
	jb2.setForeground(Color.blue);
	//jb2.setBackground(new Color(250,100,0));
	jb2.addActionListener(this);
	jp.add(jb2);
	//modification
	jb3=new JButton("Modifier");
	jb3.setBounds(240,440,120,30);
	jb3.setForeground(Color.blue);
	//jb3.setBackground(Color.orange);
	jb3.addActionListener(this);
	jp.add(jb3);
	//recherche
		jb4=new JButton("Rechercher");
		jb4.setBounds(280,90,100,30);
		jb4.setForeground(Color.white);
		//jb4.setBackground(Color.gray);
		jb4.addActionListener(this);
		jp.add(jb4);
	//actualiser
		jb5=new JButton("Actualiser");
		jb5.setBounds(100,440,120,30);
		jb5.setForeground(Color.blue);
		//jb5.setBackground(Color.green);
		jb5.addActionListener(this);
		jp.add(jb5);
		//
		lb9=new JLabel("Aller �:");
		lb9.setFont(new Font("Arial",Font.BOLD,18));
		lb9.setForeground(Color.blue);
		lb9.setBounds(30,490,100,30);
		jp.add(lb9);
		
		//jbmatiere
				jb7=new JButton("Etudiant");
				jb7.setBounds(100,490,80,30);
				jb7.setForeground(Color.blue);
				//jb7.setBackground(Color.white);
				jb7.addActionListener(this);
				jp.add(jb7);
		//jb note
			jb8=new JButton("Note");
			jb8.setBounds(190,490,80,30);
			jb8.setForeground(Color.blue);
			//jb8.setBackground(Color.white);
			jb8.addActionListener(this);
			jp.add(jb8);
			
			//jb requetes
			jb9=new JButton("Requetes");
			jb9.setBounds(100,540,110,30);
			jb9.setForeground(Color.blue);
			//jb9.setBackground(Color.white);
			jb9.addActionListener(this);
			jp.add(jb9);
		
		
		DefaultTableModel df=new DefaultTableModel();
		init();
		df.addColumn("Identifiant");
		df.addColumn("Appellation");
		df.addColumn("Fili�re");
		df.addColumn("Niveau");
		
		tb.setModel(df);
		jp.add(scrl);
		
		String qry="select * from matiere";
		try{
			st=cn.chrisConnect().createStatement();
			rst=st.executeQuery(qry);
			while(rst.next()){
				df.addRow(new Object[]{
						rst.getString("idmat"),rst.getString("appelation"),
						rst.getString("filiere"),rst.getString("niveau")
						
						
				});
				
			}
		}
		catch(SQLException ex){
			
		}
			
	}
	private void init(){
		tb=new JTable();
		scrl=new JScrollPane();
		scrl.setViewportView(tb);
		scrl.setBounds(400,10,580,530);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUD_matiere mt=new CRUD_matiere();
		mt.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//ajout
		if(e.getSource()==jb1){
			String a,b,c,d;
		a=jtf2.getText();b=jtf3.getText();
		c=jcb.getSelectedItem().toString();
		d=jcb2.getSelectedItem().toString();
			
		String query="insert into matiere values('"+a+"','"+b+"','"+c+"','"+d+"')";
		try{
			st=cn.chrisConnect().createStatement();
			if(JOptionPane.showConfirmDialog(this,"Voulez vous ajoutez?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
				st.executeUpdate(query);
				JOptionPane.showMessageDialog(this,"Insertion reussie!");
			}
			
			
		}
		catch(SQLException ex){
			JOptionPane.showMessageDialog(this,"Echec insertion!",null,JOptionPane.ERROR_MESSAGE);
			
		}
			
		}//
		//suppression
				if(e.getSource()==jb2){
					String a;
					a=jtf2.getText();
				String query="delete from matiere where idmat='"+a+"'";
				try{
					st=cn.chrisConnect().createStatement();
					if(JOptionPane.showConfirmDialog(this,"Voulez vous supprimer?",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
						st.executeUpdate(query);
						JOptionPane.showMessageDialog(this,"Suppression reussie!");
					}
					
					
				}
				catch(SQLException ex){
					JOptionPane.showMessageDialog(this,"Echec suppression!",null,JOptionPane.ERROR_MESSAGE);
					
				}
					
				}//
				//modification
				if(e.getSource()==jb3){
					String a,b,c,d;
					a=jtf2.getText();
					b=jtf3.getText();
					c=jcb.getSelectedItem().toString();
					d=jcb2.getSelectedItem().toString();
				String query="update matiere set appelation='"+b+"',filiere='"+c+"',niveau='"+d+"' where idmat='"+a+"'";
				try{
					st=cn.chrisConnect().createStatement();
					if(JOptionPane.showConfirmDialog(this,"Voulez vous modifiez",null,JOptionPane.OK_CANCEL_OPTION)==JOptionPane.OK_OPTION){
					
						st.executeUpdate(query);
						JOptionPane.showMessageDialog(this,"Modification reuissie!");
					}
				}
				catch(SQLException ex){
					JOptionPane.showMessageDialog(this,"Modification impossible!",null,JOptionPane.ERROR_MESSAGE);
					
				}
					
				}
				//recherche
				if(e.getSource()==jb4){
					String a;
					a=jtf2.getText();
				String query="select * from matiere where idmat='"+a+"'";
				try{
					st=cn.chrisConnect().createStatement();
					rst=st.executeQuery(query);
					if(rst.next()){
						jtf2.setText(rst.getString("idmat"));
						jtf3.setText(rst.getString("appelation"));
						//affichage dans les combos
						jcb.setSelectedItem(rst.getString("filiere"));
						jcb2.setSelectedItem(rst.getString("niveau"));
							
					}
					else
						JOptionPane.showMessageDialog(this, "Introuvable!",null,JOptionPane.ERROR_MESSAGE);
					
					
				}
				catch(SQLException ex){
				
					
				}
					
				}//

				
		if(e.getSource()==jb5){
			this.dispose();
			CRUD_matiere cr=new CRUD_matiere();
			cr.setVisible(true);
			
		}
		
		
		
		if(e.getSource()==jb7){
			this.dispose();
		CRUD_etudiant cr=new CRUD_etudiant();
		cr.setVisible(true);
			
		}
		if(e.getSource()==jb8){
			this.dispose();
		CRUD_note cr=new CRUD_note();
		cr.setVisible(true);
			
		}
		
		if(e.getSource()==jb9){
			this.dispose();
			 Requetes_liste ls=new  Requetes_liste();
			ls.setVisible(true);
			
		}
	}

}

