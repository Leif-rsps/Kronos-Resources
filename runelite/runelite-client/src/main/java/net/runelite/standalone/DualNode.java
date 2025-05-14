package net.runelite.standalone;

public class DualNode extends Node {
   public DualNode nextDual;
   public DualNode previousDual;
   public long keyDual;

   public void method3491() {
      if(this.nextDual != null) {
         this.nextDual.previousDual = this.previousDual;
         this.previousDual.nextDual = this.nextDual;
         this.previousDual = null;
         this.nextDual = null;
      }
   }

   public void unlinkDual() {
      this.method3491();
   }
}
