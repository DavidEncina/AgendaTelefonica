import java.util.HashMap;

/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    // Almacena objetos en este mapa
    private HashMap<String, String> mapa;

    /**
     * Constructor for objects of class AgendaTelefonica
     */
    public AgendaTelefonica()
    {
        mapa = new HashMap<>();
    }

    /**
     * Permite almacenar un nuevo número en la agenda indicando el nombre del contacto
     * y su numero de telefono asociado
     */
    public void enterNumber(String name, String number)
    {
        mapa.put(name, number);
    }

    /**
     * Devuelve el numero de teléfono del contacto indicado. Si el contacto no existe, 
     * devuelve null.
     */
    public String lookupNumber(String name)
    {
        return mapa.get(name);
    }
}
