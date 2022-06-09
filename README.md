# ENCAPSULACION

- Cuando un objeto se encuentra encapsulado, solo sus metodos tienen acceso a sus atributos, evitando asi la manipulacion de los atributos mediante la presencia de fuentes externas, es decir quien programa un obejto controla los metodos de acceso, su estado y su comportamiento.
- Es una de las propiedades mas importantes de la POO.
- Consiste en la separacion de las propiedades externas de un objeto correspondiente a la interfaz de sus funciones, de los detalles de implementacion interna del objeto. 
- se reduce la complejidad del sistema protegiendo los objetos contra posibles errores y permitiendo lograr de ,ejor manera extenciones futuras en la implementacion de los objetos.
- Consiste basicamente en proteger los atributos del acceso directo de los objetos, colocandolos en una zona privada, y la unica forma de acceder a ellos es por medio de los metodos que estan en una zona publica.

## Mensajes
- Una aplicacion orientada a objetos esta compuesta por varios objetos creados desde sus respectivas clases.
- Estos objetos necesitan una forma de comunicarse, para intercambiar datos entre si, y lo hacen por medio de mensajes.
- Los mensajes pueden contener parametros en los cuales se indican las caracteristicas especificas de la accion a realizar.
- Estructuralmente esta compuesto por los siguientes elementos: 
    1.Objeto destino, hacia el cual el mensaje es enviado.
    2.El nombre del metodo a llamar.
    3.Parametros solicitados por el metodo, a traves del cual suele darse la informacion.
- El envio y recepcion de mensajes es simplemente una peticion de un objeto a otro objeto para que este se comporte de una manera determinada, ejecutando unos de sus metodos.
- Ejemplo: 
    Si existe un objeto A de la clase Carro y un objeto B de la clase Impuesto, para calcular el 10% de impuesto sobre el precio del carro, la comunicaion podria ser:
    `float costo = A.getPrecio();`
    `B.calcularImpuesto(costo*0.10);`

 ## Ciclo de vida de los objetos
 - El objeto nace cuando se crea, vive cuandose se utiliza en un programa y muere cuando deja de usarse.

 ## Constructores
- Son metodos especiales que tienen las siguientes caracteristicas:
   - Se llaman solo una vez al crear el objeto.dd
   - Tienen el mismo nombre de la clase.
   - Pueden haber varios (sobrecarga de métodos).
   - Al crear un obejto solo se utiliza uno.
   - No devuelve nada, ni void (realmente devuelve el objeto creado).
   - Inicializa los atributos del objeto al momento de crearse sin hacer otra instruccion adicional.
   - Java provee un constructor por defecto.
   - Tipos:
     - por defecto: no recibe parametros.
     - comun u ordinario: puede recibir toda clase de parametros.
     - de copia: que permite la construccion de una copia del objeto.

 ## Crecimiento y vida del objeto 
 - Una vez creado el objeto:
     - se puede trabajar con el
     - llamar a los metodos de su clase
     - guardar datos para almacenarlos temporalmente antes de registrarlos en una BD.
     - compartir datos con los demas objetos, pasandoles mensajes. 
 - Cada pbjeto consume memoria, y depende de los atributos que tenga.

 ## Muerte del objeto
 - Java utiliza el Garbage Collector para liberar los objetos no referenciados.
 - Java cuenta las referencias que hay sobre cada objeto. El objeto se borra cuando no tenga referencias.
 - Antes de borrarlo Java da la oportunidad de limpiarse asi mismo: finalización.
 - Llamado explicito al gc System.gc();

 ## Ejercicio
 Crear un programa para gestionar un plan de telefonia celular. el plan tiene un numero de celular, un operador, una cantidad de minutos y un costo por minuto. Calcular el total a pagar teniendo en cuenta que si el operador es movilujo tiene un 50% de descuento. usar minimo 3 constructores.

    
