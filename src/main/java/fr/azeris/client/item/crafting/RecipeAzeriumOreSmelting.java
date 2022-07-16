
package fr.azeris.client.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import fr.azeris.client.item.ItemAzeriumIngot;
import fr.azeris.client.block.BlockAzeriumOre;
import fr.azeris.client.ElementsAzerisMod;

@ElementsAzerisMod.ModElement.Tag
public class RecipeAzeriumOreSmelting extends ElementsAzerisMod.ModElement {
	public RecipeAzeriumOreSmelting(ElementsAzerisMod instance) {
		super(instance, 7);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(BlockAzeriumOre.block, (int) (1)), new ItemStack(ItemAzeriumIngot.block, (int) (1)), 0.7F);
	}
}
