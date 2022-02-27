package jukachance.de;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getLogger().fine("JoinMessage are ready!");
    }

    @Override
    public void onDisable() {
        Bukkit.getLogger().fine("JoinMessage unable to load, create an issue at https://github.com/JunkaChance/JoinMessage/issues/new?assignees=&labels=&template=bug_report.md&title=");
    }

    @EventHandler
    public void JoinListener(PlayerJoinEvent join) {
        Player player = join.getPlayer();
        join.setJoinMessage("Welcome "+player.getDisplayName()+"!");
    }

    @EventHandler
    public void QuitListener(PlayerQuitEvent quit) {
        Player player = quit.getPlayer();
        quit.setQuitMessage("See you later "+player.getDisplayName()+"!");
    }

}
