// import java.util.*;
import unverb.core.*;
import unverb.variables.*;

public class App
{
    public static void main(String[] args)
    { 
        int num = 0;

        while(true)
        {
            Int res = Int.TryParse(Console.ReadLine());
            if(res.IsSuccess)
            {
                num = res.result;
                break;
            }
            else
            {
                Console.Log("Try again.");
            }
        }

        Console.Log(num % 2==0);
    }
}