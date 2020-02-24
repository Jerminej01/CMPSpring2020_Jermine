/**
 * 
 * @Jermine
 * Date : 02/24/2020
 *
 */
import java.util.Scanner;
public class classwork {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int rn = kb.nextInt();
		
		if(rn==10)
		for(int i=1; i<4; i+=1)
		System.out.println("VICTORY"); 
		
		else if(rn!=10)
		for(int i=1; i<4; i+=1)
			System.out.println("GAME OVER");
		
		
		
	}
	

}
