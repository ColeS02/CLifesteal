package com.unclecole.clifesteal.Listeners;

import com.unclecole.clifesteal.database.Data;
import com.unclecole.clifesteal.database.serializer.Persist;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();
        if(Data.banData.containsKey(player.getUniqueId())) {
            player.kickPlayer("Banned for certain amount of seconds...");
        }
    }
}
