import javax.swing.*;
import java.awt.*;

public class ventanaPrincipal extends JFrame {

    public ventanaPrincipal(){

        JPanel panelExterno = new JPanel();
        panelExterno.setBackground(Color.red);
        JPanel panelBotones = new JPanel(new BorderLayout());
        panelBotones.setBackground(Color.blue);
//        JPanel panelIzq = new JPanel(new BorderLayout());
//        JPanel panelDer = new JPanel(new BorderLayout());

        JButton boton1 = new JButton("Camarero");
        JButton boton2 = new JButton("Cocinero");

        JButton boton3 = new JButton("Admin");
        JButton boton4 = new JButton("Cliente");

//        panelIzq.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
//        panelDer.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));


        panelExterno.add(panelBotones,BorderLayout.CENTER);


        panelBotones.add(boton1,BorderLayout.WEST);
        panelBotones.add(boton2,BorderLayout.EAST);
        panelBotones.add(boton3,BorderLayout.EAST);
        panelBotones.add(boton4,BorderLayout.WEST);

//        panelIzq.add(boton1,BorderLayout.NORTH);
//        panelIzq.add(boton2,BorderLayout.SOUTH);

//        panelDer.add(boton3,BorderLayout.NORTH);
//        panelDer.add(boton4,BorderLayout.SOUTH);


        setContentPane(panelExterno);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setVisible(true);



    }


    public static void main(String[] args) {
        new ventanaPrincipal();
    }

}
