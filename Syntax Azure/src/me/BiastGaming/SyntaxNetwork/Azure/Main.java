package me.BiastGaming.SyntaxNetwork.Azure;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.BiastGaming.SyntaxNetwork.Azure.Events.TagsGUIEvents;
import me.BiastGaming.SyntaxNetwork.Azure.GUI.SellCommand;
import me.BiastGaming.SyntaxNetwork.Azure.GUI.TagsGUI;

public class Main extends JavaPlugin{
	
	public void onEnable() {
		
		
		
		getCommand("tags").setExecutor(new TagsGUI());
		Bukkit.getServer().getPluginManager().registerEvents(new TagsGUIEvents(), this);
		
		
	
	}



}
