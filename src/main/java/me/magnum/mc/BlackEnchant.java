package me.magnum.mc;
import lombok.Getter;
import org.bukkit.enchantments.Enchantment;
import org.mineacademy.fo.model.SimpleEnchantment;

public class BlackEnchant extends SimpleEnchantment {

	@Getter
	private static final Enchantment instance = new BlackEnchant();

	private BlackEnchant() {
		super("Black Nova", 5);
	}
}
