import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class prueba {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulario");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        JPanel panel = new JPanel();
        
        JButton enviarBtn = new JButton("Enviar");
        JButton limpiarBtn = new JButton("Limpiar");
        
        panel.add(enviarBtn);
        panel.add(limpiarBtn);
        
        limpiarBtn.addActionListener(e -> {
            // Aquí irá la lógica para limpiar
        });
        
        enviarBtn.addActionListener(e -> {
            // Aquí irá la lógica para enviar
        });
        
        frame.add(panel);
        frame.setVisible(true);
    }
}
