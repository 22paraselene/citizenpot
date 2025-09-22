package citizenpot.items;

import citizenpot.Citizenpot;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsRegistration {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Citizenpot.MOD_ID);
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Citizenpot.MOD_ID);

    public static final RegistryObject<Item> FOOD_INGREDIENTS_DAIRY =
            ITEMS.register("food_ingredients_dairy", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_EGG =
            ITEMS.register("food_ingredients_egg", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_FISH =
            ITEMS.register("food_ingredients_fish", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_FROZEN =
            ITEMS.register("food_ingredients_frozen", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_FRUIT =
            ITEMS.register("food_ingredients_fruit", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_INEDIBLE =
            ITEMS.register("food_ingredients_inedible", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_MEAT =
            ITEMS.register("food_ingredients_meat", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_MONSTER =
            ITEMS.register("food_ingredients_monster", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_SWEETENER =
            ITEMS.register("food_ingredients_sweetener", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_VEGGIE =
            ITEMS.register("food_ingredients_veggie", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_GRAIN =
            ITEMS.register("food_ingredients_grain", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOOD_INGREDIENTS_BREAD =
            ITEMS.register("food_ingredients_bread", () -> new Item(new Item.Properties()));

    public static final RegistryObject<CreativeModeTab> metalmith_TAB = CREATIVE_TABS.register(
            "metalmith_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.citizenpot"))
                    .icon(() -> new ItemStack(FOOD_INGREDIENTS_FRUIT.get())) // 分类图标
                    .displayItems((params, output) -> {
                        output.accept(FOOD_INGREDIENTS_DAIRY.get());
                        output.accept(FOOD_INGREDIENTS_EGG.get());
                        output.accept(FOOD_INGREDIENTS_FISH.get());
                        output.accept(FOOD_INGREDIENTS_FROZEN.get());
                        output.accept(FOOD_INGREDIENTS_FRUIT.get());
                        output.accept(FOOD_INGREDIENTS_INEDIBLE.get());
                        output.accept(FOOD_INGREDIENTS_MEAT.get());
                        output.accept(FOOD_INGREDIENTS_MONSTER.get());
                        output.accept(FOOD_INGREDIENTS_SWEETENER.get());
                        output.accept(FOOD_INGREDIENTS_VEGGIE.get());
                        output.accept(FOOD_INGREDIENTS_GRAIN.get());
                        output.accept(FOOD_INGREDIENTS_BREAD.get());
                    })
                    .build()
    );
}
