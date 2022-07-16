
package fr.azeris.client.item;

@ElementsAzerisMod.ModElement.Tag
public class ItemAzeriumAxe extends ElementsAzerisMod.ModElement {

	@GameRegistry.ObjectHolder("azeris:azerium_axe")
	public static final Item block = null;

	public ItemAzeriumAxe(ElementsAzerisMod instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemToolCustom() {

		}.setUnlocalizedName("azerium_axe").setRegistryName("azerium_axe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("azeris:azerium_axe", "inventory"));
	}

	private static class ItemToolCustom extends ItemTool {

		private static final Set<Block> effective_items_set = com.google.common.collect.Sets
				.newHashSet(new Block[]{Blocks.PLANKS, Blocks.BOOKSHELF, Blocks.LOG, Blocks.LOG2, Blocks.CHEST, Blocks.PUMPKIN, Blocks.LIT_PUMPKIN,
						Blocks.MELON_BLOCK, Blocks.LADDER, Blocks.WOODEN_BUTTON, Blocks.WOODEN_PRESSURE_PLATE});

		protected ItemToolCustom() {
			super(EnumHelper.addToolMaterial("AZERIUM_AXE", 2, 250, 6f, -2f, 14), effective_items_set);
			this.attackDamage = -2f;

			this.attackSpeed = -3f;
		}

		@Override
		public float getDestroySpeed(ItemStack stack, IBlockState state) {
			Material material = state.getMaterial();
			return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE
					? super.getDestroySpeed(stack, state)
					: this.efficiency;
		}

	}

}