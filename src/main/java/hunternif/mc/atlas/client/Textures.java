package hunternif.mc.atlas.client;

import hunternif.mc.atlas.AntiqueAtlasMod;
import net.minecraft.util.ResourceLocation;

public class Textures {
	public static final String MOD_PREFIX = AntiqueAtlasMod.ID + ":";
	public static final String GUI = MOD_PREFIX + "textures/gui/";
	public static final String GUI_TILES = GUI + "tiles/";
	public static final String GUI_MARKERS = GUI + "markers/";
	public static final String GUI_SCALEBAR = GUI + "scalebar/";
	
	public static final ResourceLocation
	BOOK = gui("book.png"),
	EXPORTED_BG = gui("exportedBG.png"),
	BOOK_FRAME = gui("bookFrame.png"),
	BTN_ARROWS = gui("navigateArrows.png"),
	BTN_POSITION = gui("position.png"),
	BOOKMARKS = gui("bookmarks.png"),
	PLAYER = gui("player.png"),
	SCROLLBAR_HOR = gui("scrollbar_hor.png"),
	SCROLLBAR_VER = gui("scrollbar_ver.png"),
	MARKER_FRAME_ON = gui("marker_frame_on.png"),
	MARKER_FRAME_OFF = gui("marker_frame_off.png"),
	ERASER = gui("eraser.png"),
	
	SCALEBAR_4 = scaleBar("scalebar_4.png"),
	SCALEBAR_8 = scaleBar("scalebar_8.png"),
	SCALEBAR_16 = scaleBar("scalebar_16.png"),
	SCALEBAR_32 = scaleBar("scalebar_32.png"),
	SCALEBAR_64 = scaleBar("scalebar_64.png"),
	SCALEBAR_128 = scaleBar("scalebar_128.png"),
	SCALEBAR_256 = scaleBar("scalebar_256.png"),
	SCALEBAR_512 = scaleBar("scalebar_512.png"),
	
	ICON_EXPORT = gui("icon_export.png"),
	ICON_MARKER = gui("icon_marker.png"),
	ICON_DELETE_MARKER = gui("icon_del_marker.png"),
	
	MARKER_GOOGLE_MARKER = marker("google_marker.png"),
	MARKER_RED_X_LARGE = marker("red_x_large.png"),
	MARKER_RED_X_SMALL = marker("red_x_small.png"),
	MARKER_VILLAGE = marker("village.png"),
	
