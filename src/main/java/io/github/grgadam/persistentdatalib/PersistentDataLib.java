package io.github.grgadam.persistentdatalib;

import org.bukkit.plugin.java.JavaPlugin;

public final class PersistentDataLib extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new TestEvents(), this);
    }

    @Override
    public void onDisable() {

    }
}
