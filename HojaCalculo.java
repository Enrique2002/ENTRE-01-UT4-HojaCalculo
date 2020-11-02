/**
 *  Un objeto de esta clase representa a una sencilla
 *  hoja de cálculo. La hoja tiene hasta un máximo de 3 filas (no más)
 *  En cada fila la empresa "apunta" los ingresos y gastos en 
 *  una determinada fecha
 * 
 * @author -   
 *  
 */
public class HojaCalculo
{
    private String nombre;
    private Fila fila1;
    private Fila fila2;
    private Fila fila3;

    /**
     * Constructor  
     * Crea la hoja de cálculo con el nombre indicado 
     * e inicializa las filas al valor null (inicialmente
     * la hoja se crea sin filas)
     */
    public HojaCalculo(String nombre)    {
        this.nombre = nombre;
        this.fila1 = null;
        this.fila2 = null;
        this.fila3 = null;

    }

    /**
     * accesor para el nombre de la hoja
     */
    public String getNombre() {
        return this.nombre;

    }

    /**
     * accesor para la fila1
     */
    public Fila getFila1() {
        return this.fila1;

    }

    /**
     * accesor para la fila2
     */
    public Fila getFila2() {
        return this.fila2;

    }

    /**
     * accesor para la fila3
     */
    public Fila getFila3() {
        return this.fila3;

    }

    /**
     * Devuelve el nº de filas de la hoja
     * (dependerá de cuántas filas estén a null)
     */
    public int getNumeroFilas() { 
        int numeroFila = 0;
        if(this.fila1 != null){  
            numeroFila = numeroFila + 1;
        }else{numeroFila = numeroFila + 0;}
        if(this.fila2 != null){
            numeroFila = numeroFila + 1;
        }else{numeroFila = numeroFila + 0;}
        if(this.fila3 != null){
            numeroFila = numeroFila + 1;
        }else{numeroFila = numeroFila + 0;}
        return numeroFila;
    }

    /**
     * Devuelve true si la hoja está completa
     * (tiene exactamente 3 filas)
     */
    public boolean hojaCompleta() {
    if (getNumeroFilas()==3){
        return true;
    }else{return false;}
    }

    /**
     * Se añade una nueva fila a la hoja
     * Si la hoja está completa se muestra el mensaje "FilaX no se puede añadir en HOJAX"
     * Si no está completa se añade la fila a la hoja teniendo en cuenta
     * si se añade como primera, segunda o tercera fila (no han de quedar huecos)
     */
    public void addFila(Fila fila) {
         if(hojaCompleta()== true){
            System.out.println("FilaX no se puede añadir en HOJAX");
            }
         if(hojaCompleta()== false){   
            if(fila1 == null){
                fila1 = new Fila("fila1");
            }
            if(fila2== null){
                fila2 = new Fila("fila2");
            }
            if(fila3== null){
                fila3 = new Fila("fila3");
            }
    }
}
    /**
     * Dada la información a guardar en una fila el método
     * crea la fila y la añade a la hoja
     * (evita repetir código)
     */
    public void addFila(String id, Fecha fecha, double ingresos, double gastos) {
    if(hojaCompleta()== true){
            System.out.println(id + " No se pudo crear en " + nombre);
            }
    if(hojaCompleta()== false){   
            if(fila1 == null){
                fila1 = new Fila(id, fecha, ingresos, gastos);
            }else{
             if(fila2 == null){
                fila2 = new Fila(id, fecha, ingresos, gastos);
            }else{
                if(fila3 == null){
                fila3 = new Fila(id, fecha, ingresos, gastos);
            }
            }
            }          
    }
}

    /**
     * Calcula y devuelve el total de ingresos entre
     * todas las filas que incluye la hoja
     */
    public double getTotalIngresos() {        
        return fila1.getIngresos() + fila2.getIngresos()+ fila3.getIngresos();
    }

    /**
     * Calcula y devuelve el total de gastos
     * entre todas las filas que incluye la hoja
     */
    public double getTotalGastos() {
        return fila1.getGastos() + fila2.getGastos()+ fila3.getGastos();
    }

    /**
     * Calcula y devuelve el total del beneficio
     * entre todas las filas que incluye la hoja
     */
    public double getBeneficio() {
        return getTotalIngresos() - getTotalGastos();
    }

    /**
     * Representación textual de la hoja
     * con el formato exacto que indica el enunciado
     */
    public String toString() {         
     System.out.println(this.nombre);
     System.out.printf("\n%8s" , "ID");
     System.out.printf("%15s" , "Fecha");
     System.out.printf("%15s" , "Ingresos");
     System.out.printf("%15s" , "Gastos");
     System.out.printf("%15s" , "Beneficio\n");
     System.out.println(fila1.toString());
     System.out.println(fila2.toString());
     System.out.println(fila3.toString());
     System.out.println("\n-------------------------------------------------------------------------------------------------");
     System.out.printf("\n%38.2f€", getTotalIngresos());
     System.out.printf("%16.2f€", getTotalGastos()); 
     System.out.printf("%16.2f€", getBeneficio());
     return "";
    }

    /**
     * Devuelve un duplicado de la hoja actual.
     * El nombre de la hoja duplicada será "Duplicada HojaX"
     * Al duplicar la hoja se duplicarán también las filas que contenga
     */
    public HojaCalculo duplicarHoja() {
      System.out.println("Duplicada de " + toString());
      return null;
    }
    

   
}
