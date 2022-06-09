package modelo;
public class Telefono {
 
    private double costoMin=200;
    private String operador;
    private long numTelefono;
    private int cantMinut;


    //---------------------
    //Metodos 
    //-------------------

    double costoTotal;

    //Constructor por defecto 
    public Telefono()
    {
    }

    //Constructor comun u ordinario 
    public Telefono(String op,int costMinu,Long numTel,int cMint)
    {
        this.costoMin=costMinu;
        this.operador=op;
        this.numTelefono=numTel;
        this.cantMinut=cMint;
    }

    //constructor de copia
    public Telefono(Telefono C)
    {
        costoMin = C.getCostMin();
        operador = C.getOperador();
        numTelefono= C.getNumTelefono();
        cantMinut=(int) C.getCantMinut();
    }

    public Telefono(int i, int j) {
    }

    //Metodos de acceso
    public int getCantMinut() {
        return cantMinut;
    }

    public void setCantMinut(int cantMinut) {
        this.cantMinut = cantMinut;
    }
     public long getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(Long numTelefono) {
        this.numTelefono = numTelefono;
    } 
    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    } 
    public void setCostMin(Double costMin) 
    {
        this.costoMin = costMin;
    }
    public double getCostMin() {
        return costoMin;
    }

    public double calcularCostoPlan()
     {
         double costoTotal = costoMin *cantMinut;
         if(operador.equals("*movilujos"))
         {
             costoTotal = costoTotal *0.5;
         }
         return costoTotal;
    }

    public String toString()
    {
        return cantMinut + "/"+ numTelefono + "/"+ operador + "/"+ costoTotal;
    }

    //metodo ejecutable
    public static void main(String[] args) 
    
    {
        Telefono c1 = new Telefono();
        c1.setNumTelefono(314454656l);
        c1.setCantMinut(10);
        c1.setOperador("movilujos");

        System.out.println("el numero de celular es " +c1.getNumTelefono() + " el saldo total es de : " + c1.calcularCostoPlan());
    }
}