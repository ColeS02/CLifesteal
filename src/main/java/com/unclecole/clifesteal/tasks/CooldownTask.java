package com.unclecole.clifesteal.tasks;

import com.unclecole.clifesteal.CLifesteal;

public class CooldownTask implements Runnable{

    CLifesteal plugin = CLifesteal.getInstance();

    @Override
    public void run() {
        plugin.getKillCooldown().forEach((uuid, uuidLongHashMap) -> {
            uuidLongHashMap.forEach((uuid1, aLong) -> {
                if((System.currentTimeMillis() -aLong)/1000 > 30) {
                    uuidLongHashMap.remove(uuid1);
                }
            });
        });
    }
}
