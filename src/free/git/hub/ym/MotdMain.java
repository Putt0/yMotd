package free.git.hub.ym;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class MotdMain extends JavaPlugin {

	private static Plugin instance;
	
    public static Plugin getInstance() {
        return instance;
    }
	
	@Override
	public void onLoad() {
		instance = this;
		saveDefaultConfig();
		System.out.println("[yMotd] Loading...");
	}
	
	@Override
	public void onEnable() {
		MotdCommon.registerListener();
		System.out.println("[yMotd] Enabled.");
	}
	
	@Override
	public void onDisable() {
		instance = null;
		System.out.println("[yMotd] Disabled.");
	}
}

