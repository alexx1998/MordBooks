package com.mordonia.mordbooks;

import com.mordonia.mcore.MCore;
import com.mordonia.mordbooks.commands.Commands;
import com.mordonia.mordbooks.copyright.BookRights;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class MordBooks extends JavaPlugin {

    @Override
    public void onEnable() {
        MCore mcoreAPI = (MCore) Bukkit.getServer().getPluginManager().getPlugin("MCore");
        this.getCommand("mb").setExecutor(new Commands(mcoreAPI));
        BookRights bookRights = new BookRights(this);
        this.getServer().getPluginManager().registerEvents(new BookRights(this), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
