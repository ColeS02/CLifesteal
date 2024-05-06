package com.unclecole.clifesteal.database;

import com.unclecole.clifesteal.database.serializer.Serializer;

import java.util.HashMap;
import java.util.UUID;

public class Data {

    public static transient Data instance = new Data();

    public static HashMap<UUID, Long> banData = new HashMap<>();

    public static void save() {
        new Serializer().save(instance);
    }

    public static void load() {
        new Serializer().load(instance, Data.class, "data");
    }

}
