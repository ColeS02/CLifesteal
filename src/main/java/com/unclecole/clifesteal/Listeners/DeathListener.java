package com.unclecole.clifesteal.Listeners;

import com.unclecole.clifesteal.CLifesteal;
import com.unclecole.clifesteal.database.Data;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.HashMap;

public class DeathListener implements Listener {

    CLifesteal plugin = CLifesteal.getInstance();

    @EventHandler
    public void onDeath(PlayerDeathEvent event) {
        /*if(event.getEntity().getKiller() == null) return;

        Player killer = event.getEntity().getKiller();
        Player player = event.getEntity();

        if(!plugin.getKillCooldown().containsKey(killer.getUniqueId())) {
            plugin.getKillCooldown().put(killer.getUniqueId(), new HashMap<>());
        }

        if(player.getHealth() > 2) {
            player.setHealth(player.getHealth() - 2);
        } else {
            Data.banData.put(player.getUniqueId(), System.currentTimeMillis());
            player.kickPlayer("You have been banned!3");
        }
        if(killer.getHealth() < 40) {
            killer.setHealth(killer.getHealth() + 2);
        }

        plugin.getKillCooldown().get(killer.getUniqueId()).put(player.getUniqueId(), System.currentTimeMillis());*/


    }
}
