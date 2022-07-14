package ejecutable;

import controlador.Controlador;
import modelo.Libro;
import vista.PanelOperaciones;
import vista.PanelResultados;
import vista.VentanaPrincipal;

public class Test 
{
    public static void main(String[] args) 
    {
        VentanaPrincipal miVentana = new VentanaPrincipal();
        Libro miModelo = new Libro();
        Controlador miControlador = new Controlador(miVentana, miModelo);
        
        
    
        
    }
}
