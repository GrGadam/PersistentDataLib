package me.grggamer.persistentdatalib;

import me.grggamer.persistentdatalib.Item.ItemPersistentData;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class TestEvents implements Listener {

    @EventHandler
    public void onLeftClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_BLOCK) {
            Location testLoc = e.getClickedBlock().getLocation();
            testLoc.add(0.5, 1, 0.5);
            ItemPersistentData.addLocationData(p.getInventory().getItemInMainHand(), "test", testLoc);
        }
    }

    //sheesh

    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        Player p = e.getPlayer();
        if (e.getAction() == Action.RIGHT_CLICK_AIR) {
            p.teleport(ItemPersistentData.getLocationDataByKey(p.getInventory().getItemInMainHand(), "test"));
        }
    }

}
