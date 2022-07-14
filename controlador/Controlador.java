package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Libro;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    //-----------------
    // Atributos
    //-----------------
    private VentanaPrincipal vista;
    private  Libro modelo;

    //----------------
    // Metodos
    //----------------

    //Metodo Constructor
    public Controlador(VentanaPrincipal pVista, Libro pModelo)
    {
        this.vista = pVista;
        this.modelo = pModelo;
        this.vista.miPanelOperaciones.btHallar.addActionListener(this);
        this.vista.miPanelOperaciones.btBorrar.addActionListener(this);
        this.vista.miPanelOperaciones.btSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) 
    {
        // identificar el comando generado hallar , borrar ,salir

        String comando = ae.getActionCommand();
        
        if(comando.equals("salir"))
        {
            System.exit(0);
        }
        
        if(comando.equals("borrar"))
        {
            this.vista.miPanelEntradaDatos.borrar();
            this.vista.miPanelResultados.borrar();
        }

        if(comando.equals("hallar"))
        {
            modelo.setTitulo(vista.miPanelEntradaDatos.gettfx());
            modelo.setAutor(vista.miPanelEntradaDatos.gettfy());
            modelo.setEdicion(Integer.parseInt(vista.miPanelEntradaDatos.gettfz()));
            //modelo.setEdicionLujo(vista.miPanelEntradaDatos.getEdiciondeLujo());
            vista.miPanelResultados.mostrarResultado(modelo);

        }
        
    }
    
}

