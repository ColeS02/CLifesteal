package com.unclecole.clifesteal;

import com.unclecole.clifesteal.database.serializer.Persist;
import lombok.Getter;
import me.arsmagica.PyroFishingPro;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.UUID;

public final class CLifesteal extends JavaPlugin {

    @Getter
    public static CLifesteal instance;
    @Getter public static Persist persist;
    @Getter private HashMap<UUID, HashMap<UUID, Long>> killCooldown;
    PyroFishingPro pyroFishingPro;


    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
        persist = new Persist();
        killCooldown = new HashMap<>();
        pyroFishingPro = PyroFishingPro.e();
        pyroFishingPro.g.forEach(a-> {
            Bukkit.broadcastMessage("A: " + a);
        });
        pyroFishingPro.h.forEach((s, aLong) -> {
            Bukkit.broadcastMessage("B: " + s + " " + aLong);
        });
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
