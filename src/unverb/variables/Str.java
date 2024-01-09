package unverb.variables;

public final class Str
{
    public String result;
    public boolean IsSuccess;

    public static Str TryParse(Object input)
    {
        Str parse = new Str();

        try
        {
            parse.result = String.valueOf(input);
            parse.IsSuccess = true;
        }
        catch(Exception e)
        {
            parse.IsSuccess = false;
        }

        return parse;
    }
}