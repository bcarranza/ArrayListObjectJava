import java.util.UUID;
class main
{
    public static void main(String args[])
    {
        try {
            managePerson mp = new managePerson(); 
            mp.add(UUID.randomUUID().toString(),"Bayron","Carranza");
            mp.add(UUID.randomUUID().toString(),"David","Gonzalez");
            mp.add(UUID.randomUUID().toString(),"Hector","Alvarado");
            System.out.println("Print list");
            System.out.println("--------------");
            mp.printList();
            person p= mp.searchPerson("Hector");
            mp.remove(p.Get_Uuid());
            System.out.println("Print list");
            System.out.println("--------------");
            mp.printList();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}