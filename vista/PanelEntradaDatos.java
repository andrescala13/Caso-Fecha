package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelEntradaDatos extends JPanel
{
    //--------------
    // Atributos
    //--------------
    private JLabel lx;
    private JLabel ly;
    private JLabel lw;
    private JLabel lz;
    //private JLabel lImagen;
    //private ImageIcon iImagen;
    private JTextField tfx;
    private JTextField tfy;
    private JTextField tfw;
    private JTextField tfz;


    //--------------
    // Metodos
    //--------------

    /*Metodo constructor*/
    public PanelEntradaDatos()
    {
        // Definir contenedor del panel
        this.setLayout(null);
        this.setBackground(Color.BLACK);

        //Crear y agregar imagen
        //iImagen = new ImageIcon(getClass().getResource(""));
        //lImagen = new JLabel(iImagen);
        //lImagen.setBounds(10,50,120,120);
        //this.add(lImagen);>>>

        //Crear y agregar una etiqueta x
        lx=new JLabel("Numero de telefono=");
        lx.setBounds(240,50,120,20);
        this.add(lx);

        //Crear y agregar una caja de texto x
        tfx=new JTextField();
        tfx.setBounds(360,50,80,20);
        this.add(tfx);

        //Crear y agregar una etiqueta y
        ly=new JLabel("Cantidad de minutos=");
        ly.setBounds(240,100,120,20);
        this.add(ly);

        //Crear y agregar una caja de texto y
        tfy=new JTextField();
        tfy.setBounds(360,100,80,20);
        this.add(tfy);

        //Crear y agregar una etiqueta w
        lw=new JLabel("Operador=");
        lw.setBounds(240,150,120,20);
        this.add(lw);

        //Crear y agregar una caja de texto w
        tfw=new JTextField();
        tfw.setBounds(360,150,80,20);
        this.add(tfw);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder
        ("Datos de entrada");
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);
    }

    //Metodos de acceso a la informacion
    public String gettfx()
    {
        return tfx.getText();
    }

    public String gettfy()
    {
        return tfy.getText();
    }

    //Metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
    }
}