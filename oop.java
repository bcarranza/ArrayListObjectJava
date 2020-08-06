import java.util.UUID;
class oop
{
    public static void main(String args[])
    {
        try {
            myListPerson ml = new myListPerson(); 
            ml.add(UUID.randomUUID().toString(),"Bayron","Carranza");
            ml.add(UUID.randomUUID().toString(),"David","Gonzalez");
            ml.add(UUID.randomUUID().toString(),"Hector","Alvarado");
            System.out.println("Print list");
            System.out.println("--------------");
            ml.printList();
            person p= ml.searchPerson("Hector");
            ml.remove(p.Get_Uuid());
            System.out.println("Print list");
            System.out.println("--------------");
            ml.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}