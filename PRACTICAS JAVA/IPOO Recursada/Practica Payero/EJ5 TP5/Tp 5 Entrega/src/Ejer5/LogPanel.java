package Ejer5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Observable;
import java.util.Observer;

public class LogPanel extends JPanel implements Observer {

    JList jlist = new JList();

    public LogPanel(JFrame main) {    //Constructor
        setLayout(new BorderLayout(0, 0));
        DefaultListModel model = new DefaultListModel(); //Modo para agregar cosas a la lista
        model.clear();
        jlist.setModel(model);

        jlist.addMouseListener(new MouseAdapter() { //Ponemos el listener del mouse
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getClickCount() == 2) {
                    JDialog dialog = new JDialog();
                    JPanel pan = new JPanel();
                    dialog.setSize(700,200);
                    dialog.setLayout(new GridLayout(2,1,0,0));
                    dialog.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
                    pan.setLayout(new FlowLayout());
                    dialog.setTitle("Informacion de temperatura");
                    pan.add(new JLabel(jlist.getSelectedValue().toString()));
                    dialog.add(pan);
                    dialog.setVisible(true);
                   System.out.println("Double Click");
                }
            }
        });

        JScrollPane scrollPane = new JScrollPane(jlist);//txtpnText);

        add(scrollPane, BorderLayout.CENTER);
    }

    public void limpiar(EstacionMeteorologica e) {
        DefaultListModel listmodel = (DefaultListModel)jlist.getModel();
        listmodel.clear();
        e.borrarHistorial();
    }
    public void ordenarTemp(EstacionMeteorologica e){
        DefaultListModel listmodel = (DefaultListModel)jlist.getModel();
        listmodel.clear();
        listmodel.addAll(e.ordenarClimaPorTemperatura());
    }
    public void ordenarFecha(EstacionMeteorologica e){
        DefaultListModel listmodel = (DefaultListModel)jlist.getModel();
        listmodel.clear();
        listmodel.addAll(e.ordenarClimaPorFecha());
    }

    public void update(Observable o, Object arg) {
        EstacionMeteorologica estacion = (EstacionMeteorologica) o;
        DefaultListModel listmodel = new DefaultListModel();
        listmodel.clear();
        for(Clima c: estacion.getClimas()){
            listmodel.addElement(c);
        }
        jlist.setModel(listmodel);

    }

}
