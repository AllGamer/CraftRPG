package CraftRepo.CraftRPG;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.event.player.PlayerListener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * Handle events for all Player related events
 * @author CraftRepo
 */
public class CraftRPGPlayerListener extends PlayerListener {
    private final CraftRPG plugin;

    public CraftRPGPlayerListener(CraftRPG instance) {
        plugin = instance;
    }

    //Insert Player related code here
}

