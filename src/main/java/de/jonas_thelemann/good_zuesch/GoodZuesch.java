package de.jonas_thelemann.good_zuesch;

import org.bukkit.plugin.java.JavaPlugin;

public class GoodZuesch extends JavaPlugin {
    private final GoodZueschListener goodZueschListener = new GoodZueschListener(this);
    private final GoodZueschCommandExecutor goodZueschCommandExecutor = new GoodZueschCommandExecutor(this);

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(goodZueschListener, this);
        getCommand("goodzuesch").setExecutor(goodZueschCommandExecutor);
    }
}
