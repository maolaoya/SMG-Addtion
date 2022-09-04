package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.waleks.simplematerialgenerators.items.BrokenGenerator;
import me.waleks.simplematerialgenerators.items.GeneratorMultiblock;
import me.waleks.simplematerialgenerators.items.MaterialGenerator;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;

public final class SMGItemSetup {

    private SMGItemSetup() {}

    public static void setup(@Nonnull SimpleMaterialGenerators plugin) {
        new GeneratorMultiblock(SMGItems.SMG_ITEM_CATEGORY, SMGItems.SMG_GENERATOR_MULTIBLOCK).register(plugin);

		/*	Template for adding more items
		new MaterialGenerator(SMGItems.SMG_ITEM_CATEGORY,
			SMGItems.SMG_GENERATOR_,
			RecipeType.ENHANCED_CRAFTING_TABLE,
			new ItemStack[] {
				null, null, null,
				null, null, null,
		 		null, null, null
		 	})
		.setItem(Material.)
		.setRate(1)
		.register(plugin);
		*/

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_COBBLESTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.LAVA_BUCKET), new ItemStack(Material.IRON_PICKAXE), new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE), new ItemStack(Material.SMOOTH_STONE)
            }, 4)
            .setItem(Material.COBBLESTONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_STONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE),
                SlimefunItems.SOLDER_INGOT, SMGItems.SMG_GENERATOR_STONE_BROKEN, SlimefunItems.SOLDER_INGOT,
                new ItemStack(Material.STONE), SlimefunItems.SOLDER_INGOT, new ItemStack(Material.STONE)
            }, 8)
            .setItem(Material.STONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_STONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SMOOTH_STONE,
            RecipeType.SMELTERY,
            new ItemStack[] {
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE),
                new ItemStack(Material.IRON_BARS), SMGItems.SMG_GENERATOR_SMOOTH_STONE_BROKEN, new ItemStack(Material.IRON_BARS),
                new ItemStack(Material.SMOOTH_STONE), SlimefunItems.STEEL_INGOT, new ItemStack(Material.SMOOTH_STONE)
            }, 12)
            .setItem(Material.SMOOTH_STONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL_BROKEN,
            RecipeType.GRIND_STONE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GRAVEL,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS),
                SlimefunItems.BILLON_INGOT, SMGItems.SMG_GENERATOR_GRAVEL_BROKEN, SlimefunItems.BILLON_INGOT,
                new ItemStack(Material.STONE_BRICKS), SlimefunItems.BILLON_INGOT, new ItemStack(Material.STONE_BRICKS)
            }, 6)
            .setItem(Material.GRAVEL)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_GRAVEL, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE),
                SlimefunItems.DURALUMIN_INGOT, SMGItems.SMG_GENERATOR_SAND_BROKEN, SlimefunItems.DURALUMIN_INGOT,
                new ItemStack(Material.SANDSTONE), SlimefunItems.DURALUMIN_INGOT, new ItemStack(Material.SANDSTONE)
            }, 8)
            .setItem(Material.SAND)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_GLASS,
            RecipeType.SMELTERY,
            new ItemStack[] {
                SlimefunItems.BRONZE_INGOT, SlimefunItems.GOLD_8K, SlimefunItems.BRONZE_INGOT,
                SlimefunItems.BRASS_INGOT, SMGItems.SMG_GENERATOR_SAND, SlimefunItems.BRASS_INGOT,
                null, null, null
            }, 12)
            .setItem(Material.GLASS)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_NETHERRACK,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT, SlimefunItems.SOLDER_INGOT,
                SMGItems.SMG_GENERATOR_STONE, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_STONE,
                SMGItems.SMG_GENERATOR_STONE, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_STONE
            }, 6)
            .setItem(Material.NETHERRACK)
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_SOUL_SAND,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.STEEL_INGOT, new ItemStack(Material.SPIDER_EYE), SlimefunItems.STEEL_INGOT,
                new ItemStack(Material.ROTTEN_FLESH), new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.BONE),
                SMGItems.SMG_GENERATOR_SAND, SlimefunItems.COMPOSTER, SMGItems.SMG_GENERATOR_SAND
            }, 8)
            .setItem(Material.SOUL_SAND)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_REDSTONE_BADLY_FORMED,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                    SMGItems.SMG_GENERATOR_SAND, null, SMGItems.SMG_GENERATOR_GRAVEL,
                    null, null, null,
                    null, null, null
                })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                RecipeType.ORE_CRUSHER,
                new ItemStack[] {
                    SMGItems.SMG_GENERATOR_REDSTONE_BADLY_FORMED, null, null,
                    null, null, null,
                    null, null, null
                })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_REDSTONE,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, new ItemStack(Material.REDSTONE_ORE), SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SMGItems.SMG_GENERATOR_REDSTONE_BROKEN, SMGItems.SMG_GENERATOR_GRAVEL, SMGItems.SMG_GENERATOR_REDSTONE_BROKEN,
                SlimefunItems.DAMASCUS_STEEL_INGOT, SlimefunItems.DURALUMIN_INGOT, SlimefunItems.DAMASCUS_STEEL_INGOT
            }, 24)
            .setItem(Material.REDSTONE)
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_COBBLESTONE, null, SMGItems.SMG_GENERATOR_STONE,
                null, SlimefunItems.COBALT_PICKAXE, null,
                SMGItems.SMG_GENERATOR_SMOOTH_STONE, null, SMGItems.SMG_GENERATOR_NETHERRACK
            })
            .register(plugin);

        new BrokenGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
            RecipeType.ORE_CRUSHER,
            new ItemStack[] {
                SMGItems.SMG_GENERATOR_OBSIDIAN_BADLY_FORMED, null, null,
                null, null, null,
                null, null, null
            })
            .register(plugin);

        new MaterialGenerator(
            SMGItems.SMG_ITEM_CATEGORY,
            SMGItems.SMG_GENERATOR_OBSIDIAN,
            RecipeType.ENHANCED_CRAFTING_TABLE,
            new ItemStack[] {
                SlimefunItems.REINFORCED_ALLOY_INGOT, new ItemStack(Material.WATER_BUCKET), SlimefunItems.REINFORCED_ALLOY_INGOT,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, SMGItems.SMG_GENERATOR_STONE, SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN,
                SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN, new ItemStack(Material.LAVA_BUCKET), SMGItems.SMG_GENERATOR_OBSIDIAN_BROKEN
            }, 128)
            .setItem(Material.OBSIDIAN)
            .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_OAKLOG,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_OAKLOG, null, null,
                        null, null, null,
                        null, null, null
                }, 3)
                .setItem(Material.OAK_LOG)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_SEA_LANTERN,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_SEA_LANTERN, null, null,
                        null, null, null,
                        null, null, null
                }, 20)
                .setItem(Material.SEA_LANTERN)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_GLOWSTONE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_GLOWSTONE, null, null,
                        null, null, null,
                        null, null, null
                }, 10)
                .setItem(Material.GLOWSTONE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_WITHER_SKELETON_SKULL,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_WITHER_SKELETON_SKULL, null, null,
                        null, null, null,
                        null, null, null
                }, 200)
                .setItem(Material.WITHER_SKELETON_SKULL)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_STONE_BRICKS,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_STONE_BRICKS, null, null,
                        null, null, null,
                        null, null, null
                }, 5)
                .setItem(Material.STONE_BRICKS)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_CLAY,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_CLAY,null, null,
                        null, null, null,
                        null, null, null
                }, 8)
                .setItem(Material.CLAY)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_SLIME_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_SLIME_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 20)
                .setItem(Material.SLIME_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_BEACON,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_BEACON,null, null,
                        null, null, null,
                        null, null, null
                }, 500)
                .setItem(Material.BEACON)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_WHITE_WOOL,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_WHITE_WOOL,null, null,
                        null, null, null,
                        null, null, null
                }, 5)
                .setItem(Material.WHITE_WOOL)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_ICE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_ICE,null, null,
                        null, null, null,
                        null, null, null
                }, 5)
                .setItem(Material.ICE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_BLUE_ICE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_BLUE_ICE,null, null,
                        null, null, null,
                        null, null, null
                }, 5)
                .setItem(Material.BLUE_ICE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_PACKED_ICE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_PACKED_ICE,null, null,
                        null, null, null,
                        null, null, null
                }, 6)
                .setItem(Material.PACKED_ICE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_QUARTZ_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_QUARTZ_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 8)
                .setItem(Material.QUARTZ_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_BONE_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_BONE_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 8)
                .setItem(Material.BONE_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_MAGMA_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_MAGMA_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 8)
                .setItem(Material.MAGMA_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_BLACK_SHULKER_BOX,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_BLACK_SHULKER_BOX,null, null,
                        null, null, null,
                        null, null, null
                }, 120)
                .setItem(Material.BLACK_SHULKER_BOX)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_BRICKS,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_BRICKS,null, null,
                        null, null, null,
                        null, null, null
                }, 10)
                .setItem(Material.BRICK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_TERRACOTTA,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_TERRACOTTA,null, null,
                        null, null, null,
                        null, null, null
                }, 6)
                .setItem(Material.TERRACOTTA)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_IRON_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_IRON_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 30)
                .setItem(Material.IRON_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_COAL_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_COAL_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 20)
                .setItem(Material.COAL_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_LAPIS_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_LAPIS_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 25)
                .setItem(Material.LAPIS_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_GOLD_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_GOLD_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 45)
                .setItem(Material.GOLD_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_DIAMOND_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_DIAMOND_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 80)
                .setItem(Material.DIAMOND_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_NETHERITE_BLOCK,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_NETHERITE_BLOCK,null, null,
                        null, null, null,
                        null, null, null
                }, 700)
                .setItem(Material.NETHERITE_BLOCK)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_YELLOW_CONCRETE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_YELLOW_CONCRETE,null, null,
                        null, null, null,
                        null, null, null
                }, 80)
                .setItem(Material.ENCHANTED_GOLDEN_APPLE)
                .register(plugin);

        new MaterialGenerator(
                SMGItems.SMG_ITEM_CATEGORY,
                SMGItems.SMG_GENERATOR_YELLOW_CONCRETE_POWDERE,
                RecipeType.ENHANCED_CRAFTING_TABLE,
                new ItemStack[] {
                        SMGItems.SMG_GENERATOR_YELLOW_CONCRETE_POWDERE,null, null,
                        null, null, null,
                        null, null, null
                }, 40)
                .setItem(Material.GOLDEN_APPLE)
                .register(plugin);
    }
}
