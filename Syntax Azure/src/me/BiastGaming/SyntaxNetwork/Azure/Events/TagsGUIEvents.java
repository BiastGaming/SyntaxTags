package me.BiastGaming.SyntaxNetwork.Azure.Events;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class TagsGUIEvents implements Listener{
	
	HashMap<String, String> tags = new HashMap<String, String>();
	      /*name, tag*/
	
	 
	
	@EventHandler
	public void onTagsClick(InventoryClickEvent ev) {
		
		
		Player sender = (Player) ev.getWhoClicked();
		String senderstring = sender.getName();
		
		
		if (ev.getInventory().getTitle().equals("§5§lSyntax Tags!")) {
			ev.setCancelled(true);
		}
		if (ev.getCurrentItem().getItemMeta().getDisplayName().equals("§2[§dOG§2]")) {
			ev.setCancelled(true);
			sender.sendMessage("§8[§aComplete§8]: §cYou have successfuly enabled the §2[§dOG§2] §atag! ");
			tags.put("§2[§dOG§2]", senderstring);
			
			
			
		}
		if (ev.getCurrentItem().getItemMeta().getDisplayName().equals("§2[§bKannon King§2]")) {
			ev.setCancelled(true);
			sender.sendMessage("§8[§aComplete§8]: §cYou have successfuly enabled the §2[§bKannon King§2] §atag! ");
			tags.put("§2[§bKannon King§2]", senderstring);
			
			
		}
		if (ev.getCurrentItem().getItemMeta().getDisplayName().equals("§2[§bStealth§2]")) {
			ev.setCancelled(true);
			sender.sendMessage("§8[§aComplete§8]: §cYou have successfuly disabled the §2[§bStealth§2] §atag! ");
			tags.put("§2[§bStealth§2", senderstring);
			
			
			
		}
	
		
		
	}
	@EventHandler
	public void onTagChat(AsyncPlayerChatEvent e) {
		
		

		String player = e.getPlayer().getName();
		
		if(tags.containsValue(player)) {
			String tag = tags.get(player);
			e.setFormat(e.getFormat().replaceAll("{TAG}", tag));
		}
	

		
		
	}

}
