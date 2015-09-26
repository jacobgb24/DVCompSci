
public class Hospital
{

    public static void main(String[]args)
    {
        Doctor phil = new Doctor(40, 8);
        System.out.println(phil.diagnose());
        
        Nurse nelly = new Nurse(10, 10);
        System.out.println(nelly.checkUp());
        
        Janitor bob = new Janitor(2, 12);
        System.out.println(bob.mop());
        System.out.println(bob.sweep());
        
        Receptionist trent = new Receptionist(8, 10);
        System.out.println(trent.phone());
        
        Surgeon oz = new Surgeon(60, 6);
        System.out.println(oz.cut());
        System.out.println(oz.suture());
        
        Admin hitler = new Admin(1000, 8);
        System.out.println(hitler.administrate());
        
        hitler.raise(250000);
        System.out.println(hitler.administrate());
    }
}
