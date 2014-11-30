
public class StudentBody
{

    public static void main(String[]args)
    {
        Address school = new Address("123 ABC st.", "Pyongyang", "North Korea", 1);
        Address jHome = new Address("123 Space Ave.", "International Space Station", "Space", 0000);
        Student john = new Student("John", "Gomez", jHome, school);
        Address mHome= new Address("666 Death Row", "GraveStone", "UnderWorld", -1);
        Student Marsha = new Student("Marsha", "Zombie", mHome, school);
        
        System.out.println(john+"\n");
        System.out.println(Marsha);
    }

}
