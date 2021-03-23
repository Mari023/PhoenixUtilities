package de.mari_023.forge.phoenixutilities;

import de.mari_023.forge.phoenixutilities.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(
        modid = PhoenixUtilities.MOD_ID,
        name = PhoenixUtilities.MOD_NAME,
        version = PhoenixUtilities.VERSION
)
public class PhoenixUtilities {

    public static final String MOD_ID = "phoenixutilities";
    public static final String MOD_NAME = "Phönix Utilities";
    public static final String VERSION = "1.0-SNAPSHOT";

    /**
     * This is the instance of your mod as created by Forge. It will never be null.
     */
    @Mod.Instance(MOD_ID)
    public static PhoenixUtilities INSTANCE;

    /**
     * This is the first initialization event. Register tile entities here.
     * The registry events below will have fired prior to entry to this method.
     */
    @Mod.EventHandler
    public void preinit(FMLPreInitializationEvent event) {

    }

    /**
     * This is the second initialization event. Register custom recipes
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(new DeathEventHandler());
    }

    /**
     * This is the final initialization event. Register actions from other mods here
     */
    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }

    public static final CreativeTabs tabPhoenixUtilities = (new CreativeTabs("phoenixutilities") {

        @Override
        public ItemStack createIcon() {
            return new ItemStack(Items.test);
        }
    });

    /**
     * Forge will automatically look up and bind blocks to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Blocks {
        //public static final Block block = null;
    }

    /**
     * Forge will automatically look up and bind items to the fields in this class
     * based on their registry name.
     */
    @GameRegistry.ObjectHolder(MOD_ID)
    public static class Items {
        //public static final ItemBlock itemBlock = null; // itemblock for the block above
        public static final ItemBase test = new ItemBase("test");
    }

    /**
     * This is a special class that listens to registry events, to allow creation of mod blocks and items at the proper time.
     */
    @Mod.EventBusSubscriber
    public static class ObjectRegistryHandler {
        /**
         * Listen for the register event for creating custom items
         */
        @SubscribeEvent
        public static void addItems(RegistryEvent.Register<Item> event) {
            //event.getRegistry().register(new ItemBlock(Blocks.Block).setRegistryName(MOD_ID, "block"));
            event.getRegistry().register(Items.test);
            event.getRegistry().register(new ItemBase("ash"));
            event.getRegistry().register(new ItemBase("binding_sticky_twine"));
            event.getRegistry().register(new ItemBase("binding_yarn"));
            event.getRegistry().register(new ItemBase("bone_pickaxe"));
            event.getRegistry().register(new ItemBase("bone-wood_pickaxe"));
            event.getRegistry().register(new ItemBase("bronze_saw"));
            event.getRegistry().register(new ItemBase("cardboard_sheet"));
            event.getRegistry().register(new ItemBase("certus_die"));
            event.getRegistry().register(new ItemBase("cloth"));
            event.getRegistry().register(new ItemBase("companion_cube"));
            event.getRegistry().register(new ItemBase("flint-bone_pickax"));
            event.getRegistry().register(new ItemBase("flint-wood_pickaxe"));
            event.getRegistry().register(new ItemBase("glue_bottle"));
            event.getRegistry().register(new ItemBase("goo"));
            event.getRegistry().register(new ItemBase("ingotcreative"));
            event.getRegistry().register(new ItemBase("iron_saw"));
            event.getRegistry().register(new ItemBase("mechanicalconnector"));
            event.getRegistry().register(new ItemBase("paper_wet"));
            event.getRegistry().register(new ItemBase("potash"));
            event.getRegistry().register(new ItemBase("saw"));
            event.getRegistry().register(new ItemBase("soap"));
            event.getRegistry().register(new ItemBase("stamped_potato"));
            event.getRegistry().register(new ItemBase("starch"));
            event.getRegistry().register(new ItemBase("steel_saw"));
            event.getRegistry().register(new ItemBase("sticky_twine"));
            event.getRegistry().register(new ItemBase("stone_chisel_head"));
            event.getRegistry().register(new ItemBase("stone_chisel"));
            event.getRegistry().register(new ItemBase("stringwoven"));
            event.getRegistry().register(new ItemBase("tallow"));
            event.getRegistry().register(new ItemBase("trowel"));
            event.getRegistry().register(new ItemBase("unfired_clay_brick"));
            event.getRegistry().register(new ItemBase("weavingsticks"));
            event.getRegistry().register(new ItemBase("yarn"));
        }

        /**
         * Listen for the register event for creating custom blocks
         */
        @SubscribeEvent
        public static void addBlocks(RegistryEvent.Register<Block> event) {
           /*
             event.getRegistry().register(new Block().setRegistryName(MOD_ID, "block"));
            */
        }
    }
}
