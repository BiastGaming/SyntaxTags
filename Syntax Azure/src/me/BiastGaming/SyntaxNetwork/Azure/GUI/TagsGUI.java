package me.BiastGaming.SyntaxNetwork.Azure.GUI;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.BiastGaming.SyntaxNetwork.Azure.Utils.ItemUtils;


public class TagsGUI implements CommandExecutor{
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		
		if(!(sender instanceof Player)) {
			sender.sendMessage("NO");
		}
		
		Player player = (Player) sender;
		
		Inventory tags = Bukkit.createInventory(null, 45, "§5§lSyntax Tags!");
		ItemStack OG = ItemUtils.createItem(Material.NAME_TAG, "§2[§dOG§2]" , 1, Arrays.asList("§cYou can enable this tag!", "§6Syntax tags developed by BiastGaming"));
		ItemStack KannonKing = ItemUtils.createItem(Material.NAME_TAG, "§2[§bKannon King§2]" , 1, Arrays.asList("§cYou can enable this tag!", "§6Syntax tags developed by BiastGaming"));
		ItemStack Stealth = ItemUtils.createItem(Material.NAME_TAG, "§2[§bStealth§2]" , 1, Arrays.asList("§cYou can enable this tag!", "§6Syntax tags developed by BiastGaming"));
		ItemStack noperm = ItemUtils.createPane("§cTag not Available", 1, Arrays.asList("§dPurchase from /buy","§6Syntax tags developed by BiastGaming" ), 14);

		
		
		
		if(sender.hasPermission("Biast.tags.og")) {
			
			tags.setItem(0, OG);
			
		
		
		if(sender.hasPermission("Biast.tags.kannonking")) {
			tags.setItem(1, KannonKing);
			
		}
		if(sender.hasPermission("Biast.tags.stealth")) {
			tags.setItem(2, Stealth);

		
		}
		for (int i = 0; i < tags.getSize() ; i++) {
			if (tags.getItem(i) == null) {
				
				tags.setItem(i, noperm);
			}
		}
		player.openInventory(tags);
		}
		return true;
	}
}
		

		

			
							    	
				    	
				
				
				
	
