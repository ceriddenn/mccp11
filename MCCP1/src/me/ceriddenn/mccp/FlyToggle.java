package me.ceriddenn.mccp;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class FlyToggle implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (sender instanceof Player) {
				Main.flytoggle.add(player.getUniqueId());
				player.setAllowFlight(true);
				
			} else {
				player.sendMessage("You did not provide a player!");
			}
			if (Main.flytoggle.contains(player.getUniqueId())) {
				Main.flytoggle.remove(player.getUniqueId());
				player.setAllowFlight(true);
				
				
						
						
				
			}
			
			
			
			
			
		return false;
	}

}
