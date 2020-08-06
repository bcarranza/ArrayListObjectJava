import java.util.*;
public class myListPerson
{
   private ArrayList<person> pList = new ArrayList<person>();
   
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
   public void remove(String uuid)
   {
        try{
            pList.removeIf(t->t.Get_Uuid()==uuid);
            
        }catch (Exception e) {
            e.printStackTrace();
        }
   }
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