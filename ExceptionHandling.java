import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
class AgeNotValidException extends Exception
{
    AgeNotValidException(String message)
    {
        super(message);
    }
}
public class ExceptionHandling {
    public static void main(String[] args) {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        try (br) {
            int age = Integer.parseInt(br.readLine());
            if (age < 18) throw new AgeNotValidException("Age is not valid!!");
            else System.out.println("Vote kar madarchod!!");
        } catch (AgeNotValidException | IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("YO YO");
        }
    }
}
