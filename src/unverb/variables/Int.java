package unverb.variables;

public final class Int
{
    public int result;
    public boolean IsSuccess;

    public static Int TryParse(String input)
    {
        Int parse = new Int();

        try
        {
            parse.result = Integer.parseInt(input);
            parse.IsSuccess = true;
        }
        catch(Exception e)
        {
            parse.IsSuccess = false;
        }

        return parse;
    }

    public static int Parse(String input)
    {
        return Integer.parseInt(input);
    }
}
