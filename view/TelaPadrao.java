import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.itextpdf.text.Font;

public class TelaPadrao extends JFrame {
    
    public TelaPadrao() {
        setTitle("Basement Parts");
        setLayout(null);
        setResizable(false);
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public void adicionarCampoDeTexto() {
        JTextField textField = new JTextField();
        textField.setBackground(Color.WHITE);
        textField.setForeground(Color.BLACK);
        textField.setFont(new Font(Font.BOLD));
    }

}
