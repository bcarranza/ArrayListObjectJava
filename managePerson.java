/**
 * Clase encargada de administrar una lista de personas y sus distintas operaciones.
 * @author Bayron Carranza
 * @version 1.0
 */
import java.util.*;
public class managePerson
{
    /**
     * Atributo que identifica la lista de personas que esta clase administra.
     */
   private ArrayList<person> pList = new ArrayList<person>();
   
   /**
    * Agrega una persona a la lista administrable.
    */
   public void add(String uuid, String name, String lastName)
   {
       try {
        person p = new person();
        p.Set_Uuid(uuid);
        p.Set_Name(name);
        p.Set_LastName(lastName);
        pList.add(p);

       }catch (Exception e) {
            e.printStackTrace();
       }
   }
   /**
    * Imprime la lista de personas de la propiedad pList con sus atributos
    */
   public void printList()
   {
      try{
        pList.forEach((p) ->  
            System.out.println(p.Get_Uuid() + " " + p.Get_Name() + " " + p.Get_LastName()) 
        );
      }catch (Exception e) {
        e.printStackTrace();
      }  
   }
   /**
    * Borra una persona de la lista
    * @param uuid de la persona
    */
   public void remove(String uuid)
   {
        try{
            pList.removeIf(t->t.Get_Uuid()==uuid);
            
        }catch (Exception e) {
            e.printStackTrace();
        }
   }
   /**
    * Busca una persona por nombre.
    * @param nombre de la persona.
    */
   public person searchPerson(String name)
   {    
        try{
            for (int i = 0; i < pList.size(); i++) {
                if(pList.get(i).Get_Name()==name){
                    return pList.get(i);
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
            
        }
        return null;
    }
}