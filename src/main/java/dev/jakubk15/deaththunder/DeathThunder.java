package dev.jakubk15.deaththunder;

import dev.jakubk15.deaththunder.listener.PlayerDeathListener;
import org.mineacademy.fo.plugin.SimplePlugin;

public class DeathThunder extends SimplePlugin {

	@Override
	protected void onPluginStart() {
		registerEvents(new PlayerDeathListener());
	}
}
