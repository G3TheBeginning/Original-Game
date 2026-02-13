import java.util.Vector;

public class D extends Thread {
   static Vector a;
   static boolean b = false;
   static boolean c = false;
   static int d = 0;

   public static void A(int var0) {
      if (a == null) {
         a = new Vector(1, 1);
      }

      if (c) {
      }

      a.addElement(new Integer(var0));
   }

   public static void B(int var0) {
      if (var0 >= 0) {
         HG.L(var0);
      }

   }

   public void run() {
      while(true) {
         try {
            ++d;
            c = false;
            b = true;
            int var2 = 0;
            if (a != null) {
               var2 = a.size();
            }

            if (var2 > 0 && !HG.ka) {
               for(int var1 = 0; var1 < var2; ++var1) {
                  Integer var4 = (Integer)a.elementAt(0);
                  int var5 = var4;
                  HG.Q(var5);
                  HG.R(var5);
                  a.removeElementAt(0);
               }
            }

            if (HG.ka) {
               HG.M();
            }

            c = true;
            Thread.sleep(80L);
         } catch (Exception var3) {
         }
      }
   }
}
