package github.com.putt0.listener;

import github.com.putt0.BukkitLoader;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.Random;

public class BukkitListener implements Listener {

    @EventHandler
    public void serverListPingEvent(ServerListPingEvent serverListPingEvent) {
        serverListPingEvent.setMaxPlayers(Bukkit.getOnlinePlayers().size()
                + BukkitLoader.getPlugin().getConfig().getInt("MaxPlayers"));

        int random = new Random().nextInt(4);

        if (BukkitLoader.getPlugin().getConfig().getString("Type.fixed").contains("false")) {
            if (random == 0) {
                serverListPingEvent.setMotd(BukkitLoader.getPlugin().getConfig().getString("Random.Motd-center").replace("&", "§")
                        + "\n" + BukkitLoader.getPlugin().getConfig().getString("Random.Motd-1").replace("&", "§"));
            } else if (random == 1) {
                serverListPingEvent.setMotd(BukkitLoader.getPlugin().getConfig().getString("Random.Motd-center").replace("&", "§")
                        + "\n" + BukkitLoader.getPlugin().getConfig().getString("Random.Motd-2").replace("&", "§"));
            } else if (random == 2) {
                serverListPingEvent.setMotd(BukkitLoader.getPlugin().getConfig().getString("Random.Motd-center").replace("&", "§")
                        + "\n" + BukkitLoader.getPlugin().getConfig().getString("Random.Motd-3").replace("&", "§"));
            } else if (random == 3) {
                serverListPingEvent.setMotd(BukkitLoader.getPlugin().getConfig().getString("Random.Motd-center").replace("&", "§")
                        + "\n" + BukkitLoader.getPlugin().getConfig().getString("Random.Motd-4").replace("&", "§"));
            } else {
                serverListPingEvent.setMotd(BukkitLoader.getPlugin().getConfig().getString("Fix.Motd-center").replace("&", "§")
                        + "\n" + BukkitLoader.getPlugin().getConfig().getString("Fix.Motd-1").replace("&", "§"));
            }
        }
    }
}