package Puerto;

import javax.swing.*;
import java.awt.event.*;

public class Interfaz extends JFrame {
    private JPanel panelPrincipal;
    private JTextField TextoID;
    private JTextField TextoPeso;
    private JButton BCrear;
    private JButton BMostrar;
    private JTextField TextoEmisor;
    private JTextField TextoDesc;
    private JTextField TextoReceptor;
    private JCheckBox Aduana;
    private JLabel TIdentificador;
    private JLabel TPeso;
    private JLabel TPais;
    private JLabel TPrioridad;
    private JLabel TDescripcion;
    private JLabel TNomEmisor;
    private JLabel TNomReceptor;
    private JLabel TAduana;
    private JTextField TextoMostrar;
    private JTextField TextoPrio;
    private JLabel Hub;
    private JComboBox ComboPais;
    private JComboBox ComboHub;
    private JRadioButton RB1;
    private JRadioButton RB2;
    private JRadioButton RB3;
    private JTextArea TArea;
    private JTextField TID;
    private JButton BDesapilar;
    private JButton BApilar;
    private JTextField TextoDesapi;
    private JLabel TOperaciones;
    private JButton BContar;
    private JComboBox ComboContar;

    // Atributos Contenedor
    int id, peso, prio;
    String pais, emi, recep, descr;
    boolean inspeccion;
    Hub hub = new Hub();
    Contenedor contenedor;

    // Atributos
    int col, identificador, nPuerto;
    String paisContar;

    public Interfaz() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Puerto");
        this.setSize(800, 600);
        setVisible(true);
        this.add(panelPrincipal);

        /** Textos */
        TextoID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                id = Integer.parseInt(TextoID.getText());
            }
        });
        TextoPeso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                peso = Integer.parseInt(TextoPeso.getText());
            }
        });
        TextoEmisor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                emi = TextoEmisor.getText();
            }
        });
        TextoReceptor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                recep = TextoReceptor.getText();
            }
        });
        TextoDesc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                descr = TextoDesc.getText();
            }
        });
        TID.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                identificador = Integer.parseInt(TID.getText());
            }
        });
        TextoDesapi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                col = Integer.parseInt(TextoDesapi.getText());
            }
        });

        /** Check Box */
        Aduana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Aduana.isSelected()) {
                    inspeccion = true;
                } else inspeccion = false;
            }
        });

        /** Radio Buttons */
        RB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB1.isSelected()) {
                    RB2.setSelected(false);
                    RB3.setSelected(false);
                }
            }
        });
        RB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB2.isSelected()) {
                    RB1.setSelected(false);
                    RB3.setSelected(false);
                }
            }
        });
        RB3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB3.isSelected()) {
                    RB1.setSelected(false);
                    RB2.setSelected(false);
                }
            }
        });

        /** Buttons */
        BCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor = new Contenedor(id, peso, prio, inspeccion, pais, descr, recep, emi);

            }
        });

        BMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hub.contenedor(identificador);
            }
        });
        BApilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hub.apilar(contenedor);

            }
        });
        BDesapilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hub.desapilar(col);
            }
        });
        BContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hub.npais(paisContar);
            }
        });

        /** ComboBox */
        ComboPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paisContar = ComboPais.getSelectedItem().toString();
            }
        });
        ComboHub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nPuerto = Integer.parseInt(ComboHub.getSelectedItem().toString());
            }
        });
        ComboContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pais = ComboPais.getSelectedItem().toString();
            }
        });








    }
}
