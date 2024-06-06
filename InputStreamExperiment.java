import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class InputStreamExperiment {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int number=0;
        String name=null;
        while(number!=-1)
        {
            name=br.readLine();
            System.out.println("Name: "+name);
            number=Integer.parseInt(br.readLine());
            System.out.println("Number:" +number);
        }

    }

}
