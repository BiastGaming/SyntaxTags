package me.BiastGaming.SyntaxNetwork.Azure.Utils;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemUtils {
	
	public static ItemStack createItem(Material material, String name, int ammount, List<String> lore) {
		ItemStack item = new ItemStack(material, ammount);
		ItemMeta meta = item.getItemMeta();
		meta.setDisplayName(name);
		meta.setLore(lore);
		item.setItemMeta(meta);
		return item;
	}
	public static ItemStack createPane(String name, int ammount, List<String> lore, int color) {
		ItemStack pane = new ItemStack(Material.STAINED_GLASS_PANE, ammount, (short) color);
		ItemMeta pmeta = pane.getItemMeta();
		pmeta.setDisplayName(name);
		pmeta.setLore(lore);
		pane.setItemMeta(pmeta);
		return pane;
	}
	



}
