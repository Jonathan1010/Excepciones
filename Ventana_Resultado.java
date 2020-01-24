package ventana_ejemplo;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana_Resultado extends JFrame {

    JPanel pr = new JPanel();
    JLabel lr = new JLabel("Texto");
    JButton br = new JButton("Texto");

    public Ventana_Resultado() {
        setLocationRelativeTo(null);
        setSize(300, 200);
        setTitle("Ventana Resultado");
        setLocation(400, 200);
        setLocationRelativeTo(null);
        dispose();
        agregarComponentes();
        setVisible(true);
    }

    public void agregarComponentes() {
        getContentPane().add(pr);
        pr.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10);
        pr.add(lr, g);
        g.gridy = 1;
        //  pr.add(tr,g);

        g.gridy = 2;
        pr.add(br, g);

        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (br.getText() == "Terminar") {
                    System.exit(0);
                } else {
                    dispose();
                }
            }
        });

    }

}
