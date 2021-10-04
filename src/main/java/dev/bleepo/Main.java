package dev.bleepo;

import dev.bleepo.events.move;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Y255 Patch by Bleepo Loaded");
        getServer().getPluginManager().registerEvents(new move(this), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("Bai");
    }
}
