package com.jackkyt.core;

/**
 * Created by Jack2 on 6/16/2016.
 */
public class Core {

    public void onEnable(){
        getLogger().info(getDescription().getName() + "Has Been Enabled! Version:" + getDescription().getVersion() + ".");
    }

    public void onDisable(){
        getLogger().info(getDescription().getName() + "Has Been Disabled!");
    }
}
