package config;

public class ConfigurationManager {
    private static ConfigurationManager instance;
    private String setting;

    private ConfigurationManager() {
        // Load configuration settings
        setting = "Default Configuration";
    }

    public static ConfigurationManager getInstance() {
        if (instance == null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting) {
        this.setting = setting;
    }
}
