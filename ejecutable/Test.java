package ejecutable;

import controlador.Controlador;
import modelo.Telefono;
import vista.PanelOperaciones;
import vista.PanelResultados;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Telefono miModelo = new Telefono(0,0);
        Controlador miControlador = new Controlador(miVentana, miModelo);
        
    
        
    }
}
