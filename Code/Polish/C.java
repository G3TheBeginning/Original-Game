public class C implements Runnable {
   A a;
   int b = -1;
   public static int c = 0;
   int d = -1;
   int e = -1;
   int f = -1;
   boolean g = false;
   public Object h = new Object();

   public void A(A var1, int var2, int var3, int var4, boolean var5) {
      this.a = var1;
      this.d = var2;
      this.e = var3;
      this.f = var4;
      this.b = -1;
      this.g = var5;
      c = 0;
   }

   public void A(A var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.d = -1;
      this.e = -1;
      this.f = -1;
      this.g = false;
      c = 0;
   }

   public void run() {
      if (this.b > 0) {
         this.a.IA(this.b);
      } else {
         this.a.A(3);
         Thread.yield();
         synchronized(this.h) {
            System.gc();
            if (this.g) {
               short var2 = (short)(A.da[0] & '\uffff');
               short var1 = (short)((A.da[0] & -65536) >> 16);
               if (!B.B(this.d, this.e, this.f)) {
                  System.gc();
                  B.A(0, var2, var1);
               }
            } else {
               B.A(this.d, this.e, this.f);
            }

            if (A.oA > 0) {
               if (HG.S(2) != 0) {
                  HG.L();
                  HG.M(2);
               }
            } else if (HG.S(A.pA) != 0) {
               HG.L();
               HG.M(A.pA);
            }
         }

         this.a.A(6);
      }

      c = 100;
   }
}
