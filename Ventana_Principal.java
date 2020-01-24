package ventana_ejemplo;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana_Principal extends JFrame {

    JPanel p = new JPanel();
    JLabel l = new JLabel("Escoge lo que quieres adivinar");
    JButton b = new JButton("Chequear");
    JTextField t = new JTextField(15);
    Ventana_Resultado v;
    JComboBox cb;

    public Ventana_Principal() {
        super("Ventana Principal");
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        agregarComponente();
        pack();
    }

    public void agregarComponente() {
        getContentPane().add(p);
        //creo el grid bag layout y creo un objeto del mismo
        p.setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();
        g.gridx = 0;
        g.gridy = 0;
        g.insets = new Insets(10, 10, 10, 10);
        p.add(l, g);
        g.gridy = 1;
        p.add(t, g);
        Vector v = new Vector(5);
        v.addElement("Numero de la semana");
        v.addElement("Dia del año");
        cb = new JComboBox(v);
        g.gridx = 1;
        p.add(cb, g);
        g.gridy = 2;
        p.add(b, g);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                //para llamar a la otra ventana se tuvo que crear otro objeto pero con el nombre de la otra clase en este caso venta    na resultado
                // Ventana_Resultado vr = new Ventana_Resultado();
                //is empiti sirve para saver si esta vacia o no 
                if (!t.getText().isEmpty()) {
                    chequear();
                } else {
                    JOptionPane.showMessageDialog(null, "Inserte texto para empezar a jugar");
                }
            }
        });
    }


    public void chequear() {

        switch (cb.getSelectedIndex()) {
            case 0:
                try {
                    int tex = Integer.parseInt(t.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.WEEK_OF_YEAR);

                    if (tex == ca) {
                        v = new Ventana_Resultado();
                        v.lr.setText("Correcto");
                        v.lr.setForeground(Color.GREEN);
                        v.br.setText("Terminar");
                    } else {
                        v = new Ventana_Resultado();
                        v.lr.setText("incorrecto");
                        v.lr.setForeground(Color.RED);
                        v.br.setText("Trata de terminar el juego");

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;

            case 1:
                try {
                    int tex = Integer.parseInt(t.getText());
                    Calendar cl = Calendar.getInstance();
                    int cal = cl.get(Calendar.DAY_OF_YEAR);

                    if (tex == cal) {
                        v = new Ventana_Resultado();
                        v.lr.setText("Correcto");
                        v.lr.setForeground(Color.GREEN);
                        v.br.setText("Terminar");
                    } else {
                        v = new Ventana_Resultado();
                        v.lr.setText("incorrecto");
                        v.lr.setForeground(Color.RED);
                        v.br.setText("Trata de terminar el juego");

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;

            case 2:
                try {
                    int tex = Integer.parseInt(t.getText());
                    Calendar po = Calendar.getInstance();
                    int cap = po.get(Calendar.DAY_OF_YEAR);

                    if (tex == cap) {
                        v = new Ventana_Resultado();
                        v.lr.setText("Correcto");
                        v.lr.setForeground(Color.GREEN);
                        v.br.setText("Terminar");
                    } else {
                        v = new Ventana_Resultado();
                        v.lr.setText("incorrecto");
                        v.lr.setForeground(Color.RED);
                        v.br.setText("Trata de terminar el juego");

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }
                break;

            case 3:
                try {
                    int tex = Integer.parseInt(t.getText());
                    Calendar co = Calendar.getInstance();
                    int pv = co.get(Calendar.DAY_OF_YEAR);

                    if (tex == pv) {
                        v = new Ventana_Resultado();
                        v.lr.setText("Correcto");
                        v.lr.setForeground(Color.GREEN);
                        v.br.setText("Terminar");
                    } else {
                        v = new Ventana_Resultado();
                        v.lr.setText("incorrecto");
                        v.lr.setForeground(Color.RED);
                        v.br.setText("Trata de terminar el juego");

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }

                try {
                    int tex = Integer.parseInt(t.getText());
                    Calendar c = Calendar.getInstance();
                    int ca = c.get(Calendar.WEEK_OF_YEAR);

                    if (tex == ca) {
                        v = new Ventana_Resultado();
                        v.lr.setText("Correcto");
                        v.lr.setForeground(Color.GREEN);
                        v.br.setText("Terminar");
                    } else {
                        v = new Ventana_Resultado();
                        v.lr.setText("incorrecto");
                        v.lr.setForeground(Color.RED);
                        v.br.setText("Trata de terminar el juego");

                    }

                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Por favor ingrese numeros enteros para jugar");
                }

        }

    }

}
