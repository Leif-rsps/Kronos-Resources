package net.runelite.standalone;

public class Node implements net.runelite.api.Node {
   public long key;
   public Node next;
   public Node previous;

   public void onUnlink() {
   }

   public void rl$unlink() {
      this.onUnlink();
   }

   public long getHash() {
      return this.key;
   }

   public Node getNext() {
      return this.previous;
   }

   public Node getPrevious() {
      return this.next;
   }

   public void unlink() {
      this.method3497();
   }

   public boolean method3494() {
      return this.next != null;
   }

   public void method3497() {
      this.rl$unlink();
      if(this.next != null) {
         this.next.previous = this.previous;
         this.previous.next = this.next;
         this.previous = null;
         this.next = null;
      }
   }
}
