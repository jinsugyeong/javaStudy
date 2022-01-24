package goorm.first;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Even_Odd {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		
		if(input % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");

	}

}
