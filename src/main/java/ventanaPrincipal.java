import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;


public class ventanaPrincipal{



    public static void main(String[] args) {
        PrimeraVentana ven1 = new PrimeraVentana();
        ven1.setVisible(true);
        ven1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ven1.setSize(600,400);
    }

}



class PrimeraVentana extends JFrame {
    public PrimeraVentana(){


//        JPanel panelExterno = new JPanel();
//
//        JPanel panelBotones = new JPanel(new BorderLayout());
//        JPanel panelBotones2 = new JPanel(new BorderLayout());
//
////        JPanel panelIzq = new JPanel(new BorderLayout());
////        JPanel panelDer = new JPanel(new BorderLayout());
//
//        JButton boton1 = new JButton("Camarero");
//        JButton boton2 = new JButton("Cocinero");
//
//        JButton boton3 = new JButton("Admin");
//        JButton boton4 = new JButton("Cliente");
//
//        panelBotones.setBorder(BorderFactory.createEmptyBorder(150, 5, 5, 5));
//        panelBotones2.setBorder(BorderFactory.createEmptyBorder(150, 5, 5, 5));
//        panelBotones.setOpaque(true);
//        panelBotones2.setOpaque(true);
//
//
//        panelExterno.add(panelBotones,BorderLayout.PAGE_START);
//        panelExterno.add(panelBotones2,BorderLayout.PAGE_END);
//
//        panelBotones.add(boton1,BorderLayout.NORTH);
//        panelBotones.add(boton2,BorderLayout.SOUTH);
//        panelBotones2.add(boton3,BorderLayout.NORTH);
//        panelBotones2.add(boton4,BorderLayout.SOUTH);

//        panelIzq.add(boton1,BorderLayout.NORTH);
//        panelIzq.add(boton2,BorderLayout.SOUTH);

//        panelDer.add(boton3,BorderLayout.NORTH);
//        panelDer.add(boton4,BorderLayout.SOUTH);


        setBounds(200,300,600,400);

        LaminaConImagen lamina1 = new LaminaConImagen();

        add(lamina1);

    }
}


class LaminaConImagen extends JPanel{

    private Image imagen;

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            File miImagen = new File("C:\\Users\\NitroPC\\IdeaProjects\\ventanas_restaurante\\src\\main\\fotos\\foto_chino.png");
            try{
                imagen= ImageIO.read(miImagen);
            }catch (IOException e){
                System.out.println("La imagen no se encuentra");
            }

            g.drawImage(imagen,5,5,null);
        }

}
