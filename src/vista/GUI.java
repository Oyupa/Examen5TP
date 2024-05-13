package vista;

import modelo.ColeccionMediosDigitales;
import modelo.MedioDigital;
import utils.FileManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private ColeccionMediosDigitales coleccionMediosDigitales;
    private JLabel textoInicial;
    private JButton revistaButton;
    private JButton periodicoButton;
    private JButton libroButton;
    private JPanel panel1;
    private JTextArea textArea1;

    public GUI() {
        this.coleccionMediosDigitales = new ColeccionMediosDigitales();
        this.coleccionMediosDigitales = FileManager.leerMediosDigitales();

        this.libroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (MedioDigital medioDigital : coleccionMediosDigitales.getMediosDigitales()) {
                    if (medioDigital instanceof modelo.Libro) {
                        sb.append(medioDigital.toString()).append("\n");
                    }
                }
                textArea1.setText(sb.toString());
            }
        });
        this.periodicoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (MedioDigital medioDigital : coleccionMediosDigitales.getMediosDigitales()) {
                    if (medioDigital instanceof modelo.Periodico) {
                        sb.append(medioDigital.toString()).append("\n");
                    }
                }
                textArea1.setText(sb.toString());
            }
        });
        this.revistaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder sb = new StringBuilder();
                for (MedioDigital medioDigital : coleccionMediosDigitales.getMediosDigitales()) {
                    if (medioDigital instanceof modelo.Revista) {
                        sb.append(medioDigital.toString()).append("\n");
                    }
                }
                textArea1.setText(sb.toString());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(new GUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
