package me.ceriddenn.mccp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ToggleCmd implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
			Main.toggle.add(player.getUniqueId());
			
			
		}
		
		
		
		
		
		return false;
	}

}
