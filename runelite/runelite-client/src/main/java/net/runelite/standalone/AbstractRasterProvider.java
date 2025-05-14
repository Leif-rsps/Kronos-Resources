package net.runelite.standalone;

import net.runelite.api.BufferProvider;
import net.runelite.mapping.ObfuscatedName;

@ObfuscatedName("lm")
public abstract class AbstractRasterProvider implements BufferProvider {
   static IndexedSprite titlebuttonSprite;
   public int height;
   public int width;
   public int[] pixels;

   public abstract void vmethod6275(int var1, int var2);

   public abstract void vmethod6276(int var1, int var2, int var3, int var4);

   public int[] getPixels() {
      return this.pixels;
   }

   public int getWidth() {
      return this.width;
   }

   public int getHeight() {
      return this.height;
   }

   public void setRaster() {
      this.method6274();
   }

   public final void method6274() {
      Rasterizer2D.method6409(this.pixels, this.width, this.height);
   }
}
