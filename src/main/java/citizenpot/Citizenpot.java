package citizenpot;

import citizenpot.items.ItemsRegistration;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("citizenpot")
public class Citizenpot {
    public static final String MOD_ID = "citizenpot";

    public Citizenpot(FMLJavaModLoadingContext context) {
        IEventBus modEventBus = context.getModEventBus();

        ItemsRegistration.ITEMS.register(modEventBus);
        ItemsRegistration.CREATIVE_TABS.register(modEventBus);

}
}

