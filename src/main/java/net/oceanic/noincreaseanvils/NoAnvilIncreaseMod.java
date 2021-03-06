package net.oceanic.noincreaseanvils;

import com.mojang.logging.LogUtils;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("noanvilincrease")
public class NoAnvilIncreaseMod
{

    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public NoAnvilIncreaseMod()
    {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the enqueueIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::enqueueIMC);
        // Register the processIMC method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::processIMC);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
//        Method createBoolean = ObfuscationReflectionHelper.findMethod(GameRules.IntegerValue.class, "create",int.class);
//        createBoolean.setAccessible(true);
//            try {
//                Object boolTrue = createBoolean.invoke(GameRules.IntegerValue.class, 20);
//                furnaceSpeedMultiplier = GameRules.register("furnaceSpeedMultiplier", GameRules.Category.UPDATES, (GameRules.Type<GameRules.IntegerValue>) boolTrue);
//            } catch (IllegalAccessException e) {
//                LOGGER.error("Illegal Access Exception!");
//                e.printStackTrace();
//            } catch (InvocationTargetException e) {
//                LOGGER.error("Invocation Target Exception!");
//                e.printStackTrace();
//            }
    }

    private void setup(final FMLCommonSetupEvent event)
    {
    }

    private void enqueueIMC(final InterModEnqueueEvent event)
    {
        // Some example code to dispatch IMC to another mod
    }
    private void processIMC(final InterModProcessEvent event)
    {
    }
    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts

    }



    // You can use EventBusSubscriber to automatically subscribe events on the contained class (this is subscribing to the MOD
    // Event bus for receiving Registry Events)
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent)
        {
        }
    }
}
