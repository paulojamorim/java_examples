import singleton_example.*;

public class MainConfig
{
    public static void main(String[] args)
    {
        Config conf = Config.getInstance();

        //or direct acess
        String s = Config.getInstance().getServerName();
    }
}
