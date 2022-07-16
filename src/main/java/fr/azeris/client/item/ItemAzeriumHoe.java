
package fr.azeris.client.item;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;

import java.util.Set;
import java.util.HashMap;

import fr.azeris.client.ElementsAzerisMod;

@ElementsAzerisMod.ModElement.Tag
public class ItemAzeriumHoe extends ElementsAzerisMod.ModElement {
	@GameRegistry.ObjectHolder("azeris:azerium_hoe")
	public static final Item block = null;
	public ItemAzeriumHoe(ElementsAzerisMod instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemHoe(EnumHelper.addToolMaterial("AZERIUM_HOE", 2, 250, 6f, 0f, 14)) {
			public Set<String> getToolClasses(ItemStack stack) {
				HashMap<String, Integer> ret = new HashMap<String, Integer>();
				ret.put("hoe", 2);
				return ret.keySet();
			}
		}.setUnlocalizedName("azerium_hoe").setRegistryName("azerium_hoe").setCreativeTab(CreativeTabs.TOOLS));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("azeris:azerium_hoe", "inventory"));
	}
}
