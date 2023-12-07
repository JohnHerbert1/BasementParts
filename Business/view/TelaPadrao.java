package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class TelaPadrao extends JFrame {
    
    public TelaPadrao() {
        setTitle("Basement Parts");
        setLayout(null);
        setResizable(false);
        setSize(900, 800);
        setBackground(Color.BLUE);
        addLookAndFeel();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    protected void adicionarTituloTela(String titulo) {
    	JLabel lblTitulo = new JLabel(titulo);
    	lblTitulo.setBounds(320, 0, 250, 110);
		lblTitulo.setFont(new Font("Arial", Font.BOLD, 20));
		add(lblTitulo);
    }
    
    public void addLookAndFeel() {
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
}
