package me.magnum.mc;
import org.bukkit.entity.Player;
import org.mineacademy.fo.command.SimpleCommand;
import org.mineacademy.fo.menu.model.ItemCreator;
import org.mineacademy.fo.model.SimpleEnchant;
import org.mineacademy.fo.remain.CompMaterial;

public class CustomEnchantsCommand extends SimpleCommand {

	public CustomEnchantsCommand() {
		super("customenchants|ce");
	}

	@Override
	protected void onCommand() {
		checkConsole();

		final Player player = getPlayer();

		player.getInventory().addItem(
				ItemCreator.of(CompMaterial.IRON_SWORD,
						"Black Sword",
						"",
						"Mystical Black Sword",
						"having special abilities.")
						.enchant(new SimpleEnchant(BlackEnchant.getInstance(), 1))
						.build().makeSurvival());

		tell("&6You recieved an item with a custom enchant.");
	}
}
