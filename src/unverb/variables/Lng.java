package unverb.variables;

public final class Lng
{
    public Long result;
    public boolean IsSuccess;

    public static Lng TryParse(String input)
    {
        Lng parse = new Lng();

        try
        {
            parse.result = Long.parseLong(input);
            parse.IsSuccess = true;
        }
        catch(Exception e)
        {
            parse.IsSuccess = false;
        }

        return parse;
    }
}
