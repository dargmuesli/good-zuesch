package de.jonas_thelemann.good_zuesch;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class GoodZueschListener implements Listener {
    private final GoodZuesch plugin;

    public GoodZueschListener(GoodZuesch plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void playerBedEnterEvent(PlayerBedEnterEvent playerBedEnterEvent) {
        if (this.plugin.getConfig().getBoolean("enabled")) {
            playerBedEnterEvent.getPlayer().chat(this.plugin.getConfig().getString("message"));
        }
    }
}
