package me.BiastGaming.SyntaxNetwork.Azure.GUI;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import me.BiastGaming.SyntaxNetwork.Azure.Utils.ItemUtils;

public class SellCommand implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		
		Inventory sell = Bukkit.createInventory(null, 45, ChatColor.AQUA + "Faction Azure Sell!");
		
		
		ItemStack holder = ItemUtils.createItem(Material.REDSTONE_BLOCK, ChatColor.RED + "" + ChatColor.BOLD + "COMING SOON!", 1, Arrays.asList(ChatColor.GREEN + "Suggest Ideas on Forums!", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		
		ItemStack iron64 = ItemUtils.createItem(Material.IRON_INGOT, ChatColor.DARK_PURPLE + "Iron Ingots!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$1200", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack iron32 = ItemUtils.createItem(Material.IRON_INGOT, ChatColor.DARK_PURPLE + "Iron Ingots!", 32, Arrays.asList(ChatColor.DARK_AQUA + "$600", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack iron16 = ItemUtils.createItem(Material.IRON_INGOT, ChatColor.DARK_PURPLE + "Iron Ingots!", 16, Arrays.asList(ChatColor.DARK_AQUA + "$300", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack gold64 = ItemUtils.createItem(Material.GOLD_INGOT, ChatColor.DARK_PURPLE + "Gold Ingots!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$4000", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack gold32 = ItemUtils.createItem(Material.GOLD_INGOT, ChatColor.DARK_PURPLE + "Gold Ingots!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$2000", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack gold16 = ItemUtils.createItem(Material.GOLD_INGOT, ChatColor.DARK_PURPLE + "Gold Ingots!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$1000", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack diamond64 = ItemUtils.createItem(Material.DIAMOND, ChatColor.DARK_PURPLE + "Diamonds!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$5000", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack diamond32 = ItemUtils.createItem(Material.DIAMOND, ChatColor.DARK_PURPLE + "Diamonds!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$2500", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack diamond16 = ItemUtils.createItem(Material.DIAMOND, ChatColor.DARK_PURPLE + "Diamonds!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$1250", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack emerald64 = ItemUtils.createItem(Material.EMERALD, ChatColor.DARK_PURPLE + "Ermerald!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$5000", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack emerald32 = ItemUtils.createItem(Material.EMERALD, ChatColor.DARK_PURPLE + "Emerald!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$2500", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack emerald16 = ItemUtils.createItem(Material.EMERALD, ChatColor.DARK_PURPLE + "Emerald!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$1250", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack cactus64 = ItemUtils.createItem(Material.CACTUS, ChatColor.DARK_PURPLE + "Cactus!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$600", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		ItemStack cookie64 = ItemUtils.createItem(Material.COOKIE, ChatColor.DARK_PURPLE + "Cookie!", 64, Arrays.asList(ChatColor.DARK_AQUA + "$600", ChatColor.GOLD + "Syntax Azure Suite v1.0", ChatColor.GOLD + "Developed by BiastGaming"));
		
		
		
		sell.setItem(0, iron64);
		sell.setItem(1, iron32);
		sell.setItem(2, iron16);
		sell.setItem(3, gold64);
		sell.setItem(4, gold32);
		sell.setItem(5, gold16);
		sell.setItem(6, diamond64);
		sell.setItem(7, diamond32);
		sell.setItem(8, diamond16);
		sell.setItem(9, emerald64);
		sell.setItem(10, emerald32);
		sell.setItem(11, emerald16);
		
		
		sell.setItem(12, cactus64);
		sell.setItem(13, cookie64);
		
		Player player = (Player) sender;
		
		player.openInventory(sell);
		
		
		
		return true;
		
	}
}
