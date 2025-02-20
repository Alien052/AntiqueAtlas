package hunternif.mc.impl.atlas.client;

import hunternif.mc.impl.atlas.AntiqueAtlasMod;
import hunternif.mc.impl.atlas.client.texture.ITexture;
import hunternif.mc.impl.atlas.client.texture.TileTexture;
import hunternif.mc.impl.atlas.util.Log;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.resource.SimpleResourceReloadListener;
import net.minecraft.resource.ResourceManager;
import net.minecraft.util.Identifier;
import net.minecraft.util.InvalidIdentifierException;
import net.minecraft.util.profiler.Profiler;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

/**
 * Reads all png files available under assets/(?modid)/textures/gui/tiles/(?tex).png as Textures that
 * are referenced by the TextureSets.
 * <p>
 * Note that each texture is represented by TWO Identifiers:
 * - The identifier of the physical location in modid:texture/gui/tiles/tex.png
 * - The logical identifier modid:tex referenced by TextureSets
 */
@Environment(EnvType.CLIENT)
public class TextureConfig implements SimpleResourceReloadListener<Map<Identifier, ITexture>> {
    private final Map<Identifier, ITexture> texture_map;

    public TextureConfig(Map<Identifier, ITexture> texture_map) {
        this.texture_map = texture_map;
    }

    @Override
    public CompletableFuture<Map<Identifier, ITexture>> load(ResourceManager manager, Profiler profiler, Executor executor) {
        return CompletableFuture.supplyAsync(() -> {
            Map<Identifier, ITexture> textures = new HashMap<>();

            for (Identifier id : manager.findResources("textures/gui/tiles", (s) -> s.endsWith(".png"))) {
                // id now contains the physical file path of the texture
                try {

                    // texture_id is the logical identifier, as it will be referenced by TextureSets
                    Identifier texture_id = new Identifier(
                            id.getNamespace(),
                            id.getPath().replace("textures/gui/tiles/", "").replace(".png", "")
                    );

                    textures.put(texture_id, new TileTexture(id));
                } catch (InvalidIdentifierException e) {
                    AntiqueAtlasMod.LOG.warn("Failed to read texture!", e);
                }
            }

            return textures;
        });
    }

    @Override
    public CompletableFuture<Void> apply(Map<Identifier, ITexture> textures, ResourceManager manager, Profiler profiler, Executor executor) {
        return CompletableFuture.runAsync(() -> {
            texture_map.clear();
            for (Map.Entry<Identifier, ITexture> entry : textures.entrySet()) {
                texture_map.put(entry.getKey(), entry.getValue());
                Log.info("Loaded texture %s with path %s", entry.getKey(), entry.getValue().getTexture());
            }
        });
    }

    @Override
    public Identifier getFabricId() {
        return new Identifier("antiqueatlas:textures");
    }
}
