import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.GameCanvas;

public final class c extends GameCanvas implements Runnable {
   public static HG a;
   public static boolean k = true;
   public static boolean y = false;
   public static long g;
   public static Thread a = null;
   public static int aA = 0;
   public static int l = 0;
   public static long e = 0L;
   public static int[] m;
   public static Font[] a;
   public static long f = 0L;
   public static long c = -1L;
   public static Image b = null;
   public static int aq = 0;
   public static int y = 0;
   public static boolean x = false;
   public static boolean p = false;
   public static b a;
   public Graphics a = this.getGraphics();
   public static int H = -1;
   public static final byte[][] d = new byte[][]{{15, 15, 0, 7}, {20, 15, 3, 13}, {25, 15, 1, 9}, {30, 15, 2, 11}, {31, 15, 8}, {32, 15, 14}, {33, 15, 6}, {34, 15, 12}, {35, 15, 4, 10}, {50, 0, 17}, {45, 0, 18}, {40, 0, 5}, {55, 0, 0, 7}, {60, 0, 3, 13}, {61, 0, 1, 9}, {62, 0, 2, 11}, {65, 0, 4, 10}, {85, 0, 17}, {80, 0, 18}, {90, 0, 5}, {95, 0, 15}, {100, 0, 16}, {101, 0, 6}, {102, 0, 7}, {103, 0, 8}, {104, 0, 9}, {115, 0, 10}, {105, 0, 11}, {106, 0, 12}, {107, 0, 13}, {108, 0, 14}, {109, 0, 16}, {110, 0, 6}, {111, 0, 8}, {112, 0, 12}, {113, 0, 14}, {114, 0, 15}, {116, 15, 0}, {117, 15, 3}, {118, 0, 5}};
   public static int aj;
   public static byte[] e;
   public static byte[] d;
   public static byte[] c;
   public static short[] f;
   public static short[] g;
   public static short[] c;
   public static String[] a;
   public static int[] O;
   public static int[][][] a;
   public static int[][] q;
   public static int[][] a;
   public static int[][] i;
   public static int[][] e;
   public static int[][] n;
   public static int[][] p;
   public static int[][] l;
   public static int[][] r;
   public static int[][] d;
   public static int[] k;
   public static int[][] c;
   public static int[][] x;
   public static int[][] w;
   public static int[][] g;
   public static int[][] y;
   public static int[][] h;
   public static int[][] f;
   public static int[][] u;
   public static int[] M;
   public static int[][] b;
   public static int[][] s;
   public static int[] C;
   public static int[] B;
   public static int[] u;
   public static int[] J;
   public static int[] K;
   public static int[] x;
   public static int[] s;
   public static int[] E;
   public static int[] D;
   public static int[][] j;
   public static int[][] o;
   public static short[][] b;
   public static int t;
   public static int Z;
   public static int e;
   public static int ab;
   public static boolean v;
   private static int[] d;
   private static String e;
   private static String g;
   public static Image a;
   public static Graphics b;
   public static int G;
   public static int ad;
   public static int V;
   public static int s;
   public static boolean a;
   public static int[] l;
   public static int[] y;
   public static boolean h;
   public static boolean r;
   public static boolean z;
   public static int R;
   public static int x;
   public static short[] e;
   public static short d;
   public static short b;
   public static short c;
   public static short a;
   public static String a;
   public static String c;
   public static int p;
   public static int Y;
   public static int X;
   public static int am;
   public static int ag;
   public static int b;
   public static int T;
   public static int o;
   public static String i;
   public static int ak;
   public static int[] j;
   public static boolean l;
   public static boolean b;
   public static boolean d;
   public static boolean u;
   public static boolean f;
   public static boolean c;
   private static int ac;
   private static boolean g;
   private static int C;
   private static boolean i;
   private static boolean m;
   private static int d;
   private static int ay;
   public static int[] Q;
   public static int[] i;
   public static int[] z;
   public static int[] F;
   public static int[] r;
   public static int[] a;
   public static int q;
   public static int c;
   public static int E;
   public static int f;
   public static int[] P;
   public static int[] U;
   public static int[] I;
   private static int[] g;
   public static boolean n;
   public static short[] b;
   public static short[][] c;
   public static Image[][] a;
   public static int[] q;
   public static int[][][] b;
   public static byte[] f;
   public static byte[] b;
   public static short[] d;
   public static byte[] a;
   public static byte[][] a;
   public static byte[][][][] b;
   public static byte[][][][] a;
   public static byte[][][] c;
   public static short[][][][][] a;
   public static short[][] a;
   public static byte[][][] b;
   public static int[][][][] a;
   public static byte[][] c;
   public static Image[][][] a;
   public static byte[][][] a;
   private static short[] a;
   public static byte[][] b;
   public static int[][] t;
   public static int[][] k;
   public static int h;
   public static int B;
   public static int N;
   public static int ai;
   public static int A;
   public static int[] G;
   public static int[] T;
   private static int[] o;
   private static int[] h;
   public static boolean t;
   public static boolean A;
   public static String[] c;
   public static String h;
   public static String b;
   public static int M;
   public static int Q;
   public static int ae;
   public static int K;
   public static int az;
   public static int a;
   public static int j;
   public static int ap;
   public static int J;
   public static int L;
   public static int aw;
   public static int U;
   public static int S;
   public static int[] V;
   public static int g;
   public static boolean q;
   public static Vector a;
   public static String[] b;
   public static int ax;
   public static int i;
   public static int F;
   public static int al;
   public static int n;
   public static int[] e;
   public static boolean B;
   public static boolean o;
   public static long b;
   public static int ah;
   public static int as;
   public static int r;
   public static int z;
   public static int v;
   public static int ao;
   public static int at;
   public static int ar;
   public static int af;
   public static int m;
   public static int aa;
   public static boolean w;
   public static boolean e;
   private static Hashtable a;
   private static byte a;
   public static int D;
   public static int O;
   public static int k;
   public static int I;
   public static int an;
   public static boolean j;
   public static String f;
   public static int[][] v;
   public static int[][] m;
   public static boolean s;
   private static int[] n;
   public static int[] w;
   public static int[] t;
   public static int w;
   public static String d;
   public static int u;
   public static int P;
   public static int av;
   public static int W;
   public static int au;
   public static int[] N;
   public static int[] v;
   public static int[] A;
   public static int[] c;
   public static int[] f;
   private static int[] p;
   private static int[] H;
   private static int[] S;
   public static int[] R;
   private static final int[] b;
   private static int[] L;
   public static long d;
   public static long a;

   public final void g(int var1) {
      H = var1;
      this.g();
   }

   public final void g() {
      switch(H) {
      case 1:
         b();
         return;
      case 2:
         b = null;
         HG.l = false;
         HG.v = 0;
         HG.j = -1;
         y();
         HG.m(0);
      case 3:
      case 4:
      default:
         return;
      case 5:
         HG.g(0);
         l(159);
      }
   }

   public final void ad() {
      switch(H) {
      case 1:
         if ((System.currentTimeMillis() >= f + 3000L || f == 0L) && aq < 2) {
            f = System.currentTimeMillis();

            try {
               b = Image.createImage("/s0" + aq + "." + "png");
            } catch (Exception var3) {
            }

            ++aq;
            if (aq == 2) {
               f = 0L;
               a = new b();
               a.a(HG.a, 1);
               (new Thread(a)).start();
               c = -1L;
            }
         }

         if (a != null && b.a >= 100) {
            if (c < 0L) {
               c = System.currentTimeMillis() + 1000L;
            }

            if (c < System.currentTimeMillis()) {
               this.g(5);
               HG.l = true;
               HG.g(17);
               return;
            }
         }
         break;
      case 2:
         if (System.currentTimeMillis() >= f + 3000L || f == 0L) {
            f = System.currentTimeMillis();

            try {
               if (aq < 10) {
                  b = Image.createImage("/s0" + aq + "." + "png");
               } else {
                  b = Image.createImage("/s" + aq + "." + "png");
               }

               ++aq;
               return;
            } catch (Exception var4) {
               if (!x) {
                  l(159);
                  b = a[159][0];
                  x = true;
                  ++aq;
               } else {
                  b = null;
                  this.g(5);
                  HG.g(0);
                  HG.l = true;
               }

               return;
            }
         }
      case 3:
      case 5:
      default:
         break;
      case 4:
         HG.a.destroyApp(false);
         return;
      case 6:
         synchronized(a.a) {
            if (!HG.l || HG.c > 17) {
               J();
               if (!t && !q) {
                  u();
               }

               W();
               j();
               v();
               h();
               o();
            }

            return;
         }
      }

   }

   public final void keyPressed(int var1) {
      boolean var2 = false;
      if (this.hasPointerEvents()) {
         switch(var1) {
         case -4:
            var1 = 35;
            break;
         case -3:
            var1 = 42;
            break;
         case 32:
            var1 = 48;
            break;
         case 98:
         case 118:
            var1 = 56;
            break;
         case 99:
         case 120:
            var1 = 55;
            break;
         case 100:
         case 102:
            var1 = 52;
            break;
         case 101:
         case 114:
            var1 = 49;
            break;
         case 103:
         case 104:
            var1 = 53;
            break;
         case 105:
         case 117:
            var1 = 51;
            break;
         case 106:
         case 107:
            var1 = 54;
            break;
         case 109:
         case 110:
            var1 = 57;
            break;
         case 116:
         case 121:
         case 122:
            var1 = 50;
         }
      }

      y();
      M();
      byte var3 = -1;
      switch(var1) {
      case -7:
         var3 = 17;
         break;
      case -6:
         var3 = 18;
         break;
      case -5:
         var3 = 4;
         break;
      case -4:
         var3 = 2;
         break;
      case -3:
         var3 = 1;
         break;
      case -2:
         var3 = 3;
         break;
      case -1:
         var3 = 0;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      default:
         break;
      case 35:
         var3 = 15;
         break;
      case 42:
         var3 = 16;
         break;
      case 48:
         var3 = 5;
         break;
      case 49:
         var3 = 6;
         break;
      case 50:
         var3 = 7;
         break;
      case 51:
         var3 = 8;
         break;
      case 52:
         var3 = 9;
         break;
      case 53:
         var3 = 10;
         break;
      case 54:
         var3 = 11;
         break;
      case 55:
         var3 = 12;
         break;
      case 56:
         var3 = 13;
         break;
      case 57:
         var3 = 14;
      }

      if (var3 >= 0) {
         if (H == 2 || H == 1) {
            f = 0L;
            return;
         }

         if (H != 3) {
            d[var3] = 20;
            c[var3] = 0;
         }
      }

   }

   public final void keyRepeated(int var1) {
   }

   public final void keyReleased(int var1) {
      if (this.hasPointerEvents()) {
         switch(var1) {
         case -4:
            var1 = 35;
            break;
         case -3:
            var1 = 42;
            break;
         case 32:
            var1 = 48;
            break;
         case 98:
         case 118:
            var1 = 56;
            break;
         case 99:
         case 120:
            var1 = 55;
            break;
         case 100:
         case 102:
            var1 = 52;
            break;
         case 101:
         case 114:
            var1 = 49;
            break;
         case 103:
         case 104:
            var1 = 53;
            break;
         case 105:
         case 117:
            var1 = 51;
            break;
         case 106:
         case 107:
            var1 = 54;
            break;
         case 109:
         case 110:
            var1 = 57;
            break;
         case 116:
         case 121:
         case 122:
            var1 = 50;
         }
      }

      switch(var1) {
      case -7:
         c[17] = 10;
         return;
      case -6:
         c[18] = 10;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 19:
      case 20:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
      case 30:
      case 31:
      case 32:
      case 33:
      case 34:
      case 36:
      case 37:
      case 38:
      case 39:
      case 40:
      case 41:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      default:
         return;
      case -5:
         c[4] = 10;
         return;
      case -4:
         c[2] = 10;
         return;
      case -3:
         c[1] = 10;
         return;
      case -2:
         c[3] = 10;
         return;
      case -1:
         c[0] = 10;
         return;
      case 35:
         c[15] = 10;
         return;
      case 42:
         c[16] = 10;
         return;
      case 48:
         c[5] = 10;
         return;
      case 49:
         c[6] = 10;
         return;
      case 50:
         c[7] = 10;
         return;
      case 51:
         c[8] = 10;
         return;
      case 52:
         c[9] = 10;
         return;
      case 53:
         c[10] = 10;
         return;
      case 54:
         c[11] = 10;
         return;
      case 55:
         c[12] = 10;
         return;
      case 56:
         c[13] = 10;
         return;
      case 57:
         c[14] = 10;
      }
   }

   public static final void y() {
      for(int var0 = 0; var0 < 20; ++var0) {
         c[var0] = 10;
      }

   }

   public static final void M() {
      int var0;
      for(var0 = 0; var0 < 20; ++var0) {
         if (d[var0] == 30 && (c[var0] == 10 || c[var0] == 40)) {
            d[var0] = 10;
            c[var0] = 0;
         }
      }

      for(var0 = 0; var0 < aj; ++var0) {
         byte[] var1;
         int var3 = b((var1 = d[var0])[0]);
         boolean var4 = false;
         int var5 = var1.length;
         boolean var6 = false;
         boolean var7 = false;
         boolean var8 = false;

         for(int var9 = 2; var9 < var5; ++var9) {
            byte var10 = var1[var9];
            if (d[var10] == 20) {
               var8 = true;
            } else if (d[var10] == 30) {
               var7 = true;
            }
         }

         if (var8) {
            e[var3] = 5;
         } else if (var7) {
            e[var3] = 10;
         } else {
            e[var3] = 0;
         }
      }

      for(var0 = 0; var0 < 20; ++var0) {
         if (d[var0] == 20) {
            d[var0] = 30;
         }
      }

   }

   public static final int b(int var0) {
      int var1 = -1;

      for(int var2 = aj - 1; var2 >= 0; --var2) {
         byte[] var3 = d[var2];
         if (var0 == var3[0]) {
            var1 = var2;
            break;
         }
      }

      return var1;
   }

   public static final boolean a(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      int var6;
      if ((var6 = b(var0)) >= 0 && !(var2 = e[var6] == 5)) {
         boolean var3 = false;
         byte[] var4 = d[var6];
         if (e[var6] == 10) {
            boolean var5 = false;
            var2 = var4[1] == 15;
         }
      }

      return var2;
   }

   public static final void A() {
      int var0 = e.length;

      for(int var1 = 0; var1 < var0; ++var1) {
         e[var1] = 0;
      }

   }

   public static final void a(String var0, int var1, int var2, int var3, int var4, Graphics var5) {
      var1 += 0;
      var2 += 0;
      short var6 = f[var3 * 11 + 4];
      short var7 = f[var3 * 11 + 0];
      short var8 = f[var3 * 11 + 1];
      int var9 = f[var3 * 11 + 2];
      int var10 = f[var3 * 11 + 3];
      boolean var11 = (var6 & 256) == 256;
      boolean var12 = (var6 & 128) == 128;
      boolean var13 = (var6 & 512) == 512;
      if (var11) {
         short var14 = f[var3 * 11 + 6];
         short var15 = f[var3 * 11 + 7];
         int var16 = var14 + f[var3 * 11 + 8];
         int var17 = var15 + f[var3 * 11 + 9];
         int var18 = var7 + var9;
         int var19 = var8 + var10;
         if (var7 < var14) {
            var7 = var14;
         }

         if (var8 < var15) {
            var8 = var15;
         }

         if (var18 > var16) {
            var9 = var16 - var7;
         }

         if (var19 > var17) {
            var10 = var17 - var8;
         }
      }

      if (var9 > 0 && var10 > 0) {
         var5.setClip(var7, var8, var9, var10);
         int var20;
         if (var12) {
            var20 = var5.getColor();
            var5.setColor(3);
            var5.drawString(var0, var1 + 2, var2 + 1, 20);
            var5.drawString(var0, var1 + 2, var2, 20);
            var5.drawString(var0, var1 + 2, var2 - 1, 20);
            var5.drawString(var0, var1 + 1, var2 + 1, 20);
            var5.drawString(var0, var1 + 1, var2 - 1, 20);
            var5.drawString(var0, var1, var2 + 1, 20);
            var5.drawString(var0, var1, var2, 20);
            var5.drawString(var0, var1, var2 - 1, 20);
            var5.setColor(var20);
            var5.drawString(var0, var1 + 1, var2, 20);
         } else if (var13) {
            var20 = var5.getColor();
            var5.setColor(3);
            var5.drawString(var0, var1 + 2, var2 + 1, 20);
            var5.setColor(var20);
            var5.drawString(var0, var1 + 1, var2, 20);
         } else {
            var5.drawString(var0, var1 + 1, var2, 20);
         }
      }
   }

   public static final void c(int var0, boolean var1) {
      if (var1) {
         f[var0 * 11 + 5] = 1;
      } else {
         f[var0 * 11 + 5] = 0;
      }
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4) {
      f[var0 * 11 + 6] = (short)var1;
      f[var0 * 11 + 7] = (short)var2;
      f[var0 * 11 + 8] = (short)var3;
      f[var0 * 11 + 9] = (short)var4;
   }

   public static final void c(int var0, int var1, int var2, int var3, int var4, int var5) {
      f[var0 * 11 + 0] = (short)var1;
      f[var0 * 11 + 1] = (short)var2;
      f[var0 * 11 + 2] = (short)var3;
      f[var0 * 11 + 3] = (short)var4;
      f[var0 * 11 + 4] = (short)var5;
      c(var0, true);
   }

   public static final void f(int var0, int var1, int var2) {
      g[var0 * 3 + 0] = (short)var1;
      g[var0 * 3 + 1] = (short)var2;
      g[var0 * 3 + 2] = 0;
   }

   public static final void b(int var0, int var1) {
      f[var0 * 11 + 10] = (short)var1;
   }

   public static final void a(String var0, int var1, int var2, Graphics var3) {
      String[] var4 = null;
      if (f[var1 * 11 + 5] == 1) {
         if ((f[var1 * 11 + 4] & 32) == 32) {
            var4 = HG.a(var0, a[var2], f[var1 * 11 + 2], 0);
         } else {
            (var4 = a)[0] = var0;
         }

         a(var4, var1, var2, var3);
      }

   }

   public static final void a(String[] var0, int var1, int var2, Graphics var3) {
      if (f[var1 * 11 + 5] == 1) {
         short var4 = f[var1 * 11 + 4];
         short var5 = f[var1 * 11 + 0];
         int var6 = f[var1 * 11 + 1];
         short var7 = f[var1 * 11 + 2];
         short var8 = f[var1 * 11 + 3];
         Font var9 = a[var2];
         int var10 = a[var2].getHeight();
         if ((var4 & 8) == 8) {
            var6 += (var8 - var10) / 2;
         }

         String[] var11 = var0;
         int var12 = var0.length * var10 + f[var1 * 11 + 10];
         int var13 = var9.stringWidth(var0[0]);
         boolean var14 = (var4 & 1) == 1;
         boolean var15 = (var4 & 2) == 2;
         boolean var16 = (var4 & 4) == 4;
         boolean var17 = (var4 & 16) == 16;
         boolean var18 = (var4 & 64) == 64;
         boolean var19 = false;
         boolean var20 = false;
         boolean var21 = false;
         int var22 = 0;
         boolean var23 = false;
         boolean var24 = g[var1 * 3 + 0] != 0;
         boolean var25 = false;
         short var26 = g[var1 * 3 + 0];
         short var27 = g[var1 * 3 + 1];
         boolean var28 = false;
         int var29 = -1;
         boolean var30 = false;
         int var32;
         if (!var18) {
            if (var17) {
               boolean var31 = false;
               var32 = var13 - var7 + 20;
               int var33;
               if ((var33 = g[var1 * 3 + 2]) < 0) {
                  var33 = -var33;
               }

               if (var13 > var7) {
                  var28 = true;
                  if (var33 >= var32) {
                     var29 = var13 + 20;
                  }
               } else if (var27 == 0) {
                  g[var1 * 3 + 2] = 0;
               }

               if (var12 > var8) {
                  var28 = true;
                  if (var12 <= var33) {
                     g[var1 * 3 + 2] = (short)var8;
                  }
               } else if (var26 == 0) {
                  g[var1 * 3 + 2] = 0;
               }
            }
         } else if (var17) {
            if (var13 > var7) {
               var28 = true;
            } else if (var27 == 0) {
               g[var1 * 3 + 2] = 0;
            }

            if (var12 > var8) {
               var28 = true;
            } else if (var26 == 0) {
               g[var1 * 3 + 2] = 0;
            }
         }

         if (var18 && var28) {
            short var35 = g[var1 * 3 + 2];
            var32 = var8 - var12;
            c[var1 * 1 + 0] = 0;
            if (var35 < var32) {
               g[var1 * 3 + 2] = (short)var32;
               c[var1 * 1 + 0] = 1;
            }

            boolean var37 = false;
            if (var35 > 0) {
               g[var1 * 3 + 2] = 0;
               c[var1 * 1 + 0] = 2;
            }
         }

         var3.setFont(var9);

         for(int var36 = 0; var36 < var11.length; ++var36) {
            var13 = var9.stringWidth(var11[var36]);
            if (var14) {
               var22 = var5;
            } else if (var15) {
               var22 = var5 + (var7 - var13);
            } else if (var16 && (var22 = var5 + (var7 - var13 >> 1)) < f[var1 * 11 + 0]) {
               var22 = f[var1 * 11 + 0];
            }

            int var34 = var6;
            if (var24) {
               if ((var26 = g[var1 * 3 + 0]) != 0) {
                  var22 += g[var1 * 3 + 2];
                  if (var13 > var7 && var22 + var29 <= f[var1 * 11 + 0] && var29 != -1) {
                     g[var1 * 3 + 2] = 0;
                  }
               }
            } else if ((var27 = g[var1 * 3 + 1]) != 0) {
               var34 = var6 + g[var1 * 3 + 2];
            }

            a(var11[var36], var22, var34 + var36 * var10, var1, var2, var3);
            if (var29 > 0) {
               a(var11[var36], var22 + var29, var34 + var36 * var10, var1, var2, var3);
            }
         }

         if (var28) {
            var9.stringWidth(var11[0]);
            if (!var18) {
               short[] var10000;
               if (var26 != 0) {
                  var10000 = g;
                  var10000[var1 * 3 + 2] += var26;
                  return;
               }

               var10000 = g;
               var10000[var1 * 3 + 2] += var27;
            }
         }
      }

   }

   public static final boolean b() {
      System.gc();
      DataInputStream var0 = null;
      boolean var1 = false;

      try {
         b = new short[(var0 = new DataInputStream(HG.a.getClass().getResourceAsStream("/a"))).readShort()];

         int var2;
         for(var2 = 0; var2 < b.length; ++var2) {
            b[var2] = var0.readShort();
         }

         HG.a = new short[var0.readShort()][];

         for(var2 = 0; var2 < HG.a.length; ++var2) {
            HG.a[var2] = new short[var0.readShort()];

            for(int var3 = 0; var3 < HG.a[var2].length; ++var3) {
               HG.a[var2][var3] = var0.readShort();
            }
         }

         d = new int[var0.readShort()];

         for(var2 = 0; var2 < d.length; ++var2) {
            d[var2] = var0.readShort();
         }

         var0.close();
         var0 = null;
      } catch (Exception var13) {
         var1 = true;
      } finally {
         try {
            if (var0 != null) {
               var0.close();
            }
         } catch (Exception var12) {
         }

      }

      System.gc();
      return var1;
   }

   public static final void x() {
      O = new int[55];
      a = new int[6][15][];

      for(int var0 = 0; var0 < 15; ++var0) {
         a[0][var0] = new int[9];
         a[1][var0] = new int[9];
         a[2][var0] = new int[7];
         a[3][var0] = new int[8];
         a[4][var0] = new int[6];
         a[5][var0] = new int[6];
      }

      k = new int[23];
      s = new int[19][4];
      C = null;
      B = null;
      J = null;
      u = null;
      K = null;
      x = null;
      s = null;
      E = null;
   }

   public static final boolean d() {
      if (e == 2579220938L) {
         v = !v;
         if (HG.b(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (e == 2578033336L) {
         int[] var10000 = O;
         var10000[12] &= -65536;
         var10000 = O;
         var10000[12] |= 0;
         if (HG.b(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (e == 41284439224L) {
         a(4, 5, true, false, O);
         if (HG.b(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (e == 659427265720L) {
         a(5, 5, true, false, O);
         if (HG.b(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (e == 10555380766664L) {
         a(2, 10, true, false, O);
         if (HG.b(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else {
         if (e == 41297607096L) {
            a(24, 10, true, false, O);
            if (HG.b(3)) {
               Display.getDisplay(a).vibrate(500);
            }
         } else {
            if (e == 41217071517L) {
               a(3, 10, true, false, O);
               if (HG.b(3)) {
                  Display.getDisplay(a).vibrate(500);
               }

               return true;
            }

            if (e == 659437426872L) {
               if (ac >= 0) {
                  a(10000, q[ac], O);
               }

               if (HG.b(3)) {
                  Display.getDisplay(a).vibrate(500);
               }

               return true;
            }

            if (e == 41230911865L) {
               k(1000);
               if (HG.b(3)) {
                  Display.getDisplay(a).vibrate(500);
               }

               return true;
            }
         }

         return false;
      }
   }

   public static final boolean a(int var0, int var1, int var2) {
      return var2 >= var0 && var2 < var1;
   }

   public static final int a(int[][] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (var0[var1][4] < 0) {
            return var1;
         }
      }

      return -1;
   }

   public static final int e(int var0) {
      int var1 = 1;
      if ((var0 & 32) != 0) {
         var1 = 1;
      } else if ((var0 & 4096) != 0) {
         var1 = 1 + q.length;
      } else if ((var0 & 64) != 0) {
         var1 = 1 + q.length + x.length;
      } else if ((var0 & 128) != 0) {
         var1 = 1 + q.length + x.length + i.length;
      } else if ((var0 & 256) != 0) {
         var1 = 1 + q.length + x.length + i.length + n.length;
      } else if ((var0 & 512) != 0) {
         var1 = 1 + q.length + x.length + i.length + n.length + l.length;
      } else if ((var0 & 8192) != 0) {
         var1 = 1 + q.length + x.length + i.length + n.length + l.length + d.length;
      } else if ((var0 & 1024) != 0) {
         var1 = 1 + q.length + x.length + i.length + n.length + l.length + d.length + y.length;
      }

      for(int var2 = var1; var2 < a.c.length; ++var2) {
         if (a.c[var2][4] < 0) {
            return var2;
         }
      }

      return -1;
   }

   public static final int[] b(int var0, int var1) {
      switch(var0) {
      case 0:
         return i[var1];
      case 1:
         return n[var1];
      case 2:
         return l[var1];
      case 3:
         return y[var1];
      case 4:
         return f[var1];
      case 5:
         return d[var1];
      case 6:
         return q[var1];
      case 7:
         return x[var1];
      default:
         return null;
      }
   }

   public static final int[] a(int[] var0) {
      if ((var0[3] & 32) != 0) {
         return a[var0[11]];
      } else if ((var0[3] & 64) != 0) {
         return e[var0[4]];
      } else if ((var0[3] & 128) != 0) {
         return p[var0[4]];
      } else if ((var0[3] & 256) != 0) {
         return r[var0[4]];
      } else if ((var0[3] & 512) != 0) {
         return c[var0[4]];
      } else if ((var0[3] & 4096) != 0) {
         return w[var0[4]];
      } else if ((var0[3] & 8192) != 0) {
         return h[var0[4]];
      } else {
         return (var0[3] & 1024) != 0 ? u[var0[4]] : null;
      }
   }

   public static final void a(int[][] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1][4] = -1;
         var0[var1][0] = -1;
      }

   }

   public static final void b(int[] var0, boolean var1) {
      if (M != null) {
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         boolean var5 = false;
         int var6;
         int var9;
         int var10;
         short var13;
         int var14;
         short var16;
         int[] var10000;
         int var17;
         int var10001;
         if (((var6 = var0[3]) & 16) != 0) {
            int var18;
            var13 = (short)((var18 = b(var0)) & '\uffff');
            var16 = (short)((var18 & -65536) >> 16);
            var14 = var13 + 1;
            var17 = var16 + 1;
            short var20 = 16384;
            if (var1) {
               var20 = 0;
            }

            for(var9 = var16; var9 <= var17; ++var9) {
               for(var10 = var13; var10 <= var14; ++var10) {
                  if (var9 >= 0 && var10 >= 0 && var9 <= a.u * 2 && var10 < a.m * 2 && (M[var9 * a.m * 2 * 3 + var10 * 3 + 2] & '쀀') != 32768) {
                     var10000 = M;
                     var10001 = var9 * a.m * 2 * 3 + var10 * 3 + 2;
                     var10000[var10001] &= -49153;
                     var10000 = M;
                     var10001 = var9 * a.m * 2 * 3 + var10 * 3 + 2;
                     var10000[var10001] |= var20 & '쀀';
                  }
               }
            }

            var0[3] = var6;
         } else {
            int[] var7;
            if ((var6 & 32) != 0) {
               var7 = a(var0);
               int var19;
               var13 = (short)((var19 = b(var0)) & '\uffff');
               var16 = (short)((var19 & -65536) >> 16);
               var14 = var13 + ((short)(var7[3] & '\uffff') - (short)(var7[2] & '\uffff') >> 11);
               var17 = var16 + ((short)((var7[3] & -65536) >> 16) - (short)((var7[2] & -65536) >> 16) >> 11);
               short var21 = 16384;
               if (var1 || (var6 & '耀') != 0) {
                  var21 = 0;
               }

               for(var10 = var16; var10 <= var17; ++var10) {
                  for(int var11 = var13; var11 <= var14; ++var11) {
                     if (var10 >= 0 && var11 >= 0 && var10 <= a.u * 2 && var11 < a.m * 2 && (M[var10 * a.m * 2 * 3 + var11 * 3 + 2] & '쀀') != 32768) {
                        var10000 = M;
                        var10001 = var10 * a.m * 2 * 3 + var11 * 3 + 2;
                        var10000[var10001] &= -49153;
                        var10000 = M;
                        var10001 = var10 * a.m * 2 * 3 + var11 * 3 + 2;
                        var10000[var10001] |= var21 & '쀀';
                     }
                  }
               }

            } else if ((var6 & 4096) != 0) {
               var7 = a(var0);
               a.c(var0, a.q);
               int var12 = a.q[0] + (short)(var7[2] & '\uffff') >> 11;
               int var15 = a.q[1] + (short)((var7[2] & -65536) >> 16) >> 11;
               var14 = a.q[0] + (short)(var7[3] & '\uffff') >> 11;
               var17 = a.q[1] + (short)((var7[3] & -65536) >> 16) >> 11;
               char var8 = '耀';
               if (var1 || (var6 & '耀') != 0) {
                  var8 = 16384;
               }

               for(var9 = var15; var9 <= var17; ++var9) {
                  for(var10 = var12; var10 <= var14; ++var10) {
                     if (var9 >= 0 && var10 >= 0 && var9 <= a.u * 2 && var10 < a.m * 2) {
                        var10000 = M;
                        var10001 = var9 * a.m * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] &= -49153;
                        var10000 = M;
                        var10001 = var9 * a.m * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] |= var8 & '쀀';
                     }
                  }
               }

               var0[3] = var6;
            }
         }
      }
   }

   public static final void a(int var0, int var1, int var2, int var3, boolean var4) {
      if (M != null) {
         if (var0 < 0) {
            var0 = 0;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > a.m * 2) {
            var2 = a.m * 2;
         }

         if (var3 > a.u * 2) {
            var3 = a.u * 2;
         }

         for(int var5 = var0; var5 < var2; ++var5) {
            for(int var6 = var1; var6 < var3; ++var6) {
               int[] var10000 = M;
               int var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
               var10000[var10001] &= -49153;
               var10000 = M;
               var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
               var10000[var10001] |= 0;
               if (var4) {
                  var10000 = M;
                  var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
                  var10000[var10001] &= 65535;
                  var10000 = M;
                  var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
                  var10000[var10001] |= -65536;
               }

               if ((a.b[var6 >> 1][var5 >> 1] & '耀') != 0 && (a.b[var6 >> 1][var5 >> 1] & 255) != 255) {
                  a.e[0] = var5 << 11;
                  a.e[2] = (var5 << 11) + 2048;
                  a.e[1] = var6 << 11;
                  a.e[3] = (var6 << 11) + 2048;

                  for(int var7 = a.a((int[])a.e, 4144); var7 != -1; var7 = (short)((a.c[var7][1] & -65536) >> 16)) {
                     if ((a.c[var7][3] & 4096) != 0) {
                        if ((a.c[var7][3] & '耀') == 0) {
                           var10000 = M;
                           var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
                           var10000[var10001] &= -49153;
                           var10000 = M;
                           var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
                           var10000[var10001] |= 32768;
                        }
                     } else if ((M[var6 * a.m * 2 * 3 + var5 * 3 + 2] & '쀀') != 32768 && ((a.c[var7][3] & 32) != 0 || (a.c[var7][3] & 16) != 0) && (a.c[var7][3] & '耀') == 0) {
                        b(a.c[var7], false);
                     }
                  }
               } else {
                  var10000 = M;
                  var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
                  var10000[var10001] &= -49153;
                  var10000 = M;
                  var10001 = var6 * a.m * 2 * 3 + var5 * 3 + 2;
                  var10000[var10001] |= 32768;
               }
            }
         }

      }
   }

   public static final boolean e(int var0, int var1) {
      return var0 >= 0 && var1 >= 0 && var1 < a.b.length && var0 < a.b[var1].length && (a.b[var1][var0] & '耀') != 0 && (a.b[var1][var0] & 255) != 255;
   }

   public static final boolean a(int var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      if (var2 >= 0 && var3 >= 0 && var3 < a.u * 2 && var2 < a.m * 2 && (M[var3 * a.m * 2 * 3 + var2 * 3 + 2] & '쀀') != 32768) {
         if ((M[var3 * a.m * 2 * 3 + var2 * 3 + 2] & '쀀') == 16384) {
            return false;
         } else {
            boolean var6 = false;
            int var8;
            if (var4) {
               a.c(q[var0], a.q);
               int[] var7 = a(q[var0]);
               var8 = var2 + ((short)(var7[3] & '\uffff') - (short)(var7[2] & '\uffff') >> 11);
               int var9 = var3 + ((short)((var7[3] & -65536) >> 16) - (short)((var7[2] & -65536) >> 16) >> 11);

               for(int var10 = var2; var10 <= var8; ++var10) {
                  for(int var11 = var3; var11 <= var9; ++var11) {
                     if (!a(var0, var1, var10, var11, false, var5)) {
                        return false;
                     }
                  }
               }
            }

            if (var5 && (short)((M[var3 * a.m * 2 * 3 + var2 * 3 + 2] & -65536) >> 16) >= 0) {
               byte var12 = (byte)(M[var3 * a.m * 2 * 3 + var2 * 3 + 2] >> 16 & 255);
               var8 = (byte)(M[var3 * a.m * 2 * 3 + var2 * 3 + 2] >> 24 & 255) - q[var12][24];
               if (var12 == var0 || var8 < 0) {
                  return true;
               }

               if (var8 >= var1 && var8 <= var1) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static final int r(int[] var0) {
      if (var0.length > 2) {
         return t(var0);
      } else {
         long var1 = (long)var0[0];
         long var3 = (long)var0[1];
         var1 *= var1;
         var3 *= var3;
         long var5;
         int var7 = (int)(var5 = var1 + var3);
         boolean var8 = false;
         if (var5 != (long)var7) {
            var7 = (int)(var5 + 128L >> 8);
            var8 = true;
         }

         int var9 = g(var7);
         if (var8) {
            var9 <<= 4;
         }

         return var9;
      }
   }

   public static final int t(int[] var0) {
      if (var0.length <= 2) {
         return r(var0);
      } else {
         long var1 = (long)var0[0];
         long var3 = (long)var0[1];
         long var5 = (long)var0[2];
         var1 *= var1;
         var3 *= var3;
         var5 *= var5;
         long var7;
         int var9 = (int)(var7 = var1 + var3 + var5);
         boolean var10 = false;
         if (var7 != (long)var9) {
            var9 = (int)(var7 + 512L >> 10);
            var10 = true;
         }

         int var11 = g(var9);
         if (var10) {
            var11 <<= 5;
         }

         return var11;
      }
   }

   public static final long a(int[] var0, int[] var1) {
      long var2 = (long)(var0[0] - var1[0]);
      long var4 = (long)(var0[1] - var1[1]);
      return var2 * var2 + var4 * var4;
   }

   public static final void a(int[] var0, int[] var1) {
      int var2;
      int var3;
      if ((var2 = r(var0)) != 0) {
         for(var3 = 0; var3 < var0.length; ++var3) {
            var1[var3] = (var0[var3] << 8) / var2;
         }
      } else {
         for(var3 = 0; var3 < var0.length; ++var3) {
            var1[var3] = 0;
         }
      }

   }

   public static final void a(int[] var0, int var1, int[] var2) {
      a(var0, var2);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = var2[var3] * var1 >> 8;
      }

   }

   public static final int a(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static final int g(int var0) {
      int var1;
      if (var0 >= 65536) {
         if (var0 >= 16777216) {
            if (var0 >= 268435456) {
               if (var0 >= 1073741824) {
                  var1 = d[var0 >> 24] << 8;
               } else {
                  var1 = d[var0 >> 22] << 7;
               }
            } else if (var0 >= 67108864) {
               var1 = d[var0 >> 20] << 6;
            } else {
               var1 = d[var0 >> 18] << 5;
            }

            if ((var1 = (var1 = var1 + 1 + var0 / var1 >> 1) + 1 + var0 / var1 >> 1) * var1 > var0) {
               --var1;
               return var1;
            } else {
               return var1;
            }
         } else {
            if (var0 >= 1048576) {
               if (var0 >= 4194304) {
                  var1 = d[var0 >> 16] << 4;
               } else {
                  var1 = d[var0 >> 14] << 3;
               }
            } else if (var0 >= 262144) {
               var1 = d[var0 >> 12] << 2;
            } else {
               var1 = d[var0 >> 10] << 1;
            }

            if ((var1 = var1 + 1 + var0 / var1 >> 1) * var1 > var0) {
               --var1;
               return var1;
            } else {
               return var1;
            }
         }
      } else if (var0 >= 256) {
         if (var0 >= 4096) {
            if (var0 >= 16384) {
               var1 = d[var0 >> 8] + 1;
            } else {
               var1 = (d[var0 >> 6] >> 1) + 1;
            }
         } else if (var0 >= 1024) {
            var1 = (d[var0 >> 4] >> 2) + 1;
         } else {
            var1 = (d[var0 >> 2] >> 3) + 1;
         }

         if (var1 * var1 > var0) {
            --var1;
            return var1;
         } else {
            return var1;
         }
      } else {
         return var0 >= 0 ? d[var0] >> 4 : -1;
      }
   }

   public static final void o(Graphics var0) {
      var0.setClip(0, 0, aA, l);
      var0.setColor(m[3]);
      var0.fillRect(0, 0, aA, l);
      Object var1 = null;
      var0.setColor(m[0]);
      c(3, 0, 0, aA, l, 44);
      a((String)g, 3, 1, var0);
   }

   public static final void h(Graphics var0) {
      try {
         var0.setColor(m[27 + aq - 1]);
      } catch (Exception var2) {
         var0.setColor(16777215);
      }

      var0.fillRect(0, 0, aA, l);
      if (b != null) {
         var0.drawImage(b, aA / 2, l / 2, 3);
      }

   }

   public static final void f(Graphics var0) {
      if (y) {
         o(var0);
      } else {
         var0.setClip(0, 0, aA, l);
         var0.setColor(0);
         var0.fillRect(0, 0, aA, l);
         switch(H) {
         case 1:
         case 3:
            if (a != null) {
               int var1 = aA >> 1;
               boolean var2 = false;
               int var3 = a[1].getHeight();
               int var4;
               if ((var4 = b.a) > 100) {
                  var4 = 100;
               }

               var0.setFont(a[1]);
               var0.setClip(0, 0, aA, l);

               try {
                  if (b != null) {
                     var0.setColor(m[27]);
                  } else {
                     var0.setColor(m[8]);
                  }
               } catch (Exception var9) {
                  var0.setColor(16777215);
               }

               var0.fillRect(0, 0, aA, l);
               int var10;
               if (b != null) {
                  var0.drawImage(b, aA / 2, l / 2, 3);
                  var0.setColor(m[3]);
                  var10 = l - var3 - 20 + 0;
               } else {
                  var0.setColor(m[5]);
                  var10 = l >> 1;
               }

               try {
                  System.gc();
                  var0.drawString(e, var1 + 0, var10 - var3 + 0, 17);
               } catch (Exception var8) {
               }

               var10 += 5;
               var0.drawRect(var1 - (aA >> 1) / 2, var10, aA >> 1, 10);
               var0.fillRect(var1 + 2 - (aA >> 1) / 2, var10 + 2, ((aA >> 1) - 3) * var4 / 100, 7);
               return;
            } else if (H == 1) {
               h(var0);
               return;
            }
         case 4:
         case 5:
         default:
            return;
         case 2:
            h(var0);
            return;
         case 6:
            synchronized(a.a) {
               if (O[11] != 0) {
                  d(var0);
               } else {
                  r(var0);
               }

            }
         }
      }
   }

   public static final void I() {
      System.gc();
      V = aA / a.g + 2;
      s = l / a.l + 2;
      a = Image.createImage(V * a.g, s * a.l);
      b = a.getGraphics();
      G = -1;
      ad = -1;
      a = true;
   }

   public static final void B() {
      a = null;
      b = null;
   }

   public static final void S() {
      int[] var10000;
      int var0;
      int var1;
      for(var0 = 0; var0 < a.b[0].length; ++var0) {
         for(var1 = 0; var1 < a.b.length; ++var1) {
            var10000 = a.b[var1];
            var10000[var0] &= Integer.MAX_VALUE;
            a.b[var1][var0] = a.b[var1][var0] & -28673 | 0;
         }
      }

      for(var0 = 0; var0 < a.b[0].length; ++var0) {
         for(var1 = 0; var1 < a.b.length; ++var1) {
            int var2 = -1;

            for(int var3 = 0; var3 < 7 && var1 - var3 >= 0; ++var3) {
               if ((a.b[var1 - var3][var0] & Integer.MIN_VALUE) == 0 && (a.b[var1 - var3][var0] >> 28 & 7) == var3) {
                  if (var2 == -1) {
                     a.b[var1][var0] = a.b[var1][var0] & -28673 | (var3 & 7) << 12;
                  } else {
                     a.b[var1 - var2][var0] = a.b[var1 - var2][var0] & -1879048193 | (var3 & 7) << 28;
                     var10000 = a.b[var1 - var2];
                     var10000[var0] |= Integer.MIN_VALUE;
                  }

                  var2 = var3;
               }
            }

            if (var2 == -1) {
               a.b[var1][var0] = a.b[var1][var0] & -28673 | 28672;
            } else {
               a.b[var1 - var2][var0] = a.b[var1 - var2][var0] & -1879048193 | 1879048192;
            }
         }
      }

      for(var0 = 0; var0 < a.b[0].length; ++var0) {
         for(var1 = 0; var1 < a.b.length; ++var1) {
            if ((a.b[var1][var0] & Integer.MIN_VALUE) == 0) {
               a.b[var1][var0] = a.b[var1][var0] & -1879048193 | 1879048192;
            }

            var10000 = a.b[var1];
            var10000[var0] &= Integer.MAX_VALUE;
         }
      }

   }

   public static final void a(int[] var0, boolean var1, Graphics var2) {
      int[] var3 = null;
      short var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      if ((var0[3] & 1048576) == 0) {
         if ((var0[3] & 64) != 0) {
            var3 = e[var0[4]];
            var4 = (short)(var0[5] & '\uffff');
            var5 = (a.g >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 128) != 0) {
            var3 = p[var0[4]];
            var4 = (short)(var0[5] & '\uffff');
            var5 = (a.g >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 256) != 0) {
            var3 = r[var0[4]];
            var4 = (short)(var0[5] & '\uffff');
            var5 = (a.g >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 8192) != 0) {
            var3 = h[var0[4]];
            var4 = (short)(var0[5] & '\uffff');
            var5 = (a.g >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 1024) != 0) {
            var3 = u[var0[4]];
            var4 = (short)(var0[5] & '\uffff');
            var5 = (a.g >> 1) - (short)((var0[5] & -65536) >> 16);
            var6 = y % b[1223];
         } else if ((var0[3] & 4096) != 0) {
            var3 = w[var0[4]];
            var7 = var0[7];
            if (!var1) {
               var6 = (short)(var0[10] & '\uffff');
               g(var0);
            }
         } else if ((var0[3] & 512) != 0) {
            var3 = c[var0[4]];
            var4 = (short)(var0[5] & '\uffff');
            var5 = (a.g >> 1) - (short)((var0[5] & -65536) >> 16);
         }

         if (var3 != null) {
            a.a(var0, l);
            int var8 = l[0] * a.g >> 12;
            int var9 = (l[1] - l[2]) * a.g >> 12;
            int var10 = (short)(var3[1] & '\uffff');
            short var11 = (short)((var3[1] & -65536) >> 16);
            if ((var0[3] & 524288) != 0) {
               var10 = 112;
            }

            if (var10 != -1) {
               if (var1) {
                  if ((var0[3] & 4096) == 0) {
                     return;
                  }

                  var10 -= 8;
                  var10 += 185;
               }

               if (!l(var10)) {
                  return;
               }

               b(var8 + var4, var9 + var5, var10, var11, var6, var7, var2);
            } else {
               var2.setColor(16711680);
               var2.drawString(HG.a(var3[0]), var8 - q, var9 - c, 20);
            }
         }

         if (((var0[3] & 16) != 0 || (var0[3] & 32) != 0) && !var1) {
            d(var0, var2);
         }

         if ((var0[3] & 2048) != 0 && !var1) {
            c(var0, var2);
         }

         if ((var0[3] & 16384) != 0 && !var1) {
            e(var0, var2);
         }

         if ((var0[3] & 262144) != 0 && !var1) {
            l(var0, var2);
         }

      }
   }

   public static final void a(int var0, int var1, int var2, Graphics var3) {
      short var4;
      switch(var2) {
      case 0:
         var4 = (short)(a.A & '\uffff');
         break;
      case 1:
         var4 = (short)((a.A & -65536) >> 16);
         break;
      default:
         return;
      }

      int var5 = 0;
      if (b[var4 * 11 + 4] == 5) {
         var5 = a.a;
      }

      if (a[var4][var5] != null) {
         int var6 = var0 * a.g - q;
         int var7 = var1 * a.l - c;
         byte var8 = (byte)(a.b[var1][var0] >> (var2 << 4) & 255);
         byte var9 = (byte)(a.b[var1][var0] >> 8 + (var2 << 4) & 15);
         if (var8 >= 0) {
            short var10 = b[var4 * 11 + 5];
            short var11 = b[var4 * 11 + 6];
            int var12 = var8 % var10 * a.g;
            int var13 = var8 / var10 % var11 * a.l;
            var3.drawRegion(a[var4][var5], var12, var13, a.g, a.l, var9, var6, var7, 20);
         }

      }
   }

   public static final boolean b(int var0, int var1, int var2) {
      return var2 != -1 && !c(var2, var1) ? false : c(var0, var1);
   }

   public static final boolean c(int var0, int var1) {
      int var2 = -1;

      for(int var3 = var0; var3 != -1 && a.c(a.c[var1]) >= a.c(a.c[var3]); var3 = (short)((a.c[var3][1] & -65536) >> 16)) {
         var2 = var3;
      }

      int[] var10000;
      if (var2 == -1) {
         var10000 = a.c[var1];
         var10000[1] &= 65535;
         var10000 = a.c[var1];
         var10000[1] |= (short)var0 << 16 & -65536;
         return true;
      } else {
         short var4 = (short)((a.c[var2][1] & -65536) >> 16);
         var10000 = a.c[var1];
         var10000[1] &= 65535;
         var10000 = a.c[var1];
         var10000[1] |= (short)var4 << 16 & -65536;
         var10000 = a.c[var2];
         var10000[1] &= 65535;
         var10000 = a.c[var2];
         var10000[1] |= (short)var1 << 16 & -65536;
         return false;
      }
   }

   public static final void d(Graphics var0) {
      if ((HG.l && HG.c > 17 || !HG.l) && !q && HG.v == 0) {
         int var1 = q / a.g;
         int var2 = c / a.l;
         int var3 = aA / a.g + 2 + var1;
         int var4 = l / a.l + 2 + var2;
         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         if (var3 > a.m) {
            var3 = a.m;
         }

         if (var4 > a.u) {
            var4 = a.u;
         }

         int var5 = var1 - 6;
         int var6 = var2;
         int var7 = var3 + 6;
         int var8 = var4 + 7;
         if (var5 < 0) {
            var5 = 0;
         }

         if (var2 < 0) {
            var6 = 0;
         }

         if (var7 > a.m) {
            var7 = a.m;
         }

         if (var8 > a.u) {
            var8 = a.u;
         }

         var0.setClip(0, 0, aA, l);
         int var9 = -1;
         int var10 = -1;
         int var11 = -1;
         int var12 = -1;
         q(var0);

         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         for(var13 = var6; var13 < var8; ++var13) {
            var14 = var11;
            var15 = var12;

            for(var16 = var5; var16 < var7; ++var16) {
               for(var17 = a.a[var13][var16]; var17 != -1; var17 = (short)(a.c[var17][1] & '\uffff')) {
                  int[] var10000 = a.c[var17];
                  var10000[1] &= 65535;
                  var10000 = a.c[var17];
                  var10000[1] |= -65536;
                  boolean var18 = false;
                  if ((a.c[var17][3] & 4096) != 0 && a.c[var17][6] != 0) {
                     if (b(var10, var17, var15)) {
                        var10 = var17;
                     }

                     var18 = true;
                     var12 = var17;
                  }

                  if (!var18) {
                     if (b(var9, var17, var14)) {
                        var9 = var17;
                     }

                     var11 = var17;
                  }
               }
            }
         }

         for(var13 = var9; var13 != -1; var13 = (short)((a.c[var13][1] & -65536) >> 16)) {
            a(a.c[var13], true, var0);
         }

         var14 = Integer.MAX_VALUE;
         var13 = var9;
         if (var9 != -1) {
            var14 = a.c(a.c[var9]);
         }

         for(var15 = var6; var15 < var8; ++var15) {
            while(var13 != -1 && var14 <= (var15 + 1) * 4096) {
               a(a.c[var13], false, var0);
               if ((var13 = (short)((a.c[var13][1] & -65536) >> 16)) == -1) {
                  var14 = Integer.MAX_VALUE;
               } else {
                  var14 = a.c(a.c[var13]);
               }
            }

            for(var16 = var5; var16 < var7; ++var16) {
               for(var17 = a.b[var15][var16] >> 12 & 7; var17 != 7; var17 = a.b[var15 - var17][var16] >> 28 & 7) {
                  if (var16 >= var1 && var15 - var17 >= var2 && var16 < var3 && var15 - var17 < var4) {
                     a(var16, var15 - var17, 1, var0);
                  }
               }
            }
         }

         while(var13 != -1) {
            a(a.c[var13], false, var0);
            var13 = (short)((a.c[var13][1] & -65536) >> 16);
         }

         for(var13 = var10; var13 != -1; var13 = (short)((a.c[var13][1] & -65536) >> 16)) {
            a(a.c[var13], true, var0);
            a(a.c[var13], false, var0);
         }
      }

      if (!HG.l) {
         if (ac == -1) {
            p(var0);
         }

         e(var0);
         c(var0);
         if (q) {
            v(var0);
         } else if (j) {
            b(var0);
         }

         if (t) {
            m(var0);
         }
      }

      var0.setClip(0, 0, aA, l);
   }

   public static final void r(Graphics var0) {
      q(var0);
      a.c(O, y);
      int var1 = y[0] * a.g >> 12;
      int var2 = y[1] * a.g >> 12;
      if (l(134)) {
         b(var1, var2, 134, 0, 0, 0, var0);
      }

      a(var0);
      if (!HG.l) {
         if (h || r) {
            b((Graphics)var0, 0);
            i(var0);
         }

         if (t) {
            m(var0);
         }
      }

      var0.setClip(0, 0, aA, l);
   }

   public static final void c(int var0, int var1, int var2, int var3) {
      b.setColor(0);

      for(int var4 = var0; var4 < var2; ++var4) {
         for(int var5 = var1; var5 < var3; ++var5) {
            int var6 = var4 % V * a.g;
            int var7 = var5 % s * a.l;
            b.fillRect(var6, var7, a.g, a.l);
            if (var4 >= 0 && var4 < a.b[0].length && var5 >= 0 && var5 < a.b.length) {
               short var8 = (short)(a.A & '\uffff');

               for(int var9 = 0; var9 < (O[11] == 0 ? 2 : 1); ++var9) {
                  byte var10 = (byte)(a.b[var5][var4] >> (var9 << 4) & 255);
                  byte var11 = (byte)(a.b[var5][var4] >> 8 + (var9 << 4) & 15);
                  if (var10 >= 0) {
                     short var12 = b[var8 * 11 + 5];
                     short var13 = b[var8 * 11 + 6];
                     int var14 = var10 % var12 * a.g;
                     int var15 = var10 / var12 % var13 * a.l;
                     int var16 = 0;
                     if (b[var8 * 11 + 4] == 5) {
                        var16 = a.a;
                     }

                     b.drawRegion(a[var8][var16], var14, var15, a.g, a.l, var11, var6, var7, 20);
                  }

                  var8 = (short)((a.A & -65536) >> 16);
               }
            }
         }
      }

   }

   public static final void C() {
      int var0 = G;
      int var1 = ad;
      G = q / a.g;
      if (q < 0) {
         --G;
      }

      ad = c / a.l;
      if (c < 0) {
         --ad;
      }

      if (a) {
         c(G, ad, G + V, ad + s);
         a = false;
      } else {
         if (G != var0) {
            if (var0 < G) {
               while(var0 + V < G) {
                  var0 += V;
               }

               c(var0 + V, var1, G + V, var1 + s);
            } else {
               while(var0 - V > G) {
                  var0 -= V;
               }

               c(G, var1, var0, var1 + s);
            }

            var0 = G;
         }

         if (ad != var1) {
            if (var1 < ad) {
               while(var1 + s < ad) {
                  var1 += s;
               }

               c(var0, var1 + s, var0 + V, ad + s);
               return;
            }

            while(var1 - s > ad) {
               var1 -= s;
            }

            c(var0, ad, var0 + V, var1);
         }

      }
   }

   public static final void q(Graphics var0) {
      C();
      int var1 = -G % V * a.g;
      int var2 = -ad % s * a.l;
      int var3;
      if (q >= 0) {
         var3 = q % a.g;
      } else {
         var3 = a.g + q % a.g;
      }

      int var4;
      if (c >= 0) {
         var4 = c % a.l;
      } else {
         var4 = a.l + c % a.l;
      }

      var0.drawRegion(a, 0, 0, a.getWidth(), a.getHeight(), 0, var1 - var3, var2 - var4, 20);
      var0.drawRegion(a, 0, 0, a.getWidth(), a.getHeight(), 0, var1 - var3 + V * a.g, var2 - var4, 20);
      var0.drawRegion(a, 0, 0, a.getWidth(), a.getHeight(), 0, var1 - var3, var2 - var4 + s * a.l, 20);
      var0.drawRegion(a, 0, 0, a.getWidth(), a.getHeight(), 0, var1 - var3 + V * a.g, var2 - var4 + s * a.l, 20);
   }

   public static final void O() {
      e = new short[16];
      d();
   }

   public static final void c() {
      a = null;
   }

   public static final void d() {
      int var0 = 0;
      R = aA - (c[126][3] << 1) - c[150][3] * 4;
      R /= 5;
      if (R < 4) {
         R = 4;
      }

      x = b[1530] + b[1607] - (c[150][4] << 1) >> 1;
      if (x < 4) {
         x = 4;
      }

      int var1 = aA - c[150][3] * 4 - R * 3 >> 1;
      int var2 = l - b[1530];
      int var3 = l - (c[150][4] + x) * 2;
      if (var2 > var3) {
         var2 = var3;
      }

      int var4 = var1;

      for(int var6 = 0; var6 < 2; ++var6) {
         for(int var7 = 0; var7 < 4; ++var7) {
            e[(var0 << 1) + 0] = (short)var1;
            e[(var0 << 1) + 1] = (short)var2;
            ++var0;
            var1 += c[150][3] + R;
         }

         var1 = var4;
         var2 += c[150][4] + x;
      }

      c = (short)((c[150][3] + R) * 4 - R);
      a = (short)(a[1].getHeight() + 4);
      d = (short)var4;
      b = (short)(var2 - a - x);
      c(5, d, b, c, a, 156);
      f(5, -2, 0);
   }

   public static final void f() {
      int var0 = O[40];
      if ((O[39] & 1 << var0) == 0) {
         a = HG.a((int)429);
      } else {
         short var2;
         int[][] var3;
         int[][] var4;
         int var5;
         int var6;
         short var1 = (short)(O[31 + var0] & '\uffff');
         var2 = (short)((O[31 + var0] & -65536) >> 16);
         var3 = a[var1];
         var4 = (int[][])null;
         var5 = -1;
         var6 = -1;
         label36:
         switch(var1) {
         case 0:
            var4 = e;
            int var7 = 6;

            while(true) {
               if (var7 > 7) {
                  break label36;
               }

               if (var3[var2][var7] > 0) {
                  if (g[(short)((var3[var2][var7] & -65536) >> 16)][1] == 0) {
                     var5 = g[(short)((var3[var2][var7] & -65536) >> 16)][0];
                  } else {
                     var6 = g[(short)((var3[var2][var7] & -65536) >> 16)][0];
                  }
               }

               ++var7;
            }
         case 1:
            var4 = p;
            break;
         case 2:
            var4 = r;
            break;
         case 3:
            var4 = h;
            break;
         case 4:
            var4 = u;
         }

         a = "";
         if (var5 >= 0) {
            a = a + HG.a(var5) + " ";
         }

         a = a + HG.a(var4[var3[var2][4]][0]);
         if (var6 >= 0) {
            a = a + " " + HG.a(var6);
         }

      }
   }

   public static final int d() {
      int var0 = O[40];
      return (O[39] & 1 << var0) == 0 ? -1 : (short)(O[31 + var0] & '\uffff');
   }

   public static final int c() {
      int var0 = O[40];
      return (O[39] & 1 << var0) == 0 ? -1 : (short)((O[31 + var0] & -65536) >> 16);
   }

   public static final int d(int var0) {
      z = false;
      if (a(61) && (var0 < 4 && var0 > 0 || var0 > 4)) {
         --var0;
      }

      if (a(62) && (var0 < 3 || var0 >= 4 && var0 < 7)) {
         ++var0;
      }

      if (a(55) && var0 >= 4) {
         var0 -= 4;
      }

      if (a(60) && var0 < 4) {
         var0 += 4;
      }

      if (a(101)) {
         var0 = 0;
         z = true;
      }

      if (a(102)) {
         var0 = 1;
         z = true;
      }

      if (a(103)) {
         var0 = 2;
         z = true;
      }

      if (a(104)) {
         var0 = 3;
         z = true;
      }

      if (a(105)) {
         var0 = 4;
         z = true;
      }

      if (a(106)) {
         var0 = 5;
         z = true;
      }

      if (a(107)) {
         var0 = 6;
         z = true;
      }

      if (a(108)) {
         var0 = 7;
         z = true;
      }

      return var0;
   }

   public static final void w() {
      int var0 = d(O[40]);
      boolean var1 = false;
      if (a(65) || z) {
         int var2 = (short)HG.a & '\uffff' | (short)HG.c << 16 & -65536;
         O[31 + var0] = var2;
         int[] var10000 = O;
         var10000[39] |= 1 << var0;

         for(int var3 = 0; var3 < 8; ++var3) {
            if (var3 != var0 && var2 == O[31 + var3]) {
               O[31 + var3] = -1;
               var10000 = O;
               var10000[39] &= ~(1 << var3);
            }
         }

         var1 = true;
      }

      if (a(95) || a(85) || var1) {
         r = false;
         y();
         if (HG.c != 19 && HG.c != 21) {
            HG.l();
         } else {
            HG.a(HG.c);
         }

         HG.l = true;
      }

      O[40] = var0;
      f();
   }

   public static final void ab() {
      int var0 = O[40];
      if (a(95) || a(85)) {
         h = false;
         y();
      }

      if (a(65)) {
         h = false;
         d(d(), c());
         y();
      }

      var0 = d(var0);
      O[40] = var0;
      f();
      if (z) {
         h = false;
         d(d(), c());
         y();
      }

   }

   public static final void i(Graphics var0) {
      int var1 = O[40];

      for(int var2 = 0; var2 < 8; ++var2) {
         short var3 = (short)(O[31 + var2] & '\uffff');
         short var4 = (short)((O[31 + var2] & -65536) >> 16);
         if (var3 != -1 && var4 != -1 && (O[39] & 1 << var2) != 0 && a[var3][var4][4] != -1) {
            int var5 = a(a[var3][var4])[2];
            a(e[(var2 << 1) + 0], e[(var2 << 1) + 1], 150, var5, var0);
         } else {
            a(e[(var2 << 1) + 0], e[(var2 << 1) + 1], 150, 49, var0);
         }
      }

      a(e[(var1 << 1) + 0], e[(var1 << 1) + 1], 150, 59, var0);
      s(var0);
   }

   public static final void s(Graphics var0) {
      var0.setColor(m[22]);
      var0.drawRect(d - 1, b - 1, c + 2, a + 2);
      var0.setColor(m[23]);
      var0.drawRect(d - 2, b - 2, c + 2, a + 2);
      var0.setColor(m[24]);
      var0.fillRect(d, b, c, a);
      var0.setColor(m[25]);
      a((String)a, 5, 1, var0);
   }

   public static final void p() {
      b();
   }

   public static final void L() {
      c = null;
   }

   public static final void b() {
      int var0 = aA >> 3;
      int var1 = aA - (var0 << 1);
      int var2 = a[2].getHeight() + 4;
      c(4, var0 + 4, 4, var1 - 8, var2, 156);
      f(4, -2, 0);
      p = var0;
      Y = aA - (var0 << 1);
      am = var2;
   }

   public static final void d(int var0) {
      if (var0 == -1) {
         c = null;
      } else {
         c = HG.a(a[q[var0][11]][0]);
         short var1 = (short)(q[var0][12] & '\uffff');
         short var2;
         if ((var2 = (short)((q[var0][12] & -65536) >> 16)) != 0) {
            X = Y * var1 / var2;
         } else {
            X = Y;
         }

         if (X < 0) {
            X = 0;
         }

         if (X > Y) {
            X = 0;
         }

      }
   }

   public static final void k(Graphics var0) {
      if (c != null) {
         var0.setClip(0, 0, aA, l);
         var0.setColor(m[15]);
         var0.drawRect(p - 1, 3, Y + 2, am + 2);
         var0.setColor(m[14]);
         var0.drawRect(p - 2, 2, Y + 2, am + 2);
         var0.setColor(m[17]);
         var0.fillRect(p, 4, Y, am);
         var0.setColor(m[16]);
         var0.fillRect(p, 4, X, am);
         var0.setColor(m[18]);
         a((String)c, 4, 2, var0);
      }
   }

   public static final void e(Graphics var0) {
      if (ac != -1) {
         int var1 = q[ac][4] * a.g >> 12;
         int var2 = q[ac][5] * a.g >> 12;
         boolean var3 = false;
         byte var5;
         if (g) {
            var5 = 1;
         } else {
            var5 = 0;
         }

         short[] var4 = a(q[ac], true);
         b(var1 + var4[0], var2 + var4[1], 151, 0, var5, 0, var0);
         b(var1 + var4[2], var2 + var4[1], 151, 0, var5, 2, var0);
         b(var1 + var4[2], var2 + var4[3], 151, 0, var5, 3, var0);
         b(var1 + var4[0], var2 + var4[3], 151, 0, var5, 1, var0);
      }
   }

   public static final void t() {
      ag = -1;
      b = -1;
      i = "";
      Object var0 = null;
      int var1 = b[1518] + b[1386] + 5;
      int var2 = a[1].getHeight() + 4 + 5;
      int var3 = l - (b[1387] + b[1607] - 7);
      int var4 = aA - 2 * var1 - 1;
      int var5 = l - (var2 + 5);
      if (var3 > var5) {
         var3 = var5;
      }

      c(6, var1 + 4, var3 + 4, var4 - 8, var2, 532);
   }

   public static final int[] a(int var0, int var1) {
      int var3;
      label129: {
         if (var0 >= 0 && var0 < a.m && var1 >= 0 && var1 < a.u) {
            var3 = a.a[var1][var0];

            while(var3 != -1) {
               if ((a.c[var3][3] & 1048576) != 0) {
                  var3 = (short)(a.c[var3][1] & '\uffff');
               } else {
                  if ((a.c[var3][3] & 524288) != 0) {
                     ag = var3;
                     b = 7;
                     T = 1;
                     return a(a.c[var3]);
                  }

                  if ((a.c[var3][3] & 256) != 0) {
                     ag = var3;
                     b = 0;
                     T = 3;
                     return r[a.c[var3][4]];
                  }

                  if ((a.c[var3][3] & 64) != 0) {
                     ag = var3;
                     b = 0;
                     T = 3;
                     return e[a.c[var3][4]];
                  }

                  if ((a.c[var3][3] & 128) != 0) {
                     ag = var3;
                     b = 0;
                     T = 3;
                     return p[a.c[var3][4]];
                  }

                  if ((a.c[var3][3] & 8192) != 0) {
                     ag = var3;
                     b = 0;
                     T = 3;
                     return h[a.c[var3][4]];
                  }

                  if ((a.c[var3][3] & 1024) != 0) {
                     ag = var3;
                     b = 0;
                     T = 3;
                     return u[a.c[var3][4]];
                  }

                  if ((a.c[var3][3] & 512) != 0) {
                     ag = var3;
                     b = 0;
                     T = 3;
                     return c[a.c[var3][4]];
                  }

                  if ((a.c[var3][3] & 32) != 0) {
                     if (j((short)((a.c[var3][2] & -65536) >> 16)) && (a.c[var3][13] & 2) == 0 && (a.c[var3][3] & 65536) == 0) {
                        ag = var3;
                        b = 1;
                        T = 2;
                        return a[a.c[var3][11]];
                     }

                     if ((a.c[var3][13] & 2) != 0) {
                        short var4 = (short)(a.c[var3][17] & '\uffff');
                        if ((short)((D[var4] & -65536) >> 16) > 0) {
                           ag = var3;
                           b = 7;
                           T = 1;
                           return a[a.c[var3][11]];
                        }
                     }
                  } else if ((a.c[var3][3] & 4096) != 0) {
                     byte var12;
                     switch(var12 = (byte)(a.c[var3][8] & 255)) {
                     case 1:
                     case 2:
                     case 3:
                     case 6:
                     case 7:
                     default:
                        break;
                     case 4:
                     case 5:
                        byte var6 = (byte)(a.c[var3][8] >> 8 & 255);
                        int var7;
                        if (((var7 = a.b()) & 1 << var6) == 0) {
                           if ((var7 & 1 << var6 + 1) != 0) {
                              byte var8 = (byte)(a.c[var3][8] >> 16 & 255);
                              byte var9 = (byte)(a.c[var3][8] >> 24 & 255);
                              b = 6;
                              T = 0;
                              if (var9 > 0) {
                                 b = 4;
                                 T = 6;
                              }

                              if (var8 > 0) {
                                 for(int var10 = 0; var10 < a[5].length; ++var10) {
                                    int var11;
                                    if ((var11 = a[5][var10][4]) >= 0 && c[var11][4] == var8) {
                                       b = 5;
                                       T = 5;
                                       break label129;
                                    }
                                 }
                              }
                           } else {
                              b = 3;
                              T = 4;
                           }
                           break label129;
                        }

                        if (var12 == 4) {
                           b = 7;
                           T = 1;
                           break label129;
                        }
                        break;
                     case 8:
                        int var5 = a.a(var3, (int[])null);
                        if ((short)((D[var5] & -65536) >> 16) != 0) {
                           b = 7;
                           T = 1;
                           ag = var3;
                           return w[a.c[var3][4]];
                        }
                     }
                  }

                  var3 = (short)(a.c[var3][1] & '\uffff');
               }
            }
         }

         return null;
      }

      ag = var3;
      return w[a.c[var3][4]];
   }

   public static final void c(int var0, int var1) {
      boolean var2 = false;
      boolean var3 = false;
      int var4 = ag;
      int var5 = b;
      int[] var6 = null;
      ag = -1;
      b = -1;
      T = -1;
      o = -1;
      int var7 = O[30];
      boolean var8 = false;

      int var10;
      for(int var9 = -1; var9 < 2; ++var9) {
         for(var10 = -1; var10 < 2; ++var10) {
            Object var11 = null;
            byte var12;
            if (var7 == 0 && var10 < 0 || var7 == 2 && var10 > 0 || var7 == 3 && var9 < 0 || var7 == 1 && var9 > 0) {
               var12 = 2;
            } else if ((var7 != 0 && var7 != 2 || var10 != 0) && (var7 != 3 && var7 != 1 || var9 != 0)) {
               var12 = 0;
            } else {
               var12 = 1;
            }

            int[] var13;
            if (var12 >= o && (var13 = a(var0 + var9, var1 + var10)) != null) {
               if (var12 > o) {
                  var2 = false;
                  var3 = false;
               }

               if (var2 && var12 == o) {
                  var3 = true;
               } else {
                  o = var12;
                  var6 = var13;
                  var2 = true;
               }
            }
         }
      }

      if (var3) {
         ag = -1;
         b = -1;
         switch(O[30]) {
         case 0:
            --var1;
            break;
         case 1:
            ++var0;
            break;
         case 2:
            ++var1;
            break;
         case 3:
            --var0;
         }

         if (var0 < 0 || var0 >= a.m || var1 < 0 || var1 >= a.u) {
            ag = -1;
            b = -1;
            return;
         }

         for(var10 = a.a[var1][var0]; var10 != -1; var10 = (short)(a.c[var10][1] & '\uffff')) {
            var6 = a(var0, var1);
         }
      }

      if ((var4 != ag || var5 != b) && ag >= 0) {
         i = "";
         if ((a.c[ag][3] & 4096) == 0 && (a.c[ag][3] & 524288) == 0) {
            if ((a.c[ag][3] & 256) != 0 && a.c[ag][6] > 1) {
               i = a.c[ag][6] + "x ";
            }

            i = i + HG.a(var6[0]);
         }

         f(6, -2, 0);
      }

   }

   public static final void p(Graphics var0) {
      if (b >= 0) {
         int[] var1 = a.c[ag];
         boolean var2 = false;
         boolean var3 = false;
         boolean var4 = false;
         int var6;
         int var7;
         int var8;
         if ((var1[3] & 4) != 0) {
            var6 = a(var1, true)[1] - 5;
            var7 = (var1[4] * a.g >> 12) - q;
            var8 = (var1[5] * a.g >> 12) - c;
            a(var7, var8 + var6, 137, T, var0);
            return;
         }

         a.a(var1, l);
         var7 = l[0] * a.g >> 12;
         var8 = (l[1] - l[2]) * a.g >> 12;
         short var5 = (short)(a(var1)[1] & '\uffff');
         var6 = b[var5 * 11 + 1] + 5;
         if ((var1[3] & 4096) == 0) {
            var6 += (short)((var1[5] & -65536) >> 16);
            var7 += (short)(var1[5] & '\uffff');
         }

         b(var7, var8 - var6, 137, T, var0);
      }

   }

   public static final void j(Graphics var0) {
      if (b >= 0 && i.length() > 0) {
         var0.setClip(0, 0, aA, l);
         Object var1 = null;
         int var2 = b[1518] + b[1386] + 5;
         int var3 = a[1].getHeight() + 4 + 5 - 1;
         int var4 = l - (b[1387] + b[1607] - 7);
         int var5 = aA - 2 * var2 - 1;
         int var6 = l - (var3 + 5);
         if (var4 > var6) {
            var4 = var6;
         }

         var0.setColor(m[8]);
         var0.fillRect(var2, var4, var5, var3);
         var0.setColor(m[5]);
         var0.drawLine(var2, var4, var2 + var5, var4);
         var0.drawLine(var2, var4, var2, var4 + var3);
         var0.setColor(m[6]);
         var0.drawLine(var2 + 1, var4 + 1, var2 + var5, var4 + 1);
         var0.drawLine(var2 + 1, var4 + 1, var2 + 1, var4 + var3 - 1);
         var0.drawLine(var2 + var5 + 1, var4, var2 + var5 + 1, var4 + var3 + 1);
         var0.drawLine(var2, var4 + var3 + 1, var2 + var5 + 1, var4 + var3 + 1);
         var0.setColor(m[7]);
         var0.drawLine(var2 + 1, var4 + var3, var2 + var5, var4 + var3);
         var0.drawLine(var2 + var5, var4 + 1, var2 + var5, var4 + var3);
         var0.setColor(m[5]);
         a((String)i, 6, 1, var0);
      }

   }

   public static final boolean i(int var0) {
      int[] var10000;
      short var1;
      int var10001;
      if ((a.c[var0][3] & 64) != 0 && c(0, a.c[var0])) {
         var1 = (short)((a.c[var0][2] & -65536) >> 16);
         if (O[11] >= 0) {
            var10000 = K;
            var10001 = O[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((a.c[var0][3] & 128) != 0 && c(1, a.c[var0])) {
         var1 = (short)((a.c[var0][2] & -65536) >> 16);
         if (O[11] >= 0) {
            var10000 = x;
            var10001 = O[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((a.c[var0][3] & 256) != 0 && c(2, a.c[var0])) {
         var1 = (short)((a.c[var0][2] & -65536) >> 16);
         if (O[11] >= 0) {
            var10000 = B;
            var10001 = O[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((a.c[var0][3] & 8192) != 0 && c(3, a.c[var0])) {
         var1 = (short)((a.c[var0][2] & -65536) >> 16);
         if (O[11] >= 0) {
            var10000 = s;
            var10001 = O[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((a.c[var0][3] & 512) != 0 && c(5, a.c[var0])) {
         var1 = (short)((a.c[var0][2] & -65536) >> 16);
         if (O[11] >= 0) {
            var10000 = u;
            var10001 = O[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((a.c[var0][3] & 1024) != 0 && c(4, a.c[var0])) {
         var1 = (short)((a.c[var0][2] & -65536) >> 16);
         if (O[11] >= 0) {
            var10000 = E;
            var10001 = O[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else {
         b(241, 230, 101, 106);
         return false;
      }
   }

   public static final boolean b(int var0, int[] var1) {
      int[][] var2 = a[var0];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         if (var0 == 2 && var2[var3][4] == var1[4]) {
            return true;
         }

         if (var2[var3][4] == -1) {
            return true;
         }
      }

      return false;
   }

   public static final boolean a(int var0, int var1, boolean var2) {
      short var3 = (short)(a[var0][var1][8] & '\uffff');
      short var4 = (short)((a[var0][var1][8] & -65536) >> 16);
      if (var3 == 0) {
         if (a(4, false) < var4) {
            if (var2) {
               a(HG.a((int)80), HG.a((int)230), 101, 106);
            }

            return false;
         }
      } else if (var3 == 1 && a(5, false) < var4) {
         if (var2) {
            a(HG.a((int)79), HG.a((int)230), 101, 106);
         }

         return false;
      }

      return true;
   }

   public static final boolean a(int[] var0) {
      short var1 = (short)(var0[8] & '\uffff');
      short var2 = (short)((var0[8] & -65536) >> 16);
      boolean var3 = false;
      int var4;
      switch(var1) {
      case 0:
         var4 = a(4, false);
         break;
      case 1:
         var4 = a(5, false);
         break;
      default:
         return true;
      }

      return var4 >= var2;
   }

   public static final void d(int var0, int var1) {
      int[] var10000;
      int var2;
      int var3;
      switch(var0) {
      case 0:
         if (O[42] != var1) {
            if (a(var0, var1, true)) {
               if (O[42] != -1) {
                  a(var0, O[42], false);
                  O[42] = -1;
               }

               O[42] = var1;
               O[45] = -1;
               a(var0, O[42], true);
            }
         } else {
            a(var0, O[42], false);
            O[42] = -1;
         }

         HG.m(12);
         break;
      case 1:
         if (O[41] != var1) {
            if (a(var0, var1, true)) {
               if (O[41] != -1) {
                  a(var0, O[41], false);
                  O[41] = -1;
               }

               O[41] = var1;
               a(var0, O[41], true);
            }
         } else {
            a(var0, O[41], false);
            O[41] = -1;
         }

         HG.m(11);
         break;
      case 2:
         d(a[var0][var1]);
         if (a[var0][var1][6] <= 1) {
            var2 = (short)var0 & '\uffff' | (short)var1 << 16 & -65536;

            for(var3 = 0; var3 < 8; ++var3) {
               if (var2 == O[31 + var3]) {
                  var10000 = O;
                  var10000[39] &= ~(1 << var3);
                  var10000 = O;
                  var10000[31 + var3] &= 65535;
                  var10000 = O;
                  var10000[31 + var3] |= (short)a[var0][var1][4] << 16 & -65536;
               }
            }

            a[var0][var1][4] = -1;
         } else {
            int var10002 = a[var0][var1][6]--;
         }
         break;
      case 3:
         if ((var2 = h[a[var0][var1][4]][10]) == 1) {
            if (O[44] != -1) {
               a(var0, O[44], false);
            }

            if (O[44] != var1) {
               O[44] = var1;
               a(var0, O[44], true);
            } else {
               O[44] = -1;
            }
         } else if (var2 == 0) {
            if ((short)((var3 = O[43]) & '\uffff') == var1) {
               a(var0, (short)(var3 & '\uffff'), false);
               var10000 = O;
               var10000[43] &= -65536;
               var10000 = O;
               var10000[43] |= 65535;
            } else if ((short)((var3 & -65536) >> 16) == var1) {
               a(var0, (short)((var3 & -65536) >> 16), false);
               var10000 = O;
               var10000[43] &= 65535;
               var10000 = O;
               var10000[43] |= -65536;
            } else if ((short)(var3 & '\uffff') == -1) {
               var10000 = O;
               var10000[43] &= -65536;
               var10000 = O;
               var10000[43] |= (short)var1 & '\uffff';
               a(var0, (short)(O[43] & '\uffff'), true);
            } else if ((short)((var3 & -65536) >> 16) == -1) {
               var10000 = O;
               var10000[43] &= 65535;
               var10000 = O;
               var10000[43] |= (short)var1 << 16 & -65536;
               a(var0, (short)((O[43] & -65536) >> 16), true);
            }
         }
         break;
      case 4:
         if (O[42] != -1) {
            a(0, O[42], false);
            O[42] = -1;
         }

         if (O[45] != var1) {
            O[45] = var1;
         } else {
            O[45] = -1;
         }
      }

      boolean var5 = false;
      boolean var6 = false;

      while(true) {
         while(O[42] != -1 && !a(0, O[42], false)) {
            a(0, O[42], false);
            O[42] = -1;
            var5 = true;
         }

         if (O[41] == -1 || a(1, O[41], false)) {
            if (var5 || var6) {
               String var4 = "";
               if (var5) {
                  var4 = var4 + HG.a((int)88) + "\n";
               }

               if (var6) {
                  var4 = var4 + HG.a((int)87);
               }

               a(var4, HG.a((int)230), 101, 106);
            }

            return;
         }

         a(0, O[41], false);
         O[41] = -1;
         var6 = true;
      }
   }

   public static final void a(boolean var0) {
      int var1 = 1;
      if ((a[HG.a][HG.c][3] & 256) != 0) {
         var1 = L;
      }

      int var2 = a(HG.a, HG.c, var1, false, false);
      boolean var3 = false;
      int var7;
      if (var0) {
         var7 = a.a(ag, a.c[var2]);
      } else {
         var7 = a.a(ag, (int[])null);
      }

      short var4 = (short)(D[var7] & '\uffff');
      boolean var5 = true;
      int[] var10000;
      if ((a.c[var2][3] & 256) != 0) {
         for(short var6 = var4; var6 != -1; var6 = (short)(a.c[var6][1] & '\uffff')) {
            if (a.c[var6][4] == a.c[var2][4]) {
               var10000 = a.c[var6];
               var10000[6] += var1;
               var5 = false;
               break;
            }
         }
      }

      int var8;
      if (var5) {
         var10000 = D;
         var10000[var7] &= -65536;
         var10000 = D;
         var10000[var7] |= (short)var2 & '\uffff';
         var10000 = a.c[var2];
         var10000[1] &= -65536;
         var10000 = a.c[var2];
         var10000[1] |= (short)var4 & '\uffff';
         var8 = (short)((D[var7] & -65536) >> 16) + 1;
         var10000 = D;
         var10000[var7] &= 65535;
         var10000 = D;
         var10000[var7] |= (short)var8 << 16 & -65536;
      }

      if (var0) {
         if ((var8 = a.a(a.c[var2]) * var1) % 2 != 0) {
            ++var8;
         }

         k(var8 * 40 / 100);
      }

      HG.a(HG.c);
   }

   public static final boolean a(boolean var0) {
      int var1 = a.a(ag, (int[])null) + HG.G;
      short var2 = (short)(D[var1] & '\uffff');
      short var3 = -1;
      int var4 = 0;

      short var5;
      for(var5 = -1; var2 != -1; var2 = (short)(a.c[var2][1] & '\uffff')) {
         if (HG.B == var4) {
            var5 = (short)(a.c[var2][2] & '\uffff');
            break;
         }

         ++var4;
         var3 = var2;
      }

      boolean var6 = false;
      if (var5 >= 0) {
         int var7 = 0;
         int var8 = -1;
         boolean var9 = (a.c[var5][3] & 256) != 0;
         if (var0) {
            int var10 = a.a(a.c[var5]);
            if (var9) {
               var10 *= L;
               var7 = a.c[var5][6];
               var8 = a.c[var5][4];
               a.c[var5][6] = L;
            }

            if (!k(-var10)) {
               b(240, 230, 101, 106);
               if (var9) {
                  a.c[var5][6] = var7;
               }

               return true;
            }
         }

         if (i(var5)) {
            if (var0 && var9 && (var7 -= L) > 0) {
               a.c[var5][4] = var8;
               a.c[var5][6] = var7;
            }

            if (var7 == 0) {
               var2 = (short)(a.c[var2][1] & '\uffff');
               int[] var10000;
               if (var3 == -1) {
                  var10000 = D;
                  var10000[var1] &= -65536;
                  var10000 = D;
                  var10000[var1] |= (short)var2 & '\uffff';
               } else {
                  var10000 = a.c[var3];
                  var10000[1] &= -65536;
                  var10000 = a.c[var3];
                  var10000[1] |= (short)var2 & '\uffff';
               }

               var7 = (short)((D[var1] & -65536) >> 16) - 1;
               var10000 = D;
               var10000[var1] &= 65535;
               var10000 = D;
               var10000[var1] |= (short)var7 << 16 & -65536;
               if (var7 == 0 && O[11] == -1) {
                  a.c[ag][8] = 0;
               }
            }

            HG.f(21);
         }
      } else if (var0) {
         k(0);
      }

      return var0 || (short)((D[var1] & -65536) >> 16) > 0;
   }

   public static final int a(int var0, int var1) {
      int var2 = 0;

      for(int var3 = 0; var3 < a[var0].length; ++var3) {
         if (a[var0][var3][4] == var1) {
            if (var0 == 2) {
               var2 += a[var0][var3][6];
               break;
            }

            ++var2;
         }
      }

      return var2;
   }

   public static final void a(int var0, int var1) {
      short var2 = (short)((var0 & -65536) >> 16);
      short var3 = (short)(var0 & '\uffff');
      int var4 = a(var2, var3);
      int var5;
      if (var2 == 2) {
         for(var5 = 0; var5 < a[var2].length; ++var5) {
            if (a[var2][var5][4] == var3) {
               if (var4 > var1) {
                  int[] var10000 = a[var2][var5];
                  var10000[6] -= var1;
                  return;
               }

               if (var4 == var1) {
                  a(var2, var5, var4, true, false);
               }

               return;
            }
         }
      } else {
         for(var5 = 0; var5 < a[var2].length; ++var5) {
            if (a[var2][var5][4] == var3) {
               a(var2, var5, 1, true, false);
               --var4;
               if (var4 == 0) {
                  return;
               }
            }
         }
      }

   }

   public static final int a(int var0, int var1, int var2, boolean var3, boolean var4) {
      boolean var5 = false;
      int var6 = -1;
      int var7 = -1;
      int var14;
      int[] var10000;
      switch(var0) {
      case 0:
         if (!var3) {
            var14 = a(i);
            var6 = e(a[var0][var1][3]);
            if (var14 >= 0 && var6 >= 0) {
               System.arraycopy(a[var0][var1], 0, i[var14], 0, a[var0][var1].length);
               a.c[var6] = i[var14];
               var10000 = a.c[var6];
               var10000[2] &= -65536;
               var10000 = a.c[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = a.c[var6];
               var10000[2] &= 65535;
               var10000 = a.c[var6];
               var10000[2] |= (short)var14 << 16 & -65536;
               a.c[var6][1] = -1;
               var10000 = a.c[var6];
               var10000[3] |= 64;
               if (var4) {
                  a.a(i[var14], (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
               }
            }
         }

         if (O[42] == var1) {
            a(var0, O[42], false);
            O[42] = -1;
         }
         break;
      case 1:
         if (!var3) {
            var14 = a(n);
            var6 = e(a[var0][var1][3]);
            if (var14 >= 0 && var6 >= 0) {
               System.arraycopy(a[var0][var1], 0, n[var14], 0, a[var0][var1].length);
               a.c[var6] = n[var14];
               var10000 = a.c[var6];
               var10000[2] &= -65536;
               var10000 = a.c[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = a.c[var6];
               var10000[2] &= 65535;
               var10000 = a.c[var6];
               var10000[2] |= (short)var14 << 16 & -65536;
               a.c[var6][1] = -1;
               var10000 = a.c[var6];
               var10000[3] |= 128;
               if (var4) {
                  a.a(n[var14], (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
               }
            }
         }

         if (O[41] == var1) {
            a(var0, O[41], false);
            O[41] = -1;
         }
         break;
      case 2:
         if (!var3) {
            var14 = a(l);
            var6 = e(a[var0][var1][3]);
            if (var14 >= 0 && var6 >= 0) {
               System.arraycopy(a[var0][var1], 0, l[var14], 0, a[var0][var1].length);
               l[var14][6] = var2;
               var7 = a[var0][var1][6] - var2;
               a[var0][var1][6] = var7;
               a.c[var6] = l[var14];
               var10000 = a.c[var6];
               var10000[2] &= -65536;
               var10000 = a.c[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = a.c[var6];
               var10000[2] &= 65535;
               var10000 = a.c[var6];
               var10000[2] |= (short)var14 << 16 & -65536;
               a.c[var6][1] = -1;
               var10000 = a.c[var6];
               var10000[3] |= 256;
               if (var4) {
                  a.a(l[var14], (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
               }
            }
         }
         break;
      case 3:
         if (!var3) {
            var14 = a(y);
            var6 = e(a[var0][var1][3]);
            if (var14 >= 0 && var6 >= 0) {
               System.arraycopy(a[var0][var1], 0, y[var14], 0, a[var0][var1].length);
               a.c[var6] = y[var14];
               var10000 = a.c[var6];
               var10000[2] &= -65536;
               var10000 = a.c[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = a.c[var6];
               var10000[2] &= 65535;
               var10000 = a.c[var6];
               var10000[2] |= (short)var14 << 16 & -65536;
               a.c[var6][1] = -1;
               var10000 = a.c[var6];
               var10000[3] |= 8192;
               if (var4) {
                  a.a(y[var14], (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
               }
            }

            if ((short)(O[43] & '\uffff') == var1) {
               a(var0, (short)(O[43] & '\uffff'), false);
               var10000 = O;
               var10000[43] &= -65536;
               var10000 = O;
               var10000[43] |= 65535;
            } else if ((short)((O[43] & -65536) >> 16) == var1) {
               a(var0, (short)((O[43] & -65536) >> 16), false);
               var10000 = O;
               var10000[43] &= 65535;
               var10000 = O;
               var10000[43] |= -65536;
            } else if (O[44] == var1) {
               a(var0, O[44], false);
               O[44] = -1;
            }
         }
      }

      if (var7 <= 0) {
         int var8 = (short)var0 & '\uffff' | (short)var1 << 16 & -65536;

         for(int var9 = 0; var9 < 8; ++var9) {
            if (var8 == O[31 + var9]) {
               var10000 = O;
               var10000[39] &= ~(1 << var9);
               var10000 = O;
               var10000[31 + var9] &= 65535;
               var10000 = O;
               var10000[31 + var9] |= (short)a[var0][var1][4] << 16 & -65536;
            }
         }

         a[var0][var1][4] = -1;
      }

      if (var4) {
         short var15 = (short)(O[0] & '\uffff');
         short var16 = (short)((O[0] & -65536) >> 16);
         int var10 = a.a[var16][var15];

         boolean var11;
         for(var11 = false; var10 != -1; var10 = (short)(a.c[var10][1] & '\uffff')) {
            int var12 = a.c[var10][3];
            boolean var13 = false;
            if ((var12 & 10176) > 0 && var10 != var6) {
               var10000 = a.c[var10];
               var10000[3] |= 524288;
               var11 = true;
               break;
            }
         }

         if (var11) {
            var10000 = a.c[var6];
            var10000[3] |= 524288;
            var10000 = a.c[var6];
            var10000[3] |= 1048576;
         }

         c((short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
      }

      return var6;
   }

   public static final void d(int[] var0) {
      int[] var1;
      a((var1 = r[var0[4]])[6], var1[3], true, false, O);
      HG.m(33);
   }

   public static final void a(int var0, int var1, boolean var2) {
      if (var0 != -1) {
         if (var1 != -1) {
            if (a[var0][var1][4] != -1) {
               c(a[var0][var1], var2);
            }
         }
      }
   }

   public static final void c(int[] var0, boolean var1) {
      int[] var2 = a(var0);
      if ((var0[3] & 128) != 0) {
         int[] var10000;
         if (var1) {
            var10000 = O;
            var10000[27] += var2[11];
            var10000 = O;
            var10000[28] += var2[12];
            var10000 = O;
            var10000[29] += var2[13];
         } else {
            var10000 = O;
            var10000[27] -= var2[11];
            var10000 = O;
            var10000[28] -= var2[12];
            var10000 = O;
            var10000[29] -= var2[13];
         }
      }

      int var3;
      for(var3 = 0; var3 < j.length; ++var3) {
         j[var3] = -1;
      }

      if ((var0[3] & 64) != 0 || (var0[3] & 128) != 0 || (var0[3] & 8192) != 0) {
         for(var3 = 0; var3 < 2; ++var3) {
            if (var0[6 + var3] != -1) {
               int var4 = g[(short)((var0[6 + var3] & -65536) >> 16)][3];
               j[var3] = (short)var4 & '\uffff' | (short)(var0[6 + var3] & '\uffff') << 16 & -65536;
            }
         }

         for(var3 = 0; var3 < 5; ++var3) {
            if (var2[5 + var3] != -1) {
               j[2 + var3] = var2[5 + var3];
            }
         }
      }

      for(var3 = 0; var3 < j.length; ++var3) {
         if (j[var3] != -1) {
            short var6 = (short)(j[var3] & '\uffff');
            int var5 = (short)((j[var3] & -65536) >> 16);
            if (!var1) {
               var5 *= -1;
            }

            a(var6, var5, true, true, O);
         }
      }

   }

   public static final int a(int var0, boolean var1) {
      switch(var0) {
      case 0:
         return (short)(O[12] & '\uffff');
      case 1:
         return (short)(O[13] & '\uffff');
      case 2:
         if (var1) {
            return (short)(O[54] & '\uffff');
         }

         return (short)(O[54] & '\uffff');
      case 3:
         if (var1) {
            return (short)((O[54] & -65536) >> 16);
         }

         return (short)((O[54] & -65536) >> 16);
      case 4:
         if (var1) {
            return (short)((O[14] & -65536) >> 16);
         }

         return (short)(O[14] & '\uffff');
      case 5:
         if (var1) {
            return (short)((O[15] & -65536) >> 16);
         }

         return (short)(O[15] & '\uffff');
      case 6:
         return O[47];
      case 7:
         return O[49];
      case 8:
         return O[50];
      case 9:
         return (short)(O[26] & '\uffff');
      case 10:
         return O[27];
      case 11:
         return O[28];
      case 12:
         if (var1) {
            return (short)((O[20] & -65536) >> 16);
         }

         return (short)(O[20] & '\uffff');
      case 13:
         if (var1) {
            return (short)((O[21] & -65536) >> 16);
         }

         return (short)(O[21] & '\uffff');
      case 14:
         if (var1) {
            return (short)((O[22] & -65536) >> 16);
         }

         return (short)(O[22] & '\uffff');
      case 15:
         if (var1) {
            return (short)((O[23] & -65536) >> 16);
         }

         return (short)(O[23] & '\uffff');
      case 16:
         return O[51];
      case 17:
         if (var1) {
            return (short)((O[25] & -65536) >> 16);
         }

         return (short)(O[25] & '\uffff');
      case 18:
         return (short)(O[24] & '\uffff');
      case 19:
         return O[29];
      case 20:
      default:
         return 0;
      case 21:
         return O[46];
      case 22:
         return O[16];
      case 23:
         return O[48];
      case 24:
         return O[19];
      case 25:
         return O[17];
      }
   }

   public static final void a(int var0, int var1, boolean var2, boolean var3, int[] var4) {
      byte var5 = -1;
      byte var6 = -1;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = true;
      boolean var10 = false;
      boolean var11 = false;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      if ((var4[3] & 32) != 0) {
         switch(var0) {
         case 0:
            var5 = 12;
            var10 = true;
            var6 = 12;
            var7 = true;
         }
      }

      if ((var4[3] & 16) != 0) {
         switch(var0) {
         case 0:
            if (v) {
               return;
            }

            var5 = 12;
            var10 = true;
            var6 = 12;
            var7 = true;
            break;
         case 1:
            var5 = 13;
            var10 = true;
            var6 = 13;
            var7 = true;
            break;
         case 2:
            var5 = 12;
            if (!var3) {
               var6 = 54;
               var7 = false;
               var9 = false;
               var10 = true;
               var11 = true;
               var12 = true;
            } else {
               var6 = 12;
               var7 = true;
               var10 = true;
               var12 = true;
               var13 = true;
            }
            break;
         case 3:
            var5 = 13;
            if (!var3) {
               var6 = 54;
               var7 = true;
               var9 = false;
               var10 = true;
               var11 = true;
               var12 = true;
            } else {
               var6 = 13;
               var7 = true;
               var10 = true;
               var12 = true;
               var13 = true;
            }
            break;
         case 4:
            var5 = 14;
            var14 = true;
            break;
         case 5:
            var5 = 15;
            var14 = true;
            break;
         case 6:
            var5 = 47;
            break;
         case 7:
            var5 = 49;
            break;
         case 8:
            var5 = 50;
            break;
         case 9:
            var5 = 26;
            var14 = true;
            break;
         case 10:
            var5 = 27;
            break;
         case 11:
            var5 = 28;
            break;
         case 12:
            var5 = 20;
            var14 = true;
            break;
         case 13:
            var5 = 21;
            var14 = true;
            break;
         case 14:
            var5 = 22;
            var14 = true;
            break;
         case 15:
            var5 = 23;
            var14 = true;
            break;
         case 16:
            var5 = 51;
            break;
         case 17:
            var5 = 25;
            var14 = true;
            break;
         case 18:
            var5 = 24;
            var14 = true;
            break;
         case 19:
            var5 = 29;
            break;
         case 20:
            var5 = 25;
            var14 = true;
            break;
         case 21:
            var5 = 46;
            break;
         case 22:
            var5 = 16;
            break;
         case 23:
            var5 = 48;
            break;
         case 24:
            var5 = 19;
            break;
         case 25:
            var5 = 17;
         }
      }

      if (var14) {
         if (var3) {
            var10 = true;
            var11 = false;
         } else {
            var10 = true;
            var11 = true;
         }
      }

      if (var5 >= 0) {
         int var15 = -1;
         if (var6 != -1) {
            if (!var7) {
               var15 = (short)(var4[var6] & '\uffff');
            } else {
               var15 = (short)((var4[var6] & -65536) >> 16);
            }

            if (var12) {
               if (var2) {
                  var15 += var1;
               } else {
                  var15 = var1;
               }

               if (!var7) {
                  var4[var6] &= -65536;
                  var4[var6] |= (short)var15 & '\uffff';
               } else {
                  var4[var6] &= 65535;
                  var4[var6] |= (short)var15 << 16 & -65536;
               }
            }
         }

         int var16;
         if (var2) {
            if (var10) {
               if ((var16 = (short)(var4[var5] & '\uffff') + var1) > var15 && var15 >= 0 && var9) {
                  var16 = var15;
               }

               if (var16 <= 0 && var13) {
                  var16 = 1;
               }

               var4[var5] &= -65536;
               var4[var5] |= (short)var16 & '\uffff';
            }

            if (var11) {
               if ((var16 = (short)((var4[var5] & -65536) >> 16) + var1) > var15 && var15 >= 0 && var9) {
                  var16 = var15;
               }

               if (var16 <= 0 && var13) {
                  var16 = 1;
               }

               var4[var5] &= 65535;
               var4[var5] |= (short)var16 << 16 & -65536;
            }

            if (!var11 && !var10) {
               if ((var16 = var4[var5] + var1) > var15 && var15 >= 0 && var9) {
                  var16 = var15;
               }

               if (var16 <= 0 && var13) {
                  var16 = 1;
               }

               var4[var5] = var16;
               return;
            }
         } else {
            var16 = var1;
            if (var1 > var15 && var15 >= 0 && var9) {
               var16 = var15;
            }

            if (var16 <= 0 && var13) {
               var16 = 1;
            }

            if (var10) {
               var4[var5] &= -65536;
               var4[var5] |= (short)var16 & '\uffff';
            }

            if (var11) {
               var4[var5] &= 65535;
               var4[var5] |= (short)var16 << 16 & -65536;
            }

            if (!var11 && !var10) {
               var4[var5] = var16;
            }
         }

      }
   }

   public static final void a(Graphics var0, boolean var1, boolean var2, boolean var3, int var4) {
      var0.setClip(0, 0, aA, l);
      boolean var5 = false;
      int var6 = l;
      var0.setColor(m[3]);
      var0.fillRect(0, 0, aA, l);
      a(0, var6, 146, 0, var0);
      a(aA, var6, 146, 0, 0, 2, var0);
      var6 -= b[1607];
      a(0, var6, 138, 0, var0);
      int var16;
      a(var16 = 0 + b[1518], var6, var4, 0, var0);
      if (var4 == 126) {
         n(var0);
      }

      var16 += b[1386];
      var6 -= b[1387];
      var0.setColor(m[8]);
      var0.fillRect(var16, var6, aA - var16, l - var6);
      var0.setColor(m[5]);
      var0.drawLine(var16, var6, aA, var6);
      var0.setColor(m[6]);
      var0.drawLine(var16, var6 + 1, aA - 1, var6 + 1);
      var0.drawLine(aA - 1, var6 + 1, aA - 1, l - 1);
      var0.setColor(m[7]);
      var0.drawLine(var16, l - 1, aA - 2, l - 1);
      var0.drawLine(aA - 2, var6 + 2, aA - 2, l - 1);
      if (var3) {
         var16 = aA;
         var6 = l;
         a(var16, var6, 146, 0, 0, 2, var0);
      }

      var6 = l - (b[1607] + b[1387]);
      var0.setColor(m[5]);
      var0.drawRect(0, 0, aA - 2, var6 - 2);
      var0.setColor(m[6]);
      var0.drawRect(1, 1, aA - 2, var6 - 2);
      int var7 = b[1617] / b[1622];
      int var8 = b[1618] / b[1623];
      a(0, 0, 147, 0, var0);
      a(aA - var7, 0, 147, 1, var0);
      a(0, var6 - var8, 147, 2, var0);
      a(aA - var7, var6 - var8, 147, 3, var0);
      var16 = var7 >> 1;
      if (var1) {
         var6 = a(false);
      } else {
         var6 = var8;
      }

      var7 = aA - 2 * var16;
      var8 = l - (b[1607] + b[1387] + var8 + var6);
      if (!var2) {
         var8 -= 4;
      }

      var0.setColor(m[8]);
      var0.fillRect(var16, var6, var7, var8);
      if (var2) {
         var0.setColor(m[3]);
         var0.fillRect(HG.F, HG.A, HG.n - 1, HG.f);
      }

      var0.setColor(m[6]);
      var0.drawRect(var16, var6, var7, var8);
      var0.drawRect(var16 + 1, var6 + 1, var7 - 1, var8 - 1);
      var0.setColor(m[5]);
      var0.drawRect(var16, var6, var7 - 1, var8 - 1);
      if (var2) {
         var0.drawRect(HG.F, HG.A, HG.n - 1, HG.f);
      }

      Font var9 = a[2];
      int var10 = a[2].getHeight();
      int var11;
      short var12;
      int var13;
      int var14;
      if (var1) {
         var0.setFont(var9);
         var11 = var9.stringWidth("" + O[46]);
         var16 = (aA - var11 >> 1) - 4 - b[1628];
         var12 = b[1629];
         var13 = 4;
         var14 = 3;
         if (var12 > var10) {
            var14 = 3 + (var12 - var10 >> 1);
         } else {
            var13 = 4 + (var10 - var12 >> 1);
         }

         a(var16, var13, 148, 0, var0);
         var0.drawString("" + O[46], var16 + b[1628] + 4 + 0, var14 + 0, 20);
      }

      var11 = b[1639] / b[1644];
      var12 = b[1640];
      var13 = (HG.A - var6 - var11 >> 1) + 1;
      int var17;
      if (var2) {
         if ((var14 = HG.l - HG.A) < 0) {
            a((aA >> 1) - var11, HG.A + HG.f + 2, 149, 0, var0);
         }

         if (var14 > HG.f - HG.q) {
            a(aA >> 1, HG.A + HG.f + 2, 149, 1, var0);
         }

         if (HG.d) {
            a(HG.F, var6 + var13, 160, 1, var0);
            a(HG.F + HG.n - var12, var6 + var13, 160, 0, var0);
         }

         boolean var15 = false;
         if (HG.d) {
            var17 = HG.F + var11 + 2;
         } else {
            var17 = HG.F + 2;
         }

         c(2, var17, var6 + 1, aA - 2 * var17, var10 + 6, 540);
         a((String)HG.d, 2, 2, var0);
      }

      if (var4 == 126 && HG.l && !q && (HG.c == 19 || HG.c == 20)) {
         var0.setClip(0, 0, aA, l);
         var0.setColor(m[5]);
         var14 = aA - c[138][3] - c[126][3] + 2 + 30;
         var17 = l - c[146][4] - c[139][4] + 2;
         var0.drawRect(var14 - 2, var17 - 1, 7, 34);
         a((Graphics)var0, 30);
      }

   }

   public static final int a(boolean var0) {
      int var1 = b[1629];
      Object var2 = null;
      int var3;
      if ((var3 = a[2].getHeight()) > var1) {
         var1 = var3;
      }

      if (var0) {
         var1 += var3 + 6;
      }

      return var1 + 6;
   }

   public final void s() {
      short var1 = (short)(O[53] & '\uffff');
      short var2 = (short)((O[53] & -65536) >> 16);
      boolean var3 = false;
      boolean var4 = false;

      int[] var10000;
      for(int var5 = 0; var5 < 15; ++var5) {
         if (a[2][var5][4] >= 0) {
            int[] var6 = a(a[2][var5]);
            int var7 = 0;
            if (var6[6] == 26) {
               if ((var7 = a[2][var5][6] - var1) < 0) {
                  int var9 = var1 + var7;
                  var10000 = O;
                  var10000[53] &= -65536;
                  var10000 = O;
                  var10000[53] |= (short)var9 & '\uffff';
               }

               var1 = 0;
               var4 = true;
            } else if (var6[6] == 27) {
               if ((var7 = a[2][var5][6] - var2) < 0) {
                  int var10 = var2 + var7;
                  var10000 = O;
                  var10000[53] &= 65535;
                  var10000 = O;
                  var10000[53] |= (short)var10 << 16 & -65536;
               }

               var2 = 0;
               var3 = true;
            }

            if (var7 > 0) {
               a((short)a[2][var5][4] & '\uffff' | 131072, var7);
            }
         }
      }

      if (!var3) {
         var10000 = O;
         var10000[53] &= 65535;
         var10000 = O;
         var10000[53] |= 0;
      }

      if (!var4) {
         var10000 = O;
         var10000[53] &= -65536;
         var10000 = O;
         var10000[53] |= 0;
      }

   }

   public static final void k() {
      int var0;
      for(var0 = 0; var0 < O.length; ++var0) {
         O[var0] = -1;
      }

      O[4] = 2048;
      O[5] = 2048;
      O[12] = 3276850;
      O[13] = 1310740;
      O[16] = 1024;
      O[30] = 2;
      O[14] = 1310740;
      O[15] = 983055;
      O[27] = 0;
      O[28] = 0;
      O[27] = 0;
      O[17] = 0;
      O[19] = 0;
      O[20] = 327685;
      O[21] = 327685;
      O[22] = 327685;
      O[23] = 327685;
      O[24] = 0;
      O[25] = 327685;
      O[26] = 327685;
      O[46] = 50;
      O[40] = 0;
      O[47] = 0;
      O[48] = 0;
      O[49] = 0;
      O[50] = 0;
      O[51] = 0;
      O[53] = 0;
      O[54] = 1310770;
      O[41] = -1;
      O[42] = -1;
      O[43] = -1;
      O[44] = -1;
      O[45] = -1;
      O[18] = 1;
      O[11] = 13;
      O[39] = 0;

      for(var0 = 0; var0 < a.length; ++var0) {
         for(int var1 = 0; var1 < a[var0].length; ++var1) {
            for(int var2 = 0; var2 < a[var0][var1].length; ++var2) {
               a[var0][var1][var2] = -1;
            }
         }
      }

   }

   public static final int f(int var0) {
      return var0 >= 30 ? -1 : var0 * var0 * 60;
   }

   public static final boolean k(int var0) {
      if (O[46] + var0 < 0) {
         return false;
      } else {
         int[] var10000 = O;
         var10000[46] += var0;
         return true;
      }
   }

   public static final int[] a() {
      int var0;
      return (var0 = O[42]) != -1 && a[0][var0][4] != -1 ? a[0][var0] : null;
   }

   public static final void f(int var0, int var1) {
      O[4] = (var0 << 12) + 2048;
      O[5] = (var1 << 12) + 2048;
      if (a.d >= 0) {
         O[30] = a.d;
         a.d = -1;
      }

      ac = -1;
      C = -1;
      d = -1;
      m = true;
      d(O, 0);
      e(O, 0);
      i(O, 0);

      int var2;
      for(var2 = 0; var2 < h(O); ++var2) {
         b(O, var2, 0);
      }

      for(var2 = 0; var2 < j(O); ++var2) {
         d(O, var2, 0);
      }

      for(var2 = 0; var2 < a(O); ++var2) {
         a(O, var2, 0);
      }

      f(O, 0);
      a.a(O, var0, var1);
   }

   public static final void T() {
      boolean var0 = false;
      int var1 = 0;
      int var2 = l(a());
      int var3 = O[42];
      byte var6;
      switch(var2) {
      case 0:
         var6 = a[0][1];
         var1 = a(a[0][var3])[16];
         break;
      case 1:
         var1 = a(a[0][var3])[16];
         int var4 = q(O);
         int var5 = 0;
         if (a[0][2] < a[var4].length) {
            var5 = a[var4][a[0][2]].length;
         }

         if (var1 > var5) {
            var6 = a[0][1];
         } else {
            var6 = a[0][2];
         }
         break;
      case 2:
         var6 = a[0][3];
         var1 = a(a[0][var3])[16];
         break;
      case 3:
         var6 = a[0][4];
         var1 = a(a[0][var3])[16];
         break;
      case 4:
         var6 = a[0][5];
         break;
      case 5:
      default:
         var6 = a[0][0];
      }

      if (O[45] != -1) {
         var6 = a[0][5];
         var1 = 0;
      }

      if (var6 < 0 || var6 >= c(O)) {
         var6 = 0;
      }

      if (var1 < 0 || var1 >= d(O)) {
         var1 = 0;
      }

      if (e(O) != var6) {
         e(O, var6);
      }

      if (s(O) != var1) {
         i(O, var1);
      }

   }

   public static final boolean a() {
      return O[45] == -1 || a[4][O[45]][4] == -1 || u[a[4][O[45]][4]][6] != 0;
   }

   public static final int b() {
      int var0 = -1;
      int var1 = -1;

      for(int var2 = 0; var2 < q.length; ++var2) {
         if (b(var2) && p(var2)) {
            int var3 = (q[var2][4] - O[4]) * a.g >> 12;
            int var4 = (q[var2][5] - O[5]) * a.g >> 12;
            int var5;
            if ((var5 = var3 * var3 + var4 * var4) < var1 || var1 == -1) {
               var1 = var5;
               var0 = var2;
            }
         }
      }

      return var0;
   }

   public static final void N() {
      boolean var2 = false;
      boolean var3 = false;
      if (q.length == 0) {
         ac = -1;
      } else {
         int var0;
         if (ac == -1) {
            var0 = 0;
         } else {
            var0 = ac + 1;
         }

         ac = -1;

         for(int var1 = 0; var1 < q.length; ++var1) {
            if (var0 == q.length) {
               m = true;
               return;
            }

            if (b(var0)) {
               ac = var0;
               m = false;
               return;
            }

            ++var0;
         }

      }
   }

   public static final boolean b(int var0) {
      if (var0 >= 0 && var0 < q.length) {
         if (q[var0][11] == -1) {
            return false;
         } else if ((q[var0][13] & 2) == 0 && (q[var0][3] & 65536) == 0 && !j(var0)) {
            int var1 = (q[var0][4] * a.g >> 12) - q;
            int var2 = (q[var0][5] * a.g >> 12) - c;
            return var1 >= 0 && var1 <= aA && var2 >= 0 && var2 <= l;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static final boolean p(int var0) {
      boolean var1 = false;
      if (var0 >= 0 && var0 <= q.length) {
         int var2 = k(a());
         int[] var3;
         if (O[45] != -1 && a[4][O[45]][4] != -1 && (var3 = u[a[4][O[45]][4]])[6] > 0) {
            var2 = var3[7] * 4096 / 10;
         }

         if (a.a(O, q[var0], var2) && a.b(O, q[var0])) {
            var1 = true;
         } else {
            var1 = false;
         }

         return var1;
      } else {
         return false;
      }
   }

   public static final boolean c(int var0, int[] var1) {
      int[][] var2 = a[var0];
      var1[3] &= -1048577;
      if (var0 == 2 && var1[4] == 0) {
         k(var1[6]);
         if ((var1[3] & 2) != 0) {
            a.b(var1);
         }

         if (!a(3, var0, (short)((var1[2] & -65536) >> 16), 0, 0, false)) {
            a(11, var0, var1[4], 0, 0, false);
         }

         var1[4] = -1;
         HG.m(10);
         return true;
      } else {
         int[] var10000;
         int var3;
         int var4;
         if (var0 == 2) {
            for(var3 = 0; var3 < var2.length; ++var3) {
               if (var2[var3][4] == var1[4]) {
                  if (var1[6] > 0) {
                     var2[var3][6] += var1[6];
                  } else {
                     int var10002 = var2[var3][6]++;
                  }

                  if ((var1[3] & 2) != 0) {
                     a.b(var1);
                  }

                  if (!a(3, var0, (short)((var1[2] & -65536) >> 16), 0, 0, false)) {
                     a(11, var0, var1[4], 0, 0, false);
                  }

                  if (var1[4] == 1) {
                     var4 = (short)(O[53] & '\uffff') + var1[6];
                     var10000 = O;
                     var10000[53] &= -65536;
                     var10000 = O;
                     var10000[53] |= (short)var4 & '\uffff';
                  } else if (var1[4] == 2) {
                     var4 = (short)((O[53] & -65536) >> 16) + var1[6];
                     var10000 = O;
                     var10000[53] &= 65535;
                     var10000 = O;
                     var10000[53] |= (short)var4 << 16 & -65536;
                  }

                  var1[4] = -1;
                  HG.m(10);
                  return true;
               }
            }
         }

         for(var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3][4] == -1) {
               if ((var1[3] & 2) != 0) {
                  a.b(var1);
               }

               for(var4 = 0; var4 < var2[var3].length; ++var4) {
                  var2[var3][var4] = var1[var4];
               }

               var2[var3][2] = -1;
               var2[var3][1] = -1;
               var2[var3][0] = -1;
               if (!a(3, var0, (short)((var1[2] & -65536) >> 16), 0, 0, false)) {
                  a(11, var0, var1[4], 0, 0, false);
               }

               if (var0 == 2) {
                  if (var1[4] == 1) {
                     var4 = (short)(O[53] & '\uffff') + var1[6];
                     var10000 = O;
                     var10000[53] &= -65536;
                     var10000 = O;
                     var10000[53] |= (short)var4 & '\uffff';
                  } else if (var1[4] == 2) {
                     var4 = (short)((O[53] & -65536) >> 16) + var1[6];
                     var10000 = O;
                     var10000[53] &= 65535;
                     var10000 = O;
                     var10000[53] |= (short)var4 << 16 & -65536;
                  }
               }

               for(var4 = 0; var4 < 8; ++var4) {
                  short var5 = (short)(O[31 + var4] & '\uffff');
                  short var6 = (short)((O[31 + var4] & -65536) >> 16);
                  if ((O[39] & 1 << var4) == 0 && var5 == var0 && var6 == var1[4]) {
                     var10000 = O;
                     var10000[31 + var4] &= 65535;
                     var10000 = O;
                     var10000[31 + var4] |= (short)var3 << 16 & -65536;
                     var10000 = O;
                     var10000[39] |= 1 << var4;
                  }
               }

               var1[4] = -1;
               HG.m(10);
               return true;
            }
         }

         return false;
      }
   }

   public static final boolean e() {
      if (O[11] != 0) {
         return false;
      } else if ((short)(a.A & '\uffff') == 1 && (short)((a.A & -65536) >> 16) == 2) {
         if (HG.e(10) != 0) {
            return false;
         } else {
            short var0 = (short)(O[0] & '\uffff');
            short var1 = (short)((O[0] & -65536) >> 16);
            int var2 = (short)((a.b[var1][var0] & -65536) >> 16) & 255;

            int var6;
            for(int var3 = -2; var3 <= 2; ++var3) {
               for(int var4 = -2; var4 <= 2; ++var4) {
                  if (var0 + var3 >= 0 && var0 + var3 < a.m && var1 + var4 >= 0 && var1 + var4 < a.u) {
                     int var5 = (short)((a.b[var1 + var4][var0 + var3] & -65536) >> 16) & 255;

                     for(var6 = 0; var6 < a.length; ++var6) {
                        if (var5 == a[var6]) {
                           return false;
                        }
                     }
                  }
               }
            }

            byte var9 = 0;
            byte var10 = 0;
            byte var11 = 4;

            for(var6 = 0; var6 < F.length; ++var6) {
               if (var2 == F[var6]) {
                  var9 = 1;
               }
            }

            if (HG.e(2) == 0) {
               for(var6 = 0; var6 < r.length; ++var6) {
                  if (var2 == r[var6]) {
                     var9 = 2;
                  }
               }
            }

            for(var6 = 0; var6 < i.length; ++var6) {
               if (var2 == i[var6]) {
                  var10 = 2;
               }
            }

            for(var6 = 0; var6 < Q.length; ++var6) {
               if (var2 == Q[var6]) {
                  var10 = 1;
               }
            }

            for(var6 = 0; var6 < z.length; ++var6) {
               if (var2 == z[var6]) {
                  var10 = 1;
               }
            }

            switch(O[30]) {
            case 0:
               var11 = 2;
               break;
            case 1:
               var11 = 3;
               break;
            case 2:
               var11 = 0;
               break;
            case 3:
               var11 = 1;
            }

            a.j();
            String var12 = HG.a((int)432);

            for(int var7 = 0; var7 < a.b; ++var7) {
               String var8 = "";
               switch(a.j[var7]) {
               case 0:
                  var8 = HG.a((int)175);
                  break;
               case 1:
                  var8 = HG.a((int)176);
                  break;
               case 2:
                  var8 = HG.a((int)177);
                  break;
               case 3:
                  var8 = HG.a((int)178);
                  break;
               case 4:
                  var8 = HG.a((int)180);
                  break;
               case 5:
                  var8 = HG.a((int)179);
               }

               var12 = var12 + " " + var8 + " ";
               if (var7 + 1 < a.b) {
                  var12 = var12 + HG.a((int)433);
               }
            }

            var12 = var12 + HG.a((int)434);
            c(var9, var10, var11);
            a(var12, HG.a((int)314), 102, 101);
            return true;
         }
      } else {
         return false;
      }
   }

   public static final void W() {
      boolean var0 = false;
      boolean var1 = false;
      if (O[11] == 0) {
         f = false;
      }

      int var2;
      int[] var10000;
      if ((short)(O[12] & '\uffff') <= 0) {
         f(O, 16);
         if ((O[3] & 8388608) == 0) {
            a(17, 0, 0, 0, 0, true);
            HG.m(30);
            if (HG.b(3)) {
               Display.getDisplay(a).vibrate(1000);
            }

            var10000 = O;
            var10000[3] |= 8388608;
            var10000 = O;
            var10000[3] |= 32768;
            b(O, true);
            ac = -1;
            ag = -1;
            b = -1;
            T = -1;
            h = false;
            r = false;
            s = false;

            for(var2 = 0; var2 < v.length; ++var2) {
               if ((byte)(v[var2][6] >> 16 & 255) == 0) {
                  v[var2][6] = -1;
               }
            }

            for(var2 = 0; var2 < k.length; ++var2) {
               k[var2][0] = 0;
            }

            if (HG.l) {
               HG.q(11);
            }

            d(ac);
         }

         if (a(O, false) && f) {
            if (!o(2) && !o(3)) {
               b(390, 382, 1, 34);
            } else {
               byte var14 = 30;
               short var15 = 312;
               if (d >= 0L && a >= 0L) {
                  if (d > a) {
                     var14 = 39;
                     var15 = 313;
                  }
               } else if (d >= 0L) {
                  var14 = 39;
                  var15 = 313;
               }

               b(var15, 382, var14, 34);
            }
         }

         d = false;
         u = false;
         l = false;
         b = false;
         f = false;
         c = false;
      } else {
         if (y % 20 == 0 && !s) {
            if ((var2 = (short)((O[13] & -65536) >> 16) * 3 / 100) == 0) {
               var2 = 1;
            }

            a(1, var2, true, false, O);
         }

         if ((var2 = f(O[18])) >= 0 && var2 <= O[17]) {
            int var10002 = O[18]++;
            HG.m(7);
            g(O[4], O[5], (short)(O[2] & '\uffff'));
            a(24, 10, true, false, O);
            a(2, 10, true, false, O);
         }

         if (p(O) == 8 || p(O) == 9 || p(O) == 10 || p(O) == 11) {
            if (!a(O, true)) {
               var1 = true;
            } else if (O[45] == -1) {
               int[] var3 = a();
               if (C != -1 && i) {
                  d = a(O, q[C], var3);
               } else {
                  d = 10;
               }

               C = -1;
               i = false;
               d(ac);
            }
         }

         int var4;
         int var13;
         if (!var1 && !s) {
            boolean var12 = false;
            if (!d && !u || !l && !b) {
               var13 = O[52];
            } else {
               var13 = g(O[52] * O[52] >> 1);
            }

            var4 = O[4];
            int var5 = O[5];
            boolean var6 = false;
            if (d) {
               var5 -= var13;
               O[30] = 0;
               var0 = true;
            }

            if (u) {
               var5 += var13;
               O[30] = 2;
               var0 = true;
            }

            if (l) {
               var4 -= var13;
               O[30] = 3;
               var0 = true;
            }

            if (b) {
               var4 += var13;
               O[30] = 1;
               var0 = true;
            }

            if (var0) {
               --ay;
               if (ay <= 0) {
                  ay = 4;
               }

               int var7 = O[0];
               if (a.a(O, var4, var5, 4128) == -2) {
                  var10000 = O;
                  var10000[52] += O[16] >> 3;
                  if (O[52] > O[16]) {
                     O[52] = O[16];
                  }
               } else {
                  O[52] = O[16] >> 1;
               }

               if (O[0] != var7) {
                  boolean var9 = a(8, (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16), (short)(var7 & '\uffff'), (short)((var7 & -65536) >> 16), false);
                  boolean var10 = a(13, (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16), (short)(var7 & '\uffff'), (short)((var7 & -65536) >> 16), false);
                  boolean var11;
                  if (!(var11 = O[11] == 0 && a(18, (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16), 0, 0, false))) {
                     P = -1;
                  }

                  if (!var9 && !var10 && !var11 && e()) {
                     return;
                  }
               }
            } else {
               O[52] = O[16] >> 1;
            }
         }

         if (a()) {
            if (c) {
               N();
               d(ac);
            }

            if (!b(ac)) {
               ac = -1;
               d(ac);
            }

            g = p(ac);
            if ((ac == -1 && !m || !g && f) && (var13 = b()) != -1) {
               if (f) {
                  m = false;
               }

               ac = var13;
               d(ac);
               g = true;
            }

            if ((var13 = l(a())) == 3 && (short)((O[53] & -65536) >> 16) <= 0) {
               g = false;
            } else if (var13 == 2 && (short)(O[53] & '\uffff') <= 0) {
               g = false;
            }
         } else {
            ac = -1;
            g = false;
            d(ac);
         }

         --d;
         if (O[45] == -1) {
            s = false;
         }

         if (f && d < 0) {
            if (O[45] >= 0) {
               j(O[45]);
               f(O, 12 + O[30]);
            } else if (ac != -1) {
               if (g) {
                  var13 = q[ac][4] - O[4];
                  var4 = q[ac][5] - O[5];
                  O[30] = b(var13, var4);
                  f(O, 8 + O[30]);
                  C = ac;
                  i = g;
                  d = Integer.MAX_VALUE;
               }
            } else {
               f(O, 8 + O[30]);
               C = -1;
               i = false;
               d = Integer.MAX_VALUE;
            }

            var1 = true;
         }

         if (!var1) {
            if (!s) {
               if (var0) {
                  f(O, 4 + O[30]);
               } else {
                  f(O, 0 + O[30]);
               }
            }

            a(O, true);
         }

         T();
         c((short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
         d = false;
         u = false;
         l = false;
         b = false;
         f = false;
         c = false;
      }
   }

   public static final void aa() {
      q = (O[4] * a.g >> 12) - (aA >> 1);
      c = (O[5] * a.g >> 12) - (l >> 1);
      j();
   }

   public static final void j() {
      boolean var0 = true;
      if (ac != -1) {
         int var1 = O[4] - q[ac][4];
         int var2 = O[5] - q[ac][5];
         if (a(var1) * 4 / 3 < (aA << 12) / a.g && a(var2) * 4 / 3 < (l << 12) / a.g) {
            var0 = false;
            int var3 = O[4] + q[ac][4] >> 1;
            int var4 = O[5] + q[ac][5] >> 1;
            E = (var3 * a.g >> 12) - (aA >> 1);
            f = (var4 * a.g >> 12) - (l >> 1);
         }
      }

      if (var0) {
         E = (O[4] * a.g >> 12) - (aA >> 1);
         f = (O[5] * a.g >> 12) - (l >> 1);
         switch(O[30]) {
         case 0:
            f -= 1 * a.l;
            break;
         case 1:
            E += 1 * a.g;
            break;
         case 2:
            f += 1 * a.l;
            break;
         case 3:
            E -= 1 * a.g;
         }
      }

      q = q * 100 + E * 28 >> 7;
      c = c * 100 + f * 28 >> 7;
      if (O[11] != 0) {
         if (q < -(0 * a.l)) {
            q = -(0 * a.l);
         }

         if (c < -(3 * a.l)) {
            c = -(3 * a.l);
         }

         if (q > (a.m + 0) * a.g - aA) {
            q = (a.m + 0) * a.g - aA;
         }

         if (c > (a.u + 3) * a.l - l) {
            c = (a.u + 3) * a.l - l;
         }

         if ((a.m + 0) * a.g < aA) {
            q = (a.m * a.g >> 1) - (aA >> 1);
         }

         if ((a.u + 6) * a.l < l) {
            c = (a.u * a.l >> 1) - (l >> 1);
            return;
         }
      } else {
         if (q < -(0 * a.l)) {
            q = -(0 * a.l);
         }

         if (c < -(0 * a.l) - u) {
            c = -(0 * a.l) - u;
         }

         if (q > (a.m + 0) * a.g - aA) {
            q = (a.m + 0) * a.g - aA;
         }

         if (c > (a.u + 5) * a.l - l) {
            c = (a.u + 5) * a.l - l;
         }

         if ((a.m + 0) * a.g < aA) {
            q = (a.m * a.g >> 1) - (aA >> 1);
         }

         if ((a.u + 5) * a.l < l) {
            c = (a.u * a.l >> 1) - (l >> 1);
         }
      }

   }

   public static final void u() {
      for(int var0 = 0; var0 < q.length; ++var0) {
         int[] var1 = q[var0];
         int[] var2 = a[var1[11]];
         int var3 = q[var0][13];
         if ((q[var0][3] & 65536) == 0 && !c(var0)) {
            boolean var4 = j(var0);
            boolean var5 = (var3 & 128) != 0;
            boolean var6 = (var3 & 8) != 0;
            boolean var7 = (short)(q[var0][20] & '\uffff') >= 0;
            boolean var8 = q[var0][22] >= 0 || (var3 & 64) != 0;
            boolean var9 = false;
            boolean var10 = ((var2[13] & 1) != 0 || (var2[13] & 2) != 0 || (var2[13] & 4) != 0) && var2[27] == 0;
            boolean var11 = (short)((q[var0][12] & -65536) >> 16) > 0 && (short)(q[var0][12] & '\uffff') * 100 / (short)((q[var0][12] & -65536) >> 16) < 50;
            boolean var12 = (short)((q[var0][12] & -65536) >> 16) > 0 && (short)(q[var0][12] & '\uffff') * 100 / (short)((q[var0][12] & -65536) >> 16) < 20;
            boolean var13 = false;
            boolean var14 = (var2[13] & 128) != 0;
            int var10002;
            if (q[var0][21] >= 0) {
               var10002 = q[var0][21]--;
            }

            short var15 = (short)((q[var0][26] & -65536) >> 16);
            int var16 = (short)(q[var0][26] & '\uffff');
            if (var15 >= 0 && var7) {
               int var31 = var15 - 1;
               if (var31 < 0) {
                  var31 = 20;
                  ++var16;
               }

               q[var0][26] = (short)var16 & '\uffff' | (short)var31 << 16 & -65536;
            }

            int[] var10000;
            short var17;
            if (var5) {
               if (q[var0][25] <= 0) {
                  var10000 = q[var0];
                  var10000[13] &= -129;
                  if ((var17 = (short)(q[var0][20] & '\uffff')) >= 0) {
                     a.c[var17][20] = -1;
                     a.c[var17][22] = -1;
                     q[var0][20] = -1;
                     q[var0][22] = -1;
                     continue;
                  }
               }

               var10002 = q[var0][25]--;
            }

            if ((var3 & 512) != 0 && (n || q[var0][30] > 0)) {
               var10002 = q[var0][30]--;
               if (n || q[var0][30] <= 0) {
                  var10000 = q[var0];
                  var10000[13] &= -513;
                  q[var0][20] = -1;
                  q[var0][22] = -1;
                  q[var0][30] = 0;
                  continue;
               }
            }

            if (!var6) {
               short var18;
               int var32;
               if ((var2[13] & 512) != 0) {
                  if (var12 && HG.e(100) < 60) {
                     var13 = true;
                  } else if (var11 && HG.e(100) < 25) {
                     var13 = true;
                  }

                  if (var13) {
                     var13 = false;

                     for(var32 = 0; var32 < 2; ++var32) {
                        var18 = (short)((q[var0][17 + var32] & -65536) >> 16);
                        if ((short)(q[var0][17 + var32] & '\uffff') == 2 && var18 >= 0) {
                           boolean var20 = false;
                           int[] var21;
                           if ((var21 = a(l[var18]))[6] == 0 && var21[3] > 0) {
                              a(var21[6], var21[3], true, false, q[var0]);
                              q[var0][17 + var32] = -1;
                              var13 = true;
                              d(ac);
                              h(q[var0][4], q[var0][5], (short)(q[var0][2] & '\uffff'));
                              q[var0][21] = 20;
                              break;
                           }
                        }
                     }

                     if (var13) {
                        continue;
                     }
                  }
               }

               int var19;
               long var39;
               if (var7) {
                  var17 = (short)(var1[20] & '\uffff');
                  int[] var33 = a.c[var17];
                  if (a(var0, var33)) {
                     var19 = b(var1);
                     int var36 = b(a.c[var17]);
                     P[0] = (short)(var19 & '\uffff') << 11;
                     P[1] = (short)((var19 & -65536) >> 16) << 11;
                     U[0] = (short)(var36 & '\uffff') << 11;
                     U[1] = (short)((var36 & -65536) >> 16) << 11;
                     int var37 = var2[29];
                     int var22 = var2[29] * var2[29];
                     int var23;
                     if (var1[14] >= 0) {
                        var37 = k(i[var1[14]]);
                        if ((var23 = l(i[var1[14]])) == 0 || var23 == 1) {
                           var22 = var37 * var37;
                        }
                     }

                     if (var1[15] >= 0) {
                        var23 = k(i[var1[15]]);
                        int var24;
                        if ((var24 = l(i[var1[15]])) == 0 || var24 == 1) {
                           var22 = var23 * var23;
                        }

                        if (var23 > var37) {
                           var37 = var23;
                        }
                     }

                     boolean var25 = (var39 = a(P, U)) <= (long)var22;
                     boolean var26 = false;
                     if ((var2[13] & 1) != 0 || (var2[13] & 2) != 0) {
                        var16 = 10;
                     }

                     int var28;
                     int var29;
                     int var30;
                     if (var25 || var39 <= (long)(var37 * var37) && var16 > 3) {
                        q[var0][26] = 10;
                        if (m(var0)) {
                           continue;
                        }

                        if (q[var0][21] < 0) {
                           if (a(var0, var17, var25) != -1) {
                              var28 = a.c[var17][4] - q[var0][4];
                              var29 = a.c[var17][5] - q[var0][5];
                              var30 = b(var28, var29);
                              q[var0][27] = (short)var30 & '\uffff' | (short)var30 << 16 & -65536;
                              f(q[var0], 8 + var30);
                              var10000 = q[var0];
                              var10000[13] |= 16;
                              if (var14) {
                                 a(var0, true);
                              }

                              b(var0);
                              var10000 = q[var0];
                              var10000[13] &= -65;
                              q[var0][22] = -1;
                              continue;
                           }
                        } else {
                           f(q[var0], 0 + (short)(q[var0][27] & '\uffff'));
                           var8 = false;
                           var26 = true;
                        }
                     }

                     if (!var26) {
                        int var27 = var2[11] * 4096;
                        if (a.a(q[var0], a.c[var17], var27)) {
                           if ((var2[13] & 1) == 0 && (var2[13] & 2) == 0 && (q[var0][13] & 128) == 0 && !var4 && ((short)(q[var0][20] & '\uffff') != (short)((q[var0][20] & -65536) >> 16) || q[var0][20] == -1) && (short)(q[var0][26] & '\uffff') < 3) {
                              if (var14) {
                                 a(var0, false);
                              }

                              if ((short)((q[var0][26] & -65536) >> 16) == 20) {
                                 var28 = a.c[var17][4] - q[var0][4];
                                 var29 = a.c[var17][5] - q[var0][5];
                                 var30 = b(var28, var29);
                                 q[var0][27] = (short)var30 & '\uffff' | (short)var30 << 16 & -65536;
                                 f(q[var0], 12 + (short)(q[var0][27] & '\uffff'));
                              }

                              if (a(q[var0], true)) {
                                 f(q[var0], 0 + (short)(q[var0][27] & '\uffff'));
                              }
                              continue;
                           }

                           if (!var8) {
                              q[var0][22] = b(a.c[var17]);
                              var8 = true;
                           }
                        } else if ((var2[13] & 1) == 0 && (var2[13] & 2) == 0 && (short)(q[var0][26] & '\uffff') <= 3) {
                           if ((q[var0][13] & '耀') == 0) {
                              var10000 = q[var0];
                              var10000[20] &= -65536;
                              var10000 = q[var0];
                              var10000[20] |= 65535;
                              q[var0][22] = q[var0][23];
                              q[var0][26] = 1376256;
                           }
                        } else if (q[var0][22] == -1) {
                           q[var0][22] = b(a.c[var17]);
                           var10000 = q[var0];
                           var10000[13] &= -65;
                           var10000 = q[var0];
                           var10000[13] &= -513;
                        } else {
                           P[0] = q[var0][4];
                           P[1] = q[var0][5];
                           long var40 = (long)var27;
                           if ((var2[13] & 1) == 0 && (q[var0][13] & '耀') == 0) {
                              if ((var2[13] & 2) != 0) {
                                 var40 *= 4L;
                              } else if ((var2[13] & 4) != 0) {
                                 var40 *= 3L;
                              } else if ((var2[13] & 8) != 0) {
                                 var40 *= 2L;
                              }

                              U[0] = ((short)(q[var0][23] & '\uffff') << 11) + 2048;
                              U[1] = ((short)((q[var0][23] & -65536) >> 16) << 11) + 2048;
                              if (a(P, U) > var40 * var40 || (q[var0][13] & 16384) != 0) {
                                 if ((q[var0][13] & 64) != 0) {
                                    var10000 = q[var0];
                                    var10000[13] &= -65;
                                    b(var0);
                                 }

                                 var10000 = q[var0];
                                 var10000[13] |= 16384;
                                 if (b(q[var0]) != q[var0][23]) {
                                    q[var0][22] = q[var0][23];
                                    var8 = true;
                                 }

                                 var10000 = q[var0];
                                 var10000[20] &= -65536;
                                 var10000 = q[var0];
                                 var10000[20] |= 65535;
                                 var10000 = q[var0];
                                 var10000[20] &= 65535;
                                 var10000 = q[var0];
                                 var10000[20] |= (short)var17 << 16 & -65536;
                              }
                           }
                        }
                     }
                  } else if ((a[q[var0][11]][13] & 8) == 0) {
                     if ((q[var0][13] & 131072) == 0) {
                        b(var0, var10);
                     }
                  } else {
                     var10000 = q[var0];
                     var10000[20] &= -65536;
                     var10000 = q[var0];
                     var10000[20] |= 65535;
                  }
               }

               if (var8 && (q[var0][13] & 512) == 0) {
                  if ((q[var0][13] & 16384) == 0 && y % q.length == var0) {
                     var32 = q[var0][29];
                     if ((var18 = (short)(var1[20] & '\uffff')) >= 0) {
                        P[0] = ((short)(q[var0][0] & '\uffff') << 12) + 2048;
                        P[1] = ((short)((q[var0][0] & -65536) >> 16) << 12) + 2048;
                        U[0] = ((short)(a.c[var18][0] & '\uffff') << 12) + 2048;
                        U[1] = ((short)((a.c[var18][0] & -65536) >> 16) << 12) + 2048;
                        long var35 = a(P, U);
                        U[0] = ((short)(q[var0][22] & '\uffff') / 2 << 12) + 2048;
                        U[1] = ((short)((q[var0][22] & -65536) >> 16) / 2 << 12) + 2048;
                        long var38 = a(P, U);
                        P[0] = ((short)(a.c[var18][0] & '\uffff') << 12) + 2048;
                        P[1] = ((short)((a.c[var18][0] & -65536) >> 16) << 12) + 2048;
                        var39 = a(P, U) - (long)(var32 * var32);
                        if (var35 < var38 + var39 && var39 > (long)(var32 * var32) || b(q[var0]) == q[var0][22]) {
                           q[var0][22] = b(a.c[var18]);
                           var10000 = q[var0];
                           var10000[13] &= -65;
                           var10000 = q[var0];
                           var10000[13] &= -513;
                           b(var0);
                           var8 = true;
                        }
                     }
                  }

                  e(var0);
               }

               if (!var7) {
                  if ((a[q[var0][11]][13] & 8) == 0 && (q[var0][13] & 131072) == 0) {
                     b(var0, var10);
                  }

                  if (!var8 && (short)(q[var0][20] & '\uffff') == -1) {
                     f(q[var0], 0 + (short)(q[var0][27] & '\uffff'));
                     var10000 = q[var0];
                     var10000[13] &= -16385;
                     if (var2[27] == 0 || var2[27] == 9) {
                        var10002 = q[var0][31]--;
                        if (q[var0][31] <= 0) {
                           q[var0][31] = HG.b(20, 50);
                           int var34 = (short)((var32 = b(q[var0])) & '\uffff') + HG.b(-5, 5);
                           var19 = (short)((var32 & -65536) >> 16) + HG.b(-5, 5);
                           if (a(var0, 0, var34, var19, true, false)) {
                              q[var0][22] = (short)var34 & '\uffff' | (short)var19 << 16 & -65536;
                           }
                        }
                     }
                  }
               }

               a(q[var0], true);
            }
         }
      }

      n = false;
   }

   public static final void e() {
      e = 0;
      int var0 = 0;

      for(int var1 = 0; var1 < q.length; ++var1) {
         q[var1][21] = -1;
         q[var1][20] = -1;
         q[var1][16] = -1;
         q[var1][22] = -1;
         q[var1][26] = 1376256;
         q[var1][31] = HG.b(20, 50);
         q[var1][29] = a[q[var1][11]][29];
         q[var1][23] = b(q[var1]);
         short var2 = (short)(q[var1][12] & '\uffff');
         int var3;
         if (O[11] >= 0) {
            var3 = 0;

            for(int var4 = 0; var4 < 2; ++var4) {
               if ((short)(q[var1][17 + var4] & '\uffff') == 5) {
                  if ((u[O[11]] & 1 << a.h + var0) == 0) {
                     ++var3;
                  }

                  ++var0;
               }
            }

            if (var3 == 0 && var2 < 0) {
               int[] var10000 = q[var1];
               var10000[3] |= 65536;
               if ((q[var1][3] & 2) != 0) {
                  a.b(q[var1]);
               }

               q[var1][0] = -1;
               var10000 = J;
               int var10001 = O[11];
               var10000[var10001] |= 1 << var1;
            }
         }

         if (O[11] == -1 || (J[O[11]] & 1 << var1) == 0) {
            if ((q[var1][3] & 65536) == 0 && !j(var1) && var2 > 0) {
               ++e;
            }

            var3 = q[var1][11];
            short var12 = (short)(a[var3][1] & '\uffff');
            short var5 = (short)((a[var3][1] & -65536) >> 16);
            byte var6 = (byte)(a[var3][4] & 255);
            byte var7 = (byte)(a[var3][4] >> 8 & 255);
            int var8 = (byte)(a[var3][4] >> 16 & 255);
            d(q[var1], 1 + var12 - 134);
            e(q[var1], a[0][0]);
            i(q[var1], 0);
            int var9 = h(q[var1]);
            if (h(q[var1]) > 0) {
               b(q[var1], 0, var5);
            }

            if (a[var3][4] != -1) {
               if (var9 >= 1) {
                  b(q[var1], 1, var6);
               }

               if (var8 < 0) {
                  var8 = var8 * -1 - 1;
                  if (a(q[var1]) > 0) {
                     a(q[var1], 0, 1);
                  }
               } else if (var9 >= 2) {
                  b(q[var1], 2, var7);
               }

               if (f(q[var1], 0) > 0) {
                  d(q[var1], 0, var8);
               }
            }

            if (a[q[var1][11]][27] != 7 && a[q[var1][11]][27] != 8) {
               a.b(var1);
            }

            int var10;
            if ((var10 = q[var1][14]) >= 0) {
               q[var1][29] = k(i[var10]);
               int[] var11 = a(i[var10]);
               b(var1, var11);
            }

            f(q[var1], 0 + (short)(q[var1][27] & '\uffff'));
         }
      }

   }

   public static final boolean j(int var0) {
      int var1 = a[q[var0][11]][27];
      return q[var0][11] >= 0 && (var1 == 6 || var1 == 7 || var1 == 8 || var1 == 9);
   }

   public static final void b(int var0, int[] var1) {
      if (var1 != null) {
         int var2 = q(q[var0]);
         byte var3 = a[var2][0];
         boolean var4 = false;
         switch(var1[15]) {
         case 0:
            var3 = a[var2][1];
            break;
         case 1:
            int var5 = 0;
            if (a[var2][2] < a[var2].length) {
               var5 = a[var2][a[var2][2]].length;
            }

            if (var1[16] > var5) {
               var3 = a[var2][1];
            } else {
               var3 = a[var2][2];
            }
            break;
         case 2:
            var3 = a[var2][3];
            break;
         case 3:
            var3 = a[var2][4];
         }

         int var6 = var1[16];
         if (var3 >= c(q[var0])) {
            var3 = 0;
         }

         e(q[var0], var3);
         if (var6 >= d(q[var0])) {
            var6 = 0;
         }

         i(q[var0], var6);
      }
   }

   public static final boolean a(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         return (q[var0][13] & 128) == 0 && (short)(O[12] & '\uffff') > 0;
      } else if ((var1[3] & 32) != 0) {
         if ((var1[13] & 2) == 0 && (var1[3] & 65536) == 0) {
            return (q[var0][13] & 128) == 0 || (var1[13] & 128) == 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static final int b(int[] var0) {
      boolean var1 = false;
      boolean var2 = false;
      short var6;
      short var7;
      if ((var0[3] & 16) != 0) {
         var6 = -1024;
         var7 = -2048;
      } else {
         int[] var3;
         var6 = (short)((var3 = a(var0))[2] & '\uffff');
         var7 = (short)((var3[2] & -65536) >> 16);
      }

      int var8 = var0[4] + var6;
      int var4 = var0[5] + var7;
      return (short)(var8 >> 11) & '\uffff' | (short)(var4 >> 11) << 16 & -65536;
   }

   public static final void b(int var0, boolean var1) {
      int[] var2;
      long var3 = (long)((var2 = a[q[var0][11]])[11] * 4096);
      short var5 = -1;
      P[0] = q[var0][4];
      P[1] = q[var0][5];
      if ((q[var0][13] & 128) == 0 && !j(var0)) {
         U[0] = O[4];
         U[1] = O[5];
         if (a(P, U) <= var3 * var3 && (short)(O[12] & '\uffff') > 0) {
            q[var0][22] = b(O);
            var5 = (short)(O[2] & '\uffff');
         }
      }

      int var6;
      if (var1 && (q[var0][13] & 128) == 0) {
         for(var6 = 0; var6 < q.length; ++var6) {
            if (var6 != var0 && ((a[q[var6][11]][13] & 8) != 0 || j(var6)) && ((short)(a[q[var6][11]][1] & '\uffff') != (short)(var2[1] & '\uffff') || (q[var0][13] & 128) != 0)) {
               U[0] = q[var6][4];
               U[1] = q[var6][5];
               if (a(P, U) <= var3 * var3 && a(var0, q[var6])) {
                  q[var0][22] = b(q[var6]);
                  var5 = (short)(q[var6][2] & '\uffff');
                  break;
               }
            }
         }
      } else if (j(var0) || (q[var0][13] & 128) != 0) {
         for(var6 = 0; var6 < q.length; ++var6) {
            if (var6 != var0 && !j(var6)) {
               U[0] = q[var6][4];
               U[1] = q[var6][5];
               if (a(P, U) <= var3 * var3 && a(var0, q[var6])) {
                  q[var0][22] = b(q[var6]);
                  var5 = (short)(q[var6][2] & '\uffff');
                  break;
               }
            }
         }
      }

      int[] var10000;
      if (var5 >= 0) {
         var10000 = q[var0];
         var10000[13] &= -513;
         var10000 = q[var0];
         var10000[20] &= -65536;
         var10000 = q[var0];
         var10000[20] |= (short)var5 & '\uffff';
      } else {
         var10000 = q[var0];
         var10000[20] &= -65536;
         var10000 = q[var0];
         var10000[20] |= 65535;
         var10000 = q[var0];
         var10000[13] &= -32769;
      }

      if (var5 != (short)((q[var0][20] & -65536) >> 16)) {
         if ((var6 = q[var0][14]) >= 0) {
            q[var0][29] = k(i[var6]);
         }

         q[var0][26] = 1376256;
         var10000 = q[var0];
         var10000[13] &= -32769;
      }

   }

   public static final void e(int var0) {
      int var1 = ((short)(q[var0][22] & '\uffff') << 11) + 2048;
      int var2 = ((short)((q[var0][22] & -65536) >> 16) << 11) + 2048;
      int[] var3 = a(q[var0]);
      int var4;
      if ((q[var0][13] & 64) != 0) {
         var4 = q[var0][24];
         var1 = (short)(b[var0][var4] & '\uffff') << 11;
         var2 = (short)((b[var0][var4] & -65536) >> 16) << 11;
         var1 -= (short)(var3[2] & '\uffff');
         var2 -= (short)((var3[2] & -65536) >> 16);
      }

      var4 = q[var0][4];
      int var5 = q[var0][5];
      if ((q[var0][13] & 64) == 0 && a.a(var4, var5, var1, var2, 4128, g) != -2) {
         g(var0);
      } else {
         int var8 = var3[9];
         P[0] = var4;
         P[1] = var5;
         U[0] = var1 - var4;
         U[1] = var2 - var5;
         I[0] = var1;
         I[1] = var2;
         int var9;
         int var12;
         int[] var10000;
         short var16;
         if (a(P, I) <= (long)(var8 * var8)) {
            a.a(q[var0], var1, var2, 0);
            if ((q[var0][13] & 64) != 0) {
               var9 = (short)(q[var0][0] & '\uffff') * 2;
               int var10 = (short)((q[var0][0] & -65536) >> 16) * 2;
               int var11 = var9 + ((short)(var3[3] & '\uffff') - (short)(var3[2] & '\uffff') >> 11);
               var12 = var10 + ((short)((var3[3] & -65536) >> 16) - (short)((var3[2] & -65536) >> 16) >> 11);

               for(int var13 = var10; var13 <= var12; ++var13) {
                  for(int var14 = var9; var14 <= var11; ++var14) {
                     if (a(0, a.u * 2, var13) && a(0, a.m * 2, var14) && (byte)(M[var13 * a.m * 2 * 3 + var14 * 3 + 2] >> 16 & 255) == var0) {
                        var10000 = M;
                        int var10001 = var13 * a.m * 2 * 3 + var14 * 3 + 2;
                        var10000[var10001] &= 65535;
                        var10000 = M;
                        var10001 = var13 * a.m * 2 * 3 + var14 * 3 + 2;
                        var10000[var10001] |= -65536;
                     }
                  }
               }

               int var10002 = q[var0][24]++;
               if (q[var0][24] < b[var0].length) {
                  short var15 = (short)(b[var0][q[var0][24]] & '\uffff');
                  var16 = (short)((b[var0][q[var0][24]] & -65536) >> 16);
                  b(q[var0], true);
                  if (!a(var0, 1, var15, var16, true, false)) {
                     q[var0][22] = b[var0][b[var0].length - 1];
                     g(var0);
                  }

                  b(q[var0], false);
                  return;
               }

               q[var0][22] = -1;
               var10000 = q[var0];
               var10000[13] &= -65;
               b(var0);
               if ((q[var0][13] & 65536) != 0) {
                  var10000 = q[var0];
                  var10000[13] &= -65537;
                  var10000 = q[var0];
                  var10000[13] &= -131073;
                  a(14, var0, (short)(q[var0][0] & '\uffff'), (short)((q[var0][0] & -65536) >> 16), 0, false);
                  return;
               }
            } else {
               q[var0][22] = -1;
               if ((q[var0][13] & 65536) != 0) {
                  var10000 = q[var0];
                  var10000[13] &= -65537;
                  var10000 = q[var0];
                  var10000[13] &= -131073;
                  a(14, var0, (short)(q[var0][0] & '\uffff'), (short)((q[var0][0] & -65536) >> 16), 0, false);
                  return;
               }
            }
         } else {
            if ((q[var0][3] & 2) != 0) {
               a.b(q[var0]);
            }

            a(U, var8, I);
            var10000 = q[var0];
            var10000[4] += I[0];
            var10000 = q[var0];
            var10000[5] += I[1];
            var16 = (short)((var9 = b(q[var0])) & '\uffff');
            short var17 = (short)((var9 & -65536) >> 16);
            q[var0][0] = (short)(q[var0][4] >> 12) & '\uffff' | (short)(q[var0][5] >> 12) << 16 & -65536;
            if ((q[var0][13] & 64) == 0 && !a(var0, 0, var16, var17, true, false)) {
               var10000 = q[var0];
               var10000[4] -= I[0];
               var10000 = q[var0];
               var10000[5] -= I[1];
               q[var0][0] = (short)(q[var0][4] >> 12) & '\uffff' | (short)(q[var0][5] >> 12) << 16 & -65536;
               b(q[var0], false);
               a.a(q[var0]);
               f(q[var0], 0 + (short)(q[var0][27] & '\uffff'));
               g(var0);
               return;
            }

            a.a(q[var0]);
            var12 = b(U[0], U[1]);
            if ((short)((q[var0][27] & -65536) >> 16) == var12) {
               var10000 = q[var0];
               var10000[27] &= -65536;
               var10000 = q[var0];
               var10000[27] |= (short)var12 & '\uffff';
            }

            var10000 = q[var0];
            var10000[27] &= 65535;
            var10000 = q[var0];
            var10000[27] |= (short)var12 << 16 & -65536;
            short var18 = (short)(q[var0][27] & '\uffff');
            f(q[var0], 4 + var18);
         }

      }
   }

   public static final int a(int var0, int var1, boolean var2) {
      int[] var10000 = q[var0];
      var10000[20] &= 65535;
      var10000 = q[var0];
      var10000[20] |= (short)var1 << 16 & -65536;
      long var3 = a(P, U);
      int var10002;
      int var5;
      int var6;
      boolean var7;
      int var8;
      if (q[var0][14] >= 0) {
         var5 = q[var0][14];
         var6 = k(i[var5]);
         q[var0][29] = var6;
         if (var3 <= (long)(var6 * var6)) {
            var7 = true;
            if ((var8 = l(i[var5])) == 2 || var8 == 3) {
               if (a.b(q[var0], a.c[var1]) && q[var0][28] > 0 && !var2) {
                  var10002 = q[var0][28]--;
               } else {
                  var7 = false;
               }
            }

            if (var7) {
               b(var0, a(i[var5]));
               var10000 = q[var0];
               var10000[13] &= -8193;
               return var8;
            }
         }
      }

      if (q[var0][15] >= 0) {
         var5 = q[var0][15];
         var6 = k(i[var5]);
         q[var0][29] = var6;
         if (var3 <= (long)(var6 * var6)) {
            var7 = true;
            if ((var8 = l(i[var5])) == 2 || var8 == 3) {
               if (a.b(q[var0], a.c[var1]) && q[var0][28] > 0 && !var2) {
                  var10002 = q[var0][28]--;
               } else {
                  var7 = false;
               }
            }

            if (var7) {
               b(var0, a(i[var5]));
               var10000 = q[var0];
               var10000[13] |= 8192;
               return var8;
            }
         }
      }

      if (q[var0][14] == -1 && q[var0][15] == -1) {
         q[var0][29] = a[q[var0][11]][29];
         return 5;
      } else {
         return -1;
      }
   }

   public static final boolean c(int var0) {
      if ((short)(q[var0][12] & '\uffff') > 0) {
         return false;
      } else {
         f(q[var0], 16);
         a(q[var0], false);
         if ((q[var0][13] & 2) == 0) {
            int[] var10000 = q[var0];
            var10000[13] |= 2;
            var10000 = q[var0];
            var10000[3] |= 32768;
            b(q[var0], true);
            if (O[11] >= 0) {
               var10000 = J;
               int var10001 = O[11];
               var10000[var10001] |= 1 << var0;
            }

            a(var0);
            HG.m(a[q[var0][11]][28]);
            if (!j(var0)) {
               --e;
               if (e <= 0) {
                  HG.h();
                  HG.m(ab);
                  a(15, 0, 0, 0, 0, false);
               }
            }

            a(4, var0, 0, 0, 0, false);
         }

         return true;
      }
   }

   public static final boolean m(int var0) {
      if ((q[var0][13] & 16) == 0) {
         return false;
      } else if (a(q[var0], true)) {
         int[] var1 = null;
         boolean var2 = false;
         int var4;
         if ((q[var0][13] & 8192) == 0) {
            var4 = q[var0][14];
         } else {
            var4 = q[var0][15];
         }

         if (var4 >= 0) {
            var1 = i[var4];
         }

         short var3 = (short)(q[var0][20] & '\uffff');
         q[var0][21] = a(q[var0], a.c[var3], var1);
         int[] var10000 = q[var0];
         var10000[13] &= -17;
         return false;
      } else {
         return true;
      }
   }

   public static final boolean f(int var0) {
      short var1 = (short)(q[var0][20] & '\uffff');
      int var2;
      int var3 = (var2 = q[var0][29]) >> 11;
      var2 *= var2;
      int var4 = -1;
      long var5 = -1L;
      long var7 = 0L;
      long var9 = 0L;
      if (var1 >= 0) {
         int var11 = b(q[var0]);
         int var12 = b(a.c[var1]);
         P[0] = (short)(var11 & '\uffff') << 11;
         P[1] = (short)((var11 & -65536) >> 16) << 11;
         boolean var13 = false;
         boolean var14 = false;
         int var19;
         int var20;
         if ((a.c[var1][3] & 16) != 0) {
            var19 = 1;
            var20 = 1;
         } else {
            int[] var15;
            var19 = (short)((var15 = a(a.c[var1]))[3] & '\uffff') - (short)(var15[2] & '\uffff') >> 11;
            var20 = (short)((var15[3] & -65536) >> 16) - (short)((var15[2] & -65536) >> 16) >> 11;
         }

         I[0] = (short)(var12 & '\uffff') << 11;
         I[1] = (short)((var12 & -65536) >> 16) << 11;

         for(int var21 = -var3; var21 <= var3 + var19; ++var21) {
            for(int var16 = -var3; var16 <= var3 + var20; ++var16) {
               if (var16 != 0 || var21 != 0) {
                  int var17 = (short)(var12 & '\uffff') + var21;
                  int var18 = (short)((var12 & -65536) >> 16) + var16;
                  U[0] = var17 << 11;
                  U[1] = var18 << 11;
                  var7 = a(U, P);
                  if (a(U, I) <= (long)var2 && a(var0, 1, var17, var18, true, false) && (var7 < var5 || var5 == -1L)) {
                     var4 = (short)var17 & '\uffff' | (short)var18 << 16 & -65536;
                     var5 = var7;
                  }
               }
            }
         }
      }

      if (var4 >= 0) {
         q[var0][22] = var4;
         return true;
      } else {
         return false;
      }
   }

   public static final boolean g(int var0) {
      int var1;
      int var2;
      int[] var10000;
      int var10001;
      for(var1 = 0; var1 < a.u * 2; ++var1) {
         for(var2 = 0; var2 < a.m * 2; ++var2) {
            var10000 = M;
            var10001 = var1 * a.m * 2 * 3 + var2 * 3 + 1;
            var10000[var10001] &= 65535;
            var10000 = M;
            var10001 = var1 * a.m * 2 * 3 + var2 * 3 + 1;
            var10000[var10001] |= 0;
         }
      }

      b(q[var0], true);
      if ((short)(q[var0][20] & '\uffff') == 0) {
         b(O, true);
      }

      var2 = (short)((var1 = b(q[var0])) & '\uffff');
      int var3 = (short)((var1 & -65536) >> 16);
      short var4 = (short)(q[var0][22] & '\uffff');
      short var5 = (short)((q[var0][22] & -65536) >> 16);
      if (!a(var0, 1, var4, var5, true, false)) {
         if ((short)(q[var0][20] & '\uffff') < 0) {
            if ((q[var0][13] & 65536) != 0) {
               var10000 = q[var0];
               var10000[13] &= -65537;
               var10000 = q[var0];
               var10000[13] &= -131073;
               a(14, var0, var4 / 2, var5 / 2, 0, false);
            }

            q[var0][22] = -1;
            return false;
         }

         if (!f(var0)) {
            b(q[var0], false);
            b(O, false);
            q[var0][22] = -1;
            q[var0][20] = -1;
            return false;
         }

         var4 = (short)(q[var0][22] & '\uffff');
         var5 = (short)((q[var0][22] & -65536) >> 16);
      }

      int var6 = 0;
      int var7 = (Math.abs(var4 - var2) + Math.abs(var5 - var3)) * 10;
      int var8 = 0 + var7;
      boolean var9 = false;
      boolean var10 = false;
      int var11 = a.m;
      int var12 = a.u;
      int var13 = -1;
      int var14 = -1;
      boolean var15 = false;
      a(var2, var3, var8, 0, var7, 2, -1, -1);
      if (var2 == var4 && var3 == var5) {
         if ((q[var0][13] & 65536) != 0) {
            var10000 = q[var0];
            var10000[13] &= -65537;
            var10000 = q[var0];
            var10000[13] &= -131073;
            a(14, var0, var4 / 2, var5 / 2, 0, false);
         }

         q[var0][22] = -1;
         return false;
      } else {
         int var17;
         int var18;
         for(int var16 = 0; !var15; ++var16) {
            int var19;
            for(var17 = -1; var17 < 2; ++var17) {
               for(var18 = -1; var18 < 2; ++var18) {
                  int var26 = var2 + var17;
                  int var27 = var3 + var18;
                  var19 = var6 / 6 + 1;
                  if (a(var0, var19, var26, var27, true, true) && (short)((M[var27 * a.m * 2 * 3 + var26 * 3 + 1] & -65536) >> 16) != 2) {
                     if (var17 != 0 && var18 != 0) {
                        var6 = (short)((M[var3 * a.m * 2 * 3 + var2 * 3 + 0] & -65536) >> 16) + 7;
                     } else {
                        var6 = (short)((M[var3 * a.m * 2 * 3 + var2 * 3 + 0] & -65536) >> 16) + 5;
                     }

                     if ((short)((M[var27 * a.m * 2 * 3 + var26 * 3 + 1] & -65536) >> 16) != 1 || var6 <= (short)((M[var27 * a.m * 2 * 3 + var26 * 3 + 0] & -65536) >> 16)) {
                        var7 = (Math.abs(var4 - var26) + Math.abs(var5 - var27)) * 10;
                        var8 = var6 + var7;
                        if (var26 < var11) {
                           var11 = var26;
                        } else if (var26 > var13) {
                           var13 = var26;
                        }

                        if (var27 < var12) {
                           var12 = var27;
                        } else if (var27 > var14) {
                           var14 = var27;
                        }

                        a(var26, var27, var8, var6, var7, 1, var2, var3);
                     }
                  }
               }
            }

            short var28 = -1;

            for(var18 = var11; var18 <= var13; ++var18) {
               for(var19 = var12; var19 <= var14; ++var19) {
                  if ((short)((M[var19 * a.m * 2 * 3 + var18 * 3 + 1] & -65536) >> 16) == 1 && (var28 > (short)(M[var19 * a.m * 2 * 3 + var18 * 3 + 0] & '\uffff') || var28 < 0)) {
                     var28 = (short)(M[var19 * a.m * 2 * 3 + var18 * 3 + 0] & '\uffff');
                     var2 = var18;
                     var3 = var19;
                  }
               }
            }

            if (var28 == -1 || var16 > 250) {
               var10000 = q[var0];
               var10000[13] &= -257;
               var10000 = q[var0];
               var10000[13] |= 512;
               q[var0][30] = 20;
               b(q[var0], false);
               b(O, false);
               if ((q[var0][13] & 65536) != 0) {
                  var10000 = q[var0];
                  var10000[13] &= -65537;
                  var10000 = q[var0];
                  var10000[13] &= -131073;
                  a(14, var0, var4 / 2, var5 / 2, 0, false);
               }

               return false;
            }

            e(var2, var3, 2);
            if (var2 == var4 && var3 == var5) {
               var15 = true;
            }
         }

         var17 = 0;

         for(var18 = 0; var17 < 8323199; ++var18) {
            var2 = (short)((var17 = a.b(var2, var3)) & '\uffff');
            var3 = (short)((var17 & -65536) >> 16);
         }

         b(var0);
         if (b[var0] == null || b[var0].length != var18 - 1) {
            if (var18 <= 1) {
               b(q[var0], false);
               b(O, false);
               if ((q[var0][13] & 65536) != 0) {
                  var10000 = q[var0];
                  var10000[13] &= -65537;
                  var10000 = q[var0];
                  var10000[13] &= -131073;
                  a(14, var0, var4 / 2, var5 / 2, 0, false);
               }

               q[var0][22] = -1;
               return false;
            }

            b[var0] = new int[var18 - 1];
         }

         short var24 = var4;
         short var25 = var5;
         int[] var29;
         int var20 = (short)((var29 = a(q[var0]))[3] & '\uffff') - (short)(var29[2] & '\uffff') >> 11;

         for(int var21 = (short)((var29[3] & -65536) >> 16) - (short)((var29[2] & -65536) >> 16) >> 11; var18 > 1; --var18) {
            b[var0][var18 - 2] = (short)var24 & '\uffff' | (short)var25 << 16 & -65536;

            for(int var22 = var25; var22 <= var25 + var21; ++var22) {
               for(int var23 = var24; var23 <= var24 + var20; ++var23) {
                  var10000 = M;
                  var10001 = var22 * a.m * 2 * 3 + var23 * 3 + 2;
                  var10000[var10001] &= -16711681;
                  var10000 = M;
                  var10001 = var22 * a.m * 2 * 3 + var23 * 3 + 2;
                  var10000[var10001] |= (byte)var0 << 16 & 16711680;
                  var10000 = M;
                  var10001 = var22 * a.m * 2 * 3 + var23 * 3 + 2;
                  var10000[var10001] &= 16777215;
                  var10000 = M;
                  var10001 = var22 * a.m * 2 * 3 + var23 * 3 + 2;
                  var10000[var10001] |= (byte)(var18 - 2) << 24 & -16777216;
               }
            }

            var24 = (short)((var17 = a.b(var24, var25)) & '\uffff');
            var25 = (short)((var17 & -65536) >> 16);
         }

         q[var0][24] = 0;
         var10000 = q[var0];
         var10000[13] |= 64;
         if (q[var0][22] == -1) {
            q[var0][22] = b[var0][0];
         }

         b(q[var0], false);
         return true;
      }
   }

   public static final void b(int var0) {
      if (b[var0] != null) {
         int[] var1;
         int var2 = (short)((var1 = a(q[var0]))[3] & '\uffff') - (short)(var1[2] & '\uffff') >> 11;
         int var3 = (short)((var1[3] & -65536) >> 16) - (short)((var1[2] & -65536) >> 16) >> 11;

         for(int var4 = 0; var4 < b[var0].length; ++var4) {
            short var5 = (short)(b[var0][var4] & '\uffff');

            short var6;
            for(int var7 = var6 = (short)((b[var0][var4] & -65536) >> 16); var7 <= var6 + var3; ++var7) {
               for(int var8 = var5; var8 <= var5 + var2; ++var8) {
                  if ((byte)(M[var7 * a.m * 2 * 3 + var8 * 3 + 2] >> 16 & 255) == var0) {
                     int[] var10000 = M;
                     int var10001 = var7 * a.m * 2 * 3 + var8 * 3 + 2;
                     var10000[var10001] &= 65535;
                     var10000 = M;
                     var10001 = var7 * a.m * 2 * 3 + var8 * 3 + 2;
                     var10000[var10001] |= -65536;
                  }
               }
            }
         }
      }

   }

   public static final void e(int var0, int var1, int var2) {
      if (var0 >= 0 && var1 >= 0 && var1 < a.u * 2 && var0 < a.m * 2) {
         int[] var10000 = M;
         int var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= 65535;
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var2 << 16 & -65536;
      }
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var0 >= 0 && var1 >= 0 && var1 < a.u * 2 && var0 < a.m * 2) {
         int[] var10000 = M;
         int var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] &= -65536;
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] |= (short)var2 & '\uffff';
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] &= 65535;
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] |= (short)var3 << 16 & -65536;
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= -65536;
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var4 & '\uffff';
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= 65535;
         var10000 = M;
         var10001 = var1 * a.m * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var5 << 16 & -65536;
         a.a(var0, var1, var6, var7);
      }
   }

   public static final void a(int var0) {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = a.c;
      int var4 = 0;
      int[] var10000 = D;
      var10000[var3] &= -65536;
      var10000 = D;
      var10000[var3] |= 65535;
      var10000 = D;
      var10000[var3] &= 65535;
      var10000 = D;
      var10000[var3] |= 0;
      ++a.c;
      int var5;
      short var6;
      short var7;
      if ((var5 = q[var0][14]) >= 0 && ((e[i[var5][4]][3] & 1) != 0 || (i[var5][3] & 131072) != 0 || HG.e(100) >= 50)) {
         var6 = (short)(i[var5][2] & '\uffff');
         var7 = (short)(D[var3] & '\uffff');
         var10000 = a.c[var6];
         var10000[1] &= -65536;
         var10000 = a.c[var6];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = D;
         var10000[var3] &= -65536;
         var10000 = D;
         var10000[var3] |= (short)var6 & '\uffff';
         ++var4;
      }

      if ((var5 = q[var0][15]) >= 0 && ((e[i[var5][4]][3] & 1) != 0 || (i[var5][3] & 131072) != 0 || HG.e(100) >= 50)) {
         var6 = (short)(i[var5][2] & '\uffff');
         var7 = (short)(D[var3] & '\uffff');
         var10000 = a.c[var6];
         var10000[1] &= -65536;
         var10000 = a.c[var6];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = D;
         var10000[var3] &= -65536;
         var10000 = D;
         var10000[var3] |= (short)var6 & '\uffff';
         ++var4;
      }

      if ((var5 = q[var0][16]) >= 0 && ((p[n[var5][4]][3] & 1) != 0 || (n[var5][3] & 131072) != 0 || HG.e(100) >= 50)) {
         var6 = (short)(n[var5][2] & '\uffff');
         var7 = (short)(D[var3] & '\uffff');
         var10000 = a.c[var6];
         var10000[1] &= -65536;
         var10000 = a.c[var6];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = D;
         var10000[var3] &= -65536;
         var10000 = D;
         var10000[var3] |= (short)var6 & '\uffff';
         ++var4;
      }

      short var8;
      int var11;
      for(var11 = 0; var11 < 2; ++var11) {
         var7 = (short)(q[var0][17 + var11] & '\uffff');
         short var10 = (short)((q[var0][17 + var11] & -65536) >> 16);
         if (var7 >= 0 && var10 >= 0) {
            var8 = -1;
            if (var7 == 2) {
               var8 = (short)(l[var10][2] & '\uffff');
            } else if (var7 == 3) {
               var8 = (short)(y[var10][2] & '\uffff');
            } else if (var7 == 5) {
               var8 = (short)(d[var10][2] & '\uffff');
            }

            if (var8 >= 0) {
               short var9 = (short)(D[var3] & '\uffff');
               var10000 = a.c[var8];
               var10000[1] &= -65536;
               var10000 = a.c[var8];
               var10000[1] |= (short)var9 & '\uffff';
               var10000 = D;
               var10000[var3] &= -65536;
               var10000 = D;
               var10000[var3] |= (short)var8 & '\uffff';
               ++var4;
            }
         }
      }

      if (q[var0][19] > 0) {
         var6 = (short)(l[q[var0][19]][2] & '\uffff');
         var7 = (short)(D[var3] & '\uffff');
         var10000 = a.c[var6];
         var10000[1] &= -65536;
         var10000 = a.c[var6];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = D;
         var10000[var3] &= -65536;
         var10000 = D;
         var10000[var3] |= (short)var6 & '\uffff';
         ++var4;
      }

      if (q[var0][28] > 0) {
         var11 = a(l);
         l[var11][6] = q[var0][28];

         for(int var12 = 0; var12 < 2; ++var12) {
            if (q[var0][14 + var12] >= 0) {
               int var13;
               if ((var13 = l(i[q[var0][14 + var12]])) == 2) {
                  l[var11][4] = 1;
                  break;
               }

               if (var13 == 3) {
                  l[var11][4] = 2;
                  break;
               }
            }
         }

         var7 = (short)(l[var11][2] & '\uffff');
         var8 = (short)(D[var3] & '\uffff');
         var10000 = a.c[var7];
         var10000[1] &= -65536;
         var10000 = a.c[var7];
         var10000[1] |= (short)var8 & '\uffff';
         var10000 = D;
         var10000[var3] &= -65536;
         var10000 = D;
         var10000[var3] |= (short)var7 & '\uffff';
         ++var4;
      }

      var10000 = q[var0];
      var10000[17] &= -65536;
      var10000 = q[var0];
      var10000[17] |= (short)var3 & '\uffff';
      var10000 = D;
      var10000[var3] &= 65535;
      var10000 = D;
      var10000[var3] |= (short)var4 << 16 & -65536;
   }

   public static final void a(int var0, boolean var1) {
      int[] var2 = a(q[var0]);
      int var3 = q[var0][4];
      int var4 = q[var0][5];
      int var5 = var2[11] * 4096;
      short var6 = (short)(q[var0][20] & '\uffff');
      var5 <<= 1;
      a.a[0] = var3 - var5;
      a.a[2] = var3 + var5;
      a.a[1] = var4 - var5;
      a.a[3] = var4 + var5;
      var5 = (var5 >> 1) - 2048;

      for(int var7 = a.a((int[])a.a, 32); var7 != -1; var7 = (short)((a.c[var7][1] & -65536) >> 16)) {
         if ((a.c[var7][3] & 65536) == 0 && (a.c[var7][13] & 2) == 0) {
            int[] var8 = a(a.c[var7]);
            if (!j((short)((a.c[var7][2] & -65536) >> 16)) && (a.c[var7][11] == q[var0][11] || var8[1] == var2[1])) {
               int var9 = a.c[var7][29];
               if (var1) {
                  q[var0][26] = 10;
               } else {
                  a.c[var7][29] = var5;
               }

               if ((short)(a.c[var7][20] & '\uffff') != var6) {
                  int[] var10000 = a.c[var7];
                  var10000[13] |= 32768;
                  var10000 = a.c[var7];
                  var10000[20] &= -65536;
                  var10000 = a.c[var7];
                  var10000[20] |= (short)var6 & '\uffff';
                  f((short)((a.c[var7][2] & -65536) >> 16));
               }

               a.c[var7][29] = var9;
            }
         }
      }

   }

   public static final int c(int var0) {
      int var1 = q[var0][11];
      if ((a[var1][13] & 2048) != 0) {
         int var2;
         if ((var2 = a[var1][12] / 5) > 2500) {
            var2 = 2500;
         }

         int var3;
         int var4 = (HG.e(var3 = var2 / 20) >> 2) + HG.e(2) + (HG.e(var3) >> 2) + HG.e(2) + (HG.e(var3) >> 2) + HG.e(2);
         int var5 = (var3 >> 2) + 2;
         ++a.w;
         return var5 + var4;
      } else {
         return 0;
      }
   }

   public static final void P() {
      for(int var0 = 0; var0 < 273; ++var0) {
         b[var0 * 11 + 4] = -1;
      }

      c = new short[273][];
      a = new Image[273][];
      q = new int[273];
      boolean var1 = false;
      boolean var2 = false;

      for(int var5 = 0; var5 < 273; ++var5) {
         if ((b[var5 * 11 + 9] & 2) != 0) {
            short var3 = b[var5 * 11 + 4];

            for(int var4 = 0; var4 < (var3 == -1 ? 1 : 1 + b[var3][1].length / b[var3][0].length); ++var4) {
               g(var5, var4);
            }
         }
      }

      a(true, 0, 75);
   }

   public static final void E() {
      int var0;
      for(var0 = 0; var0 < q.length; ++var0) {
         q[0] = 0;
      }

      for(var0 = 0; var0 < a.length; ++var0) {
         if ((b[var0 * 11 + 9] & 2) == 0) {
            a[var0] = null;
            c[var0] = null;
         }
      }

      f = null;
      b = null;
   }

   public static final void g(int var0, int var1) {
      if (var0 >= 0 || var0 < 273) {
         int[] var10000 = q;
         var10000[var0] |= 1;
         if (var1 < 15) {
            var10000 = q;
            var10000[var0] |= 1 << 1 + var1;
         }

      }
   }

   public static final void a(boolean var0, int var1, int var2) {
      int var3 = 0;
      int var4 = 0;

      int var5;
      for(var5 = 0; var5 < 273; ++var5) {
         if ((q[var5] & 1) != 0) {
            int[] var10000 = q;
            var10000[var5] &= 65535;
            var10000 = q;
            var10000[var5] |= (short)var5 << 16 & -65536;
            q[var3++] = q[var5];
         }
      }

      var5 = 1;

      while(true) {
         while(var5 != 0) {
            short var7;
            int var8;
            if (var5 >= var3) {
               int var9;
               for(var9 = 0; var9 < var3; ++var9) {
                  var7 = (short)((q[var9] & -65536) >> 16);
                  if (var0) {
                     b.a = (var2 - var1) * var4 / var3 + var1;
                  }

                  for(var8 = 0; var8 < 15; ++var8) {
                     if ((q[var9] & 1 << 1 + var8) != 0) {
                        b(var7, var8);
                     }
                  }

                  ++var4;
               }

               for(var9 = 0; var9 < 273; ++var9) {
                  q[var9] = 0;
               }

               return;
            }

            short var6 = b[(short)((q[var5] & -65536) >> 16) * 11 + 3];
            var7 = b[(short)((q[var5 - 1] & -65536) >> 16) * 11 + 3];
            if (var6 < var7) {
               var8 = q[var5];
               q[var5] = q[var5 - 1];
               q[var5 - 1] = var8;
               --var5;
            } else {
               ++var5;
            }
         }

         ++var5;
      }
   }

   public static final void b(int var0, int var1, int var2, int var3, Graphics var4) {
      b(var0, var1, var2, 0, var3, 0, var4);
   }

   public static final void b(int var0, int var1, int var2, int var3, int var4, int var5, Graphics var6) {
      int var7 = var0 - q;
      int var8 = var1 - c;
      a(var7, var8, var2, var3, var4, var5, var6);
   }

   public static final void a(int var0, int var1, int var2, int var3, Graphics var4) {
      a(var0, var1, var2, 0, var3, 0, var4);
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5, Graphics var6) {
      a(var0, var1, var2, var3, var4, var5, 0, 0, var6);
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Graphics var7) {
      a(var0, var1, var2, var3, var4 << 2, 0, var5, var6, var7);
   }

   private static final void a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Graphics var8) {
      int var9 = var4 * 7;
      if (c != null) {
         if (b != null) {
            if (b[var2 * 11 + 3] != -1) {
               if (var2 >= 0 && var2 < c.length) {
                  if (c[var2] != null) {
                     if (var9 >= 0 && var9 < c[var2].length) {
                        if (a[var2][0] != null) {
                           if (var6 == 0 && var7 == 0) {
                              switch(var5) {
                              case 2:
                                 var8.drawRegion(a[var2][0], c[var2][var9 + 1], c[var2][var9 + 2], c[var2][var9 + 3], c[var2][var9 + 4], var5, var0 - c[var2][var9 + 3] - c[var2][var9 + 5], var1 + c[var2][var9 + 6], 20);
                                 return;
                              default:
                                 var8.drawRegion(a[var2][0], c[var2][var9 + 1], c[var2][var9 + 2], c[var2][var9 + 3], c[var2][var9 + 4], var5, var0 + c[var2][var9 + 5], var1 + c[var2][var9 + 6], 20);
                              }
                           } else {
                              short var10 = c[var2][var9 + 3];
                              short var11 = c[var2][var9 + 4];
                              if ((var9 += b(var6, var7) * 7) >= 0 && var9 < c[var2].length) {
                                 int var12;
                                 int var13;
                                 int var14;
                                 if (a(var6) > a(var7)) {
                                    var12 = var10 * var7 / var6;

                                    for(var13 = 0; var13 < var10; ++var13) {
                                       var14 = var13 * var7 / var6 - (var12 >> 1);
                                       var8.drawRegion(a[var2][0], c[var2][var9 + 1] + var13, c[var2][var9 + 2], 1, c[var2][var9 + 4], 0, var0 + var13 - (var10 >> 1), var1 + var14 - (var11 >> 1), 20);
                                    }
                                 } else {
                                    var12 = var11 * var6 / var7;

                                    for(var13 = 0; var13 < var11; ++var13) {
                                       var14 = var13 * var6 / var7 - (var12 >> 1);
                                       var8.drawRegion(a[var2][0], c[var2][var9 + 1], c[var2][var9 + 2] + var13, c[var2][var9 + 3], 1, 0, var0 + var14 - (var10 >> 1), var1 + var13 - (var11 >> 1), 20);
                                    }
                                 }

                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public static final boolean l(int var0) {
      return b(var0, 0);
   }

   public static final boolean b(int var0, int var1) {
      boolean var2 = false;
      if (var0 >= 0 && var0 < a.length) {
         short var3 = b[var0 * 11 + 3];
         short var4;
         if ((var4 = b[var0 * 11 + 4]) < -1 || var4 >= b.length) {
            var4 = -1;
         }

         if (0 >= (var4 == -1 ? 1 : 1 + b[var4][1].length / b[var4][0].length)) {
            return false;
         } else {
            if (a[var0] == null) {
               a[var0] = new Image[var4 == -1 ? 1 : 1 + b[var4][1].length / b[var4][0].length];
            }

            if (a[var0][0] != null) {
               return true;
            } else if ((b[var0 * 11 + 9] & 1) != 0) {
               return false;
            } else {
               System.gc();
               if (var3 == -1) {
                  return false;
               } else {
                  String var5 = "/";
                  if (var3 < 10) {
                     var5 = var5 + "0";
                  }

                  if (var3 < 100) {
                     var5 = var5 + "0";
                  }

                  var5 = var5 + "" + var3;
                  DataInputStream var6 = null;

                  int var8;
                  short[] var10000;
                  label319: {
                     try {
                        a[var0][0] = Image.createImage(var5 + ".png");
                        if (a[var0][0] == null) {
                           throw new Exception();
                        }

                        System.gc();
                        b[var0 * 11 + 0] = (short)a[var0][0].getWidth();
                        b[var0 * 11 + 1] = (short)a[var0][0].getHeight();
                        if (c[var0] == null) {
                           int var9;
                           InputStream var25;
                           if ((var25 = HG.a.getClass().getResourceAsStream(var5 + ".off")) == null) {
                              b[var0 * 11 + 2] = (short)(b[var0 * 11 + 5] * b[var0 * 11 + 6]);
                              c[var0] = new short[b[var0 * 11 + 2] * 7];
                              var8 = 0;
                              var9 = 0;
                              switch(b[var0 * 11 + 7]) {
                              case 0:
                                 var8 = 0;
                                 break;
                              case 1:
                                 var8 = -b[var0 * 11 + 0] / b[var0 * 11 + 5];
                                 break;
                              case 2:
                                 var8 = -(b[var0 * 11 + 0] / b[var0 * 11 + 5] >> 1);
                              }

                              switch(b[var0 * 11 + 8]) {
                              case 0:
                                 var9 = 0;
                                 break;
                              case 1:
                                 var9 = -b[var0 * 11 + 1] / b[var0 * 11 + 6];
                                 break;
                              case 2:
                                 var9 = -(b[var0 * 11 + 1] / b[var0 * 11 + 6] >> 1);
                              }

                              int var10 = 0;
                              int var11 = 0;

                              while(true) {
                                 if (var11 >= b[var0 * 11 + 6]) {
                                    break label319;
                                 }

                                 for(int var12 = 0; var12 < b[var0 * 11 + 5]; ++var12) {
                                    c[var0][var10 + 0] = (short)var0;
                                    c[var0][var10 + 1] = (short)(b[var0 * 11 + 0] * var12 / b[var0 * 11 + 5]);
                                    c[var0][var10 + 2] = (short)(b[var0 * 11 + 1] * var11 / b[var0 * 11 + 6]);
                                    c[var0][var10 + 3] = (short)(b[var0 * 11 + 0] / b[var0 * 11 + 5]);
                                    c[var0][var10 + 4] = (short)(b[var0 * 11 + 1] / b[var0 * 11 + 6]);
                                    c[var0][var10 + 5] = (short)var8;
                                    c[var0][var10 + 6] = (short)var9;
                                    var10 += 7;
                                 }

                                 ++var11;
                              }
                           } else {
                              byte var27 = (var6 = new DataInputStream(var25)).readByte();
                              b[var0 * 11 + 2] = (short)var27;
                              c[var0] = new short[var27 * 7];

                              for(var9 = 0; var9 < var27 * 7; ++var9) {
                                 c[var0][var9] = (short)var6.readByte();
                              }

                              var6.close();
                              var6 = null;
                              break label319;
                           }
                        }

                        boolean var7 = false;
                     } catch (Exception var23) {
                        a[var0][0] = null;
                        c[var0] = null;
                        var2 = true;
                        var10000 = b;
                        var10000[var0 * 11 + 9] = (short)(var10000[var0 * 11 + 9] | 1);
                        break label319;
                     } finally {
                        try {
                           if (var6 != null) {
                              var6.close();
                           }
                        } catch (Exception var22) {
                        }

                     }

                     return true;
                  }

                  if (!var2) {
                     return true;
                  } else {
                     short var26;
                     if ((var26 = b[var0 * 11 + 10]) != -1 && b(var26, 0)) {
                        a[var0][0] = a[var26][0];
                        c[var0] = c[var26];
                        var4 = b[var0 * 11 + 4];

                        for(var8 = 0; var8 < 11; ++var8) {
                           b[var0 * 11 + var8] = b[var26 * 11 + var8];
                        }

                        b[var0 * 11 + 10] = (short)var26;
                        b[var0 * 11 + 4] = (short)var4;
                        var10000 = b;
                        var10000[var0 * 11 + 9] = (short)(var10000[var0 * 11 + 9] & -2);
                        return true;
                     } else {
                        return false;
                     }
                  }
               }
            }
         }
      } else {
         return false;
      }
   }

   public static final boolean n(int var0) {
      InputStream var1 = null;
      DataInputStream var2 = null;
      boolean var3 = false;
      f = null;
      b = null;
      System.gc();
      String var4 = "/";
      if (var0 < 10) {
         var4 = var4 + "0";
      }

      if (var0 < 100) {
         var4 = var4 + "0";
      }

      var4 = var4 + "" + var0;

      try {
         boolean var5;
         if ((var1 = HG.a.getClass().getResourceAsStream(var4 + ".png")) == null) {
            var5 = false;
            return false;
         }

         f = new byte[(var2 = new DataInputStream(var1)).available()];
         var2.read(f, 0, f.length);
         var3 = true;
         var2.close();
         var2 = null;
         if ((var1 = HG.a.getClass().getResourceAsStream(var4 + ".off")) == null) {
            var5 = true;
            return var5;
         }

         (var2 = new DataInputStream(var1)).readByte();
         b = new byte[var2.available()];
         var2.read(b, 0, b.length);
         var2.close();
         var2 = null;
      } catch (Exception var17) {
         f = null;
         b = null;
         System.gc();
      } finally {
         try {
            if (var2 != null) {
               var2.close();
            }
         } catch (Exception var16) {
         }

      }

      System.gc();
      return var3;
   }

   public static final void r() {
      b = new byte[8][][][];
      a = new Image[8][][];
      c = new byte[8][][];
      a = new byte[8][][][];
      a = new byte[8][][];
      a = new short[8][];
      a = new int[8][][][];
      c = new byte[8][];
      b = new byte[8][][];
      a = new short[8][][][][];
   }

   public static final void Y() {
      for(int var0 = 0; var0 < b.length; ++var0) {
         if ((d[var0 * 2 + 1] & 1) == 0) {
            b[var0] = (byte[][][])null;
            a[var0] = (Image[][])null;
            c[var0] = (byte[][])null;
            a[var0] = (byte[][][])null;
            a[var0] = (byte[][])null;
            a[var0] = null;
            a[var0] = (int[][][])null;
            c[var0] = null;
            b[var0] = (byte[][])null;
            a[var0] = (short[][][][])null;
         }
      }

      System.gc();
   }

   public static final int b(int var0, int var1) {
      if (a(var0) >= a(var1)) {
         return var0 < 0 ? 3 : 1;
      } else {
         return var1 < 0 ? 0 : 2;
      }
   }

   public static final void b(int[] var0, int var1) {
      var0[6] &= -65536;
      var0[6] |= (short)var1 & '\uffff';
   }

   public static final void a(int[] var0, int var1) {
      var0[6] &= 65535;
      var0[6] |= (short)var1 << 16 & -65536;
   }

   public static final void c(int[] var0, int var1) {
      var0[7] &= -65536;
      var0[7] |= (short)var1 & '\uffff';
   }

   public static final void d(int[] var0, int var1) {
      if ((var0[3] & 4) != 0) {
         if (var1 >= 0 && var1 < 8) {
            if (b[var1] == null) {
               c(var1);
            }

            var0[7] &= 65535;
            var0[7] |= (short)var1 << 16 & -65536;
         }
      }
   }

   public static final int p(int[] var0) {
      if ((var0[3] & 4) == 0) {
         return -1;
      } else {
         short var1;
         return (var1 = (short)(var0[6] & '\uffff')) >= 0 && var1 <= 17 ? var1 : -1;
      }
   }

   public static final int g(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)((var0[6] & -65536) >> 16);
   }

   public static final int u(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)(var0[7] & '\uffff');
   }

   public static final int q(int[] var0) {
      if ((var0[3] & 4) == 0) {
         return -1;
      } else {
         short var1;
         return (var1 = (short)((var0[7] & -65536) >> 16)) >= 0 && var1 < b.length ? (short)((var0[7] & -65536) >> 16) : -1;
      }
   }

   public static final int c(int[] var0) {
      if ((var0[3] & 4) == 0) {
         return -1;
      } else {
         int var1;
         return (var1 = q(var0)) == -1 ? -1 : b[var1].length;
      }
   }

   public static final int e(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)(var0[8] & '\uffff');
   }

   public static final void e(int[] var0, int var1) {
      if ((var0[3] & 4) != 0) {
         boolean var2 = false;
         var0[8] &= -65536;
         var0[8] |= (short)var1 & '\uffff';
         i(var0, 0);
         a((int[])var0, 0);
         c(var0, 0);
      }
   }

   public static final int d(int[] var0) {
      int var1;
      if ((var1 = q(var0)) == -1) {
         return -1;
      } else {
         int var2;
         return (var2 = e(var0)) >= 0 && var2 < a[var1].length ? a[var1][var2].length : -1;
      }
   }

   public static final int s(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)((var0[8] & -65536) >> 16);
   }

   public static final void i(int[] var0, int var1) {
      if ((var0[3] & 4) != 0) {
         boolean var2 = false;
         var0[8] &= 65535;
         var0[8] |= (short)var1 << 16 & -65536;
      }
   }

   public static final void c(int[] var0, int var1, int var2) {
      if (var1 >= 0 && var1 < 8) {
         int var3 = var1 >> 2;
         int var4 = var1 & 3;
         var0[9 + var3] &= ~(255 << (var4 << 3));
         var0[9 + var3] |= (var2 & 255) << (var4 << 3);
      }
   }

   public static final int d(int[] var0, int var1) {
      if (var1 >= 0 && var1 < 8) {
         int var2 = var1 >> 2;
         int var3 = var1 & 3;
         return var0[9 + var2] >> (var3 << 3) & 255;
      } else {
         return 0;
      }
   }

   public static final int h(int[] var0) {
      int var1;
      return (var1 = q(var0)) == -1 ? -1 : a[var1].length;
   }

   public static final int e(int[] var0, int var1) {
      int var2;
      if ((var2 = q(var0)) == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < a[var2].length ? a[var2][var1].length : -1;
      }
   }

   public static final int c(int[] var0, int var1) {
      if (q(var0) == -1) {
         return -1;
      } else {
         int var3 = h(var0);
         if (var1 < 0 && var1 >= var3) {
            return -1;
         } else {
            int var4;
            return (var4 = d(var0, var1)) >= 0 && var4 < e(var0, var1) ? var4 : -1;
         }
      }
   }

   public static final void b(int[] var0, int var1, int var2) {
      if (q(var0) != -1) {
         int var4 = h(var0);
         if (var1 >= 0 || var1 < var4) {
            c(var0, var1, var2);
            boolean var5 = false;
            boolean var6 = false;
            boolean var7 = false;
         }
      }
   }

   public static final int j(int[] var0) {
      int var1;
      return (var1 = q(var0)) == -1 ? -1 : c[var1].length;
   }

   public static final int f(int[] var0, int var1) {
      int var2;
      if ((var2 = q(var0)) == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < c[var2].length ? c[var2][var1] : -1;
      }
   }

   public static final int b(int[] var0, int var1) {
      if (q(var0) == -1) {
         return -1;
      } else {
         int var3 = j(var0);
         if (var1 < 0 && var1 >= var3) {
            return -1;
         } else {
            int var4 = h(var0) + var1;
            int var5;
            return (var5 = d(var0, var4)) >= 0 && var5 < f(var0, var1) ? var5 : -1;
         }
      }
   }

   public static final void d(int[] var0, int var1, int var2) {
      if (q(var0) != -1) {
         int var4 = j(var0);
         if (var1 >= 0 && var1 < var4) {
            int var5 = f(var0, var1);
            if (var2 >= 0 && var2 < var5) {
               int var6 = h(var0) + var1;
               c(var0, var6, var2);
            }
         }
      }
   }

   public static final int a(int[] var0) {
      int var1;
      return (var1 = q(var0)) == -1 ? -1 : b[var1].length;
   }

   public static final int a(int[] var0, int var1) {
      int var2;
      if ((var2 = q(var0)) == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < b[var2].length ? b[var2][var1].length : -1;
      }
   }

   public static final int g(int[] var0, int var1) {
      if (q(var0) == -1) {
         return -1;
      } else {
         int var3 = a(var0);
         if (var1 < 0 && var1 >= var3) {
            return -1;
         } else {
            int var4 = h(var0) + j(var0) + var1;
            int var5;
            return (var5 = d(var0, var4)) >= 0 && var5 < a(var0, var1) ? var5 : -1;
         }
      }
   }

   public static final void a(int[] var0, int var1, int var2) {
      if (q(var0) != -1) {
         int var4 = a(var0);
         if (var1 >= 0 && var1 < var4) {
            int var5 = a(var0, var1);
            if (var2 >= 0 && var2 < var5) {
               int var6 = h(var0) + j(var0) + var1;
               c(var0, var6, var2);
            }
         }
      }
   }

   public static final void f(int[] var0, int var1) {
      boolean var2 = false;
      if ((var0[3] & 4) != 0) {
         if (p(var0) != var1) {
            a((int[])var0, 0);
            c(var0, 0);
            b(var0, var1);
         }
      }
   }

   public static final boolean a(int[] var0, boolean var1) {
      boolean var2 = false;
      int var3 = g(var0);
      int var4 = p(var0);
      int var5;
      if ((var5 = q(var0)) >= 0 && var5 < 8) {
         if (b[var5] == null) {
            return true;
         } else if (var4 >= 0 && var4 < 17) {
            int var6;
            if ((var6 = e(var0)) == -1 || var6 >= b[var5].length) {
               var6 = 0;
            }

            ++var3;
            int var7 = 0;
            boolean var8 = false;
            int var9 = 0;

            for(int var10 = b[var5][var6][var4][0]; var10 < var3; ++var7) {
               var9 += 5;
               if (var9 >= b[var5][var6][var4].length) {
                  if (var1) {
                     var3 = 1;
                     var7 = 0;
                  }

                  var2 = true;
                  break;
               }

               var10 += b[var5][var6][var4][var9];
            }

            a(var0, var3);
            c(var0, var7);
            return var2;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public static final void d(int[] var0, Graphics var1) {
      try {
         int var2 = u(var0);
         int var3 = p(var0);
         int var4 = q(var0);
         int var5 = e(var0);
         int var6 = s(var0);
         if ((var0[3] & 4) != 0) {
            if (var4 != -1) {
               if (var4 >= 0 && var4 < b.length) {
                  if (b[var4] != null) {
                     if (var5 >= b[var4].length || var5 < 0) {
                        var5 = 0;
                     }

                     if (var6 >= a[var4][var5].length || var6 < 0) {
                        var6 = 0;
                     }

                     if (var3 >= 0 && var3 < 17) {
                        if (var2 * 5 >= -b[var4][var5][var3].length && var2 * 5 < b[var4][var5][var3].length) {
                           int var7 = 1 + var2 * 5;

                           for(int var8 = 0; var8 < 4; ++var8) {
                              byte var9;
                              if ((var9 = a[var4][var5][var6][var3 * 4 + var8]) != -1) {
                                 short var10 = a[var4][var9 * 6 + 2];
                                 int var11 = 0;
                                 if (var10 != -1 && (var11 = b((int[])var0, var10)) == -1) {
                                    var11 = 0;
                                 }

                                 short var12 = a[var4][var9 * 6 + 3];
                                 short var13 = a[var4][var9 * 6 + 5];
                                 boolean var14 = false;
                                 if (var13 != -1) {
                                    int var24;
                                    if ((var24 = g(var0, var13)) == -1) {
                                       var24 = 0;
                                    }

                                    var9 = b[var4][var13][var24];
                                 }

                                 short var15 = a[var4][var9 * 6 + 1];
                                 int var16 = 0;
                                 if (var15 != -1 && (var16 = c(var0, var15)) == -1) {
                                    var16 = 0;
                                 }

                                 byte var17 = b[var4][var5][var3][var7 + var8];
                                 if (var16 >= a[var4][var9].length) {
                                    var16 = 0;
                                 }

                                 if (a[var4][var9][var16] == null) {
                                    b(var0, var15, var16);
                                 }

                                 if (a[var4][var9][var16] == null) {
                                    return;
                                 }

                                 int var18 = var0[4] * a.g >> 12;
                                 int var19 = var0[5] * a.g >> 12;
                                 int var20 = var18 - q;
                                 int var21 = var19 - c;
                                 int var22;
                                 if (var17 >= 0) {
                                    if ((var22 = (var22 = var17 * 7) + var11 * var12 * 7) < 0 || var22 >= c[var4][var9].length) {
                                       var22 = 0;
                                    }

                                    var1.drawRegion(a[var4][var9][var16], c[var4][var9][var22 + 1], c[var4][var9][var22 + 2], c[var4][var9][var22 + 3], c[var4][var9][var22 + 4], 0, var20 + c[var4][var9][var22 + 5], var21 + c[var4][var9][var22 + 6], 20);
                                 } else {
                                    if ((var22 = (-var17 - 1) * 7 + var11 * var12 * 7) < 0 || var22 >= c[var4][var9].length) {
                                       var22 = 0;
                                    }

                                    var1.drawRegion(a[var4][var9][var16], c[var4][var9][var22 + 1], c[var4][var9][var22 + 2], c[var4][var9][var22 + 3], c[var4][var9][var22 + 4], 2, var20 - c[var4][var9][var22 + 3] - c[var4][var9][var22 + 5], var21 + c[var4][var9][var22 + 6], 20);
                                 }
                              }
                           }

                        }
                     }
                  }
               }
            }
         }
      } catch (Exception var23) {
      }
   }

   public static final short[] a(int[] var0, boolean var1) {
      if ((var0[3] & 4) == 0) {
         a[0] = 0;
         a[1] = 0;
         a[2] = 0;
         a[3] = 0;
         return null;
      } else {
         int var2;
         if ((var2 = q(var0)) == -1) {
            return null;
         } else if (a[var2] == null) {
            return null;
         } else {
            int var3 = e(var0);
            int var4 = s(var0);
            int var5 = p(var0);
            int var6 = u(var0);
            if (var1) {
               if (a[var5] != -1) {
                  var5 = a[var5];
               }

               var6 = 0;
            }

            if (var3 < 0 || var3 >= a[var2].length) {
               var3 = 0;
            }

            if (var4 < 0 || var4 >= a[var2][var3].length) {
               var4 = 0;
            }

            for(int var7 = 0; var7 < 4; ++var7) {
               a[var7] = a[var2][var3][var4][var5][var6 * 4 + var7];
            }

            return a;
         }
      }
   }

   public static final void c(int var0) {
      if (b[var0] == null) {
         short var1 = d[var0 * 2 + 0];
         System.gc();
         DataInputStream var2 = null;
         String var3 = "/";
         if (var1 < 10) {
            var3 = var3 + "0";
         }

         if (var1 < 100) {
            var3 = var3 + "0";
         }

         var3 = var3 + "" + var1 + ".mdl";

         try {
            (var2 = new DataInputStream(HG.a.getClass().getResourceAsStream(var3))).readInt();
            byte var4 = var2.readByte();
            byte var5 = var2.readByte();
            byte var6 = var2.readByte();
            if (var4 != 4 || var5 != 17 || var6 != 7) {
               b[var0] = (byte[][][])null;
               return;
            }

            byte var7 = var2.readByte();
            b[var0] = new byte[var7][17][];

            int var8;
            int var9;
            byte var10;
            for(var8 = 0; var8 < var7; ++var8) {
               for(var9 = 0; var9 < 17; ++var9) {
                  var10 = var2.readByte();
                  b[var0][var8][var9] = new byte[var10 * 5];
                  var2.read(b[var0][var8][var9], 0, b[var0][var8][var9].length);
               }
            }

            a[var0] = new byte[b[var0].length][][];

            int var11;
            int var12;
            int var44;
            for(var8 = 0; var8 < a[var0].length; ++var8) {
               byte var43 = var2.readByte();
               a[var0][var8] = new byte[var43][68];

               for(var44 = 0; var44 < var43; ++var44) {
                  for(var11 = 0; var11 < 17; ++var11) {
                     for(var12 = 0; var12 < 4; ++var12) {
                        a[var0][var8][var44][var11 * 4 + var12] = var2.readByte();
                     }
                  }
               }
            }

            byte var42 = var2.readByte();
            a[var0] = new short[var42 * 6];

            for(var9 = 0; var9 < var42; ++var9) {
               for(var44 = 0; var44 < 6; ++var44) {
                  a[var0][var9 * 6 + var44] = var2.readShort();
                  a[var0][var9 * 6 + 1] = -1;
               }
            }

            var9 = var2.readInt();
            b[var0] = new byte[var9][];

            for(var44 = 0; var44 < var9; ++var44) {
               b[var0][var44] = new byte[var2.readByte()];
               var2.read(b[var0][var44], 0, b[var0][var44].length);
            }

            var10 = var2.readByte();
            a[var0] = new int[var10][][];

            int var14;
            int var15;
            for(var11 = 0; var11 < var10; ++var11) {
               byte var46 = var2.readByte();
               byte var13 = var2.readByte();
               a[var0][var11] = new int[var46][var13];

               for(var14 = 0; var14 < var46; ++var14) {
                  for(var15 = 0; var15 < var13; ++var15) {
                     a[var0][var11][var14][var15] = var2.readInt();
                  }
               }
            }

            byte var45 = var2.readByte();
            c[var0] = new byte[var45];

            for(var12 = 0; var12 < var45; ++var12) {
               c[var0][var12] = var2.readByte();
            }

            a[var0] = new Image[var42][];
            a[var0] = new byte[var42][];
            c[var0] = new byte[var42][];
            var2.readInt();

            int var16;
            short var18;
            int var47;
            for(var47 = 0; var47 < var42; ++var47) {
               var2.readInt();
               var15 = var2.readInt();
               var16 = var2.readInt();
               byte[] var17 = null;
               if (d(var0, var47)) {
                  var2.skip((long)var15);
                  c[var0][var47] = new byte[var16];
                  var2.read(c[var0][var47], 0, c[var0][var47].length);
               } else {
                  if ((var18 = a[var0][var47 * 6 + 1]) == -1) {
                     if (var15 == 0) {
                        if (!n(a[var0][var47 * 6 + 0]) || b != null) {
                           b[var0] = (byte[][][])null;
                           throw new Exception("");
                        }

                        var15 = (var17 = f).length;
                     } else {
                        var17 = new byte[var15];
                        var2.read(var17, 0, var17.length);
                     }
                  } else {
                     var2.skip((long)var15);
                  }

                  c[var0][var47] = new byte[var16];
                  var2.read(c[var0][var47], 0, c[var0][var47].length);
                  if (var18 == -1) {
                     a[var0][var47] = new Image[1];
                     a[var0][var47][0] = Image.createImage(var17, 0, var15);
                     a[var0][var47] = null;
                  } else {
                     int var19 = a[var0][var18].length;
                     a[var0][var47] = new Image[var19];
                  }

                  System.gc();
               }
            }

            var47 = 0;

            while(true) {
               int var48;
               if (var47 >= var42) {
                  a[var0] = new short[a[var0].length][][][];

                  for(var47 = 0; var47 < a[var0].length; ++var47) {
                     a[var0][var47] = new short[a[var0][var47].length][][];

                     for(var14 = 0; var14 < a[var0][var47].length; ++var14) {
                        a[var0][var47][var14] = new short[17][];

                        for(var15 = 0; var15 < 17; ++var15) {
                           var16 = b[var0][var47][var15].length / 5;
                           a[var0][var47][var14][var15] = new short[var16 * 4];

                           for(var48 = 0; var48 < var16; ++var48) {
                              var18 = 32767;
                              short var49 = -32768;
                              short var20 = 32767;
                              short var21 = -32768;

                              for(int var22 = 0; var22 < 4; ++var22) {
                                 byte var23 = a[var0][var47][var14][var15 * 4 + var22];
                                 int var24 = b[var0][var47][var15][5 * var48 + var22 + 1];
                                 if (var23 != -1) {
                                    boolean var25 = false;
                                    if (var24 < 0) {
                                       var24 *= -1;
                                       --var24;
                                       var25 = true;
                                    }

                                    short var26 = (short)c[var0][var23][var24 * 7 + 5];
                                    short var27 = (short)c[var0][var23][var24 * 7 + 6];
                                    short var28 = (short)c[var0][var23][var24 * 7 + 3];
                                    short var29 = (short)c[var0][var23][var24 * 7 + 4];
                                    if (var25) {
                                       var26 = (short)((var26 = (short)(var26 * -1)) - var28);
                                    }

                                    if (var18 > var26) {
                                       var18 = var26;
                                    }

                                    if (var49 < var26 + var28) {
                                       var49 = (short)(var26 + var28);
                                    }

                                    if (var20 > var27) {
                                       var20 = var27;
                                    }

                                    if (var21 < var27 + var29) {
                                       var21 = (short)(var27 + var29);
                                    }
                                 }
                              }

                              a[var0][var47][var14][var15][var48 * 4 + 0] = var18;
                              a[var0][var47][var14][var15][var48 * 4 + 2] = var49;
                              a[var0][var47][var14][var15][var48 * 4 + 1] = var20;
                              a[var0][var47][var14][var15][var48 * 4 + 3] = var21;
                           }
                        }
                     }
                  }

                  for(var47 = 0; var47 < 8; ++var47) {
                     if (var47 != var0 && d[var47 * 2 + 0] == d[var0 * 2 + 0]) {
                        b[var47] = b[var0];
                        a[var47] = a[var0];
                        c[var47] = c[var0];
                        a[var47] = a[var0];
                        a[var47] = a[var0];
                        a[var47] = a[var0];
                        a[var47] = a[var0];
                        c[var47] = c[var0];
                        b[var47] = b[var0];
                        a[var47] = a[var0];
                     }
                  }
                  break;
               }

               if (a[var0][var47][0] != null) {
                  var14 = a[var0][var47][0].getWidth();
                  var15 = a[var0][var47][0].getHeight();

                  for(var48 = 0; var48 < c[var0][var47].length; var48 += 7) {
                     if (c[var0][var47][var48 + 1] < 0 || c[var0][var47][var48 + 1] >= var14) {
                        c[var0][var47][var48 + 1] = 0;
                     }

                     if (c[var0][var47][var48 + 2] < 0 || c[var0][var47][var48 + 2] >= var15) {
                        c[var0][var47][var48 + 2] = 0;
                     }

                     if (c[var0][var47][var48 + 1] + c[var0][var47][var48 + 3] > var14) {
                        c[var0][var47][var48 + 3] = 1;
                     }

                     if (c[var0][var47][var48 + 2] + c[var0][var47][var48 + 4] > var15) {
                        c[var0][var47][var48 + 4] = 1;
                     }
                  }
               }

               ++var47;
            }
         } catch (Exception var40) {
            var40.printStackTrace();
            b[var0] = (byte[][][])null;
            return;
         } finally {
            try {
               if (var2 != null) {
                  var2.close();
               }
            } catch (Exception var39) {
            }

         }

      }
   }

   private static final boolean d(int var0, int var1) {
      short var2 = a[var0][var1 * 6 + 0];
      short var3 = a[var0][var1 * 6 + 1];

      for(int var4 = 0; var4 < 8; ++var4) {
         if (var4 != var0 && b[var4] != null) {
            for(int var5 = 0; var5 < a[var4].length; ++var5) {
               if (var2 == a[var4][var5 * 6 + 0] && a[var4][var5 * 6 + 1] == -1 && var3 == -1) {
                  a[var0][var1] = new Image[1];
                  a[var0][var1][0] = a[var4][var5][0];
                  a[var0][var1] = a[var4][var5];
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static final void a(int[] var0, boolean var1) {
      var0[10] |= 65536;
      if (var1) {
         var0[10] |= 131072;
      }

   }

   public static final void g(int[] var0) {
      if ((var0[10] & 65536) != 0) {
         byte var1;
         if ((var1 = (byte)(var0[10] >> 24 & 255)) >= 2) {
            short var2 = (short)(var0[10] & '\uffff');
            short var3 = b[w[var0[4]][1] * 11 + 5];
            int var5 = var2 + 1;
            if (var5 >= var3) {
               if ((var0[10] & 131072) != 0) {
                  var0[10] &= -65536;
                  var0[10] |= 0;
               } else {
                  var0[10] &= -65537;
               }
            } else {
               var0[10] &= -65536;
               var0[10] |= (short)var5 & '\uffff';
            }

            var0[10] &= 16777215;
            var0[10] |= 16777216;
            return;
         }

         int var4 = var1 + 1;
         var0[10] &= 16777215;
         var0[10] |= (byte)var4 << 24 & -16777216;
      }

   }

   public static final void b(int var0, int var1, int var2) {
      int[] var3;
      if (((var3 = b(6, var0))[3] & 2) != 0) {
         a.b(var3);
         var3[0] = (short)var1 & '\uffff' | (short)var2 << 16 & -65536;
         var3[4] = var1 * 4096 + 2048;
         var3[5] = var2 * 4096 + 2048;
         a.a(var3);
      } else {
         var3[0] = (short)var1 & '\uffff' | (short)var2 << 16 & -65536;
         var3[4] = var1 * 4096 + 2048;
         var3[5] = var2 * 4096 + 2048;
      }

      if ((var3[3] & 32) != 0) {
         var3[13] &= -65;
         var3[13] &= -513;
         var3[24] = 0;
         b((short)((var3[2] & -65536) >> 16));
      }

   }

   public static final boolean a(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if ((O[3] & 8388608) == 0 && (short)(O[12] & '\uffff') > 0) {
         boolean var6 = false;
         int var7 = t.length;

         while(true) {
            int[] var8;
            boolean var9;
            do {
               --var7;
               if (var7 < 0) {
                  return var6;
               }

               var8 = t[var7];
               var9 = false;
               if (var8[0] == 13) {
                  var9 = var8[0] == var0 && (var1 < var8[2] || var1 > var8[3] || var2 < var8[4] || var2 > var8[5]) && var3 >= var8[2] && var3 <= var8[3] && var4 >= var8[4] && var4 <= var8[5] && var8[1] == 1;
               } else if (var8[0] == 8) {
                  var9 = var8[0] == var0 && var1 >= var8[2] && var1 <= var8[3] && var2 >= var8[4] && var2 <= var8[5] && (var3 < var8[2] || var3 > var8[3] || var4 < var8[4] || var4 > var8[5]) && var8[1] == 1;
               } else if (var8[0] == 18) {
                  var9 = var8[0] == var0 && var1 >= var8[2] && var1 <= var8[3] && var2 >= var8[4] && var2 <= var8[5] && var8[1] == 1;
               } else {
                  var9 = var8[0] == var0 && var8[2] == var1 && var8[3] == var2 && var8[4] == var3 && var8[1] == 1;
               }
            } while(!var9);

            int[] var10 = null;
            int var11 = -1;
            int var12 = 4;

            while(true) {
               --var12;
               if (var12 < 0) {
                  break;
               }

               if (k[var12][0] == 0) {
                  var10 = k[var12];
                  var11 = var12;
                  break;
               }
            }

            if (var10 == null) {
               return var6;
            }

            var10[0] = 1;
            var10[1] = var7;
            var10[2] = var8[6];
            var10[3] = 0;
            var10[4] = 0;
            var10[9] = 16;
            if (var5) {
               g(var10, var11);
            }

            var6 = true;
         }
      } else {
         return false;
      }
   }

   public static final void J() {
      if (t != null && t.length > 0) {
         int var0 = 4;

         while(true) {
            --var0;
            if (var0 < 0) {
               break;
            }

            int[] var1;
            if ((var1 = k[var0])[0] != 0) {
               g(var1, var0);
            }
         }
      }

   }

   public static final void g(int[] var0, int var1) {
      int[] var2 = t[var0[1]];
      byte[] var3 = b[var0[2]];
      int var4 = var0[3];
      int var5 = var0[4];
      int var6 = var0[5];
      int var7 = var0[6];
      int var8 = var0[7];
      int var9 = var0[8];
      int var10 = var0[9];
      boolean var11 = false;
      boolean var12 = false;

      do {
         if (var0[0] == 2) {
            return;
         }

         if (var5 == 0) {
            if (var4 >= var3.length) {
               var11 = true;
               break;
            }

            switch(var5 = var3[var4++]) {
            case 1:
            case 4:
            case 5:
            case 33:
            case 46:
            case 72:
            case 73:
               var6 = var3[var4++];
               break;
            case 2:
               var6 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var7 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var8 = var3[var4++];
            case 3:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 52:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 70:
            case 71:
            case 76:
            case 77:
            case 78:
            case 79:
            default:
               break;
            case 17:
            case 18:
            case 19:
            case 27:
               var6 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 20:
            case 21:
            case 22:
               var6 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var7 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 34:
            case 35:
               var6 = var3[var4++];
               var7 = var3[var4++];
               break;
            case 36:
            case 37:
            case 38:
               var6 = var3[var4++];
               var7 = var3[var4++];
               break;
            case 39:
               var6 = var3[var4++];
               var7 = var3[var4++];
               break;
            case 40:
               var6 = var3[var4++];
               var7 = var3[var4++];
               break;
            case 41:
            case 45:
               var6 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var7 = var3[var4++];
               var8 = var3[var4++];
               break;
            case 42:
            case 43:
            case 74:
               var6 = var3[var4++];
               var7 = var3[var4++];
               var8 = var3[var4++];
               break;
            case 44:
               var6 = var3[var4++];
               var7 = var3[var4++];
               var8 = var3[var4++];
               var9 = var3[var4++];
               break;
            case 47:
            case 66:
            case 67:
               var6 = var3[var4++];
               var7 = var3[var4++];
               break;
            case 48:
               var6 = var3[var4++];
               break;
            case 49:
               var6 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 50:
               var6 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var7 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 51:
               var6 = var3[var4++];
               var7 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 53:
               var6 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 54:
               af = var4 - 1;
               var6 = var3[var4++];
               var7 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var8 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 55:
               var6 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var7 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var8 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 64:
            case 65:
               var6 = var3[var4++];
               var7 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               break;
            case 68:
            case 69:
               var6 = var3[var4++];
               var7 = var3[var4++];
               var8 = var3[var4++];
               break;
            case 75:
               var6 = var3[var4++];
               var7 = (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var8 = var3[var4++];
               var9 = var3[var4++];
               break;
            case 80:
               var6 = var3[var4++];
               var7 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var8 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
               var9 = var3[var4++];
               break;
            case 81:
               var6 = var3[var4++];
               var7 = var3[var4++] << 16 & 16711680 | (short)(var3[var4++] << 8 & '\uff00' | var3[var4++] & 255);
            }
         }

         boolean var13;
         var13 = true;
         int var15;
         int[] var16;
         int var19;
         int var20;
         int var21;
         int[] var33;
         int[] var39;
         label427:
         switch(var5) {
         case 1:
            --var6;
            if (var6 >= 0) {
               var13 = false;
               var12 = true;
               o = true;
            }
            break;
         case 2:
            c(var1, 0, 0);
            var0[0] = 2;
            if (var8 == 1) {
               b(var6, var7, 103, 104);
            } else {
               b(var6, var7, 105, 105);
            }

            var12 = true;
            break;
         case 3:
            var2[1] = 0;
            break;
         case 4:
            t[var6][1] = 0;
            break;
         case 5:
            t[var6][1] = 1;
         case 6:
         case 7:
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 24:
         case 25:
         case 28:
         case 29:
         case 30:
         case 31:
         case 32:
         case 56:
         case 57:
         case 58:
         case 59:
         case 60:
         case 61:
         case 62:
         case 63:
         case 77:
         case 78:
         case 79:
         default:
            break;
         case 17:
            var4 = var6;
            break;
         case 18:
            --var10;
            if (var0[var10] != 0) {
               var4 = var6;
            }
            break;
         case 19:
            --var10;
            if (var0[var10] == 0) {
               var4 = var6;
            }
            break;
         case 20:
            --var10;
            if (var0[var10] < var6) {
               var4 = var7;
            }
            break;
         case 21:
            --var10;
            if (var0[var10] > var6) {
               var4 = var7;
            }
            break;
         case 22:
            --var10;
            if (var0[var10] == var6) {
               var4 = var7;
            }
            break;
         case 23:
            --var10;
            if (var0[var10] != var6) {
               var4 = var7;
            }
            break;
         case 26:
            --var10;
            var6 = var0[var10];
         case 27:
            --var10;
            var7 = var0[var10];
            byte var31 = 0;
            if (var7 > var6) {
               var31 = 1;
            } else if (var7 < var6) {
               var31 = -1;
            }

            var0[var10++] = var31;
            break;
         case 33:
            switch(var6) {
            case 0:
               var0[var10++] = h;
               break label427;
            case 1:
               var0[var10++] = B;
               break label427;
            case 2:
               var0[var10++] = N;
               break label427;
            case 3:
               var0[var10++] = ai;
               break label427;
            case 4:
               var0[var10++] = A;
            default:
               break label427;
            }
         case 34:
            switch(var6) {
            case 0:
               h = var7;
               break label427;
            case 1:
               B = var7;
               break label427;
            case 2:
               N = var7;
               break label427;
            case 3:
               ai = var7;
               break label427;
            case 4:
               A = var7;
            default:
               break label427;
            }
         case 35:
            switch(var6) {
            case 0:
               h += var7;
               break label427;
            case 1:
               B += var7;
               break label427;
            case 2:
               N += var7;
               break label427;
            case 3:
               ai += var7;
               break label427;
            case 4:
               A += var7;
            default:
               break label427;
            }
         case 36:
            if ((k[var6] & 1 << var7) != 0) {
               var0[var10++] = 1;
            } else {
               var0[var10++] = 0;
            }
            break;
         case 37:
            var39 = k;
            var39[var6] |= 1 << var7;
            break;
         case 38:
            var39 = k;
            var39[var6] &= ~(1 << var7);
            break;
         case 39:
            var33 = a(var16 = b(var6, var7));
            boolean var35 = true;
            if (var33 != null && O[11] >= 0) {
               var19 = var16[3];
               var20 = O[11];
               short var38 = (short)((var16[2] & -65536) >> 16);
               if ((var19 & 128) != 0 && (x[var20] & 1 << var38) != 0 || (var19 & 64) != 0 && (K[var20] & 1 << var38) != 0 || (var19 & 32) != 0 && (J[var20] & 1 << var38) != 0 || (var19 & 256) != 0 && (B[var20] & 1 << var38) != 0 || (var19 & 512) != 0 && (u[var20] & 1 << var38) != 0 || (var19 & 1024) != 0 && (E[var20] & 1 << var38) != 0 || (var19 & 8192) != 0 && (s[var20] & 1 << var38) != 0) {
                  var35 = false;
               }
            }

            if (var35) {
               var16[3] &= -65537;
               if ((var16[3] & 2) == 0) {
                  a.a(var16);
               }
            }

            if ((var16[3] & 32) != 0 && !j((short)((var16[2] & -65536) >> 16))) {
               ++e;
               if (HG.b(2) != 0) {
                  HG.h();
                  HG.m(2);
               }
            }
            break;
         case 40:
            var39 = var16 = b(var6, var7);
            var39[3] |= 65536;
            if ((var16[3] & 2) != 0) {
               a.b(var16);
            }

            if ((var16[3] & 32) != 0 && !j((short)((var16[2] & -65536) >> 16))) {
               --e;
               if (e <= 0 && HG.b(ab) != 0) {
                  HG.h();
                  HG.m(ab);
               }
            }
            break;
         case 41:
            c(var6, var7, var8);
            String var29 = null;
            boolean var30 = false;
            if (O[11] == -1) {
               var29 = HG.a((int)85) + " " + HG.a((int)86);
               if (a.n == 2) {
                  var15 = 435;
               } else {
                  var15 = 436;
               }
            } else if (O[11] <= var6) {
               var29 = HG.a((int)84);
               var15 = 315 + var6;
            } else {
               var29 = HG.a((int)85);
               var15 = 315 + O[11];
            }

            a(var29, HG.a(var15), 100, 101);
            var0[0] = 2;
            V = var0;
            g = var1;
            var12 = true;
            break;
         case 43:
            b(var6, var7, var8);
            break;
         case 44:
            var16 = b(var8, var9);
            if (((var33 = b(var6, var7))[3] & 2) != 0) {
               a.a(var33, (short)(var16[0] & '\uffff'), (short)((var16[0] & -65536) >> 16));
            } else {
               var33[0] = (short)(var16[0] & '\uffff') & '\uffff' | (short)((var16[0] & -65536) >> 16) << 16 & -65536;
            }
            break;
         case 45:
            a(10, 0, 0, 0, 0, true);
            a.a(HG.a, var6, var7, var8, false);
            (new Thread(a)).start();
            var11 = true;
            break;
         case 46:
            O[30] = var6;
            a.d = var6;
            break;
         case 47:
            int[] var14;
            if (((var14 = b(var6, var7))[3] & 4096) != 0 && (byte)(var14[8] & 255) == 5) {
               var15 = a.b();
               byte var32 = (byte)(var14[8] >> 8 & 255);
               var15 = var15 | 1 << var32 | 1 << var32 + 1;
               a(var14, false);
               var14[3] |= 32768;
               b(var14, true);
               n = true;
               a.a(var15);
               c((short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
            }
            break;
         case 48:
            var39 = q[var6];
            var39[12] &= -65536;
            var39 = q[var6];
            var39[12] |= 65535;
            break;
         case 49:
            f(var6);
            break;
         case 50:
            a(var6, var7, var0);
            o = false;
            var12 = true;
            break;
         case 51:
            if (ax == var6) {
               var4 = var7;
            }
            break;
         case 52:
            HG.G = a.a();
            HG.a.removeAllElements();
            HG.g(21);
            HG.l = true;
            break;
         case 53:
            n = var6;
            break;
         case 54:
            at = var6;
            v = var7;
            ao = var8;
            int var34 = a(at, true);
            byte var36 = 1;
            byte var37 = 1;
            if (at == 2 || at == 3) {
               var37 = 2;
            }

            var21 = 0;
            if (at == 2) {
               var21 = 50 + O[18] * 10;
            }

            if (var34 - var21 >= 80 * var37) {
               var36 = 4;
            } else if (var34 - var21 >= 65 * var37) {
               var36 = 3;
            } else if (var34 - var21 >= 50 * var37) {
               var36 = 2;
            }

            aa = var36;
            if (O[19] < var36) {
               if (w) {
                  ar = 0;
               } else {
                  ar = 1;
               }
            } else {
               int var22 = 0;
               if (ao > 0) {
                  if (v > 0) {
                     var22 = a(2, v);
                  } else {
                     var22 = O[46];
                  }

                  if (var22 < ao) {
                     if (w) {
                        ar = 0;
                     } else {
                        ar = 2;
                     }
                     break;
                  }
               }

               String var23 = "";
               if (ao > 0) {
                  var23 = HG.a(r[v][0]);
               }

               int var24 = 1;
               m = 0;

               for(int var25 = 0; var25 < 3; ++var25) {
                  int var26 = var24 * var36;
                  int var27 = var24 * ao * var36;
                  if (O[19] < var26 || var22 < var27) {
                     break;
                  }

                  String var28 = HG.a(at + 29) + " +" + var24 * var37 + "\n(LP: " + var26;
                  if (ao > 0) {
                     var28 = var28 + " " + var23 + ": " + var27;
                  }

                  a(var28 + " )");
                  ++m;
                  if (var24 == 1) {
                     var24 = 5;
                  } else {
                     var24 += 5;
                  }
               }

               f(83);
               a(al, 471, var0);
               if (w) {
                  a(al, 472, var0);
               }

               var12 = true;
            }
            break;
         case 55:
            if (ax < m && ar == -1) {
               byte var18 = 1;
               if (at == 2 || at == 3) {
                  var18 = 2;
               }

               var19 = 1;

               for(var20 = 0; var20 < ax; ++var20) {
                  if (var19 == 1) {
                     var19 = 5;
                  } else {
                     var19 += 5;
                  }
               }

               var20 = var19 * aa;
               var21 = var19 * ao * aa;
               a(at, var19 * var18, true, false, O);
               a(24, -var20, true, false, O);
               if (ao > 0) {
                  if (v > 0) {
                     a((short)v & '\uffff' | 131072, var21);
                  } else {
                     k(-var21);
                  }
               }

               w = true;
            }

            if (ar == 1) {
               var4 = var7;
               w = false;
            } else if (ar == 2) {
               var4 = var8;
               w = false;
            } else if (ax < m && ar != 0) {
               var4 = af;
            } else {
               var4 = var6;
               w = false;
            }

            ar = -1;
            at = -1;
            v = -1;
            ao = 0;
            break;
         case 64:
            a(var6, var7, true, false, O);
            break;
         case 65:
            a(var6, var7, false, false, O);
            break;
         case 66:
            var16 = b(var6, var7);
            if (b(var6, var16)) {
               var16[3] &= -65537;
               c(var6, var16);
            } else {
               a(HG.a((int)227), HG.a((int)230), 101, 106);
               var16[3] &= -65537;
               a.a(var16, (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
            }
            break;
         case 67:
            var16 = b(var6, var7);
            if (b(var6, var16)) {
               var0[var10++] = 1;
            } else {
               var0[var10++] = 0;
            }
            break;
         case 68:
            if (a(var6, var7) >= var8) {
               var0[var10++] = 1;
            } else {
               var0[var10++] = 0;
            }
            break;
         case 69:
            a((short)var7 & '\uffff' | (short)var6 << 16 & -65536, var8);
            break;
         case 70:
            if (O[42] >= 0) {
               var0[var10++] = 1;
            } else {
               var0[var10++] = 0;
            }
            break;
         case 71:
            if (O[41] >= 0) {
               var0[var10++] = 1;
            } else {
               var0[var10++] = 0;
            }
            break;
         case 72:
            var0[var10++] = a(var6, false);
            break;
         case 73:
            HG.m(var6);
            break;
         case 74:
            if (M != null) {
               var39 = q[var6];
               var39[13] |= 131072;
               var39 = q[var6];
               var39[20] &= -65536;
               var39 = q[var6];
               var39[20] |= 65535;
            } else {
               b(var6, var7, var8);
               a(14, var6, var7, var8, 0, false);
            }
         case 42:
            if (M != null) {
               q[var6][22] = (short)(var7 * 2) & '\uffff' | (short)(var8 * 2) << 16 & -65536;
               var39 = q[var6];
               var39[13] |= 65536;
            } else {
               b(var6, var7, var8);
               a(14, var6, var7, var8, 0, false);
            }
            break;
         case 75:
            if (P != var6) {
               f(10, -2, 0);
            }

            P = var6;
            av = var7;
            W = var8;
            au = var9;
            break;
         case 76:
            p = true;
            HG.a.removeAllElements();
            HG.l = false;
            HG.v = 0;
            HG.j = -1;
            break;
         case 80:
            s[var6][1] = var7;
            int var17;
            if ((var17 = var8 - var7) > s[var6][2]) {
               s[var6][2] = var17;
            }

            if ((short)(s[var6][0] & '\uffff') == 0) {
               var39 = s[var6];
               var39[0] &= -65536;
               var39 = s[var6];
               var39[0] |= 1;
            }

            var39 = s[var6];
            var39[0] &= 65535;
            var39 = s[var6];
            var39[0] |= (short)var9 << 16 & -65536;
            break;
         case 81:
            var39 = s[var6];
            var39[0] &= -65536;
            var39 = s[var6];
            var39[0] |= 2;
            if (var7 > s[var6][2]) {
               s[var6][2] = var7 - s[var6][1];
            }
         }

         if (var13) {
            var5 = 0;
         }
      } while(!var12 && !var11);

      if (var11) {
         var0[0] = 0;
         n = -1;
         o = true;
         p = false;
      } else {
         var0[3] = var4;
         var0[4] = var5;
         var0[5] = var6;
         var0[6] = var7;
      }
   }

   public static final int f(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(O[14] & '\uffff');
      } else if ((var0[3] & 32) != 0) {
         int var1 = var0[11];
         return a[var1][7];
      } else {
         return 0;
      }
   }

   public static final int m(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(O[15] & '\uffff');
      } else if ((var0[3] & 32) != 0) {
         int var1 = var0[11];
         return a[var1][8];
      } else {
         return 0;
      }
   }

   public static final int i(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(O[26] & '\uffff');
      } else {
         return (var0[3] & 32) != 0 ? 0 : 0;
      }
   }

   public static final int a(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         switch(var0) {
         case 0:
            return (short)(O[20] & '\uffff') + O[51];
         case 1:
            return (short)(O[21] & '\uffff') + O[51];
         case 2:
            return (short)(O[22] & '\uffff') + O[51];
         case 3:
            return (short)(O[23] & '\uffff') + O[51];
         case 4:
            return (short)(O[24] & '\uffff') + O[51];
         case 5:
            return 10 + O[51];
         }
      }

      if ((var1[3] & 32) != 0) {
         int var2 = var1[11];
         switch(var0) {
         case 0:
            return a[var2][17];
         case 1:
            return a[var2][18];
         case 2:
            return a[var2][19];
         case 3:
            return a[var2][20];
         case 4:
            return 0;
         case 5:
            return 10;
         }
      }

      return 0;
   }

   public static final int b(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         switch(var0) {
         case 0:
         case 1:
         case 5:
            return O[27];
         case 2:
         case 3:
            return O[28];
         case 4:
            return O[29];
         }
      }

      if ((var1[3] & 32) != 0) {
         int var2 = var1[11];
         int var3 = 0;
         switch(var0) {
         case 0:
         case 1:
         case 5:
            if (var1[16] != -1) {
               var3 = p[n[var1[16]][4]][11];
            }

            return a[var2][14] + var3;
         case 2:
         case 3:
            if (var1[16] != -1) {
               var3 = p[n[var1[16]][4]][12];
            }

            return a[var2][15] + var3;
         case 4:
            if (var1[16] != -1) {
               var3 = p[n[var1[16]][4]][13];
            }

            return a[var2][16] + var3;
         }
      }

      return 0;
   }

   public static final boolean a(int var0, int[] var1, int[] var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      int var6;
      if ((var1[3] & 16) != 0) {
         int var7 = var6 = (short)(var1[12] & '\uffff');
         if (!v) {
            var6 -= var0;
            var1[12] &= -65536;
            var1[12] |= (short)var6 & '\uffff';
         }

         if (var7 > 0 && var6 <= 0) {
            var3 = true;
         }
      }

      if ((var1[3] & 32) != 0) {
         short var8;
         short var9 = var8 = (short)(var1[12] & '\uffff');
         var6 = var8 - var0;
         var1[12] &= -65536;
         var1[12] |= (short)var6 & '\uffff';
         if (var9 > 0 && var6 <= 0) {
            var3 = true;
         }

         var1[13] &= -9;
         d(ac);
      }

      if (var2 != null && var3 && (var2[3] & 16) != 0 && (var1[3] & 32) != 0) {
         int[] var10 = a(var1);
         a(25, var10[12], true, false, O);
      }

      return var3;
   }

   public static final int c(int var0, int var1, int var2) {
      int var3 = var0 + var1 + (var2 << 1);
      int var4 = 0 * var3;
      return ((var3 *= 100) + var4) / 200;
   }

   public static final int a(int var0, int var1, int var2) {
      int var3 = var0 + var1 + (var2 << 1);
      int var4 = -20 * var3;
      return ((var3 *= 100) + var4) / 200;
   }

   public static final int a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!a(var2, var1)) {
         return 0;
      } else {
         int var8 = a(var0, var2, var6);
         int var9 = c(var0, var2, var6);
         int var10 = HG.b(var8, var9);
         if (var7) {
            var10 = var10 + O[48] + O[49] + O[50];
         }

         var10 -= var4;
         if (var7 && a(var5 + var3, var0, var1, var2)) {
            if ((var10 <<= 1) < 10) {
               var10 = 10;
            }

            if (HG.b(3)) {
               Display.getDisplay(a).vibrate(500);
            }
         }

         if (var10 < 1) {
            var10 = 1;
         }

         return var10;
      }
   }

   public static final int b(int var0, int var1, int var2) {
      int var3;
      if ((var3 = (var2 << 1) + var2 + var0 + var1) < 1) {
         var3 = 1;
      }

      int var4;
      return var4 = 5000 / var3;
   }

   public static final int a(int var0, int var1, int var2, int var3) {
      return (var0 * 30 + var1 * 2 + var2 * 2 + var3 * 3) / 30;
   }

   public static final boolean a(int var0, int var1, int var2, int var3) {
      return a(var0, var1, var2, var3) > HG.e(100);
   }

   public static final int c(int var0, int var1) {
      return 200 + (var0 << 1) + var1 >> 2;
   }

   public static final boolean a(int var0, int var1) {
      return c(var0, var1) > HG.e(100);
   }

   public static final int a(int[] var0, int[] var1, int[] var2) {
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      int[] var9 = null;
      int var15;
      int var16;
      int var17;
      int var18;
      int var19;
      if (var2 == null) {
         if ((var0[3] & 32) != 0) {
            var15 = a[var0[11]][29];
         } else {
            var15 = 1024;
         }

         var17 = 2;
         var16 = 0;
         var18 = 100;
         var19 = 5;
      } else {
         var9 = a(var2);
         var15 = k(var2);
         var17 = n(var2);
         var16 = o(var2);
         var18 = v(var2);
         var19 = l(var2);
      }

      int var10 = b(m(var0), -1, var18);
      if ((var0[3] & 16) != 0 && (var10 -= O[47]) < 10) {
         var10 = 10;
      }

      if (a.a(var0, var1, var15)) {
         int var20 = a(var19, var0);
         int var11 = b(var19, var1);
         boolean var12 = (var0[3] & 16) != 0;
         int var13 = a(f(var0), m(var0), var20, i(var0), var11, var16, var17, var12);
         if (var19 != 2 && var19 != 3) {
            if ((var0[3] & 16) != 0) {
               if (var13 > 0) {
                  HG.m(18);
               } else {
                  HG.m(19);
               }
            } else if ((var1[3] & 16) != 0 && var13 > 0) {
               HG.m(22);
            }

            if ((var1[3] & 32) != 0 && ((short)(var1[20] & '\uffff') == -1 || (short)(var1[26] & '\uffff') < 3)) {
               short var21 = (short)(var0[2] & '\uffff');
               var1[20] &= -65536;
               var1[20] |= (short)var21 & '\uffff';
               var1[22] = b(var0);
               var1[26] = 10;
               if ((a[var1[11]][13] & 128) != 0) {
                  a((short)((var1[2] & -65536) >> 16), true);
               }
            }

            a(var13, var1, var0);
            if (var13 > 0) {
               if (a(var2, var9, 8) != 0) {
                  b(var1[4], a.c(var1) + 1, 4096, 0, 0, 512);
               }

               if (a(var2, var9, 7) != 0) {
                  a(var1[4], a.c(var1) + 1, 4096, 0, 0, 2048);
               }
            }
         } else {
            int var14 = 0;
            if (a(var2, var9, 8) != 0) {
               var14 = 2;
            }

            if (a(var2, var9, 7) != 0) {
               var14 ^= 1;
            }

            switch(var19) {
            case 2:
               a(var0, var1, k(var2), 0, var13, var14);
               break;
            case 3:
               a(var0, var1, k(var2), 1, var13, var14);
            }
         }
      }

      return var10;
   }

   public static final int k(int[] var0) {
      if (var0 == null) {
         return 1024;
      } else {
         int var1 = var0[4];
         return e[var1][13];
      }
   }

   public static final int n(int[] var0) {
      if (var0 == null) {
         return 2;
      } else {
         int var1 = var0[4];
         return e[var1][11];
      }
   }

   public static final int a(int[] var0, int[] var1, int var2) {
      int var3 = 0;
      if (var0 != null && var1 != null) {
         int[] var4 = a(var0, var1);

         for(int var5 = 0; var5 < var4.length; ++var5) {
            short var6 = (short)(var4[var5] & '\uffff');
            short var7 = (short)((var4[var5] & -65536) >> 16);
            if (var6 == var2) {
               var3 += var7;
            }
         }

         return var3;
      } else {
         return 0;
      }
   }

   public static final int o(int[] var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = var0[4];
         return e[var1][14];
      }
   }

   public static final int v(int[] var0) {
      if (var0 == null) {
         return 100;
      } else {
         int var1 = var0[4];
         return e[var1][12];
      }
   }

   public static final int l(int[] var0) {
      if (var0 == null) {
         return 5;
      } else {
         int var1 = var0[4];
         return e[var1][15];
      }
   }

   public static final int[] a(int[] var0, int[] var1) {
      int var2;
      for(var2 = 0; var2 < G.length; ++var2) {
         G[var2] = -1;
      }

      for(var2 = 0; var2 < 2; ++var2) {
         if (var0[6 + var2] != -1) {
            int var3 = g[(short)((var0[6 + var2] & -65536) >> 16)][3];
            G[var2] = (short)var3 & '\uffff' | (short)(var0[6 + var2] & '\uffff') << 16 & -65536;
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         G[2 + var2] = var1[5 + var2];
      }

      return G;
   }

   public static final void m() {
      j = new int[1 + q.length][15];

      for(int var0 = 0; var0 < j.length; ++var0) {
         for(int var1 = 0; var1 < j[var0].length; ++var1) {
            j[var0][var1] = -1;
         }

         j[var0][0] = -1;
         j[var0][4] = -1;
         j[var0][5] = -1;
         j[var0][3] = 65536;
      }

   }

   public static final void D() {
      j = (int[][])null;
   }

   public static final void a(int[] var0, int[] var1, int var2, int var3, int var4, int var5) {
      short var6 = (short)(var0[2] & '\uffff');
      j[var6][0] = var0[0];
      j[var6][4] = var0[4];
      j[var6][5] = var0[5];
      j[var6][6] = var0[4];
      j[var6][7] = var0[5];
      j[var6][9] = var0[4];
      j[var6][10] = var0[5];
      j[var6][11] = (short)(var0[2] & '\uffff') & '\uffff' | (short)(var1[2] & '\uffff') << 16 & -65536;
      j[var6][12] = 0 | (short)var4 << 16 & -65536;
      int var7 = var0[4] - var1[4];
      int var8 = var0[5] - var1[5];
      int var9;
      int var10;
      if (var7 <= 32767 && var7 >= -32768 && var8 <= 32767 && var8 >= -32768) {
         var10 = g(var7 * var7 + var8 * var8);
         var9 = 10 * var10 / (var2 + 1) + 1;
      } else {
         var9 = 10;
      }

      j[var6][13] = (short)var9 & '\uffff' | (short)var9 << 16 & -65536;
      j[var6][8] = (short)T[var3 * 7 + 5] & '\uffff' | (short)T[var3 * 7 + 5] << 16 & -65536;
      j[var6][14] = (short)var3 & '\uffff' | (short)var5 << 16 & -65536;
      int[] var10000 = j[var6];
      var10000[3] &= -65537;
      a.a(j[var6]);
      if ((var0[3] & 16) != 0) {
         short var11;
         int var12;
         if ((var10 = l(a())) == 2) {
            var11 = (short)(O[53] & '\uffff');
            var12 = var11 - 1;
            var10000 = O;
            var10000[53] &= -65536;
            var10000 = O;
            var10000[53] |= (short)var12 & '\uffff';
            return;
         }

         if (var10 == 3) {
            var11 = (short)((O[53] & -65536) >> 16);
            var12 = var11 - 1;
            var10000 = O;
            var10000[53] &= 65535;
            var10000 = O;
            var10000[53] |= (short)var12 << 16 & -65536;
         }
      }

   }

   private static final void h(int[] var0, int var1) {
      int[] var2 = a.c[(short)(var0[11] & '\uffff')];
      int[] var3 = null;
      if (var1 == -1) {
         HG.m(21);
      } else {
         if ((var2[3] & 16) != 0) {
            if ((short)((var0[12] & -65536) >> 16) > 0) {
               HG.m(20);
            } else {
               HG.m(21);
            }
         } else if ((a.c[var1][3] & 16) != 0 && (short)((var0[12] & -65536) >> 16) > 0) {
            HG.m(22);
         }

         if ((a.c[var1][3] & 32) != 0 && ((short)(a.c[var1][20] & '\uffff') == -1 || (short)(a.c[var1][26] & '\uffff') < 3)) {
            short var4 = (short)(var2[2] & '\uffff');
            int[] var10000 = a.c[var1];
            var10000[20] &= -65536;
            var10000 = a.c[var1];
            var10000[20] |= (short)var4 & '\uffff';
            a.c[var1][22] = b(var2);
            a.c[var1][26] = 10;
            if ((a[a.c[var1][11]][13] & 128) != 0) {
               a((short)((a.c[var1][2] & -65536) >> 16), true);
            }
         }
      }

      int var5;
      if (var1 != -1 && ((a.c[var1][3] & 16) != 0 || (a.c[var1][3] & 32) != 0)) {
         a.b(var3 = a.c[var1], o);
         int var6 = var0[4] - var0[6];
         var5 = var0[5] - var0[7];
         var0[6] = o[0];
         var0[7] = o[1];
         var0[4] = var0[6] + var6;
         var0[5] = var0[7] + var5;
      }

      boolean var7 = false;
      if (var3 != null) {
         var7 = a((short)((var0[12] & -65536) >> 16), var3, var2);
      }

      if ((var2[3] & 16) != 0) {
         d(ac);
      }

      var5 = (short)(var0[8] & '\uffff') - (short)((var0[8] & -65536) >> 16);
      if (var7 || (short)((var0[12] & -65536) >> 16) == 0) {
         var0[8] = (short)var5 & '\uffff' | 0;
      }

      var0[3] |= 65536;
      a.b(var0);
   }

   public static final void v() {
      for(int var0 = 0; var0 < j.length; ++var0) {
         if ((j[var0][3] & 65536) == 0) {
            short var1 = (short)(j[var0][14] & '\uffff');
            Object var2 = null;
            int[] var3 = a.c[(short)((j[var0][11] & -65536) >> 16)];
            short var4 = (short)((j[var0][13] & -65536) >> 16);
            short var5 = (short)(j[var0][13] & '\uffff');
            int var16 = var5 - 1;
            if (var16 == 0) {
               h(j[var0], (short)((j[var0][11] & -65536) >> 16));
            } else {
               int[] var10000 = j[var0];
               var10000[13] &= -65536;
               var10000 = j[var0];
               var10000[13] |= (short)var16 & '\uffff';
               int var6 = j[var0][9] - var3[4];
               int var7 = j[var0][10] - var3[5];
               int var8;
               if ((var8 = g(var6 * var6 + var7 * var7)) == 0) {
                  var10000 = j[var0];
                  var10000[3] |= 65536;
                  a.b(j[var0]);
               } else {
                  int var9 = j[var0][6];
                  int var10 = j[var0][7];
                  j[var0][6] = var6 * var16 / var4 + var3[4];
                  j[var0][7] = var7 * var16 / var4 + var3[5];
                  int var11;
                  if ((var11 = a.a(var9, var10, j[var0][6], j[var0][7], 4144, h, true)) != -2 && var11 != (short)(j[var0][11] & '\uffff')) {
                     if (var11 == -1) {
                        h(j[var0], -1);
                     } else {
                        h(j[var0], var11);
                     }
                  } else {
                     j[var0][4] = j[var0][6] + var6 * T[var1 * 7 + 4] / var8;
                     j[var0][5] = j[var0][7] + var7 * T[var1 * 7 + 4] / var8;
                     short var12;
                     int var13 = (var12 = (short)((j[var0][8] & -65536) >> 16)) + T[var1 * 7 + 6] * (var16 - (var4 >> 1));
                     j[var0][8] = (short)var12 & '\uffff' | (short)var13 << 16 & -65536;
                     a.b(j[var0]);
                     int var14 = j[var0][4] >> 12;
                     int var15 = j[var0][5] >> 12;
                     j[var0][0] = (short)var14 & '\uffff' | (short)var15 << 16 & -65536;
                     a.a(j[var0]);
                  }
               }
            }
         }
      }

   }

   public static final void c(int[] var0, Graphics var1) {
      switch((short)(var0[14] & '\uffff')) {
      case 0:
         a(var0[4], var0[5], var0[6], var0[7], var0[8], var1);
         return;
      case 1:
         b(var0[4], var0[5], var0[6], var0[7], var0[8], var1);
      default:
      }
   }

   public static final void b(int var0, int var1, int var2, int var3, int var4, Graphics var5) {
      int var6 = (var0 * a.g >> 12) - q;
      int var7 = (var1 * a.g >> 12) - c;
      int var8 = (var2 * a.g >> 12) - q;
      int var9 = (var3 * a.g >> 12) - c;
      var5.setColor(T[8]);
      var5.drawLine(var6, var7, var8, var9);
      short var10 = (short)(var4 & '\uffff');
      short var11 = (short)((var4 & -65536) >> 16);
      var7 -= var10 * a.g >> 12;
      var9 -= var11 * a.g >> 12;
      var5.setColor(T[7]);
      var5.drawLine(var6, var7, var8, var9);
      if (a(var6 - var8) > a(a(var7 - var9))) {
         var5.drawLine(var6, var7 + 1, var8, var9 + 1);
      } else {
         var5.drawLine(var6 + 1, var7, var8 + 1, var9);
      }
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, Graphics var5) {
      int var6 = (var0 * a.g >> 12) - q;
      int var7 = (var1 * a.g >> 12) - c;
      int var8 = (var2 * a.g >> 12) - q;
      int var9 = (var3 * a.g >> 12) - c;
      var5.setColor(T[1]);
      var5.drawLine(var6, var7, var8, var9);
      short var10 = (short)(var4 & '\uffff');
      short var11 = (short)((var4 & -65536) >> 16);
      var7 -= var10 * a.g >> 12;
      var9 -= var11 * a.g >> 12;
      var5.setColor(T[0]);
      var5.drawLine(var6, var7, var8, var9);
      int var12 = (var6 * 26 + var8 * 6) / 32;
      int var13 = (var7 * 26 + var9 * 6) / 32;
      int var14 = (var6 * 28 + var8 * 4) / 32;
      int var15 = (var7 * 28 + var9 * 4) / 32;
      int var16 = (var6 * 30 + var8 * 2) / 32;
      int var17 = (var7 * 30 + var9 * 2) / 32;
      int var18 = (var6 * 2 + var8 * 30) / 32;
      int var19 = (var7 * 2 + var9 * 30) / 32;
      var5.setColor(T[2]);
      var5.drawLine(var18, var19, var8, var9);
      var5.setColor(T[3]);
      var5.drawLine(var12, var13, var14, var15);
      var5.drawLine(var16, var17, var6, var7);
   }

   public static final void c(int var0, int var1, int var2) {
      M = var0;
      Q = var1;
      ae = var2;
   }

   public static final void a(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      a(var0, var1, var2, var3);
      A = true;
      ap = var4;
      J = var5;
      L = ap;
      b = "";
      U = var6;

      for(int var7 = 0; var7 < c.length; ++var7) {
         if (c[var7].indexOf("@1") >= 0) {
            S = var7;
         } else if (c[var7].indexOf("@x") >= 0) {
            aw = var7;
         }
      }

   }

   public static final void a(String var0, String var1, int var2, int var3) {
      A = false;
      aw = -1;
      S = -1;
      Font var4 = a[2];
      c = HG.a(var0, var4, aA - 5 - 5, 0);
      h = var1;
      int var5;
      if ((var5 = a[2].getHeight() * c.length + 4) < l >> 2) {
         var5 = l >> 2;
      } else if (var5 > l * 2 / 3) {
         var5 = l * 2 / 3;
      }

      int var6 = a[2].getHeight() + 3;
      a = var5 + var6 + b[1486] + 3 + 2;
      j = l - a >> 1;
      c(8, 5, j + 2, aA - 5 - 5, var6 + 5, 532);
      c(7, 5, j + var6 + 2, aA - 5 - 5, var5 + 5, 33);
      f(8, -2, 0);
      K = var2;
      az = var3;
      t = true;
   }

   public static final void b(int var0, int var1, int var2, int var3) {
      a(HG.a(var0), HG.a(var1), var2, var3);
   }

   public static final void g(Graphics var0) {
      int var1 = b[1486] + 5;
      int var2 = a[2].getHeight() + 3;
      var0.setColor(m[6]);
      var0.fillRect(0, j, aA, a);
      var0.setColor(m[3]);
      var0.fillRect(3, j + var2 + 2, aA - 6, a - (var1 + var2) - 2);
      var0.fillRect(3, j + a + 2 - var1, aA - 6, var1 - 5);
      var0.setColor(m[8]);
      var0.fillRect(3, j + 3, aA - 6, var2 - 3);
      var0.setColor(m[5]);
      var0.drawRect(1, j + 1, aA - 3, a - 3);
      var0.drawRect(1, j + var2, aA - 3, a - (var1 + var2));
      a(1, j + 1, 152, 0, var0);
      a(aA - 1, j + 1, 152, 0, 0, 2, var0);
      int var3;
      if (A) {
         var3 = b[1639] / b[1644];
         a((aA >> 1) - var3, j + a - var1 + 4, 149, 0, var0);
         a(aA >> 1, j + a - var1 + 4, 149, 1, var0);
      }

      var3 = b[1485] / b[1490];
      if (K != 106) {
         a(4 + (var3 >> 1), j + a - 3, 135, 0, var0);
      }

      if (az != 106) {
         a(aA - 2 - (var3 >> 1), j + a - 3, 135, 1, var0);
      }

   }

   public static final void m(Graphics var0) {
      var0.setClip(0, 0, aA, l);
      g(var0);
      a((String)h, 8, 2, var0);
      if (A) {
         String var1 = "";
         String var2 = "";
         int var3;
         int var4;
         String var5;
         if (S >= 0) {
            var3 = (var1 = c[S]).indexOf("@1");
            if ((var4 = var1.lastIndexOf(64)) <= var3) {
               var4 = var3 + 1;
            }

            var5 = var1.substring(0, var3) + U * L + var1.substring(var4 + 1);
            c[S] = var5;
         }

         if (aw >= 0) {
            var3 = (var2 = c[aw]).indexOf("@x");
            if ((var4 = var2.lastIndexOf(64)) <= var3) {
               var4 = var3 + 1;
            }

            var5 = var2.substring(0, var3) + L + var2.substring(var4 + 1);
            c[aw] = var5;
         }

         a((String[])c, 7, 2, var0);
         if (aw >= 0) {
            c[aw] = var2;
         }

         if (S >= 0) {
            c[S] = var1;
            return;
         }
      } else {
         a((String[])c, 7, 2, var0);
      }

   }

   public static final void ac() {
      if (a(80) && K != 106) {
         t = false;
         A = false;
         HG.q(K);
      }

      if (a(85) && az != 106) {
         t = false;
         A = false;
         HG.q(az);
      }

      if (A) {
         boolean var0 = false;
         if (a(116)) {
            ++L;
            if (L > J) {
               L = ap;
            }

            b = "";
         }

         if (a(117)) {
            --L;
            if (L < ap) {
               L = J;
            }

            b = "";
         }

         if (a(118)) {
            b = b + "0";
            var0 = true;
         }

         if (a(101)) {
            b = b + "1";
            var0 = true;
         }

         if (a(102)) {
            b = b + "2";
            var0 = true;
         }

         if (a(103)) {
            b = b + "3";
            var0 = true;
         }

         if (a(104)) {
            b = b + "4";
            var0 = true;
         }

         if (a(115)) {
            b = b + "5";
            var0 = true;
         }

         if (a(105)) {
            b = b + "6";
            var0 = true;
         }

         if (a(106)) {
            b = b + "7";
            var0 = true;
         }

         if (a(107)) {
            b = b + "8";
            var0 = true;
         }

         if (a(108)) {
            b = b + "9";
            var0 = true;
         }

         if (a(95)) {
            b = "";
            L = 0;
         }

         if (var0) {
            int var1 = 0;

            try {
               var1 = Integer.parseInt(b);
            } catch (Exception var3) {
            }

            L = var1;
            if (L < ap) {
               L = ap;
               b = "";
            } else if (L > J) {
               L = J;
               b = "";
            }
         }
      }

      y();
   }

   public static final String a(int var0) {
      boolean var1 = false;
      int var2;
      if ((var2 = ((var0 & 16711680) >> 16) - 1) >= 0 && var2 < 3) {
         byte[] var3 = (byte[])a.get(new Integer(var0));
         String var4 = null;
         if (var3 == null) {
            return "lol :D";
         } else {
            switch(a) {
            case 0:
               var4 = (new String(var3, 0, var3.length)).replace('\r', '\n');
               break;
            case 1:
               StringBuffer var5 = new StringBuffer(var3.length / 2);

               for(int var9 = 0; var9 < var3.length - 1; var9 += 2) {
                  var5.append((char)((var3[var9 + 1] & 255) << 8 | var3[var9] & 255));
               }

               var4 = var5.toString().replace('\r', '\n');
               break;
            case 2:
               byte[] var6;
               (var6 = new byte[var3.length + 2])[0] = (byte)(var3.length >>> 8);
               var6[1] = (byte)var3.length;
               System.arraycopy(var3, 0, var6, 2, var3.length);

               try {
                  var4 = (new DataInputStream(new ByteArrayInputStream(var6))).readUTF().replace('\r', '\n');
               } catch (Exception var8) {
               }
            }

            return var4;
         }
      } else {
         return HG.a(var0);
      }
   }

   public static final void n() {
      System.gc();
      if (b != null) {
         a.clear();
         Vector var0 = new Vector();

         int var1;
         for(var1 = 0; var1 < b.length; ++var1) {
            byte[] var2 = b[var1];
            int var3 = 0;

            while(var3 < var2.length) {
               int var10001 = var3++;
               byte var10000 = var2[var10001];
               byte var28 = var2[var10001];
               switch(var10000) {
               case 1:
               case 4:
               case 5:
               case 33:
               case 46:
               case 72:
               case 73:
                  ++var3;
                  boolean var4 = false;
                  break;
               case 2:
                  var0.addElement(new Integer(var2[var3++] << 16 & 16711680 | (short)(var2[var3++] << 8 & '\uff00' | var2[var3++] & 255)));
                  var0.addElement(new Integer(var2[var3++] << 16 & 16711680 | (short)(var2[var3++] << 8 & '\uff00' | var2[var3++] & 255)));
                  ++var3;
                  boolean var6 = false;
               case 3:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 23:
               case 24:
               case 25:
               case 26:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 52:
               case 56:
               case 57:
               case 58:
               case 59:
               case 60:
               case 61:
               case 62:
               case 63:
               case 70:
               case 71:
               case 76:
               case 77:
               case 78:
               case 79:
               default:
                  break;
               case 17:
               case 18:
               case 19:
               case 27:
                  ++var3;
                  ++var3;
                  break;
               case 20:
               case 21:
               case 22:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  boolean var5 = false;
                  break;
               case 34:
               case 35:
                  ++var3;
                  ++var3;
                  break;
               case 36:
               case 37:
               case 38:
                  ++var3;
                  ++var3;
                  break;
               case 39:
                  ++var3;
                  ++var3;
                  break;
               case 40:
                  ++var3;
                  ++var3;
                  break;
               case 41:
               case 45:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 42:
               case 43:
               case 74:
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 44:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  boolean var7 = false;
                  break;
               case 47:
               case 66:
               case 67:
                  ++var3;
                  ++var3;
                  break;
               case 48:
                  ++var3;
                  break;
               case 49:
                  var0.addElement(new Integer(var2[var3++] << 16 & 16711680 | (short)(var2[var3++] << 8 & '\uff00' | var2[var3++] & 255)));
                  break;
               case 50:
                  ++var3;
                  ++var3;
                  var0.addElement(new Integer(var2[var3++] << 16 & 16711680 | (short)(var2[var3++] << 8 & '\uff00' | var2[var3++] & 255)));
                  break;
               case 51:
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 53:
                  var0.addElement(new Integer(var2[var3++] << 16 & 16711680 | (short)(var2[var3++] << 8 & '\uff00' | var2[var3++] & 255)));
                  break;
               case 54:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 55:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 64:
               case 65:
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 68:
               case 69:
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 75:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 80:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
                  break;
               case 81:
                  ++var3;
                  ++var3;
                  ++var3;
                  ++var3;
               }
            }
         }

         var1 = 1;

         while(true) {
            while(var1 != 0) {
               int var22;
               if (var1 >= var0.size()) {
                  for(int var19 = 0; var19 < 3; ++var19) {
                     try {
                        String var27 = "/" + HG.c + "." + HG.d[1 + var19] + "." + "lng";
                        InputStream var21;
                        if ((var21 = HG.a.getClass().getResourceAsStream(var27)) == null) {
                           System.err.println("couldn't open lang file");
                        } else {
                           var22 = var21.available();
                           byte[] var24 = new byte[5];
                           var21.read(var24, 0, 5);
                           a = var24[2];
                           int var25;
                           int[] var8 = new int[(var25 = (var24[4] & 255) << 8 | var24[3] & 255) + 1];

                           int var9;
                           for(var9 = 0; var9 < var25 + 1; ++var9) {
                              var21.read(var24, 0, 2);
                              var8[var9] = ((var24[1] & 255) << 8 | var24[0] & 255) + 2;
                           }

                           var9 = 5 + 2 * (var25 + 1);

                           for(int var10 = 0; var10 < var0.size(); ++var10) {
                              int var11;
                              int var12 = (var11 = (Integer)var0.elementAt(var10)) & '\uffff';
                              if (((var11 & 16711680) >> 16) - 1 == var19 && var12 >= 0 && var12 < var25) {
                                 int var14 = var8[var12];
                                 int var15 = var8[var12 + 1];
                                 if (var14 >= var9 && var15 >= var14 && var14 >= 0 && var15 <= var22) {
                                    byte[] var16 = new byte[var15 - var14];
                                    var21.skip((long)(var14 - var9));
                                    var21.read(var16, 0, var16.length);
                                    var9 = var15;
                                    a.put(var0.elementAt(var10), var16);
                                 }
                              }
                           }

                           var21.close();
                           System.gc();
                        }
                     } catch (Exception var17) {
                        var17.printStackTrace();
                     }
                  }

                  System.gc();
                  Thread.yield();
                  System.gc();
                  Thread.yield();
                  System.gc();
                  return;
               }

               Integer var18 = (Integer)var0.elementAt(var1);
               Integer var26 = (Integer)var0.elementAt(var1 - 1);
               int var20 = var18 & '\uffff';
               var22 = var26 & '\uffff';
               if (var20 < var22) {
                  Object var23 = null;
                  var0.setElementAt(var18, var1 - 1);
                  var0.setElementAt(var26, var1);
                  --var1;
               } else {
                  ++var1;
               }
            }

            ++var1;
         }
      }
   }

   public static final void X() {
      a.clear();
   }

   public static final void q() {
      ah = b[1617] / b[1622] >> 1;
      as = b[1618] / b[1623];
      r = aA - (2 * ah + 8 + 8);
      z = l - (b[1607] + b[1387] + 2 * as + 5 + 4);
      ah += 8;
      as += 5;
      n = -1;
   }

   public static final void f(int var0) {
      a(a(var0));
   }

   public static final void a(String var0) {
      Font var1 = a[2];
      int var2 = b[1683] + 16;
      a.addElement(HG.a(var0, var1, r - var2, 0));
   }

   public static final void a(int var0, int var1, int[] var2) {
      f(10, -2, 0);
      if (n < 0) {
         int[] var3;
         if (b == 1 && ag >= 0 && (var3 = a(a.c[ag])) != null) {
            n = var3[0];
         }

         if (n < 0) {
            n = 0;
         }
      }

      Font var7 = a[2];
      int var4 = a[2].getHeight();
      b = HG.a(a(var1), var7, r, 0);
      c(9, ah, as, r, z, 113);
      f(9, 0, -2);
      b(9, 15 + b[1695]);
      F = 0;

      for(int var5 = 0; var5 < a.size(); ++var5) {
         String[] var6 = (String[])a.elementAt(var5);
         F += var4 * var6.length + 10;
      }

      ax = 0;
      q = true;
      e = var2;
      i = 0;
      al = var0;
      if (e != null) {
         e[0] = 2;
      }

      F += 10 + b[1695];
      B = false;
      if (e != null && o) {
         b = System.currentTimeMillis() + 500L;
      } else {
         b = -1L;
      }
   }

   public static final void u(Graphics var0) {
      a(9, ah, as, r, z);
      a((String[])b, 9, 2, var0);
      int var1 = as + a[2].getHeight() * b.length + 10 + g[29];
      var0.setClip(ah, as, r, z - 1);
      a(aA >> 1, var1, 154, 0, var0);
      a(aA >> 1, var1, 154, 0, 0, 2, var0);
   }

   public static final void t(Graphics var0) {
      a(10, ah, as, r, z);
      int var1 = i;
      int var2 = a[2].getHeight();
      int var3 = b[1683] + 16;
      int var4 = (var2 - b[1684] >> 1) + 5;

      for(int var5 = 0; var5 < a.size(); ++var5) {
         c(10, ah + var3, as + var1 + 5, r - var3, z - var1 + 5, 305);
         String[] var6 = (String[])a.elementAt(var5);
         var0.setClip(ah, as, r, z - 1);
         if (var5 == ax) {
            var0.setColor(m[13]);
            var0.fillRect(ah, as + var1, r, var2 * var6.length + 10);
            var0.setColor(m[5]);
         }

         a(ah + 8, as + var1 + var4, 153, 0, var0);
         var1 += var2 * var6.length + 10;
         a((String[])var6, 10, 2, var0);
      }

      var0.setClip(ah, as, r, z - 1);
      a(aA >> 1, as + var1 + 5, 154, 0, var0);
      a(aA >> 1, as + var1 + 5, 154, 0, 0, 2, var0);
   }

   public static final void v(Graphics var0) {
      var0.setClip(0, 0, aA, l);
      boolean var1 = false;
      boolean var2 = false;
      if (B) {
         a(var0, false, false, false, 126);
      } else {
         a(var0, false, false, false, al);
      }

      var0.setClip(ah, as, r, z - 1);
      var0.setColor(m[5]);
      int var3 = b[1639] / b[1644];
      short var4 = b[1640];
      int var5 = as + z + 3;
      if (B) {
         t(var0);
         if (i > z - F) {
            var1 = true;
         }

         if (i < 0) {
            var2 = true;
         }

         var0.setClip(0, 0, aA, l);
         a(ah, var5, 160, 1, var0);
         a(b[1606] >> 1, l, 136, 3, var0);
         a((Graphics)var0, 126, (String)HG.a((int)174));
      } else {
         u(var0);
         int var6 = b.length * a[2].getHeight() + f[109];
         short var7;
         if ((var7 = g[29]) > z - var6) {
            var1 = true;
         }

         if (var7 < 0) {
            var2 = true;
         }

         var0.setClip(0, 0, aA, l);
         if (!a.isEmpty()) {
            a(ah + r - var4, var5, 160, 0, var0);
         }

         a(b[1606] >> 1, l, 136, 3, var0);
         a(var0, al, HG.a(n));
      }

      var0.setClip(0, 0, aA, l);
      var5 += var3 - var4 >> 1;
      if (var2) {
         a((aA >> 1) - var3, var5, 149, 0, var0);
      }

      if (var1) {
         a(aA >> 1, var5, 149, 1, var0);
      }

   }

   public static final void a(Graphics var0, int var1, String var2) {
      int var3 = a[2].getHeight();
      int var4 = b[1518] + b[1386] - 1;
      int var5 = aA - var4 - 1;
      int var6 = var3 + 5 + 5;
      int var7 = l - var6 - (b[1387] + b[1607] - var6 >> 1);
      var0.setColor(m[8]);
      var0.fillRect(var4, var7, var5, var6);
      var0.setColor(m[6]);
      var0.drawRect(var4, var7 + 1, var5 - 1, var6 - 1);
      var0.setColor(m[5]);
      var0.drawRect(var4, var7, var5 - 1, var6 - 1);
      a(var4, var7, 152, 0, var0);
      a(aA - 1, var7, 152, 0, 0, 2, var0);
      c(10, var4 + 4, var7 + 4, var5 - 8, var6 - 8, 156);
      a((String)var2, 10, 2, var0);
   }

   public static final void F() {
      if (e != null) {
         e[0] = 1;
      }

      q = false;
      a.removeAllElements();
      e = null;
      if (e) {
         n = -1;
      }

      e = false;
   }

   public static final void Q() {
      if (a(80) || a(65)) {
         if (!B && !a.isEmpty()) {
            B = true;
         } else if (b < 0L || System.currentTimeMillis() >= b) {
            F();
         }
      }

      int var0;
      short[] var10000;
      int var2;
      boolean var4;
      int var6;
      if (a(55)) {
         if (B) {
            var0 = a[2].getHeight();
            boolean var1;
            if (!(var1 = F > z)) {
               --ax;
            } else {
               var2 = as + i;
               boolean var3 = false;
               var4 = false;
               if (ax - 1 < 0) {
                  for(var6 = 0; var6 < ax; ++var6) {
                     var2 += ((String[])a.elementAt(var6)).length * var0 + 10;
                  }

                  if (var2 >= as) {
                     --ax;
                  }

                  var4 = true;
               } else {
                  for(var6 = 0; var6 < ax; ++var6) {
                     var2 += ((String[])a.elementAt(var6)).length * var0 + 10;
                  }

                  a.elementAt(ax);
                  if (var2 > z / 2) {
                     --ax;
                     var4 = true;
                  }
               }

               i += var0;
               if (i > 0) {
                  i = 0;
                  if (!var4) {
                     --ax;
                  }
               }
            }

            if (ax < 0) {
               ax = a.size() - 1;
               if (var1) {
                  i = z - F;
               }
            }
         } else {
            var10000 = g;
            var10000[29] = (short)(var10000[29] + a[2].getHeight());
         }
      }

      if (a(60)) {
         if (B) {
            var0 = a[2].getHeight();
            if (F <= z) {
               ++ax;
            } else {
               var2 = as + i;
               var4 = false;
               int var5;
               if ((var5 = ax + 1) >= a.size()) {
                  for(var6 = 0; var6 < ax; ++var6) {
                     var2 += ((String[])a.elementAt(var6)).length * var0 + 10;
                  }

                  if (var2 + ((String[])a.elementAt(ax)).length * var0 + 20 + b[1695] <= as + z) {
                     ++ax;
                  }

                  var4 = true;
               } else {
                  for(var6 = 0; var6 < var5; ++var6) {
                     var2 += ((String[])a.elementAt(var6)).length * var0;
                  }

                  a.elementAt(var5);
                  if (var2 < as + z / 2) {
                     ++ax;
                     var4 = true;
                  }
               }

               i -= var0;
               if (i < z - F) {
                  i = z - F;
                  if (!var4) {
                     ++ax;
                  }
               }
            }

            if (ax >= a.size()) {
               ax = 0;
               i = 0;
            }
         } else {
            var10000 = g;
            var10000[29] = (short)(var10000[29] - a[2].getHeight());
         }
      }

      if (B && a(61)) {
         B = false;
      }

      if (!B && a(62) && !a.isEmpty()) {
         B = true;
      }

      y();
   }

   public static final void h(int var0) {
      k = 0;

      for(int var1 = 0; var1 < a[2].length; ++var1) {
         int var2;
         if ((var2 = a[2][var1][4]) >= 0 && r[var2][6] == 20) {
            k += a[2][var1][6];
         }
      }

      if (k > 0) {
         I = k;
         D = (byte)(a.c[var0][8] >> 24 & 255);
         an = (short)((short)((a.c[var0][9] & -65536) >> 16)) & '\uffff' | (short)var0 << 16 & -65536;
         O = 0;
         j = true;
         f = " x " + k;
      } else {
         b(239, 230, 101, 106);
      }
   }

   public static final void b(Graphics var0) {
      if ((k[2] & 128) == 0 && (k[2] & 1) != 0) {
         n = 174;
         e = true;
         a(126, 463, (int[])null);
         int[] var10000 = k;
         var10000[2] |= 128;
      } else {
         var0.setClip(0, 0, aA, l);
         var0.setColor(m[3]);
         var0.fillRect(0, 0, aA, l);
         boolean var1 = false;
         int var2 = aA >> 1;
         int var3;
         int var4 = (var3 = b[1838] + 5) * D + b[1772] + b[1794] + (b[1805] >> 1);
         int var5 = l - (var4 + b[1607] + b[1387]) >> 1;
         int var14 = var4 + var5;
         int var6 = b[1760] / b[1765];
         a((aA >> 1) + 3 * var6, var14, 160, 0, var0);
         a((aA >> 1) - 4 * var6, var14, 160, 1, var0);
         var0.setClip(10, 0, aA - 20, aA);
         a(var2, var14, 161, 0, var0);
         var14 -= b[1772];

         int var7;
         for(var7 = 0; var7 < D; ++var7) {
            boolean var8 = false;
            boolean var9 = false;
            if ((an & 1 << var7) != 0) {
               var9 = true;
            }

            int var15;
            if (O > var7) {
               var15 = (aA - b[1782] >> 1) - b[1837] - 10 >> 1;
            } else {
               var15 = (aA - b[1782] >> 1) - b[1837] - 10;
            }

            for(int var10 = 0; var10 < var3; var10 += b[1805]) {
               a(aA >> 1, var14 - var10, 162, 0, var0);
               if (O > var7) {
                  a(aA >> 1, var14 - var10, 164, 0, var0);
               } else if (O == var7) {
                  a(aA >> 1, var14, 168, 0, var0);
               }
            }

            var2 = b[1782] >> 1;
            int var11 = 0;
            if (O > var7) {
               while(var11 < var15) {
                  if (var9) {
                     a((aA >> 1) + var2, var14, 165, 0, var0);
                  } else {
                     a((aA >> 1) - var2, var14, 165, 0, 0, 2, var0);
                  }

                  var2 += b[1815];
                  var11 += b[1815];
               }
            }

            int var12 = 0;
            int var13 = 0;
            if (O > var7) {
               if (var9) {
                  var13 = var2 - (b[1782] >> 1);
               } else {
                  var12 = var2 - (b[1782] >> 1);
               }
            }

            a((aA >> 1) + var2 - var12, var14, 167, 0, var0);
            a((aA >> 1) - var2 + var13, var14, 167, 0, 0, 2, var0);
            var2 += b[1837];

            for(var11 = 0; var11 < var15; var11 += b[1826]) {
               if (O > var7) {
                  if (var9) {
                     a((aA >> 1) - var11 - (b[1782] >> 1) - b[1837], var14, 166, 0, 0, 2, var0);
                  } else {
                     a((aA >> 1) + var11 + (b[1782] >> 1) + b[1837], var14, 166, 0, var0);
                  }
               }

               a((aA >> 1) + var2, var14, 166, 0, var0);
               a((aA >> 1) - var2, var14, 166, 0, 0, 2, var0);
               var2 += b[1826];
            }

            var14 -= var3;
         }

         a(aA >> 1, var14 - (b[1805] >> 1), 163, 0, var0);
         var0.setClip(0, 0, aA, l);
         if ((var7 = b[1508]) < a[2].getHeight()) {
            var7 = a[2].getHeight();
         }

         var14 = l - b[1607] - (var7 >> 1) - 5;
         a(var2 = aA - a[2].stringWidth(f) - (b[1507] / b[1512] >> 1) - 5, var14, 137, 6, var0);
         var2 += b[1507] / b[1512] >> 1;
         var14 -= var7 >> 1;
         var0.setColor(m[5]);
         var0.setFont(a[2]);
         var0.drawString(f, var2 + 0, var14 + 0, 20);
         b((Graphics)var0, 1);
         a(aA - (b[1606] >> 1), l, 136, 1, var0);
      }
   }

   public static final boolean c() {
      int var0;
      return (var0 = 100 - (short)(O[25] & '\uffff')) >= 0 && HG.e(100) <= var0;
   }

   public static final void K() {
      int var0 = I - k;

      for(int var1 = 0; var1 < a[2].length; ++var1) {
         int var2;
         if ((var2 = a[2][var1][4]) >= 0 && r[var2][6] == 20) {
            a((short)var2 & '\uffff' | 131072, var0);
            return;
         }
      }

   }

   public static final void z() {
      if (a(61)) {
         if ((an & 1 << O) != 0) {
            O = 0;
            if (c()) {
               --k;
               HG.m(32);
               f = " x " + k;
            }
         } else {
            ++O;
         }
      } else if (a(62)) {
         if ((an & 1 << O) == 0) {
            O = 0;
            if (c()) {
               --k;
               HG.m(32);
               f = " x " + k;
            }
         } else {
            ++O;
         }
      } else if (a(85)) {
         j = false;
         K();
      }

      if (O >= D) {
         short var0 = (short)((an & -65536) >> 16);
         byte var1 = (byte)(a.c[var0][8] >> 8 & 255);
         byte var2 = (byte)(a.c[var0][8] & 255);
         a(12, 7, (short)((a.c[var0][2] & -65536) >> 16), var2, 0, false);
         if (var2 == 5) {
            int[] var10000 = a.c[var0];
            var10000[3] |= 32768;
            b(a.c[var0], true);
            n = true;
         }

         a.a(a.b() | 1 << var1);
         a(a.c[var0], false);
         HG.m(9);
         j = false;
         K();
         c((short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
      }

      if (k <= 0) {
         b(239, 230, 101, 106);
         K();
         j = false;
      }

      y();
   }

   public static final int h(int var0) {
      int var1 = 0;

      for(int var2 = 0; var2 < var0; ++var2) {
         if (HG.e(2) == 1) {
            var1 |= 1 << var2;
         }
      }

      return var1;
   }

   public static final void c(Graphics var0) {
      b((Graphics)var0, 0);
      if (!h && !r) {
         if (ac == -1) {
            j(var0);
         }
      } else {
         i(var0);
      }

      k(var0);
      var0.setClip(0, 0, aA, l);
      a(b[1606] >> 1, l, 136, 2, var0);
      a(aA - (b[1606] >> 1), l, 136, 1, var0);
   }

   public static final void b(Graphics var0, int var1) {
      boolean var2 = var1 == 0 || var1 == 1;
      boolean var3 = var1 == 0 || var1 == 2;
      var0.setClip(0, 0, aA, l);
      int var5;
      if (var2) {
         boolean var4 = false;
         var5 = l;
         a(0, var5, 146, 0, var0);
         var5 -= b[1607];
         a(0, var5, 138, 0, var0);
         a(0 + b[1518], var5, 126, 0, var0);
         n(var0);
      }

      a(aA, l, 146, 0, 0, 2, var0);
      if (var3) {
         int var9 = aA;
         var5 = l - b[1607];
         a(var9, var5, 138, 0, 0, 2, var0);
         var9 -= b[1518];
         boolean var6 = false;
         short var10;
         switch(l(a())) {
         case 0:
         case 1:
            var10 = 140;
            break;
         case 2:
            if ((short)(O[53] & '\uffff') == 0) {
               var10 = 143;
            } else if ((short)(O[53] & '\uffff') <= 10) {
               var10 = 142;
            } else {
               var10 = 141;
            }
            break;
         case 3:
            if ((short)((O[53] & -65536) >> 16) == 0) {
               var10 = 143;
            } else if ((short)((O[53] & -65536) >> 16) <= 10) {
               var10 = 142;
            } else {
               var10 = 141;
            }
            break;
         default:
            var10 = 139;
         }

         if (O[45] != -1) {
            if (a(a[4][O[45]])[8] == 0) {
               var10 = 145;
            } else {
               var10 = 144;
            }
         }

         a(var9, var5, var10, 0, var0);
         a((Graphics)var0, 0);
      }

   }

   public static final void n(Graphics var0) {
      boolean var1 = false;
      int var2 = l;
      if (l(146) && l(139)) {
         var2 = var2 - c[146][4] - c[139][4];
         short var3 = (short)(O[12] & '\uffff');
         short var4;
         int var5;
         if ((var4 = (short)((O[12] & -65536) >> 16)) == 0) {
            var5 = 32;
         } else {
            var5 = 32 * var3 / var4;
         }

         var0.setColor(16711680);
         var0.fillRect(33, var2 + 2 + 32 - var5, 5, var5);
      }
   }

   public static final void a(Graphics var0, int var1) {
      if (l(138) && l(126) && l(146) && l(139)) {
         int var2 = aA - c[138][3] - c[126][3];
         int var3 = l - c[146][4] - c[139][4];
         short var4 = (short)(O[13] & '\uffff');
         short var5;
         int var6;
         if ((var5 = (short)((O[13] & -65536) >> 16)) == 0) {
            var6 = 32;
         } else {
            var6 = 32 * var4 / var5;
         }

         var0.setColor(8421631);
         var0.fillRect(var2 + 2 + var1, var3 + 2 + 32 - var6, 5, var6);
      }
   }

   public static final void i() {
      if (v == null) {
         v = new int[10][11];
         m = new int[10][];
      }

      for(int var0 = 0; var0 < v.length; ++var0) {
         v[var0][6] = -1;
         v[var0][0] = -1;
         v[var0][4] = -1;
         v[var0][5] = -1;
         v[var0][3] = 0;
      }

   }

   public static final void j(int var0) {
      if (!s) {
         int var1;
         if ((var1 = a()) >= 0) {
            int var2 = a[4][var0][4];
            int[] var3;
            if ((var3 = u[var2])[4] * (short)((O[13] & -65536) >> 16) / 100 > (short)(O[13] & '\uffff')) {
               return;
            }

            if ((short)((var3[6] & -65536) >> 16) > 0) {
               m[var1] = null;
            } else if ((short)(var3[6] & '\uffff') == 0) {
               m[var1] = O;
            } else if (ac >= 0) {
               m[var1] = q[ac];
            } else {
               m[var1] = null;
               int var5 = var3[7] * 4096 / 10;
               switch(O[30]) {
               case 0:
                  v[var1][9] = O[4];
                  v[var1][10] = O[5] - var5;
                  break;
               case 1:
                  v[var1][9] = O[4] + var5;
                  v[var1][10] = O[5];
                  break;
               case 2:
                  v[var1][9] = O[4];
                  v[var1][10] = O[5] + var5;
                  break;
               case 3:
                  v[var1][9] = O[4] - var5;
                  v[var1][10] = O[5];
               }
            }

            int[] var10000 = v[var1];
            var10000[6] &= -256;
            var10000 = v[var1];
            var10000[6] |= (byte)var2 & 255;
            var10000 = v[var1];
            var10000[6] &= -65281;
            var10000 = v[var1];
            var10000[6] |= 256;
            var10000 = v[var1];
            var10000[6] &= -16711681;
            var10000 = v[var1];
            var10000[6] |= 0;
            var10000 = v[var1];
            var10000[6] &= 16777215;
            var10000 = v[var1];
            var10000[6] |= 33554432;
            if (var3[5] == -1 && !s) {
               HG.m(var3[9]);
            }

            v[var1][7] = 0;
            v[var1][8] = 655360;
            v[var1][4] = O[4];
            v[var1][5] = O[5];
            s = true;
            y();
            A();
            return;
         }
      } else {
         s = false;
         y();
         A();
      }

   }

   public static final void o() {
      for(int var0 = 0; var0 < v.length; ++var0) {
         if (v[var0][6] != -1) {
            int[] var1;
            int var2;
            if ((var2 = (var1 = u[(byte)(v[var0][6] & 255)])[4] * (short)((O[13] & -65536) >> 16) / 100) < 1) {
               var2 = 1;
            }

            int[] var10000;
            byte var3;
            int var4;
            byte var5;
            int var9;
            if ((byte)(v[var0][6] >> 16 & 255) == 0) {
               if ((short)(var1[6] & '\uffff') != 0 && ac >= 0 && !a.a(O, q[ac], var1[7] * 4096 / 10)) {
                  a(1, var2 * ((byte)(v[var0][6] >> 8 & 255) - 1), true, false, O);
                  v[var0][6] = -1;
                  s = false;
               } else {
                  var3 = (byte)(v[var0][6] >> 8 & 255);
                  var4 = var1[5];
                  if ((var5 = (byte)(v[var0][6] >> 24 & 255)) >= 0 && s) {
                     if (ac != -1) {
                        O[30] = b(q[ac][4] - O[4], q[ac][5] - O[5]);
                        f(O, 12 + O[30]);
                     }

                     var9 = var5 - 1;
                     var10000 = v[var0];
                     var10000[6] &= 16777215;
                     var10000 = v[var0];
                     var10000[6] |= (byte)var9 << 24 & -16777216;
                  } else if ((short)(O[13] & '\uffff') - var2 >= 0 && s) {
                     if (var4 == -1) {
                        if (!a(var0, var3, m[var0])) {
                           a(1, -var2, true, false, O);
                           d = 10;
                           v[var0][6] = -1;
                           s = false;
                           continue;
                        }

                        var3 = 0;
                     }

                     a(1, -var2, true, false, O);
                     int var8 = var3 + 1;
                     var10000 = v[var0];
                     var10000[6] &= -65281;
                     var10000 = v[var0];
                     var10000[6] |= (byte)var8 << 8 & '\uff00';
                     var10000 = v[var0];
                     var10000[6] &= 16777215;
                     var10000 = v[var0];
                     var10000[6] |= 33554432;
                  } else {
                     if ((short)((var1[6] & -65536) >> 16) > 0) {
                        short var6;
                        short var7;
                        if ((short)(var1[6] & '\uffff') == 0) {
                           var6 = (short)(O[0] & '\uffff');
                           var7 = (short)((O[0] & -65536) >> 16);
                           v[var0][0] = (short)var6 & '\uffff' | (short)var7 << 16 & -65536;
                           v[var0][4] = O[4];
                           v[var0][5] = O[5];
                           v[var0][9] = O[4];
                           v[var0][10] = O[5];
                        } else if (ac >= 0 && m[var0] == null) {
                           var6 = (short)(q[ac][0] & '\uffff');
                           var7 = (short)((q[ac][0] & -65536) >> 16);
                           v[var0][0] = (short)var6 & '\uffff' | (short)var7 << 16 & -65536;
                           v[var0][4] = q[ac][4];
                           v[var0][5] = q[ac][5];
                           v[var0][9] = q[ac][4];
                           v[var0][10] = q[ac][5];
                        } else {
                           v[var0][4] = O[4];
                           v[var0][5] = O[5];
                           v[var0][9] = O[4];
                           v[var0][10] = O[5];
                        }
                     }

                     if (var4 != -1) {
                        a(1, -var2, true, false, O);
                        f(O, 8 + O[30]);
                        var10000 = v[var0];
                        var10000[6] &= -16711681;
                        var10000 = v[var0];
                        var10000[6] |= 131072;
                        HG.m(var1[9]);
                        a.a(v[var0], (short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
                     } else {
                        v[var0][6] = -1;
                        f(O, 0 + O[30]);
                     }

                     s = false;
                     d = 10;
                  }
               }
            } else if ((byte)(v[var0][6] >> 16 & 255) == 3) {
               var3 = (byte)(v[var0][6] >> 8 & 255);
               var4 = var1[5];
               if (var1[3] > 0) {
                  var4 *= var3 >> 1;
               } else {
                  var4 *= var3;
               }

               if (var4 <= 0) {
                  var10000 = v[var0];
                  var10000[6] &= -16711681;
                  var10000 = v[var0];
                  var10000[6] |= 262144;
               } else {
                  if ((var5 = (byte)(v[var0][6] >> 24 & 255)) < 0) {
                     var10000 = v[var0];
                     var10000[6] &= 16777215;
                     var10000 = v[var0];
                     var10000[6] |= 167772160;
                     a(var0, var3, m[var0]);
                     var10000 = v[var0];
                     var10000[7] += 10;
                     if (v[var0][7] >= var4 * var2) {
                        if (var1[8] == 3) {
                           a(var0, var3, m[var0]);
                        }

                        var10000 = v[var0];
                        var10000[6] &= -16711681;
                        var10000 = v[var0];
                        var10000[6] |= 262144;
                     }
                  } else {
                     var9 = var5 - 1;
                     var10000 = v[var0];
                     var10000[6] &= 16777215;
                     var10000 = v[var0];
                     var10000[6] |= (byte)var9 << 24 & -16777216;
                  }

                  a(var0, true);
               }
            } else if ((byte)(v[var0][6] >> 16 & 255) == 2) {
               if (!h(var0)) {
                  var10000 = v[var0];
                  var10000[6] &= -16711681;
                  var10000 = v[var0];
                  var10000[6] |= 196608;
                  var10000 = v[var0];
                  var10000[6] &= 16777215;
                  var10000 = v[var0];
                  var10000[6] |= 167772160;
                  var3 = (byte)(v[var0][6] >> 8 & 255);
                  a(var0, var3, m[var0]);
               }
            } else if ((byte)(v[var0][6] >> 16 & 255) == 4 && !a(var0, false)) {
               v[var0][6] = -1;
               a.a(v[var0], -1, -1);
            }
         }
      }

   }

   public static final boolean a(int var0, boolean var1) {
      short var2 = (short)(v[var0][8] & '\uffff');
      short var3 = (short)((v[var0][8] & -65536) >> 16);
      int var4 = var2 + 1;
      if (var4 >= var3) {
         if (!var1) {
            return false;
         }

         var4 = 0;
      }

      int[] var10000 = v[var0];
      var10000[8] &= -65536;
      var10000 = v[var0];
      var10000[8] |= (short)var4 & '\uffff';
      return true;
   }

   public static final boolean a(int var0, int var1, int[] var2) {
      int[] var3;
      int var4 = (var3 = u[(byte)(v[var0][6] & 255)])[5];
      int var5 = (short)((var3[6] & -65536) >> 16) * 4096;
      short var6 = (short)(var3[6] & '\uffff');
      int var7;
      if ((var7 = var3[4] * (short)((O[13] & -65536) >> 16) / 100) < 1) {
         var7 = 1;
      }

      if (var2 != null) {
         a(var0, var2);
      }

      if ((short)((var3[6] & -65536) >> 16) > 0 && var2 == null) {
         if (var6 == 0 || var6 == 2) {
            a(var0, var1, O);
         }

         n[0] = v[var0][9] - var5;
         n[2] = v[var0][9] + var5;
         n[1] = v[var0][10] - var5;
         n[3] = v[var0][10] + var5;

         for(int var12 = a.a((int[])n, 32); var12 != -1; var12 = (short)((a.c[var12][1] & -65536) >> 16)) {
            if ((a.c[var12][13] & 2) == 0 && (a.c[var12][3] & 65536) == 0) {
               a(var0, var1, a.c[var12]);
            }
         }

         return true;
      } else if (var2 == null) {
         return false;
      } else {
         boolean var8 = (var2[3] & 16) != 0 && (var6 == 0 || var6 == 2);
         boolean var9 = (var2[3] & 32) != 0 && (var6 == 2 || var6 == 1 && !j((short)((var2[2] & -65536) >> 16)) || var6 == 4 && (j((short)((var2[2] & -65536) >> 16)) || (var2[13] & 128) != 0) || var6 == 3 && !j((short)((var2[2] & -65536) >> 16)) && (var2[13] & 128) == 0);
         short var11;
         int[] var10000;
         switch(var3[8]) {
         case 0:
            if (var8) {
               if (var4 < 0 && (short)(O[12] & '\uffff') == (short)((O[12] & -65536) >> 16)) {
                  return false;
               }

               a(0, var3[3] * var1 * var7, true, false, var2);
            } else if (var9) {
               if (var4 < 0 && (short)(var2[12] & '\uffff') == (short)((var2[12] & -65536) >> 16)) {
                  return false;
               }

               a(0, var3[3] * var1 * var7, true, false, var2);
               d(ac);
            }
            break;
         case 1:
            int var10 = var3[3] * var7;
            if (var4 >= 0) {
               var10 *= var1 >> 1;
            } else {
               var10 *= var1;
            }

            if ((var10 -= b(4, var2)) <= 0) {
               var10 = 1;
            }

            if (var8) {
               if (var4 < 0 && (short)(O[12] & '\uffff') <= 0) {
                  return false;
               }

               a(0, -var10, true, false, var2);
            }

            if (var9) {
               if ((short)(var2[20] & '\uffff') == -1 || (short)(var2[26] & '\uffff') < 3) {
                  var11 = (short)(O[2] & '\uffff');
                  var2[20] &= -65536;
                  var2[20] |= (short)var11 & '\uffff';
                  var2[22] = b(O);
                  var2[26] = 10;
                  if ((a[var2[11]][13] & 128) != 0) {
                     a((short)((var2[2] & -65536) >> 16), true);
                  }
               }

               a(var10, var2, O);
               d(ac);
            }
            break;
         case 2:
            if (var9 && v[var0][7] == 0 && a[var2[11]][27] != 4) {
               var2[13] |= 128;
               var2[20] = -1;
               var2[22] = b(var2);
               var2[25] = var4 * var1 * var7 * (100 - b(4, var2)) / 100;
            }

            if (var2[25] <= 0) {
               var10000 = v[var0];
               var10000[6] &= -16711681;
               var10000 = v[var0];
               var10000[6] |= 262144;
            }
            break;
         case 3:
            if (var9) {
               if (v[var0][7] >= var4 * var1 * var7 * (100 - b(4, var2)) / 100) {
                  var2[13] &= -9;
                  f(var2, 0 + (short)(var2[27] & '\uffff'));
                  var10000 = v[var0];
                  var10000[6] &= -16711681;
                  var10000 = v[var0];
                  var10000[6] |= 262144;
               } else if (v[var0][7] == 0 && a[var2[11]][27] != 4) {
                  var2[13] |= 8;
                  f(var2, 16);
                  var11 = (short)(O[2] & '\uffff');
                  var2[20] &= -65536;
                  var2[20] |= (short)var11 & '\uffff';
                  if ((a[var2[11]][13] & 128) != 0) {
                     a((short)((var2[2] & -65536) >> 16), true);
                  }
               }
            }
         }

         return true;
      }
   }

   public static final int a() {
      for(int var0 = 0; var0 < v.length; ++var0) {
         if (v[var0][6] == -1) {
            return var0;
         }
      }

      return -1;
   }

   public static final boolean h(int var0) {
      boolean var1 = false;
      int var2 = v[var0][4];
      int var3 = v[var0][5];
      int var4;
      int var5;
      if (m[var0] != null) {
         var4 = m[var0][4];
         var5 = m[var0][5];
      } else {
         var4 = v[var0][9];
         var5 = v[var0][10];
      }

      U[0] = var4 - var2;
      U[1] = var5 - var3;
      if (r(U) <= 2048) {
         return false;
      } else {
         a((int[])U, 2048, (int[])I);
         var4 = var2 + I[0];
         var5 = var3 + I[1];
         int var6 = a.a(var2, var3, var4, var5, 4128, w, true);
         v[var0][4] = w[0];
         v[var0][5] = w[1];
         int var7 = w[0] >> 12;
         if (w[0] < 0) {
            --var7;
         }

         int var8 = w[1] >> 12;
         if (w[1] < 0) {
            --var8;
         }

         a.a(v[var0], var7, var8);
         if (var7 < 0 || var7 >= a.m || var8 < 0 || var8 >= a.u) {
            var6 = -1;
         }

         if (var6 != -2) {
            if (var6 != -1) {
               if ((a.c[var6][3] & 32) != 0) {
                  m[var0] = a.c[var6];
               } else {
                  m[var0] = null;
               }
            } else {
               m[var0] = null;
            }

            return false;
         } else {
            e(v[var0]);
            return true;
         }
      }
   }

   public static final void e(int[] var0, Graphics var1) {
      int[] var2 = u[(byte)(var0[6] & 255)];
      short var3 = (short)((var0[2] & -65536) >> 16);
      boolean var4 = false;
      short var5 = -1;
      byte var6 = -1;
      short var7 = -1;
      switch(var2[0]) {
      case 452:
         var7 = 4096;
         var5 = 173;
         var6 = 0;
         var4 = true;
      case 458:
         if (!var4) {
            var5 = 180;
            var6 = 0;
            var7 = 4096;
            var4 = true;
         }
      case 448:
         if (!var4) {
            var5 = 181;
            var6 = 0;
            var7 = 4096;
         }

         if ((byte)(var0[6] >> 16 & 255) == 2) {
            if (m[var3] != null) {
               a.c(m[var3], t);
            } else {
               t[0] = var0[9];
               t[1] = var0[10];
            }

            int var8 = t[0] - var0[4];
            int var9 = t[1] - var0[5];
            int var10 = (var0[4] * a.g >> 12) - q;
            int var11 = (var0[5] * a.g >> 12) - c - (var7 * a.g >> 12);
            if (b(var5, var6)) {
               a(var10, var11, var5, var6, 0, var8, var9, var1);
            }
         }

         return;
      default:
      }
   }

   public static final void R() {
      o = new int[8][13];
      b = new short[8][60];

      for(int var0 = 0; var0 < o.length; ++var0) {
         for(int var1 = 0; var1 < o[var0].length; ++var1) {
            o[var0][var1] = -1;
         }

         o[var0][0] = -1;
         o[var0][3] = 0;
      }

      w = 0;
   }

   public static final void U() {
      o = (int[][])null;
      b = (short[][])null;
   }

   public static final void h() {
      for(int var0 = 0; var0 < o.length; ++var0) {
         if ((o[var0][3] & 65536) == 0) {
            int var10002 = o[var0][10]--;
            if (o[var0][10] <= 0) {
               int[] var10000 = o[var0];
               var10000[3] |= 65536;
               a.a(o[var0], -1, -1);
            } else {
               switch(o[var0][11]) {
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 12:
               default:
                  break;
               case 8:
                  f(o[var0]);
                  break;
               case 9:
                  i(o[var0]);
                  break;
               case 10:
                  c(o[var0]);
                  break;
               case 11:
                  b(o[var0]);
                  break;
               case 13:
                  h(o[var0]);
                  break;
               case 14:
                  a(o[var0]);
               }
            }
         }
      }

   }

   public static final void l(int[] var0, Graphics var1) {
      switch(var0[11]) {
      case 0:
         return;
      case 1:
         return;
      case 2:
         return;
      case 3:
         return;
      case 4:
         j(var0, var1);
         return;
      case 5:
         return;
      case 6:
         g(var0, var1);
         return;
      case 7:
         return;
      case 8:
         b(var0, var1);
         return;
      case 9:
         h(var0, var1);
         return;
      case 10:
         a(var0, var1);
         return;
      case 11:
         f(var0, var1);
         return;
      case 12:
         return;
      case 13:
         i(var0, var1);
         return;
      case 14:
         k(var0, var1);
      default:
      }
   }

   public static final void l() {
      short var0 = 0;
      boolean var1 = false;
      short var2 = 0;
      short var3 = 0;
      d = HG.a((int)315);
      if (l(155) && l(152)) {
         var0 = b[1705];
         var2 = b[1672];
         var3 = b[1673];
      }

      short var4 = var0 > var2 ? var0 : var2;
      boolean var5 = false;
      int var6 = 4 + var4;
      boolean var8 = false;
      int var9 = a[2].getHeight();
      int var7;
      if (a[2].stringWidth(d) >= aA - (var6 << 1)) {
         var6 = 4;
         var7 = 4 + var3;
         u = var9 + (var3 << 1) + 8;
      } else {
         var6 = 4 + var4;
         var7 = 4;
         if (var9 < var3) {
            var9 = var3;
         }

         u = var9 + 8;
      }

      int var10 = aA - (var6 << 1);
      c(11, var6, var7, var10, var9, 156);
      f(11, -2, 0);
   }

   public static final void H() {
      d = null;
   }

   public static final void a(Graphics var0) {
      var0.setClip(0, 0, aA, l);
      var0.setColor(m[21]);
      var0.drawRect(0, 0, aA - 1, u - 1);
      var0.setColor(m[20]);
      var0.drawRect(1, 1, aA - 3, u - 3);
      var0.setColor(m[19]);
      var0.fillRect(2, 2, aA - 4, u - 4);
      var0.setColor(m[18]);
      a((String)d, 11, 2, var0);
      var0.setClip(0, 0, aA, l);
      if (l(155) && l(152)) {
         a(1, 1, 152, 0, var0);
         a(aA - 1, 1, 152, 0, 0, 2, var0);
         a(0, u - b[1673], 155, 0, 0, 0, var0);
         a(aA - b[1672] - 1, u - b[1673] - 1, 152, 0, 0, 3, var0);
      }

      if (P >= 0 && !r && !h) {
         l(av);
         boolean var1 = false;
         boolean var2 = false;
         a(0, l, 146, 0, var0);
         a(b[1606] >> 1, l, 136, 3, var0);
         int var3 = l - b[1607];
         boolean var4 = false;
         if (av >= 0) {
            a(0, var3, 138, 0, var0);
            a(0 + b[1518], var3, av, 0, var0);
         }

         a(var0, av, HG.a(315 + P));
      }

   }

   public static final void a(int var0, int[] var1) {
      int[] var2 = u[(byte)(v[var0][6] & 255)];
      a(var0, var1, v);
      short var3 = -1;
      if (var1 != null) {
         var3 = (short)(var1[2] & '\uffff');
      }

      switch(var2[0]) {
      case 448:
         a(v[0], v[1], 4096, var3);
         return;
      case 450:
         a(v[0], v[1], var3);
      case 449:
      case 451:
      case 453:
      case 455:
      case 457:
      case 459:
      default:
         return;
      case 452:
         c(var0, N);
         a(v[var0][4], v[var0][5], 4096, N[0], N[1], 0);
         return;
      case 454:
         e(v[0], v[1]);
         return;
      case 456:
         h(v[0], v[1], var3);
         return;
      case 458:
         c(var0, N);
         b(v[var0][4], v[var0][5], 4096, N[0], N[1], 0);
         return;
      case 460:
         d(v[0], v[1], var3);
      }
   }

   public static final void e(int[] var0) {
      int[] var1 = u[(byte)(var0[6] & 255)];
      short var2 = (short)((var0[2] & -65536) >> 16);
      switch(var1[0]) {
      case 448:
         c(var2, N);
      default:
         return;
      case 452:
         c(var2, A);
         return;
      case 458:
         c(var2, A);
      }
   }

   public static final void c(int var0, int[] var1) {
      if (m[var0] != null) {
         a.c(m[var0], f);
      } else {
         f[0] = v[var0][9];
         f[1] = v[var0][10];
      }

      c[0] = f[0] - v[var0][4];
      c[1] = f[1] - v[var0][5];
      int var2 = r(c);
      boolean var3 = false;
      var1[0] = c[0] * 2048 / (var2 + 1);
      var1[1] = c[1] * 2048 / (var2 + 1);
   }

   public static final void a(int var0, int[] var1, int[] var2) {
      if (var1 != null) {
         a.c(var1, var2);
         var2[1] = a.c(var1) + 1;
      } else {
         var2[0] = v[var0][9];
         var2[1] = v[var0][10];
      }
   }

   public static final void a(int var0, int var1, int var2) {
      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0;
      o[w][5] = var1;
      o[w][6] = 0;
      o[w][7] = 0;
      o[w][8] = 0;
      o[w][9] = 0;
      o[w][10] = 20;
      o[w][11] = 14;
      o[w][12] = var2;
      a.a(o[w], var0 >> 12, var1 >> 12);
      a(o[w]);
      ++w;
      w %= 8;
   }

   public static final void a(int[] var0) {
      if (var0[12] != -1) {
         a.c(a.c[var0[12]], p);
         p[1] = a.c(a.c[var0[12]]) + 1;
         var0[4] = p[0];
         var0[5] = p[1] + 1;
         int var1 = 8192;
         if ((a.c[var0[12]][3] & 4) != 0) {
            var1 = -((a(a.c[var0[12]], true)[1] << 12) / a.g);
         }

         var0[6] = var1;
      }

   }

   public static final void k(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      boolean var4 = false;
      byte var5;
      switch(y >> 1 & 3) {
      case 0:
         var5 = 0;
         break;
      case 1:
         var5 = 5;
         break;
      case 2:
         var5 = 3;
         break;
      default:
         var5 = 6;
      }

      if (l(184)) {
         a(var2, var3, 184, 0, 0, var5, var1);
      }

   }

   public static final void b(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0;
      o[w][5] = var1;
      o[w][6] = var2;
      o[w][7] = 0;
      o[w][8] = 0;
      o[w][9] = 0;
      o[w][10] = 15;
      o[w][11] = 4;
      o[w][12] = HG.c();
      H[0] = var3;
      H[1] = var4;
      H[2] = var5;
      a.a(o[w], var0 >> 12, var1 >> 12);
      ++w;
      w %= 8;
   }

   public static final void j(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      int var4;
      if (b(182, 0) && (var4 = 15 - var0[10]) < b[2004]) {
         a(var2, var3, 182, 0, var4, 0, var1);
      }

   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0;
      o[w][5] = var1;
      o[w][6] = var2;
      o[w][7] = 0;
      o[w][8] = 0;
      o[w][9] = 0;
      o[w][10] = 24;
      o[w][11] = 6;
      o[w][12] = 0;
      S[0] = var3;
      S[1] = var4;
      S[2] = var5;
      a.a(o[w], var0 >> 12, var1 >> 12);
      ++w;
      w %= 8;
   }

   public static final void g(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      int var4;
      if (b(174, 0) && (var4 = 24 - var0[10]) < b[1916]) {
         a(var2, var3, 174, 0, var4, 0, var1);
      }

   }

   public static final void a(int var0, int var1, int var2, int var3) {
      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0;
      o[w][5] = var1;
      o[w][6] = var2;
      o[w][7] = 0;
      o[w][8] = 0;
      o[w][9] = 0;
      o[w][10] = 16;
      o[w][11] = 8;
      o[w][12] = var3;
      a.a(o[w], var0 >> 12, var1 >> 12);
      ++w;
      w %= 8;
   }

   public static final void f(int[] var0) {
      if (var0[12] != -1) {
         a.c(a.c[var0[12]], R);
         R[1] = a.c(a.c[var0[12]]) + 1;
         var0[4] = R[0];
         var0[5] = R[1] + 1;
      }

   }

   public static final void b(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      int var4;
      if (b(183, 0) && (var4 = 16 - var0[10]) < b[2015]) {
         a(var2, var3, 183, 0, var4, 0, var1);
      }

   }

   public static final void h(int var0, int var1, int var2) {
      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0;
      o[w][5] = var1;
      o[w][6] = 0;
      o[w][7] = 0;
      o[w][8] = 0;
      o[w][9] = 0;
      o[w][10] = 24;
      o[w][11] = 9;
      o[w][12] = var2;

      for(int var3 = 0; var3 < 60; var3 += 6) {
         b[w][var3 + 0] = (short)(HG.e(4096) - 2048);
         b[w][var3 + 1] = (short)(HG.e(4096) - 2048);
         b[w][var3 + 2] = (short)(HG.e(8192) + 0);
         b[w][var3 + 3] = 0;
         b[w][var3 + 4] = 0;
         b[w][var3 + 5] = 0;
      }

      a.a(o[w], var0 >> 12, var1 >> 12);
      ++w;
      w %= 8;
   }

   public static final void i(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);

      for(int var2 = 0; var2 < 60; var2 += 6) {
         short[] var10000 = b[var1];
         var10000[var2 + 2] = (short)(var10000[var2 + 2] + 256);
         if (b[var1][var2 + 2] > 8192) {
            b[var1][var2 + 2] = (short)(0 + HG.e(256));
         }
      }

      if (var0[12] != -1) {
         a.c(a.c[var0[12]], b);
         b[1] = a.c(a.c[var0[12]]) + 1;
         var0[4] = b[0];
         var0[5] = b[1] + 1;
      }

   }

   public static final void h(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      short var4 = (short)((var0[2] & -65536) >> 16);

      for(int var5 = 0; var5 < 60; var5 += 6) {
         int var6 = (8192 - b[var4][var5 + 2] - 0) * var0[10];
         int var7 = 196608;
         int var8 = (210 * var6 + 113 * (var7 - var6)) / var7 << 16 | (255 * var6 + 141 * (var7 - var6)) / var7 << 8 | (253 * var6 + 140 * (var7 - var6)) / var7;
         var1.setColor(var8);
         int var9 = var2 + (b[var4][var5 + 0] * a.g >> 12);
         int var10 = var3 + (b[var4][var5 + 1] * a.g >> 12) - (b[var4][var5 + 2] * a.g >> 12);
         var1.fillRect(var9, var10, 1, 8);
      }

   }

   public static final void e(int var0, int var1) {
      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0 + HG.e(8192) - 4096;
      o[w][5] = var1 + HG.e(8192) - 4096;
      o[w][6] = 16384;
      o[w][7] = 0;
      o[w][8] = 0;
      o[w][9] = 0;
      o[w][10] = 40;
      o[w][11] = 10;
      o[w][12] = 0;
      a.a(o[w], var0 >> 12, var1 >> 12);
      ++w;
      w %= 8;
   }

   public static final void c(int[] var0) {
      if (var0[6] >= 0) {
         int var1 = var0[4] + (var0[6] >> 1);
         int var2 = var0[5];
         int var3 = var0[6];
         var0[6] += -2048;
         if (var0[6] < 0) {
            a(var1, var2, var3, var0[4] - var1, var0[5] - var2, var0[6] - var3);
         }

      }
   }

   public static final void a(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) + (var0[6] * a.g >> 12 >> 1) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      boolean var4 = false;
      if (var0[6] >= 0) {
         int var7 = var2 + (-2048 * a.g >> 12 >> 1);
         int var8 = var3 - (-2048 * a.g >> 12);
         if (l(173)) {
            a(var2, var3, 173, 0, 0, var7 - var2, var8 - var3, var1);
         }

      }
   }

   public static final void d(int var0, int var1, int var2) {
      int var3 = 8192;
      if (var2 != -1 && (a.c[var2][3] & 4) != 0) {
         var3 = -((a(a.c[var2], true)[1] << 12) / a.g);
      }

      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0;
      o[w][5] = var1;
      o[w][6] = var3;
      o[w][7] = 0;
      o[w][8] = 512;
      o[w][9] = 0;
      o[w][10] = 20;
      o[w][11] = 11;
      o[w][12] = var2;
      a.a(o[w], var0 >> 12, var1 >> 12);
      ++w;
      w %= 8;
   }

   public static final void b(int[] var0) {
      var0[6] += 512;
      var0[7] += var0[8];
      if (var0[7] < 0) {
         var0[8] += 128;
      } else {
         var0[8] -= 128;
      }
   }

   public static final void f(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) + (var0[7] * a.g >> 12) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      if (l(178)) {
         a(var2, var3, 178, 0, var1);
      }

   }

   public static final void g(int var0, int var1, int var2) {
      int[] var10000 = o[w];
      var10000[3] &= -65537;
      o[w][4] = var0;
      o[w][5] = var1;
      o[w][6] = 0;
      o[w][7] = 0;
      o[w][8] = 0;
      o[w][9] = 0;
      o[w][10] = 20;
      o[w][11] = 13;
      o[w][12] = var2;

      for(int var3 = 0; var3 < 60; var3 += 6) {
         b[w][var3 + 0] = (short)(HG.e(4096) - 2048);
         b[w][var3 + 1] = (short)(HG.e(4096) - 2048);
         b[w][var3 + 2] = (short)(HG.e(12288) + 0);
         b[w][var3 + 3] = 0;
         b[w][var3 + 4] = 0;
         b[w][var3 + 5] = 0;
      }

      a.a(o[w], var0 >> 12, var1 >> 12);
      ++w;
      w %= 8;
   }

   public static final void h(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);

      for(int var2 = 0; var2 < 60; var2 += 6) {
         short[] var10000 = b[var1];
         var10000[var2 + 2] = (short)(var10000[var2 + 2] + 1024);
         if (b[var1][var2 + 2] > 12288) {
            b[var1][var2 + 2] = (short)(0 + HG.e(256));
         }
      }

      if (var0[12] != -1) {
         a.c(a.c[var0[12]], L);
         L[1] = a.c(a.c[var0[12]]) + 1;
         var0[4] = L[0];
         var0[5] = L[1] + 1;
      }

   }

   public static final void i(int[] var0, Graphics var1) {
      int var2 = (var0[4] * a.g >> 12) - q;
      int var3 = (var0[5] * a.g >> 12) - (var0[6] * a.g >> 12) - c;
      short var4 = (short)((var0[2] & -65536) >> 16);

      for(int var5 = 0; var5 < 60; var5 += 6) {
         int var6 = (12288 - b[var4][var5 + 2] - 0) * var0[10];
         int var7 = 245760;
         int var8 = (255 * var6 + 128 * (var7 - var6)) / var7 << 16 | (255 * var6 + 128 * (var7 - var6)) / var7 << 8 | (0 * var6 + 0 * (var7 - var6)) / var7;
         var1.setColor(var8);
         int var9 = var2 + (b[var4][var5 + 0] * a.g >> 12);
         int var10 = var3 + (b[var4][var5 + 1] * a.g >> 12) - (b[var4][var5 + 2] * a.g >> 12);
         var1.fillRect(var9, var10, 1, 8);
      }

   }

   public static final void Z() {
      if (o(3)) {
         try {
            HG.h(3);
            d = HG.a.readLong();
            HG.a = null;
            HG.a = null;
            HG.a = null;
            HG.a = null;
         } catch (Exception var1) {
            HG.a = null;
            HG.a = null;
            HG.a = null;
            HG.a = null;
         }
      }

      if (o(2)) {
         try {
            HG.h(2);
            a = HG.a.readLong();
            HG.a = null;
            HG.a = null;
            HG.a = null;
            HG.a = null;
            return;
         } catch (Exception var2) {
            HG.a = null;
            HG.a = null;
            HG.a = null;
            HG.a = null;
         }
      }

   }

   public static final boolean e(int var0) {
      try {
         HG.k();
         if (var0 == 3) {
            d = System.currentTimeMillis();
            HG.a.writeLong(d);
         } else {
            a = System.currentTimeMillis();
            HG.a.writeLong(a);
         }

         if (O[11] == -1) {
            O[11] = 0;
            O[0] = (short)b[0][3] & '\uffff' | (short)b[0][4] << 16 & -65536;
         }

         HG.a(O);
         HG.a(k);
         HG.a(C);
         HG.a(B);
         HG.a(u);
         HG.a(J);
         HG.a(K);
         HG.a(x);
         HG.a(s);
         HG.a(E);

         int var1;
         for(var1 = 0; var1 < 6; ++var1) {
            for(int var2 = 0; var2 < 15; ++var2) {
               HG.a(a[var1][var2]);
            }
         }

         var1 = 0;

         while(true) {
            if (var1 >= 19) {
               HG.e(var0);
               break;
            }

            HG.a(s[var1]);
            ++var1;
         }
      } catch (Exception var3) {
         HG.a = null;
         HG.a = null;
         HG.a = null;
         HG.a = null;
         return false;
      }

      HG.a = null;
      HG.a = null;
      HG.a = null;
      HG.a = null;
      return true;
   }

   public static final boolean d(int var0) {
      if (o(var0)) {
         try {
            HG.h(var0);
            HG.a.readLong();
            O = HG.b();
            k = HG.b();
            C = HG.b();
            B = HG.b();
            u = HG.b();
            J = HG.b();
            K = HG.b();
            x = HG.b();
            s = HG.b();
            E = HG.b();
            a = new int[6][15][];

            int var1;
            for(var1 = 0; var1 < 6; ++var1) {
               for(int var2 = 0; var2 < 15; ++var2) {
                  a[var1][var2] = HG.b();
               }
            }

            s = new int[19][];

            for(var1 = 0; var1 < 19; ++var1) {
               s[var1] = HG.b();
            }

            HG.a = null;
            HG.a = null;
            HG.a = null;
            HG.a = null;
            return true;
         } catch (Exception var3) {
            HG.a = null;
            HG.a = null;
            HG.a = null;
            HG.a = null;
            return false;
         }
      } else {
         return false;
      }
   }

   public static final boolean o(int var0) {
      return HG.c(var0);
   }

   public c(HG var1) {
      super(false);
      a = var1;
      this.setFullScreenMode(true);
      aA = this.getWidth();
      l = this.getHeight();
   }

   public final void paint(Graphics var1) {
   }

   public final void l(Graphics var1) {
      f(var1);
      if (HG.l) {
         HG.a(var1);
         if (!y) {
            if (q) {
               v(var1);
            }

            if (t) {
               m(var1);
            }
         }
      }

   }

   public static final void V() {
      if (a(90) && (!A || A && y)) {
         y = !y;
         if (y) {
            G();
         } else {
            a();
         }
      }

      int var0;
      if (y) {
         for(var0 = 0; var0 < 20; ++var0) {
            if (d[var0] == 20) {
               e = (e << 4) + (long)var0;
               if (d()) {
                  e = 0L;
               }
            }
         }
      } else if (t) {
         ac();
      } else if (q) {
         Q();
      } else if (j && !p) {
         z();
      } else if (r && !p) {
         w();
      } else if (h && !p) {
         ab();
      } else {
         short var11;
         if (HG.l) {
            if (HG.c >= 0 && HG.j >= 0) {
               if ((var11 = HG.a[HG.c][(HG.j << 2) + 2]) != 107 && var11 != 106) {
                  if (a(60)) {
                     HG.e();
                  }

                  if (a(55)) {
                     HG.m();
                  }
               } else {
                  if (a(61)) {
                     HG.m();
                  }

                  if (a(62)) {
                     HG.e();
                  }
               }
            }

            if (HG.c != 19) {
               if (HG.c == 21) {
                  if (HG.b(6)) {
                     if (a(112) && HG.j >= 0) {
                        var0 = HG.a[HG.c][HG.j * 4 + 3] & 32767;
                        b = a.c[var0];
                        HG.B = HG.j - 1;
                        HG.q(27);
                     }

                     if (a(113) && HG.j >= 0) {
                        var0 = HG.a[HG.c][HG.j * 4 + 3] & 32767;
                        b = a.c[var0];
                        HG.B = HG.j - 1;
                        HG.q(19);
                     }
                  }

                  if (HG.d) {
                     if (a(61)) {
                        a.c();
                        HG.j = -1;
                        HG.a(HG.c);
                     }

                     if (a(62)) {
                        a.g();
                        HG.j = -1;
                        HG.a(HG.c);
                     }
                  }
               } else if (HG.c == 24) {
                  if (HG.b(6) && a(112)) {
                     HG.q(6);
                     if (HG.c == 20) {
                        HG.q(6);
                     }
                  }
               } else if (HG.c == 23) {
                  if (a(61)) {
                     --HG.m;
                     if (HG.m < 0) {
                        HG.m = 3;
                     }

                     HG.a(HG.c);
                  }

                  if (a(62)) {
                     ++HG.m;
                     if (HG.m >= 4) {
                        HG.m = 0;
                     }

                     HG.a(HG.c);
                  }
               } else if (HG.c == 25) {
                  if (a(61)) {
                     --HG.h;
                     if (HG.h < 1) {
                        HG.h = 2;
                     }

                     HG.a(HG.c);
                  }

                  if (a(62)) {
                     ++HG.h;
                     if (HG.h >= 3) {
                        HG.h = 1;
                     }

                     HG.a(HG.c);
                  }
               }
            } else {
               if (a(61)) {
                  --HG.a;
                  if (HG.a < 0) {
                     HG.a = 5;
                  }

                  HG.j = -1;
                  HG.a(HG.c);
               }

               if (a(62)) {
                  ++HG.a;
                  if (HG.a >= 6) {
                     HG.a = 0;
                  }

                  HG.j = -1;
                  HG.a(HG.c);
               }

               if (HG.b(6)) {
                  if (a(110) && HG.j >= 0) {
                     HG.c = HG.a[HG.c][HG.j * 4 + 3] & 32767;
                     b = a[HG.a][HG.c];
                     boolean var12 = true;
                     if (HG.a == 2 && r[HG.b[4]][3] == 0) {
                        var12 = false;
                     }

                     if (var12) {
                        HG.q(14);
                     }
                  }

                  if (a(111)) {
                     byte var13;
                     if (HG.a != 5 && HG.a != 4 && O[11] != 0) {
                        if ((HG.v & 1) != 0) {
                           var13 = 22;
                        } else {
                           var13 = 13;
                        }
                     } else {
                        var13 = -1;
                     }

                     if (HG.j >= 0 && var13 >= 0) {
                        HG.c = HG.a[HG.c][HG.j * 4 + 3] & 32767;
                        b = a[HG.a][HG.c];
                        HG.q(var13);
                     }
                  }

                  if (a(112) && HG.j >= 0) {
                     HG.c = HG.a[HG.c][HG.j * 4 + 3] & 32767;
                     b = a[HG.a][HG.c];
                     HG.d = a.a(HG.b);
                     HG.q(27);
                  }

                  if (a(114) && HG.j >= 0) {
                     HG.c = HG.a[HG.c][HG.j * 4 + 3] & 32767;
                     b = a[HG.a][HG.c];
                     if (HG.a != 1 && HG.a != 5 && (HG.v & 1) == 0 && (HG.a != 2 || r[HG.b[4]][3] != 0)) {
                        HG.q(15);
                     }
                  }
               }
            }

            if (a(80)) {
               if (HG.E >= 0) {
                  HG.q(HG.E);
               } else {
                  HG.g();
               }
            }

            if (a(65)) {
               HG.g();
            }

            if (a(85)) {
               if (HG.s >= 0) {
                  HG.q(HG.s);
               } else {
                  HG.l();
               }
            }

            if (a(109) && ((HG.v & 2) != 0 || (HG.v & 1) != 0)) {
               if (HG.c == 21) {
                  HG.g(19);
               } else if ((HG.v & 1) != 0) {
                  HG.g(21);
               }
            }
         } else if (a(50)) {
            HG.a.removeAllElements();
            HG.g(14);
            HG.l = true;
         } else if (!p) {
            switch(H) {
            case 6:
               if (a(45)) {
                  if (P >= 0) {
                     a(10, 0, 0, 0, 0, true);
                     a.a(HG.a, P, W, au, false);
                     (new Thread(a)).start();
                  } else if ((short)(O[12] & '\uffff') > 0) {
                     HG.a.removeAllElements();
                     HG.g(18);
                     HG.l = true;
                  }
               } else {
                  label472: {
                     if (a(65)) {
                        if (P >= 0) {
                           a(10, 0, 0, 0, 0, true);
                           a.a(HG.a, P, W, au, false);
                           (new Thread(a)).start();
                           break label472;
                        }

                        if (b >= 0 && ac == -1) {
                           int var5;
                           int[] var10000;
                           switch(b) {
                           case 0:
                              i(ag);
                              b = -1;
                              ag = -1;
                              c((short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
                              break;
                           case 1:
                              var11 = (short)((a.c[ag][2] & -65536) >> 16);
                              short var1 = (short)(O[0] & '\uffff');
                              short var2 = (short)((O[0] & -65536) >> 16);
                              short var3 = (short)(q[var11][0] & '\uffff');
                              short var4 = (short)((q[var11][0] & -65536) >> 16);
                              if (var2 > var4) {
                                 var10000 = q[var11];
                                 var10000[27] &= -65536;
                                 var10000 = q[var11];
                                 var10000[27] |= 2;
                              } else if (var2 < var4) {
                                 var10000 = q[var11];
                                 var10000[27] &= -65536;
                                 var10000 = q[var11];
                                 var10000[27] |= 0;
                              } else if (var1 < var3) {
                                 var10000 = q[var11];
                                 var10000[27] &= -65536;
                                 var10000 = q[var11];
                                 var10000[27] |= 3;
                              } else {
                                 var10000 = q[var11];
                                 var10000[27] &= -65536;
                                 var10000 = q[var11];
                                 var10000[27] |= 1;
                              }

                              if (!a(9, var11, 0, 0, 0, false)) {
                                 var5 = a(a.c[ag])[13];
                                 int var14 = 0;
                                 byte var15 = 114;
                                 n = -1;
                                 if ((var5 & 8) != 0) {
                                    var14 = HG.b(114, 116);
                                    var15 = 125;
                                 } else if ((var5 & 4) != 0) {
                                    var14 = HG.b(111, 113);
                                    var15 = 114;
                                 } else if ((var5 & 2) != 0) {
                                    var14 = HG.b(108, 110);
                                    var15 = 116;
                                 } else if ((var5 & 1) != 0) {
                                    var14 = HG.b(104, 107);
                                    var15 = 116;
                                 }

                                 if (a(q[var11])[0] == 149) {
                                    var15 = 123;
                                 }

                                 e = true;
                                 a(var15, var14, (int[])null);
                              }
                           case 2:
                           default:
                              break;
                           case 3:
                           case 4:
                           case 5:
                           case 6:
                              var5 = a.b();
                              byte var6 = (byte)(a.c[ag][8] >> 8 & 255);
                              if ((var5 & 1 << var6) == 0) {
                                 byte var7 = (byte)(a.c[ag][8] >> 16 & 255);
                                 byte var8 = (byte)(a.c[ag][8] >> 24 & 255);
                                 if ((var5 & 1 << var6 + 1) != 0) {
                                    if (var7 > 0) {
                                       for(int var9 = 0; var9 < a[5].length; ++var9) {
                                          int var10;
                                          if ((var10 = a[5][var9][4]) >= 0 && c[var10][4] == var7) {
                                             var5 |= 1 << var6;
                                             a(12, 7, (short)((a.c[ag][2] & -65536) >> 16), (byte)(a.c[ag][8] & 255), 0, false);
                                             a(a.c[ag], false);
                                             if ((byte)(a.c[ag][8] & 255) == 5) {
                                                var10000 = a.c[ag];
                                                var10000[3] |= 32768;
                                                b(a.c[ag], true);
                                                n = true;
                                             }

                                             HG.m(9);
                                             var8 = 0;
                                             a.a(var5);
                                             break;
                                          }
                                       }

                                       if ((var5 & 1 << var6) == 0) {
                                          HG.m(31);
                                          a(12, 7, (short)((a.c[ag][2] & -65536) >> 16), 1, 0, false);
                                       }
                                    }

                                    if (var8 > 0) {
                                       h(ag);
                                       if (I == 0) {
                                          HG.m(31);
                                       }
                                    }
                                 } else if (var7 <= 0 && var8 <= 0) {
                                    var5 |= 1 << var6;
                                    a(12, 7, (short)((a.c[ag][2] & -65536) >> 16), (byte)(a.c[ag][8] & 255), 0, false);
                                    a(a.c[ag], false);
                                    if ((byte)(a.c[ag][8] & 255) == 5) {
                                       var10000 = a.c[ag];
                                       var10000[3] |= 32768;
                                       b(a.c[ag], true);
                                       n = true;
                                    }

                                    HG.m(9);
                                 } else {
                                    var5 |= 1 << var6 + 1;
                                    a(12, 7, (short)((a.c[ag][2] & -65536) >> 16), 1, 0, false);
                                    HG.m(31);
                                 }
                              }

                              a.a(var5);
                              c((short)(O[0] & '\uffff'), (short)((O[0] & -65536) >> 16));
                              break;
                           case 7:
                              if (!a(12, 7, (short)((a.c[ag][2] & -65536) >> 16), 8, 0, false)) {
                                 if ((a.c[ag][3] & 32) != 0 && (a.c[ag][13] & 2) == 0) {
                                    HG.G = a.a();
                                 } else {
                                    HG.G = 0;
                                 }

                                 HG.a.removeAllElements();
                                 HG.g(21);
                                 HG.l = true;
                              }
                           }

                           y();
                           A();
                        }
                     }

                     if (a(35)) {
                        f = true;
                     }

                     if (a(15)) {
                        d = true;
                     }

                     if (a(20)) {
                        u = true;
                     }

                     if (a(25)) {
                        l = true;
                     }

                     if (a(30)) {
                        b = true;
                     }

                     if (a(33)) {
                        l = true;
                        d = true;
                     }

                     if (a(34)) {
                        l = true;
                        u = true;
                     }

                     if (a(31)) {
                        b = true;
                        d = true;
                     }

                     if (a(32)) {
                        b = true;
                        u = true;
                     }

                     if (a(100)) {
                        c = true;
                     }

                     if (a(95) && (short)(O[12] & '\uffff') > 0) {
                        h = true;
                        f();
                     }
                  }
               }
            }
         }
      }

      M();
   }

   public final void hideNotify() {
      G();
   }

   public final void showNotify() {
   }

   public static final void a() {
      y = false;
      HG.c();
      e = 0L;
   }

   public static final void G() {
      if (H > 3) {
         y = true;
      }

      if (HG.b(1)) {
         HG.n();
      } else {
         HG.h();
      }
   }

   public final void run() {
      for(; k; g = System.currentTimeMillis()) {
         V();
         if (!y) {
            this.ad();
         }

         if (HG.b) {
            HG.a();
         }

         this.l(this.a);
         this.flushGraphics();
         System.gc();
         long var1 = System.currentTimeMillis() - g;
         ++y;
         if (y == 100000) {
            y = 0;
         }

         if (var1 < 100L) {
            try {
               Thread.sleep(100L - var1);
            } catch (Exception var5) {
            }
         }
      }

      for(int var6 = 0; var6 < aj; ++var6) {
         int var4 = b(d[var6][0]);
         if (e[var4] == 5) {
            e[var4] = 10;
         }
      }

   }

   public final void sizeChanged(int var1, int var2) {
      aA = var1;
      l = var2;
   }

   public final void i(int var1) {
      Runtime.getRuntime();
      long var3 = 0L;
      long var5 = 0L;
      long var7 = 0L;
      HG.b();
      HG.a[4] = true;
      String var9 = null;
      if ((var9 = System.getProperty("microedition.locale")) != null) {
         var9 = var9.toUpperCase();
      }

      HG.a(var9);
      e = HG.a((int)396);
      g = HG.a((int)407);
      g = g + "\n" + HG.a((int)408);
      g = g + " " + HG.a((int)298);
      HG.b();
      Z();
      switch(var1) {
      case 1:
         P();
         r();
         HG.j();
         l(159);
      default:
      }
   }

   static {
      aj = d.length;
      e = new byte[aj];
      d = new byte[20];
      c = new byte[20];
      f = new short[165];
      g = new short[45];
      c = new short[15];
      a = new String[1];
      O = null;
      a = (int[][][])null;
      q = (int[][])null;
      a = (int[][])null;
      i = (int[][])null;
      e = (int[][])null;
      n = (int[][])null;
      p = (int[][])null;
      l = (int[][])null;
      r = (int[][])null;
      d = (int[][])null;
      k = null;
      c = (int[][])null;
      x = (int[][])null;
      w = (int[][])null;
      g = (int[][])null;
      y = (int[][])null;
      h = (int[][])null;
      f = (int[][])null;
      u = (int[][])null;
      M = null;
      b = (int[][])null;
      s = (int[][])null;
      C = null;
      B = null;
      u = null;
      J = null;
      K = null;
      x = null;
      s = null;
      E = null;
      D = null;
      j = (int[][])null;
      o = (int[][])null;
      b = (short[][])null;
      t = 0;
      Z = 0;
      e = 0;
      ab = 3;
      v = false;
      d = null;
      e = null;
      g = null;
      a = false;
      l = new int[3];
      y = new int[2];
      h = false;
      r = false;
      z = false;
      R = 4;
      x = 4;
      p = 0;
      Y = 0;
      X = 0;
      am = 0;
      ag = -1;
      b = -1;
      T = -1;
      o = 0;
      i = "";
      ak = 126;
      j = new int[7];
      l = false;
      b = false;
      d = false;
      u = false;
      f = false;
      c = false;
      ac = 0;
      g = false;
      C = 0;
      i = false;
      m = false;
      d = -1;
      ay = -1;
      Q = new int[]{2, 3, 4};
      i = new int[]{5};
      z = new int[]{6, 7};
      F = new int[]{0, 1, 31, 32, 33};
      r = new int[]{34, 35};
      a = new int[]{9, 10, 13, 14, 17, 18, 22, 23, 24, 25, 26, 28, 29, 30};
      P = new int[]{0, 0};
      U = new int[]{0, 0};
      I = new int[]{0, 0};
      g = new int[2];
      n = false;
      b = new int[0][][];
      d = new short[]{100, 1, 101, 0, 102, 0, 103, 0, 104, 0, 105, 0, 106, 0, 107, 0};
      a = new byte[]{4, 5, 6, 7, -1, -1, -1, -1, 4, 5, 6, 7, 4, 5, 6, 7, 4};
      a = new byte[][]{{0, 1, 5, 4, 2, 3, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 1, 5, 4, 2, 3, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 1, 5, 4, 2, 3, 0}, {0, 1, 5, 4, 2, 3, 0}};
      a = new short[4];
      b = (byte[][])null;
      t = (int[][])null;
      k = new int[4][20];
      h = 0;
      B = 0;
      N = 0;
      ai = 0;
      A = 0;
      G = new int[7];
      T = new int[]{9133598, 0, 11908783, 4474695, 2048, 4096, 256, 9133598, 0, 4474695, 11908783, 1024, 4096, 128};
      o = new int[2];
      h = new int[2];
      t = false;
      A = false;
      c = null;
      h = "";
      b = "";
      M = -1;
      Q = -1;
      ae = -1;
      K = -1;
      az = -1;
      a = 0;
      j = 0;
      ap = 0;
      J = 0;
      L = 0;
      aw = -1;
      U = 0;
      S = -1;
      V = null;
      g = -1;
      q = false;
      a = new Vector();
      b = null;
      ax = 0;
      i = 0;
      F = 0;
      al = 0;
      n = -1;
      e = null;
      B = false;
      o = true;
      b = -1L;
      ah = 0;
      as = 0;
      r = 0;
      z = 0;
      v = -1;
      ao = 0;
      at = -1;
      ar = -1;
      af = 0;
      m = 0;
      aa = 1;
      w = false;
      e = false;
      a = new Hashtable();
      a = 0;
      D = 0;
      O = 0;
      k = 0;
      I = 0;
      an = 0;
      j = false;
      f = "";
      v = (int[][])null;
      m = (int[][])null;
      s = false;
      n = new int[4];
      w = new int[2];
      t = new int[2];
      w = 0;
      new Random();
      P = -1;
      av = -1;
      W = -1;
      au = -1;
      N = new int[2];
      v = new int[2];
      A = new int[2];
      c = new int[2];
      f = new int[2];
      p = new int[2];
      H = new int[3];
      S = new int[3];
      R = new int[2];
      b = new int[2];
      L = new int[2];
      d = -1L;
      a = -1L;
   }
}