	TILE_TEST = tile("test.png"),
	TILE_MOUNTAINS = tile("mountains.png"),
	TILE_MOUNTAINS2 = tile("mountains2.png"),
	TILE_MOUNTAINS3 = tile("mountains3.png"),
	TILE_MOUNTAINS4 = tile("mountains4.png"),
	TILE_SNOW_CAPS = tile("snow_caps.png"),
	TILE_SNOW_HILLS = tile("snow_hills.png"),
	TILE_SNOW_HILLS2 = tile("snow_hills2.png"),
	TILE_WATER = tile("water.png"),
	TILE_WATER2 = tile("water2.png"),
	TILE_ICE_BORDER = tile("ice_border.png"),
	TILE_ICE_NOBORDER = tile("ice_noborder.png"),
	TILE_FOREST = tile("forest.png"),
	TILE_FOREST2 = tile("forest2.png"),
	TILE_FOREST3 = tile("forest3.png"),
	TILE_FOREST_HILLS = tile("forest_hills.png"),
	TILE_FOREST_HILLS2 = tile("forest_hills2.png"),
	TILE_FOREST_HILLS3 = tile("forest_hills3.png"),
	TILE_FOREST_FLOWERS = tile("forest_flowers.png"),
	TILE_FOREST_FLOWERS2 = tile("forest_flowers2.png"),
	TILE_FOREST_FLOWERS3 = tile("forest_flowers3.png"),
	TILE_DENSE_FOREST = tile("dense_forest.png"),
	TILE_DENSE_FOREST2 = tile("dense_forest2.png"),
	TILE_DENSE_FOREST_HILLS = tile("dense_forest_hills.png"),
	TILE_DENSE_FOREST_HILLS2 = tile("dense_forest_hills2.png"),
	TILE_BIRCH = tile("birch.png"),
	TILE_BIRCH2 = tile("birch2.png"),
	TILE_BIRCH_HILLS = tile("birch_hills.png"),
	TILE_BIRCH_HILLS2 = tile("birch_hills2.png"),
	TILE_TALL_BIRCH = tile("tall_birch.png"),
	TILE_TALL_BIRCH2 = tile("tall_birch2.png"),
	TILE_TALL_BIRCH_HILLS = tile("tall_birch_hills.png"),
	TILE_TALL_BIRCH_HILLS2 = tile("tall_birch_hills2.png"),
	TILE_DENSE_BIRCH = tile("dense_birch.png"),
	TILE_HILLS = tile("hills.png"),
	TILE_HILLS_BUSHES = tile("hills_bushes.png"),
	TILE_HILLS_CACTI = tile("hills_cacti.png"),
	TILE_HILLS_GRASS = tile("hills_grass.png"),
	TILE_PINES = tile("pines.png"),
	TILE_PINES2 = tile("pines2.png"),
	TILE_PINES3 = tile("pines3.png"),
	TILE_PINES_HILLS = tile("pines_hills.png"),
	TILE_PINES_HILLS2 = tile("pines_hills2.png"),
	TILE_PINES_HILLS3 = tile("pines_hills3.png"),
	TILE_MEGA_SPRUCE = tile("mega_spruce.png"),
	TILE_MEGA_SPRUCE2 = tile("mega_spruce2.png"),
	TILE_MEGA_TAIGA = tile("mega_taiga.png"),
	TILE_MEGA_TAIGA2 = tile("mega_taiga2.png"),
	TILE_MEGA_SPRUCE_HILLS = tile("mega_spruce_hills.png"),
	TILE_MEGA_SPRUCE_HILLS2 = tile("mega_spruce_hills2.png"),
	TILE_MEGA_TAIGA_HILLS = tile("mega_taiga_hills.png"),
	TILE_MEGA_TAIGA_HILLS2 = tile("mega_taiga_hills2.png"),
	TILE_SAND = tile("sand.png"),
	TILE_SAND2 = tile("sand2.png"),
	TILE_SAND3 = tile("sand3.png"),
	TILE_CACTI = tile("cacti.png"),
	TILE_SAND_BUSHES = tile("sand_bushes.png"),
	TILE_SHORE = tile("shore.png"),
	TILE_SHORE2 = tile("shore2.png"),
	TILE_ROCK_SHORE = tile("rock_shore.png"),
	TILE_SHORE3 = tile("shore3.png"),
	TILE_GRASS = tile("grass.png"),
	TILE_GRASS2 = tile("grass2.png"),
	TILE_GRASS3 = tile("grass3.png"),
	TILE_GRASS4 = tile("grass4.png"),
	TILE_SUNFLOWERS = tile("sunflowers.png"),
	TILE_SUNFLOWERS2 = tile("sunflowers2.png"),
	TILE_SNOW = tile("snow.png"),
	TILE_SNOW1 = tile("snow1.png"),
	TILE_SNOW2 = tile("snow2.png"),
	TILE_SNOW3 = tile("snow3.png"),
	TILE_SNOW4 = tile("snow4.png"),
	TILE_SNOW5 = tile("snow5.png"),
	TILE_SNOW6 = tile("snow6.png"),
	TILE_SNOW_PINES = tile("snow_pines.png"),
	TILE_SNOW_PINES2 = tile("snow_pines2.png"),
	TILE_SNOW_PINES3 = tile("snow_pines3.png"),
	TILE_SNOW_PINES_HILLS = tile("snow_pines_hills.png"),
	TILE_SNOW_PINES_HILLS2 = tile("snow_pines_hills2.png"),
	TILE_SNOW_PINES_HILLS3 = tile("snow_pines_hills3.png"),
	TILE_ICE_SPIKES = tile("ice_spikes.png"),
	TILE_ICE_SPIKES2 = tile("ice_spikes2.png"),
	TILE_SNOW_MOUNTAINS = tile("snow_mountains.png"),
	TILE_SNOW_MOUNTAINS2 = tile("snow_mountains2.png"),
	TILE_SWAMP = tile("swamp.png"),
	TILE_SWAMP2 = tile("swamp2.png"),
	TILE_SWAMP3 = tile("swamp3.png"),
	TILE_SWAMP4 = tile("swamp4.png"),
	TILE_SWAMP5 = tile("swamp5.png"),
	TILE_SWAMP6 = tile("swamp6.png"),
	TILE_SWAMP_HILLS = tile("swamp_hills.png"),
	TILE_SWAMP_HILLS2 = tile("swamp_hills2.png"),
	TILE_SWAMP_HILLS3 = tile("swamp_hills3.png"),
	TILE_SWAMP_HILLS4 = tile("swamp_hills4.png"),
	TILE_SWAMP_HILLS5 = tile("swamp_hills5.png"),
	TILE_MUSHROOM = tile("mushroom.png"),
	TILE_MUSHROOM2 = tile("mushroom2.png"),
	TILE_JUNGLE = tile("jungle.png"),
	TILE_JUNGLE2 = tile("jungle2.png"),
	TILE_JUNGLE_HILLS = tile("jungle_hills.png"),
	TILE_JUNGLE_HILLS2 = tile("jungle_hills2.png"),
	TILE_JUNGLE_EDGE = tile("jungle_edge.png"),
	TILE_JUNGLE_EDGE2 = tile("jungle_edge2.png"),
	TILE_JUNGLE_EDGE3 = tile("jungle_edge3.png"),
	TILE_JUNGLE_EDGE_HILLS = tile("jungle_edge_hills.png"),
	TILE_JUNGLE_EDGE_HILLS2 = tile("jungle_edge_hills2.png"),
	TILE_JUNGLE_EDGE_HILLS3 = tile("jungle_edge_hills3.png"),
	TILE_JUNGLE_CLIFFS = tile("jungle_cliffs.png"),
	TILE_JUNGLE_CLIFFS2 = tile("jungle_cliffs2.png"),
	TILE_BUSHES_CLIFFS = tile("bushes_cliffs.png"),
	TILE_CLIFFS = tile("cliffs.png"),
	TILE_SAVANNA = tile("savanna.png"),
	TILE_SAVANNA2 = tile("savanna2.png"),
	TILE_SAVANNA3 = tile("savanna3.png"),
	TILE_SAVANNA_CLIFFS = tile("savanna_cliffs.png"),
	TILE_SAVANNA_CLIFFS2 = tile("savanna_cliffs2.png"),
	TILE_SAVANNA_CLIFFS3 = tile("savanna_cliffs3.png"),
	TILE_CLIFFS_CLOUDS = tile("cliffs_clouds.png"),
	TILE_SAVANNA_CLIFFS_CLOUDS = tile("savanna_cliffs_clouds.png"),
	TILE_SAVANNA_CLIFFS_CLOUDS2 = tile("savanna_cliffs_clouds2.png"),
	TILE_SAVANNA_CLIFFS_CLOUDS3 = tile("savanna_cliffs_clouds3.png"),
	TILE_MESA = tile("mesa.png"),
	TILE_MESA2 = tile("mesa2.png"),
	TILE_MESA3 = tile("mesa3.png"),
	TILE_MESA4 = tile("mesa4.png"),
	TILE_BRYCE = tile("bryce.png"),
	TILE_BRYCE2 = tile("bryce2.png"),
	TILE_BRYCE3 = tile("bryce3.png"),
	TILE_BRYCE4 = tile("bryce4.png"),
	TILE_PLATEAU_MESA = tile("plateau_mesa.png"),
	TILE_PLATEAU_MESA2 = tile("plateau_mesa2.png"),
	TILE_PLATEAU_MESA_LOW = tile("plateau_mesa_low.png"),
	TILE_PLATEAU_MESA_LOW2 = tile("plateau_mesa_low2.png"),
	TILE_PLATEAU_TREES = tile("plateau_trees.png"),
	TILE_PLATEAU_TREES_LOW = tile("plateau_trees_low.png"),
	TILE_PLATEAU_GRASS = tile("plateau_grass.png"),
	TILE_PLATEAU_GRASS2 = tile("plateau_grass2.png"),
	TILE_PLATEAU_GRASS3 = tile("plateau_grass3.png"),
	TILE_PLATEAU_SAVANNA = tile("plateau_savanna.png"),
	TILE_PLATEAU_SAVANNA2 = tile("plateau_savanna2.png"),
	TILE_PLATEAU_SAVANNA3 = tile("plateau_savanna3.png"),
	TILE_CAVE_WALLS = tile("cave_walls.png"),
	TILE_LAVA = tile("lava.png"),
	TILE_LAVA2 = tile("lava2.png"),
	TILE_LAVA_SHORE = tile("lava_shore.png"),
	TILE_LAVA_SHORE2 = tile("lava_shore2.png"),
	
	// Structures:
	TILE_HOUSE = tile("house.png"),
	TILE_FENCE = tile("fence.png"),
	TILE_NETHER_BRIDGE = tile("nether_bridge.png"),
	TILE_NETHER_BRIDGE_X = tile("nether_bridge_x.png"),
	TILE_NETHER_BRIDGE_Z = tile("nether_bridge_z.png"),
	TILE_NETHER_BRIDGE_END_X = tile("nether_bridge_end_x.png"),
	TILE_NETHER_BRIDGE_END_Z = tile("nether_bridge_end_z.png"),
	TILE_NETHER_BRIDGE_GATE = tile("nether_bridge_gate.png");
	
	// Constructor helpers:
	public static final ResourceLocation gui(String fileName) {
		return new ResourceLocation(GUI + fileName);
	}
	public static final ResourceLocation scaleBar(String fileName) {
		return new ResourceLocation(GUI_SCALEBAR + fileName);
	}
	public static final ResourceLocation marker(String fileName) {
		return new ResourceLocation(GUI_MARKERS + fileName);
	}
	public static final ResourceLocation tile(String fileName) {
		return new ResourceLocation(GUI_TILES + fileName);
	}
}
