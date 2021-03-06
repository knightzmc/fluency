package me.bristermitten.fluency.button;

import me.bristermitten.fluency.FluentBuilder;
import me.bristermitten.fluency.button.click.HandlerBuilder;
import me.bristermitten.fluency.data.ButtonHolder;
import me.bristermitten.fluency.menu.MenuBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemFlag;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;
import java.util.Set;

public interface ButtonBuilder extends FluentBuilder<MenuButton, MenuBuilder> {
	@NotNull ButtonBuilder amount(int amount);

	int amount();

	@NotNull ButtonBuilder type(Material type);

	@NotNull
	Material type();

	@NotNull ButtonBuilder data(short data);

	short data();

	@NotNull ButtonBuilder name(@Nullable String name);

	@Nullable
	String name();

	/**
	 * Set the lore of this Button
	 * @param lore the new lore
	 * @return this builder
	 */
	@NotNull ButtonBuilder lore(String... lore);
	/**
	 * Set the lore of this Button
	 * @param lore the new lore
	 * @return this builder
	 */
	@NotNull ButtonBuilder lore(@NotNull List<String> lore);
	/**
	 * Add to the lore of this Button
	 * @param lore the lore to add
	 * @return this builder
	 */
	@NotNull ButtonBuilder addLore(String... lore);

	@NotNull List<String> lore();

	@NotNull ButtonBuilder unbreakable();

	@NotNull ButtonBuilder breakable();

	boolean isUnbreakable();

	@NotNull ButtonBuilder enchant(Enchantment enchantment, int level);

	@NotNull Map<Enchantment, Integer> enchantments();

	@NotNull ButtonBuilder addFlags(ItemFlag... flags);

	@NotNull Set<ItemFlag> flags();

	@NotNull HandlerBuilder<ButtonBuilder> onClick();

	@NotNull HandlerBuilder<ButtonBuilder> onClick(ClickType type);

	@NotNull MenuButton build();

	@NotNull ButtonHolder getHolder();
}
