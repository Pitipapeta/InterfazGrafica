package Puerto;

import javax.swing.*;

public class VentanaResultado extends JFrame {
    private JPanel panelPrincipal;
    private JTextArea tArea;

    Contenedor contenedor;

    public VentanaResultado(Contenedor contenedor){

        this.contenedor = contenedor;

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Resultado");
        this.setSize(400, 300);
        setVisible(true);
        this.add(panelPrincipal);

        tArea.setText(contenedor.toString());
    }

}
