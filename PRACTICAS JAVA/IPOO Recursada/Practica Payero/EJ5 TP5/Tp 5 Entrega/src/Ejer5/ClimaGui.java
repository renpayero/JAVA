package Ejer5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ClimaGui {
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    private EstacionMeteorologica estacion = new EstacionMeteorologica();

    private static final String CIUDAD = "Pergamino";
    private static final int TIEMPO = 4;

    private JFrame frame = new JFrame("Weather Channel");
    private JLabel actual = new JLabel();
    private BotonPanel botonPanel = new BotonPanel();
    private LogPanel logPanel = new LogPanel(frame);

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ClimaGui window = new ClimaGui();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public ClimaGui() { inicializar(); }

    private void inicializar() {
        inicializarPaneles();
        registrarYIniciarServicio();
        agregarPanelesObservadores();
        agregarListenerDePaneles();
    }

    private void agregarListenerDePaneles() {
        botonPanel.addBotonBorrarActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickBotonBorrar();
            }
        });
        botonPanel.addBotonFechaActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickBotonFecha();
            }
        });
        botonPanel.addBotonTemperaturaActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clickBotonTemperatura();
            }
        });
    }

    private void clickBotonBorrar() {
        logPanel.limpiar(estacion);
    }

    private void clickBotonTemperatura() {
        logPanel.ordenarTemp(estacion);
    }

    private void clickBotonFecha() {
        logPanel.ordenarFecha(estacion);
    }

    private void agregarPanelesObservadores() {
        estacion.addObserver(logPanel);
    }

    private void registrarYIniciarServicio() {
        this.scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            public void run() {
                Clima clima = new Clima();

                //Humedad y presión al objeto clima
                clima.setCiudad(CIUDAD);
                clima.setTemperatura(new Random().nextInt(60));
                clima.setFecha(GregorianCalendar.getInstance().getTime());
                clima.setHumedad(new Random().nextInt(100));
                clima.setPresion(new Random().nextInt(10));

                ClimaGui.this.update(null, clima);
            }
        }, 0L, TIEMPO, TimeUnit.SECONDS);
    }

    private void desregistrarYPararServicio(){
        this.scheduledExecutorService.shutdownNow();
    }

    private void inicializarPaneles() {
        frame.getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel centro = new JPanel();
        centro.setLayout(new GridLayout(2, 1, 0, 0));

        JPanel abajo = new JPanel();
        abajo.setLayout(new GridLayout(1, 2, 0, 0));

        abajo.add(botonPanel);
        abajo.add(logPanel);

        centro.add(actual, BorderLayout.NORTH);
        centro.add(abajo, BorderLayout.SOUTH);

        frame.getContentPane().add(centro);

        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                cerrarVentana();
            }
        });
    }

    private void cerrarVentana() {
        if (JOptionPane.showConfirmDialog(frame,
                "Quiere salir de la aplicación?", "Ventana de Cierre?",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            desregistrarYPararServicio();
            System.exit(0);
        }
    }

    public void update(Observable o, Object arg) {
        Clima clima = (Clima) arg;

        estacion.addClima(clima);
        actual.setText("Temperatura : " + String.valueOf(clima.getTemperatura()) + " Grados.");
    }
}
