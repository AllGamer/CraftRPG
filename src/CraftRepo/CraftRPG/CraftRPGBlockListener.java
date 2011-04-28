package CraftRepo.CraftRPG;

import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.Material;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockListener;
import org.bukkit.event.block.BlockPhysicsEvent;

/**
 * CraftRPG block listener
 * @author CraftRepo
 */
public class CraftRPGBlockListener extends BlockListener {
    private final CraftRPG plugin;

    public CraftRPGBlockListener(final CraftRPG plugin) {
        this.plugin = plugin;
    }

    //put all Block related code here
}
