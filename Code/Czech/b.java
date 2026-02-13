public final class b implements Runnable {
   public c a;
   public int c = -1;
   public static int a = 0;
   public int e = -1;
   public int b = -1;
   public int d = -1;
   public boolean a = false;
   public Object a = new Object();

   public final void a(c var1, int var2, int var3, int var4, boolean var5) {
      this.a = var1;
      this.e = var2;
      this.b = var3;
      this.d = var4;
      this.c = -1;
      this.a = var5;
      a = 0;
   }

   public final void a(c var1, int var2) {
      this.a = var1;
      this.c = var2;
      this.e = -1;
      this.b = -1;
      this.d = -1;
      this.a = false;
      a = 0;
   }

   public final void run() {
      if (this.c > 0) {
         this.a.i(this.c);
      } else {
         this.a.g(3);
         Thread.yield();
         synchronized(this.a) {
            System.gc();
            if (this.a) {
               short var2 = (short)(c.O[0] & '\uffff');
               short var3 = (short)((c.O[0] & -65536) >> 16);
               if (!a.a(this.e, this.b, this.d)) {
                  System.gc();
                  a.b(0, var2, var3);
               }
            } else {
               a.b(this.e, this.b, this.d);
            }
         }

         this.a.g(6);
      }

      a = 100;
   }
}
