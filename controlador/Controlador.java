package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Telefono;
import vista.VentanaPrincipal;


public class Controlador implements ActionListener
{
    //-----------------
    // Atributos
    //-----------------
    private VentanaPrincipal vista;
    private  Telefono modelo;

    //----------------
    // Metodos
    //----------------

    //Metodo Constructor
    public Controlador(VentanaPrincipal pVista, Telefono pModelo)
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
           
        }
        
    }
    
}

