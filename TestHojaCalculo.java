
/**
 *  Clase con código para probar el resto de clases
 * 
 * @author - Enrique
 *  
 */
public class TestHojaCalculo
{
    
    /**
     * Constructor  
     */
    public TestHojaCalculo()    {

    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 1
     * incluyendo la hoja duplicada
     * La fila4 que no se podrá guardar puedes crearla con el constructor por defecto
     * de fila (el que no tiene parámetros)
     */
    public void test1() {
           HojaCalculo Hoja1;
           Hoja1 = new HojaCalculo("Hoja1");
           Fecha fecha1 = new Fecha(4,10,2020);
           Fecha fecha2 = new Fecha(5,10,2020);
           Fecha fecha3 = new Fecha(1,1,2020);
           Hoja1.addFila("fila1", fecha1, 25.00, 132.00);
           Hoja1.addFila("fila2", fecha2, 300.00, 350.00);
           Hoja1.addFila("fila3", fecha3, 0.00, 0.00);
           System.out.println(Hoja1.toString());     
           System.out.println(Hoja1.duplicarHoja());
       }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 2 
     * incluyendo la hoja duplicada
     *  
     */
    public void test2() {
         HojaCalculo Hoja2;
           Hoja2 = new HojaCalculo("Hoja2");
           Fecha fecha1 = new Fecha(7,10,2020);
           Fecha fecha2 = new Fecha(8,10,2020);           
           Hoja2.addFila("fila1", fecha1, 260.00, 125.00);
           Hoja2.addFila("fila2", fecha2, 125.00, 245.00);          
           System.out.println(Hoja2.toString());     
           System.out.println(Hoja2.duplicarHoja());
    }

    /**
     * Define y crea todos los objetos necesarios para obtener
     * en pantalla la hoja de cálculo indicada en la figura 3
     * incluyendo la hoja duplicada
     *  
     */
    public void test3() {
           HojaCalculo Hoja3;
           Hoja3 = new HojaCalculo("Hoja3");
           Fecha fecha1 = new Fecha(8,10,2020);                  
           Hoja3.addFila("fila1", fecha1, 670.00, 234.00);                
           System.out.println(Hoja3.toString());     
           System.out.println(Hoja3.duplicarHoja());
    }

}
