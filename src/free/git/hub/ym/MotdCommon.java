package free.git.hub.ym;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import free.git.hub.ym.listeners.ServerListeners;

public class MotdCommon {
	
	/**
	 * Register || Listener's
	 */
	
	public static void registerListener() {
		PluginManager Listeners = Bukkit.getPluginManager();
		Listeners.registerEvents(new ServerListeners(), MotdMain.getInstance());
	}
}
