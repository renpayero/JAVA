package Ejer5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class BotonPanel extends JPanel {
    //Creamos los 3 botones
    private JButton tempBtn = new JButton("Temperatura");
    private JButton fechaBtn = new JButton("Fecha");
    private JButton borrarBtn = new JButton("Borrar");

    public BotonPanel() {
        //Creamos un layout de 3 filas para añadir los 3 botones.
        setLayout(new GridLayout(3, 1, 0, 0));
        add(tempBtn);
        add(fechaBtn);
        add(borrarBtn);
    }

    public void addBotonTemperaturaActionListener(ActionListener s) {
        tempBtn.addActionListener(s);
    }

    public void addBotonFechaActionListener(ActionListener s) {
        fechaBtn.addActionListener(s);
    }

    public void addBotonBorrarActionListener(ActionListener s) {
        borrarBtn.addActionListener(s);
    }


}
