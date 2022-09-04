package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class SMGItems {

    private SMGItems() {}

    public static final ItemGroup SMG_ITEM_CATEGORY = new ItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        new CustomItemStack(Material.SMOOTH_STONE, "&a简易材料生成器-Addtions")
    );

    public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
        "SMG_GENERATOR_MULTIBLOCK",
        Material.BEDROCK,
        "&9材料生成器 - 使用方式",
        "",
        "&d该附属中的所有材料生成器",
        "&d都只需要像这样摆放",
        "&a在上方放置一个箱子即可",
        "&b摆好后即可自动生成相应的材料在箱子里面",
            "&4提示:&6所有的生成器默认生成速度&e1t=0.5s"
    );
	
	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&6速度: &e t",
		"",
		"&9&o简易材料生成器"
	);
	*/

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        Material.COBBLESTONE,
        "&7圆石生成器",
        "&6速度: &e4t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        Material.STONE,
        "&7圆石生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        Material.STONE,
        "&7石头生成器",
        "&6速度: &e8t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        Material.SMOOTH_STONE,
        "&7平滑石头生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        Material.SMOOTH_STONE,
        "&7平滑石头生成器",
        "&6速度: &e12t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        Material.GRAVEL,
        "&7沙砾生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        Material.ANDESITE,
        "&7沙砾生成器",
        "&6速度: &e6t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        Material.SAND,
        "&e沙子生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        Material.SANDSTONE,
        "&e沙子生成器",
        "&6速度: &e8t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        Material.GLASS,
        "&f玻璃生成器",
        "&6速度: &e12t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        Material.NETHERRACK,
        "&c下界岩生成器",
        "&6速度: &e6t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        Material.SOUL_SAND,
        "&8灵魂沙生成器",
        "&6速度: &e8t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BADLY_FORMED",
        Material.REDSTONE_BLOCK,
        "&c红石生成器 &8(错误形式)",
        "&8我得重新...",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BROKEN",
        Material.REDSTONE_BLOCK,
        "&c红石生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE",
        Material.REDSTONE_BLOCK,
        "&c红石生成器",
        "&6速度: &e24t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BADLY_FORMED",
        Material.OBSIDIAN,
        "&5黑曜石生成器 &8(错误形式)",
        "&8我得重新...",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BROKEN",
        Material.OBSIDIAN,
        "&5黑曜石生成器 &8(已损坏)",
        "&8需要进行修复",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN",
        Material.OBSIDIAN,
        "&5黑曜石生成器",
        "&6速度: &e128t一个",
        "",
        "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OAKLOG = new SlimefunItemStack(
            "SMG_GENERATOR_OAKLOG",
            Material.OAK_LOG,
            "&a橡木石生成器",
            "&6速度: &e3t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SEA_LANTERN = new SlimefunItemStack(
            "SMG_GENERATOR_SEA_LANTERN",
            Material.SEA_LANTERN,
            "&a海晶灯生成器",
            "&6速度: &e20t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLOWSTONE = new SlimefunItemStack(
            "SMG_GENERATOR_GLOWSTONE",
            Material.GLOWSTONE,
            "&a萤石生成器",
            "&6速度: &e10t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_WITHER_SKELETON_SKULL = new SlimefunItemStack(
            "SMG_GENERATOR_WITHER_SKELETON_SKULL",
            Material.WITHER_SKELETON_SKULL,
            "&4凋零骷髅头生成器",
            "&6速度: &e200t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BRICKS = new SlimefunItemStack(
            "SMG_GENERATOR_STONE_BRICKS",
            Material.STONE_BRICKS,
            "&a石砖生成器",
            "&6速度: &e5t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_CLAY = new SlimefunItemStack(
            "SMG_GENERATOR_CLAY",
            Material.CLAY,
            "&a粘体生成器",
            "&6速度: &e8t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SLIME_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_SLIME_BLOCK",
            Material.SLIME_BLOCK,
            "&a粘液块生成器",
            "&6速度: &e20t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_BEACON = new SlimefunItemStack(
            "SMG_GENERATOR_BEACON",
            Material.BEACON,
            "&6信标生成器",
            "&6速度: &e500t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_WHITE_WOOL = new SlimefunItemStack(
            "SMG_GENERATOR_WHITE_WOOL",
            Material.WHITE_WOOL,
            "&a羊毛生成器",
            "&6速度: &e5t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_ICE = new SlimefunItemStack(
            "SMG_GENERATOR_ICE",
            Material.ICE,
            "&a卧槽！冰！生成器",
            "&6速度: &e5t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_BLUE_ICE = new SlimefunItemStack(
            "SMG_GENERATOR_BLUE_ICE",
            Material.BLUE_ICE,
            "&a卧槽！蓝冰！生成器",
            "&6速度: &e6t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_PACKED_ICE = new SlimefunItemStack(
            "SMG_GENERATOR_PACKED_ICE",
            Material.PACKED_ICE,
            "&a卧槽！浮冰！生成器",
            "&6速度: &e6t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_QUARTZ_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_QUARTZ_BLOCK",
            Material.QUARTZ_BLOCK,
            "&a石英块生成器",
            "&6速度: &e8t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_BONE_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_BONE_BLOCK",
            Material.BONE_BLOCK,
            "&a骨块生成器",
            "&6速度: &e8t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_MAGMA_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_MAGMA_BLOCK",
            Material.MAGMA_BLOCK,
            "&a岩浆块生成器",
            "&6速度: &e8t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_BLACK_SHULKER_BOX = new SlimefunItemStack(
            "SMG_GENERATOR_BLACK_SHULKER_BOX",
            Material.BLACK_SHULKER_BOX,
            "&b潜影盒生成器",
            "&6速度: &e120t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_BRICKS = new SlimefunItemStack(
            "SMG_GENERATOR_BRICKS",
            Material.BRICKS,
            "&a红砖块生成器",
            "&6速度: &e10t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_TERRACOTTA = new SlimefunItemStack(
            "SMG_GENERATOR_TERRACOTTA",
            Material.TERRACOTTA,
            "&a陶瓦生成器",
            "&6速度: &e6t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_IRON_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_IRON_BLOCK",
            Material.IRON_BLOCK,
            "&d铁块生成器",
            "&6速度: &e30t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_COAL_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_COAL_BLOCK",
            Material.COAL_BLOCK,
            "&d煤炭块生成器",
            "&6速度: &e20t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_LAPIS_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_LAPIS_BLOCK",
            Material.LAPIS_BLOCK,
            "&d青金石生成器",
            "&6速度: &e25t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GOLD_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_GOLD_BLOCK",
            Material.GOLD_BLOCK,
            "&d金块生成器",
            "&6速度: &e45t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_DIAMOND_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_DIAMOND_BLOCK",
            Material.DIAMOND_BLOCK,
            "&4钻石块生成器",
            "&6速度: &e80t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERITE_BLOCK = new SlimefunItemStack(
            "SMG_GENERATOR_NETHERITE_BLOCK",
            Material.NETHERITE_BLOCK,
            "&4下届合金块生成器",
            "&6速度: &e700t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_YELLOW_CONCRETE = new SlimefunItemStack(
            "SMG_GENERATOR_YELLOW_CONCRETE",
            Material.YELLOW_CONCRETE,
            "&d附魔金苹果生成器",
            "&6速度: &e80t一个",
            "",
            "&9&o简易材料生成器"
    );

    public static final SlimefunItemStack SMG_GENERATOR_YELLOW_CONCRETE_POWDERE = new SlimefunItemStack(
            "SMG_GENERATOR_YELLOW_CONCRETE_POWDERE",
            Material.YELLOW_CONCRETE_POWDER,
            "&b金苹果生成器",
            "&6速度: &e4t一个",
            "",
            "&9&o简易材料生成器"
    );
}
