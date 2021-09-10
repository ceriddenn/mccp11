package me.ceriddenn.mccp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleCmdOff implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if (Main.toggle.contains(player.getUniqueId())) {
			Main.toggle.remove(player.getUniqueId());
			
			
			
		}
			
		
		
		
		
		return false;
	}

}
