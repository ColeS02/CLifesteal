package com.unclecole.clifesteal.database.serializer;

import com.unclecole.clifesteal.CLifesteal;

public class Serializer {


    /**
     * Saves your class to a .json file.
     */
    public void save(Object instance) {
        CLifesteal.getPersist().save(instance);
    }

    /**
     * Loads your class from a json file
     *
   */
    public <T> T load(T def, Class<T> clazz, String name) {
        return CLifesteal.getPersist().loadOrSaveDefault(def, clazz, name);
    }



}
