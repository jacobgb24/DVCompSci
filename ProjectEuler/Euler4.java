public class Euler4{
public static void main(String[]args){
	int a, b, sum, l, r, fin=0;
	String str;
	for(a=100; a<1000; a++){
		for(b=100; b<1000; b++){
			sum=b*a;
			str=String.valueOf(sum);
			
			l = 0;
			r = str.length()-1;
			while(str.charAt(l)==str.charAt(r) && l<=r){
				l++;
				r--;
			}
			if(l>=r && sum>fin)
				fin=sum;
		}
	}
	System.out.println(fin);
}
}