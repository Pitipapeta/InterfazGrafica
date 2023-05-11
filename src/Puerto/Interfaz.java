package Puerto;

import Paquete.Contenedor;
import Paquete.Hub;
import Paquete.Puerto;

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
    private JButton bMatriz;
    private JRadioButton RB4;
    private JRadioButton RB6;
    private JRadioButton RB5;
    private JTextField TextoContar;
    private JButton BContenedorBAse;

    // Atributos Contenedor
    int id, peso, prio, contador;
    String pais, emi, recep, descr;
    boolean inspeccion;
    Paquete.Hub hub = new Hub();
    Contenedor contenedor;
    Puerto puerto;

    // Atributos
    int col, identificador, nPuerto;
    String paisContar;

    public Interfaz() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Puerto");
        this.setSize(1000, 750);
        setVisible(true);
        this.add(panelPrincipal);
        puerto = new Puerto();

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
        TextoContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TextoContar.setText("" + contador);
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
                prio = Integer.parseInt(RB1.getText());
            }
        });
        RB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB2.isSelected()) {
                    RB1.setSelected(false);
                    RB3.setSelected(false);
                }
                prio = Integer.parseInt(RB2.getText());
            }
        });
        RB3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB3.isSelected()) {
                    RB1.setSelected(false);
                    RB2.setSelected(false);
                }
                prio = Integer.parseInt(RB3.getText());
            }
        });
        RB4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB4.isSelected()) {
                    RB5.setSelected(false);
                    RB6.setSelected(false);
                }
                nPuerto = Integer.parseInt(RB4.getText());
            }
        });
        RB5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB5.isSelected()) {
                    RB4.setSelected(false);
                    RB6.setSelected(false);
                }
                nPuerto = Integer.parseInt(RB5.getText());
            }
        });
        RB6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (RB6.isSelected()) {
                    RB4.setSelected(false);
                    RB5.setSelected(false);
                }
                nPuerto = Integer.parseInt(RB6.getText());
            }
        });

        /** Buttons */
        BCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contenedor = new Contenedor(id, peso, prio, inspeccion, pais, descr, recep, emi);
                TArea.setText("Contenedor creado");


            }
        });

        BMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(id == identificador){
                    TArea.setText(contenedor.toString());
                }else TArea.setText("Contenedor no encontrado");
            }
        });
        BApilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean apilado = hub.apilar(contenedor);

                if (apilado){
                    VentanaResultado ventanaResultado = new VentanaResultado(contenedor);


                }else{
                    TArea.setText("No se ha podido apilar el contenedor");
                }

            }
        });
        BDesapilar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                boolean apilado = hub.desapilar(col);

                if (apilado){
                    TArea.setText("Columna desapilada" + contenedor.toString());
                }else{
                    TArea.setText("No se ha podido desapilar la columna");
                }
            }
        });
        BContar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                contador = hub.npais(paisContar);
            }
        });
        bMatriz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TArea.setText(puerto.toString());
            }
        });

        BContenedorBAse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TArea.setText(puerto.contenedorBase(prio));
            }
        });

        /** ComboBox */
        ComboPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                pais = ComboPais.getSelectedItem().toString();
            }
        });

        ComboContar.addActionListener(new ActionListener() {
            @Override public void actionPerformed (ActionEvent e){
                paisContar = ComboContar.getSelectedItem().toString();
            }
        });
    }
}
