package config;

public class SingletonDemo {
    public static void main(String[] args) {
        ConfigurationManager config1 = ConfigurationManager.getInstance();
        ConfigurationManager config2 = ConfigurationManager.getInstance();

        System.out.println(config1.getSetting());
        config2.setSetting("New Configuration");
        System.out.println(config1.getSetting());
    }
}
