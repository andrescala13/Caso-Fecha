package vista;

import java.awt.Color;

import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;


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
    private JTextField tfPosY;
    private JComboBox cbediciondelujo;
    private String[] ediciondelujo = {"De lujo", "No es de lujo"};
   


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
        lx=new JLabel("Nombre del libro=");
        lx.setBounds(240,50,120,20);
        this.add(lx);

        //Crear y agregar una caja de texto x
        tfx=new JTextField();
        tfx.setBounds(360,50,100,20);
        this.add(tfx);

        //Crear y agregar una etiqueta y
        ly=new JLabel("Nombre del autor=");
        ly.setBounds(240,80,120,20);
        this.add(ly);

        //Crear y agregar una caja de texto y
        tfy=new JTextField();
        tfy.setBounds(360,80,80,20);
        this.add(tfy);

        //Crear y agregar una etiqueta w
        lw=new JLabel("Año de edicion=");
        lw.setBounds(240,110,120,20);
        this.add(lw);

        //Crear y agregar una caja de texto w
        tfw=new JTextField();
        tfw.setBounds(360,110,80,20);
        this.add(tfw);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder
        ("Datos de entrada");
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);

        cbediciondelujo = new JComboBox();
        String[]lista={"lujo","no es de lujo"};
        for(int i=0; i<lista.length;i++)
        {
            cbediciondelujo.addItem(lista[i]);
        }
        cbediciondelujo.setBounds(360,140,80,20);
        this.add(cbediciondelujo);
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

    public String gettfz()
    {
        return tfz.getText();
    }

 

    //Metodo borrar cajas de texto
    public void borrar()
    {
        tfx.setText("");
        tfy.setText("");
    }
    public void hallar()
    {
        tfx.setText("");
        tfy.setText("");
}
}