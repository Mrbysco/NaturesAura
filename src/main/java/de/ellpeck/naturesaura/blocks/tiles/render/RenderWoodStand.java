package de.ellpeck.naturesaura.blocks.tiles.render;

import com.mojang.blaze3d.matrix.MatrixStack;
import de.ellpeck.naturesaura.blocks.tiles.TileEntityWoodStand;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.IRenderTypeBuffer;
import net.minecraft.client.renderer.Vector3f;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.client.renderer.tileentity.TileEntityRenderer;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RenderWoodStand extends TileEntityRenderer<TileEntityWoodStand> {

    public RenderWoodStand(TileEntityRendererDispatcher disp) {
        super(disp);
    }

    @Override
    public void render(TileEntityWoodStand tileEntityWoodStand, float v, MatrixStack matrixStack, IRenderTypeBuffer iRenderTypeBuffer, int i, int i1) {
        ItemStack stack = tileEntityWoodStand.items.getStackInSlot(0);
        if (!stack.isEmpty()) {
            matrixStack.push();
            Item item = stack.getItem();
            if (item instanceof BlockItem) {
                matrixStack.translate(0.5F, 0.9735F, 0.5F);
                float scale = 0.65F;
                matrixStack.scale(scale, scale, scale);
            } else {
                matrixStack.translate(0.5F, 0.825F, 0.5F);
                float scale = 0.4F;
                matrixStack.scale(scale, scale, scale);
                matrixStack.rotate(Vector3f.XP.rotationDegrees(90));
            }
            Minecraft.getInstance().getItemRenderer().renderItem(stack, ItemCameraTransforms.TransformType.GROUND, i, i1, matrixStack, iRenderTypeBuffer);
            matrixStack.pop();
        }
    }
}
