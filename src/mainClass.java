import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class mainClass 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Scanner input = new Scanner(System.in);
		//py scripts location
		String py_filePath = "C:\\py_script\\sum_Calculator.py";
		
		System.out.println("Please give a start number:");
		String s_num = input.nextLine();
		System.out.println("Please give a end number:");
		String e_num = input.nextLine();
		
		ProcessBuilder pb = new ProcessBuilder("py", "-u", py_filePath, s_num, e_num);
		Process process = pb.start();
		process.waitFor();
		BufferedReader bfr = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line = "";
		while ((line = bfr.readLine()) != null) 
		{
			//print the result
			System.out.println(line);
		}
	}
}
