package dev.bleepo.events;

import dev.bleepo.Main;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class move implements Listener {
    private final Main plugin;

    public move(Main plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMove(PlayerMoveEvent e) {
        Player player = e.getPlayer();
        if (player.getWorld().getEnvironment().equals(World.Environment.NORMAL)) {
            if (e.getTo().getY() > 255 || e.getPlayer().getLocation().getY() > 255) {
                e.getPlayer().teleport(new Location(e.getPlayer().getWorld(), e.getPlayer().getLocation().getX(), 250, e.getPlayer().getLocation().getZ()));
                if (e.getPlayer().isGliding()) {
                    e.getPlayer().setGliding(false);
                }
            }
        }
    }
}
