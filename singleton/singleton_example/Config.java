package singleton_example;

public class Config
{
    private static Config instance = new Config();
    private static String name;

    private Config()
    {

    }
        
    public static Config getInstance()
    {
        return instance;
    }

    public String getServerName()
    {
        return name;
    }

    public void setServerName(String name)
    {
        this.name = name;
    }
}
