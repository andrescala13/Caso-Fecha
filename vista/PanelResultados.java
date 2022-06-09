package vista;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;


public class PanelResultados extends JPanel

{
    //--------------
    // Atributos
    //--------------
    private JTextArea taResultado;
    private JScrollPane spResultado;

    //--------------
    // Metodos
    //--------------

    /*Metodo constructor*/
    public PanelResultados()
    {
        // Definir contenedor del panel
        this.setLayout(null);
      this.setBackground(Color.BLACK);

      //Crear y agregar area de texto
      taResultado = new JTextArea();
      spResultado = new JScrollPane(taResultado);
      spResultado.setBounds(10,20,460,100);
      this.add(spResultado);

        //Borde y titulo al panel
        TitledBorder borde = BorderFactory.createTitledBorder
        ("Resultados");
        borde.setTitleColor(Color.WHITE);
        this.setBorder(borde);    

    
}
//Metodo de acceso a la informacion
public void mostrarResultado(int pMayor)
{
    taResultado.setText("El numero mayor es: " + pMayor);

}
//borrar resultados
public void borrar()
{
    taResultado.setText("");
}
//Mostrar resultado
    public void mostrarResultado(long numero, Object operador ,double costoplan )
    {
        taResultado.setText("el numero es:"+numero+"\nOperador: "+operador+"\nel saldo a pagar: "+costoplan);
    }

    }
