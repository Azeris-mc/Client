
package fr.azeris.client.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;

import fr.azeris.client.item.ItemAzeriumIngot;
import fr.azeris.client.ElementsAzerisMod;

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
