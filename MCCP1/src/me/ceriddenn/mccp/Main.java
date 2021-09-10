package me.ceriddenn.mccp;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	public static List<UUID> toggle = new ArrayList<UUID>();
	public static List<UUID> flytoggle = new ArrayList<UUID>();
	
	@Override
	public void onEnable() {
		System.out.println("Enabled");
		registerEvents();
		registerCommands();
		
	}
	
	public void registerEvents() {
	getServer().getPluginManager().registerEvents(new DismountEvent(), this);
		}
	
	public void registerCommands() {
		this.getCommand("toggleon").setExecutor(new ToggleCmd());
		this.getCommand("toggleoff").setExecutor(new ToggleCmdOff());
		this.getCommand("fly").setExecutor(new FlyToggle());
		
	}
	

}
