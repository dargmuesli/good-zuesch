package de.jonas_thelemann.good_zuesch;

import org.bukkit.plugin.java.JavaPlugin;

public class GoodZuesch extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new GoodZueschListener(), this);
    }
}
