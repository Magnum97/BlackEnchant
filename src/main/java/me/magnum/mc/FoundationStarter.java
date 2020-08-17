package me.magnum.mc;

import kr.entree.spigradle.annotations.Plugin;
import lombok.Getter;
import org.mineacademy.fo.plugin.SimplePlugin;

@Plugin
public class FoundationStarter extends SimplePlugin {

	@Getter
	private static FoundationStarter instance;

	@Override
	protected void onPluginStart () {
		instance = this;
		registerCommand(new CustomEnchantsCommand());
	}

}
