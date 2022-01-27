package dev.jakubk15.deaththunder.listener;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

	public void onPlayerDeath(final PlayerDeathEvent event) {
		final Player p = event.getEntity();
		final Location loc = p.getLocation();
		p.getLocation().getWorld().strikeLightning(loc);
	}


}
