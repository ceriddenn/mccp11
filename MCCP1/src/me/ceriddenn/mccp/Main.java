package me.ceriddenn.mccp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static List<UUID> toggle = new ArrayList<UUID>();
	
	@Override
	public void onEnable() {
		System.out.println("Enabled");
		getServer().getPluginManager().registerEvents(new DismountEvent(), this);
		this.getCommand("toggleon").setExecutor(new ToggleCmd());
		this.getCommand("toggleoff").setExecutor(new ToggleCmdOff());
		
		
	}
	
	public void registerEvents() {
	getServer().getPluginManager().registerEvents(new DismountEvent(), this);
		
		
		
	}

}
