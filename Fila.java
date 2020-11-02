
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author - Enrique
 *  
 */
public class Fila
{
    private String id;
    private Fecha fecha = new Fecha(1,1,2020);
    private double ingresos;
    private double gastos;

    /**
     * Constructor  
     */
    public Fila(String id)    {
         this.fecha = fecha;
         this.ingresos = 0;
         this.gastos = 0;

    }

    /**
     * Constructor  
     */
    public Fila(String id, Fecha fecha, double ingresos, double gastos)    {
        this.id = id;
        this.ingresos = ingresos;
        this.gastos = gastos;
        this.fecha = fecha;
    }
    
    /**
     * accesor para el id de la fila
     */
    public String getId() {
        return this.id;
    }


    /**
     * accesor para la fecha
     */
    public Fecha getFecha() {
        return this.fecha;

    }

    /**
     * accesor para los ingresos
     */
    public double getIngresos() {
        return this.ingresos;

    }

    /**
     * accesor para los gastos
     */
    public double getGastos() {
        return this.gastos;

    }

    /**
     * calcula y devuelve el beneficio
     */
    public double getBeneficio() {
        return this.ingresos - this.gastos;

    }
    
    /**
     * obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     * 
     */   
    
    public Fila duplicar() {
       return new Fila(id, fecha, ingresos, gastos);
    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString(){
      System.out.printf("%8s" , getId()); 
      System.out.printf("%15s" , getFecha());
      System.out.printf("%15.2f€" , getIngresos());
      System.out.printf("%15.2f€" , getGastos()); 
      if(getBeneficio() < 0){
        System.out.printf("%15.2f**", getBeneficio());
        }else{
            System.out.printf("%15.2f€" , getBeneficio());
        }
          
    
      return "";
    }
}
