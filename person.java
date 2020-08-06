public class person
{
    private String _uuid;
    private String _name;
    private String _lastName;

    public void Set_Uuid(String uuid)
    {
        this._uuid=uuid;
    }
    public String Get_Uuid()
    {
        return _uuid;
    }

    public void Set_Name(String name)
    {
        this._name=name;
    }
    public String Get_Name()
    {
        return _name;
    }
    
    public void Set_LastName(String lastName)
    {
        this._lastName=lastName;
    }
    public String Get_LastName()
    {
        return _lastName;
    }

}