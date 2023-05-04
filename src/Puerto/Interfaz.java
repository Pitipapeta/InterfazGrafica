package Puerto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interfaz {
    private JTextField TextoID;
    private JTextField TextoPeso;
    private JTextField TextoPais;
    private JButton BCrear;
    private JButton BMostrar;
    private JTextField TextoEmisor;
    private JTextField TextoDesc;
    private JTextField TextoReceptor;
    private JCheckBox AduanaSi;
    private JCheckBox AduanaNO;
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

    int id, peso, prio;
    String pais, emi, recep, descr;
    boolean inspeccion;

    public Interfaz() {
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
        TextoPais.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pais = TextoPais.getText();
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
        AduanaSi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inspeccion = true;
            }
        });
        AduanaNO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inspeccion = false;
            }
        });


        TextoPrio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                prio = Integer.parseInt(TextoPrio.getText());
            }
        });
        TextoMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (TextoMostrar == null) {
                    Puerto p = p.toString();
                }
            }
        });
        BCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Contenedor c = new Contenedor(id, peso, prio, inspeccion, pais, descr, recep, emi);

            }
        });
        BMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
