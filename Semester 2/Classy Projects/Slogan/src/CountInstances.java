/**
 * Created by jacob_000 on 1/7/2015.
 */
public class CountInstances {
    public static void main(String[]args){
        Slogan obj;
        obj=new Slogan("Remember the Alamo. What's the Alamo?");
        System.out.println(obj);

        obj=new Slogan("Don't worry. Be happy or sad. I don't control your life.");
        System.out.println(obj);

        obj=new Slogan("Live free or die in prison");
        System.out.println(obj);

        obj=new Slogan("Talk is cheap unless you're on verizon");
        System.out.println(obj);

        obj=new Slogan("Write once, run anywhere within 25mi");
        System.out.println(obj);

        System.out.println();
        System.out.println("Slogans created:"+Slogan.getCount());
    }
}
