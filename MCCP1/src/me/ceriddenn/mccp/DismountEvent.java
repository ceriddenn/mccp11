package me.ceriddenn.mccp;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class DismountEvent implements Listener {
	@EventHandler
	public void onDismount(PlayerMoveEvent event) {
		Player player = event.getPlayer();
		if (Main.toggle.contains(player.getUniqueId())) {
			event.setCancelled(true);	
			
		}
		if (!(Main.toggle.contains(player.getUniqueId()))) {
			event.setCancelled(false);
			
			
		}
		
		
		
		
		
		
	}
}
