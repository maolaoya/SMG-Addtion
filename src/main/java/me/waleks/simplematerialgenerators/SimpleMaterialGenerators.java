package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import net.guizhanss.guizhanlib.updater.GuizhanBuildsUpdater;
import org.bukkit.plugin.java.JavaPlugin;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class SimpleMaterialGenerators extends JavaPlugin implements SlimefunAddon {

    private static SimpleMaterialGenerators instance;

    @Override
    public void onEnable() {
        setInstance(this);

        Config cfg = new Config(this);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build ")) {
            new GuizhanBuildsUpdater(this, getFile(), "SlimefunGuguProject", "SMG", "master", false).start();
        }

        SMGItemSetup.setup(this);
    }

    @Override
    public void onDisable() {
        setInstance(null);
    }

    @Nonnull
    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimefunGuguProject/SMG/issues";
    }

    @Nonnull
    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }

    @Nonnull
    public static SimpleMaterialGenerators getInstance() {
        return instance;
    }

    private static void setInstance(@Nullable SimpleMaterialGenerators instance) {
        SimpleMaterialGenerators.instance = instance;
    }
}
