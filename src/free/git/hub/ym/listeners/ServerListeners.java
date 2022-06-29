package free.git.hub.ym.listeners;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;

import free.git.hub.ym.MotdMain;

public class ServerListeners implements Listener {
	
	@EventHandler
	public void onServerListPingEvent(ServerListPingEvent serverListPingEvent) {
		
		serverListPingEvent.setMaxPlayers(Bukkit.getOnlinePlayers().size()
				+ MotdMain.getInstance().getConfig().getInt("MaxPlayers"));
		
		int random = new Random().nextInt(4);
		if (MotdMain.getInstance().getConfig().getString("Type.fixed").contains("false")) {
			if (random == 0) {
				serverListPingEvent.setMotd(MotdMain.getInstance().getConfig().getString("Random.Motd-center").replace("&", "§") 
						+ "\n" + MotdMain.getInstance().getConfig().getString("Random.Motd-1").replace("&", "§"));
			} else if (random == 1) {
				serverListPingEvent.setMotd(MotdMain.getInstance().getConfig().getString("Random.Motd-center").replace("&", "§") 
						+ "\n" + MotdMain.getInstance().getConfig().getString("Random.Motd-2").replace("&", "§"));
			} else if (random == 2) {
				serverListPingEvent.setMotd(MotdMain.getInstance().getConfig().getString("Random.Motd-center").replace("&", "§") 
						+ "\n" + MotdMain.getInstance().getConfig().getString("Random.Motd-3").replace("&", "§"));
			} else if (random == 3) {
				serverListPingEvent.setMotd(MotdMain.getInstance().getConfig().getString("Random.Motd-center").replace("&", "§") 
						+ "\n" + MotdMain.getInstance().getConfig().getString("Random.Motd-4").replace("&", "§"));
			}
		} else {
			serverListPingEvent.setMotd(MotdMain.getInstance().getConfig().getString("Fix.Motd-center").replace("&", "§") 
					+ "\n" + MotdMain.getInstance().getConfig().getString("Fix.Motd-1").replace("&", "§"));
		}
	}
}