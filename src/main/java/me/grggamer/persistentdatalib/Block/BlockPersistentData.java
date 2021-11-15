package me.grggamer.persistentdatalib.Block;

import me.grggamer.persistentdatalib.PersistentDataLib;
import org.bukkit.NamespacedKey;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.TileState;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.plugin.Plugin;

public abstract class BlockPersistentData {

    private static final Plugin plugin = PersistentDataLib.getPlugin(PersistentDataLib.class);


    //Setting (Adding) values

    //Integer
    public static void addIntData(Block block, String key, Integer data){
        BlockState blockstate = block.getState();
        if (blockstate instanceof TileState tileState){
            PersistentDataContainer container = tileState.getPersistentDataContainer();
            NamespacedKey namespacedKey = new NamespacedKey(plugin, key);
            container.set(namespacedKey, PersistentDataType.INTEGER, data);
        }
    }



}
