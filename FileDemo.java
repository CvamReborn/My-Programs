import java.io.*;
public class FileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		File infile;
		String str="";
		System.out.print("Enter a message: ");
		try {
			str=br.readLine();
		}
		catch(IOException e) {
			System.out.println("Exception Occurred: "+e.getMessage());
		}
		infile=new File("firstfile.txt");
		FileWriter fw=null;
		try {
			fw=new FileWriter(infile);
			fw.write(str);
		}
		catch(IOException e) {
			System.out.println("Exception occurred: "+e.getMessage());
		}
		finally {
			try {
				fw.close();
			}
			catch(IOException e) {
				System.out.println("Exception occurred: "+e.getMessage());
			}
		}

	}

}
