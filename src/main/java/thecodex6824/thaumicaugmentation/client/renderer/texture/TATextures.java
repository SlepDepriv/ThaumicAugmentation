/**
 *  Thaumic Augmentation
 *  Copyright (c) 2019 TheCodex6824.
 *
 *  This file is part of Thaumic Augmentation.
 *
 *  Thaumic Augmentation is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Thaumic Augmentation is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Thaumic Augmentation.  If not, see <https://www.gnu.org/licenses/>.
 */

package thecodex6824.thaumicaugmentation.client.renderer.texture;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.TextureStitchEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import thecodex6824.thaumicaugmentation.api.ThaumicAugmentationAPI;

@EventBusSubscriber(modid = ThaumicAugmentationAPI.MODID, value = {Side.CLIENT})
public class TATextures {

    public static final ResourceLocation GRID = new ResourceLocation("thaumcraft", "textures/misc/gridblock.png");
    public static final ResourceLocation SIDE = new ResourceLocation("thaumcraft", "textures/models/dioptra_side.png");
    public static final ResourceLocation MONITOR_BASE_TEXTURE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/blocks/rift_monitor_meter.png");
    public static final ResourceLocation MONITOR_GLASS_TEXTURE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/blocks/rift_monitor_glass.png");

    public static final ResourceLocation TUNNEL = new ResourceLocation("thaumcraft", "textures/misc/tunnel.png");
    public static final ResourceLocation MIRROR_PARTICLES = new ResourceLocation("thaumcraft", "textures/misc/particlefield.png");

    public static final ResourceLocation HARNESS_BASE_TEXTURE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/harness/harness_base.png");
    public static final ResourceLocation THAUMOSTATIC_TEXTURE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/harness/thaumostatic_module.png");
    public static final ResourceLocation THAUMOSTATIC_MODEL = new ResourceLocation(ThaumicAugmentationAPI.MODID, "models/entity/thaumostatic_module.obj");
    public static final ResourceLocation LIGHTNING_TEXTURE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/harness/lightning_ring.png");
    public static final ResourceLocation ELYTRA_TEXTURE = new ResourceLocation("minecraft", "textures/entity/elytra.png");

    public static final ResourceLocation AUTOCASTER_NORMAL = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/entities/autocaster.png");
    public static final ResourceLocation AUTOCASTER_ELDRITCH = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/entities/autocaster_eldritch.png");
    public static final ResourceLocation CELESTIAL_OBSERVER = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/entities/celestial_observer.png");

    public static final ResourceLocation EMPTINESS_SKY = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/environment/emptiness_sky.png");

    public static final ResourceLocation[] BASE_LAYERS = new ResourceLocation[] {
	    new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/void_shield_base_layer1.png"),
	    new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/void_shield_base_layer2.png"),
	    new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/void_shield_base_layer3.png")
    };

    public static final ResourceLocation[] RUNE_LAYERS = new ResourceLocation[] {
	    new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/void_shield_runes_layer1.png"),
	    new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/void_shield_runes_layer2.png"),
	    new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/void_shield_runes_layer3.png")
    };

    public static final ResourceLocation ELYTRA_BOOSTER_TEXTURE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/models/harness/elytra_booster.png");
    public static final ResourceLocation VANILLA_BANNER_BASE = new ResourceLocation("minecraft", "textures/entity/banner_base.png");
    public static final ResourceLocation TC_BANNER = new ResourceLocation("thaumcraft", "textures/models/banner_blank.png");
    public static final ResourceLocation CRIMSON_BANNER = new ResourceLocation("thaumcraft", "textures/models/banner_cultist.png");

    public static final ResourceLocation IMPULSE_CANNON_BEAM = new ResourceLocation(ThaumicAugmentationAPI.MODID,
	    "textures/misc/cannon_beam.png");
    public static final ResourceLocation IMPULSE_CANNON_IMPACT = new ResourceLocation(ThaumicAugmentationAPI.MODID,
	    "textures/misc/cannon_impact.png");
    public static final ResourceLocation IMPETUS_BEAM_INACTIVE = new ResourceLocation("thaumcraft", "textures/misc/wispy.png");
    public static final ResourceLocation IMPETUS_BEAM_ACTIVE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/misc/impetus_beam.png");
    public static final ResourceLocation FRAME = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/misc/frame_1x1_simple.png");
    public static final ResourceLocation RIFT = new ResourceLocation("minecraft", "textures/entity/end_portal.png");
    public static final ResourceLocation MIRROR = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/environment/mirror_field.png");

    public static final ResourceLocation ELDRITCH_CUBE = new ResourceLocation(ThaumicAugmentationAPI.MODID, "textures/blocks/eldritch_cube.png");
    public static final ResourceLocation ELDRITCH_PORTAL = new ResourceLocation("thaumcraft", "textures/misc/eldritch_portal.png");

    public static final ResourceLocation TC_HUD = new ResourceLocation("thaumcraft", "textures/gui/hud.png");
    public static final ResourceLocation TC_PARTICLES = new ResourceLocation("thaumcraft", "textures/misc/particles.png");
    public static final ResourceLocation NODE = new ResourceLocation("thaumcraft", "textures/misc/auranodes.png");
    public static final ResourceLocation THAUMOMETER = new ResourceLocation("thaumcraft", "textures/items/scanner.png");
    public static final ResourceLocation THAUMOMETER_GLASS = new ResourceLocation("thaumcraft", "textures/items/scanscreen.png");

    public static final ResourceLocation ESSENTIA = new ResourceLocation("thaumcraft", "blocks/animatedglow");

    @SubscribeEvent
    public static void onTextureStitch(TextureStitchEvent.Post event) {
	ITextureObject tex = Minecraft.getMinecraft().getTextureManager().getTexture(MIRROR);
	if (tex == null) {
	    Minecraft.getMinecraft().getTextureManager().loadTexture(MIRROR, new SimpleTexture(MIRROR));
	    tex = Minecraft.getMinecraft().getTextureManager().getTexture(MIRROR);
	}

	if (tex != null) {
	    GlStateManager.bindTexture(tex.getGlTextureId());
	    tex.setBlurMipmap(true, false);
	}
    }

}
