
package fr.azeris.client.item.crafting;

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
