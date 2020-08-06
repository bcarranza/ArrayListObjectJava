
/**
 * Clase atomica de persona
 * @author Bayron Carranza
 * @version 1.0
 */
public class person
{
    //Atributos
    /**
     * uuid de la persona (clave unica)
     */
    private String _uuid;
    /**
     * nombre de la persona 
     */
    private String _name;
    /**
     * apellido de la persona
     */
    private String _lastName;

    /**
     * Modifica el uuid de una perosna.
     * @param uuid de la persona.
     */
    public void Set_Uuid(String uuid)
    {
        this._uuid=uuid;
    }
    /**
     * Obtiene el uuid de la persona
     * @return uuid de la persona
     */
    public String Get_Uuid()
    {
        return _uuid;
    }
    /**
     * Modifica el nombre de una perosna.
     * @param nombre de la persona.
     */
    public void Set_Name(String name)
    {
        this._name=name;
    }
     /**
     * Obtiene el nombre de la persona
     * @return nombre de la persona.
     */
    public String Get_Name()
    {
        return _name;
    }
     /**
     * Modifica el apellido de una perosna.
     * @param apellido de la persona.
     */
    public void Set_LastName(String lastName)
    {
        this._lastName=lastName;
    }
    /**
     * Obtiene el apellido de la persona
     * @return apellido de la persona.
     */
    public String Get_LastName()
    {
        return _lastName;
    }

}