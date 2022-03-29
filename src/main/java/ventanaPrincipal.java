import javax.swing.*;
import java.awt.*;

public class ventanaPrincipal extends JFrame {


    final ImageIcon icon = new ImageIcon("C:\\Users\\NitroPC\\IdeaProjects\\ventanas_restaurante\\src\\main\\fotos\\foto_chino.png");
    Image img = icon.getImage();




    public ventanaPrincipal(){


        JPanel panelExterno = new JPanel();

        JPanel panelBotones = new JPanel(new BorderLayout());
        JPanel panelBotones2 = new JPanel(new BorderLayout());

//        JPanel panelIzq = new JPanel(new BorderLayout());
//        JPanel panelDer = new JPanel(new BorderLayout());

        JButton boton1 = new JButton("Camarero");
        JButton boton2 = new JButton("Cocinero");

        JButton boton3 = new JButton("Admin");
        JButton boton4 = new JButton("Cliente");

        panelBotones.setBorder(BorderFactory.createEmptyBorder(150, 5, 5, 5));
        panelBotones2.setBorder(BorderFactory.createEmptyBorder(150, 5, 5, 5));
        panelBotones.setOpaque(true);
        panelBotones2.setOpaque(true);


        panelExterno.add(panelBotones,BorderLayout.PAGE_START);
        panelExterno.add(panelBotones2,BorderLayout.PAGE_END);

        panelBotones.add(boton1,BorderLayout.NORTH);
        panelBotones.add(boton2,BorderLayout.SOUTH);
        panelBotones2.add(boton3,BorderLayout.NORTH);
        panelBotones2.add(boton4,BorderLayout.SOUTH);

//        panelIzq.add(boton1,BorderLayout.NORTH);
//        panelIzq.add(boton2,BorderLayout.SOUTH);

//        panelDer.add(boton3,BorderLayout.NORTH);
//        panelDer.add(boton4,BorderLayout.SOUTH);


        super.paintComponents(getGraphics());


        setContentPane(panelExterno);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);
        setVisible(true);
    }


    public void paintComponent(Graphics g){
        g.drawImage(img, 0, 0, this);
        super.paintComponents(g);
    }


    public static void main(String[] args) {
        new ventanaPrincipal();
    }

}
