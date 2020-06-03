package com.rtm516.SimplePlayerListQuery;

import net.md_5.bungee.api.plugin.Plugin;
import org.bstats.bungeecord.Metrics;

public class SimplePlayerListQuery extends Plugin {
    public static SimplePlayerListQuery instance;

    @Override
    public void onEnable() {
        instance = this;

        new Metrics(this);

        new QueryEvent();
    }

    @Override
    public void onDisable() {

    }
}
