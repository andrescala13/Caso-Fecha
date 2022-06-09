package vista;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame
{
    //----------
    // Atributos
    //----------
    public PanelEntradaDatos miPanelEntradaDatos;
    public PanelOperaciones miPanelOperaciones;
    public PanelResultados miPanelResultados;

    //--------
    // Metodos
    //--------

    /*Método constructor*/
    public VentanaPrincipal()
    {
        //Contenedor de la ventana
        this.setLayout(null);

        //Crear y agregar el PanelEntradaDatos
        miPanelEntradaDatos = new PanelEntradaDatos();
        miPanelEntradaDatos.setBounds(10,10,480,200);
        this.add(miPanelEntradaDatos);
        
        //Crear y agregar PanelOperaciones
        miPanelOperaciones = new PanelOperaciones();
        miPanelOperaciones.setBounds(10,210,480,100);
        this.add(miPanelOperaciones);

        //Crear y agregar PanelResultados
        miPanelResultados = new PanelResultados();
        miPanelResultados.setBounds(10,320,480,200);
        this.add(miPanelResultados);

        // Caracteristicas de la ventana
        this.setTitle("Telefonia");
        this.setSize(500,500);
        //this.setLocation(100,100);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        
    }

}