package me.ceriddenn.mccp;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class ToggleCmdOff implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if (sender instanceof Player) {
			if (args.length >= 1) {
				Player added = Bukkit.getPlayer(args[0]);
				Main.toggle.remove(added.getUniqueId());
				player.sendMessage(ChatColor.GREEN + "You have succefully unfrozen" + added.getName());
				added.sendMessage(ChatColor.GREEN + "You have been cleared! You are free to log out.");
			} else {
				player.sendMessage(ChatColor.AQUA + "You did not run the command properly!" + ChatColor.YELLOW + "Correct Syntax. /toggleoff (player)");
				
				
			}
			
			
			
			
			
			
		}
			
		
		
		
		
		return false;
	}

}
