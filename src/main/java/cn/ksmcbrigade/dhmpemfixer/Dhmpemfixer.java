package cn.ksmcbrigade.dhmpemfixer;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Dhmpemfixer.MODID)
public class Dhmpemfixer {

    // Define mod id in a common place for everything to reference
    public static final String MODID = "dhmpemfixer";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Dhmpemfixer() {
        LOGGER.info("DH and MPEM Fixer loaded.");
    }
}
