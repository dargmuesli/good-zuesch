package de.jonas_thelemann.good_zuesch;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedEnterEvent;

public class GoodZueschListener implements Listener {
    @EventHandler
    public void playerBedEnterEvent(PlayerBedEnterEvent playerBedEnterEvent) {
        playerBedEnterEvent.getPlayer().chat("züsch");
    }
}
