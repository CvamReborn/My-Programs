import java.io.*;
import java.nio.CharBuffer;
public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File infile;
		infile=new File("firstfile.txt");
		FileReader fr=null;
		int i;
		try {
			fr=new FileReader(infile);
			while((i=fr.read()) != -1){
				System.out.print((char)i);
}
		}
		catch(IOException e) {
			System.out.println("Exception Occured: "+e.getMessage());
		}
		finally {
			try {
				fr.close();
			}
			catch(IOException e)
			{
				System.out.println("Exception Occured: "+e.getMessage());
			}
		}
	}

}
