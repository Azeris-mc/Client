
package fr.azeris.client.item;

@ElementsAzerisMod.ModElement.Tag
public class ItemAzeriumShovel extends ElementsAzerisMod.ModElement {

	@GameRegistry.ObjectHolder("azeris:azerium_shovel")
	public static final Item block = null;

	public ItemAzeriumShovel(ElementsAzerisMod instance) {
		super(instance, 11);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemSpade(EnumHelper.addToolMaterial("AZERIUM_SHOVEL", 2, 250, 6f, -2f, 14)) {

			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("spade", 2);
				return ret.keySet();
			}

		}.setUnlocalizedName("azerium_shovel").setRegistryName("azerium_shovel").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("azeris:azerium_shovel", "inventory"));
	}

}
