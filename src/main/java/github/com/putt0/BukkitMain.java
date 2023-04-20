package github.com.putt0;

import github.com.putt0.listener.BukkitListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitMain extends JavaPlugin {

    protected void loadService() {
        try {
            BukkitLoader.plugin = this;
            saveDefaultConfig();
            System.out.print("[yMotd] -> Inicializando...");
        } catch (Exception exception) {
            System.out.print("[yMotd] -> Ocorreu um erro ao tentar inicializar: (" + exception + ")");
        }
    }

    protected void enableService() {
        try {
            System.out.print("[yMotd] -> Iniciado!");
        } catch (Exception exception) {
            System.out.print("[yMotd] -> Ocorreu um erro ao inicializar: (" + exception + ")");
        }
    }

    protected void enableListener() {
        PluginManager pluginManager = Bukkit.getPluginManager();
        try {
            pluginManager.registerEvents(new BukkitListener(), BukkitLoader.getPlugin());
            System.out.print("[yMotd] -> Listener registrados!");
        } catch (Exception exception) {
            System.out.print("[yMotd] -> Ocorreu um erro ao inicializar: (" + exception + ")");
        }
    }

    protected void disableService() {
        try {
            System.out.print("[yMotd] -> Desligando...");
            BukkitLoader.plugin = null;
        } catch (Exception exception) {
            System.out.print("[yMotd] -> Ocorreu um erro ao desligar: (" + exception + ")");
        }
    }
}