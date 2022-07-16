
package fr.azeris.client.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import fr.azeris.client.ElementsAzerisMod;

@ElementsAzerisMod.ModElement.Tag
public class BlockAzeriumBlock extends ElementsAzerisMod.ModElement {
	@GameRegistry.ObjectHolder("azeris:azerium_block")
	public static final Block block = null;
	public BlockAzeriumBlock(ElementsAzerisMod instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("azerium_block"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("azeris:azerium_block", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.IRON);
			setUnlocalizedName("azerium_block");
			setSoundType(SoundType.METAL);
			setHarvestLevel("pickaxe", 2);
			setHardness(5F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		}
	}
}
