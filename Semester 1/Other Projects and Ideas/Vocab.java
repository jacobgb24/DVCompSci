import java.util.*;
public class Vocab {
	public static void main(String[]args) {
	Random gen = new Random();
	Scanner in = new Scanner(System.in);
	while(true) {
		int ranNum = gen.nextInt(10);
		if(ranNum==1) {
			System.out.println("(of a situation or course of action) filled with or destined to result in (something undesirable).");
			String answer = in.nextLine();
			if(answer.equals("fraught"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==2) {
			System.out.println("feeling or appearing casually calm and relaxed; not displaying anxiety, interest, or enthusiasm.");
			String answer = in.nextLine();
			if(answer.equals("nonchalant"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==3) {
			System.out.println("unnecessary, especially through being more than enough.");
			String answer = in.nextLine();
			if(answer.equals("superfluous"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==4) {
			System.out.println("fearless; adventurous (often used for rhetorical or humorous effect).");
			String answer = in.nextLine();
			if(answer.equals("intrepid"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==5) {
			System.out.println("lacking interest or excitement; dull.");
			String answer = in.nextLine();
			if(answer.equals("mundane"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==6) {
			System.out.println("having or showing keen mental discernment and good judgement; shrewd.");
			String answer = in.nextLine();
			if(answer.equals("sagacity"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==7) {
			System.out.println("a confusing and difficult problem or question.");
			String answer = in.nextLine();
			if(answer.equals("conundrum"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==8) {
			System.out.println("a public speaker, especially one who is eloquent or skilled.");
			String answer = in.nextLine();
			if(answer.equals("orator"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==9) {
			System.out.println("having or showing shrewdness and good judgement, especially in money or business matters.");
			String answer = in.nextLine();
			if(answer.equals("canny"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");
		}		
		if(ranNum==0) {
			System.out.println("lasting only for a short time; impermanent.");
			String answer = in.nextLine();
			if(answer.equals("transient"))
				System.out.println("Correct!");
			else
				System.out.println("Incorrect!");		
		}		
	}
}
}	