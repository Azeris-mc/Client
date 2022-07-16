
package fr.azeris.client.item;

@ElementsAzerisMod.ModElement.Tag
public class ItemAzeriumPickaxe extends ElementsAzerisMod.ModElement {

	@GameRegistry.ObjectHolder("azeris:azerium_pickaxe")
	public static final Item block = null;

	public ItemAzeriumPickaxe(ElementsAzerisMod instance) {
		super(instance, 8);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemPickaxe(EnumHelper.addToolMaterial("AZERIUM_PICKAXE", 2, 250, 6f, -2f, 14)) {

			{
				this.attackSpeed = -3f;
			}

			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("pickaxe", 2);
				return ret.keySet();
			}

		}.setUnlocalizedName("azerium_pickaxe").setRegistryName("azerium_pickaxe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("azeris:azerium_pickaxe", "inventory"));
	}

}
