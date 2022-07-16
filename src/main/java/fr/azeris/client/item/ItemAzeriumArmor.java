
package fr.azeris.client.item;

@ElementsAzerisMod.ModElement.Tag
public class ItemAzeriumArmor extends ElementsAzerisMod.ModElement {

	@GameRegistry.ObjectHolder("azeris:azerium_armorhelmet")
	public static final Item helmet = null;

	@GameRegistry.ObjectHolder("azeris:azerium_armorbody")
	public static final Item body = null;

	@GameRegistry.ObjectHolder("azeris:azerium_armorlegs")
	public static final Item legs = null;

	@GameRegistry.ObjectHolder("azeris:azerium_armorboots")
	public static final Item boots = null;

	public ItemAzeriumArmor(ElementsAzerisMod instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		ItemArmor.ArmorMaterial enuma = EnumHelper.addArmorMaterial("AZERIUM_ARMOR", "azeris:test", 20, new int[]{10, 20, 25, 10}, 10,
				(net.minecraft.util.SoundEvent) net.minecraft.util.SoundEvent.REGISTRY.getObject(new ResourceLocation("")), 3f);

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.HEAD) {

			@Override
			public void onArmorTick(World world, EntityPlayer entity, ItemStack itemstack) {
				super.onArmorTick(world, entity, itemstack);
				int x = (int) entity.posX;
				int y = (int) entity.posY;
				int z = (int) entity.posZ;
				{
					Map<String, Object> $_dependencies = new HashMap<>();

					$_dependencies.put("entity", entity);

					ProcedureCasquep.executeProcedure($_dependencies);
				}
			}
		}.setUnlocalizedName("azerium_armorhelmet").setRegistryName("azerium_armorhelmet").setCreativeTab(TabAzerisTab.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.CHEST).setUnlocalizedName("azerium_armorbody")
				.setRegistryName("azerium_armorbody").setCreativeTab(TabAzerisTab.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.LEGS).setUnlocalizedName("azerium_armorlegs")
				.setRegistryName("azerium_armorlegs").setCreativeTab(TabAzerisTab.tab));

		elements.items.add(() -> new ItemArmor(enuma, 0, EntityEquipmentSlot.FEET).setUnlocalizedName("azerium_armorboots")
				.setRegistryName("azerium_armorboots").setCreativeTab(TabAzerisTab.tab));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(helmet, 0, new ModelResourceLocation("azeris:azerium_armorhelmet", "inventory"));
		ModelLoader.setCustomModelResourceLocation(body, 0, new ModelResourceLocation("azeris:azerium_armorbody", "inventory"));
		ModelLoader.setCustomModelResourceLocation(legs, 0, new ModelResourceLocation("azeris:azerium_armorlegs", "inventory"));
		ModelLoader.setCustomModelResourceLocation(boots, 0, new ModelResourceLocation("azeris:azerium_armorboots", "inventory"));
	}

}
