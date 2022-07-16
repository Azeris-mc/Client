
package fr.azeris.client.creativetab;

@ElementsAzerisMod.ModElement.Tag
public class TabAzerisTab extends ElementsAzerisMod.ModElement {

	public TabAzerisTab(ElementsAzerisMod instance) {
		super(instance, 23);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabazeris_tab") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ItemAzeriumIngot.block, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static CreativeTabs tab;

}
