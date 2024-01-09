package unverb.core;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public final class Console
{
    // No one touches the class >:)
    private Console() { }

    public static void Log(Object input)
    {
        System.out.println(input);
    }

    public static void Write(Object input)
    {
        System.out.print(input);
    }

    public static String ReadLine()
    {
        String result;
        BufferedReader reader =
            new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            result = reader.readLine();
        }
        catch(Exception e)
        {
            result = null;
        }

        return result;
    }
}