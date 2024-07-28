package top.leonx.irisflw.fabric;

import net.fabricmc.api.ClientModInitializer;
import top.leonx.irisflw.IrisFlw;

public final class IrisFlwFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        IrisFlw.LOGGER.info("Iris-Flywheel-Compat initialized!");
    }
}
