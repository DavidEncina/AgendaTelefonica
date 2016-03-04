
/**
 * Write a description of class TestAgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestAgendaTelefonica
{
    private int numeroTestsFallados;
    
    /**
     * Constructor for objects of class TestAgendaTelefonica
     */
    public TestAgendaTelefonica()
    {
        numeroTestsFallados = 0;        
        AgendaTelefonica agendaTe1 = new AgendaTelefonica();
        
        numeroTestsFallados += testea(null, agendaTe1.lookupNumber("Paco"), "lookupNumber() en agenda vacia");        
        
        agendaTe1.enterNumber("Paco", "987223344");
        agendaTe1.enterNumber("Ana", "987116633");        
           
        numeroTestsFallados += testea("987223344", agendaTe1.lookupNumber("Paco"), "lookupNumber() de persona en agenda");        
        numeroTestsFallados += testea(null, agendaTe1.lookupNumber("Alfonso"), "lookupNumber() de persona que no esta en agenda");        
        
        if (numeroTestsFallados == 0) {
            System.out.println("Todos los test se han pasado correctamente!!");
        }
        else {
            System.out.println("Han fallado " + numeroTestsFallados + " tests!!!");
        }     
    }
    
    public int testea(Object valorEsperado, Object valorObtenido, 
                          String nombreFuncion)
    {
        int valorDevuelto = 0;
        if (valorEsperado == valorObtenido) {
            System.out.println("OK: " + nombreFuncion);
        }
        else {
            System.out.println("ERROR!!!!! " + nombreFuncion);
            System.out.println("Valor obtenido: " + valorObtenido + 
                               " / Valor esperado: " + valorEsperado);
            valorDevuelto = 1;
        }
        return valorDevuelto;
    }
}
