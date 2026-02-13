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

public class A extends GameCanvas implements Runnable {
   static HG a;
   static boolean b = true;
   static boolean c = false;
   static long d;
   static Thread e = null;
   static int f = 0;
   static int g = 0;
   static long h = 0L;
   static int[] i;
   static Font[] j;
   static long k = 0L;
   static long l = -1L;
   static Image m = null;
   static int n = 0;
   static int o = 0;
   static boolean p = false;
   static boolean q = false;
   static C r;
   Graphics s = this.getGraphics();
   static int t = -1;
   static final byte[][] u = new byte[][]{{15, 15, 0, 7}, {20, 15, 3, 13}, {25, 15, 1, 9}, {30, 15, 2, 11}, {31, 15, 8}, {32, 15, 14}, {33, 15, 6}, {34, 15, 12}, {35, 15, 4, 10}, {50, 0, 17}, {45, 0, 18}, {40, 0, 5}, {55, 0, 0, 7}, {60, 0, 3, 13}, {61, 0, 1, 9}, {62, 0, 2, 11}, {65, 0, 4, 10}, {85, 0, 17}, {80, 0, 18}, {90, 0, 5}, {95, 0, 15}, {100, 0, 16}, {101, 0, 6}, {102, 0, 7}, {103, 0, 8}, {104, 0, 9}, {115, 0, 10}, {105, 0, 11}, {106, 0, 12}, {107, 0, 13}, {108, 0, 14}, {109, 0, 16}, {110, 0, 6}, {111, 0, 8}, {112, 0, 12}, {113, 0, 14}, {114, 0, 15}, {116, 15, 0}, {117, 15, 3}, {118, 0, 5}};
   static int v;
   static byte[] w;
   static byte[] x;
   static byte[] y;
   static short[] z;
   static short[] aa;
   static short[] ba;
   static String[] ca;
   static int[] da;
   static int[][][] ea;
   static int[][] fa;
   static int[][] ga;
   static int[][] ha;
   static int[][] ia;
   static int[][] ja;
   static int[][] ka;
   static int[][] la;
   static int[][] ma;
   static int[][] na;
   static int[] oa;
   static int[][] pa;
   static int[][] qa;
   static int[][] ra;
   static int[][] sa;
   static int[][] ta;
   static int[][] ua;
   static int[][] va;
   static int[][] wa;
   static int[] xa;
   static int[][] ya;
   static int[][] za;
   static int[] aA;
   static int[] bA;
   static int[] cA;
   static int[] dA;
   static int[] eA;
   static int[] fA;
   static int[] gA;
   static int[] hA;
   static int[] iA;
   static int[][] jA;
   static int[][] kA;
   static short[][] lA;
   static int mA;
   static int nA;
   public static int oA;
   public static int pA;
   static boolean qA;
   private static int[] rA;
   private static String sA;
   private static String tA;
   static Image uA;
   static Graphics vA;
   static int wA;
   static int xA;
   static int yA;
   static int zA;
   static boolean ab;
   static int[] bb;
   static int[] cb;
   static boolean db;
   static boolean eb;
   static boolean fb;
   static int gb;
   static int hb;
   static short[] ib;
   static short jb;
   static short kb;
   static short lb;
   static short mb;
   static String nb;
   static String ob;
   static int pb;
   static int qb;
   static int rb;
   static int sb;
   static int tb;
   static int ub;
   static int vb;
   static int wb;
   static String xb;
   public static int yb;
   static int[] zb;
   public static boolean aB;
   public static boolean bB;
   public static boolean cB;
   public static boolean dB;
   public static boolean eB;
   public static boolean fB;
   private static int gB;
   private static boolean hB;
   private static int iB;
   private static boolean jB;
   private static boolean kB;
   private static int lB;
   private static int mB;
   public static int[] nB;
   public static int[] oB;
   public static int[] pB;
   public static int[] qB;
   public static int[] rB;
   public static int[] sB;
   static int tB;
   static int uB;
   static int vB;
   static int wB;
   static int[] xB;
   static int[] yB;
   static int[] zB;
   private static int[] ac;
   static boolean bc;
   public static short[] cc;
   public static short[][] dc;
   public static Image[][] ec;
   public static int[] fc;
   public static int[][][] gc;
   private static int hc;
   private static int ic;
   private static byte[] jc;
   private static DataInputStream kc;
   static byte[] lc;
   static byte[] mc;
   public static short[] nc;
   public static byte[] oc;
   public static byte[][] pc;
   public static byte[][][][] qc;
   public static byte[][][][] rc;
   public static byte[][][] sc;
   public static short[][][][][] tc;
   public static short[][] uc;
   public static byte[][][] vc;
   public static int[][][][] wc;
   public static byte[][] xc;
   public static Image[][][] yc;
   public static byte[][][] zc;
   private static short[] aC;
   static byte[][] bC;
   static int[][] cC;
   static int[][] dC;
   static int eC;
   static int fC;
   static int gC;
   static int hC;
   static int iC;
   static int[] jC;
   public static int[] kC;
   private static int[] lC;
   private static int[] mC;
   static boolean nC;
   static boolean oC;
   static String[] pC;
   static String qC;
   static String rC;
   static int sC;
   static int tC;
   static int uC;
   static int vC;
   static int wC;
   static int xC;
   static int yC;
   static int zC;
   static int ad;
   static int bd;
   static int cd;
   static int dd;
   static int ed;
   static int[] fd;
   static int gd;
   static boolean hd;
   static Vector id;
   static String[] jd;
   static int kd;
   static int ld;
   static int md;
   static int nd;
   static int od;
   static int[] pd;
   static boolean qd;
   static boolean rd;
   static long sd;
   static int td;
   static int ud;
   static int vd;
   static int wd;
   static int xd;
   static int yd;
   static int zd;
   static int aD;
   static int bD;
   static int cD;
   static int dD;
   static boolean eD;
   static boolean fD;
   private static Hashtable gD;
   private static byte hD;
   static int iD;
   static int jD;
   static int kD;
   static int lD;
   static int mD;
   static boolean nD;
   static String oD;
   public static int[][] pD;
   public static int[][] qD;
   public static boolean rD;
   private static int[] sD;
   public static int[] tD;
   public static int[] uD;
   public static int vD;
   static String wD;
   static int xD;
   public static int yD;
   public static int zD;
   public static int ae;
   public static int be;
   static int[] ce;
   static int[] de;
   static int[] ee;
   static int[] fe;
   static int[] ge;
   private static int[] he;
   private static int[] ie;
   private static int[] je;
   public static int[] ke;
   private static final int[] le;
   private static int[] me;
   public static long ne;
   public static long oe;

   public void A(int var1) {
      this.B();
      t = var1;
      this.A();
   }

   public void A() {
      switch(t) {
      case 1:
         G();
         break;
      case 2:
         m = null;
         HG.gA = false;
         HG.dA = 0;
         HG.iA = -1;
         D();
         HG.M(0);
         break;
      case 5:
         HG.LA(0);
      }

   }

   public void B() {
   }

   public void C() {
      switch(t) {
      case 1:
         if ((System.currentTimeMillis() >= k + 3000L || k == 0L) && n < 2) {
            k = System.currentTimeMillis();

            try {
               m = Image.createImage("/s0" + n + "." + "png");
            } catch (Exception var2) {
            }

            ++n;
            if (n == 2) {
               k = 0L;
               r = new C();
               r.A(HG.cb, 1);
               (new Thread(r)).start();
               l = -1L;
            }
         }

         if (r != null && C.c >= 100) {
            if (l < 0L) {
               l = System.currentTimeMillis() + 1000L;
            }

            if (l < System.currentTimeMillis()) {
               this.A(5);
               HG.gA = true;
               HG.LA(17);
            }
         }
         break;
      case 2:
         if (System.currentTimeMillis() >= k + 3000L || k == 0L) {
            k = System.currentTimeMillis();

            try {
               if (n < 10) {
                  m = Image.createImage("/s0" + n + "." + "png");
               } else {
                  m = Image.createImage("/s" + n + "." + "png");
               }

               ++n;
            } catch (Exception var4) {
               if (!p) {
                  W(159);
                  m = ec[159][0];
                  p = true;
                  ++n;
               } else {
                  m = null;
                  ec[159] = null;
                  this.A(5);
                  HG.LA(0);
                  HG.gA = true;
               }
            }
         }
      case 3:
      case 5:
      default:
         break;
      case 4:
         HG.db.destroyApp(false);
         break;
      case 6:
         synchronized(r.h) {
            if (!HG.gA || HG.hA > 17) {
               TA();
               if (!nC && !hd) {
                  KA();
               }

               HA();
               JA();
               WA();
               NB();
               QB();
               JB();
            }
         }
      }

   }

   protected void keyPressed(int var1) {
      D();
      E();
      byte var2 = -1;
      switch(var1) {
      case -7:
         var2 = 17;
         break;
      case -6:
         var2 = 18;
         break;
      case -5:
         var2 = 4;
         break;
      case -4:
         var2 = 2;
         break;
      case -3:
         var2 = 1;
         break;
      case -2:
         var2 = 3;
         break;
      case -1:
         var2 = 0;
         break;
      case 35:
         var2 = 15;
         break;
      case 42:
         var2 = 16;
         break;
      case 48:
         var2 = 5;
         break;
      case 49:
         var2 = 6;
         break;
      case 50:
         var2 = 7;
         break;
      case 51:
         var2 = 8;
         break;
      case 52:
         var2 = 9;
         break;
      case 53:
         var2 = 10;
         break;
      case 54:
         var2 = 11;
         break;
      case 55:
         var2 = 12;
         break;
      case 56:
         var2 = 13;
         break;
      case 57:
         var2 = 14;
      }

      if (var2 >= 0) {
         if (t != 2 && t != 1) {
            if (t != 3) {
               x[var2] = 20;
               y[var2] = 0;
            }
         } else {
            k = 0L;
         }
      }

   }

   protected void keyRepeated(int var1) {
   }

   protected void keyReleased(int var1) {
      switch(var1) {
      case -7:
         y[17] = 10;
         break;
      case -6:
         y[18] = 10;
         break;
      case -5:
         y[4] = 10;
         break;
      case -4:
         y[2] = 10;
         break;
      case -3:
         y[1] = 10;
         break;
      case -2:
         y[3] = 10;
         break;
      case -1:
         y[0] = 10;
         break;
      case 35:
         y[15] = 10;
         break;
      case 42:
         y[16] = 10;
         break;
      case 48:
         y[5] = 10;
         break;
      case 49:
         y[6] = 10;
         break;
      case 50:
         y[7] = 10;
         break;
      case 51:
         y[8] = 10;
         break;
      case 52:
         y[9] = 10;
         break;
      case 53:
         y[10] = 10;
         break;
      case 54:
         y[11] = 10;
         break;
      case 55:
         y[12] = 10;
         break;
      case 56:
         y[13] = 10;
         break;
      case 57:
         y[14] = 10;
      }

   }

   static void D() {
      for(int var0 = 0; var0 < 20; ++var0) {
         y[var0] = 10;
      }

   }

   static void E() {
      int var0;
      for(var0 = 0; var0 < 20; ++var0) {
         if (x[var0] == 30 && (y[var0] == 10 || y[var0] == 40)) {
            x[var0] = 10;
            y[var0] = 0;
         }
      }

      for(int var7 = 0; var7 < v; ++var7) {
         byte[] var6 = u[var7];
         byte var8 = var6[0];
         int var5 = B(var8);
         int var4 = var6.length;
         boolean var3 = false;
         boolean var2 = false;

         for(int var1 = 2; var1 < var4; ++var1) {
            var8 = var6[var1];
            if (x[var8] == 20) {
               var2 = true;
            } else if (x[var8] == 30) {
               var3 = true;
            }
         }

         if (var2) {
            w[var5] = 5;
         } else if (var3) {
            w[var5] = 10;
         } else {
            w[var5] = 0;
         }
      }

      for(var0 = 0; var0 < 20; ++var0) {
         if (x[var0] == 20) {
            x[var0] = 30;
         }
      }

   }

   static int B(int var0) {
      int var3 = -1;

      for(int var2 = v - 1; var2 >= 0; --var2) {
         byte[] var1 = u[var2];
         if (var0 == var1[0]) {
            var3 = var2;
            break;
         }
      }

      return var3;
   }

   static boolean C(int var0) {
      boolean var1 = false;
      var0 = B(var0);
      if (var0 >= 0) {
         var1 = w[var0] == 5;
         if (!var1) {
            byte[] var2 = u[var0];
            boolean var3 = w[var0] == 10;
            if (var3) {
               var3 = var2[1] == 15;
               var1 = var3;
            }
         }
      }

      return var1;
   }

   static void F() {
      int var1 = w.length;

      for(int var0 = 0; var0 < var1; ++var0) {
         w[var0] = 0;
      }

   }

   public static void A(String var0, int var1, int var2, int var3, int var4, Graphics var5) {
      var1 += 0;
      var2 += 0;
      short var6 = z[var3 * 11 + 4];
      short var13 = z[var3 * 11 + 0];
      short var12 = z[var3 * 11 + 1];
      int var11 = z[var3 * 11 + 2];
      int var10 = z[var3 * 11 + 3];
      boolean var16 = (var6 & 256) == 256;
      boolean var9 = (var6 & 128) == 128;
      boolean var8 = (var6 & 512) == 512;
      if (var16) {
         short var7 = z[var3 * 11 + 6];
         var6 = z[var3 * 11 + 7];
         var4 = var7 + z[var3 * 11 + 8];
         int var15 = var6 + z[var3 * 11 + 9];
         int var14 = var13 + var11;
         var3 = var12 + var10;
         if (var13 < var7) {
            var13 = var7;
         }

         if (var12 < var6) {
            var12 = var6;
         }

         if (var14 > var4) {
            var11 = var4 - var13;
         }

         if (var3 > var15) {
            var10 = var15 - var12;
         }
      }

      if (var11 > 0 && var10 > 0) {
         var5.setClip(var13, var12, var11, var10);
         if (var9) {
            var3 = var5.getColor();
            var5.setColor(3);
            var5.drawString(var0, var1 + 2, var2 + 1, 20);
            var5.drawString(var0, var1 + 2, var2, 20);
            var5.drawString(var0, var1 + 2, var2 - 1, 20);
            var5.drawString(var0, var1 + 1, var2 + 1, 20);
            var5.drawString(var0, var1 + 1, var2 - 1, 20);
            var5.drawString(var0, var1, var2 + 1, 20);
            var5.drawString(var0, var1, var2, 20);
            var5.drawString(var0, var1, var2 - 1, 20);
            var5.setColor(var3);
            var5.drawString(var0, var1 + 1, var2, 20);
         } else if (var8) {
            var3 = var5.getColor();
            var5.setColor(3);
            var5.drawString(var0, var1 + 2, var2 + 1, 20);
            var5.setColor(var3);
            var5.drawString(var0, var1 + 1, var2, 20);
         } else {
            var5.drawString(var0, var1 + 1, var2, 20);
         }

      }
   }

   public static void A(int var0, boolean var1) {
      if (var1) {
         z[var0 * 11 + 5] = 1;
      } else {
         z[var0 * 11 + 5] = 0;
      }

   }

   public static void A(int var0, int var1, int var2, int var3, int var4) {
      z[var0 * 11 + 6] = (short)var1;
      z[var0 * 11 + 7] = (short)var2;
      z[var0 * 11 + 8] = (short)var3;
      z[var0 * 11 + 9] = (short)var4;
   }

   public static void A(int var0, int var1, int var2, int var3, int var4, int var5) {
      z[var0 * 11 + 0] = (short)var1;
      z[var0 * 11 + 1] = (short)var2;
      z[var0 * 11 + 2] = (short)var3;
      z[var0 * 11 + 3] = (short)var4;
      z[var0 * 11 + 4] = (short)var5;
      A(var0, true);
   }

   public static void A(int var0, int var1, int var2) {
      aa[var0 * 3 + 0] = (short)var1;
      aa[var0 * 3 + 1] = (short)var2;
      aa[var0 * 3 + 2] = 0;
   }

   public static void A(int var0, int var1) {
      z[var0 * 11 + 10] = (short)var1;
   }

   public static void A(String var0, int var1, int var2, Graphics var3) {
      if (z[var1 * 11 + 5] == 1) {
         short var4 = z[var1 * 11 + 4];
         boolean var5 = (var4 & 32) == 32;
         String[] var6;
         if (var5) {
            var6 = HG.A(var0, j[var2], z[var1 * 11 + 2], 0);
         } else {
            var6 = ca;
            var6[0] = var0;
         }

         A(var6, var1, var2, var3);
      }

   }

   public static void A(String[] var0, int var1, int var2, Graphics var3) {
      if (z[var1 * 11 + 5] == 1) {
         short var11 = z[var1 * 11 + 4];
         short var9 = z[var1 * 11 + 0];
         int var8 = z[var1 * 11 + 1];
         short var7 = z[var1 * 11 + 2];
         short var6 = z[var1 * 11 + 3];
         Font var5 = j[var2];
         int var4 = j[var2].getHeight();
         if ((var11 & 8) == 8) {
            var8 += (var6 - var4) / 2;
         }

         String[] var25 = var0;
         int var24 = var0.length * var4 + z[var1 * 11 + 10];
         int var23 = var5.stringWidth(var0[0]);
         boolean var22 = (var11 & 1) == 1;
         boolean var21 = (var11 & 2) == 2;
         boolean var20 = (var11 & 4) == 4;
         boolean var10 = (var11 & 16) == 16;
         boolean var19 = (var11 & 64) == 64;
         boolean var10000;
         if ((var11 & 128) == 128) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         if ((var11 & 512) == 512) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         if ((var11 & 32) == 32) {
            var10000 = true;
         } else {
            var10000 = false;
         }

         int var18 = 0;
         boolean var17 = aa[var1 * 3 + 0] != 0;
         int var16 = 0;
         short var15 = aa[var1 * 3 + 0];
         short var14 = aa[var1 * 3 + 1];
         boolean var13 = false;
         int var12 = -1;
         int var27;
         int var28;
         if (!var19) {
            if (var10) {
               var28 = var23 - var7 + 20;
               var27 = aa[var1 * 3 + 2];
               if (var27 < 0) {
                  var27 = -var27;
               }

               if (var23 > var7) {
                  var13 = true;
                  if (var27 >= var28) {
                     var12 = var23 + 20;
                  }
               } else if (var14 == 0) {
                  aa[var1 * 3 + 2] = 0;
               }

               if (var24 > var6) {
                  var13 = true;
                  if (var24 <= var27) {
                     aa[var1 * 3 + 2] = (short)var6;
                  }
               } else if (var15 == 0) {
                  aa[var1 * 3 + 2] = 0;
               }
            }
         } else if (var10) {
            if (var23 > var7) {
               var13 = true;
            } else if (var14 == 0) {
               aa[var1 * 3 + 2] = 0;
            }

            if (var24 > var6) {
               var13 = true;
            } else if (var15 == 0) {
               aa[var1 * 3 + 2] = 0;
            }
         }

         int var26;
         if (var19 && var13) {
            short var29 = aa[var1 * 3 + 2];
            var26 = var6 - var24;
            ba[var1 * 1 + 0] = 0;
            if (var29 < var26) {
               aa[var1 * 3 + 2] = (short)var26;
               ba[var1 * 1 + 0] = 1;
            }

            if (var29 > 0) {
               aa[var1 * 3 + 2] = 0;
               ba[var1 * 1 + 0] = 2;
            }
         }

         var3.setFont(var5);

         for(var28 = 0; var28 < var25.length; ++var28) {
            var26 = var5.stringWidth(var25[var28]);
            if (var26 > var16) {
               var16 = var26;
            }

            if (var22) {
               var18 = var9;
            } else if (var21) {
               var18 = var9 + (var7 - var26);
            } else if (var20) {
               var18 = var9 + (var7 - var26 >> 1);
               if (var18 < z[var1 * 11 + 0]) {
                  var18 = z[var1 * 11 + 0];
               }
            }

            var27 = var8;
            if (var17) {
               var15 = aa[var1 * 3 + 0];
               if (var15 != 0) {
                  var18 += aa[var1 * 3 + 2];
                  if (var26 > var7 && var18 + var12 <= z[var1 * 11 + 0] && var12 != -1) {
                     aa[var1 * 3 + 2] = 0;
                  }
               }
            } else {
               var14 = aa[var1 * 3 + 1];
               if (var14 != 0) {
                  var27 = var8 + aa[var1 * 3 + 2];
                  if (var24 > var6 && var27 + -1 <= z[var1 * 11 + 1]) {
                  }
               }
            }

            A(var25[var28], var18, var27 + var28 * var4, var1, var2, var3);
            if (var12 > 0) {
               A(var25[var28], var18 + var12, var27 + var28 * var4, var1, var2, var3);
            }
         }

         if (var13) {
            var5.stringWidth(var25[0]);
            if (!var19) {
               short[] var30;
               if (var15 != 0) {
                  var30 = aa;
                  var30[var1 * 3 + 2] += var15;
               } else {
                  var30 = aa;
                  var30[var1 * 3 + 2] += var14;
               }
            }
         }
      }

   }

   static boolean G() {
      System.gc();
      DataInputStream var0 = null;
      boolean var2 = false;

      try {
         var0 = new DataInputStream(HG.db.getClass().getResourceAsStream("/a"));
         cc = new short[var0.readShort()];

         int var1;
         for(var1 = 0; var1 < cc.length; ++var1) {
            cc[var1] = var0.readShort();
         }

         HG.fA = new short[var0.readShort()][];

         for(int var3 = 0; var3 < HG.fA.length; ++var3) {
            HG.fA[var3] = new short[var0.readShort()];

            for(var1 = 0; var1 < HG.fA[var3].length; ++var1) {
               HG.fA[var3][var1] = var0.readShort();
            }
         }

         rA = new int[var0.readShort()];

         for(var1 = 0; var1 < rA.length; ++var1) {
            rA[var1] = var0.readShort();
         }

         var0.close();
         var0 = null;
      } catch (Exception var10) {
         var2 = true;
      } finally {
         try {
            if (var0 != null) {
               var0.close();
            }
         } catch (Exception var9) {
         }

      }

      System.gc();
      return var2;
   }

   public static void H() {
      da = new int[55];
      ea = new int[6][15][];

      for(int var0 = 0; var0 < 15; ++var0) {
         ea[0][var0] = new int[9];
         ea[1][var0] = new int[9];
         ea[2][var0] = new int[7];
         ea[3][var0] = new int[8];
         ea[4][var0] = new int[6];
         ea[5][var0] = new int[6];
      }

      oa = new int[23];
      za = new int[19][4];
      aA = null;
      bA = null;
      dA = null;
      cA = null;
      eA = null;
      fA = null;
      gA = null;
      hA = null;
   }

   public static boolean I() {
      if (h == 2579220938L) {
         qA = !qA;
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 2578033336L) {
         int[] var10000 = da;
         var10000[12] &= -65536;
         var10000 = da;
         var10000[12] |= 0;
         J(da[4], da[5], 4096);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 41284439224L) {
         A(4, 5, true, false, da);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 659427265720L) {
         A(5, 5, true, false, da);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 10555380766664L) {
         A(2, 10, true, false, da);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else {
         if (h == 41297607096L) {
            A(24, 10, true, false, da);
            if (HG.MA(3)) {
               Display.getDisplay(a).vibrate(500);
            }
         } else {
            if (h == 41217071517L) {
               A(3, 10, true, false, da);
               if (HG.MA(3)) {
                  Display.getDisplay(a).vibrate(500);
               }

               return true;
            }

            if (h == 659437426872L) {
               if (gB >= 0) {
                  A(10000, fa[gB], da);
               }

               if (HG.MA(3)) {
                  Display.getDisplay(a).vibrate(500);
               }

               return true;
            }

            if (h == 41230911865L) {
               K(1000);
               if (HG.MA(3)) {
                  Display.getDisplay(a).vibrate(500);
               }

               return true;
            }
         }

         return false;
      }
   }

   static boolean B(int var0, int var1, int var2) {
      return var2 >= var0 && var2 < var1;
   }

   static int A(int[][] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         if (var0[var1][4] < 0) {
            return var1;
         }
      }

      return -1;
   }

   static int D(int var0) {
      int var1 = 1;
      if ((var0 & 32) != 0) {
         var1 = 1;
      } else if ((var0 & 4096) != 0) {
         var1 = 1 + fa.length;
      } else if ((var0 & 64) != 0) {
         var1 = 1 + fa.length + qa.length;
      } else if ((var0 & 128) != 0) {
         var1 = 1 + fa.length + qa.length + ha.length;
      } else if ((var0 & 256) != 0) {
         var1 = 1 + fa.length + qa.length + ha.length + ja.length;
      } else if ((var0 & 512) != 0) {
         var1 = 1 + fa.length + qa.length + ha.length + ja.length + la.length;
      } else if ((var0 & 8192) != 0) {
         var1 = 1 + fa.length + qa.length + ha.length + ja.length + la.length + na.length;
      } else if ((var0 & 1024) != 0) {
         var1 = 1 + fa.length + qa.length + ha.length + ja.length + la.length + na.length + ta.length;
      }

      for(var0 = var1; var0 < B.a.length; ++var0) {
         if (B.a[var0][4] < 0) {
            return var0;
         }
      }

      return -1;
   }

   static int[] B(int var0, int var1) {
      switch(var0) {
      case 0:
         return ha[var1];
      case 1:
         return ja[var1];
      case 2:
         return la[var1];
      case 3:
         return ta[var1];
      case 4:
         return va[var1];
      case 5:
         return na[var1];
      case 6:
         return fa[var1];
      case 7:
         return qa[var1];
      default:
         return null;
      }
   }

   static int[] A(int[] var0) {
      if ((var0[3] & 32) != 0) {
         return ga[var0[11]];
      } else if ((var0[3] & 64) != 0) {
         return ia[var0[4]];
      } else if ((var0[3] & 128) != 0) {
         return ka[var0[4]];
      } else if ((var0[3] & 256) != 0) {
         return ma[var0[4]];
      } else if ((var0[3] & 512) != 0) {
         return pa[var0[4]];
      } else if ((var0[3] & 4096) != 0) {
         return ra[var0[4]];
      } else if ((var0[3] & 8192) != 0) {
         return ua[var0[4]];
      } else {
         return (var0[3] & 1024) != 0 ? wa[var0[4]] : null;
      }
   }

   static void B(int[][] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1][4] = -1;
         var0[var1][0] = -1;
      }

   }

   static void A(int[] var0, boolean var1) {
      if (xa != null) {
         int var6 = var0[3];
         int var2;
         int var3;
         int var4;
         short var5;
         int var10;
         int[] var10000;
         int var16;
         int var10001;
         if ((var6 & 16) != 0) {
            var2 = F(var0);
            var5 = (short)(var2 & '\uffff');
            short var7 = (short)((var2 & -65536) >> 16);
            var4 = var5 + 1;
            var3 = var7 + 1;
            short var11 = 16384;
            if (var1) {
               var11 = 0;
            }

            for(var16 = var7; var16 <= var3; ++var16) {
               for(var10 = var5; var10 <= var4; ++var10) {
                  if (var16 >= 0 && var10 >= 0 && var16 <= B.c * 2 && var10 < B.b * 2 && (xa[var16 * B.b * 2 * 3 + var10 * 3 + 2] & '쀀') != 32768) {
                     var10000 = xa;
                     var10001 = var16 * B.b * 2 * 3 + var10 * 3 + 2;
                     var10000[var10001] &= -49153;
                     var10000 = xa;
                     var10001 = var16 * B.b * 2 * 3 + var10 * 3 + 2;
                     var10000[var10001] |= var11 & '쀀';
                  }
               }
            }

            var0[3] = var6;
         } else {
            int[] var12;
            if ((var6 & 32) != 0) {
               var12 = A(var0);
               int var8 = F(var0);
               var5 = (short)(var8 & '\uffff');
               short var13 = (short)((var8 & -65536) >> 16);
               var3 = var5 + ((short)(var12[3] & '\uffff') - (short)(var12[2] & '\uffff') >> 11);
               var2 = var13 + ((short)((var12[3] & -65536) >> 16) - (short)((var12[2] & -65536) >> 16) >> 11);
               short var9 = 16384;
               if (var1 || (var6 & '耀') != 0) {
                  var9 = 0;
               }

               for(var4 = var13; var4 <= var2; ++var4) {
                  for(var10 = var5; var10 <= var3; ++var10) {
                     if (var4 >= 0 && var10 >= 0 && var4 <= B.c * 2 && var10 < B.b * 2 && (xa[var4 * B.b * 2 * 3 + var10 * 3 + 2] & '쀀') != 32768) {
                        var10000 = xa;
                        var10001 = var4 * B.b * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] &= -49153;
                        var10000 = xa;
                        var10001 = var4 * B.b * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] |= var9 & '쀀';
                     }
                  }
               }
            } else {
               if ((var6 & 4096) == 0) {
                  return;
               }

               var12 = A(var0);
               B.A(var0, B.y);
               int var15 = B.y[0] + (short)(var12[2] & '\uffff') >> 11;
               var16 = B.y[1] + (short)((var12[2] & -65536) >> 16) >> 11;
               var4 = B.y[0] + (short)(var12[3] & '\uffff') >> 11;
               var3 = B.y[1] + (short)((var12[3] & -65536) >> 16) >> 11;
               char var14 = '耀';
               if (var1 || (var6 & '耀') != 0) {
                  var14 = 16384;
               }

               for(var16 = var16; var16 <= var3; ++var16) {
                  for(var10 = var15; var10 <= var4; ++var10) {
                     if (var16 >= 0 && var10 >= 0 && var16 <= B.c * 2 && var10 < B.b * 2) {
                        var10000 = xa;
                        var10001 = var16 * B.b * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] &= -49153;
                        var10000 = xa;
                        var10001 = var16 * B.b * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] |= var14 & '쀀';
                     }
                  }
               }

               var0[3] = var6;
            }
         }

      }
   }

   static void A(int var0, int var1, int var2, int var3, boolean var4) {
      if (xa != null) {
         if (var0 < 0) {
            var0 = 0;
         }

         if (var1 < 0) {
            var1 = 0;
         }

         if (var2 > B.b * 2) {
            var2 = B.b * 2;
         }

         if (var3 > B.c * 2) {
            var3 = B.c * 2;
         }

         for(int var6 = var0; var6 < var2; ++var6) {
            for(int var5 = var1; var5 < var3; ++var5) {
               int[] var10000 = xa;
               int var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
               var10000[var10001] &= -49153;
               var10000 = xa;
               var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
               var10000[var10001] |= 0;
               if (var4) {
                  var10000 = xa;
                  var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                  var10000[var10001] &= 65535;
                  var10000 = xa;
                  var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                  var10000[var10001] |= -65536;
               }

               if ((B.g[var5 >> 1][var6 >> 1] & '耀') != 0 && (B.g[var5 >> 1][var6 >> 1] & 255) != 255) {
                  B.t[0] = var6 << 11;
                  B.t[2] = (var6 << 11) + 2048;
                  B.t[1] = var5 << 11;
                  B.t[3] = (var5 << 11) + 2048;

                  for(var0 = B.A((int[])B.t, 4144); var0 != -1; var0 = (short)((B.a[var0][1] & -65536) >> 16)) {
                     if ((B.a[var0][3] & 4096) != 0) {
                        if ((B.a[var0][3] & '耀') == 0) {
                           var10000 = xa;
                           var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                           var10000[var10001] &= -49153;
                           var10000 = xa;
                           var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                           var10000[var10001] |= 32768;
                        }
                     } else if ((xa[var5 * B.b * 2 * 3 + var6 * 3 + 2] & '쀀') != 32768 && ((B.a[var0][3] & 32) != 0 || (B.a[var0][3] & 16) != 0) && (B.a[var0][3] & '耀') == 0) {
                        A(B.a[var0], false);
                     }
                  }
               } else {
                  var10000 = xa;
                  var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                  var10000[var10001] &= -49153;
                  var10000 = xa;
                  var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                  var10000[var10001] |= 32768;
               }
            }
         }

      }
   }

   static boolean C(int var0, int var1) {
      return var0 >= 0 && var1 >= 0 && var1 < B.g.length && var0 < B.g[var1].length && (B.g[var1][var0] & '耀') != 0 && (B.g[var1][var0] & 255) != 255;
   }

   static boolean A(int var0, int var1, int var2, int var3, boolean var4, boolean var5) {
      if (var2 >= 0 && var3 >= 0 && var3 < B.c * 2 && var2 < B.b * 2 && (xa[var3 * B.b * 2 * 3 + var2 * 3 + 2] & '쀀') != 32768) {
         if ((xa[var3 * B.b * 2 * 3 + var2 * 3 + 2] & '쀀') == 16384) {
            return false;
         } else {
            if (var4) {
               B.A(fa[var0], B.y);
               int[] var9 = A(fa[var0]);
               int var8 = var2 + ((short)(var9[3] & '\uffff') - (short)(var9[2] & '\uffff') >> 11);
               int var7 = var3 + ((short)((var9[3] & -65536) >> 16) - (short)((var9[2] & -65536) >> 16) >> 11);

               for(int var6 = var2; var6 <= var8; ++var6) {
                  for(int var10 = var3; var10 <= var7; ++var10) {
                     if (!A(var0, var1, var6, var10, false, var5)) {
                        return false;
                     }
                  }
               }
            }

            if (var5 && (short)((xa[var3 * B.b * 2 * 3 + var2 * 3 + 2] & -65536) >> 16) >= 0) {
               byte var11 = (byte)(xa[var3 * B.b * 2 * 3 + var2 * 3 + 2] >> 16 & 255);
               var2 = (byte)(xa[var3 * B.b * 2 * 3 + var2 * 3 + 2] >> 24 & 255) - fa[var11][24];
               if (var11 == var0 || var2 < 0) {
                  return true;
               }

               if (var2 >= var1 && var2 <= var1) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static final int B(int[] var0) {
      if (var0.length > 2) {
         return C(var0);
      } else {
         long var1 = (long)var0[0];
         long var3 = (long)var0[1];
         long var5 = var1 * var1;
         long var2 = var3 * var3;
         var2 += var5;
         int var7 = (int)var2;
         boolean var6 = false;
         if (var2 != (long)var7) {
            var7 = (int)(var2 + 128L >> 8);
            var6 = true;
         }

         var7 = F(var7);
         if (var6) {
            var7 <<= 4;
         }

         return var7;
      }
   }

   public static final int C(int[] var0) {
      if (var0.length <= 2) {
         return B(var0);
      } else {
         long var3 = (long)var0[0];
         long var1 = (long)var0[1];
         long var5 = (long)var0[2];
         var3 *= var3;
         long var7 = var1 * var1;
         var5 *= var5;
         long var2 = var3 + var7 + var5;
         int var9 = (int)var2;
         boolean var8 = false;
         if (var2 != (long)var9) {
            var9 = (int)(var2 + 512L >> 10);
            var8 = true;
         }

         var9 = F(var9);
         if (var8) {
            var9 <<= 5;
         }

         return var9;
      }
   }

   public static final long A(int[] var0, int[] var1) {
      long var2 = (long)(var0[0] - var1[0]);
      long var4 = (long)(var0[1] - var1[1]);
      return var2 * var2 + var4 * var4;
   }

   public static final void B(int[] var0, int[] var1) {
      int var3 = B(var0);
      int var2;
      if (var3 != 0) {
         for(var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = (var0[var2] << 8) / var3;
         }
      } else {
         for(var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = 0;
         }
      }

   }

   public static final void A(int[] var0, int var1, int[] var2) {
      B(var0, var2);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         var2[var3] = var2[var3] * var1 >> 8;
      }

   }

   public static final int E(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static int F(int var0) {
      int var1 = var0;
      int var10000;
      if (var0 >= 65536) {
         if (var0 >= 16777216) {
            if (var0 >= 268435456) {
               if (var0 >= 1073741824) {
                  var0 = rA[var0 >> 24] << 8;
               } else {
                  var0 = rA[var0 >> 22] << 7;
               }
            } else if (var0 >= 67108864) {
               var0 = rA[var0 >> 20] << 6;
            } else {
               var0 = rA[var0 >> 18] << 5;
            }

            var0 = var0 + 1 + var1 / var0 >> 1;
            var0 = var0 + 1 + var1 / var0 >> 1;
            if (var0 * var0 > var1) {
               --var0;
               var10000 = var0;
            } else {
               var10000 = var0;
            }

            return var10000;
         } else {
            if (var0 >= 1048576) {
               if (var0 >= 4194304) {
                  var0 = rA[var0 >> 16] << 4;
               } else {
                  var0 = rA[var0 >> 14] << 3;
               }
            } else if (var0 >= 262144) {
               var0 = rA[var0 >> 12] << 2;
            } else {
               var0 = rA[var0 >> 10] << 1;
            }

            var0 = var0 + 1 + var1 / var0 >> 1;
            if (var0 * var0 > var1) {
               --var0;
               var10000 = var0;
            } else {
               var10000 = var0;
            }

            return var10000;
         }
      } else if (var0 >= 256) {
         if (var0 >= 4096) {
            if (var0 >= 16384) {
               var0 = rA[var0 >> 8] + 1;
            } else {
               var0 = (rA[var0 >> 6] >> 1) + 1;
            }
         } else if (var0 >= 1024) {
            var0 = (rA[var0 >> 4] >> 2) + 1;
         } else {
            var0 = (rA[var0 >> 2] >> 3) + 1;
         }

         if (var0 * var0 > var1) {
            --var0;
            var10000 = var0;
         } else {
            var10000 = var0;
         }

         return var10000;
      } else {
         return var0 >= 0 ? rA[var0] >> 4 : -1;
      }
   }

   public static void A(Graphics var0) {
      var0.setClip(0, 0, f, g);
      var0.setColor(i[3]);
      var0.fillRect(0, 0, f, g);
      var0.setColor(i[0]);
      A(3, 0, 0, f, g, 44);
      A((String)tA, 3, 1, var0);
   }

   public static void B(Graphics var0) {
      try {
         var0.setColor(i[27 + n - 1]);
      } catch (Exception var1) {
         var0.setColor(16777215);
      }

      var0.fillRect(0, 0, f, g);
      if (m != null) {
         var0.drawImage(m, f / 2, g / 2, 3);
      }

   }

   public static void C(Graphics var0) {
      if (c) {
         A(var0);
      } else {
         var0.setClip(0, 0, f, g);
         var0.setColor(0);
         var0.fillRect(0, 0, f, g);
         switch(t) {
         case 1:
         case 3:
            if (r == null) {
               if (t == 1) {
                  B(var0);
               }
            } else {
               int var4 = f >> 1;
               int var1 = j[1].getHeight();
               int var3 = C.c;
               if (var3 > 100) {
                  var3 = 100;
               }

               var0.setFont(j[1]);
               var0.setClip(0, 0, f, g);

               try {
                  if (m != null) {
                     var0.setColor(i[27]);
                  } else {
                     var0.setColor(i[8]);
                  }
               } catch (Exception var7) {
                  var0.setColor(16777215);
               }

               var0.fillRect(0, 0, f, g);
               int var2;
               if (m != null) {
                  var0.drawImage(m, f / 2, g / 2, 3);
                  var0.setColor(i[3]);
                  var2 = g - var1 - 20 + 0;
               } else {
                  var0.setColor(i[5]);
                  var2 = g >> 1;
               }

               try {
                  var0.drawString(sA, var4 + 0, var2 - var1 + 0, 17);
               } catch (Exception var6) {
               }

               var2 += 5;
               var0.drawRect(var4 - (f >> 1) / 2, var2, f >> 1, 10);
               var0.fillRect(var4 + 2 - (f >> 1) / 2, var2 + 2, ((f >> 1) - 3) * var3 / 100, 7);
            }
            break;
         case 2:
            B(var0);
         case 4:
         case 5:
         default:
            break;
         case 6:
            synchronized(r.h) {
               if (da[11] != 0) {
                  D(var0);
               } else {
                  E(var0);
               }
            }
         }

      }
   }

   static void J() {
      System.gc();
      yA = f / B.d + 2;
      zA = g / B.e + 2;
      uA = Image.createImage(yA * B.d, zA * B.e);
      vA = uA.getGraphics();
      wA = -1;
      xA = -1;
      ab = true;
   }

   static void K() {
      uA = null;
      vA = null;
   }

   static void L() {
      int[] var10000;
      int var0;
      int var1;
      for(var1 = 0; var1 < B.g[0].length; ++var1) {
         for(var0 = 0; var0 < B.g.length; ++var0) {
            var10000 = B.g[var0];
            var10000[var1] &= Integer.MAX_VALUE;
            B.g[var0][var1] = B.g[var0][var1] & -28673 | 0;
         }
      }

      for(int var3 = 0; var3 < B.g[0].length; ++var3) {
         for(int var2 = 0; var2 < B.g.length; ++var2) {
            var1 = -1;

            for(var0 = 0; var0 < 7 && var2 - var0 >= 0; ++var0) {
               if ((B.g[var2 - var0][var3] & Integer.MIN_VALUE) == 0 && (B.g[var2 - var0][var3] >> 28 & 7) == var0) {
                  if (var1 == -1) {
                     B.g[var2][var3] = B.g[var2][var3] & -28673 | (var0 & 7) << 12;
                  } else {
                     B.g[var2 - var1][var3] = B.g[var2 - var1][var3] & -1879048193 | (var0 & 7) << 28;
                     var10000 = B.g[var2 - var1];
                     var10000[var3] |= Integer.MIN_VALUE;
                  }

                  var1 = var0;
               }
            }

            if (var1 == -1) {
               B.g[var2][var3] = B.g[var2][var3] & -28673 | 28672;
            } else {
               B.g[var2 - var1][var3] = B.g[var2 - var1][var3] & -1879048193 | 1879048192;
            }
         }
      }

      for(var1 = 0; var1 < B.g[0].length; ++var1) {
         for(var0 = 0; var0 < B.g.length; ++var0) {
            if ((B.g[var0][var1] & Integer.MIN_VALUE) == 0) {
               B.g[var0][var1] = B.g[var0][var1] & -1879048193 | 1879048192;
            }

            var10000 = B.g[var0];
            var10000[var1] &= Integer.MAX_VALUE;
         }
      }

   }

   public static void A(int[] var0, boolean var1, Graphics var2) {
      int[] var11 = null;
      short var10 = 0;
      int var9 = 0;
      int var8 = 0;
      int var7 = 0;
      if ((var0[3] & 1048576) == 0) {
         if ((var0[3] & 64) != 0) {
            var11 = ia[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 128) != 0) {
            var11 = ka[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 256) != 0) {
            var11 = ma[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 8192) != 0) {
            var11 = ua[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 1024) != 0) {
            var11 = wa[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
            var8 = o % cc[1223];
         } else if ((var0[3] & 4096) != 0) {
            var11 = ra[var0[4]];
            var7 = var0[7];
            if (!var1) {
               var8 = (short)(var0[10] & '\uffff');
               R(var0);
            }
         } else if ((var0[3] & 512) != 0) {
            var11 = pa[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         }

         if (var11 != null) {
            B.B(var0, bb);
            int var6 = bb[0] * B.d >> 12;
            int var5 = (bb[1] - bb[2]) * B.d >> 12;
            int var4 = (short)(var11[1] & '\uffff');
            short var3 = (short)((var11[1] & -65536) >> 16);
            if ((var0[3] & 524288) != 0) {
               var4 = 112;
            }

            if (var4 != -1) {
               if (var1) {
                  if ((var0[3] & 4096) == 0) {
                     return;
                  }

                  var4 -= 8;
                  var4 += 185;
               }

               if (!W(var4)) {
                  return;
               }

               A(var6 + var10, var5 + var9, var4, var3, var8, var7, var2);
            } else {
               var2.setColor(16711680);
               var2.drawString(HG.I(var11[0]), var6 - tB, var5 - uB, 20);
            }
         }

         if (((var0[3] & 16) != 0 || (var0[3] & 32) != 0) && !var1) {
            A(var0, var2);
         }

         if ((var0[3] & 2048) != 0 && !var1) {
            B(var0, var2);
         }

         if ((var0[3] & 16384) != 0 && !var1) {
            C(var0, var2);
         }

         if ((var0[3] & 262144) != 0 && !var1) {
            D(var0, var2);
         }

      }
   }

   public static void A(int var0, int var1, int var2, Graphics var3) {
      short var8;
      switch(var2) {
      case 0:
         var8 = (short)(B.f & '\uffff');
         break;
      case 1:
         var8 = (short)((B.f & -65536) >> 16);
         break;
      default:
         return;
      }

      int var7 = 0;
      if (cc[var8 * 11 + 4] == 5) {
         var7 = B.k;
      }

      if (ec[var8][var7] != null) {
         int var6 = var0 * B.d - tB;
         int var5 = var1 * B.e - uB;
         byte var4 = (byte)(B.g[var1][var0] >> (var2 << 4) & 255);
         byte var9 = (byte)(B.g[var1][var0] >> 8 + (var2 << 4) & 15);
         if (var4 >= 0) {
            short var11 = cc[var8 * 11 + 5];
            short var10 = cc[var8 * 11 + 6];
            var0 = var4 % var11 * B.d;
            var1 = var4 / var11 % var10 * B.e;
            var3.drawRegion(ec[var8][var7], var0, var1, B.d, B.e, var9, var6, var5, 20);
         }

      }
   }

   public static boolean C(int var0, int var1, int var2) {
      return var2 != -1 && !D(var2, var1) ? false : D(var0, var1);
   }

   public static boolean D(int var0, int var1) {
      int var3 = -1;

      for(int var2 = var0; var2 != -1 && B.A(B.a[var1]) >= B.A(B.a[var2]); var2 = (short)((B.a[var2][1] & -65536) >> 16)) {
         var3 = var2;
      }

      int[] var10000;
      if (var3 == -1) {
         var10000 = B.a[var1];
         var10000[1] &= 65535;
         var10000 = B.a[var1];
         var10000[1] |= (short)var0 << 16 & -65536;
         return true;
      } else {
         short var4 = (short)((B.a[var3][1] & -65536) >> 16);
         var10000 = B.a[var1];
         var10000[1] &= 65535;
         var10000 = B.a[var1];
         var10000[1] |= (short)var4 << 16 & -65536;
         var10000 = B.a[var3];
         var10000[1] &= 65535;
         var10000 = B.a[var3];
         var10000[1] |= (short)var1 << 16 & -65536;
         return false;
      }
   }

   public static void D(Graphics var0) {
      if ((HG.gA && HG.hA > 17 || !HG.gA) && !hd && HG.dA == 0) {
         int var18 = tB / B.d;
         int var17 = uB / B.e;
         int var16 = f / B.d + 2 + var18;
         int var15 = g / B.e + 2 + var17;
         if (var18 < 0) {
            var18 = 0;
         }

         if (var17 < 0) {
            var17 = 0;
         }

         if (var16 > B.b) {
            var16 = B.b;
         }

         if (var15 > B.c) {
            var15 = B.c;
         }

         int var14 = var18 - 6;
         int var13 = var17;
         int var12 = var16 + 6;
         int var11 = var15 + 7;
         if (var14 < 0) {
            var14 = 0;
         }

         if (var17 < 0) {
            var13 = 0;
         }

         if (var12 > B.b) {
            var12 = B.b;
         }

         if (var11 > B.c) {
            var11 = B.c;
         }

         var0.setClip(0, 0, f, g);
         int var10 = -1;
         int var9 = -1;
         int var8 = -1;
         int var7 = -1;
         F(var0);

         int var2;
         int var3;
         int var4;
         int var5;
         for(int var6 = var13; var6 < var11; ++var6) {
            var5 = var8;
            var4 = var7;

            for(var3 = var14; var3 < var12; ++var3) {
               for(var2 = B.u[var6][var3]; var2 != -1; var2 = (short)(B.a[var2][1] & '\uffff')) {
                  int[] var10000 = B.a[var2];
                  var10000[1] &= 65535;
                  var10000 = B.a[var2];
                  var10000[1] |= -65536;
                  boolean var1 = false;
                  if ((B.a[var2][3] & 4096) != 0 && B.a[var2][6] != 0) {
                     if (C(var9, var2, var4)) {
                        var9 = var2;
                     }

                     var1 = true;
                     var7 = var2;
                  }

                  if (!var1) {
                     if (C(var10, var2, var5)) {
                        var10 = var2;
                     }

                     var8 = var2;
                  }
               }
            }
         }

         int var19;
         for(var19 = var10; var19 != -1; var19 = (short)((B.a[var19][1] & -65536) >> 16)) {
            A(B.a[var19], true, var0);
         }

         var19 = Integer.MAX_VALUE;
         var2 = var10;
         if (var10 != -1) {
            var19 = B.A(B.a[var10]);
         }

         for(var5 = var13; var5 < var11; ++var5) {
            while(var2 != -1 && var19 <= (var5 + 1) * 4096) {
               A(B.a[var2], false, var0);
               var2 = (short)((B.a[var2][1] & -65536) >> 16);
               if (var2 == -1) {
                  var19 = Integer.MAX_VALUE;
               } else {
                  var19 = B.A(B.a[var2]);
               }
            }

            for(var4 = var14; var4 < var12; ++var4) {
               for(var3 = B.g[var5][var4] >> 12 & 7; var3 != 7; var3 = B.g[var5 - var3][var4] >> 28 & 7) {
                  if (var4 >= var18 && var5 - var3 >= var17 && var4 < var16 && var5 - var3 < var15) {
                     A(var4, var5 - var3, 1, var0);
                  }
               }
            }
         }

         while(var2 != -1) {
            A(B.a[var2], false, var0);
            var2 = (short)((B.a[var2][1] & -65536) >> 16);
         }

         for(var19 = var9; var19 != -1; var19 = (short)((B.a[var19][1] & -65536) >> 16)) {
            A(B.a[var19], true, var0);
            A(B.a[var19], false, var0);
         }
      }

      if (!HG.gA) {
         if (gB == -1) {
            K(var0);
         }

         J(var0);
         U(var0);
         S(var0);
         if (hd) {
            Q(var0);
         } else if (nD) {
            R(var0);
         }

         if (nC) {
            N(var0);
         }
      }

      var0.setClip(0, 0, f, g);
   }

   public static void E(Graphics var0) {
      F(var0);
      B.A(da, cb);
      int var2 = cb[0] * B.d >> 12;
      int var1 = cb[1] * B.d >> 12;
      if (W(134)) {
         A(var2, var1, 134, 0, 0, 0, var0);
      }

      V(var0);
      if (!HG.gA) {
         if (db || eb) {
            G(var0);
         }

         if (nC) {
            N(var0);
         }
      }

      var0.setClip(0, 0, f, g);
   }

   static void A(int var0, int var1, int var2, int var3) {
      vA.setColor(0);

      for(int var13 = var0; var13 < var2; ++var13) {
         for(int var12 = var1; var12 < var3; ++var12) {
            int var11 = var13 % yA * B.d;
            int var10 = var12 % zA * B.e;
            vA.fillRect(var11, var10, B.d, B.e);
            if (var13 >= 0 && var13 < B.g[0].length && var12 >= 0 && var12 < B.g.length) {
               short var9 = (short)(B.f & '\uffff');

               for(int var8 = 0; var8 < (da[11] == 0 ? 2 : 1); ++var8) {
                  byte var7 = (byte)(B.g[var12][var13] >> (var8 << 4) & 255);
                  byte var6 = (byte)(B.g[var12][var13] >> 8 + (var8 << 4) & 15);
                  if (var7 >= 0) {
                     short var5 = cc[var9 * 11 + 5];
                     short var4 = cc[var9 * 11 + 6];
                     var0 = var7 % var5 * B.d;
                     int var15 = var7 / var5 % var4 * B.e;
                     int var14 = 0;
                     if (cc[var9 * 11 + 4] == 5) {
                        var14 = B.k;
                     }

                     vA.drawRegion(ec[var9][var14], var0, var15, B.d, B.e, var6, var11, var10, 20);
                  }

                  var9 = (short)((B.f & -65536) >> 16);
               }
            }
         }
      }

   }

   static void M() {
      int var1 = wA;
      int var0 = xA;
      wA = tB / B.d;
      if (tB < 0) {
         --wA;
      }

      xA = uB / B.e;
      if (uB < 0) {
         --xA;
      }

      if (ab) {
         A(wA, xA, wA + yA, xA + zA);
         ab = false;
      } else {
         if (wA != var1) {
            if (var1 < wA) {
               while(var1 + yA < wA) {
                  var1 += yA;
               }

               A(var1 + yA, var0, wA + yA, var0 + zA);
            } else {
               while(var1 - yA > wA) {
                  var1 -= yA;
               }

               A(wA, var0, var1, var0 + zA);
            }

            var1 = wA;
         }

         if (xA != var0) {
            if (var0 < xA) {
               while(var0 + zA < xA) {
                  var0 += zA;
               }

               A(var1, var0 + zA, var1 + yA, xA + zA);
            } else {
               while(var0 - zA > xA) {
                  var0 -= zA;
               }

               A(var1, xA, var1 + yA, var0);
            }
         }
      }

   }

   static void F(Graphics var0) {
      M();
      int var4 = -wA % yA * B.d;
      int var3 = -xA % zA * B.e;
      int var2;
      if (tB >= 0) {
         var2 = tB % B.d;
      } else {
         var2 = B.d + tB % B.d;
      }

      int var1;
      if (uB >= 0) {
         var1 = uB % B.e;
      } else {
         var1 = B.e + uB % B.e;
      }

      var0.drawRegion(uA, 0, 0, uA.getWidth(), uA.getHeight(), 0, var4 - var2, var3 - var1, 20);
      var0.drawRegion(uA, 0, 0, uA.getWidth(), uA.getHeight(), 0, var4 - var2 + yA * B.d, var3 - var1, 20);
      var0.drawRegion(uA, 0, 0, uA.getWidth(), uA.getHeight(), 0, var4 - var2, var3 - var1 + zA * B.e, 20);
      var0.drawRegion(uA, 0, 0, uA.getWidth(), uA.getHeight(), 0, var4 - var2 + yA * B.d, var3 - var1 + zA * B.e, 20);
   }

   public static void N() {
      ib = new short[16];
      P();
   }

   public static void O() {
      nb = null;
   }

   public static void P() {
      int var6 = 0;
      gb = f - (dc[126][3] << 1) - dc[150][3] * 4;
      gb /= 5;
      if (gb < 4) {
         gb = 4;
      }

      hb = cc[1530] + cc[1607] - (dc[150][4] << 1) >> 1;
      if (hb < 4) {
         hb = 4;
      }

      int var5 = f - dc[150][3] * 4 - gb * 3 >> 1;
      int var4 = g - cc[1530];
      int var0 = g - (dc[150][4] + hb) * 2;
      if (var4 > var0) {
         var4 = var0;
      }

      int var3 = var5;

      for(int var1 = 0; var1 < 2; ++var1) {
         for(var0 = 0; var0 < 4; ++var0) {
            ib[(var6 << 1) + 0] = (short)var5;
            ib[(var6 << 1) + 1] = (short)var4;
            ++var6;
            var5 += dc[150][3] + gb;
         }

         var5 = var3;
         var4 += dc[150][4] + hb;
      }

      lb = (short)((dc[150][3] + gb) * 4 - gb);
      mb = (short)(j[1].getHeight() + 4);
      jb = (short)var3;
      kb = (short)(var4 - mb - hb);
      A(5, jb, kb, lb, mb, 156);
      A((int)5, (int)-2, (int)0);
   }

   public static void Q() {
      int var1 = da[40];
      if ((da[39] & 1 << var1) == 0) {
         nb = HG.I(429);
      } else {
         int var2;
         int[][] var3;
         int[][] var4;
         short var5;
         short var0 = (short)(da[31 + var1] & '\uffff');
         var5 = (short)((da[31 + var1] & -65536) >> 16);
         var4 = ea[var0];
         var3 = (int[][])null;
         var2 = -1;
         var1 = -1;
         label34:
         switch(var0) {
         case 0:
            var3 = ia;
            int var6 = 6;

            while(true) {
               if (var6 > 7) {
                  break label34;
               }

               if (var4[var5][var6] > 0) {
                  if (sa[(short)((var4[var5][var6] & -65536) >> 16)][1] == 0) {
                     var2 = sa[(short)((var4[var5][var6] & -65536) >> 16)][0];
                  } else {
                     var1 = sa[(short)((var4[var5][var6] & -65536) >> 16)][0];
                  }
               }

               ++var6;
            }
         case 1:
            var3 = ka;
            break;
         case 2:
            var3 = ma;
            break;
         case 3:
            var3 = ua;
            break;
         case 4:
            var3 = wa;
         }

         nb = "";
         if (var2 >= 0) {
            nb = nb + HG.I(var2) + " ";
         }

         nb = nb + HG.I(var3[var4[var5][4]][0]);
         if (var1 >= 0) {
            nb = nb + " " + HG.I(var1);
         }
      }

   }

   public static int R() {
      int var0 = da[40];
      return (da[39] & 1 << var0) == 0 ? -1 : (short)(da[31 + var0] & '\uffff');
   }

   public static int S() {
      int var0 = da[40];
      return (da[39] & 1 << var0) == 0 ? -1 : (short)((da[31 + var0] & -65536) >> 16);
   }

   public static int G(int var0) {
      fb = false;
      if (C(61) && (var0 < 4 && var0 > 0 || var0 > 4)) {
         --var0;
      }

      if (C(62) && (var0 < 3 || var0 >= 4 && var0 < 7)) {
         ++var0;
      }

      if (C(55) && var0 >= 4) {
         var0 -= 4;
      }

      if (C(60) && var0 < 4) {
         var0 += 4;
      }

      if (C(101)) {
         var0 = 0;
         fb = true;
      }

      if (C(102)) {
         var0 = 1;
         fb = true;
      }

      if (C(103)) {
         var0 = 2;
         fb = true;
      }

      if (C(104)) {
         var0 = 3;
         fb = true;
      }

      if (C(105)) {
         var0 = 4;
         fb = true;
      }

      if (C(106)) {
         var0 = 5;
         fb = true;
      }

      if (C(107)) {
         var0 = 6;
         fb = true;
      }

      if (C(108)) {
         var0 = 7;
         fb = true;
      }

      return var0;
   }

   public static void T() {
      int var0 = da[40];
      int var2 = G(var0);
      boolean var3 = false;
      if (C(65) || fb) {
         int var1 = (short)HG.xa & '\uffff' | (short)HG.ya << 16 & -65536;
         da[31 + var2] = var1;
         int[] var10000 = da;
         var10000[39] |= 1 << var2;

         for(var0 = 0; var0 < 8; ++var0) {
            if (var0 != var2 && var1 == da[31 + var0]) {
               da[31 + var0] = -1;
               var10000 = da;
               var10000[39] &= ~(1 << var0);
            }
         }

         var3 = true;
      }

      if (C(95) || C(85) || var3) {
         eb = false;
         D();
         if (HG.hA != 19 && HG.hA != 21) {
            HG.U();
         } else {
            HG.B(HG.hA);
         }

         HG.gA = true;
      }

      da[40] = var2;
      Q();
   }

   public static void U() {
      int var0 = da[40];
      if (C(95) || C(85)) {
         db = false;
         D();
      }

      if (C(65)) {
         db = false;
         G(R(), S());
         D();
      }

      var0 = G(var0);
      da[40] = var0;
      Q();
      if (fb) {
         db = false;
         G(R(), S());
         D();
      }

   }

   public static void G(Graphics var0) {
      int var4 = da[40];

      for(int var3 = 0; var3 < 8; ++var3) {
         short var2 = (short)(da[31 + var3] & '\uffff');
         short var1 = (short)((da[31 + var3] & -65536) >> 16);
         if (var2 != -1 && var1 != -1 && (da[39] & 1 << var3) != 0 && ea[var2][var1][4] != -1) {
            int var5 = A(ea[var2][var1])[2];
            B(ib[(var3 << 1) + 0], ib[(var3 << 1) + 1], 150, var5, var0);
         } else {
            B(ib[(var3 << 1) + 0], ib[(var3 << 1) + 1], 150, 49, var0);
         }
      }

      B(ib[(var4 << 1) + 0], ib[(var4 << 1) + 1], 150, 59, var0);
      H(var0);
   }

   public static void H(Graphics var0) {
      var0.setColor(i[22]);
      var0.drawRect(jb - 1, kb - 1, lb + 2, mb + 2);
      var0.setColor(i[23]);
      var0.drawRect(jb - 2, kb - 2, lb + 2, mb + 2);
      var0.setColor(i[24]);
      var0.fillRect(jb, kb, lb, mb);
      var0.setColor(i[25]);
      A((String)nb, 5, 1, var0);
   }

   static void V() {
      X();
   }

   static void W() {
      ob = null;
   }

   static void X() {
      int var2 = f >> 3;
      int var1 = f - (var2 << 1);
      int var0 = j[2].getHeight() + 4;
      A(4, var2 + 4, 4, var1 - 8, var0, 156);
      A((int)4, (int)-2, (int)0);
      pb = var2;
      qb = f - (var2 << 1);
      sb = var0;
   }

   static void H(int var0) {
      if (var0 == -1) {
         ob = null;
      } else {
         ob = HG.I(ga[fa[var0][11]][0]);
         short var1 = (short)(fa[var0][12] & '\uffff');
         short var2 = (short)((fa[var0][12] & -65536) >> 16);
         if (var2 != 0) {
            rb = qb * var1 / var2;
         } else {
            rb = qb;
         }

         if (rb < 0) {
            rb = 0;
         }

         if (rb > qb) {
            rb = 0;
         }

      }
   }

   static void I(Graphics var0) {
      if (ob != null) {
         var0.setClip(0, 0, f, g);
         var0.setColor(i[15]);
         var0.drawRect(pb - 1, 3, qb + 2, sb + 2);
         var0.setColor(i[14]);
         var0.drawRect(pb - 2, 2, qb + 2, sb + 2);
         var0.setColor(i[17]);
         var0.fillRect(pb, 4, qb, sb);
         var0.setColor(i[16]);
         var0.fillRect(pb, 4, rb, sb);
         var0.setColor(i[18]);
         A((String)ob, 4, 2, var0);
      }
   }

   public static void J(Graphics var0) {
      if (gB != -1) {
         int var4 = fa[gB][4] * B.d >> 12;
         int var3 = fa[gB][5] * B.d >> 12;
         byte var2;
         if (hB) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         short[] var1 = D(fa[gB], true);
         A(var4 + var1[0], var3 + var1[1], 151, 0, var2, 0, var0);
         A(var4 + var1[2], var3 + var1[1], 151, 0, var2, 2, var0);
         A(var4 + var1[2], var3 + var1[3], 151, 0, var2, 3, var0);
         A(var4 + var1[0], var3 + var1[3], 151, 0, var2, 1, var0);
      }
   }

   static void Y() {
      tb = -1;
      ub = -1;
      xb = "";
      int var4 = cc[1518] + cc[1386] + 5;
      int var3 = j[1].getHeight() + 2 + 2;
      int var2 = g - (cc[1387] + cc[1607] - 7);
      int var1 = f - 2 * var4 - 1;
      int var0 = g - (var3 + 5);
      if (var2 > var0) {
         var2 = var0;
      }

      A(6, var4 + 4, var2 + 2, var1 - 8, var3, 532);
   }

   static int[] E(int var0, int var1) {
      int var3;
      label129: {
         if (var0 >= 0 && var0 < B.b && var1 >= 0 && var1 < B.c) {
            var0 = B.u[var1][var0];
            var3 = var0;

            while(var3 != -1) {
               if ((B.a[var3][3] & 1048576) != 0) {
                  var3 = (short)(B.a[var3][1] & '\uffff');
               } else {
                  if ((B.a[var3][3] & 524288) != 0) {
                     tb = var3;
                     ub = 7;
                     vb = 1;
                     return A(B.a[var3]);
                  }

                  if ((B.a[var3][3] & 256) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return ma[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 64) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return ia[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 128) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return ka[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 8192) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return ua[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 1024) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return wa[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 512) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return pa[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 32) != 0) {
                     if (N((short)((B.a[var3][2] & -65536) >> 16)) && (B.a[var3][13] & 2) == 0 && (B.a[var3][3] & 65536) == 0) {
                        tb = var3;
                        ub = 1;
                        vb = 2;
                        return ga[B.a[var3][11]];
                     }

                     if ((B.a[var3][13] & 2) != 0) {
                        short var4 = (short)(B.a[var3][17] & '\uffff');
                        var4 = (short)((iA[var4] & -65536) >> 16);
                        if (var4 > 0) {
                           tb = var3;
                           ub = 7;
                           vb = 1;
                           return ga[B.a[var3][11]];
                        }
                     }
                  } else if ((B.a[var3][3] & 4096) != 0) {
                     byte var2 = (byte)(B.a[var3][8] & 255);
                     switch(var2) {
                     case 1:
                     case 2:
                     case 3:
                     case 6:
                     case 7:
                     default:
                        break;
                     case 4:
                     case 5:
                        byte var5 = (byte)(B.a[var3][8] >> 8 & 255);
                        var0 = B.E();
                        if ((var0 & 1 << var5) == 0) {
                           if ((var0 & 1 << var5 + 1) != 0) {
                              var2 = (byte)(B.a[var3][8] >> 16 & 255);
                              byte var6 = (byte)(B.a[var3][8] >> 24 & 255);
                              ub = 6;
                              vb = 0;
                              if (var6 > 0) {
                                 ub = 4;
                                 vb = 6;
                              }

                              if (var2 > 0) {
                                 for(var1 = 0; var1 < ea[5].length; ++var1) {
                                    var0 = ea[5][var1][4];
                                    if (var0 >= 0 && pa[var0][4] == var2) {
                                       ub = 5;
                                       vb = 5;
                                       break label129;
                                    }
                                 }
                              }
                           } else {
                              ub = 3;
                              vb = 4;
                           }
                           break label129;
                        }

                        if (var2 == 4) {
                           ub = 7;
                           vb = 1;
                           break label129;
                        }
                        break;
                     case 8:
                        var0 = B.A(var3, (int[])null);
                        if ((short)((iA[var0] & -65536) >> 16) != 0) {
                           ub = 7;
                           vb = 1;
                           tb = var3;
                           return ra[B.a[var3][4]];
                        }
                     }
                  }

                  var3 = (short)(B.a[var3][1] & '\uffff');
               }
            }
         }

         return null;
      }

      tb = var3;
      return ra[B.a[var3][4]];
   }

   static void F(int var0, int var1) {
      boolean var11 = false;
      boolean var10 = false;
      int var9 = tb;
      int var8 = ub;
      int[] var7 = null;
      tb = -1;
      ub = -1;
      vb = -1;
      wb = -1;
      int var6 = da[30];

      for(int var5 = -1; var5 < 2; ++var5) {
         for(int var4 = -1; var4 < 2; ++var4) {
            byte var3;
            if (var6 == 0 && var4 < 0 || var6 == 2 && var4 > 0 || var6 == 3 && var5 < 0 || var6 == 1 && var5 > 0) {
               var3 = 2;
            } else if ((var6 != 0 && var6 != 2 || var4 != 0) && (var6 != 3 && var6 != 1 || var5 != 0)) {
               var3 = 0;
            } else {
               var3 = 1;
            }

            int[] var2;
            if (var3 >= wb && (var2 = E(var0 + var5, var1 + var4)) != null) {
               if (var3 > wb) {
                  var11 = false;
                  var10 = false;
               }

               if (var11 && var3 == wb) {
                  var10 = true;
               } else {
                  wb = var3;
                  var7 = var2;
                  var11 = true;
               }
            }
         }
      }

      if (var10) {
         tb = -1;
         ub = -1;
         switch(da[30]) {
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

         if (var0 < 0 || var0 >= B.b || var1 < 0 || var1 >= B.c) {
            tb = -1;
            ub = -1;
            return;
         }

         int var12 = B.u[var1][var0];

         for(var12 = var12; var12 != -1; var12 = (short)(B.a[var12][1] & '\uffff')) {
            var7 = E(var0, var1);
         }
      }

      if ((var9 != tb || var8 != ub) && tb >= 0) {
         xb = "";
         if ((B.a[tb][3] & 4096) == 0 && (B.a[tb][3] & 524288) == 0) {
            if ((B.a[tb][3] & 256) != 0 && B.a[tb][6] > 1) {
               xb = B.a[tb][6] + "x ";
            }

            xb = xb + HG.I(var7[0]);
         }

         A((int)6, (int)-2, (int)0);
      }

   }

   static void K(Graphics var0) {
      if (ub >= 0) {
         int[] var4 = B.a[tb];
         int var1;
         int var2;
         int var3;
         if ((var4[3] & 4) != 0) {
            var2 = D(var4, true)[1] - 5;
            var1 = (var4[4] * B.d >> 12) - tB;
            var3 = (var4[5] * B.d >> 12) - uB;
            B(var1, var3 + var2, 137, vb, var0);
         } else {
            B.B(var4, bb);
            var3 = bb[0] * B.d >> 12;
            var2 = (bb[1] - bb[2]) * B.d >> 12;
            short var5 = (short)(A(var4)[1] & '\uffff');
            var1 = cc[var5 * 11 + 1] + 5;
            if ((var4[3] & 4096) == 0) {
               var1 += (short)((var4[5] & -65536) >> 16);
               var3 += (short)(var4[5] & '\uffff');
            }

            A(var3, var2 - var1, 137, vb, var0);
         }
      }

   }

   static void L(Graphics var0) {
      if (ub >= 0 && xb.length() > 0) {
         var0.setClip(0, 0, f, g);
         int var5 = cc[1518] + cc[1386] + 5;
         int var4 = j[1].getHeight() + 2 + 2 - 1;
         int var3 = g - (cc[1387] + cc[1607] - 7);
         int var2 = f - 2 * var5 - 1;
         int var1 = g - (var4 + 5);
         if (var3 > var1) {
            var3 = var1;
         }

         var0.setColor(i[8]);
         var0.fillRect(var5, var3, var2, var4);
         var0.setColor(i[5]);
         var0.drawLine(var5, var3, var5 + var2, var3);
         var0.drawLine(var5, var3, var5, var3 + var4);
         var0.setColor(i[6]);
         var0.drawLine(var5 + 1, var3 + 1, var5 + var2, var3 + 1);
         var0.drawLine(var5 + 1, var3 + 1, var5 + 1, var3 + var4 - 1);
         var0.drawLine(var5 + var2 + 1, var3, var5 + var2 + 1, var3 + var4 + 1);
         var0.drawLine(var5, var3 + var4 + 1, var5 + var2 + 1, var3 + var4 + 1);
         var0.setColor(i[7]);
         var0.drawLine(var5 + 1, var3 + var4, var5 + var2, var3 + var4);
         var0.drawLine(var5 + var2, var3 + 1, var5 + var2, var3 + var4);
         var0.setColor(i[5]);
         A((String)xb, 6, 1, var0);
      }

   }

   static boolean I(int var0) {
      int[] var10000;
      short var1;
      int var10001;
      if ((B.a[var0][3] & 64) != 0 && B(0, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (da[11] >= 0) {
            var10000 = eA;
            var10001 = da[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 128) != 0 && B(1, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (da[11] >= 0) {
            var10000 = fA;
            var10001 = da[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 256) != 0 && B(2, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (da[11] >= 0) {
            var10000 = bA;
            var10001 = da[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 8192) != 0 && B(3, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (da[11] >= 0) {
            var10000 = gA;
            var10001 = da[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 512) != 0 && B(5, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (da[11] >= 0) {
            var10000 = cA;
            var10001 = da[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 1024) != 0 && B(4, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (da[11] >= 0) {
            var10000 = hA;
            var10001 = da[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else {
         D(241, 230, 101, 106);
         return false;
      }
   }

   static boolean A(int var0, int[] var1) {
      int[][] var3 = ea[var0];

      for(int var2 = 0; var2 < var3.length; ++var2) {
         if (var0 == 2 && var3[var2][4] == var1[4]) {
            return true;
         }

         if (var3[var2][4] == -1) {
            return true;
         }
      }

      return false;
   }

   static boolean A(int var0, int var1, boolean var2) {
      short var3 = (short)(ea[var0][var1][8] & '\uffff');
      short var4 = (short)((ea[var0][var1][8] & -65536) >> 16);
      if (var3 == 0) {
         if (B(4, false) < var4) {
            if (var2) {
               A(HG.I(80), HG.I(230), 101, 106);
            }

            return false;
         }
      } else if (var3 == 1 && B(5, false) < var4) {
         if (var2) {
            A(HG.I(79), HG.I(230), 101, 106);
         }

         return false;
      }

      return true;
   }

   static boolean D(int[] var0) {
      short var1 = (short)(var0[8] & '\uffff');
      short var2 = (short)((var0[8] & -65536) >> 16);
      int var3;
      switch(var1) {
      case 0:
         var3 = B(4, false);
         break;
      case 1:
         var3 = B(5, false);
         break;
      default:
         return true;
      }

      return var3 >= var2;
   }

   static void G(int var0, int var1) {
      int[] var10000;
      int var2;
      switch(var0) {
      case 0:
         if (da[42] != var1) {
            if (A(var0, var1, true)) {
               if (da[42] != -1) {
                  B(var0, da[42], false);
                  da[42] = -1;
               }

               da[42] = var1;
               da[45] = -1;
               B(var0, da[42], true);
            }
         } else {
            B(var0, da[42], false);
            da[42] = -1;
         }

         HG.M(12);
         break;
      case 1:
         if (da[41] != var1) {
            if (A(var0, var1, true)) {
               if (da[41] != -1) {
                  B(var0, da[41], false);
                  da[41] = -1;
               }

               da[41] = var1;
               B(var0, da[41], true);
            }
         } else {
            B(var0, da[41], false);
            da[41] = -1;
         }

         HG.M(11);
         break;
      case 2:
         E(ea[var0][var1]);
         if (ea[var0][var1][6] <= 1) {
            int var3 = (short)var0 & '\uffff' | (short)var1 << 16 & -65536;

            for(var2 = 0; var2 < 8; ++var2) {
               if (var3 == da[31 + var2]) {
                  var10000 = da;
                  var10000[39] &= ~(1 << var2);
                  var10000 = da;
                  var10000[31 + var2] &= 65535;
                  var10000 = da;
                  var10000[31 + var2] |= (short)ea[var0][var1][4] << 16 & -65536;
               }
            }

            ea[var0][var1][4] = -1;
         } else {
            int var10002 = ea[var0][var1][6]--;
         }
         break;
      case 3:
         var2 = ua[ea[var0][var1][4]][10];
         if (var2 == 1) {
            if (da[44] != -1) {
               B(var0, da[44], false);
            }

            if (da[44] != var1) {
               da[44] = var1;
               B(var0, da[44], true);
            } else {
               da[44] = -1;
            }
         } else if (var2 == 0) {
            var2 = da[43];
            if ((short)(var2 & '\uffff') == var1) {
               B(var0, (short)(var2 & '\uffff'), false);
               var10000 = da;
               var10000[43] &= -65536;
               var10000 = da;
               var10000[43] |= 65535;
            } else if ((short)((var2 & -65536) >> 16) == var1) {
               B(var0, (short)((var2 & -65536) >> 16), false);
               var10000 = da;
               var10000[43] &= 65535;
               var10000 = da;
               var10000[43] |= -65536;
            } else if ((short)(var2 & '\uffff') == -1) {
               var10000 = da;
               var10000[43] &= -65536;
               var10000 = da;
               var10000[43] |= (short)var1 & '\uffff';
               B(var0, (short)(da[43] & '\uffff'), true);
            } else if ((short)((var2 & -65536) >> 16) == -1) {
               var10000 = da;
               var10000[43] &= 65535;
               var10000 = da;
               var10000[43] |= (short)var1 << 16 & -65536;
               B(var0, (short)((da[43] & -65536) >> 16), true);
            }
         }
         break;
      case 4:
         if (da[42] != -1) {
            B(0, da[42], false);
            da[42] = -1;
         }

         if (da[45] != var1) {
            da[45] = var1;
         } else {
            da[45] = -1;
         }
      }

      boolean var6 = false;
      boolean var5 = false;

      while(true) {
         while(da[42] != -1 && !A(0, da[42], false)) {
            B(0, da[42], false);
            da[42] = -1;
            var6 = true;
         }

         if (da[41] == -1 || A(1, da[41], false)) {
            if (var6 || var5) {
               String var4 = "";
               if (var6) {
                  var4 = "" + HG.I(88) + "\n";
               }

               if (var5) {
                  var4 = var4 + HG.I(87);
               }

               A(var4, HG.I(230), 101, 106);
            }

            return;
         }

         B(0, da[41], false);
         da[41] = -1;
         var5 = true;
      }
   }

   static void A(boolean var0) {
      int var6 = 1;
      if ((ea[HG.xa][HG.ya][3] & 256) != 0) {
         var6 = bd;
      }

      int var5 = A(HG.xa, HG.ya, var6, false, false);
      int var4;
      if (var0) {
         var4 = B.A(tb, B.a[var5]);
      } else {
         var4 = B.A(tb, (int[])null);
      }

      short var3 = (short)(iA[var4] & '\uffff');
      boolean var2 = true;
      int[] var10000;
      if ((B.a[var5][3] & 256) != 0) {
         for(short var1 = var3; var1 != -1; var1 = (short)(B.a[var1][1] & '\uffff')) {
            if (B.a[var1][4] == B.a[var5][4]) {
               var10000 = B.a[var1];
               var10000[6] += var6;
               var2 = false;
               break;
            }
         }
      }

      if (var2) {
         var10000 = iA;
         var10000[var4] &= -65536;
         var10000 = iA;
         var10000[var4] |= (short)var5 & '\uffff';
         var10000 = B.a[var5];
         var10000[1] &= -65536;
         var10000 = B.a[var5];
         var10000[1] |= (short)var3 & '\uffff';
         int var8 = (short)((iA[var4] & -65536) >> 16) + 1;
         var10000 = iA;
         var10000[var4] &= 65535;
         var10000 = iA;
         var10000[var4] |= (short)var8 << 16 & -65536;
      }

      if (var0) {
         int var7 = B.G(B.a[var5]) * var6;
         if (var7 % 2 != 0) {
            ++var7;
         }

         var7 = var7 * 40 / 100;
         K(var7);
      }

      HG.B(HG.hA);
   }

   static boolean B(boolean var0) {
      int var8 = B.A(tb, (int[])null) + HG.za;
      short var7 = (short)(iA[var8] & '\uffff');
      short var6 = -1;
      int var1 = 0;

      short var5;
      for(var5 = -1; var7 != -1; var7 = (short)(B.a[var7][1] & '\uffff')) {
         if (HG.aA == var1) {
            var5 = (short)(B.a[var7][2] & '\uffff');
            break;
         }

         ++var1;
         var6 = var7;
      }

      if (var5 >= 0) {
         int var4 = 0;
         int var3 = -1;
         boolean var2 = (B.a[var5][3] & 256) != 0;
         if (var0) {
            var1 = B.G(B.a[var5]);
            if (var2) {
               var1 *= bd;
               var4 = B.a[var5][6];
               var3 = B.a[var5][4];
               B.a[var5][6] = bd;
            }

            if (!K(-var1)) {
               D(240, 230, 101, 106);
               if (var2) {
                  B.a[var5][6] = var4;
               }

               return true;
            }
         }

         if (I(var5)) {
            if (var0 && var2) {
               var4 -= bd;
               if (var4 > 0) {
                  B.a[var5][4] = var3;
                  B.a[var5][6] = var4;
               }
            }

            if (var4 == 0) {
               short var9 = (short)(B.a[var7][1] & '\uffff');
               int[] var10000;
               if (var6 == -1) {
                  var10000 = iA;
                  var10000[var8] &= -65536;
                  var10000 = iA;
                  var10000[var8] |= (short)var9 & '\uffff';
               } else {
                  var10000 = B.a[var6];
                  var10000[1] &= -65536;
                  var10000 = B.a[var6];
                  var10000[1] |= (short)var9 & '\uffff';
               }

               var1 = (short)((iA[var8] & -65536) >> 16) - 1;
               var10000 = iA;
               var10000[var8] &= 65535;
               var10000 = iA;
               var10000[var8] |= (short)var1 << 16 & -65536;
               if (var1 == 0 && da[11] == -1) {
                  B.a[tb][8] = 0;
               }
            }

            HG.W(21);
         }
      } else if (var0) {
         K(0);
      }

      return var0 || (short)((iA[var8] & -65536) >> 16) > 0;
   }

   static int H(int var0, int var1) {
      int var3 = 0;

      for(int var2 = 0; var2 < ea[var0].length; ++var2) {
         if (ea[var0][var2][4] == var1) {
            if (var0 == 2) {
               var3 += ea[var0][var2][6];
               break;
            }

            ++var3;
         }
      }

      return var3;
   }

   static void I(int var0, int var1) {
      short var2 = (short)((var0 & -65536) >> 16);
      short var4 = (short)(var0 & '\uffff');
      int var3 = H(var2, var4);
      if (var2 == 2) {
         for(var0 = 0; var0 < ea[var2].length; ++var0) {
            if (ea[var2][var0][4] == var4) {
               if (var3 > var1) {
                  int[] var10000 = ea[var2][var0];
                  var10000[6] -= var1;
               } else if (var3 == var1) {
                  A(var2, var0, var3, true, false);
               }

               return;
            }
         }
      } else {
         for(var0 = 0; var0 < ea[var2].length; ++var0) {
            if (ea[var2][var0][4] == var4) {
               A(var2, var0, 1, true, false);
               --var3;
               if (var3 == 0) {
                  return;
               }
            }
         }
      }

   }

   static int A(int var0, int var1, int var2, boolean var3, boolean var4) {
      int var6 = -1;
      int var5 = -1;
      int[] var10000;
      int var9;
      switch(var0) {
      case 0:
         if (!var3) {
            var2 = A(ha);
            var6 = D(ea[var0][var1][3]);
            if (var2 >= 0 && var6 >= 0) {
               System.arraycopy(ea[var0][var1], 0, ha[var2], 0, ea[var0][var1].length);
               B.a[var6] = ha[var2];
               var10000 = B.a[var6];
               var10000[2] &= -65536;
               var10000 = B.a[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = B.a[var6];
               var10000[2] &= 65535;
               var10000 = B.a[var6];
               var10000[2] |= (short)var2 << 16 & -65536;
               B.a[var6][1] = -1;
               var10000 = B.a[var6];
               var10000[3] |= 64;
               if (var4) {
                  B.A(ha[var2], (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
               }
            }
         }

         if (da[42] == var1) {
            B(var0, da[42], false);
            da[42] = -1;
         }
         break;
      case 1:
         if (!var3) {
            var2 = A(ja);
            var6 = D(ea[var0][var1][3]);
            if (var2 >= 0 && var6 >= 0) {
               System.arraycopy(ea[var0][var1], 0, ja[var2], 0, ea[var0][var1].length);
               B.a[var6] = ja[var2];
               var10000 = B.a[var6];
               var10000[2] &= -65536;
               var10000 = B.a[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = B.a[var6];
               var10000[2] &= 65535;
               var10000 = B.a[var6];
               var10000[2] |= (short)var2 << 16 & -65536;
               B.a[var6][1] = -1;
               var10000 = B.a[var6];
               var10000[3] |= 128;
               if (var4) {
                  B.A(ja[var2], (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
               }
            }
         }

         if (da[41] == var1) {
            B(var0, da[41], false);
            da[41] = -1;
         }
         break;
      case 2:
         if (!var3) {
            var9 = A(la);
            var6 = D(ea[var0][var1][3]);
            if (var9 >= 0 && var6 >= 0) {
               System.arraycopy(ea[var0][var1], 0, la[var9], 0, ea[var0][var1].length);
               la[var9][6] = var2;
               var5 = ea[var0][var1][6] - var2;
               ea[var0][var1][6] = var5;
               B.a[var6] = la[var9];
               var10000 = B.a[var6];
               var10000[2] &= -65536;
               var10000 = B.a[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = B.a[var6];
               var10000[2] &= 65535;
               var10000 = B.a[var6];
               var10000[2] |= (short)var9 << 16 & -65536;
               B.a[var6][1] = -1;
               var10000 = B.a[var6];
               var10000[3] |= 256;
               if (var4) {
                  B.A(la[var9], (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
               }
            }
         }
         break;
      case 3:
         if (!var3) {
            var2 = A(ta);
            var6 = D(ea[var0][var1][3]);
            if (var2 >= 0 && var6 >= 0) {
               System.arraycopy(ea[var0][var1], 0, ta[var2], 0, ea[var0][var1].length);
               B.a[var6] = ta[var2];
               var10000 = B.a[var6];
               var10000[2] &= -65536;
               var10000 = B.a[var6];
               var10000[2] |= (short)var6 & '\uffff';
               var10000 = B.a[var6];
               var10000[2] &= 65535;
               var10000 = B.a[var6];
               var10000[2] |= (short)var2 << 16 & -65536;
               B.a[var6][1] = -1;
               var10000 = B.a[var6];
               var10000[3] |= 8192;
               if (var4) {
                  B.A(ta[var2], (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
               }
            }

            if ((short)(da[43] & '\uffff') == var1) {
               B(var0, (short)(da[43] & '\uffff'), false);
               var10000 = da;
               var10000[43] &= -65536;
               var10000 = da;
               var10000[43] |= 65535;
            } else if ((short)((da[43] & -65536) >> 16) == var1) {
               B(var0, (short)((da[43] & -65536) >> 16), false);
               var10000 = da;
               var10000[43] &= 65535;
               var10000 = da;
               var10000[43] |= -65536;
            } else if (da[44] == var1) {
               B(var0, da[44], false);
               da[44] = -1;
            }
         }
      }

      if (var5 <= 0) {
         var9 = (short)var0 & '\uffff' | (short)var1 << 16 & -65536;

         for(var2 = 0; var2 < 8; ++var2) {
            if (var9 == da[31 + var2]) {
               var10000 = da;
               var10000[39] &= ~(1 << var2);
               var10000 = da;
               var10000[31 + var2] &= 65535;
               var10000 = da;
               var10000[31 + var2] |= (short)ea[var0][var1][4] << 16 & -65536;
            }
         }

         ea[var0][var1][4] = -1;
      }

      if (var4) {
         short var8 = (short)(da[0] & '\uffff');
         short var7 = (short)((da[0] & -65536) >> 16);
         var9 = B.u[var7][var8];

         boolean var10;
         for(var10 = false; var9 != -1; var9 = (short)(B.a[var9][1] & '\uffff')) {
            var1 = B.a[var9][3];
            if ((var1 & 10176) > 0 && var9 != var6) {
               var10000 = B.a[var9];
               var10000[3] |= 524288;
               var10 = true;
               break;
            }
         }

         if (var10) {
            var10000 = B.a[var6];
            var10000[3] |= 524288;
            var10000 = B.a[var6];
            var10000[3] |= 1048576;
         }

         F((short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
      }

      return var6;
   }

   static void E(int[] var0) {
      var0 = ma[var0[4]];
      A(var0[6], var0[3], true, false, da);
      HG.M(33);
   }

   public static void B(int var0, int var1, boolean var2) {
      if (var0 != -1) {
         if (var1 != -1) {
            if (ea[var0][var1][4] != -1) {
               B(ea[var0][var1], var2);
            }
         }
      }
   }

   public static void B(int[] var0, boolean var1) {
      int[] var4 = A(var0);
      if ((var0[3] & 128) != 0) {
         int[] var10000;
         if (var1) {
            var10000 = da;
            var10000[27] += var4[11];
            var10000 = da;
            var10000[28] += var4[12];
            var10000 = da;
            var10000[29] += var4[13];
         } else {
            var10000 = da;
            var10000[27] -= var4[11];
            var10000 = da;
            var10000[28] -= var4[12];
            var10000 = da;
            var10000[29] -= var4[13];
         }
      }

      int var2;
      for(var2 = 0; var2 < zb.length; ++var2) {
         zb[var2] = -1;
      }

      int var3;
      int var5;
      if ((var0[3] & 64) != 0 || (var0[3] & 128) != 0 || (var0[3] & 8192) != 0) {
         for(var3 = 0; var3 < 2; ++var3) {
            if (var0[6 + var3] != -1) {
               var2 = sa[(short)((var0[6 + var3] & -65536) >> 16)][3];
               zb[var3] = (short)var2 & '\uffff' | (short)(var0[6 + var3] & '\uffff') << 16 & -65536;
            }
         }

         for(var5 = 0; var5 < 5; ++var5) {
            if (var4[5 + var5] != -1) {
               zb[2 + var5] = var4[5 + var5];
            }
         }
      }

      for(var3 = 0; var3 < zb.length; ++var3) {
         if (zb[var3] != -1) {
            short var6 = (short)(zb[var3] & '\uffff');
            var5 = (short)((zb[var3] & -65536) >> 16);
            if (!var1) {
               var5 *= -1;
            }

            A(var6, var5, true, true, da);
         }
      }

   }

   static int B(int var0, boolean var1) {
      switch(var0) {
      case 0:
         return (short)(da[12] & '\uffff');
      case 1:
         return (short)(da[13] & '\uffff');
      case 2:
         if (var1) {
            return (short)(da[54] & '\uffff');
         }

         return (short)(da[54] & '\uffff');
      case 3:
         if (var1) {
            return (short)((da[54] & -65536) >> 16);
         }

         return (short)((da[54] & -65536) >> 16);
      case 4:
         if (var1) {
            return (short)((da[14] & -65536) >> 16);
         }

         return (short)(da[14] & '\uffff');
      case 5:
         if (var1) {
            return (short)((da[15] & -65536) >> 16);
         }

         return (short)(da[15] & '\uffff');
      case 6:
         return da[47];
      case 7:
         return da[49];
      case 8:
         return da[50];
      case 9:
         return (short)(da[26] & '\uffff');
      case 10:
         return da[27];
      case 11:
         return da[28];
      case 12:
         if (var1) {
            return (short)((da[20] & -65536) >> 16);
         }

         return (short)(da[20] & '\uffff');
      case 13:
         if (var1) {
            return (short)((da[21] & -65536) >> 16);
         }

         return (short)(da[21] & '\uffff');
      case 14:
         if (var1) {
            return (short)((da[22] & -65536) >> 16);
         }

         return (short)(da[22] & '\uffff');
      case 15:
         if (var1) {
            return (short)((da[23] & -65536) >> 16);
         }

         return (short)(da[23] & '\uffff');
      case 16:
         return da[51];
      case 17:
         if (var1) {
            return (short)((da[25] & -65536) >> 16);
         }

         return (short)(da[25] & '\uffff');
      case 18:
         return (short)(da[24] & '\uffff');
      case 19:
         return da[29];
      case 20:
      default:
         return 0;
      case 21:
         return da[46];
      case 22:
         return da[16];
      case 23:
         return da[48];
      case 24:
         return da[19];
      case 25:
         return da[17];
      }
   }

   static void A(int var0, int var1, boolean var2, boolean var3, int[] var4) {
      byte var13 = -1;
      byte var12 = -1;
      boolean var11 = false;
      boolean var10 = true;
      boolean var9 = false;
      boolean var8 = false;
      boolean var7 = false;
      boolean var6 = false;
      boolean var5 = false;
      if ((var4[3] & 32) != 0) {
         switch(var0) {
         case 0:
            var13 = 12;
            var9 = true;
            var12 = 12;
            var11 = true;
         }
      }

      if ((var4[3] & 16) != 0) {
         switch(var0) {
         case 0:
            if (qA) {
               return;
            }

            var13 = 12;
            var9 = true;
            var12 = 12;
            var11 = true;
            break;
         case 1:
            var13 = 13;
            var9 = true;
            var12 = 13;
            var11 = true;
            break;
         case 2:
            var13 = 12;
            if (!var3) {
               var12 = 54;
               var11 = false;
               var10 = false;
               var9 = true;
               var8 = true;
               var7 = true;
            } else {
               var12 = 12;
               var11 = true;
               var9 = true;
               var7 = true;
               var6 = true;
            }
            break;
         case 3:
            var13 = 13;
            if (!var3) {
               var12 = 54;
               var11 = true;
               var10 = false;
               var9 = true;
               var8 = true;
               var7 = true;
            } else {
               var12 = 13;
               var11 = true;
               var9 = true;
               var7 = true;
               var6 = true;
            }
            break;
         case 4:
            var13 = 14;
            var5 = true;
            break;
         case 5:
            var13 = 15;
            var5 = true;
            break;
         case 6:
            var13 = 47;
            break;
         case 7:
            var13 = 49;
            break;
         case 8:
            var13 = 50;
            break;
         case 9:
            var13 = 26;
            var5 = true;
            break;
         case 10:
            var13 = 27;
            break;
         case 11:
            var13 = 28;
            break;
         case 12:
            var13 = 20;
            var5 = true;
            break;
         case 13:
            var13 = 21;
            var5 = true;
            break;
         case 14:
            var13 = 22;
            var5 = true;
            break;
         case 15:
            var13 = 23;
            var5 = true;
            break;
         case 16:
            var13 = 51;
            break;
         case 17:
            var13 = 25;
            var5 = true;
            break;
         case 18:
            var13 = 24;
            var5 = true;
            break;
         case 19:
            var13 = 29;
            break;
         case 20:
            var13 = 25;
            var5 = true;
            break;
         case 21:
            var13 = 46;
            break;
         case 22:
            var13 = 16;
            break;
         case 23:
            var13 = 48;
            break;
         case 24:
            var13 = 19;
            break;
         case 25:
            var13 = 17;
         }
      }

      if (var5) {
         if (var3) {
            var9 = true;
            var8 = false;
         } else {
            var9 = true;
            var8 = true;
         }
      }

      if (var13 >= 0) {
         var0 = -1;
         if (var12 != -1) {
            if (!var11) {
               var0 = (short)(var4[var12] & '\uffff');
            } else {
               var0 = (short)((var4[var12] & -65536) >> 16);
            }

            if (var7) {
               if (var2) {
                  var0 += var1;
               } else {
                  var0 = var1;
               }

               if (!var11) {
                  var4[var12] &= -65536;
                  var4[var12] |= (short)var0 & '\uffff';
               } else {
                  var4[var12] &= 65535;
                  var4[var12] |= (short)var0 << 16 & -65536;
               }
            }
         }

         if (var2) {
            int var14;
            if (var9) {
               var14 = (short)(var4[var13] & '\uffff') + var1;
               if (var14 > var0 && var0 >= 0 && var10) {
                  var14 = var0;
               }

               if (var14 <= 0 && var6) {
                  var14 = 1;
               }

               var4[var13] &= -65536;
               var4[var13] |= (short)var14 & '\uffff';
            }

            if (var8) {
               var14 = (short)((var4[var13] & -65536) >> 16) + var1;
               if (var14 > var0 && var0 >= 0 && var10) {
                  var14 = var0;
               }

               if (var14 <= 0 && var6) {
                  var14 = 1;
               }

               var4[var13] &= 65535;
               var4[var13] |= (short)var14 << 16 & -65536;
            }

            if (!var8 && !var9) {
               var1 += var4[var13];
               if (var1 > var0 && var0 >= 0 && var10) {
                  var1 = var0;
               }

               if (var1 <= 0 && var6) {
                  var1 = 1;
               }

               var4[var13] = var1;
            }
         } else {
            var1 = var1;
            if (var1 > var0 && var0 >= 0 && var10) {
               var1 = var0;
            }

            if (var1 <= 0 && var6) {
               var1 = 1;
            }

            if (var9) {
               var4[var13] &= -65536;
               var4[var13] |= (short)var1 & '\uffff';
            }

            if (var8) {
               var4[var13] &= 65535;
               var4[var13] |= (short)var1 << 16 & -65536;
            }

            if (!var8 && !var9) {
               var4[var13] = var1;
            }
         }

      }
   }

   public static void A(Graphics var0, boolean var1, boolean var2, boolean var3, int var4) {
      var0.setClip(0, 0, f, g);
      int var6 = g;
      var0.setColor(i[3]);
      var0.fillRect(0, 0, f, g);
      B(0, var6, 146, 0, var0);
      int var5 = f;
      B(var5, var6, 146, 0, 0, 2, var0);
      var5 = var6 - cc[1607];
      B(0, var5, 138, 0, var0);
      var6 = 0 + cc[1518];
      B(var6, var5, var4, 0, var0);
      if (var4 == 126) {
         T(var0);
      }

      var6 += cc[1386];
      var5 -= cc[1387];
      var0.setColor(i[8]);
      var0.fillRect(var6, var5, f - var6, g - var5);
      var0.setColor(i[5]);
      var0.drawLine(var6, var5, f, var5);
      var0.setColor(i[6]);
      var0.drawLine(var6, var5 + 1, f - 1, var5 + 1);
      var0.drawLine(f - 1, var5 + 1, f - 1, g - 1);
      var0.setColor(i[7]);
      var0.drawLine(var6, g - 1, f - 2, g - 1);
      var0.drawLine(f - 2, var5 + 2, f - 2, g - 1);
      int var11;
      if (var3) {
         var5 = f;
         var11 = g;
         B(var5, var11, 146, 0, 0, 2, var0);
      }

      var6 = g - (cc[1607] + cc[1387]);
      var0.setColor(i[5]);
      var0.drawRect(0, 0, f - 2, var6 - 2);
      var0.setColor(i[6]);
      var0.drawRect(1, 1, f - 2, var6 - 2);
      var5 = cc[1617] / cc[1622];
      var11 = cc[1618] / cc[1623];
      B(0, 0, 147, 0, var0);
      B(f - var5, 0, 147, 1, var0);
      B(0, var6 - var11, 147, 2, var0);
      B(f - var5, var6 - var11, 147, 3, var0);
      int var7 = var5 >> 1;
      if (var1) {
         var5 = C(false);
      } else {
         var5 = var11;
      }

      var6 = f - 2 * var7;
      var11 = g - (cc[1607] + cc[1387] + var11 + var5);
      if (!var2) {
         var11 -= 4;
      }

      var0.setColor(i[8]);
      var0.fillRect(var7, var5, var6, var11);
      if (var2) {
         var0.setColor(i[3]);
         var0.fillRect(HG.ta, HG.ua, HG.va - 1, HG.wa);
      }

      var0.setColor(i[6]);
      var0.drawRect(var7, var5, var6, var11);
      var0.drawRect(var7 + 1, var5 + 1, var6 - 1, var11 - 1);
      var0.setColor(i[5]);
      var0.drawRect(var7, var5, var6 - 1, var11 - 1);
      if (var2) {
         var0.drawRect(HG.ta, HG.ua, HG.va - 1, HG.wa);
      }

      Font var13 = j[2];
      var11 = j[2].getHeight();
      int var9;
      if (var1) {
         var0.setFont(var13);
         var9 = var13.stringWidth("" + da[46]);
         int var8 = (f - var9 >> 1) - 4 - cc[1628];
         short var12 = cc[1629];
         var6 = 4;
         var9 = 3;
         if (var12 > var11) {
            var9 = 3 + (var12 - var11 >> 1);
         } else {
            var6 = 4 + (var11 - var12 >> 1);
         }

         B(var8, var6, 148, 0, var0);
         var0.drawString("" + da[46], var8 + cc[1628] + 4 + 0, var9 + 0, 20);
      }

      var7 = cc[1639] / cc[1644];
      short var14 = cc[1640];
      var9 = (HG.ua - var5 - var7 >> 1) + 1;
      int var10;
      if (var2) {
         var10 = HG.ra - HG.ua;
         if (var10 < 0) {
            B((f >> 1) - var7, HG.ua + HG.wa + 2, 149, 0, var0);
         }

         if (var10 > HG.wa - HG.sa) {
            B(f >> 1, HG.ua + HG.wa + 2, 149, 1, var0);
         }

         if (HG.ka) {
            B(HG.ta, var5 + var9, 160, 1, var0);
            B(HG.ta + HG.va - var14, var5 + var9, 160, 0, var0);
         }

         if (HG.ka) {
            var9 = HG.ta + var7 + 2;
         } else {
            var9 = HG.ta + 2;
         }

         A(2, var9, var5 + 1, f - 2 * var9, var11 + 6, 540);
         A((String)HG.ja, 2, 2, var0);
      }

      if (var4 == 126 && HG.gA && !hd && (HG.hA == 19 || HG.hA == 20)) {
         var0.setClip(0, 0, f, g);
         var0.setColor(i[5]);
         var10 = f - dc[138][3] - dc[126][3] + 1 + 18;
         var9 = g - dc[146][4] - dc[139][4] + 1;
         var0.drawRect(var10 - 2, var9 - 1, 5, 21);
         B((Graphics)var0, 18);
      }

   }

   public static int C(boolean var0) {
      int var2 = cc[1629];
      int var1 = j[2].getHeight();
      if (var1 > var2) {
         var2 = var1;
      }

      if (var0) {
         var2 += var1 + 6;
      }

      return var2 + 6;
   }

   public void Z() {
      short var6 = (short)(da[53] & '\uffff');
      short var5 = (short)((da[53] & -65536) >> 16);
      boolean var4 = false;
      boolean var3 = false;

      int[] var10000;
      for(int var2 = 0; var2 < 15; ++var2) {
         if (ea[2][var2][4] >= 0) {
            int[] var7 = A(ea[2][var2]);
            int var1 = 0;
            int var8;
            if (var7[6] == 26) {
               var1 = ea[2][var2][6] - var6;
               if (var1 < 0) {
                  var8 = var6 + var1;
                  var10000 = da;
                  var10000[53] &= -65536;
                  var10000 = da;
                  var10000[53] |= (short)var8 & '\uffff';
               }

               var6 = 0;
               var3 = true;
            } else if (var7[6] == 27) {
               var1 = ea[2][var2][6] - var5;
               if (var1 < 0) {
                  var8 = var5 + var1;
                  var10000 = da;
                  var10000[53] &= 65535;
                  var10000 = da;
                  var10000[53] |= (short)var8 << 16 & -65536;
               }

               var5 = 0;
               var4 = true;
            }

            if (var1 > 0) {
               var8 = (short)ea[2][var2][4] & '\uffff' | 131072;
               I(var8, var1);
            }
         }
      }

      if (!var4) {
         var10000 = da;
         var10000[53] &= 65535;
         var10000 = da;
         var10000[53] |= 0;
      }

      if (!var3) {
         var10000 = da;
         var10000[53] &= -65536;
         var10000 = da;
         var10000[53] |= 0;
      }

   }

   public static void AA() {
      int var0;
      for(var0 = 0; var0 < da.length; ++var0) {
         da[var0] = -1;
      }

      da[4] = 2048;
      da[5] = 2048;
      da[12] = 3276850;
      da[13] = 1310740;
      da[16] = 1024;
      da[30] = 2;
      da[14] = 1310740;
      da[15] = 983055;
      da[27] = 0;
      da[28] = 0;
      da[27] = 0;
      da[17] = 0;
      da[19] = 0;
      da[20] = 327685;
      da[21] = 327685;
      da[22] = 327685;
      da[23] = 327685;
      da[24] = 0;
      da[25] = 327685;
      da[26] = 327685;
      da[46] = 50;
      da[40] = 0;
      da[47] = 0;
      da[48] = 0;
      da[49] = 0;
      da[50] = 0;
      da[51] = 0;
      da[53] = 0;
      da[54] = 1310770;
      da[41] = -1;
      da[42] = -1;
      da[43] = -1;
      da[44] = -1;
      da[45] = -1;
      da[18] = 1;
      da[11] = 13;
      da[39] = 0;

      for(int var2 = 0; var2 < ea.length; ++var2) {
         for(int var1 = 0; var1 < ea[var2].length; ++var1) {
            for(var0 = 0; var0 < ea[var2][var1].length; ++var0) {
               ea[var2][var1][var0] = -1;
            }
         }
      }

   }

   public static int J(int var0) {
      return var0 >= 30 ? -1 : var0 * var0 * 60;
   }

   public static boolean K(int var0) {
      if (da[46] + var0 < 0) {
         return false;
      } else {
         int[] var10000 = da;
         var10000[46] += var0;
         return true;
      }
   }

   public static int[] BA() {
      int var0 = da[42];
      return var0 != -1 && ea[0][var0][4] != -1 ? ea[0][var0] : null;
   }

   public static void J(int var0, int var1) {
      da[4] = (var0 << 12) + 2048;
      da[5] = (var1 << 12) + 2048;
      if (B.h >= 0) {
         da[30] = B.h;
         B.h = -1;
      }

      gB = -1;
      iB = -1;
      lB = -1;
      kB = true;
      D(da, 0);
      E(da, 0);
      F(da, 0);

      int var2;
      for(var2 = 0; var2 < O(da); ++var2) {
         B(da, var2, 0);
      }

      for(var2 = 0; var2 < P(da); ++var2) {
         C(da, var2, 0);
      }

      for(var2 = 0; var2 < Q(da); ++var2) {
         D(da, var2, 0);
      }

      N(da, 0);
      B.A(da, var0, var1);
   }

   public static void CA() {
      int var2 = 0;
      int var0 = Z(BA());
      int var1 = da[42];
      byte var3;
      switch(var0) {
      case 0:
         var3 = pc[0][1];
         var2 = A(ea[0][var1])[16];
         break;
      case 1:
         var2 = A(ea[0][var1])[16];
         var1 = J(da);
         var0 = 0;
         if (pc[0][2] < rc[var1].length) {
            var0 = rc[var1][pc[0][2]].length;
         }

         if (var2 > var0) {
            var3 = pc[0][1];
         } else {
            var3 = pc[0][2];
         }
         break;
      case 2:
         var3 = pc[0][3];
         var2 = A(ea[0][var1])[16];
         break;
      case 3:
         var3 = pc[0][4];
         var2 = A(ea[0][var1])[16];
         break;
      case 4:
         var3 = pc[0][5];
         break;
      default:
         var3 = pc[0][0];
      }

      if (da[45] != -1) {
         var3 = pc[0][5];
         var2 = 0;
      }

      if (var3 < 0 || var3 >= K(da)) {
         var3 = 0;
      }

      if (var2 < 0 || var2 >= M(da)) {
         var2 = 0;
      }

      if (L(da) != var3) {
         E(da, var3);
      }

      if (N(da) != var2) {
         F(da, var2);
      }

   }

   public static boolean DA() {
      if (da[45] != -1 && ea[4][da[45]][4] != -1) {
         int[] var0 = wa[ea[4][da[45]][4]];
         if (var0[6] == 0) {
            return false;
         }
      }

      return true;
   }

   public static int EA() {
      int var4 = -1;
      int var3 = -1;

      for(int var2 = 0; var2 < fa.length; ++var2) {
         if (L(var2) && M(var2)) {
            int var1 = (fa[var2][4] - da[4]) * B.d >> 12;
            int var0 = (fa[var2][5] - da[5]) * B.d >> 12;
            var0 = var1 * var1 + var0 * var0;
            if (var0 < var3 || var3 == -1) {
               var3 = var0;
               var4 = var2;
            }
         }
      }

      return var4;
   }

   public static void FA() {
      if (fa.length == 0) {
         gB = -1;
      } else {
         int var1;
         if (gB == -1) {
            var1 = 0;
         } else {
            var1 = gB + 1;
         }

         gB = -1;

         for(int var0 = 0; var0 < fa.length; ++var0) {
            if (var1 == fa.length) {
               kB = true;
               break;
            }

            if (L(var1)) {
               gB = var1;
               kB = false;
               break;
            }

            ++var1;
         }

      }
   }

   public static boolean L(int var0) {
      if (var0 >= 0 && var0 < fa.length) {
         if (fa[var0][11] == -1) {
            return false;
         } else if ((fa[var0][13] & 2) == 0 && (fa[var0][3] & 65536) == 0 && !N(var0)) {
            int var1 = (fa[var0][4] * B.d >> 12) - tB;
            var0 = (fa[var0][5] * B.d >> 12) - uB;
            return var1 >= 0 && var1 <= f && var0 >= 0 && var0 <= g;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean M(int var0) {
      if (var0 >= 0 && var0 <= fa.length) {
         int var2 = V(BA());
         if (da[45] != -1 && ea[4][da[45]][4] != -1) {
            int[] var1 = wa[ea[4][da[45]][4]];
            if (var1[6] > 0) {
               var2 = var1[7] * 4096 / 10;
            }
         }

         boolean var3;
         if (B.A(da, fa[var0], var2) && B.F(da, fa[var0])) {
            var3 = true;
         } else {
            var3 = false;
         }

         return var3;
      } else {
         return false;
      }
   }

   public static boolean B(int var0, int[] var1) {
      int[][] var3 = ea[var0];
      var1[3] &= -1048577;
      if (var0 == 2 && var1[4] == 0) {
         K(var1[6]);
         if ((var1[3] & 2) != 0) {
            B.D(var1);
         }

         if (!A(3, var0, (short)((var1[2] & -65536) >> 16), 0, 0, false)) {
            A(11, var0, var1[4], 0, 0, false);
         }

         var1[4] = -1;
         HG.M(10);
         return true;
      } else {
         int[] var10000;
         int var2;
         if (var0 == 2) {
            for(var2 = 0; var2 < var3.length; ++var2) {
               if (var3[var2][4] == var1[4]) {
                  if (var1[6] > 0) {
                     var3[var2][6] += var1[6];
                  } else {
                     int var10002 = var3[var2][6]++;
                  }

                  if ((var1[3] & 2) != 0) {
                     B.D(var1);
                  }

                  if (!A(3, var0, (short)((var1[2] & -65536) >> 16), 0, 0, false)) {
                     A(11, var0, var1[4], 0, 0, false);
                  }

                  short var6;
                  if (var1[4] == 1) {
                     var6 = (short)(da[53] & '\uffff');
                     var0 = var6 + var1[6];
                     var10000 = da;
                     var10000[53] &= -65536;
                     var10000 = da;
                     var10000[53] |= (short)var0 & '\uffff';
                  } else if (var1[4] == 2) {
                     var6 = (short)((da[53] & -65536) >> 16);
                     var0 = var6 + var1[6];
                     var10000 = da;
                     var10000[53] &= 65535;
                     var10000 = da;
                     var10000[53] |= (short)var0 << 16 & -65536;
                  }

                  var1[4] = -1;
                  HG.M(10);
                  return true;
               }
            }
         }

         for(int var5 = 0; var5 < var3.length; ++var5) {
            if (var3[var5][4] == -1) {
               if ((var1[3] & 2) != 0) {
                  B.D(var1);
               }

               for(var2 = 0; var2 < var3[var5].length; ++var2) {
                  var3[var5][var2] = var1[var2];
               }

               var3[var5][2] = -1;
               var3[var5][1] = -1;
               var3[var5][0] = -1;
               if (!A(3, var0, (short)((var1[2] & -65536) >> 16), 0, 0, false)) {
                  A(11, var0, var1[4], 0, 0, false);
               }

               short var7;
               if (var0 == 2) {
                  if (var1[4] == 1) {
                     var7 = (short)(da[53] & '\uffff');
                     var2 = var7 + var1[6];
                     var10000 = da;
                     var10000[53] &= -65536;
                     var10000 = da;
                     var10000[53] |= (short)var2 & '\uffff';
                  } else if (var1[4] == 2) {
                     var7 = (short)((da[53] & -65536) >> 16);
                     var2 = var7 + var1[6];
                     var10000 = da;
                     var10000[53] &= 65535;
                     var10000 = da;
                     var10000[53] |= (short)var2 << 16 & -65536;
                  }
               }

               for(int var4 = 0; var4 < 8; ++var4) {
                  short var8 = (short)(da[31 + var4] & '\uffff');
                  var7 = (short)((da[31 + var4] & -65536) >> 16);
                  if ((da[39] & 1 << var4) == 0 && var8 == var0 && var7 == var1[4]) {
                     var10000 = da;
                     var10000[31 + var4] &= 65535;
                     var10000 = da;
                     var10000[31 + var4] |= (short)var5 << 16 & -65536;
                     var10000 = da;
                     var10000[39] |= 1 << var4;
                  }
               }

               var1[4] = -1;
               HG.M(10);
               return true;
            }
         }

         return false;
      }
   }

   public static boolean GA() {
      if (da[11] != 0) {
         return false;
      } else if ((short)(B.f & '\uffff') == 1 && (short)((B.f & -65536) >> 16) == 2) {
         if (HG.A((int)10) != 0) {
            return false;
         } else {
            short var6 = (short)(da[0] & '\uffff');
            short var5 = (short)((da[0] & -65536) >> 16);
            int var4 = (short)((B.g[var5][var6] & -65536) >> 16) & 255;

            int var3;
            for(var3 = -2; var3 <= 2; ++var3) {
               for(int var2 = -2; var2 <= 2; ++var2) {
                  if (var6 + var3 >= 0 && var6 + var3 < B.b && var5 + var2 >= 0 && var5 + var2 < B.c) {
                     int var1 = (short)((B.g[var5 + var2][var6 + var3] & -65536) >> 16) & 255;

                     for(int var0 = 0; var0 < sB.length; ++var0) {
                        if (var1 == sB[var0]) {
                           return false;
                        }
                     }
                  }
               }
            }

            byte var9 = 0;
            byte var8 = 0;
            byte var7 = 4;

            for(var3 = 0; var3 < qB.length; ++var3) {
               if (var4 == qB[var3]) {
                  var9 = 1;
               }
            }

            if (HG.A((int)2) == 0) {
               for(var3 = 0; var3 < rB.length; ++var3) {
                  if (var4 == rB[var3]) {
                     var9 = 2;
                  }
               }
            }

            for(var3 = 0; var3 < oB.length; ++var3) {
               if (var4 == oB[var3]) {
                  var8 = 2;
               }
            }

            for(var3 = 0; var3 < nB.length; ++var3) {
               if (var4 == nB[var3]) {
                  var8 = 1;
               }
            }

            for(var3 = 0; var3 < pB.length; ++var3) {
               if (var4 == pB[var3]) {
                  switch(da[30]) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  default:
                     var8 = 1;
                  }
               }
            }

            switch(da[30]) {
            case 0:
               var7 = 2;
               break;
            case 1:
               var7 = 3;
               break;
            case 2:
               var7 = 0;
               break;
            case 3:
               var7 = 1;
            }

            B.J();
            String var10 = HG.I(432);

            String var11;
            for(var4 = 0; var4 < B.za; ++var4) {
               var11 = "";
               switch(B.aA[var4]) {
               case 0:
                  var11 = HG.I(175);
                  break;
               case 1:
                  var11 = HG.I(176);
                  break;
               case 2:
                  var11 = HG.I(177);
                  break;
               case 3:
                  var11 = HG.I(178);
                  break;
               case 4:
                  var11 = HG.I(180);
                  break;
               case 5:
                  var11 = HG.I(179);
               }

               var10 = var10 + " " + var11 + " ";
               if (var4 + 1 < B.za) {
                  var10 = var10 + HG.I(433);
               }
            }

            var11 = var10 + HG.I(434);
            I(var9, var8, var7);
            A(var11, HG.I(314), 102, 101);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void HA() {
      boolean var5 = false;
      boolean var4 = false;
      if (da[11] == 0) {
         eB = false;
      }

      int var0;
      int[] var10000;
      if ((short)(da[12] & '\uffff') <= 0) {
         N(da, 16);
         if ((da[3] & 8388608) == 0) {
            A(17, 0, 0, 0, 0, true);
            HG.M(30);
            if (HG.MA(3)) {
               Display.getDisplay(a).vibrate(1000);
            }

            var10000 = da;
            var10000[3] |= 8388608;
            var10000 = da;
            var10000[3] |= 32768;
            A(da, true);
            gB = -1;
            tb = -1;
            ub = -1;
            vb = -1;
            db = false;
            eb = false;
            rD = false;

            for(var0 = 0; var0 < pD.length; ++var0) {
               if ((byte)(pD[var0][6] >> 16 & 255) == 0) {
                  pD[var0][6] = -1;
               }
            }

            for(var0 = 0; var0 < dC.length; ++var0) {
               dC[var0][0] = 0;
            }

            if (HG.gA) {
               HG.DA(11);
            }

            H(gB);
         }

         if (C(da, false) && eB) {
            if (!HA(2) && !HA(3)) {
               D(390, 382, 1, 34);
            } else {
               byte var9 = 30;
               short var11 = 312;
               if (ne >= 0L && oe >= 0L) {
                  if (ne > oe) {
                     var9 = 39;
                     var11 = 313;
                  }
               } else if (ne >= 0L) {
                  var9 = 39;
                  var11 = 313;
               }

               D(var11, 382, var9, 34);
            }
         }

         cB = false;
         dB = false;
         aB = false;
         bB = false;
         eB = false;
         fB = false;
      } else {
         if (o % 20 == 0 && !rD) {
            var0 = (short)((da[13] & -65536) >> 16) * 3 / 100;
            if (var0 == 0) {
               var0 = 1;
            }

            A(1, var0, true, false, da);
         }

         var0 = J(da[18]);
         if (var0 >= 0 && var0 <= da[17]) {
            int var10002 = da[18]++;
            HG.M(7);
            N(da[4], da[5], (short)(da[2] & '\uffff'));
            A(24, 10, true, false, da);
            A(2, 10, true, false, da);
         }

         if (G(da) == 8 || G(da) == 9 || G(da) == 10 || G(da) == 11) {
            if (!C(da, true)) {
               var4 = true;
            } else if (da[45] == -1) {
               int[] var6 = BA();
               if (iB != -1 && jB) {
                  lB = A(da, fa[iB], var6);
               } else {
                  lB = 10;
               }

               iB = -1;
               jB = false;
               H(gB);
            }
         }

         int var1;
         if (!var4 && !rD) {
            int var3;
            if (!cB && !dB || !aB && !bB) {
               var3 = da[52];
            } else {
               var3 = F(da[52] * da[52] >> 1);
            }

            int var2 = da[4];
            var1 = da[5];
            if (cB) {
               var1 -= var3;
               da[30] = 0;
               var5 = true;
            }

            if (dB) {
               var1 += var3;
               da[30] = 2;
               var5 = true;
            }

            if (aB) {
               var2 -= var3;
               da[30] = 3;
               var5 = true;
            }

            if (bB) {
               var2 += var3;
               da[30] = 1;
               var5 = true;
            }

            if (var5) {
               --mB;
               if (mB == 2 && (short)(B.f & '\uffff') == 0) {
                  F(da, true);
               }

               if (mB <= 0) {
                  mB = 4;
                  if ((short)(B.f & '\uffff') == 0) {
                     F(da, false);
                  }
               }

               var0 = da[0];
               var1 = B.A(da, var2, var1, 4128);
               if (var1 == -2) {
                  var10000 = da;
                  var10000[52] += da[16] >> 3;
                  if (da[52] > da[16]) {
                     da[52] = da[16];
                  }
               } else {
                  da[52] = da[16] >> 1;
               }

               if (da[0] != var0) {
                  boolean var8 = A(8, (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16), (short)(var0 & '\uffff'), (short)((var0 & -65536) >> 16), false);
                  boolean var10 = A(13, (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16), (short)(var0 & '\uffff'), (short)((var0 & -65536) >> 16), false);
                  boolean var7 = da[11] == 0 && A(18, (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16), 0, 0, false);
                  if (!var7) {
                     yD = -1;
                  }

                  if (!var8 && !var10 && !var7 && GA()) {
                     return;
                  }
               }
            } else {
               da[52] = da[16] >> 1;
            }
         }

         if (DA()) {
            if (fB) {
               FA();
               H(gB);
            }

            if (!L(gB)) {
               gB = -1;
               H(gB);
            }

            hB = M(gB);
            if (gB == -1 && !kB || !hB && eB) {
               var0 = EA();
               if (var0 != -1) {
                  if (eB) {
                     kB = false;
                  }

                  gB = var0;
                  H(gB);
                  hB = true;
               }
            }

            var0 = Z(BA());
            if (var0 == 3 && (short)((da[53] & -65536) >> 16) <= 0) {
               hB = false;
            } else if (var0 == 2 && (short)(da[53] & '\uffff') <= 0) {
               hB = false;
            }
         } else {
            gB = -1;
            hB = false;
            H(gB);
         }

         --lB;
         if (da[45] == -1) {
            rD = false;
         }

         if (eB && lB < 0) {
            if (da[45] >= 0) {
               DA(da[45]);
               N(da, 12 + da[30]);
            } else if (gB != -1) {
               if (hB) {
                  var1 = fa[gB][4] - da[4];
                  var0 = fa[gB][5] - da[5];
                  da[30] = N(var1, var0);
                  N(da, 8 + da[30]);
                  iB = gB;
                  jB = hB;
                  lB = Integer.MAX_VALUE;
               }
            } else {
               N(da, 8 + da[30]);
               iB = -1;
               jB = false;
               lB = Integer.MAX_VALUE;
            }

            var4 = true;
         }

         if (!var4) {
            if (!rD) {
               if (var5) {
                  N(da, 4 + da[30]);
               } else {
                  N(da, 0 + da[30]);
               }
            }

            C(da, true);
         }

         CA();
         F((short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
         cB = false;
         dB = false;
         aB = false;
         bB = false;
         eB = false;
         fB = false;
      }
   }

   public static void IA() {
      tB = (da[4] * B.d >> 12) - (f >> 1);
      uB = (da[5] * B.d >> 12) - (g >> 1);
      JA();
   }

   public static void JA() {
      boolean var2 = true;
      if (gB != -1) {
         int var1 = da[4] - fa[gB][4];
         int var0 = da[5] - fa[gB][5];
         if (E(var1) * 4 / 3 < (f << 12) / B.d && E(var0) * 4 / 3 < (g << 12) / B.d) {
            var2 = false;
            var1 = da[4] + fa[gB][4] >> 1;
            var0 = da[5] + fa[gB][5] >> 1;
            vB = (var1 * B.d >> 12) - (f >> 1);
            wB = (var0 * B.d >> 12) - (g >> 1);
         }
      }

      if (var2) {
         vB = (da[4] * B.d >> 12) - (f >> 1);
         wB = (da[5] * B.d >> 12) - (g >> 1);
         switch(da[30]) {
         case 0:
            wB -= 1 * B.e;
            break;
         case 1:
            vB += 1 * B.d;
            break;
         case 2:
            wB += 1 * B.e;
            break;
         case 3:
            vB -= 1 * B.d;
         }
      }

      tB = tB * 100 + vB * 28 >> 7;
      uB = uB * 100 + wB * 28 >> 7;
      if (da[11] != 0) {
         if (tB < -(0 * B.e)) {
            tB = -(0 * B.e);
         }

         if (uB < -(3 * B.e)) {
            uB = -(3 * B.e);
         }

         if (tB > (B.b + 0) * B.d - f) {
            tB = (B.b + 0) * B.d - f;
         }

         if (uB > (B.c + 3) * B.e - g) {
            uB = (B.c + 3) * B.e - g;
         }

         if ((B.b + 0) * B.d < f) {
            tB = (B.b * B.d >> 1) - (f >> 1);
         }

         if ((B.c + 6) * B.e < g) {
            uB = (B.c * B.e >> 1) - (g >> 1);
         }
      } else {
         if (tB < -(0 * B.e)) {
            tB = -(0 * B.e);
         }

         if (uB < -(0 * B.e) - xD) {
            uB = -(0 * B.e) - xD;
         }

         if (tB > (B.b + 0) * B.d - f) {
            tB = (B.b + 0) * B.d - f;
         }

         if (uB > (B.c + 5) * B.e - g) {
            uB = (B.c + 5) * B.e - g;
         }

         if ((B.b + 0) * B.d < f) {
            tB = (B.b * B.d >> 1) - (f >> 1);
         }

         if ((B.c + 5) * B.e < g) {
            uB = (B.c * B.e >> 1) - (g >> 1);
         }
      }

   }

   static void KA() {
      for(int var15 = 0; var15 < fa.length; ++var15) {
         int[] var14 = fa[var15];
         int[] var13 = ga[var14[11]];
         int var12 = fa[var15][13];
         if ((fa[var15][3] & 65536) == 0 && !P(var15)) {
            boolean var11 = N(var15);
            boolean var10 = (var12 & 128) != 0;
            boolean var9 = (var12 & 8) != 0;
            boolean var8 = (short)(fa[var15][20] & '\uffff') >= 0;
            boolean var7 = fa[var15][22] >= 0 || (var12 & 64) != 0;
            boolean var10000;
            if ((var12 & 16) != 0) {
               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var6 = ((var13[13] & 1) != 0 || (var13[13] & 2) != 0 || (var13[13] & 4) != 0) && var13[27] == 0;
            boolean var5 = (short)((fa[var15][12] & -65536) >> 16) > 0 && (short)(fa[var15][12] & '\uffff') * 100 / (short)((fa[var15][12] & -65536) >> 16) < 50;
            boolean var4 = (short)((fa[var15][12] & -65536) >> 16) > 0 && (short)(fa[var15][12] & '\uffff') * 100 / (short)((fa[var15][12] & -65536) >> 16) < 20;
            boolean var3 = false;
            boolean var2 = (var13[13] & 128) != 0;
            int var10002;
            if (fa[var15][21] >= 0) {
               var10002 = fa[var15][21]--;
            }

            short var1 = (short)((fa[var15][26] & -65536) >> 16);
            int var0 = (short)(fa[var15][26] & '\uffff');
            int var16;
            if (var1 >= 0 && var8) {
               var16 = var1 - 1;
               if (var16 < 0) {
                  var16 = 20;
                  ++var0;
               }

               fa[var15][26] = (short)var0 & '\uffff' | (short)var16 << 16 & -65536;
            }

            int[] var30;
            if (var10) {
               if (fa[var15][25] <= 0) {
                  var30 = fa[var15];
                  var30[13] &= -129;
                  var1 = (short)(fa[var15][20] & '\uffff');
                  if (var1 >= 0) {
                     B.a[var1][20] = -1;
                     B.a[var1][22] = -1;
                     fa[var15][20] = -1;
                     fa[var15][22] = -1;
                     continue;
                  }
               }

               var10002 = fa[var15][25]--;
            }

            if ((var12 & 512) != 0 && (bc || fa[var15][30] > 0)) {
               var10002 = fa[var15][30]--;
               if (bc || fa[var15][30] <= 0) {
                  var30 = fa[var15];
                  var30[13] &= -513;
                  fa[var15][20] = -1;
                  fa[var15][22] = -1;
                  fa[var15][30] = 0;
                  continue;
               }
            }

            if (!var9) {
               int[] var17;
               int var19;
               if ((var13[13] & 512) != 0) {
                  if (var4 && HG.A((int)100) < 60) {
                     var3 = true;
                  } else if (var5 && HG.A((int)100) < 25) {
                     var3 = true;
                  }

                  if (var3) {
                     var5 = false;

                     for(var19 = 0; var19 < 2; ++var19) {
                        short var20 = (short)((fa[var15][17 + var19] & -65536) >> 16);
                        var1 = (short)(fa[var15][17 + var19] & '\uffff');
                        if (var1 == 2 && var20 >= 0) {
                           var17 = A(la[var20]);
                           if (var17[6] == 0 && var17[3] > 0) {
                              A(var17[6], var17[3], true, false, fa[var15]);
                              fa[var15][17 + var19] = -1;
                              var5 = true;
                              H(gB);
                              L(fa[var15][4], fa[var15][5], (short)(fa[var15][2] & '\uffff'));
                              fa[var15][21] = 20;
                              break;
                           }
                        }
                     }

                     if (var5) {
                        continue;
                     }
                  }
               }

               if (var8) {
                  short var28 = (short)(var14[20] & '\uffff');
                  var17 = B.a[var28];
                  if (D(var15, var17)) {
                     int var21 = F(var14);
                     var16 = F(B.a[var28]);
                     xB[0] = (short)(var21 & '\uffff') << 11;
                     xB[1] = (short)((var21 & -65536) >> 16) << 11;
                     yB[0] = (short)(var16 & '\uffff') << 11;
                     yB[1] = (short)((var16 & -65536) >> 16) << 11;
                     int var27 = var13[29];
                     var16 = var13[29] * var13[29];
                     if (var14[14] >= 0) {
                        var27 = V(ha[var14[14]]);
                        var21 = Z(ha[var14[14]]);
                        if (var21 == 0 || var21 == 1) {
                           var16 = var27 * var27;
                        }
                     }

                     if (var14[15] >= 0) {
                        var19 = V(ha[var14[15]]);
                        var21 = Z(ha[var14[15]]);
                        if (var21 == 0 || var21 == 1) {
                           var16 = var19 * var19;
                        }

                        if (var19 > var27) {
                           var27 = var19;
                        }
                     }

                     long var22 = A(xB, yB);
                     var3 = var22 <= (long)var16;
                     boolean var23 = false;
                     if ((var13[13] & 1) != 0 || (var13[13] & 2) != 0) {
                        var0 = 10;
                     }

                     if (var3 || var22 <= (long)(var27 * var27) && var0 > 3) {
                        fa[var15][26] = 10;
                        if (Q(var15)) {
                           continue;
                        }

                        if (fa[var15][21] < 0) {
                           var0 = C(var15, var28, var3);
                           if (var0 != -1) {
                              var0 = B.a[var28][4] - fa[var15][4];
                              var16 = B.a[var28][5] - fa[var15][5];
                              var0 = N(var0, var16);
                              fa[var15][27] = (short)var0 & '\uffff' | (short)var0 << 16 & -65536;
                              N(fa[var15], 8 + var0);
                              var30 = fa[var15];
                              var30[13] |= 16;
                              if (var2) {
                                 D(var15, true);
                              }

                              T(var15);
                              var30 = fa[var15];
                              var30[13] &= -65;
                              fa[var15][22] = -1;
                              continue;
                           }
                        } else {
                           N(fa[var15], 0 + (short)(fa[var15][27] & '\uffff'));
                           var7 = false;
                           var23 = true;
                        }
                     }

                     if (!var23) {
                        var0 = var13[11] * 4096;
                        if (B.A(fa[var15], B.a[var28], var0)) {
                           if ((var13[13] & 1) == 0 && (var13[13] & 2) == 0 && (fa[var15][13] & 128) == 0 && !var11 && ((short)(fa[var15][20] & '\uffff') != (short)((fa[var15][20] & -65536) >> 16) || fa[var15][20] == -1) && (short)(fa[var15][26] & '\uffff') < 3) {
                              if (var2) {
                                 D(var15, false);
                              }

                              if ((short)((fa[var15][26] & -65536) >> 16) == 20) {
                                 var0 = B.a[var28][4] - fa[var15][4];
                                 var16 = B.a[var28][5] - fa[var15][5];
                                 var0 = N(var0, var16);
                                 fa[var15][27] = (short)var0 & '\uffff' | (short)var0 << 16 & -65536;
                                 N(fa[var15], 12 + (short)(fa[var15][27] & '\uffff'));
                              }

                              if (C(fa[var15], true)) {
                                 N(fa[var15], 0 + (short)(fa[var15][27] & '\uffff'));
                              }
                              continue;
                           }

                           if (!var7) {
                              fa[var15][22] = F(B.a[var28]);
                              var7 = true;
                           }
                        } else if ((var13[13] & 1) == 0 && (var13[13] & 2) == 0 && (short)(fa[var15][26] & '\uffff') <= 3) {
                           if ((fa[var15][13] & '耀') == 0) {
                              var30 = fa[var15];
                              var30[20] &= -65536;
                              var30 = fa[var15];
                              var30[20] |= 65535;
                              fa[var15][22] = fa[var15][23];
                              fa[var15][26] = 1376256;
                           }
                        } else if (fa[var15][22] == -1) {
                           fa[var15][22] = F(B.a[var28]);
                           var30 = fa[var15];
                           var30[13] &= -65;
                           var30 = fa[var15];
                           var30[13] &= -513;
                        } else {
                           xB[0] = fa[var15][4];
                           xB[1] = fa[var15][5];
                           long var18 = (long)var0;
                           if ((var13[13] & 1) == 0 && (fa[var15][13] & '耀') == 0) {
                              if ((var13[13] & 2) != 0) {
                                 var18 *= 4L;
                              } else if ((var13[13] & 4) != 0) {
                                 var18 *= 3L;
                              } else if ((var13[13] & 8) != 0) {
                                 var18 *= 2L;
                              }

                              yB[0] = ((short)(fa[var15][23] & '\uffff') << 11) + 2048;
                              yB[1] = ((short)((fa[var15][23] & -65536) >> 16) << 11) + 2048;
                              if (A(xB, yB) > var18 * var18 || (fa[var15][13] & 16384) != 0) {
                                 if ((fa[var15][13] & 64) != 0) {
                                    var30 = fa[var15];
                                    var30[13] &= -65;
                                    T(var15);
                                 }

                                 var30 = fa[var15];
                                 var30[13] |= 16384;
                                 if (F(fa[var15]) != fa[var15][23]) {
                                    fa[var15][22] = fa[var15][23];
                                    var7 = true;
                                 }

                                 var30 = fa[var15];
                                 var30[20] &= -65536;
                                 var30 = fa[var15];
                                 var30[20] |= 65535;
                                 var30 = fa[var15];
                                 var30[20] &= 65535;
                                 var30 = fa[var15];
                                 var30[20] |= (short)var28 << 16 & -65536;
                              }
                           }
                        }
                     }
                  } else if ((ga[fa[var15][11]][13] & 8) == 0) {
                     if ((fa[var15][13] & 131072) == 0) {
                        C(var15, var6);
                     }
                  } else {
                     var30 = fa[var15];
                     var30[20] &= -65536;
                     var30 = fa[var15];
                     var30[20] |= 65535;
                  }
               }

               if (var7 && (fa[var15][13] & 512) == 0) {
                  if ((fa[var15][13] & 16384) == 0 && o % fa.length == var15) {
                     var0 = fa[var15][29];
                     short var25 = (short)(var14[20] & '\uffff');
                     if (var25 >= 0) {
                        xB[0] = ((short)(fa[var15][0] & '\uffff') << 12) + 2048;
                        xB[1] = ((short)((fa[var15][0] & -65536) >> 16) << 12) + 2048;
                        yB[0] = ((short)(B.a[var25][0] & '\uffff') << 12) + 2048;
                        yB[1] = ((short)((B.a[var25][0] & -65536) >> 16) << 12) + 2048;
                        long var29 = A(xB, yB);
                        yB[0] = ((short)(fa[var15][22] & '\uffff') / 2 << 12) + 2048;
                        yB[1] = ((short)((fa[var15][22] & -65536) >> 16) / 2 << 12) + 2048;
                        long var24 = A(xB, yB);
                        xB[0] = ((short)(B.a[var25][0] & '\uffff') << 12) + 2048;
                        xB[1] = ((short)((B.a[var25][0] & -65536) >> 16) << 12) + 2048;
                        long var26 = A(xB, yB) - (long)(var0 * var0);
                        if (var29 < var24 + var26 && var26 > (long)(var0 * var0) || F(fa[var15]) == fa[var15][22]) {
                           fa[var15][22] = F(B.a[var25]);
                           var30 = fa[var15];
                           var30[13] &= -65;
                           var30 = fa[var15];
                           var30[13] &= -513;
                           T(var15);
                           var7 = true;
                        }
                     }
                  }

                  O(var15);
               }

               if (!var8) {
                  if ((ga[fa[var15][11]][13] & 8) == 0 && (fa[var15][13] & 131072) == 0) {
                     C(var15, var6);
                  }

                  if (!var7 && (short)(fa[var15][20] & '\uffff') == -1) {
                     N(fa[var15], 0 + (short)(fa[var15][27] & '\uffff'));
                     var30 = fa[var15];
                     var30[13] &= -16385;
                     if (var13[27] == 0 || var13[27] == 9) {
                        var10002 = fa[var15][31]--;
                        if (fa[var15][31] <= 0) {
                           fa[var15][31] = HG.A((int)20, (int)50);
                           var0 = F(fa[var15]);
                           var16 = (short)(var0 & '\uffff') + HG.A((int)-5, (int)5);
                           var0 = (short)((var0 & -65536) >> 16) + HG.A((int)-5, (int)5);
                           if (A(var15, 0, var16, var0, true, false)) {
                              fa[var15][22] = (short)var16 & '\uffff' | (short)var0 << 16 & -65536;
                           }
                        }
                     }
                  }
               }

               C(fa[var15], true);
            }
         }
      }

      bc = false;
   }

   static void LA() {
      oA = 0;
      int var7 = 0;

      for(int var6 = 0; var6 < fa.length; ++var6) {
         fa[var6][21] = -1;
         fa[var6][20] = -1;
         fa[var6][16] = -1;
         fa[var6][22] = -1;
         fa[var6][26] = 1376256;
         fa[var6][31] = HG.A((int)20, (int)50);
         fa[var6][29] = ga[fa[var6][11]][29];
         fa[var6][23] = F(fa[var6]);
         short var2 = (short)(fa[var6][12] & '\uffff');
         int var0;
         int var1;
         if (da[11] >= 0) {
            var1 = 0;

            for(var0 = 0; var0 < 2; ++var0) {
               if ((short)(fa[var6][17 + var0] & '\uffff') == 5) {
                  if ((cA[da[11]] & 1 << B.j + var7) == 0) {
                     ++var1;
                  }

                  ++var7;
               }
            }

            if (var1 == 0 && var2 < 0) {
               int[] var10000 = fa[var6];
               var10000[3] |= 65536;
               if ((fa[var6][3] & 2) != 0) {
                  B.D(fa[var6]);
               }

               fa[var6][0] = -1;
               var10000 = dA;
               int var10001 = da[11];
               var10000[var10001] |= 1 << var6;
            }
         }

         if (da[11] == -1 || (dA[da[11]] & 1 << var6) == 0) {
            if ((fa[var6][3] & 65536) == 0 && !N(var6) && var2 > 0) {
               ++oA;
            }

            int var5 = fa[var6][11];
            short var8 = (short)(ga[var5][1] & '\uffff');
            short var4 = (short)((ga[var5][1] & -65536) >> 16);
            byte var3 = (byte)(ga[var5][4] & 255);
            byte var10 = (byte)(ga[var5][4] >> 8 & 255);
            var1 = (byte)(ga[var5][4] >> 16 & 255);
            D(fa[var6], 1 + var8 - 134);
            E(fa[var6], pc[0][0]);
            F(fa[var6], 0);
            var0 = O(fa[var6]);
            if (O(fa[var6]) > 0) {
               B(fa[var6], 0, var4);
            }

            if (ga[var5][4] != -1) {
               if (var0 >= 1) {
                  B(fa[var6], 1, var3);
               }

               if (var1 < 0) {
                  var1 = var1 * -1 - 1;
                  if (Q(fa[var6]) > 0) {
                     D(fa[var6], 0, 1);
                  }
               } else if (var0 >= 2) {
                  B(fa[var6], 2, var10);
               }

               if (J(fa[var6], 0) > 0) {
                  C(fa[var6], 0, var1);
               }
            }

            if (ga[fa[var6][11]][27] != 7 && ga[fa[var6][11]][27] != 8) {
               B.E(var6);
            }

            var0 = fa[var6][14];
            if (var0 >= 0) {
               fa[var6][29] = V(ha[var0]);
               int[] var9 = A(ha[var0]);
               C(var6, var9);
            }

            N(fa[var6], 0 + (short)(fa[var6][27] & '\uffff'));
         }
      }

   }

   static boolean N(int var0) {
      int var1 = ga[fa[var0][11]][27];
      return fa[var0][11] >= 0 && (var1 == 6 || var1 == 7 || var1 == 8 || var1 == 9);
   }

   static void C(int var0, int[] var1) {
      if (var1 != null) {
         int var4 = J(fa[var0]);
         byte var3 = pc[var4][0];
         switch(var1[15]) {
         case 0:
            var3 = pc[var4][1];
            break;
         case 1:
            int var2 = 0;
            if (pc[var4][2] < rc[var4].length) {
               var2 = rc[var4][pc[var4][2]].length;
            }

            if (var1[16] > var2) {
               var3 = pc[var4][1];
            } else {
               var3 = pc[var4][2];
            }
            break;
         case 2:
            var3 = pc[var4][3];
            break;
         case 3:
            var3 = pc[var4][4];
         }

         int var5 = var1[16];
         if (var3 >= K(fa[var0])) {
            var3 = 0;
         }

         E(fa[var0], var3);
         if (var5 >= M(fa[var0])) {
            var5 = 0;
         }

         F(fa[var0], var5);
      }
   }

   static boolean D(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         return (fa[var0][13] & 128) == 0 && (short)(da[12] & '\uffff') > 0;
      } else if ((var1[3] & 32) != 0) {
         if ((var1[13] & 2) == 0 && (var1[3] & 65536) == 0) {
            return (fa[var0][13] & 128) == 0 || (var1[13] & 128) == 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   static int F(int[] var0) {
      short var1;
      short var2;
      if ((var0[3] & 16) != 0) {
         var1 = -1024;
         var2 = -2048;
      } else {
         int[] var5 = A(var0);
         var1 = (short)(var5[2] & '\uffff');
         var2 = (short)((var5[2] & -65536) >> 16);
      }

      int var4 = var0[4] + var1;
      int var3 = var0[5] + var2;
      var3 = (short)(var4 >> 11) & '\uffff' | (short)(var3 >> 11) << 16 & -65536;
      return var3;
   }

   static void C(int var0, boolean var1) {
      int[] var5 = ga[fa[var0][11]];
      long var3 = (long)(var5[11] * 4096);
      short var2 = -1;
      xB[0] = fa[var0][4];
      xB[1] = fa[var0][5];
      long var6;
      if ((fa[var0][13] & 128) == 0 && !N(var0)) {
         yB[0] = da[4];
         yB[1] = da[5];
         var6 = A(xB, yB);
         if (var6 <= var3 * var3 && (short)(da[12] & '\uffff') > 0) {
            fa[var0][22] = F(da);
            var2 = (short)(da[2] & '\uffff');
         }
      }

      int var8;
      if (var1 && (fa[var0][13] & 128) == 0) {
         for(var8 = 0; var8 < fa.length; ++var8) {
            if (var8 != var0 && ((ga[fa[var8][11]][13] & 8) != 0 || N(var8)) && ((short)(ga[fa[var8][11]][1] & '\uffff') != (short)(var5[1] & '\uffff') || (fa[var0][13] & 128) != 0)) {
               yB[0] = fa[var8][4];
               yB[1] = fa[var8][5];
               var6 = A(xB, yB);
               if (var6 <= var3 * var3 && D(var0, fa[var8])) {
                  fa[var0][22] = F(fa[var8]);
                  var2 = (short)(fa[var8][2] & '\uffff');
                  break;
               }
            }
         }
      } else if (N(var0) || (fa[var0][13] & 128) != 0) {
         for(var8 = 0; var8 < fa.length; ++var8) {
            if (var8 != var0 && !N(var8)) {
               yB[0] = fa[var8][4];
               yB[1] = fa[var8][5];
               long var9 = A(xB, yB);
               if (var9 <= var3 * var3 && D(var0, fa[var8])) {
                  fa[var0][22] = F(fa[var8]);
                  var2 = (short)(fa[var8][2] & '\uffff');
                  break;
               }
            }
         }
      }

      int[] var10000;
      if (var2 >= 0) {
         var10000 = fa[var0];
         var10000[13] &= -513;
         var10000 = fa[var0];
         var10000[20] &= -65536;
         var10000 = fa[var0];
         var10000[20] |= (short)var2 & '\uffff';
      } else {
         var10000 = fa[var0];
         var10000[20] &= -65536;
         var10000 = fa[var0];
         var10000[20] |= 65535;
         var10000 = fa[var0];
         var10000[13] &= -32769;
      }

      if (var2 != (short)((fa[var0][20] & -65536) >> 16)) {
         var8 = fa[var0][14];
         if (var8 >= 0) {
            fa[var0][29] = V(ha[var8]);
         }

         fa[var0][26] = 1376256;
         var10000 = fa[var0];
         var10000[13] &= -32769;
      }

   }

   static void O(int var0) {
      int var2 = ((short)(fa[var0][22] & '\uffff') << 11) + 2048;
      int var1 = ((short)((fa[var0][22] & -65536) >> 16) << 11) + 2048;
      int[] var6 = A(fa[var0]);
      if ((fa[var0][13] & 64) != 0) {
         var1 = fa[var0][24];
         var2 = (short)(ya[var0][var1] & '\uffff') << 11;
         var1 = (short)((ya[var0][var1] & -65536) >> 16) << 11;
         var2 -= (short)(var6[2] & '\uffff');
         var1 -= (short)((var6[2] & -65536) >> 16);
      }

      int var5 = fa[var0][4];
      int var4 = fa[var0][5];
      int var3 = var2;
      var2 = var1;
      if ((fa[var0][13] & 64) == 0) {
         var1 = B.A(var5, var4, var3, var1, 4128, ac);
         if (var1 != -2) {
            S(var0);
            return;
         }
      }

      var1 = var6[9];
      xB[0] = var5;
      xB[1] = var4;
      yB[0] = var3 - var5;
      yB[1] = var2 - var4;
      zB[0] = var3;
      zB[1] = var2;
      int[] var10000;
      short var7;
      short var8;
      if (A(xB, zB) <= (long)(var1 * var1)) {
         B.A(fa[var0], var3, var2, 0);
         if ((fa[var0][13] & 64) != 0) {
            var2 = (short)(fa[var0][0] & '\uffff') * 2;
            var3 = (short)((fa[var0][0] & -65536) >> 16) * 2;
            var1 = var2 + ((short)(var6[3] & '\uffff') - (short)(var6[2] & '\uffff') >> 11);
            var5 = var3 + ((short)((var6[3] & -65536) >> 16) - (short)((var6[2] & -65536) >> 16) >> 11);

            for(var4 = var3; var4 <= var5; ++var4) {
               for(var3 = var2; var3 <= var1; ++var3) {
                  if (B(0, B.c * 2, var4) && B(0, B.b * 2, var3) && (byte)(xa[var4 * B.b * 2 * 3 + var3 * 3 + 2] >> 16 & 255) == var0) {
                     var10000 = xa;
                     int var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                     var10000[var10001] &= 65535;
                     var10000 = xa;
                     var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                     var10000[var10001] |= -65536;
                  }
               }
            }

            int var10002 = fa[var0][24]++;
            if (fa[var0][24] >= ya[var0].length) {
               fa[var0][22] = -1;
               var10000 = fa[var0];
               var10000[13] &= -65;
               T(var0);
               if ((fa[var0][13] & 65536) != 0) {
                  var10000 = fa[var0];
                  var10000[13] &= -65537;
                  var10000 = fa[var0];
                  var10000[13] &= -131073;
                  A(14, var0, (short)(fa[var0][0] & '\uffff'), (short)((fa[var0][0] & -65536) >> 16), 0, false);
               }
            } else {
               var8 = (short)(ya[var0][fa[var0][24]] & '\uffff');
               var7 = (short)((ya[var0][fa[var0][24]] & -65536) >> 16);
               A(fa[var0], true);
               if (!A(var0, 1, var8, var7, true, false)) {
                  fa[var0][22] = ya[var0][ya[var0].length - 1];
                  S(var0);
               }

               A(fa[var0], false);
            }
         } else {
            fa[var0][22] = -1;
            if ((fa[var0][13] & 65536) != 0) {
               var10000 = fa[var0];
               var10000[13] &= -65537;
               var10000 = fa[var0];
               var10000[13] &= -131073;
               A(14, var0, (short)(fa[var0][0] & '\uffff'), (short)((fa[var0][0] & -65536) >> 16), 0, false);
            }
         }
      } else {
         if ((fa[var0][3] & 2) != 0) {
            B.D(fa[var0]);
         }

         A(yB, var1, zB);
         var10000 = fa[var0];
         var10000[4] += zB[0];
         var10000 = fa[var0];
         var10000[5] += zB[1];
         var1 = F(fa[var0]);
         var8 = (short)(var1 & '\uffff');
         var7 = (short)((var1 & -65536) >> 16);
         fa[var0][0] = (short)(fa[var0][4] >> 12) & '\uffff' | (short)(fa[var0][5] >> 12) << 16 & -65536;
         if ((fa[var0][13] & 64) == 0 && !A(var0, 0, var8, var7, true, false)) {
            var10000 = fa[var0];
            var10000[4] -= zB[0];
            var10000 = fa[var0];
            var10000[5] -= zB[1];
            fa[var0][0] = (short)(fa[var0][4] >> 12) & '\uffff' | (short)(fa[var0][5] >> 12) << 16 & -65536;
            A(fa[var0], false);
            B.C(fa[var0]);
            N(fa[var0], 0 + (short)(fa[var0][27] & '\uffff'));
            S(var0);
            return;
         }

         B.C(fa[var0]);
         var1 = N(yB[0], yB[1]);
         if ((short)((fa[var0][27] & -65536) >> 16) == var1) {
            var10000 = fa[var0];
            var10000[27] &= -65536;
            var10000 = fa[var0];
            var10000[27] |= (short)var1 & '\uffff';
         }

         var10000 = fa[var0];
         var10000[27] &= 65535;
         var10000 = fa[var0];
         var10000[27] |= (short)var1 << 16 & -65536;
         var7 = (short)(fa[var0][27] & '\uffff');
         N(fa[var0], 4 + var7);
      }

   }

   static int C(int var0, int var1, boolean var2) {
      int[] var10000 = fa[var0];
      var10000[20] &= 65535;
      var10000 = fa[var0];
      var10000[20] |= (short)var1 << 16 & -65536;
      long var6 = A(xB, yB);
      int var10002;
      int var3;
      if (fa[var0][14] >= 0) {
         int var5 = fa[var0][14];
         var3 = V(ha[var5]);
         fa[var0][29] = var3;
         if (var6 <= (long)(var3 * var3)) {
            boolean var4 = true;
            var3 = Z(ha[var5]);
            if (var3 == 2 || var3 == 3) {
               if (B.F(fa[var0], B.a[var1]) && fa[var0][28] > 0 && !var2) {
                  var10002 = fa[var0][28]--;
               } else {
                  var4 = false;
               }
            }

            if (var4) {
               C(var0, A(ha[var5]));
               var10000 = fa[var0];
               var10000[13] &= -8193;
               return var3;
            }
         }
      }

      if (fa[var0][15] >= 0) {
         var3 = fa[var0][15];
         int var8 = V(ha[var3]);
         fa[var0][29] = var8;
         if (var6 <= (long)(var8 * var8)) {
            boolean var9 = true;
            var8 = Z(ha[var3]);
            if (var8 == 2 || var8 == 3) {
               if (B.F(fa[var0], B.a[var1]) && fa[var0][28] > 0 && !var2) {
                  var10002 = fa[var0][28]--;
               } else {
                  var9 = false;
               }
            }

            if (var9) {
               C(var0, A(ha[var3]));
               var10000 = fa[var0];
               var10000[13] |= 8192;
               return var8;
            }
         }
      }

      if (fa[var0][14] == -1 && fa[var0][15] == -1) {
         fa[var0][29] = ga[fa[var0][11]][29];
         return 5;
      } else {
         return -1;
      }
   }

   static boolean P(int var0) {
      if ((short)(fa[var0][12] & '\uffff') > 0) {
         return false;
      } else {
         N(fa[var0], 16);
         C(fa[var0], false);
         if ((fa[var0][13] & 2) == 0) {
            int[] var10000 = fa[var0];
            var10000[13] |= 2;
            var10000 = fa[var0];
            var10000[3] |= 32768;
            A(fa[var0], true);
            if (da[11] >= 0) {
               var10000 = dA;
               int var10001 = da[11];
               var10000[var10001] |= 1 << var0;
            }

            U(var0);
            HG.M(ga[fa[var0][11]][28]);
            if (!N(var0)) {
               --oA;
               if (oA <= 0) {
                  HG.L();
                  HG.M(pA);
                  A(15, 0, 0, 0, 0, false);
               }
            }

            A(4, var0, 0, 0, 0, false);
         }

         return true;
      }
   }

   static boolean Q(int var0) {
      if ((fa[var0][13] & 16) == 0) {
         return false;
      } else if (C(fa[var0], true)) {
         int[] var2 = null;
         int var1;
         if ((fa[var0][13] & 8192) == 0) {
            var1 = fa[var0][14];
         } else {
            var1 = fa[var0][15];
         }

         if (var1 >= 0) {
            var2 = ha[var1];
         }

         short var3 = (short)(fa[var0][20] & '\uffff');
         fa[var0][21] = A(fa[var0], B.a[var3], var2);
         int[] var10000 = fa[var0];
         var10000[13] &= -17;
         return false;
      } else {
         return true;
      }
   }

   static boolean R(int var0) {
      short var2 = (short)(fa[var0][20] & '\uffff');
      int var1 = fa[var0][29];
      int var16 = var1 >> 11;
      int var15 = var1 * var1;
      int var14 = -1;
      long var12 = -1L;
      if (var2 >= 0) {
         var1 = F(fa[var0]);
         int var11 = F(B.a[var2]);
         xB[0] = (short)(var1 & '\uffff') << 11;
         xB[1] = (short)((var1 & -65536) >> 16) << 11;
         int var9;
         int var10;
         if ((B.a[var2][3] & 16) != 0) {
            var10 = 1;
            var9 = 1;
         } else {
            int[] var17 = A(B.a[var2]);
            var10 = (short)(var17[3] & '\uffff') - (short)(var17[2] & '\uffff') >> 11;
            var9 = (short)((var17[3] & -65536) >> 16) - (short)((var17[2] & -65536) >> 16) >> 11;
         }

         zB[0] = (short)(var11 & '\uffff') << 11;
         zB[1] = (short)((var11 & -65536) >> 16) << 11;

         for(int var8 = -var16; var8 <= var16 + var10; ++var8) {
            for(int var7 = -var16; var7 <= var16 + var9; ++var7) {
               if (var7 != 0 || var8 != 0) {
                  int var6 = (short)(var11 & '\uffff') + var8;
                  int var5 = (short)((var11 & -65536) >> 16) + var7;
                  yB[0] = var6 << 11;
                  yB[1] = var5 << 11;
                  long var3 = A(yB, xB);
                  long var18 = A(yB, zB);
                  if (var18 <= (long)var15 && A(var0, 1, var6, var5, true, false) && (var3 < var12 || var12 == -1L)) {
                     var14 = (short)var6 & '\uffff' | (short)var5 << 16 & -65536;
                     var12 = var3;
                  }
               }
            }
         }
      }

      if (var14 >= 0) {
         fa[var0][22] = var14;
         return true;
      } else {
         return false;
      }
   }

   static boolean S(int var0) {
      int var1;
      int var2;
      int[] var10000;
      int var10001;
      for(var2 = 0; var2 < B.c * 2; ++var2) {
         for(var1 = 0; var1 < B.b * 2; ++var1) {
            var10000 = xa;
            var10001 = var2 * B.b * 2 * 3 + var1 * 3 + 1;
            var10000[var10001] &= 65535;
            var10000 = xa;
            var10001 = var2 * B.b * 2 * 3 + var1 * 3 + 1;
            var10000[var10001] |= 0;
         }
      }

      A(fa[var0], true);
      if ((short)(fa[var0][20] & '\uffff') == 0) {
         A(da, true);
      }

      var1 = F(fa[var0]);
      int var17 = (short)(var1 & '\uffff');
      int var16 = (short)((var1 & -65536) >> 16);
      short var15 = (short)(fa[var0][22] & '\uffff');
      short var14 = (short)((fa[var0][22] & -65536) >> 16);
      if (!A(var0, 1, var15, var14, true, false)) {
         if ((short)(fa[var0][20] & '\uffff') < 0) {
            if ((fa[var0][13] & 65536) != 0) {
               var10000 = fa[var0];
               var10000[13] &= -65537;
               var10000 = fa[var0];
               var10000[13] &= -131073;
               A(14, var0, var15 / 2, var14 / 2, 0, false);
            }

            fa[var0][22] = -1;
            return false;
         }

         if (!R(var0)) {
            A(fa[var0], false);
            A(da, false);
            fa[var0][22] = -1;
            fa[var0][20] = -1;
            return false;
         }

         var15 = (short)(fa[var0][22] & '\uffff');
         var14 = (short)((fa[var0][22] & -65536) >> 16);
      }

      int var13 = 0;
      var2 = (Math.abs(var15 - var17) + Math.abs(var14 - var16)) * 10;
      var1 = 0 + var2;
      int var12 = B.b;
      int var11 = B.c;
      int var10 = -1;
      int var9 = -1;
      boolean var8 = false;
      A(var17, var16, var1, 0, var2, 2, -1, -1);
      if (var17 == var15 && var16 == var14) {
         if ((fa[var0][13] & 65536) != 0) {
            var10000 = fa[var0];
            var10000[13] &= -65537;
            var10000 = fa[var0];
            var10000[13] &= -131073;
            A(14, var0, var15 / 2, var14 / 2, 0, false);
         }

         fa[var0][22] = -1;
         return false;
      } else {
         int var3;
         int var4;
         int var5;
         int var6;
         for(int var7 = 0; !var8; ++var7) {
            for(var6 = -1; var6 < 2; ++var6) {
               for(var5 = -1; var5 < 2; ++var5) {
                  var4 = var17 + var6;
                  var3 = var16 + var5;
                  var1 = var13 / 6 + 1;
                  if (A(var0, var1, var4, var3, true, true) && (short)((xa[var3 * B.b * 2 * 3 + var4 * 3 + 1] & -65536) >> 16) != 2) {
                     if (var6 != 0 && var5 != 0) {
                        var13 = (short)((xa[var16 * B.b * 2 * 3 + var17 * 3 + 0] & -65536) >> 16) + 7;
                     } else {
                        var13 = (short)((xa[var16 * B.b * 2 * 3 + var17 * 3 + 0] & -65536) >> 16) + 5;
                     }

                     if ((short)((xa[var3 * B.b * 2 * 3 + var4 * 3 + 1] & -65536) >> 16) != 1 || var13 <= (short)((xa[var3 * B.b * 2 * 3 + var4 * 3 + 0] & -65536) >> 16)) {
                        var2 = (Math.abs(var15 - var4) + Math.abs(var14 - var3)) * 10;
                        var1 = var13 + var2;
                        if (var4 < var12) {
                           var12 = var4;
                        } else if (var4 > var10) {
                           var10 = var4;
                        }

                        if (var3 < var11) {
                           var11 = var3;
                        } else if (var3 > var9) {
                           var9 = var3;
                        }

                        A(var4, var3, var1, var13, var2, 1, var17, var16);
                     }
                  }
               }
            }

            short var18 = -1;

            for(var2 = var12; var2 <= var10; ++var2) {
               for(var1 = var11; var1 <= var9; ++var1) {
                  if ((short)((xa[var1 * B.b * 2 * 3 + var2 * 3 + 1] & -65536) >> 16) == 1 && (var18 > (short)(xa[var1 * B.b * 2 * 3 + var2 * 3 + 0] & '\uffff') || var18 < 0)) {
                     var18 = (short)(xa[var1 * B.b * 2 * 3 + var2 * 3 + 0] & '\uffff');
                     var17 = var2;
                     var16 = var1;
                  }
               }
            }

            if (var18 == -1 || var7 > 250) {
               var10000 = fa[var0];
               var10000[13] &= -257;
               var10000 = fa[var0];
               var10000[13] |= 512;
               fa[var0][30] = 20;
               A(fa[var0], false);
               A(da, false);
               if ((fa[var0][13] & 65536) != 0) {
                  var10000 = fa[var0];
                  var10000[13] &= -65537;
                  var10000 = fa[var0];
                  var10000[13] &= -131073;
                  A(14, var0, var15 / 2, var14 / 2, 0, false);
               }

               return false;
            }

            D(var17, var16, 2);
            if (var17 == var15 && var16 == var14) {
               var8 = true;
            }
         }

         var2 = 0;

         for(var1 = 0; var2 < 8323199; ++var1) {
            var2 = B.A(var17, var16);
            var17 = (short)(var2 & '\uffff');
            var16 = (short)((var2 & -65536) >> 16);
         }

         T(var0);
         if (ya[var0] == null || ya[var0].length != var1 - 1) {
            if (var1 <= 1) {
               A(fa[var0], false);
               A(da, false);
               if ((fa[var0][13] & 65536) != 0) {
                  var10000 = fa[var0];
                  var10000[13] &= -65537;
                  var10000 = fa[var0];
                  var10000[13] &= -131073;
                  A(14, var0, var15 / 2, var14 / 2, 0, false);
               }

               fa[var0][22] = -1;
               return false;
            }

            ya[var0] = new int[var1 - 1];
         }

         short var20 = var15;
         short var21 = var14;
         int[] var19 = A(fa[var0]);
         var6 = (short)(var19[3] & '\uffff') - (short)(var19[2] & '\uffff') >> 11;

         for(var5 = (short)((var19[3] & -65536) >> 16) - (short)((var19[2] & -65536) >> 16) >> 11; var1 > 1; --var1) {
            ya[var0][var1 - 2] = (short)var20 & '\uffff' | (short)var21 << 16 & -65536;

            for(var4 = var21; var4 <= var21 + var5; ++var4) {
               for(var3 = var20; var3 <= var20 + var6; ++var3) {
                  var10000 = xa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] &= -16711681;
                  var10000 = xa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] |= (byte)var0 << 16 & 16711680;
                  var10000 = xa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] &= 16777215;
                  var10000 = xa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] |= (byte)(var1 - 2) << 24 & -16777216;
               }
            }

            var3 = B.A(var20, var21);
            var20 = (short)(var3 & '\uffff');
            var21 = (short)((var3 & -65536) >> 16);
         }

         fa[var0][24] = 0;
         var10000 = fa[var0];
         var10000[13] |= 64;
         if (fa[var0][22] == -1) {
            fa[var0][22] = ya[var0][0];
         }

         A(fa[var0], false);
         return true;
      }
   }

   static void T(int var0) {
      if (ya[var0] != null) {
         int[] var1 = A(fa[var0]);
         int var7 = (short)(var1[3] & '\uffff') - (short)(var1[2] & '\uffff') >> 11;
         int var6 = (short)((var1[3] & -65536) >> 16) - (short)((var1[2] & -65536) >> 16) >> 11;

         for(int var5 = 0; var5 < ya[var0].length; ++var5) {
            short var4 = (short)(ya[var0][var5] & '\uffff');
            short var3 = (short)((ya[var0][var5] & -65536) >> 16);

            for(int var2 = var3; var2 <= var3 + var6; ++var2) {
               for(int var8 = var4; var8 <= var4 + var7; ++var8) {
                  if ((byte)(xa[var2 * B.b * 2 * 3 + var8 * 3 + 2] >> 16 & 255) == var0) {
                     int[] var10000 = xa;
                     int var10001 = var2 * B.b * 2 * 3 + var8 * 3 + 2;
                     var10000[var10001] &= 65535;
                     var10000 = xa;
                     var10001 = var2 * B.b * 2 * 3 + var8 * 3 + 2;
                     var10000[var10001] |= -65536;
                  }
               }
            }
         }
      }

   }

   static void D(int var0, int var1, int var2) {
      if (var0 >= 0 && var1 >= 0 && var1 < B.c * 2 && var0 < B.b * 2) {
         int[] var10000 = xa;
         int var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= 65535;
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var2 << 16 & -65536;
      }
   }

   static void A(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var0 >= 0 && var1 >= 0 && var1 < B.c * 2 && var0 < B.b * 2) {
         int[] var10000 = xa;
         int var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] &= -65536;
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] |= (short)var2 & '\uffff';
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] &= 65535;
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] |= (short)var3 << 16 & -65536;
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= -65536;
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var4 & '\uffff';
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= 65535;
         var10000 = xa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var5 << 16 & -65536;
         B.A(var0, var1, var6, var7);
      }
   }

   static void U(int var0) {
      int var6 = B.s;
      int var5 = 0;
      int[] var10000 = iA;
      var10000[var6] &= -65536;
      var10000 = iA;
      var10000[var6] |= 65535;
      var10000 = iA;
      var10000[var6] &= 65535;
      var10000 = iA;
      var10000[var6] |= 0;
      ++B.s;
      int var1 = fa[var0][14];
      short var2;
      short var7;
      if (var1 >= 0 && ((ia[ha[var1][4]][3] & 1) != 0 || (ha[var1][3] & 131072) != 0 || HG.A((int)100) >= 50)) {
         var2 = (short)(ha[var1][2] & '\uffff');
         var7 = (short)(iA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = iA;
         var10000[var6] &= -65536;
         var10000 = iA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      var1 = fa[var0][15];
      if (var1 >= 0 && ((ia[ha[var1][4]][3] & 1) != 0 || (ha[var1][3] & 131072) != 0 || HG.A((int)100) >= 50)) {
         var2 = (short)(ha[var1][2] & '\uffff');
         var7 = (short)(iA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = iA;
         var10000[var6] &= -65536;
         var10000 = iA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      var1 = fa[var0][16];
      if (var1 >= 0 && ((ka[ja[var1][4]][3] & 1) != 0 || (ja[var1][3] & 131072) != 0 || HG.A((int)100) >= 50)) {
         var2 = (short)(ja[var1][2] & '\uffff');
         var7 = (short)(iA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = iA;
         var10000[var6] &= -65536;
         var10000 = iA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      for(int var4 = 0; var4 < 2; ++var4) {
         short var3 = (short)(fa[var0][17 + var4] & '\uffff');
         var2 = (short)((fa[var0][17 + var4] & -65536) >> 16);
         if (var3 >= 0 && var2 >= 0) {
            var7 = -1;
            if (var3 == 2) {
               var7 = (short)(la[var2][2] & '\uffff');
            } else if (var3 == 3) {
               var7 = (short)(ta[var2][2] & '\uffff');
            } else if (var3 == 5) {
               var7 = (short)(na[var2][2] & '\uffff');
            }

            if (var7 >= 0) {
               var2 = (short)(iA[var6] & '\uffff');
               var10000 = B.a[var7];
               var10000[1] &= -65536;
               var10000 = B.a[var7];
               var10000[1] |= (short)var2 & '\uffff';
               var10000 = iA;
               var10000[var6] &= -65536;
               var10000 = iA;
               var10000[var6] |= (short)var7 & '\uffff';
               ++var5;
            }
         }
      }

      if (fa[var0][19] > 0) {
         var2 = (short)(la[fa[var0][19]][2] & '\uffff');
         var7 = (short)(iA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = iA;
         var10000[var6] &= -65536;
         var10000 = iA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      if (fa[var0][28] > 0) {
         int var8 = A(la);
         la[var8][6] = fa[var0][28];

         for(int var9 = 0; var9 < 2; ++var9) {
            if (fa[var0][14 + var9] >= 0) {
               var1 = Z(ha[fa[var0][14 + var9]]);
               if (var1 == 2) {
                  la[var8][4] = 1;
                  break;
               }

               if (var1 == 3) {
                  la[var8][4] = 2;
                  break;
               }
            }
         }

         var2 = (short)(la[var8][2] & '\uffff');
         var7 = (short)(iA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = iA;
         var10000[var6] &= -65536;
         var10000 = iA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      var10000 = fa[var0];
      var10000[17] &= -65536;
      var10000 = fa[var0];
      var10000[17] |= (short)var6 & '\uffff';
      var10000 = iA;
      var10000[var6] &= 65535;
      var10000 = iA;
      var10000[var6] |= (short)var5 << 16 & -65536;
   }

   public static void D(int var0, boolean var1) {
      int[] var6 = A(fa[var0]);
      int var4 = fa[var0][4];
      int var3 = fa[var0][5];
      int var2 = var6[11] * 4096;
      short var5 = (short)(fa[var0][20] & '\uffff');
      var2 <<= 1;
      B.aa[0] = var4 - var2;
      B.aa[2] = var4 + var2;
      B.aa[1] = var3 - var2;
      B.aa[3] = var3 + var2;
      var4 = (var2 >> 1) - 2048;

      for(var3 = B.A((int[])B.aa, 32); var3 != -1; var3 = (short)((B.a[var3][1] & -65536) >> 16)) {
         if ((B.a[var3][3] & 65536) == 0 && (B.a[var3][13] & 2) == 0) {
            int[] var7 = A(B.a[var3]);
            if (!N((short)((B.a[var3][2] & -65536) >> 16)) && (B.a[var3][11] == fa[var0][11] || var7[1] == var6[1])) {
               var2 = B.a[var3][29];
               if (var1) {
                  fa[var0][26] = 10;
               } else {
                  B.a[var3][29] = var4;
               }

               if ((short)(B.a[var3][20] & '\uffff') != var5) {
                  int[] var10000 = B.a[var3];
                  var10000[13] |= 32768;
                  var10000 = B.a[var3];
                  var10000[20] &= -65536;
                  var10000 = B.a[var3];
                  var10000[20] |= (short)var5 & '\uffff';
                  R((short)((B.a[var3][2] & -65536) >> 16));
               }

               B.a[var3][29] = var2;
            }
         }
      }

   }

   public static int V(int var0) {
      var0 = fa[var0][11];
      if ((ga[var0][13] & 2048) != 0) {
         var0 = ga[var0][12] / 5;
         if (var0 > 2500) {
            var0 = 2500;
         }

         var0 /= 20;
         int var1 = (HG.A(var0) >> 2) + HG.A((int)2);
         var1 += (HG.A(var0) >> 2) + HG.A((int)2);
         var1 += (HG.A(var0) >> 2) + HG.A((int)2);
         var0 = (var0 >> 2) + 2;
         ++B.n;
         return var0 + var1;
      } else {
         return 0;
      }
   }

   public static void MA() {
      int var0;
      for(var0 = 0; var0 < 273; ++var0) {
         cc[var0 * 11 + 4] = -1;
      }

      dc = new short[273][];
      ec = new Image[273][];
      fc = new int[273];
      int var1 = 0;

      for(var0 = 0; var0 < 273; ++var0) {
         if ((cc[var0 * 11 + 9] & 2) != 0) {
            ++var1;
         }
      }

      jc = null;
      hc = -1;

      int var2;
      short var7;
      try {
         System.gc();
         kc = new DataInputStream(HG.db.getClass().getResourceAsStream("/i"));
         short var6 = kc.readShort();
         jc = new byte[var6];
         short var3 = kc.readShort();

         for(var2 = 0; var2 < var3; ++var2) {
            var7 = kc.readShort();

            for(var0 = 0; var0 < 273; ++var0) {
               if (var7 == cc[var0 * 11 + 3]) {
                  short[] var10000 = cc;
                  var10000[var0 * 11 + 9] = (short)(var10000[var0 * 11 + 9] | 4);
               }
            }
         }
      } catch (Exception var5) {
         jc = new byte[32767];
      }

      for(var2 = 0; var2 < 273; ++var2) {
         if ((cc[var2 * 11 + 9] & 2) != 0) {
            var7 = cc[var2 * 11 + 4];

            for(var0 = 0; var0 < (var7 == -1 ? 1 : 1 + gc[var7][1].length / gc[var7][0].length); ++var0) {
               K(var2, var0);
            }
         }
      }

      A(true, 0, 75);

      try {
         if (kc != null) {
            kc.close();
         }
      } catch (Exception var4) {
      }

      kc = null;
      System.gc();
   }

   public static void NA() {
      int var0;
      for(var0 = 0; var0 < fc.length; ++var0) {
         fc[0] = 0;
      }

      for(var0 = 0; var0 < ec.length; ++var0) {
         if ((cc[var0 * 11 + 9] & 2) == 0) {
            ec[var0] = null;
            dc[var0] = null;
         }
      }

      lc = null;
      mc = null;
   }

   public static void K(int var0, int var1) {
      if (var0 >= 0 || var0 < 273) {
         int[] var10000 = fc;
         var10000[var0] |= 1;
         if (var1 < 15) {
            var10000 = fc;
            var10000[var0] |= 1 << 1 + var1;
         }

      }
   }

   public static void A(boolean var0, int var1, int var2) {
      int var7 = 0;
      int var6 = 0;

      int var3;
      for(var3 = 0; var3 < 273; ++var3) {
         if ((fc[var3] & 1) != 0) {
            int[] var10000 = fc;
            var10000[var3] &= 65535;
            var10000 = fc;
            var10000[var3] |= (short)var3 << 16 & -65536;
            fc[var7++] = fc[var3];
         }
      }

      int var5 = 1;

      while(true) {
         while(var5 != 0) {
            short var4;
            if (var5 >= var7) {
               OA();

               for(var5 = 0; var5 < var7; ++var5) {
                  var4 = (short)((fc[var5] & -65536) >> 16);
                  if (var0) {
                     C.c = (var2 - var1) * var6 / var7 + var1;
                  }

                  for(var3 = 0; var3 < 15; ++var3) {
                     if ((fc[var5] & 1 << 1 + var3) != 0) {
                        L(var4, var3);
                     }
                  }

                  ++var6;
               }

               PA();

               for(int var8 = 0; var8 < 273; ++var8) {
                  fc[var8] = 0;
               }

               return;
            }

            var4 = cc[(short)((fc[var5] & -65536) >> 16) * 11 + 3];
            short var9 = cc[(short)((fc[var5 - 1] & -65536) >> 16) * 11 + 3];
            if (var4 < var9) {
               var3 = fc[var5];
               fc[var5] = fc[var5 - 1];
               fc[var5 - 1] = var3;
               --var5;
            } else {
               ++var5;
            }
         }

         ++var5;
      }
   }

   public static void A(int var0, int var1, int var2, int var3, Graphics var4) {
      A(var0, var1, var2, 0, var3, 0, var4);
   }

   public static void A(int var0, int var1, int var2, int var3, int var4, int var5, Graphics var6) {
      var0 -= tB;
      var1 -= uB;
      B(var0, var1, var2, var3, var4, var5, var6);
   }

   public static void B(int var0, int var1, int var2, int var3, Graphics var4) {
      B(var0, var1, var2, 0, var3, 0, var4);
   }

   public static void B(int var0, int var1, int var2, int var3, int var4, int var5, Graphics var6) {
      A(var0, var1, var2, var3, var4, var5, 0, 0, var6);
   }

   public static void A(int var0, int var1, int var2, int var3, int var4, int var5, int var6, Graphics var7) {
      A(var0, var1, var2, var3, var4 << 2, 0, var5, var6, var7);
   }

   private static void A(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, Graphics var8) {
      var3 = var4 * 7;
      if (cc[var2 * 11 + 4] == 5) {
      }

      if (dc != null) {
         if (cc != null) {
            if (cc[var2 * 11 + 3] != -1) {
               if (var2 >= 0 && var2 < dc.length) {
                  if (dc[var2] != null) {
                     if (var3 >= 0 && var3 < dc[var2].length) {
                        if (ec[var2][0] != null) {
                           if (var6 == 0 && var7 == 0) {
                              switch(var5) {
                              case 2:
                                 var8.drawRegion(ec[var2][0], dc[var2][var3 + 1], dc[var2][var3 + 2], dc[var2][var3 + 3], dc[var2][var3 + 4], var5, var0 - dc[var2][var3 + 3] - dc[var2][var3 + 5], var1 + dc[var2][var3 + 6], 20);
                                 break;
                              default:
                                 var8.drawRegion(ec[var2][0], dc[var2][var3 + 1], dc[var2][var3 + 2], dc[var2][var3 + 3], dc[var2][var3 + 4], var5, var0 + dc[var2][var3 + 5], var1 + dc[var2][var3 + 6], 20);
                              }
                           } else {
                              short var11 = dc[var2][var3 + 3];
                              short var10 = dc[var2][var3 + 4];
                              int var9 = var3 + N(var6, var7) * 7;
                              if (var9 < 0 || var9 >= dc[var2].length) {
                                 return;
                              }

                              if (E(var6) > E(var7)) {
                                 var5 = var11 * var7 / var6;

                                 for(var4 = 0; var4 < var11; ++var4) {
                                    var3 = var4 * var7 / var6 - (var5 >> 1);
                                    var8.drawRegion(ec[var2][0], dc[var2][var9 + 1] + var4, dc[var2][var9 + 2], 1, dc[var2][var9 + 4], 0, var0 + var4 - (var11 >> 1), var1 + var3 - (var10 >> 1), 20);
                                 }
                              } else {
                                 var5 = var10 * var6 / var7;

                                 for(var4 = 0; var4 < var10; ++var4) {
                                    var3 = var4 * var6 / var7 - (var5 >> 1);
                                    var8.drawRegion(ec[var2][0], dc[var2][var9 + 1], dc[var2][var9 + 2] + var4, dc[var2][var9 + 3], 1, 0, var0 + var3 - (var11 >> 1), var1 + var4 - (var10 >> 1), 20);
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

   public static boolean W(int var0) {
      return L(var0, 0);
   }

   public static boolean L(int var0, int var1) {
      boolean var7 = false;
      if (cc[var0 * 11 + 4] == 5) {
      }

      if (var0 >= 0 && var0 < ec.length) {
         short var2 = cc[var0 * 11 + 3];
         short var17 = cc[var0 * 11 + 4];
         if (var17 < -1 || var17 >= gc.length) {
            var17 = -1;
         }

         if (0 >= (var17 == -1 ? 1 : 1 + gc[var17][1].length / gc[var17][0].length)) {
            return false;
         } else {
            if (ec[var0] == null) {
               ec[var0] = new Image[var17 == -1 ? 1 : 1 + gc[var17][1].length / gc[var17][0].length];
            }

            if (ec[var0][0] != null) {
               return true;
            } else if ((cc[var0 * 11 + 9] & 1) != 0) {
               return false;
            } else {
               System.gc();
               if (var2 == -1) {
                  return false;
               } else {
                  String var18 = "/";
                  if (var2 < 10) {
                     var18 = "/" + "0";
                  }

                  if (var2 < 100) {
                     var18 = var18 + "0";
                  }

                  var18 = var18 + "" + var2;
                  DataInputStream var6 = null;

                  short[] var10000;
                  try {
                     if ((cc[var0 * 11 + 9] & 4) != 0 && (hc == var0 || M(var0, var2))) {
                        ec[var0][0] = Image.createImage(jc, 0, ic);
                     }

                     if (ec[var0][0] == null) {
                        throw new Exception();
                     }

                     System.gc();
                     cc[var0 * 11 + 0] = (short)ec[var0][0].getWidth();
                     cc[var0 * 11 + 1] = (short)ec[var0][0].getHeight();
                     if (dc[var0] != null) {
                        return true;
                     }

                     InputStream var22 = HG.db.getClass().getResourceAsStream(var18 + ".off");
                     if (var22 == null) {
                        cc[var0 * 11 + 2] = (short)(cc[var0 * 11 + 5] * cc[var0 * 11 + 6]);
                        dc[var0] = new short[cc[var0 * 11 + 2] * 7];
                        int var5 = 0;
                        int var4 = 0;
                        switch(cc[var0 * 11 + 7]) {
                        case 0:
                           var5 = 0;
                           break;
                        case 1:
                           var5 = -cc[var0 * 11 + 0] / cc[var0 * 11 + 5];
                           break;
                        case 2:
                           var5 = -(cc[var0 * 11 + 0] / cc[var0 * 11 + 5] >> 1);
                        }

                        switch(cc[var0 * 11 + 8]) {
                        case 0:
                           var4 = 0;
                           break;
                        case 1:
                           var4 = -cc[var0 * 11 + 1] / cc[var0 * 11 + 6];
                           break;
                        case 2:
                           var4 = -(cc[var0 * 11 + 1] / cc[var0 * 11 + 6] >> 1);
                        }

                        int var3 = 0;

                        for(int var19 = 0; var19 < cc[var0 * 11 + 6]; ++var19) {
                           for(var1 = 0; var1 < cc[var0 * 11 + 5]; ++var1) {
                              dc[var0][var3 + 0] = (short)var0;
                              dc[var0][var3 + 1] = (short)(cc[var0 * 11 + 0] * var1 / cc[var0 * 11 + 5]);
                              dc[var0][var3 + 2] = (short)(cc[var0 * 11 + 1] * var19 / cc[var0 * 11 + 6]);
                              dc[var0][var3 + 3] = (short)(cc[var0 * 11 + 0] / cc[var0 * 11 + 5]);
                              dc[var0][var3 + 4] = (short)(cc[var0 * 11 + 1] / cc[var0 * 11 + 6]);
                              dc[var0][var3 + 5] = (short)var5;
                              dc[var0][var3 + 6] = (short)var4;
                              var3 += 7;
                           }
                        }
                     } else {
                        var6 = new DataInputStream(var22);
                        byte var20 = var6.readByte();
                        cc[var0 * 11 + 2] = (short)var20;
                        dc[var0] = new short[var20 * 7];

                        for(var1 = 0; var1 < var20 * 7; ++var1) {
                           dc[var0][var1] = (short)var6.readByte();
                        }

                        var6.close();
                        var6 = null;
                     }
                  } catch (Exception var15) {
                     ec[var0][0] = null;
                     dc[var0] = null;
                     var7 = true;
                     var10000 = cc;
                     var10000[var0 * 11 + 9] = (short)(var10000[var0 * 11 + 9] | 1);
                  } finally {
                     try {
                        if (var6 != null) {
                           var6.close();
                        }
                     } catch (Exception var14) {
                     }

                  }

                  if (!var7) {
                     return true;
                  } else {
                     short var21 = cc[var0 * 11 + 10];
                     if (var21 != -1 && L(var21, 0)) {
                        ec[var0][0] = ec[var21][0];
                        dc[var0] = dc[var21];
                        var2 = cc[var0 * 11 + 4];

                        for(var1 = 0; var1 < 11; ++var1) {
                           cc[var0 * 11 + var1] = cc[var21 * 11 + var1];
                        }

                        cc[var0 * 11 + 10] = (short)var21;
                        cc[var0 * 11 + 4] = (short)var2;
                        var10000 = cc;
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

   public static boolean X(int var0) {
      DataInputStream var2 = null;
      boolean var1 = false;
      lc = null;
      mc = null;
      System.gc();
      if (M(-1, var0)) {
         return true;
      } else {
         String var3 = "/";
         if (var0 < 10) {
            var3 = "/" + "0";
         }

         if (var0 < 100) {
            var3 = var3 + "0";
         }

         var3 = var3 + "" + var0;

         label134: {
            try {
               InputStream var14 = HG.db.getClass().getResourceAsStream(var3 + ".png");
               if (var14 == null) {
                  return false;
               }

               var2 = new DataInputStream(var14);
               lc = new byte[var2.available()];
               var2.read(lc, 0, lc.length);
               var1 = true;
               var2.close();
               var2 = null;
               var14 = HG.db.getClass().getResourceAsStream(var3 + ".off");
               if (var14 != null) {
                  var2 = new DataInputStream(var14);
                  var2.readByte();
                  mc = new byte[var2.available()];
                  var2.read(mc, 0, mc.length);
                  var2.close();
                  var2 = null;
                  break label134;
               }
            } catch (Exception var12) {
               lc = null;
               mc = null;
               System.gc();
               break label134;
            } finally {
               try {
                  if (var2 != null) {
                     var2.close();
                  }
               } catch (Exception var11) {
               }

            }

            return true;
         }

         System.gc();
         return var1;
      }
   }

   public static void OA() {
      if (kc == null) {
         QA();
      }
   }

   public static void PA() {
      try {
         kc.close();
      } catch (Exception var3) {
      } finally {
         kc = null;
      }

   }

   private static void QA() {
      short var1;
      int var5;
      if (kc != null) {
         try {
            if (kc.markSupported()) {
               kc.reset();
               kc.readShort();
               var1 = kc.readShort();

               for(var5 = 0; var5 < var1; ++var5) {
                  kc.readShort();
               }

               return;
            }

            kc.close();
            kc = null;
         } catch (Exception var4) {
         }
      }

      kc = null;
      InputStream var0 = HG.db.getClass().getResourceAsStream("/i");
      if (var0 != null) {
         try {
            kc = new DataInputStream(var0);
            kc.readShort();
            var1 = kc.readShort();

            for(var5 = 0; var5 < var1; ++var5) {
               kc.readShort();
            }
         } catch (Exception var3) {
            try {
               kc.close();
            } catch (Exception var2) {
            }

            kc = null;
         }

      }
   }

   public static boolean M(int var0, int var1) {
      boolean var6 = false;
      boolean var5 = false;
      if (jc == null) {
         return false;
      } else {
         lc = null;
         mc = null;

         try {
            boolean var4 = true;
            if (kc == null) {
               QA();
               var5 = true;
               var4 = false;
            }

            while(true) {
               short var3 = kc.readShort();
               ic = kc.readShort();
               short var2 = kc.readShort();
               if (var3 > var1 && var4) {
                  QA();
                  var3 = kc.readShort();
                  ic = kc.readShort();
                  var2 = kc.readShort();
               }

               if (var3 < var1) {
                  var4 = false;
               }

               if (var3 > var1 || var3 == 32767) {
                  break;
               }

               if (var3 == var1) {
                  if (var0 == -1) {
                     System.gc();
                     lc = new byte[ic];
                     kc.read(lc, 0, lc.length);
                     if (var2 != 0) {
                        kc.readByte();
                        mc = new byte[var2 - 1];
                        kc.read(mc, 0, mc.length);
                     }

                     var6 = true;
                  } else {
                     hc = var0;
                     kc.read(jc, 0, ic);
                     if (var2 != 0 && dc[var0] == null) {
                        byte var16 = 0;
                        byte var15 = kc.readByte();
                        int var17 = var16 + 1;
                        cc[var0 * 11 + 2] = (short)var15;
                        System.gc();
                        dc[var0] = new short[var15 * 7];

                        for(var1 = 0; var1 < var15 * 7; ++var1) {
                           dc[var0][var1] = (short)kc.readByte();
                           ++var17;
                        }
                     } else {
                        kc.skip((long)var2);
                     }

                     var6 = true;
                  }
                  break;
               }

               kc.skip((long)(ic + var2));
            }
         } catch (Exception var13) {
            var13.printStackTrace();
         } finally {
            if (var5) {
               try {
                  kc.close();
                  kc = null;
               } catch (Exception var12) {
               }
            }

         }

         return var6;
      }
   }

   public static void RA() {
      qc = new byte[8][][][];
      yc = new Image[8][][];
      sc = new byte[8][][];
      rc = new byte[8][][][];
      zc = new byte[8][][];
      uc = new short[8][];
      wc = new int[8][][][];
      xc = new byte[8][];
      vc = new byte[8][][];
      tc = new short[8][][][][];
   }

   public static void SA() {
      for(int var1 = 0; var1 < qc.length; ++var1) {
         short var0 = nc[var1 * 2 + 1];
         if ((var0 & 1) == 0) {
            qc[var1] = (byte[][][])null;
            yc[var1] = (Image[][])null;
            sc[var1] = (byte[][])null;
            rc[var1] = (byte[][][])null;
            zc[var1] = (byte[][])null;
            uc[var1] = null;
            wc[var1] = (int[][][])null;
            xc[var1] = null;
            vc[var1] = (byte[][])null;
            tc[var1] = (short[][][][])null;
         }
      }

      System.gc();
   }

   public static int N(int var0, int var1) {
      if (E(var0) >= E(var1)) {
         return var0 < 0 ? 3 : 1;
      } else {
         return var1 < 0 ? 0 : 2;
      }
   }

   public static void A(int[] var0, int var1) {
      var0[6] &= -65536;
      var0[6] |= (short)var1 & '\uffff';
   }

   public static void B(int[] var0, int var1) {
      var0[6] &= 65535;
      var0[6] |= (short)var1 << 16 & -65536;
   }

   public static void C(int[] var0, int var1) {
      var0[7] &= -65536;
      var0[7] |= (short)var1 & '\uffff';
   }

   public static void D(int[] var0, int var1) {
      if ((var0[3] & 4) != 0) {
         if (var1 >= 0 && var1 < 8) {
            if (qc[var1] == null) {
               Y(var1);
            }

            var0[7] &= 65535;
            var0[7] |= (short)var1 << 16 & -65536;
         }
      }
   }

   public static int G(int[] var0) {
      if ((var0[3] & 4) == 0) {
         return -1;
      } else {
         short var1 = (short)(var0[6] & '\uffff');
         return var1 >= 0 && var1 <= 17 ? var1 : -1;
      }
   }

   public static int H(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)((var0[6] & -65536) >> 16);
   }

   public static int I(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)(var0[7] & '\uffff');
   }

   public static int J(int[] var0) {
      if ((var0[3] & 4) == 0) {
         return -1;
      } else {
         short var1 = (short)((var0[7] & -65536) >> 16);
         return var1 >= 0 && var1 < qc.length ? (short)((var0[7] & -65536) >> 16) : -1;
      }
   }

   public static int K(int[] var0) {
      if ((var0[3] & 4) == 0) {
         return -1;
      } else {
         int var1 = J(var0);
         return var1 == -1 ? -1 : qc[var1].length;
      }
   }

   public static int L(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)(var0[8] & '\uffff');
   }

   public static void E(int[] var0, int var1) {
      if ((var0[3] & 4) != 0) {
         K(var0);
         var0[8] &= -65536;
         var0[8] |= (short)var1 & '\uffff';
         F(var0, 0);
         B((int[])var0, 0);
         C(var0, 0);
      }
   }

   public static int M(int[] var0) {
      int var1 = J(var0);
      if (var1 == -1) {
         return -1;
      } else {
         int var2 = L(var0);
         return var2 >= 0 && var2 < rc[var1].length ? rc[var1][var2].length : -1;
      }
   }

   public static int N(int[] var0) {
      return (var0[3] & 4) == 0 ? -1 : (short)((var0[8] & -65536) >> 16);
   }

   public static void F(int[] var0, int var1) {
      if ((var0[3] & 4) != 0) {
         M(var0);
         var0[8] &= 65535;
         var0[8] |= (short)var1 << 16 & -65536;
      }
   }

   public static void A(int[] var0, int var1, int var2) {
      if (var1 >= 0 && var1 < 8) {
         int var3 = var1 >> 2;
         var1 &= 3;
         var0[9 + var3] &= ~(255 << (var1 << 3));
         var0[9 + var3] |= (var2 & 255) << (var1 << 3);
      }
   }

   public static int G(int[] var0, int var1) {
      if (var1 >= 0 && var1 < 8) {
         int var2 = var1 >> 2;
         var1 &= 3;
         return var0[9 + var2] >> (var1 << 3) & 255;
      } else {
         return 0;
      }
   }

   public static int O(int[] var0) {
      int var1 = J(var0);
      return var1 == -1 ? -1 : wc[var1].length;
   }

   public static int H(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < wc[var2].length ? wc[var2][var1].length : -1;
      }
   }

   public static int I(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         var2 = O(var0);
         if (var1 < 0 && var1 >= var2) {
            return -1;
         } else {
            var2 = G(var0, var1);
            return var2 >= 0 && var2 < H(var0, var1) ? var2 : -1;
         }
      }
   }

   public static void B(int[] var0, int var1, int var2) {
      int var3 = J(var0);
      if (var3 != -1) {
         int var4 = O(var0);
         if (var1 >= 0 || var1 < var4) {
            A(var0, var1, var2);

            for(var4 = 0; var4 < yc[var3].length; ++var4) {
               short var5 = uc[var3][var4 * 6 + 1];
            }

         }
      }
   }

   public static int P(int[] var0) {
      int var1 = J(var0);
      return var1 == -1 ? -1 : xc[var1].length;
   }

   public static int J(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < xc[var2].length ? xc[var2][var1] : -1;
      }
   }

   public static int K(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         var2 = P(var0);
         if (var1 < 0 && var1 >= var2) {
            return -1;
         } else {
            var2 = O(var0) + var1;
            var2 = G(var0, var2);
            return var2 >= 0 && var2 < J(var0, var1) ? var2 : -1;
         }
      }
   }

   public static void C(int[] var0, int var1, int var2) {
      int var3 = J(var0);
      if (var3 != -1) {
         var3 = P(var0);
         if (var1 >= 0 && var1 < var3) {
            var3 = J(var0, var1);
            if (var2 >= 0 && var2 < var3) {
               var1 += O(var0);
               A(var0, var1, var2);
            }
         }
      }
   }

   public static int Q(int[] var0) {
      int var1 = J(var0);
      return var1 == -1 ? -1 : vc[var1].length;
   }

   public static int L(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < vc[var2].length ? vc[var2][var1].length : -1;
      }
   }

   public static int M(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         var2 = Q(var0);
         if (var1 < 0 && var1 >= var2) {
            return -1;
         } else {
            var2 = O(var0) + P(var0) + var1;
            var2 = G(var0, var2);
            return var2 >= 0 && var2 < L(var0, var1) ? var2 : -1;
         }
      }
   }

   public static void D(int[] var0, int var1, int var2) {
      int var3 = J(var0);
      if (var3 != -1) {
         var3 = Q(var0);
         if (var1 >= 0 && var1 < var3) {
            var3 = L(var0, var1);
            if (var2 >= 0 && var2 < var3) {
               var1 += O(var0) + P(var0);
               A(var0, var1, var2);
            }
         }
      }
   }

   public static void N(int[] var0, int var1) {
      J(var0);
      if ((var0[3] & 4) != 0) {
         if (G(var0) != var1) {
            B((int[])var0, 0);
            C(var0, 0);
            A(var0, var1);
         }
      }
   }

   public static boolean C(int[] var0, boolean var1) {
      boolean var9 = false;
      int var8 = H(var0);
      int var7 = G(var0);
      int var6 = J(var0);
      if (var6 >= 0 && var6 < 8) {
         if (qc[var6] == null) {
            return true;
         } else if (var7 >= 0 && var7 < 17) {
            int var5 = L(var0);
            if (var5 == -1 || var5 >= qc[var6].length) {
               var5 = 0;
            }

            ++var8;
            int var4 = 0;
            int var3 = 0;

            for(int var2 = qc[var6][var5][var7][0]; var2 < var8; ++var4) {
               var3 += 5;
               if (var3 >= qc[var6][var5][var7].length) {
                  if (var1) {
                     var8 = 1;
                     var4 = 0;
                  }

                  var9 = true;
                  break;
               }

               var2 += qc[var6][var5][var7][var3];
            }

            B(var0, var8);
            C(var0, var4);
            return var9;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   public static void A(int[] var0, Graphics var1) {
      try {
         int var2 = I(var0);
         int var14 = G(var0);
         int var13 = J(var0);
         int var12 = L(var0);
         int var11 = N(var0);
         if ((var0[3] & 4) == 0) {
            return;
         }

         if (var13 == -1) {
            return;
         }

         if (var13 < 0 || var13 >= qc.length) {
            return;
         }

         if (qc[var13] == null) {
            return;
         }

         if (var12 >= qc[var13].length || var12 < 0) {
            var12 = 0;
         }

         if (var11 >= rc[var13][var12].length || var11 < 0) {
            var11 = 0;
         }

         if (var14 < 0 || var14 >= 17) {
            return;
         }

         if (var2 * 5 < -qc[var13][var12][var14].length || var2 * 5 >= qc[var13][var12][var14].length) {
            return;
         }

         int var10 = 1 + var2 * 5;

         for(int var9 = 0; var9 < 4; ++var9) {
            byte var8 = rc[var13][var12][var11][var14 * 4 + var9];
            if (var8 != -1) {
               short var16 = uc[var13][var8 * 6 + 2];
               int var7 = 0;
               if (var16 != -1) {
                  var7 = K(var0, var16);
                  if (var7 == -1) {
                     var7 = 0;
                  }
               }

               short var6 = uc[var13][var8 * 6 + 3];
               short var3 = uc[var13][var8 * 6 + 5];
               if (var3 != -1) {
                  var2 = M(var0, var3);
                  if (var2 == -1) {
                     var2 = 0;
                  }

                  var8 = vc[var13][var3][var2];
               }

               var3 = uc[var13][var8 * 6 + 1];
               int var5 = 0;
               if (var3 != -1) {
                  var5 = I(var0, var3);
                  if (var5 == -1) {
                     var5 = 0;
                  }
               }

               byte var17 = qc[var13][var12][var14][var10 + var9];
               if (var5 >= yc[var13][var8].length) {
                  var5 = 0;
               }

               if (yc[var13][var8][var5] == null) {
                  B(var0, var3, var5);
               }

               if (yc[var13][var8][var5] == null) {
                  return;
               }

               int var4 = var0[4] * B.d >> 12;
               int var18 = var0[5] * B.d >> 12;
               var4 -= tB;
               var18 -= uB;
               if (var17 >= 0) {
                  var2 = var17 * 7;
                  var2 += var7 * var6 * 7;
                  if (var2 < 0 || var2 >= sc[var13][var8].length) {
                     var2 = 0;
                  }

                  var1.drawRegion(yc[var13][var8][var5], sc[var13][var8][var2 + 1], sc[var13][var8][var2 + 2], sc[var13][var8][var2 + 3], sc[var13][var8][var2 + 4], 0, var4 + sc[var13][var8][var2 + 5], var18 + sc[var13][var8][var2 + 6], 20);
               } else {
                  var2 = (-var17 - 1) * 7;
                  var2 += var7 * var6 * 7;
                  if (var2 < 0 || var2 >= sc[var13][var8].length) {
                     var2 = 0;
                  }

                  var1.drawRegion(yc[var13][var8][var5], sc[var13][var8][var2 + 1], sc[var13][var8][var2 + 2], sc[var13][var8][var2 + 3], sc[var13][var8][var2 + 4], 2, var4 - sc[var13][var8][var2 + 3] - sc[var13][var8][var2 + 5], var18 + sc[var13][var8][var2 + 6], 20);
               }
            }
         }
      } catch (Exception var15) {
      }

   }

   public static short[] D(int[] var0, boolean var1) {
      if ((var0[3] & 4) == 0) {
         aC[0] = 0;
         aC[1] = 0;
         aC[2] = 0;
         aC[3] = 0;
         return null;
      } else {
         int var5 = J(var0);
         if (var5 == -1) {
            return null;
         } else if (yc[var5] == null) {
            return null;
         } else {
            int var4 = L(var0);
            int var3 = N(var0);
            int var2 = G(var0);
            int var6 = I(var0);
            if (var1) {
               if (oc[var2] != -1) {
                  var2 = oc[var2];
               }

               var6 = 0;
            }

            if (var4 < 0 || var4 >= tc[var5].length) {
               var4 = 0;
            }

            if (var3 < 0 || var3 >= tc[var5][var4].length) {
               var3 = 0;
            }

            for(int var7 = 0; var7 < 4; ++var7) {
               aC[var7] = tc[var5][var4][var3][var2][var6 * 4 + var7];
            }

            return aC;
         }
      }
   }

   public static void Y(int var0) {
      if (qc[var0] == null) {
         short var2 = nc[var0 * 2 + 0];
         System.gc();
         DataInputStream var17 = null;
         String var1 = "/";
         if (var2 < 10) {
            var1 = "/" + "0";
         }

         if (var2 < 100) {
            var1 = var1 + "0";
         }

         var1 = var1 + "" + var2 + ".mdl";

         try {
            var17 = new DataInputStream(HG.db.getClass().getResourceAsStream(var1));
            var17.readInt();
            byte var3 = var17.readByte();
            byte var27 = var17.readByte();
            byte var29 = var17.readByte();
            if (var3 == 4 && var27 == 17 && var29 == 7) {
               byte var4 = var17.readByte();
               qc[var0] = new byte[var4][17][];

               int var28;
               int var30;
               for(var30 = 0; var30 < var4; ++var30) {
                  for(var28 = 0; var28 < 17; ++var28) {
                     var29 = var17.readByte();
                     qc[var0][var30][var28] = new byte[var29 * 5];
                     var17.read(qc[var0][var30][var28], 0, qc[var0][var30][var28].length);
                  }
               }

               rc[var0] = new byte[qc[var0].length][][];

               int var5;
               int var31;
               for(var5 = 0; var5 < rc[var0].length; ++var5) {
                  var4 = var17.readByte();
                  rc[var0][var5] = new byte[var4][68];

                  for(var30 = 0; var30 < var4; ++var30) {
                     for(var28 = 0; var28 < 17; ++var28) {
                        for(var31 = 0; var31 < 4; ++var31) {
                           rc[var0][var5][var30][var28 * 4 + var31] = var17.readByte();
                        }
                     }
                  }
               }

               byte var7 = var17.readByte();
               uc[var0] = new short[var7 * 6];

               for(var28 = 0; var28 < var7; ++var28) {
                  for(var31 = 0; var31 < 6; ++var31) {
                     uc[var0][var28 * 6 + var31] = var17.readShort();
                     uc[var0][var28 * 6 + 1] = -1;
                  }
               }

               var28 = var17.readInt();
               vc[var0] = new byte[var28][];

               for(var31 = 0; var31 < var28; ++var31) {
                  vc[var0][var31] = new byte[var17.readByte()];
                  var17.read(vc[var0][var31], 0, vc[var0][var31].length);
               }

               byte var6 = var17.readByte();
               wc[var0] = new int[var6][][];

               for(var5 = 0; var5 < var6; ++var5) {
                  var4 = var17.readByte();
                  var3 = var17.readByte();
                  wc[var0][var5] = new int[var4][var3];

                  for(var28 = 0; var28 < var4; ++var28) {
                     for(var31 = 0; var31 < var3; ++var31) {
                        wc[var0][var5][var28][var31] = var17.readInt();
                     }
                  }
               }

               var27 = var17.readByte();
               xc[var0] = new byte[var27];

               for(var31 = 0; var31 < var27; ++var31) {
                  xc[var0][var31] = var17.readByte();
               }

               yc[var0] = new Image[var7][];
               zc[var0] = new byte[var7][];
               sc[var0] = new byte[var7][];
               var17.readInt();
               OA();

               int var32;
               short var37;
               for(var5 = 0; var5 < var7; ++var5) {
                  var17.readInt();
                  var32 = var17.readInt();
                  var30 = var17.readInt();
                  byte[] var34 = null;
                  if (O(var0, var5)) {
                     var17.skip((long)var32);
                     sc[var0][var5] = new byte[var30];
                     var17.read(sc[var0][var5], 0, sc[var0][var5].length);
                  } else {
                     var37 = uc[var0][var5 * 6 + 1];
                     if (var37 == -1) {
                        if (var32 == 0) {
                           var2 = uc[var0][var5 * 6 + 0];
                           boolean var35 = X(var2);
                           if (!var35 || mc != null) {
                              qc[var0] = (byte[][][])null;
                              throw new Exception("");
                           }

                           var34 = lc;
                           var32 = var34.length;
                        } else {
                           var34 = new byte[var32];
                           var17.read(var34, 0, var34.length);
                        }
                     } else {
                        var17.skip((long)var32);
                     }

                     sc[var0][var5] = new byte[var30];
                     var17.read(sc[var0][var5], 0, sc[var0][var5].length);
                     if (var37 == -1) {
                        yc[var0][var5] = new Image[1];
                        yc[var0][var5][0] = Image.createImage(var34, 0, var32);
                        zc[var0][var5] = null;
                     } else {
                        var31 = wc[var0][var37].length;
                        yc[var0][var5] = new Image[var31];
                     }

                     System.gc();
                  }
               }

               PA();

               for(var32 = 0; var32 < var7; ++var32) {
                  if (yc[var0][var32][0] != null) {
                     var30 = yc[var0][var32][0].getWidth();
                     var28 = yc[var0][var32][0].getHeight();

                     for(var31 = 0; var31 < sc[var0][var32].length; var31 += 7) {
                        if (sc[var0][var32][var31 + 1] < 0 || sc[var0][var32][var31 + 1] >= var30) {
                           sc[var0][var32][var31 + 1] = 0;
                        }

                        if (sc[var0][var32][var31 + 2] < 0 || sc[var0][var32][var31 + 2] >= var28) {
                           sc[var0][var32][var31 + 2] = 0;
                        }

                        if (sc[var0][var32][var31 + 1] + sc[var0][var32][var31 + 3] > var30) {
                           sc[var0][var32][var31 + 3] = 1;
                        }

                        if (sc[var0][var32][var31 + 2] + sc[var0][var32][var31 + 4] > var28) {
                           sc[var0][var32][var31 + 4] = 1;
                        }
                     }
                  }
               }

               tc[var0] = new short[rc[var0].length][][][];

               for(int var16 = 0; var16 < rc[var0].length; ++var16) {
                  tc[var0][var16] = new short[rc[var0][var16].length][][];

                  for(int var15 = 0; var15 < rc[var0][var16].length; ++var15) {
                     tc[var0][var16][var15] = new short[17][];

                     for(int var14 = 0; var14 < 17; ++var14) {
                        int var13 = qc[var0][var16][var14].length / 5;
                        tc[var0][var16][var15][var14] = new short[var13 * 4];

                        for(int var12 = 0; var12 < var13; ++var12) {
                           short var11 = 32767;
                           short var10 = -32768;
                           short var9 = 32767;
                           short var8 = -32768;

                           for(int var38 = 0; var38 < 4; ++var38) {
                              var6 = rc[var0][var16][var15][var14 * 4 + var38];
                              var5 = qc[var0][var16][var14][5 * var12 + var38 + 1];
                              if (var6 != -1) {
                                 boolean var36 = false;
                                 if (var5 < 0) {
                                    var5 *= -1;
                                    --var5;
                                    var36 = true;
                                 }

                                 short var33 = (short)sc[var0][var6][var5 * 7 + 5];
                                 var2 = (short)sc[var0][var6][var5 * 7 + 6];
                                 var37 = (short)sc[var0][var6][var5 * 7 + 3];
                                 short var39 = (short)sc[var0][var6][var5 * 7 + 4];
                                 if (var36) {
                                    var33 = (short)(var33 * -1);
                                    var33 -= var37;
                                 }

                                 if (var11 > var33) {
                                    var11 = var33;
                                 }

                                 if (var10 < var33 + var37) {
                                    var10 = (short)(var33 + var37);
                                 }

                                 if (var9 > var2) {
                                    var9 = var2;
                                 }

                                 if (var8 < var2 + var39) {
                                    var8 = (short)(var2 + var39);
                                 }
                              }
                           }

                           tc[var0][var16][var15][var14][var12 * 4 + 0] = var11;
                           tc[var0][var16][var15][var14][var12 * 4 + 2] = var10;
                           tc[var0][var16][var15][var14][var12 * 4 + 1] = var9;
                           tc[var0][var16][var15][var14][var12 * 4 + 3] = var8;
                        }
                     }
                  }
               }

               for(var31 = 0; var31 < 8; ++var31) {
                  if (var31 != var0 && nc[var31 * 2 + 0] == nc[var0 * 2 + 0]) {
                     qc[var31] = qc[var0];
                     yc[var31] = yc[var0];
                     sc[var31] = sc[var0];
                     rc[var31] = rc[var0];
                     zc[var31] = zc[var0];
                     uc[var31] = uc[var0];
                     wc[var31] = wc[var0];
                     xc[var31] = xc[var0];
                     vc[var31] = vc[var0];
                     tc[var31] = tc[var0];
                  }
               }

               return;
            }

            qc[var0] = (byte[][][])null;
         } catch (Exception var25) {
            var25.printStackTrace();
            qc[var0] = (byte[][][])null;
            return;
         } finally {
            try {
               if (var17 != null) {
                  var17.close();
               }
            } catch (Exception var24) {
            }

         }

      }
   }

   private static boolean O(int var0, int var1) {
      short var5 = uc[var0][var1 * 6 + 0];
      short var4 = uc[var0][var1 * 6 + 1];

      for(int var3 = 0; var3 < 8; ++var3) {
         if (var3 != var0 && qc[var3] != null) {
            for(int var2 = 0; var2 < yc[var3].length; ++var2) {
               if (var5 == uc[var3][var2 * 6 + 0] && uc[var3][var2 * 6 + 1] == -1 && var4 == -1) {
                  yc[var0][var1] = new Image[1];
                  yc[var0][var1][0] = yc[var3][var2][0];
                  zc[var0][var1] = zc[var3][var2];
                  return true;
               }
            }
         }
      }

      return false;
   }

   public static void E(int[] var0, boolean var1) {
      var0[10] |= 65536;
      if (var1) {
         var0[10] |= 131072;
      }

   }

   public static void R(int[] var0) {
      if ((var0[10] & 65536) != 0) {
         byte var1 = (byte)(var0[10] >> 24 & 255);
         if (var1 >= 2) {
            short var2 = (short)(var0[10] & '\uffff');
            short var3 = cc[ra[var0[4]][1] * 11 + 5];
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
         } else {
            int var4 = var1 + 1;
            var0[10] &= 16777215;
            var0[10] |= (byte)var4 << 24 & -16777216;
         }
      }

   }

   public static void E(int var0, int var1, int var2) {
      int[] var3 = B(6, var0);
      if ((var3[3] & 2) != 0) {
         B.D(var3);
         var3[0] = (short)var1 & '\uffff' | (short)var2 << 16 & -65536;
         var3[4] = var1 * 4096 + 2048;
         var3[5] = var2 * 4096 + 2048;
         B.C(var3);
      } else {
         var3[0] = (short)var1 & '\uffff' | (short)var2 << 16 & -65536;
         var3[4] = var1 * 4096 + 2048;
         var3[5] = var2 * 4096 + 2048;
      }

      if ((var3[3] & 32) != 0) {
         var3[13] &= -65;
         var3[13] &= -513;
         var3[24] = 0;
         short var4 = (short)((var3[2] & -65536) >> 16);
         T(var4);
      }

   }

   public static final boolean A(int var0, int var1, int var2, int var3, int var4, boolean var5) {
      if ((da[3] & 8388608) == 0 && (short)(da[12] & '\uffff') > 0) {
         boolean var11 = false;
         int var10 = cC.length;

         while(true) {
            boolean var6;
            int[] var9;
            do {
               --var10;
               if (var10 < 0) {
                  return var11;
               }

               var9 = cC[var10];
               if (var9[0] == 13) {
                  var6 = var9[0] == var0 && (var1 < var9[2] || var1 > var9[3] || var2 < var9[4] || var2 > var9[5]) && var3 >= var9[2] && var3 <= var9[3] && var4 >= var9[4] && var4 <= var9[5] && var9[1] == 1;
               } else if (var9[0] == 8) {
                  var6 = var9[0] == var0 && var1 >= var9[2] && var1 <= var9[3] && var2 >= var9[4] && var2 <= var9[5] && (var3 < var9[2] || var3 > var9[3] || var4 < var9[4] || var4 > var9[5]) && var9[1] == 1;
               } else if (var9[0] == 18) {
                  var6 = var9[0] == var0 && var1 >= var9[2] && var1 <= var9[3] && var2 >= var9[4] && var2 <= var9[5] && var9[1] == 1;
               } else {
                  var6 = var9[0] == var0 && var9[2] == var1 && var9[3] == var2 && var9[4] == var3 && var9[1] == 1;
               }
            } while(!var6);

            int[] var8 = null;
            int var7 = -1;
            int var12 = 4;

            while(true) {
               --var12;
               if (var12 < 0) {
                  break;
               }

               if (dC[var12][0] == 0) {
                  var8 = dC[var12];
                  var7 = var12;
                  break;
               }
            }

            if (var8 == null) {
               return var11;
            }

            var8[0] = 1;
            var8[1] = var10;
            var8[2] = var9[6];
            var8[3] = 0;
            var8[4] = 0;
            var8[9] = 16;
            if (var5) {
               O(var8, var7);
            }

            var11 = true;
         }
      } else {
         return false;
      }
   }

   public static final void TA() {
      if (cC != null && cC.length > 0) {
         int var1 = 4;

         while(true) {
            --var1;
            if (var1 < 0) {
               break;
            }

            int[] var0 = dC[var1];
            if (var0[0] != 0) {
               O(var0, var1);
            }
         }
      }

   }

   public static final void O(int[] var0, int var1) {
      int[] var20 = cC[var0[1]];
      byte[] var19 = bC[var0[2]];
      int var18 = var0[3];
      int var17 = var0[4];
      int var16 = var0[5];
      int var15 = var0[6];
      int var14 = var0[7];
      int var13 = var0[8];
      int var12 = var0[9];
      boolean var11 = false;
      boolean var2 = false;

      do {
         if (var0[0] == 2) {
            return;
         }

         if (var17 == 0) {
            if (var18 >= var19.length) {
               var11 = true;
               break;
            }

            var17 = var19[var18++];
            switch(var17) {
            case 1:
            case 4:
            case 5:
            case 33:
            case 46:
            case 72:
            case 73:
               var16 = var19[var18++];
               break;
            case 2:
               var16 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var15 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var14 = var19[var18++];
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
               var16 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 20:
            case 21:
            case 22:
               var16 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var15 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 34:
            case 35:
               var16 = var19[var18++];
               var15 = var19[var18++];
               break;
            case 36:
            case 37:
            case 38:
               var16 = var19[var18++];
               var15 = var19[var18++];
               break;
            case 39:
               var16 = var19[var18++];
               var15 = var19[var18++];
               break;
            case 40:
               var16 = var19[var18++];
               var15 = var19[var18++];
               break;
            case 41:
            case 45:
               var16 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var15 = var19[var18++];
               var14 = var19[var18++];
               break;
            case 42:
            case 43:
            case 74:
               var16 = var19[var18++];
               var15 = var19[var18++];
               var14 = var19[var18++];
               break;
            case 44:
               var16 = var19[var18++];
               var15 = var19[var18++];
               var14 = var19[var18++];
               var13 = var19[var18++];
               break;
            case 47:
            case 66:
            case 67:
               var16 = var19[var18++];
               var15 = var19[var18++];
               break;
            case 48:
               var16 = var19[var18++];
               break;
            case 49:
               var16 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 50:
               var16 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var15 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 51:
               var16 = var19[var18++];
               var15 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 53:
               var16 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 54:
               bD = var18 - 1;
               var16 = var19[var18++];
               var15 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var14 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 55:
               var16 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var15 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var14 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 64:
            case 65:
               var16 = var19[var18++];
               var15 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               break;
            case 68:
            case 69:
               var16 = var19[var18++];
               var15 = var19[var18++];
               var14 = var19[var18++];
               break;
            case 75:
               var16 = var19[var18++];
               var15 = (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var14 = var19[var18++];
               var13 = var19[var18++];
               break;
            case 80:
               var16 = var19[var18++];
               var15 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var14 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
               var13 = var19[var18++];
               break;
            case 81:
               var16 = var19[var18++];
               var15 = var19[var18++] << 16 & 16711680 | (short)(var19[var18++] << 8 & '\uff00' | var19[var18++] & 255);
            }
         }

         boolean var10;
         var10 = true;
         int var3;
         int var4;
         int var5;
         int var21;
         int[] var23;
         int[] var33;
         label428:
         switch(var17) {
         case 1:
            --var16;
            if (var16 >= 0) {
               var10 = false;
               var2 = true;
               rd = true;
            }
            break;
         case 2:
            I(var1, 0, 0);
            var0[0] = 2;
            if (var14 == 1) {
               D(var16, var15, 103, 104);
            } else {
               D(var16, var15, 105, 105);
            }

            var2 = true;
            break;
         case 3:
            var20[1] = 0;
            break;
         case 4:
            cC[var16][1] = 0;
            break;
         case 5:
            cC[var16][1] = 1;
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
            var18 = var16;
            break;
         case 18:
            --var12;
            if (var0[var12] != 0) {
               var18 = var16;
            }
            break;
         case 19:
            --var12;
            if (var0[var12] == 0) {
               var18 = var16;
            }
            break;
         case 20:
            --var12;
            if (var0[var12] < var16) {
               var18 = var15;
            }
            break;
         case 21:
            --var12;
            if (var0[var12] > var16) {
               var18 = var15;
            }
            break;
         case 22:
            --var12;
            if (var0[var12] == var16) {
               var18 = var15;
            }
            break;
         case 23:
            --var12;
            if (var0[var12] != var16) {
               var18 = var15;
            }
            break;
         case 26:
            --var12;
            var16 = var0[var12];
         case 27:
            --var12;
            var15 = var0[var12];
            byte var32 = 0;
            if (var15 > var16) {
               var32 = 1;
            } else if (var15 < var16) {
               var32 = -1;
            }

            var0[var12++] = var32;
            break;
         case 33:
            switch(var16) {
            case 0:
               var0[var12++] = eC;
               break label428;
            case 1:
               var0[var12++] = fC;
               break label428;
            case 2:
               var0[var12++] = gC;
               break label428;
            case 3:
               var0[var12++] = hC;
               break label428;
            case 4:
               var0[var12++] = iC;
            default:
               break label428;
            }
         case 34:
            switch(var16) {
            case 0:
               eC = var15;
               break label428;
            case 1:
               fC = var15;
               break label428;
            case 2:
               gC = var15;
               break label428;
            case 3:
               hC = var15;
               break label428;
            case 4:
               iC = var15;
            default:
               break label428;
            }
         case 35:
            switch(var16) {
            case 0:
               eC += var15;
               break label428;
            case 1:
               fC += var15;
               break label428;
            case 2:
               gC += var15;
               break label428;
            case 3:
               hC += var15;
               break label428;
            case 4:
               iC += var15;
            default:
               break label428;
            }
         case 36:
            if ((oa[var16] & 1 << var15) != 0) {
               var0[var12++] = 1;
            } else {
               var0[var12++] = 0;
            }
            break;
         case 37:
            var33 = oa;
            var33[var16] |= 1 << var15;
            break;
         case 38:
            var33 = oa;
            var33[var16] &= ~(1 << var15);
            break;
         case 39:
            int[] var30 = B(var16, var15);
            var23 = A(var30);
            boolean var28 = true;
            if (var23 != null && da[11] >= 0) {
               var5 = var30[3];
               var4 = da[11];
               short var31 = (short)((var30[2] & -65536) >> 16);
               if ((var5 & 128) != 0 && (fA[var4] & 1 << var31) != 0 || (var5 & 64) != 0 && (eA[var4] & 1 << var31) != 0 || (var5 & 32) != 0 && (dA[var4] & 1 << var31) != 0 || (var5 & 256) != 0 && (bA[var4] & 1 << var31) != 0 || (var5 & 512) != 0 && (cA[var4] & 1 << var31) != 0 || (var5 & 1024) != 0 && (hA[var4] & 1 << var31) != 0 || (var5 & 8192) != 0 && (gA[var4] & 1 << var31) != 0) {
                  var28 = false;
               }
            }

            if (var28) {
               var30[3] &= -65537;
               if ((var30[3] & 2) == 0) {
                  B.C(var30);
               }
            }

            if ((var30[3] & 32) != 0 && !N((short)((var30[2] & -65536) >> 16))) {
               ++oA;
               if (HG.S(2) != 0) {
                  HG.L();
                  HG.M(2);
               }
            }
            break;
         case 40:
            var23 = B(var16, var15);
            var23[3] |= 65536;
            if ((var23[3] & 2) != 0) {
               B.D(var23);
            }

            if ((var23[3] & 32) != 0 && !N((short)((var23[2] & -65536) >> 16))) {
               --oA;
               if (oA <= 0 && HG.S(pA) != 0) {
                  HG.L();
                  HG.M(pA);
               }
            }
            break;
         case 41:
            I(var16, var15, var14);
            String var29;
            if (da[11] == -1) {
               var29 = HG.I(85) + " " + HG.I(86);
               if (B.ya == 2) {
                  var21 = 435;
               } else {
                  var21 = 436;
               }
            } else if (da[11] <= var16) {
               var29 = HG.I(84);
               var21 = 315 + var16;
            } else {
               var29 = HG.I(85);
               var21 = 315 + da[11];
            }

            A(var29, HG.I(var21), 100, 101);
            var0[0] = 2;
            fd = var0;
            gd = var1;
            var2 = true;
            break;
         case 43:
            E(var16, var15, var14);
            break;
         case 44:
            int[] var25 = B(var14, var13);
            var23 = B(var16, var15);
            if ((var23[3] & 2) != 0) {
               B.A(var23, (short)(var25[0] & '\uffff'), (short)((var25[0] & -65536) >> 16));
            } else {
               var23[0] = (short)(var25[0] & '\uffff') & '\uffff' | (short)((var25[0] & -65536) >> 16) << 16 & -65536;
            }
            break;
         case 45:
            A(10, 0, 0, 0, 0, true);
            r.A(HG.cb, var16, var15, var14, false);
            (new Thread(r)).start();
            var11 = true;
            break;
         case 46:
            da[30] = var16;
            B.h = var16;
            break;
         case 47:
            int[] var26 = B(var16, var15);
            if ((var26[3] & 4096) != 0 && (byte)(var26[8] & 255) == 5) {
               var3 = B.E();
               byte var24 = (byte)(var26[8] >> 8 & 255);
               var3 |= 1 << var24;
               var3 |= 1 << var24 + 1;
               E(var26, false);
               var26[3] |= 32768;
               A(var26, true);
               bc = true;
               B.B(var3);
               F((short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
            }
            break;
         case 48:
            var33 = fa[var16];
            var33[12] &= -65536;
            var33 = fa[var16];
            var33[12] |= 65535;
            break;
         case 49:
            AA(var16);
            break;
         case 50:
            A(var16, var15, var0);
            rd = false;
            var2 = true;
            break;
         case 51:
            if (kd == var16) {
               var18 = var15;
            }
            break;
         case 52:
            HG.za = B.K();
            HG.jA.removeAllElements();
            HG.LA(21);
            HG.gA = true;
            break;
         case 53:
            od = var16;
            break;
         case 54:
            zd = var16;
            xd = var15;
            yd = var14;
            var4 = B(zd, true);
            byte var9 = 1;
            byte var8 = 1;
            if (zd == 2 || zd == 3) {
               var8 = 2;
            }

            var3 = 0;
            if (zd == 2) {
               var3 = 50 + da[18] * 10;
            }

            if (var4 - var3 >= 80 * var8) {
               var9 = 4;
            } else if (var4 - var3 >= 65 * var8) {
               var9 = 3;
            } else if (var4 - var3 >= 50 * var8) {
               var9 = 2;
            }

            dD = var9;
            if (da[19] < var9) {
               if (eD) {
                  aD = 0;
               } else {
                  aD = 1;
               }
            } else {
               int var7 = 0;
               if (yd > 0) {
                  if (xd > 0) {
                     var7 = H(2, xd);
                  } else {
                     var7 = da[46];
                  }

                  if (var7 < yd) {
                     if (eD) {
                        aD = 0;
                     } else {
                        aD = 2;
                     }
                     break;
                  }
               }

               String var27 = "";
               if (yd > 0) {
                  var27 = HG.I(ma[xd][0]);
               }

               var5 = 1;
               cD = 0;

               for(var4 = 0; var4 < 3; ++var4) {
                  var21 = var5 * var9;
                  var3 = var5 * yd * var9;
                  if (da[19] < var21 || var7 < var3) {
                     break;
                  }

                  String var22 = HG.I(zd + 29) + " +" + var5 * var8 + "\n(LP: " + var21;
                  if (yd > 0) {
                     var22 = var22 + " " + var27 + ": " + var3;
                  }

                  var22 = var22 + " )";
                  A(var22);
                  ++cD;
                  if (var5 == 1) {
                     var5 = 5;
                  } else {
                     var5 += 5;
                  }
               }

               AA(83);
               A(nd, 471, var0);
               if (eD) {
                  A(nd, 472, var0);
               }

               var2 = true;
            }
            break;
         case 55:
            if (kd < cD && aD == -1) {
               byte var6 = 1;
               if (zd == 2 || zd == 3) {
                  var6 = 2;
               }

               var5 = 1;

               for(var3 = 0; var3 < kd; ++var3) {
                  if (var5 == 1) {
                     var5 = 5;
                  } else {
                     var5 += 5;
                  }
               }

               var4 = var5 * dD;
               var3 = var5 * yd * dD;
               A(zd, var5 * var6, true, false, da);
               A(24, -var4, true, false, da);
               if (yd > 0) {
                  if (xd > 0) {
                     var4 = (short)xd & '\uffff' | 131072;
                     I(var4, var3);
                  } else {
                     K(-var3);
                  }
               }

               eD = true;
            }

            if (aD == 1) {
               var18 = var15;
               eD = false;
            } else if (aD == 2) {
               var18 = var14;
               eD = false;
            } else if (kd < cD && aD != 0) {
               var18 = bD;
            } else {
               var18 = var16;
               eD = false;
            }

            aD = -1;
            zd = -1;
            xd = -1;
            yd = 0;
            break;
         case 64:
            A(var16, var15, true, false, da);
            break;
         case 65:
            A(var16, var15, false, false, da);
            break;
         case 66:
            var23 = B(var16, var15);
            if (A(var16, var23)) {
               var23[3] &= -65537;
               B(var16, var23);
            } else {
               A(HG.I(227), HG.I(230), 101, 106);
               var23[3] &= -65537;
               B.A(var23, (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
            }
            break;
         case 67:
            var23 = B(var16, var15);
            if (A(var16, var23)) {
               var0[var12++] = 1;
            } else {
               var0[var12++] = 0;
            }
            break;
         case 68:
            var3 = H(var16, var15);
            if (var3 >= var14) {
               var0[var12++] = 1;
            } else {
               var0[var12++] = 0;
            }
            break;
         case 69:
            I((short)var15 & '\uffff' | (short)var16 << 16 & -65536, var14);
            break;
         case 70:
            if (da[42] >= 0) {
               var0[var12++] = 1;
            } else {
               var0[var12++] = 0;
            }
            break;
         case 71:
            if (da[41] >= 0) {
               var0[var12++] = 1;
            } else {
               var0[var12++] = 0;
            }
            break;
         case 72:
            var0[var12++] = B(var16, false);
            break;
         case 73:
            HG.M(var16);
            break;
         case 74:
            if (xa != null) {
               var33 = fa[var16];
               var33[13] |= 131072;
               var33 = fa[var16];
               var33[20] &= -65536;
               var33 = fa[var16];
               var33[20] |= 65535;
            } else {
               E(var16, var15, var14);
               A(14, var16, var15, var14, 0, false);
            }
         case 42:
            if (xa != null) {
               fa[var16][22] = (short)(var15 * 2) & '\uffff' | (short)(var14 * 2) << 16 & -65536;
               var33 = fa[var16];
               var33[13] |= 65536;
            } else {
               E(var16, var15, var14);
               A(14, var16, var15, var14, 0, false);
            }
            break;
         case 75:
            if (yD != var16) {
               A((int)10, (int)-2, (int)0);
            }

            yD = var16;
            zD = var15;
            ae = var14;
            be = var13;
            break;
         case 76:
            q = true;
            HG.jA.removeAllElements();
            HG.gA = false;
            HG.dA = 0;
            HG.iA = -1;
            break;
         case 80:
            za[var16][1] = var15;
            var3 = var14 - var15;
            if (var3 > za[var16][2]) {
               za[var16][2] = var3;
            }

            if ((short)(za[var16][0] & '\uffff') == 0) {
               var33 = za[var16];
               var33[0] &= -65536;
               var33 = za[var16];
               var33[0] |= 1;
            }

            var33 = za[var16];
            var33[0] &= 65535;
            var33 = za[var16];
            var33[0] |= (short)var13 << 16 & -65536;
            break;
         case 81:
            var33 = za[var16];
            var33[0] &= -65536;
            var33 = za[var16];
            var33[0] |= 2;
            if (var15 > za[var16][2]) {
               za[var16][2] = var15 - za[var16][1];
            }
         }

         if (var10) {
            var17 = 0;
         }
      } while(!var2 && !var11);

      if (var11) {
         var0[0] = 0;
         od = -1;
         rd = true;
         q = false;
      } else {
         var0[3] = var18;
         var0[4] = var17;
         var0[5] = var16;
         var0[6] = var15;
      }

   }

   static int S(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(da[14] & '\uffff');
      } else if ((var0[3] & 32) != 0) {
         int var1 = var0[11];
         return ga[var1][7];
      } else {
         return 0;
      }
   }

   static int T(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(da[15] & '\uffff');
      } else if ((var0[3] & 32) != 0) {
         int var1 = var0[11];
         return ga[var1][8];
      } else {
         return 0;
      }
   }

   static int U(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(da[26] & '\uffff');
      } else {
         return (var0[3] & 32) != 0 ? 0 : 0;
      }
   }

   static int E(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         switch(var0) {
         case 0:
            return (short)(da[20] & '\uffff') + da[51];
         case 1:
            return (short)(da[21] & '\uffff') + da[51];
         case 2:
            return (short)(da[22] & '\uffff') + da[51];
         case 3:
            return (short)(da[23] & '\uffff') + da[51];
         case 4:
            return (short)(da[24] & '\uffff') + da[51];
         case 5:
            return 10 + da[51];
         }
      }

      if ((var1[3] & 32) != 0) {
         int var2 = var1[11];
         switch(var0) {
         case 0:
            return ga[var2][17];
         case 1:
            return ga[var2][18];
         case 2:
            return ga[var2][19];
         case 3:
            return ga[var2][20];
         case 4:
            return 0;
         case 5:
            return 10;
         }
      }

      return 0;
   }

   public static int F(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         switch(var0) {
         case 0:
         case 1:
         case 5:
            return da[27];
         case 2:
         case 3:
            return da[28];
         case 4:
            return da[29];
         }
      }

      if ((var1[3] & 32) != 0) {
         int var3 = var1[11];
         int var2 = 0;
         switch(var0) {
         case 0:
         case 1:
         case 5:
            if (var1[16] != -1) {
               var2 = ka[ja[var1[16]][4]][11];
            }

            return ga[var3][14] + var2;
         case 2:
         case 3:
            if (var1[16] != -1) {
               var2 = ka[ja[var1[16]][4]][12];
            }

            return ga[var3][15] + var2;
         case 4:
            if (var1[16] != -1) {
               var2 = ka[ja[var1[16]][4]][13];
            }

            return ga[var3][16] + var2;
         }
      }

      return 0;
   }

   public static boolean A(int var0, int[] var1, int[] var2) {
      boolean var5 = false;
      boolean var4 = false;
      byte var3 = 0;
      if ((var1[3] & 16) != 0) {
         int var9 = (short)(var1[12] & '\uffff');
         if (!qA) {
            var9 -= var0;
            var1[12] &= -65536;
            var1[12] |= (short)var9 & '\uffff';
         }

         if (var9 > 0 && var9 <= 0) {
            var5 = true;
         }

         var4 = true;
         var3 = 0;
      }

      if ((var1[3] & 32) != 0) {
         short var7 = (short)(var1[12] & '\uffff');
         short var10 = var7;
         int var8 = var7 - var0;
         var1[12] &= -65536;
         var1[12] |= (short)var8 & '\uffff';
         if (var10 > 0 && var8 <= 0) {
            var5 = true;
         }

         var1[13] &= -9;
         var4 = true;
         var3 = 1;
         H(gB);
      }

      if (var4 && var0 != 0) {
         A((short)((short)(var1[2] & '\uffff')), (short)((short)var0), (short)var3);
         J(var1[4], var1[5], 4096);
      }

      if (var2 != null && var5 && (var2[3] & 16) != 0 && (var1[3] & 32) != 0) {
         int[] var6 = A(var1);
         A(25, var6[12], true, false, da);
      }

      return var5;
   }

   public static int F(int var0, int var1, int var2) {
      var0 = var0 + var1 + (var2 << 1);
      var1 = 0 * var0;
      var0 *= 100;
      var0 += var1;
      var0 /= 200;
      return var0;
   }

   public static int G(int var0, int var1, int var2) {
      var0 = var0 + var1 + (var2 << 1);
      var1 = -20 * var0;
      var0 *= 100;
      var0 += var1;
      var0 /= 200;
      return var0;
   }

   public static int A(int var0, int var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      if (!Q(var2, var1)) {
         return 0;
      } else {
         int var8 = G(var0, var2, var6);
         var6 = F(var0, var2, var6);
         var6 = HG.A(var8, var6);
         if (var7) {
            var6 += da[48];
            var6 += da[49];
            var6 += da[50];
         }

         var4 = var6 - var4;
         if (var7 && C(var5 + var3, var0, var1, var2)) {
            var4 <<= 1;
            if (var4 < 10) {
               var4 = 10;
            }

            if (HG.MA(3)) {
               Display.getDisplay(a).vibrate(500);
            }
         }

         if (var4 < 1) {
            var4 = 1;
         }

         return var4;
      }
   }

   public static int H(int var0, int var1, int var2) {
      var0 = (var2 << 1) + var2 + var0 + var1;
      if (var0 < 1) {
         var0 = 1;
      }

      var0 = 5000 / var0;
      return var0;
   }

   public static int B(int var0, int var1, int var2, int var3) {
      var0 = var0 * 30 + var1 * 2 + var2 * 2 + var3 * 3;
      var0 /= 30;
      return var0;
   }

   public static boolean C(int var0, int var1, int var2, int var3) {
      return B(var0, var1, var2, var3) > HG.A((int)100);
   }

   public static int P(int var0, int var1) {
      return 200 + (var0 << 1) + var1 >> 2;
   }

   public static boolean Q(int var0, int var1) {
      return P(var0, var1) > HG.A((int)100);
   }

   public static int A(int[] var0, int[] var1, int[] var2) {
      int[] var10 = null;
      int var3;
      int var4;
      int var7;
      int var8;
      int var9;
      if (var2 == null) {
         if ((var0[3] & 32) != 0) {
            var3 = ga[var0[11]][29];
         } else {
            var3 = 1024;
         }

         var9 = 2;
         var8 = 0;
         var4 = 100;
         var7 = 5;
      } else {
         var10 = A(var2);
         var3 = V(var2);
         var9 = W(var2);
         var8 = X(var2);
         var4 = Y(var2);
         var7 = Z(var2);
      }

      int var6 = H(T(var0), -1, var4);
      if ((var0[3] & 16) != 0) {
         var6 -= da[47];
         if (var6 < 10) {
            var6 = 10;
         }
      }

      if (B.A(var0, var1, var3)) {
         int var5 = E(var7, var0);
         var4 = F(var7, var1);
         boolean var11 = (var0[3] & 16) != 0;
         var4 = A(S(var0), T(var0), var5, U(var0), var4, var8, var9, var11);
         if (var7 != 2 && var7 != 3) {
            if ((var0[3] & 16) != 0) {
               if (var4 > 0) {
                  HG.M(18);
               } else {
                  HG.M(19);
               }
            } else if ((var1[3] & 16) != 0 && var4 > 0) {
               HG.M(22);
            }

            if ((var1[3] & 32) != 0 && ((short)(var1[20] & '\uffff') == -1 || (short)(var1[26] & '\uffff') < 3)) {
               short var12 = (short)(var0[2] & '\uffff');
               var1[20] &= -65536;
               var1[20] |= (short)var12 & '\uffff';
               var1[22] = F(var0);
               var1[26] = 10;
               if ((ga[var1[11]][13] & 128) != 0) {
                  D((short)((var1[2] & -65536) >> 16), true);
               }
            }

            A(var4, var1, var0);
            if (var4 > 0) {
               if (A(var2, var10, 8) != 0) {
                  C(var1[4], B.A(var1) + 1, 4096, 0, 0, 512);
               }

               if (A(var2, var10, 7) != 0) {
                  E(var1[4], B.A(var1) + 1, 4096, 0, 0, 2048);
               }
            }
         } else {
            var3 = 0;
            if (A(var2, var10, 8) != 0) {
               var3 = 2;
            }

            if (A(var2, var10, 7) != 0) {
               var3 ^= 1;
            }

            switch(var7) {
            case 2:
               A(var0, var1, V(var2), 0, var4, var3);
               break;
            case 3:
               A(var0, var1, V(var2), 1, var4, var3);
            }
         }
      }

      return var6;
   }

   public static int V(int[] var0) {
      if (var0 == null) {
         return 1024;
      } else {
         int var1 = var0[4];
         return ia[var1][13];
      }
   }

   public static int W(int[] var0) {
      if (var0 == null) {
         return 2;
      } else {
         int var1 = var0[4];
         return ia[var1][11];
      }
   }

   public static int A(int[] var0, int[] var1, int var2) {
      int var3 = 0;
      if (var0 != null && var1 != null) {
         int[] var5 = C(var0, var1);

         for(int var4 = 0; var4 < var5.length; ++var4) {
            short var7 = (short)(var5[var4] & '\uffff');
            short var6 = (short)((var5[var4] & -65536) >> 16);
            if (var7 == var2) {
               var3 += var6;
            }
         }

         return var3;
      } else {
         return 0;
      }
   }

   public static int X(int[] var0) {
      if (var0 == null) {
         return 0;
      } else {
         int var1 = var0[4];
         return ia[var1][14];
      }
   }

   public static int Y(int[] var0) {
      if (var0 == null) {
         return 100;
      } else {
         int var1 = var0[4];
         return ia[var1][12];
      }
   }

   public static int Z(int[] var0) {
      if (var0 == null) {
         return 5;
      } else {
         int var1 = var0[4];
         return ia[var1][15];
      }
   }

   public static int[] C(int[] var0, int[] var1) {
      int var2;
      for(var2 = 0; var2 < jC.length; ++var2) {
         jC[var2] = -1;
      }

      for(int var3 = 0; var3 < 2; ++var3) {
         if (var0[6 + var3] != -1) {
            var2 = sa[(short)((var0[6 + var3] & -65536) >> 16)][3];
            jC[var3] = (short)var2 & '\uffff' | (short)(var0[6 + var3] & '\uffff') << 16 & -65536;
         }
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         jC[2 + var4] = var1[5 + var4];
      }

      return jC;
   }

   public static void UA() {
      jA = new int[1 + fa.length][15];

      for(int var1 = 0; var1 < jA.length; ++var1) {
         for(int var0 = 0; var0 < jA[var1].length; ++var0) {
            jA[var1][var0] = -1;
         }

         jA[var1][0] = -1;
         jA[var1][4] = -1;
         jA[var1][5] = -1;
         jA[var1][3] = 65536;
      }

   }

   public static void VA() {
      jA = (int[][])null;
   }

   public static void A(int[] var0, int[] var1, int var2, int var3, int var4, int var5) {
      short var6 = (short)(var0[2] & '\uffff');
      jA[var6][0] = var0[0];
      jA[var6][4] = var0[4];
      jA[var6][5] = var0[5];
      jA[var6][6] = var0[4];
      jA[var6][7] = var0[5];
      jA[var6][9] = var0[4];
      jA[var6][10] = var0[5];
      jA[var6][11] = (short)(var0[2] & '\uffff') & '\uffff' | (short)(var1[2] & '\uffff') << 16 & -65536;
      jA[var6][12] = 0 | (short)var4 << 16 & -65536;
      var4 = var0[4] - var1[4];
      int var9 = var0[5] - var1[5];
      if (var4 <= 32767 && var4 >= -32768 && var9 <= 32767 && var9 >= -32768) {
         var9 = F(var4 * var4 + var9 * var9);
         var9 = 10 * var9 / (var2 + 1) + 1;
      } else {
         var9 = 10;
      }

      jA[var6][13] = (short)var9 & '\uffff' | (short)var9 << 16 & -65536;
      jA[var6][8] = (short)kC[var3 * 7 + 5] & '\uffff' | (short)kC[var3 * 7 + 5] << 16 & -65536;
      jA[var6][14] = (short)var3 & '\uffff' | (short)var5 << 16 & -65536;
      int[] var10000 = jA[var6];
      var10000[3] &= -65537;
      B.C(jA[var6]);
      if ((var0[3] & 16) != 0) {
         int var7 = Z(BA());
         short var8;
         if (var7 == 2) {
            var8 = (short)(da[53] & '\uffff');
            var7 = var8 - 1;
            var10000 = da;
            var10000[53] &= -65536;
            var10000 = da;
            var10000[53] |= (short)var7 & '\uffff';
         } else if (var7 == 3) {
            var8 = (short)((da[53] & -65536) >> 16);
            var7 = var8 - 1;
            var10000 = da;
            var10000[53] &= 65535;
            var10000 = da;
            var10000[53] |= (short)var7 << 16 & -65536;
         }
      }

   }

   private static void P(int[] var0, int var1) {
      int[] var5 = B.a[(short)(var0[11] & '\uffff')];
      int[] var4 = null;
      if (var1 == -1) {
         HG.M(21);
      } else {
         if ((var5[3] & 16) != 0) {
            if ((short)((var0[12] & -65536) >> 16) > 0) {
               HG.M(20);
            } else {
               HG.M(21);
            }
         } else if ((B.a[var1][3] & 16) != 0 && (short)((var0[12] & -65536) >> 16) > 0) {
            HG.M(22);
         }

         if ((B.a[var1][3] & 32) != 0 && ((short)(B.a[var1][20] & '\uffff') == -1 || (short)(B.a[var1][26] & '\uffff') < 3)) {
            short var2 = (short)(var5[2] & '\uffff');
            int[] var10000 = B.a[var1];
            var10000[20] &= -65536;
            var10000 = B.a[var1];
            var10000[20] |= (short)var2 & '\uffff';
            B.a[var1][22] = F(var5);
            B.a[var1][26] = 10;
            if ((ga[B.a[var1][11]][13] & 128) != 0) {
               D((short)((B.a[var1][2] & -65536) >> 16), true);
            }
         }
      }

      int var3;
      if (var1 != -1 && ((B.a[var1][3] & 16) != 0 || (B.a[var1][3] & 32) != 0)) {
         var4 = B.a[var1];
         B.D(var4, lC);
         var3 = var0[4] - var0[6];
         int var6 = var0[5] - var0[7];
         var0[6] = lC[0];
         var0[7] = lC[1];
         var0[4] = var0[6] + var3;
         var0[5] = var0[7] + var6;
      }

      boolean var7 = false;
      if (var4 != null) {
         var7 = A((short)((var0[12] & -65536) >> 16), var4, var5);
      }

      if ((var5[3] & 16) != 0) {
         H(gB);
      }

      var3 = (short)(var0[8] & '\uffff') - (short)((var0[8] & -65536) >> 16);
      if (var7 || (short)((var0[12] & -65536) >> 16) == 0) {
         var0[8] = (short)var3 & '\uffff' | 0;
         var1 = -1;
      }

      Q(var0, var1);
      var0[3] |= 65536;
      B.D(var0);
   }

   public static void WA() {
      for(int var9 = 0; var9 < jA.length; ++var9) {
         if ((jA[var9][3] & 65536) == 0) {
            short var8 = (short)(jA[var9][14] & '\uffff');
            int[] var0 = B.a[(short)((jA[var9][11] & -65536) >> 16)];
            short var7 = (short)((jA[var9][13] & -65536) >> 16);
            short var6 = (short)(jA[var9][13] & '\uffff');
            int var12 = var6 - 1;
            if (var12 == 0) {
               P(jA[var9], (short)((jA[var9][11] & -65536) >> 16));
            } else {
               int[] var10000 = jA[var9];
               var10000[13] &= -65536;
               var10000 = jA[var9];
               var10000[13] |= (short)var12 & '\uffff';
               int var5 = jA[var9][9] - var0[4];
               int var4 = jA[var9][10] - var0[5];
               int var3 = F(var5 * var5 + var4 * var4);
               if (var3 == 0) {
                  var10000 = jA[var9];
                  var10000[3] |= 65536;
                  B.D(jA[var9]);
               } else {
                  int var2 = jA[var9][6];
                  int var1 = jA[var9][7];
                  jA[var9][6] = var5 * var12 / var7 + var0[4];
                  jA[var9][7] = var4 * var12 / var7 + var0[5];
                  int var10 = B.A(var2, var1, jA[var9][6], jA[var9][7], 4144, mC, true);
                  if (var10 != -2 && var10 != (short)(jA[var9][11] & '\uffff')) {
                     if (var10 == -1) {
                        P(jA[var9], -1);
                     } else {
                        P(jA[var9], var10);
                     }
                  } else {
                     jA[var9][4] = jA[var9][6] + var5 * kC[var8 * 7 + 4] / var3;
                     jA[var9][5] = jA[var9][7] + var4 * kC[var8 * 7 + 4] / var3;
                     short var11 = (short)((jA[var9][8] & -65536) >> 16);
                     var3 = var11 + kC[var8 * 7 + 6] * (var12 - (var7 >> 1));
                     if (((short)((jA[var9][14] & -65536) >> 16) & 1) != 0) {
                        B(var2, var1, var11, mC[0] - var2, mC[1] - var1, var3 - var11, 2);
                     }

                     if (((short)((jA[var9][14] & -65536) >> 16) & 2) != 0) {
                        A(var2, var1, var11, mC[0] - var2, mC[1] - var1, var3 - var11, 2);
                     }

                     jA[var9][8] = (short)var11 & '\uffff' | (short)var3 << 16 & -65536;
                     B.D(jA[var9]);
                     var1 = jA[var9][4] >> 12;
                     var10 = jA[var9][5] >> 12;
                     jA[var9][0] = (short)var1 & '\uffff' | (short)var10 << 16 & -65536;
                     B.C(jA[var9]);
                  }
               }
            }
         }
      }

   }

   public static void B(int[] var0, Graphics var1) {
      switch((short)(var0[14] & '\uffff')) {
      case 0:
         B(var0[4], var0[5], var0[6], var0[7], var0[8], var1);
         break;
      case 1:
         A(var0[4], var0[5], var0[6], var0[7], var0[8], var1);
      }

   }

   public static void A(int var0, int var1, int var2, int var3, int var4, Graphics var5) {
      var0 = (var0 * B.d >> 12) - tB;
      var1 = (var1 * B.d >> 12) - uB;
      var2 = (var2 * B.d >> 12) - tB;
      int var6 = (var3 * B.d >> 12) - uB;
      var5.setColor(kC[8]);
      var5.drawLine(var0, var1, var2, var6);
      short var7 = (short)(var4 & '\uffff');
      short var8 = (short)((var4 & -65536) >> 16);
      var1 -= var7 * B.d >> 12;
      var3 = var6 - (var8 * B.d >> 12);
      var5.setColor(kC[7]);
      var5.drawLine(var0, var1, var2, var3);
      if (E(var0 - var2) > E(E(var1 - var3))) {
         var5.drawLine(var0, var1 + 1, var2, var3 + 1);
      } else {
         var5.drawLine(var0 + 1, var1, var2 + 1, var3);
      }

   }

   public static void B(int var0, int var1, int var2, int var3, int var4, Graphics var5) {
      var0 = (var0 * B.d >> 12) - tB;
      int var6 = (var1 * B.d >> 12) - uB;
      var1 = (var2 * B.d >> 12) - tB;
      var2 = (var3 * B.d >> 12) - uB;
      var5.setColor(kC[1]);
      var5.drawLine(var0, var6, var1, var2);
      short var7 = (short)(var4 & '\uffff');
      short var13 = (short)((var4 & -65536) >> 16);
      int var12 = var6 - (var7 * B.d >> 12);
      int var11 = var2 - (var13 * B.d >> 12);
      var5.setColor(kC[0]);
      var5.drawLine(var0, var12, var1, var11);
      int var10 = (var0 * 26 + var1 * 6) / 32;
      int var9 = (var12 * 26 + var11 * 6) / 32;
      int var8 = (var0 * 28 + var1 * 4) / 32;
      int var14 = (var12 * 28 + var11 * 4) / 32;
      var6 = (var0 * 30 + var1 * 2) / 32;
      var4 = (var12 * 30 + var11 * 2) / 32;
      var3 = (var0 * 2 + var1 * 30) / 32;
      var2 = (var12 * 2 + var11 * 30) / 32;
      var5.setColor(kC[2]);
      var5.drawLine(var3, var2, var1, var11);
      var5.setColor(kC[3]);
      var5.drawLine(var10, var9, var8, var14);
      var5.drawLine(var6, var4, var0, var12);
   }

   public static void I(int var0, int var1, int var2) {
      sC = var0;
      tC = var1;
      uC = var2;
   }

   public static void A(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      A(var0, var1, var2, var3);
      oC = true;
      zC = var4;
      ad = var5;
      bd = zC;
      rC = "";
      dd = var6;

      for(int var7 = 0; var7 < pC.length; ++var7) {
         if (pC[var7].indexOf("@1") >= 0) {
            ed = var7;
         } else if (pC[var7].indexOf("@x") >= 0) {
            cd = var7;
         }
      }

   }

   public static void A(String var0, String var1, int var2, int var3) {
      oC = false;
      cd = -1;
      ed = -1;
      Font var4 = j[2];
      pC = HG.A(var0, var4, f - 5 - 5, 0);
      qC = var1;
      int var6 = j[2].getHeight() * pC.length + 4;
      if (var6 < g >> 2) {
         var6 = g >> 2;
      } else if (var6 > g * 2 / 3) {
         var6 = g * 2 / 3;
      }

      int var5 = j[2].getHeight() + 3;
      xC = var6 + var5 + cc[1486] + 3 + 2;
      yC = g - xC >> 1;
      A(8, 5, yC + 2, f - 5 - 5, var5 + 5, 532);
      A(7, 5, yC + var5 + 2, f - 5 - 5, var6 + 5, 33);
      A((int)8, (int)-2, (int)0);
      vC = var2;
      wC = var3;
      nC = true;
   }

   public static void D(int var0, int var1, int var2, int var3) {
      A(HG.I(var0), HG.I(var1), var2, var3);
   }

   public static void M(Graphics var0) {
      int var2 = cc[1486] + 5;
      int var1 = j[2].getHeight() + 3;
      var0.setColor(i[6]);
      var0.fillRect(0, yC, f, xC);
      var0.setColor(i[3]);
      var0.fillRect(3, yC + var1 + 2, f - 6, xC - (var2 + var1) - 2);
      var0.fillRect(3, yC + xC + 2 - var2, f - 6, var2 - 5);
      var0.setColor(i[8]);
      var0.fillRect(3, yC + 3, f - 6, var1 - 3);
      var0.setColor(i[5]);
      var0.drawRect(1, yC + 1, f - 3, xC - 3);
      var0.drawRect(1, yC + var1, f - 3, xC - (var2 + var1));
      B(1, yC + 1, 152, 0, var0);
      B(f - 1, yC + 1, 152, 0, 0, 2, var0);
      if (oC) {
         var1 = cc[1639] / cc[1644];
         B((f >> 1) - var1, yC + xC - var2 + 4, 149, 0, var0);
         B(f >> 1, yC + xC - var2 + 4, 149, 1, var0);
      }

      var1 = cc[1485] / cc[1490];
      if (vC != 106) {
         B(4 + (var1 >> 1), yC + xC - 3, 135, 0, var0);
      }

      if (wC != 106) {
         B(f - 2 - (var1 >> 1), yC + xC - 3, 135, 1, var0);
      }

   }

   public static void N(Graphics var0) {
      var0.setClip(0, 0, f, g);
      M(var0);
      A((String)qC, 8, 2, var0);
      if (oC) {
         String var4 = "";
         String var3 = "";
         int var1;
         int var2;
         String var5;
         if (ed >= 0) {
            var4 = pC[ed];
            var2 = var4.indexOf("@1");
            var1 = var4.lastIndexOf(64);
            if (var1 <= var2) {
               var1 = var2 + 1;
            }

            var5 = var4.substring(0, var2) + dd * bd + var4.substring(var1 + 1);
            pC[ed] = var5;
         }

         if (cd >= 0) {
            var3 = pC[cd];
            var2 = var3.indexOf("@x");
            var1 = var3.lastIndexOf(64);
            if (var1 <= var2) {
               var1 = var2 + 1;
            }

            var5 = var3.substring(0, var2) + bd + var3.substring(var1 + 1);
            pC[cd] = var5;
         }

         A((String[])pC, 7, 2, var0);
         if (cd >= 0) {
            pC[cd] = var3;
         }

         if (ed >= 0) {
            pC[ed] = var4;
         }
      } else {
         A((String[])pC, 7, 2, var0);
      }

   }

   public static void XA() {
      if (C(80) && vC != 106) {
         nC = false;
         oC = false;
         HG.DA(vC);
      }

      if (C(85) && wC != 106) {
         nC = false;
         oC = false;
         HG.DA(wC);
      }

      if (oC) {
         boolean var0 = false;
         if (C(116)) {
            ++bd;
            if (bd > ad) {
               bd = zC;
            }

            rC = "";
         }

         if (C(117)) {
            --bd;
            if (bd < zC) {
               bd = ad;
            }

            rC = "";
         }

         if (C(118)) {
            rC = rC + "0";
            var0 = true;
         }

         if (C(101)) {
            rC = rC + "1";
            var0 = true;
         }

         if (C(102)) {
            rC = rC + "2";
            var0 = true;
         }

         if (C(103)) {
            rC = rC + "3";
            var0 = true;
         }

         if (C(104)) {
            rC = rC + "4";
            var0 = true;
         }

         if (C(115)) {
            rC = rC + "5";
            var0 = true;
         }

         if (C(105)) {
            rC = rC + "6";
            var0 = true;
         }

         if (C(106)) {
            rC = rC + "7";
            var0 = true;
         }

         if (C(107)) {
            rC = rC + "8";
            var0 = true;
         }

         if (C(108)) {
            rC = rC + "9";
            var0 = true;
         }

         if (C(95)) {
            rC = "";
            bd = 0;
         }

         if (var0) {
            int var1 = 0;

            try {
               var1 = Integer.parseInt(rC);
            } catch (Exception var2) {
            }

            bd = var1;
            if (bd < zC) {
               bd = zC;
               rC = "";
            } else if (bd > ad) {
               bd = ad;
               rC = "";
            }
         }
      }

      D();
   }

   public static void YA() {
   }

   public static String Z(int var0) {
      int var1 = ((var0 & 16711680) >> 16) - 1;
      if (var1 >= 0 && var1 < 3) {
         byte[] var2 = (byte[])gD.get(new Integer(var0));
         String var5 = null;
         if (var2 == null) {
            return "lol :D";
         } else {
            switch(hD) {
            case 0:
               var5 = (new String(var2, 0, var2.length)).replace('\r', '\n');
               break;
            case 1:
               StringBuffer var6 = new StringBuffer(var2.length / 2);

               for(var0 = 0; var0 < var2.length - 1; var0 += 2) {
                  var6.append((char)((var2[var0 + 1] & 255) << 8 | var2[var0] & 255));
               }

               var5 = var6.toString().replace('\r', '\n');
               break;
            case 2:
               byte[] var4 = new byte[var2.length + 2];
               var4[0] = (byte)(var2.length >>> 8);
               var4[1] = (byte)var2.length;
               System.arraycopy(var2, 0, var4, 2, var2.length);

               try {
                  var5 = (new DataInputStream(new ByteArrayInputStream(var4))).readUTF().replace('\r', '\n');
               } catch (Exception var3) {
               }
            }

            return var5;
         }
      } else {
         return HG.I(var0);
      }
   }

   public static void ZA() {
      System.gc();
      if (bC != null) {
         gD.clear();
         Vector var10 = new Vector();

         int var1;
         int var3;
         for(var3 = 0; var3 < bC.length; ++var3) {
            byte[] var2 = bC[var3];
            var1 = 0;

            while(var1 < var2.length) {
               byte var0 = var2[var1++];
               switch(var0) {
               case 1:
               case 4:
               case 5:
               case 33:
               case 46:
               case 72:
               case 73:
                  ++var1;
                  break;
               case 2:
                  var10.addElement(new Integer(var2[var1++] << 16 & 16711680 | (short)(var2[var1++] << 8 & '\uff00' | var2[var1++] & 255)));
                  var10.addElement(new Integer(var2[var1++] << 16 & 16711680 | (short)(var2[var1++] << 8 & '\uff00' | var2[var1++] & 255)));
                  ++var1;
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
                  ++var1;
                  ++var1;
                  break;
               case 20:
               case 21:
               case 22:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 34:
               case 35:
                  ++var1;
                  ++var1;
                  break;
               case 36:
               case 37:
               case 38:
                  ++var1;
                  ++var1;
                  break;
               case 39:
                  ++var1;
                  ++var1;
                  break;
               case 40:
                  ++var1;
                  ++var1;
                  break;
               case 41:
               case 45:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 42:
               case 43:
               case 74:
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 44:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 47:
               case 66:
               case 67:
                  ++var1;
                  ++var1;
                  break;
               case 48:
                  ++var1;
                  break;
               case 49:
                  var10.addElement(new Integer(var2[var1++] << 16 & 16711680 | (short)(var2[var1++] << 8 & '\uff00' | var2[var1++] & 255)));
                  break;
               case 50:
                  ++var1;
                  ++var1;
                  var10.addElement(new Integer(var2[var1++] << 16 & 16711680 | (short)(var2[var1++] << 8 & '\uff00' | var2[var1++] & 255)));
                  break;
               case 51:
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 53:
                  var10.addElement(new Integer(var2[var1++] << 16 & 16711680 | (short)(var2[var1++] << 8 & '\uff00' | var2[var1++] & 255)));
                  break;
               case 54:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 55:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 64:
               case 65:
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 68:
               case 69:
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 75:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 80:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
                  break;
               case 81:
                  ++var1;
                  ++var1;
                  ++var1;
                  ++var1;
               }
            }
         }

         int var4 = 1;

         while(true) {
            while(var4 != 0) {
               int var12;
               if (var4 >= var10.size()) {
                  for(int var9 = 0; var9 < 3; ++var9) {
                     try {
                        String var13 = "/" + HG.r + "." + HG.j[1 + var9] + "." + "lng";
                        InputStream var8 = HG.db.getClass().getResourceAsStream(var13);
                        if (var8 == null) {
                           System.err.println("couldn't open lang file");
                        } else {
                           int var7 = var8.available();
                           byte[] var18 = new byte[5];
                           var8.read(var18, 0, 5);
                           hD = var18[2];
                           int var6 = (var18[4] & 255) << 8 | var18[3] & 255;
                           int[] var5 = new int[var6 + 1];

                           for(var12 = 0; var12 < var6 + 1; ++var12) {
                              var8.read(var18, 0, 2);
                              var5[var12] = ((var18[1] & 255) << 8 | var18[0] & 255) + 2;
                           }

                           var4 = 5 + 2 * (var6 + 1);

                           for(var3 = 0; var3 < var10.size(); ++var3) {
                              var1 = (Integer)var10.elementAt(var3);
                              var12 = var1 & '\uffff';
                              var1 = ((var1 & 16711680) >> 16) - 1;
                              if (var1 == var9 && var12 >= 0 && var12 < var6) {
                                 int var16 = var5[var12];
                                 var1 = var5[var12 + 1];
                                 if (var16 >= var4 && var1 >= var16 && var16 >= 0 && var1 <= var7) {
                                    byte[] var14 = new byte[var1 - var16];
                                    var8.skip((long)(var16 - var4));
                                    var8.read(var14, 0, var14.length);
                                    var4 = var1;
                                    gD.put(var10.elementAt(var3), var14);
                                 }
                              }
                           }

                           var8.close();
                           System.gc();
                        }
                     } catch (Exception var11) {
                        var11.printStackTrace();
                     }
                  }

                  System.gc();
                  Thread.yield();
                  System.gc();
                  Thread.yield();
                  System.gc();
                  return;
               }

               Integer var17 = (Integer)var10.elementAt(var4);
               Integer var15 = (Integer)var10.elementAt(var4 - 1);
               var1 = var17 & '\uffff';
               var12 = var15 & '\uffff';
               if (var1 < var12) {
                  var10.setElementAt(var17, var4 - 1);
                  var10.setElementAt(var15, var4);
                  --var4;
               } else {
                  ++var4;
               }
            }

            ++var4;
         }
      }
   }

   public static void AB() {
      gD.clear();
   }

   public static void BB() {
      td = cc[1617] / cc[1622] >> 1;
      ud = cc[1618] / cc[1623];
      vd = f - (2 * td + 8 + 8);
      wd = g - (cc[1607] + cc[1387] + 2 * ud + 5 + 4);
      td += 8;
      ud += 5;
      od = -1;
   }

   public static void AA(int var0) {
      A(Z(var0));
   }

   public static void A(String var0) {
      Font var2 = j[2];
      int var1 = cc[1683] + 16;
      id.addElement(HG.A(var0, var2, vd - var1, 0));
   }

   public static void A(int var0, int var1, int[] var2) {
      A((int)10, (int)-2, (int)0);
      if (od < 0) {
         if (ub == 1 && tb >= 0) {
            int[] var3 = A(B.a[tb]);
            if (var3 != null) {
               od = var3[0];
            }
         }

         if (od < 0) {
            od = 0;
         }
      }

      Font var4 = j[2];
      int var6 = j[2].getHeight();
      jd = HG.A(Z(var1), var4, vd, 0);
      A(9, td, ud, vd, wd, 113);
      A((int)9, (int)0, (int)-2);
      A(9, 15 + cc[1695]);
      md = 0;

      for(int var7 = 0; var7 < id.size(); ++var7) {
         String[] var5 = (String[])id.elementAt(var7);
         md += var6 * var5.length + 10;
      }

      kd = 0;
      hd = true;
      pd = var2;
      ld = 0;
      nd = var0;
      if (pd != null) {
         pd[0] = 2;
      }

      md += 10 + cc[1695];
      qd = false;
      if (pd != null && rd) {
         sd = System.currentTimeMillis() + 500L;
      } else {
         sd = -1L;
      }

   }

   public static void O(Graphics var0) {
      A(9, td, ud, vd, wd);
      A((String[])jd, 9, 2, var0);
      int var1 = ud + j[2].getHeight() * jd.length + 10 + aa[29];
      var0.setClip(td, ud, vd, wd - 1);
      B(f >> 1, var1, 154, 0, var0);
      B(f >> 1, var1, 154, 0, 0, 2, var0);
   }

   public static void P(Graphics var0) {
      A(10, td, ud, vd, wd);
      int var6 = ld;
      int var5 = j[2].getHeight();
      int var4 = cc[1683] + 16;
      int var3 = (var5 - cc[1684] >> 1) + 5;

      for(int var2 = 0; var2 < id.size(); ++var2) {
         A(10, td + var4, ud + var6 + 5, vd - var4, wd - var6 + 5, 305);
         String[] var1 = (String[])id.elementAt(var2);
         var0.setClip(td, ud, vd, wd - 1);
         if (var2 == kd) {
            var0.setColor(i[13]);
            var0.fillRect(td, ud + var6, vd, var5 * var1.length + 10);
            var0.setColor(i[5]);
         }

         B(td + 8, ud + var6 + var3, 153, 0, var0);
         var6 += var5 * var1.length + 10;
         A((String[])var1, 10, 2, var0);
      }

      var0.setClip(td, ud, vd, wd - 1);
      B(f >> 1, ud + var6 + 5, 154, 0, var0);
      B(f >> 1, ud + var6 + 5, 154, 0, 0, 2, var0);
   }

   public static void Q(Graphics var0) {
      var0.setClip(0, 0, f, g);
      boolean var7 = false;
      boolean var6 = false;
      if (qd) {
         A(var0, false, false, false, 126);
      } else {
         A(var0, false, false, false, nd);
      }

      var0.setClip(td, ud, vd, wd - 1);
      var0.setColor(i[5]);
      int var5 = cc[1639] / cc[1644];
      short var4 = cc[1640];
      int var3 = ud + wd + 3;
      if (qd) {
         P(var0);
         if (ld > wd - md) {
            var7 = true;
         }

         if (ld < 0) {
            var6 = true;
         }

         var0.setClip(0, 0, f, g);
         B(td, var3, 160, 1, var0);
         B(cc[1606] >> 1, g, 136, 3, var0);
         A((Graphics)var0, 126, (String)HG.I(174));
      } else {
         O(var0);
         int var2 = jd.length * j[2].getHeight() + z[109];
         short var1 = aa[29];
         if (var1 > wd - var2) {
            var7 = true;
         }

         if (var1 < 0) {
            var6 = true;
         }

         var0.setClip(0, 0, f, g);
         if (!id.isEmpty()) {
            B(td + vd - var4, var3, 160, 0, var0);
         }

         B(cc[1606] >> 1, g, 136, 3, var0);
         A(var0, nd, HG.I(od));
      }

      var0.setClip(0, 0, f, g);
      int var8 = var3 + (var5 - var4 >> 1);
      if (var6) {
         B((f >> 1) - var5, var8, 149, 0, var0);
      }

      if (var7) {
         B(f >> 1, var8, 149, 1, var0);
      }

   }

   public static void A(Graphics var0, int var1, String var2) {
      var1 = j[2].getHeight();
      int var5 = cc[1518] + cc[1386] - 1;
      int var4 = f - var5 - 1;
      int var3 = var1 + 5 + 5;
      var1 = g - var3 - (cc[1387] + cc[1607] - var3 >> 1);
      A(10, var5 + 4, var1 + 4, var4 - 8, var3 - 8, 156);
      A((String)var2, 10, 2, var0);
   }

   public static void CB() {
      if (pd != null) {
         pd[0] = 1;
      }

      hd = false;
      id.removeAllElements();
      pd = null;
      if (fD) {
         od = -1;
      }

      fD = false;
   }

   public static void DB() {
      if (C(80) || C(65)) {
         if (!qd && !id.isEmpty()) {
            qd = true;
         } else if (sd < 0L || System.currentTimeMillis() >= sd) {
            CB();
         }
      }

      int var0;
      String[] var10000;
      int var4;
      short[] var9;
      if (C(55)) {
         if (qd) {
            var4 = j[2].getHeight();
            boolean var3 = md > wd;
            if (!var3) {
               --kd;
            } else {
               int var2 = ud + ld;
               boolean var1 = false;
               var0 = kd - 1;
               if (var0 < 0) {
                  for(var0 = 0; var0 < kd; ++var0) {
                     var2 += ((String[])id.elementAt(var0)).length * var4 + 10;
                  }

                  if (var2 >= ud) {
                     --kd;
                  }

                  var1 = true;
               } else {
                  for(var0 = 0; var0 < kd; ++var0) {
                     var2 += ((String[])id.elementAt(var0)).length * var4 + 10;
                  }

                  var10000 = (String[])id.elementAt(kd);
                  if (var2 > wd / 2) {
                     --kd;
                     var1 = true;
                  }
               }

               ld += var4;
               if (ld > 0) {
                  ld = 0;
                  if (!var1) {
                     --kd;
                  }
               }
            }

            if (kd < 0) {
               kd = id.size() - 1;
               if (var3) {
                  ld = wd - md;
               }
            }
         } else {
            var9 = aa;
            var9[29] = (short)(var9[29] + j[2].getHeight());
         }
      }

      if (C(60)) {
         if (qd) {
            var4 = j[2].getHeight();
            boolean var5 = md > wd;
            if (!var5) {
               ++kd;
            } else {
               int var8 = ud + ld;
               boolean var7 = false;
               int var6 = kd + 1;
               if (var6 >= id.size()) {
                  for(var0 = 0; var0 < kd; ++var0) {
                     var8 += ((String[])id.elementAt(var0)).length * var4 + 10;
                  }

                  var0 = var8 + ((String[])id.elementAt(kd)).length * var4 + 20 + cc[1695];
                  if (var0 <= ud + wd) {
                     ++kd;
                  }

                  var7 = true;
               } else {
                  for(var0 = 0; var0 < var6; ++var0) {
                     var8 += ((String[])id.elementAt(var0)).length * var4;
                  }

                  var10000 = (String[])id.elementAt(var6);
                  if (var8 < ud + wd / 2) {
                     ++kd;
                     var7 = true;
                  }
               }

               ld -= var4;
               if (ld < wd - md) {
                  ld = wd - md;
                  if (!var7) {
                     ++kd;
                  }
               }
            }

            if (kd >= id.size()) {
               kd = 0;
               ld = 0;
            }
         } else {
            var9 = aa;
            var9[29] = (short)(var9[29] - j[2].getHeight());
         }
      }

      if (qd && C(61)) {
         qd = false;
      }

      if (!qd && C(62) && !id.isEmpty()) {
         qd = true;
      }

      D();
   }

   static void BA(int var0) {
      kD = 0;

      for(int var2 = 0; var2 < ea[2].length; ++var2) {
         int var1 = ea[2][var2][4];
         if (var1 >= 0 && ma[var1][6] == 20) {
            kD += ea[2][var2][6];
         }
      }

      if (kD > 0) {
         lD = kD;
         iD = (byte)(B.a[var0][8] >> 24 & 255);
         short var3 = (short)((B.a[var0][9] & -65536) >> 16);
         mD = (short)var3 & '\uffff' | (short)var0 << 16 & -65536;
         jD = 0;
         nD = true;
         oD = " x " + kD;
      } else {
         D(239, 230, 101, 106);
      }

   }

   static void R(Graphics var0) {
      if ((oa[2] & 128) == 0 && (oa[2] & 1) != 0) {
         od = 174;
         fD = true;
         A(126, 463, (int[])null);
         int[] var10000 = oa;
         var10000[2] |= 128;
      } else {
         var0.setClip(0, 0, f, g);
         var0.setColor(i[3]);
         var0.fillRect(0, 0, f, g);
         int var3 = f >> 1;
         int var8 = cc[1838] + 5;
         int var2 = var8 * iD + cc[1772] + cc[1794] + (cc[1805] >> 1);
         int var1 = g - (var2 + cc[1607] + cc[1387]) >> 1;
         var2 += var1;
         var1 = cc[1760] / cc[1765];
         B((f >> 1) + 3 * var1, var2, 160, 0, var0);
         B((f >> 1) - 4 * var1, var2, 160, 1, var0);
         var0.setClip(10, 0, f - 20, f);
         B(var3, var2, 161, 0, var0);
         int var7 = var2 - cc[1772];

         for(int var6 = 0; var6 < iD; ++var6) {
            boolean var5 = false;
            if ((mD & 1 << var6) != 0) {
               var5 = true;
            }

            int var4;
            if (jD > var6) {
               var4 = (f - cc[1782] >> 1) - cc[1837] - 10 >> 1;
            } else {
               var4 = (f - cc[1782] >> 1) - cc[1837] - 10;
            }

            for(var1 = 0; var1 < var8; var1 += cc[1805]) {
               B(f >> 1, var7 - var1, 162, 0, var0);
               if (jD > var6) {
                  B(f >> 1, var7 - var1, 164, 0, var0);
               } else if (jD == var6) {
                  B(f >> 1, var7, 168, 0, var0);
               }
            }

            var3 = cc[1782] >> 1;
            var1 = 0;
            if (jD > var6) {
               while(var1 < var4) {
                  if (var5) {
                     B((f >> 1) + var3, var7, 165, 0, var0);
                  } else {
                     B((f >> 1) - var3, var7, 165, 0, 0, 2, var0);
                  }

                  var3 += cc[1815];
                  var1 += cc[1815];
               }
            }

            var2 = 0;
            var1 = 0;
            if (jD > var6) {
               if (var5) {
                  var1 = var3 - (cc[1782] >> 1);
               } else {
                  var2 = var3 - (cc[1782] >> 1);
               }
            }

            B((f >> 1) + var3 - var2, var7, 167, 0, var0);
            B((f >> 1) - var3 + var1, var7, 167, 0, 0, 2, var0);
            var2 = var3 + cc[1837];

            for(var1 = 0; var1 < var4; var1 += cc[1826]) {
               if (jD > var6) {
                  if (var5) {
                     B((f >> 1) - var1 - (cc[1782] >> 1) - cc[1837], var7, 166, 0, 0, 2, var0);
                  } else {
                     B((f >> 1) + var1 + (cc[1782] >> 1) + cc[1837], var7, 166, 0, var0);
                  }
               }

               B((f >> 1) + var2, var7, 166, 0, var0);
               B((f >> 1) - var2, var7, 166, 0, 0, 2, var0);
               var2 += cc[1826];
            }

            var7 -= var8;
         }

         B(f >> 1, var7 - (cc[1805] >> 1), 163, 0, var0);
         var0.setClip(0, 0, f, g);
         var3 = cc[1508];
         if (var3 < j[2].getHeight()) {
            var3 = j[2].getHeight();
         }

         var2 = g - cc[1607] - (var3 >> 1) - 5;
         var1 = f - j[2].stringWidth(oD) - (cc[1507] / cc[1512] >> 1) - 5;
         B(var1, var2, 137, 6, var0);
         var1 += cc[1507] / cc[1512] >> 1;
         var2 -= var3 >> 1;
         var0.setColor(i[5]);
         var0.setFont(j[2]);
         var0.drawString(oD, var1 + 0, var2 + 0, 20);
         A((Graphics)var0, 1);
         B(f - (cc[1606] >> 1), g, 136, 1, var0);
      }
   }

   static boolean EB() {
      int var0 = 100 - (short)(da[25] & '\uffff');
      return var0 >= 0 && HG.A((int)100) <= var0;
   }

   static void FB() {
      int var2 = lD - kD;

      for(int var1 = 0; var1 < ea[2].length; ++var1) {
         int var0 = ea[2][var1][4];
         if (var0 >= 0 && ma[var0][6] == 20) {
            var0 = (short)var0 & '\uffff' | 131072;
            I(var0, var2);
            break;
         }
      }

   }

   static void GB() {
      if (C(61)) {
         if ((mD & 1 << jD) != 0) {
            jD = 0;
            if (EB()) {
               --kD;
               HG.M(32);
               oD = " x " + kD;
            }
         } else {
            ++jD;
         }
      } else if (C(62)) {
         if ((mD & 1 << jD) == 0) {
            jD = 0;
            if (EB()) {
               --kD;
               HG.M(32);
               oD = " x " + kD;
            }
         } else {
            ++jD;
         }
      } else if (C(85)) {
         nD = false;
         FB();
      }

      if (jD >= iD) {
         short var2 = (short)((mD & -65536) >> 16);
         byte var1 = (byte)(B.a[var2][8] >> 8 & 255);
         byte var0 = (byte)(B.a[var2][8] & 255);
         A(12, 7, (short)((B.a[var2][2] & -65536) >> 16), var0, 0, false);
         if (var0 == 5) {
            int[] var10000 = B.a[var2];
            var10000[3] |= 32768;
            A(B.a[var2], true);
            bc = true;
         }

         int var3 = B.E();
         var3 |= 1 << var1;
         B.B(var3);
         E(B.a[var2], false);
         HG.M(9);
         nD = false;
         FB();
         F((short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
      }

      if (kD <= 0) {
         D(239, 230, 101, 106);
         FB();
         nD = false;
      }

      D();
   }

   static int CA(int var0) {
      int var2 = 0;

      for(int var1 = 0; var1 < var0; ++var1) {
         if (HG.A((int)2) == 1) {
            var2 |= 1 << var1;
         }
      }

      return var2;
   }

   public static void HB() {
   }

   public static void S(Graphics var0) {
      if (!db && !eb) {
         A((Graphics)var0, 0);
      }

      if (!db && !eb) {
         if (gB == -1) {
            L(var0);
         }
      } else {
         G(var0);
      }

      I(var0);
      if (!db && !eb) {
         var0.setClip(0, 0, f, g);
         B(cc[1606] >> 1, g, 136, 2, var0);
         B(f - (cc[1606] >> 1), g, 136, 1, var0);
      }

   }

   public static void A(Graphics var0, int var1) {
      boolean var2 = var1 == 0 || var1 == 1;
      boolean var3 = var1 == 0 || var1 == 2;
      var0.setClip(0, 0, f, g);
      int var4;
      if (var2) {
         var1 = g;
         B(0, var1, 146, 0, var0);
         var4 = var1 - cc[1607];
         B(0, var4, 138, 0, var0);
         var1 = 0 + cc[1518];
         B(var1, var4, 126, 0, var0);
         T(var0);
      }

      B(f, g, 146, 0, 0, 2, var0);
      if (var3) {
         var1 = f;
         int var6 = g - cc[1607];
         B(var1, var6, 138, 0, 0, 2, var0);
         var4 = var1 - cc[1518];
         var1 = Z(BA());
         short var5;
         switch(var1) {
         case 0:
         case 1:
            var5 = 140;
            break;
         case 2:
            if ((short)(da[53] & '\uffff') == 0) {
               var5 = 143;
            } else if ((short)(da[53] & '\uffff') <= 10) {
               var5 = 142;
            } else {
               var5 = 141;
            }
            break;
         case 3:
            if ((short)((da[53] & -65536) >> 16) == 0) {
               var5 = 143;
            } else if ((short)((da[53] & -65536) >> 16) <= 10) {
               var5 = 142;
            } else {
               var5 = 141;
            }
            break;
         default:
            var5 = 139;
         }

         if (da[45] != -1) {
            int[] var7 = A(ea[4][da[45]]);
            if (var7[8] == 0) {
               var5 = 145;
            } else {
               var5 = 144;
            }
         }

         B(var4, var6, var5, 0, var0);
         B((Graphics)var0, 0);
      }

   }

   public static void T(Graphics var0) {
      int var1 = g;
      if (W(146) && W(139)) {
         var1 -= dc[146][4];
         int var3 = var1 - dc[139][4];
         short var2 = (short)(da[12] & '\uffff');
         short var4 = (short)((da[12] & -65536) >> 16);
         if (var4 == 0) {
            var1 = 19;
         } else {
            var1 = 19 * var2 / var4;
         }

         var0.setColor(16711680);
         var0.fillRect(20, var3 + 1 + 19 - var1, 3, var1);
      }
   }

   public static void B(Graphics var0, int var1) {
      if (W(138) && W(126) && W(146) && W(139)) {
         int var2 = f;
         var2 -= dc[138][3];
         int var5 = var2 - dc[126][3];
         var2 = g;
         var2 -= dc[146][4];
         int var4 = var2 - dc[139][4];
         short var3 = (short)(da[13] & '\uffff');
         short var6 = (short)((da[13] & -65536) >> 16);
         if (var6 == 0) {
            var2 = 19;
         } else {
            var2 = 19 * var3 / var6;
         }

         var0.setColor(8421631);
         var0.fillRect(var5 + 1 + var1, var4 + 1 + 19 - var2, 3, var2);
      }
   }

   public static void IB() {
      if (pD == null) {
         pD = new int[10][11];
         qD = new int[10][];
      }

      for(int var0 = 0; var0 < pD.length; ++var0) {
         pD[var0][6] = -1;
         pD[var0][0] = -1;
         pD[var0][4] = -1;
         pD[var0][5] = -1;
         pD[var0][3] = 0;
      }

   }

   public static void DA(int var0) {
      if (!rD) {
         int var1 = KB();
         if (var1 >= 0) {
            int var3 = ea[4][var0][4];
            int[] var2 = wa[var3];
            var0 = var2[4] * (short)((da[13] & -65536) >> 16) / 100;
            if (var0 > (short)(da[13] & '\uffff')) {
               return;
            }

            if ((short)((var2[6] & -65536) >> 16) > 0) {
               qD[var1] = null;
            } else if ((short)(var2[6] & '\uffff') == 0) {
               qD[var1] = da;
            } else if (gB >= 0) {
               qD[var1] = fa[gB];
            } else {
               qD[var1] = null;
               var0 = var2[7] * 4096 / 10;
               switch(da[30]) {
               case 0:
                  pD[var1][9] = da[4];
                  pD[var1][10] = da[5] - var0;
                  break;
               case 1:
                  pD[var1][9] = da[4] + var0;
                  pD[var1][10] = da[5];
                  break;
               case 2:
                  pD[var1][9] = da[4];
                  pD[var1][10] = da[5] + var0;
                  break;
               case 3:
                  pD[var1][9] = da[4] - var0;
                  pD[var1][10] = da[5];
               }
            }

            int[] var10000 = pD[var1];
            var10000[6] &= -256;
            var10000 = pD[var1];
            var10000[6] |= (byte)var3 & 255;
            var10000 = pD[var1];
            var10000[6] &= -65281;
            var10000 = pD[var1];
            var10000[6] |= 256;
            var10000 = pD[var1];
            var10000[6] &= -16711681;
            var10000 = pD[var1];
            var10000[6] |= 0;
            var10000 = pD[var1];
            var10000[6] &= 16777215;
            var10000 = pD[var1];
            var10000[6] |= 33554432;
            if (var2[5] == -1 && !rD) {
               HG.M(var2[9]);
            }

            pD[var1][7] = 0;
            pD[var1][8] = 655360;
            pD[var1][4] = da[4];
            pD[var1][5] = da[5];
            rD = true;
            D();
            F();
         }
      } else {
         rD = false;
         D();
         F();
      }

   }

   public static void JB() {
      for(int var5 = 0; var5 < pD.length; ++var5) {
         if (pD[var5][6] != -1) {
            int[] var4 = wa[(byte)(pD[var5][6] & 255)];
            int var3 = var4[4] * (short)((da[13] & -65536) >> 16) / 100;
            if (var3 < 1) {
               var3 = 1;
            }

            int var0;
            int[] var10000;
            int var1;
            byte var6;
            if ((byte)(pD[var5][6] >> 16 & 255) == 0) {
               if ((short)(var4[6] & '\uffff') != 0 && gB >= 0 && !B.A(da, fa[gB], var4[7] * 4096 / 10)) {
                  A(1, var3 * ((byte)(pD[var5][6] >> 8 & 255) - 1), true, false, da);
                  pD[var5][6] = -1;
                  rD = false;
               } else {
                  byte var8 = (byte)(pD[var5][6] >> 8 & 255);
                  int var9 = var4[5];
                  var6 = (byte)(pD[var5][6] >> 24 & 255);
                  if (var6 >= 0 && rD) {
                     if (gB != -1) {
                        da[30] = N(fa[gB][4] - da[4], fa[gB][5] - da[5]);
                        N(da, 12 + da[30]);
                     }

                     var0 = var6 - 1;
                     var10000 = pD[var5];
                     var10000[6] &= 16777215;
                     var10000 = pD[var5];
                     var10000[6] |= (byte)var0 << 24 & -16777216;
                  } else if ((short)(da[13] & '\uffff') - var3 >= 0 && rD) {
                     if (var9 == -1) {
                        if (!B(var5, var8, qD[var5])) {
                           A(1, -var3, true, false, da);
                           lB = 10;
                           pD[var5][6] = -1;
                           rD = false;
                           continue;
                        }

                        var8 = 0;
                     }

                     A(1, -var3, true, false, da);
                     var1 = var8 + 1;
                     var10000 = pD[var5];
                     var10000[6] &= -65281;
                     var10000 = pD[var5];
                     var10000[6] |= (byte)var1 << 8 & '\uff00';
                     var10000 = pD[var5];
                     var10000[6] &= 16777215;
                     var10000 = pD[var5];
                     var10000[6] |= 33554432;
                  } else {
                     if ((short)((var4[6] & -65536) >> 16) > 0) {
                        short var7;
                        short var10;
                        if ((short)(var4[6] & '\uffff') == 0) {
                           var10 = (short)(da[0] & '\uffff');
                           var7 = (short)((da[0] & -65536) >> 16);
                           pD[var5][0] = (short)var10 & '\uffff' | (short)var7 << 16 & -65536;
                           pD[var5][4] = da[4];
                           pD[var5][5] = da[5];
                           pD[var5][9] = da[4];
                           pD[var5][10] = da[5];
                        } else if (gB >= 0 && qD[var5] == null) {
                           var10 = (short)(fa[gB][0] & '\uffff');
                           var7 = (short)((fa[gB][0] & -65536) >> 16);
                           pD[var5][0] = (short)var10 & '\uffff' | (short)var7 << 16 & -65536;
                           pD[var5][4] = fa[gB][4];
                           pD[var5][5] = fa[gB][5];
                           pD[var5][9] = fa[gB][4];
                           pD[var5][10] = fa[gB][5];
                        } else {
                           pD[var5][4] = da[4];
                           pD[var5][5] = da[5];
                           pD[var5][9] = da[4];
                           pD[var5][10] = da[5];
                        }
                     }

                     if (var9 != -1) {
                        A(1, -var3, true, false, da);
                        N(da, 8 + da[30]);
                        var10000 = pD[var5];
                        var10000[6] &= -16711681;
                        var10000 = pD[var5];
                        var10000[6] |= 131072;
                        HG.M(var4[9]);
                        B.A(pD[var5], (short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
                     } else {
                        pD[var5][6] = -1;
                        N(da, 0 + da[30]);
                     }

                     rD = false;
                     lB = 10;
                  }
               }
            } else if ((byte)(pD[var5][6] >> 16 & 255) == 3) {
               byte var2 = (byte)(pD[var5][6] >> 8 & 255);
               var0 = var4[5];
               if (var4[3] > 0) {
                  var1 = var0 * (var2 >> 1);
               } else {
                  var1 = var0 * var2;
               }

               if (var1 <= 0) {
                  var10000 = pD[var5];
                  var10000[6] &= -16711681;
                  var10000 = pD[var5];
                  var10000[6] |= 262144;
               } else {
                  var6 = (byte)(pD[var5][6] >> 24 & 255);
                  if (var6 < 0) {
                     var10000 = pD[var5];
                     var10000[6] &= 16777215;
                     var10000 = pD[var5];
                     var10000[6] |= 167772160;
                     B(var5, var2, qD[var5]);
                     var10000 = pD[var5];
                     var10000[7] += 10;
                     if (pD[var5][7] >= var1 * var3) {
                        if (var4[8] == 3) {
                           B(var5, var2, qD[var5]);
                        }

                        var10000 = pD[var5];
                        var10000[6] &= -16711681;
                        var10000 = pD[var5];
                        var10000[6] |= 262144;
                     }
                  } else {
                     var0 = var6 - 1;
                     var10000 = pD[var5];
                     var10000[6] &= 16777215;
                     var10000 = pD[var5];
                     var10000[6] |= (byte)var0 << 24 & -16777216;
                  }

                  E(var5, true);
               }
            } else if ((byte)(pD[var5][6] >> 16 & 255) == 2) {
               if (!EA(var5)) {
                  var10000 = pD[var5];
                  var10000[6] &= -16711681;
                  var10000 = pD[var5];
                  var10000[6] |= 196608;
                  var10000 = pD[var5];
                  var10000[6] &= 16777215;
                  var10000 = pD[var5];
                  var10000[6] |= 167772160;
                  var6 = (byte)(pD[var5][6] >> 8 & 255);
                  B(var5, var6, qD[var5]);
               }
            } else if ((byte)(pD[var5][6] >> 16 & 255) == 4 && !E(var5, false)) {
               pD[var5][6] = -1;
               B.A(pD[var5], -1, -1);
            }
         }
      }

   }

   public static boolean E(int var0, boolean var1) {
      short var3 = (short)(pD[var0][8] & '\uffff');
      short var2 = (short)((pD[var0][8] & -65536) >> 16);
      int var4 = var3 + 1;
      if (var4 >= var2) {
         if (!var1) {
            return false;
         }

         var4 = 0;
      }

      int[] var10000 = pD[var0];
      var10000[8] &= -65536;
      var10000 = pD[var0];
      var10000[8] |= (short)var4 & '\uffff';
      return true;
   }

   public static boolean B(int var0, int var1, int[] var2) {
      int[] var7 = wa[(byte)(pD[var0][6] & 255)];
      int var6 = var7[5];
      int var4 = (short)((var7[6] & -65536) >> 16) * 4096;
      short var3 = (short)(var7[6] & '\uffff');
      int var5 = var7[4] * (short)((da[13] & -65536) >> 16) / 100;
      if (var5 < 1) {
         var5 = 1;
      }

      if (var2 != null) {
         G(var0, var2);
      }

      if ((short)((var7[6] & -65536) >> 16) > 0 && var2 == null) {
         if (var3 == 0 || var3 == 2) {
            B(var0, var1, da);
         }

         sD[0] = pD[var0][9] - var4;
         sD[2] = pD[var0][9] + var4;
         sD[1] = pD[var0][10] - var4;
         sD[3] = pD[var0][10] + var4;

         for(int var10 = B.A((int[])sD, 32); var10 != -1; var10 = (short)((B.a[var10][1] & -65536) >> 16)) {
            if ((B.a[var10][13] & 2) == 0 && (B.a[var10][3] & 65536) == 0) {
               B(var0, var1, B.a[var10]);
            }
         }

         return true;
      } else if (var2 == null) {
         return false;
      } else {
         boolean var12 = (var2[3] & 16) != 0 && (var3 == 0 || var3 == 2);
         boolean var11 = (var2[3] & 32) != 0 && (var3 == 2 || var3 == 1 && !N((short)((var2[2] & -65536) >> 16)) || var3 == 4 && (N((short)((var2[2] & -65536) >> 16)) || (var2[13] & 128) != 0) || var3 == 3 && !N((short)((var2[2] & -65536) >> 16)) && (var2[13] & 128) == 0);
         int[] var10000;
         switch(var7[8]) {
         case 0:
            if (var12) {
               if (var6 < 0 && (short)(da[12] & '\uffff') == (short)((da[12] & -65536) >> 16)) {
                  return false;
               }

               A(0, var7[3] * var1 * var5, true, false, var2);
            } else if (var11) {
               if (var6 < 0 && (short)(var2[12] & '\uffff') == (short)((var2[12] & -65536) >> 16)) {
                  return false;
               }

               A(0, var7[3] * var1 * var5, true, false, var2);
               H(gB);
            }
            break;
         case 1:
            var0 = var7[3] * var5;
            if (var6 >= 0) {
               var0 *= var1 >> 1;
            } else {
               var0 *= var1;
            }

            var0 -= F(4, var2);
            if (var0 <= 0) {
               var0 = 1;
            }

            if (var12) {
               if (var6 < 0 && (short)(da[12] & '\uffff') <= 0) {
                  return false;
               }

               A(0, -var0, true, false, var2);
            }

            if (var11) {
               if ((short)(var2[20] & '\uffff') == -1 || (short)(var2[26] & '\uffff') < 3) {
                  short var9 = (short)(da[2] & '\uffff');
                  var2[20] &= -65536;
                  var2[20] |= (short)var9 & '\uffff';
                  var2[22] = F(da);
                  var2[26] = 10;
                  if ((ga[var2[11]][13] & 128) != 0) {
                     D((short)((var2[2] & -65536) >> 16), true);
                  }
               }

               A(var0, var2, da);
               H(gB);
            }
            break;
         case 2:
            if (var11 && pD[var0][7] == 0 && ga[var2[11]][27] != 4) {
               var2[13] |= 128;
               var2[20] = -1;
               var2[22] = F(var2);
               var2[25] = var6 * var1 * var5 * (100 - F(4, var2)) / 100;
            }

            if (var2[25] <= 0) {
               var10000 = pD[var0];
               var10000[6] &= -16711681;
               var10000 = pD[var0];
               var10000[6] |= 262144;
            }
            break;
         case 3:
            if (var11) {
               if (pD[var0][7] >= var6 * var1 * var5 * (100 - F(4, var2)) / 100) {
                  var2[13] &= -9;
                  N(var2, 0 + (short)(var2[27] & '\uffff'));
                  var10000 = pD[var0];
                  var10000[6] &= -16711681;
                  var10000 = pD[var0];
                  var10000[6] |= 262144;
               } else if (pD[var0][7] == 0 && ga[var2[11]][27] != 4) {
                  var2[13] |= 8;
                  N(var2, 16);
                  short var8 = (short)(da[2] & '\uffff');
                  var2[20] &= -65536;
                  var2[20] |= (short)var8 & '\uffff';
                  if ((ga[var2[11]][13] & 128) != 0) {
                     D((short)((var2[2] & -65536) >> 16), true);
                  }
               }
            }
         }

         return true;
      }
   }

   public static int KB() {
      for(int var0 = 0; var0 < pD.length; ++var0) {
         if (pD[var0][6] == -1) {
            return var0;
         }
      }

      return -1;
   }

   public static boolean EA(int var0) {
      int var4 = pD[var0][4];
      int var3 = pD[var0][5];
      int var1;
      int var2;
      if (qD[var0] != null) {
         var2 = qD[var0][4];
         var1 = qD[var0][5];
      } else {
         var2 = pD[var0][9];
         var1 = pD[var0][10];
      }

      yB[0] = var2 - var4;
      yB[1] = var1 - var3;
      if (B(yB) <= 2048) {
         return false;
      } else {
         A((int[])yB, 2048, (int[])zB);
         var2 = var4 + zB[0];
         var1 = var3 + zB[1];
         var3 = B.A(var4, var3, var2, var1, 4128, tD, true);
         pD[var0][4] = tD[0];
         pD[var0][5] = tD[1];
         var2 = tD[0] >> 12;
         if (tD[0] < 0) {
            --var2;
         }

         var1 = tD[1] >> 12;
         if (tD[1] < 0) {
            --var1;
         }

         B.A(pD[var0], var2, var1);
         if (var2 < 0 || var2 >= B.b || var1 < 0 || var1 >= B.c) {
            var3 = -1;
         }

         if (var3 != -2) {
            if (var3 != -1) {
               if ((B.a[var3][3] & 32) != 0) {
                  qD[var0] = B.a[var3];
               } else {
                  qD[var0] = null;
               }
            } else {
               qD[var0] = null;
            }

            return false;
         } else {
            AA(pD[var0]);
            return true;
         }
      }
   }

   public static void C(int[] var0, Graphics var1) {
      int[] var4 = wa[(byte)(var0[6] & 255)];
      short var3 = (short)((var0[2] & -65536) >> 16);
      boolean var2 = false;
      short var7 = -1;
      byte var6 = -1;
      short var5 = -1;
      switch(var4[0]) {
      case 452:
         var5 = 4096;
         var7 = 173;
         var6 = 0;
         var2 = true;
      case 458:
         if (!var2) {
            var7 = 180;
            var6 = 0;
            var5 = 4096;
            var2 = true;
         }
      case 448:
         if (!var2) {
            var7 = 181;
            var6 = 0;
            var5 = 4096;
         }

         if ((byte)(var0[6] >> 16 & 255) == 2) {
            if (qD[var3] != null) {
               B.A(qD[var3], uD);
            } else {
               uD[0] = var0[9];
               uD[1] = var0[10];
            }

            int var11 = uD[0] - var0[4];
            int var9 = uD[1] - var0[5];
            int var10 = (var0[4] * B.d >> 12) - tB;
            int var8 = (var0[5] * B.d >> 12) - uB - (var5 * B.d >> 12);
            if (L(var7, var6)) {
               A(var10, var8, var7, var6, 0, var11, var9, var1);
            }
         }

         return;
      default:
      }
   }

   public static void LB() {
      short[][] var10000 = (short[][])null;
   }

   public static void MB() {
      short[][] var10000 = (short[][])null;
   }

   public static void A(short var0, short var1, short var2) {
   }

   public static void NB() {
   }

   public static void U(Graphics var0) {
   }

   public static void OB() {
      kA = new int[8][13];
      lA = new short[8][60];

      for(int var1 = 0; var1 < kA.length; ++var1) {
         for(int var0 = 0; var0 < kA[var1].length; ++var0) {
            kA[var1][var0] = -1;
         }

         kA[var1][0] = -1;
         kA[var1][3] = 0;
      }

      vD = 0;
   }

   public static void PB() {
      kA = (int[][])null;
      lA = (short[][])null;
   }

   public static void QB() {
      for(int var0 = 0; var0 < kA.length; ++var0) {
         if ((kA[var0][3] & 65536) == 0) {
            int var10002 = kA[var0][10]--;
            if (kA[var0][10] <= 0) {
               int[] var10000 = kA[var0];
               var10000[3] |= 65536;
               B.A(kA[var0], -1, -1);
            } else {
               switch(kA[var0][11]) {
               case 0:
                  BA(kA[var0]);
                  break;
               case 1:
                  GA(kA[var0]);
                  break;
               case 2:
                  DA(kA[var0]);
                  break;
               case 3:
                  EA(kA[var0]);
                  break;
               case 4:
                  FA(kA[var0]);
                  break;
               case 5:
                  HA(kA[var0]);
                  break;
               case 6:
                  IA(kA[var0]);
                  break;
               case 7:
                  JA(kA[var0]);
                  break;
               case 8:
                  KA(kA[var0]);
                  break;
               case 9:
                  LA(kA[var0]);
                  break;
               case 10:
                  MA(kA[var0]);
                  break;
               case 11:
                  NA(kA[var0]);
                  break;
               case 12:
                  OA(kA[var0]);
                  break;
               case 13:
                  PA(kA[var0]);
                  break;
               case 14:
                  CA(kA[var0]);
               }
            }
         }
      }

   }

   public static void D(int[] var0, Graphics var1) {
      switch(var0[11]) {
      case 0:
         E(var0, var1);
         break;
      case 1:
         J(var0, var1);
         break;
      case 2:
         G(var0, var1);
         break;
      case 3:
         H(var0, var1);
         break;
      case 4:
         I(var0, var1);
         break;
      case 5:
         K(var0, var1);
         break;
      case 6:
         L(var0, var1);
         break;
      case 7:
         M(var0, var1);
         break;
      case 8:
         N(var0, var1);
         break;
      case 9:
         O(var0, var1);
         break;
      case 10:
         P(var0, var1);
         break;
      case 11:
         Q(var0, var1);
         break;
      case 12:
         R(var0, var1);
         break;
      case 13:
         S(var0, var1);
         break;
      case 14:
         F(var0, var1);
      }

   }

   static void RB() {
      short var3 = 0;
      short var1 = 0;
      short var2 = 0;
      short var0 = 0;
      wD = HG.I(315);
      if (W(155) && W(152)) {
         var3 = cc[1705];
         var1 = cc[1706];
         var2 = cc[1672];
         var0 = cc[1673];
      }

      var2 = var3 > var2 ? var3 : var2;
      if (var1 <= var0) {
         ;
      }

      int var5 = 4 + var2;
      int var7 = j[2].getHeight();
      int var6;
      if (j[2].stringWidth(wD) >= f - (var5 << 1)) {
         var6 = 4;
         var5 = 4 + var0;
         xD = var7 + (var0 << 1) + 8;
      } else {
         var6 = 4 + var2;
         var5 = 4;
         if (var7 < var0) {
            var7 = var0;
         }

         xD = var7 + 8;
      }

      int var4 = f - (var6 << 1);
      A(11, var6, var5, var4, var7, 156);
      A((int)11, (int)-2, (int)0);
   }

   static void SB() {
      wD = null;
   }

   static void V(Graphics var0) {
      var0.setClip(0, 0, f, g);
      var0.setColor(i[21]);
      var0.drawRect(0, 0, f - 1, xD - 1);
      var0.setColor(i[20]);
      var0.drawRect(1, 1, f - 3, xD - 3);
      var0.setColor(i[19]);
      var0.fillRect(2, 2, f - 4, xD - 4);
      var0.setColor(i[18]);
      A((String)wD, 11, 2, var0);
      var0.setClip(0, 0, f, g);
      if (W(155) && W(152)) {
         B(1, 1, 152, 0, var0);
         B(f - 1, 1, 152, 0, 0, 2, var0);
         B(0, xD - cc[1673], 155, 0, 0, 0, var0);
         B(f - cc[1672] - 1, xD - cc[1673] - 1, 152, 0, 0, 3, var0);
      }

      if (yD >= 0 && !eb && !db) {
         W(zD);
         if (zD >= 0) {
         }

         B(0, g, 146, 0, var0);
         B(cc[1606] >> 1, g, 136, 3, var0);
         int var2 = g - cc[1607];
         if (zD >= 0) {
            B(0, var2, 138, 0, var0);
            int var1 = 0 + cc[1518];
            B(var1, var2, zD, 0, var0);
         }

         A(var0, zD, HG.I(315 + yD));
      }

   }

   public static void G(int var0, int[] var1) {
      int[] var3 = wa[(byte)(pD[var0][6] & 255)];
      B(var0, var1, de);
      short var2 = -1;
      if (var1 != null) {
         var2 = (short)(var1[2] & '\uffff');
      }

      switch(var3[0]) {
      case 448:
         E(de[0], de[1], 4096, var2);
         break;
      case 450:
         K(de[0], de[1], var2);
         break;
      case 452:
         H(var0, ce);
         E(pD[var0][4], pD[var0][5], 4096, ce[0], ce[1], 0);
         break;
      case 454:
         R(de[0], de[1]);
         break;
      case 456:
         L(de[0], de[1], var2);
         break;
      case 458:
         H(var0, ce);
         C(pD[var0][4], pD[var0][5], 4096, ce[0], ce[1], 0);
         break;
      case 460:
         M(de[0], de[1], var2);
         S(pD[var0][4], pD[var0][5]);
      }

   }

   public static void AA(int[] var0) {
      int[] var2 = wa[(byte)(var0[6] & 255)];
      short var1 = (short)((var0[2] & -65536) >> 16);
      switch(var2[0]) {
      case 448:
         H(var1, ce);
         F(var0[4], var0[5], 4096, ce[0], ce[1], 0);
         break;
      case 452:
         H(var1, ee);
         D(var0[4], var0[5], 4096, ee[0], ee[1], 0);
         break;
      case 458:
         H(var1, ee);
         B(var0[4], var0[5], 4096, ee[0], ee[1], 0);
      }

   }

   public static void H(int var0, int[] var1) {
      if (qD[var0] != null) {
         B.A(qD[var0], ge);
      } else {
         ge[0] = pD[var0][9];
         ge[1] = pD[var0][10];
      }

      fe[0] = ge[0] - pD[var0][4];
      fe[1] = ge[1] - pD[var0][5];
      int var2 = B(fe);
      var1[0] = fe[0] * 2048 / (var2 + 1);
      var1[1] = fe[1] * 2048 / (var2 + 1);
   }

   public static void B(int var0, int[] var1, int[] var2) {
      if (var1 != null) {
         B.A(var1, var2);
         var2[1] = B.A(var1) + 1;
      } else {
         var2[0] = pD[var0][9];
         var2[1] = pD[var0][10];
      }

   }

   public static void J(int var0, int var1, int var2) {
   }

   public static void BA(int[] var0) {
   }

   public static void E(int[] var0, Graphics var1) {
   }

   public static void K(int var0, int var1, int var2) {
      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0;
      kA[vD][5] = var1;
      kA[vD][6] = 0;
      kA[vD][7] = 0;
      kA[vD][8] = 0;
      kA[vD][9] = 0;
      kA[vD][10] = 20;
      kA[vD][11] = 14;
      kA[vD][12] = var2;
      B.A(kA[vD], var0 >> 12, var1 >> 12);
      CA(kA[vD]);
      ++vD;
      vD %= 8;
   }

   public static void CA(int[] var0) {
      if (var0[12] != -1) {
         B.A(B.a[var0[12]], he);
         he[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = he[0];
         var0[5] = he[1] + 1;
         int var1 = 8192;
         if ((B.a[var0[12]][3] & 4) != 0) {
            short[] var2 = D(B.a[var0[12]], true);
            var1 = -((var2[1] << 12) / B.d);
         }

         var0[6] = var1;
      }

   }

   public static void F(int[] var0, Graphics var1) {
      int var2 = (var0[4] * B.d >> 12) - tB;
      int var3 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      byte var4;
      switch(o >> 1 & 3) {
      case 0:
         var4 = 0;
         break;
      case 1:
         var4 = 5;
         break;
      case 2:
         var4 = 3;
         break;
      default:
         var4 = 6;
      }

      if (W(184)) {
         B(var2, var3, 184, 0, 0, var4, var1);
      }

   }

   public static void F(int[] var0, boolean var1) {
   }

   public static void DA(int[] var0) {
   }

   public static void G(int[] var0, Graphics var1) {
   }

   public static void B(int var0, int var1, int var2, int var3, int var4, int var5) {
      A(var0, var1, var2, var3, var4, var5, 10);
   }

   public static void A(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public static void EA(int[] var0) {
   }

   public static void H(int[] var0, Graphics var1) {
   }

   public static void C(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0;
      kA[vD][5] = var1;
      kA[vD][6] = var2;
      kA[vD][7] = 0;
      kA[vD][8] = 0;
      kA[vD][9] = 0;
      kA[vD][10] = 15;
      kA[vD][11] = 4;
      kA[vD][12] = HG.A();
      ie[0] = var3;
      ie[1] = var4;
      ie[2] = var5;
      B.A(kA[vD], var0 >> 12, var1 >> 12);
      ++vD;
      vD %= 8;
   }

   public static void FA(int[] var0) {
   }

   public static void I(int[] var0, Graphics var1) {
      int var3 = (var0[4] * B.d >> 12) - tB;
      int var2 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      if (L(182, 0)) {
         int var4 = 15 - var0[10];
         if (var4 < cc[2004]) {
            B(var3, var2, 182, 0, var4, 0, var1);
         }
      }

   }

   public static void Q(int[] var0, int var1) {
   }

   public static void GA(int[] var0) {
   }

   public static void J(int[] var0, Graphics var1) {
   }

   public static void D(int var0, int var1, int var2, int var3, int var4, int var5) {
      B(var0, var1, var2, var3, var4, var5, 10);
   }

   public static void B(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
   }

   public static void HA(int[] var0) {
   }

   public static void K(int[] var0, Graphics var1) {
   }

   public static void E(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0;
      kA[vD][5] = var1;
      kA[vD][6] = var2;
      kA[vD][7] = 0;
      kA[vD][8] = 0;
      kA[vD][9] = 0;
      kA[vD][10] = 24;
      kA[vD][11] = 6;
      kA[vD][12] = 0;
      je[0] = var3;
      je[1] = var4;
      je[2] = var5;
      B.A(kA[vD], var0 >> 12, var1 >> 12);
      ++vD;
      vD %= 8;
   }

   public static void IA(int[] var0) {
   }

   public static void L(int[] var0, Graphics var1) {
      int var3 = (var0[4] * B.d >> 12) - tB;
      int var2 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      if (L(174, 0)) {
         int var4 = 24 - var0[10];
         if (var4 < cc[1916]) {
            B(var3, var2, 174, 0, var4, 0, var1);
         }
      }

   }

   public static void F(int var0, int var1, int var2, int var3, int var4, int var5) {
   }

   public static void JA(int[] var0) {
   }

   public static void M(int[] var0, Graphics var1) {
   }

   public static void E(int var0, int var1, int var2, int var3) {
      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0;
      kA[vD][5] = var1;
      kA[vD][6] = var2;
      kA[vD][7] = 0;
      kA[vD][8] = 0;
      kA[vD][9] = 0;
      kA[vD][10] = 16;
      kA[vD][11] = 8;
      kA[vD][12] = var3;
      B.A(kA[vD], var0 >> 12, var1 >> 12);
      ++vD;
      vD %= 8;
   }

   public static void KA(int[] var0) {
      if (var0[12] != -1) {
         B.A(B.a[var0[12]], ke);
         ke[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = ke[0];
         var0[5] = ke[1] + 1;
      }

   }

   public static void N(int[] var0, Graphics var1) {
      int var3 = (var0[4] * B.d >> 12) - tB;
      int var2 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      if (L(183, 0)) {
         int var4 = 16 - var0[10];
         if (var4 < cc[2015]) {
            B(var3, var2, 183, 0, var4, 0, var1);
         }
      }

   }

   public static void L(int var0, int var1, int var2) {
      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0;
      kA[vD][5] = var1;
      kA[vD][6] = 0;
      kA[vD][7] = 0;
      kA[vD][8] = 0;
      kA[vD][9] = 0;
      kA[vD][10] = 24;
      kA[vD][11] = 9;
      kA[vD][12] = var2;

      for(var2 = 0; var2 < 60; var2 += 6) {
         lA[vD][var2 + 0] = (short)(HG.A((int)4096) - 2048);
         lA[vD][var2 + 1] = (short)(HG.A((int)4096) - 2048);
         lA[vD][var2 + 2] = (short)(HG.A((int)8192) + 0);
         lA[vD][var2 + 3] = 0;
         lA[vD][var2 + 4] = 0;
         lA[vD][var2 + 5] = 0;
      }

      B.A(kA[vD], var0 >> 12, var1 >> 12);
      ++vD;
      vD %= 8;
   }

   public static void LA(int[] var0) {
      short var2 = (short)((var0[2] & -65536) >> 16);

      for(int var1 = 0; var1 < 60; var1 += 6) {
         short[] var10000 = lA[var2];
         var10000[var1 + 2] = (short)(var10000[var1 + 2] + 256);
         if (lA[var2][var1 + 2] > 8192) {
            lA[var2][var1 + 2] = (short)(0 + HG.A((int)256));
         }
      }

      if (var0[12] != -1) {
         B.A(B.a[var0[12]], le);
         le[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = le[0];
         var0[5] = le[1] + 1;
      }

   }

   public static void O(int[] var0, Graphics var1) {
      int var7 = (var0[4] * B.d >> 12) - tB;
      int var6 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var5 = (short)((var0[2] & -65536) >> 16);

      for(int var4 = 0; var4 < 60; var4 += 6) {
         int var3 = (8192 - lA[var5][var4 + 2] - 0) * var0[10];
         int var2 = (210 * var3 + 113 * (196608 - var3)) / 196608 << 16 | (255 * var3 + 141 * (196608 - var3)) / 196608 << 8 | (253 * var3 + 140 * (196608 - var3)) / 196608;
         var1.setColor(var2);
         var3 = var7 + (lA[var5][var4 + 0] * B.d >> 12);
         var2 = var6 + (lA[var5][var4 + 1] * B.d >> 12) - (lA[var5][var4 + 2] * B.d >> 12);
         var1.fillRect(var3, var2, 1, 8);
      }

   }

   public static void R(int var0, int var1) {
      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0 + HG.A((int)8192) - 4096;
      kA[vD][5] = var1 + HG.A((int)8192) - 4096;
      kA[vD][6] = 16384;
      kA[vD][7] = 0;
      kA[vD][8] = 0;
      kA[vD][9] = 0;
      kA[vD][10] = 40;
      kA[vD][11] = 10;
      kA[vD][12] = 0;
      B.A(kA[vD], var0 >> 12, var1 >> 12);
      ++vD;
      vD %= 8;
   }

   public static void MA(int[] var0) {
      if (var0[6] >= 0) {
         int var3 = var0[4] + (var0[6] >> 1);
         int var2 = var0[5];
         int var1 = var0[6];
         var0[6] += -2048;
         D(var3, var2, var1, var0[4] + (var0[6] >> 1) - var3, var0[5] - var2, var0[6] - var1);
         if (var0[6] < 0) {
            E(var3, var2, var1, var0[4] - var3, var0[5] - var2, var0[6] - var1);
         }

      }
   }

   public static void P(int[] var0, Graphics var1) {
      int var3 = (var0[4] * B.d >> 12) + (var0[6] * B.d >> 12 >> 1) - tB;
      int var2 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      if (var0[6] >= 0) {
         int var4 = var3;
         int var5 = var2;
         var3 += -2048 * B.d >> 12 >> 1;
         var2 -= -2048 * B.d >> 12;
         if (W(173)) {
            A(var4, var5, 173, 0, 0, var3 - var4, var2 - var5, var1);
         }

      }
   }

   public static void M(int var0, int var1, int var2) {
      int var3 = 8192;
      if (var2 != -1 && (B.a[var2][3] & 4) != 0) {
         short[] var4 = D(B.a[var2], true);
         var3 = -((var4[1] << 12) / B.d);
      }

      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0;
      kA[vD][5] = var1;
      kA[vD][6] = var3;
      kA[vD][7] = 0;
      kA[vD][8] = 512;
      kA[vD][9] = 0;
      kA[vD][10] = 20;
      kA[vD][11] = 11;
      kA[vD][12] = var2;
      B.A(kA[vD], var0 >> 12, var1 >> 12);
      ++vD;
      vD %= 8;
   }

   public static void NA(int[] var0) {
      var0[6] += 512;
      var0[7] += var0[8];
      if (var0[7] < 0) {
         var0[8] += 128;
      } else {
         var0[8] -= 128;
      }

   }

   public static void Q(int[] var0, Graphics var1) {
      int var2 = (var0[4] * B.d >> 12) + (var0[7] * B.d >> 12) - tB;
      int var3 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      if (W(178)) {
         B(var2, var3, 178, 0, var1);
      }

   }

   public static void S(int var0, int var1) {
   }

   public static void OA(int[] var0) {
   }

   public static void R(int[] var0, Graphics var1) {
   }

   public static void N(int var0, int var1, int var2) {
      int[] var10000 = kA[vD];
      var10000[3] &= -65537;
      kA[vD][4] = var0;
      kA[vD][5] = var1;
      kA[vD][6] = 0;
      kA[vD][7] = 0;
      kA[vD][8] = 0;
      kA[vD][9] = 0;
      kA[vD][10] = 20;
      kA[vD][11] = 13;
      kA[vD][12] = var2;

      for(var2 = 0; var2 < 60; var2 += 6) {
         lA[vD][var2 + 0] = (short)(HG.A((int)4096) - 2048);
         lA[vD][var2 + 1] = (short)(HG.A((int)4096) - 2048);
         lA[vD][var2 + 2] = (short)(HG.A((int)12288) + 0);
         lA[vD][var2 + 3] = 0;
         lA[vD][var2 + 4] = 0;
         lA[vD][var2 + 5] = 0;
      }

      B.A(kA[vD], var0 >> 12, var1 >> 12);
      ++vD;
      vD %= 8;
   }

   public static void PA(int[] var0) {
      short var2 = (short)((var0[2] & -65536) >> 16);

      for(int var1 = 0; var1 < 60; var1 += 6) {
         short[] var10000 = lA[var2];
         var10000[var1 + 2] = (short)(var10000[var1 + 2] + 1024);
         if (lA[var2][var1 + 2] > 12288) {
            lA[var2][var1 + 2] = (short)(0 + HG.A((int)256));
         }
      }

      if (var0[12] != -1) {
         B.A(B.a[var0[12]], me);
         me[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = me[0];
         var0[5] = me[1] + 1;
      }

   }

   public static void S(int[] var0, Graphics var1) {
      int var7 = (var0[4] * B.d >> 12) - tB;
      int var6 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var5 = (short)((var0[2] & -65536) >> 16);

      for(int var4 = 0; var4 < 60; var4 += 6) {
         int var3 = (12288 - lA[var5][var4 + 2] - 0) * var0[10];
         int var2 = (255 * var3 + 128 * (245760 - var3)) / 245760 << 16 | (255 * var3 + 128 * (245760 - var3)) / 245760 << 8 | (0 * var3 + 0 * (245760 - var3)) / 245760;
         var1.setColor(var2);
         var3 = var7 + (lA[var5][var4 + 0] * B.d >> 12);
         var2 = var6 + (lA[var5][var4 + 1] * B.d >> 12) - (lA[var5][var4 + 2] * B.d >> 12);
         var1.fillRect(var3, var2, 1, 8);
      }

   }

   public static void TB() {
      if (HA(3)) {
         try {
            HG.F(3);
            ne = HG.i.readLong();
            HG.f = null;
            HG.g = null;
            HG.h = null;
            HG.i = null;
         } catch (Exception var1) {
            HG.f = null;
            HG.g = null;
            HG.h = null;
            HG.i = null;
         }
      }

      if (HA(2)) {
         try {
            HG.F(2);
            oe = HG.i.readLong();
            HG.f = null;
            HG.g = null;
            HG.h = null;
            HG.i = null;
         } catch (Exception var0) {
            HG.f = null;
            HG.g = null;
            HG.h = null;
            HG.i = null;
         }
      }

   }

   public static boolean FA(int var0) {
      try {
         HG.H();
         if (var0 == 3) {
            ne = System.currentTimeMillis();
            HG.g.writeLong(ne);
         } else {
            oe = System.currentTimeMillis();
            HG.g.writeLong(oe);
         }

         if (da[11] == -1) {
            da[11] = 0;
            da[0] = (short)bC[0][3] & '\uffff' | (short)bC[0][4] << 16 & -65536;
         }

         HG.A(da);
         HG.A(oa);
         HG.A(aA);
         HG.A(bA);
         HG.A(cA);
         HG.A(dA);
         HG.A(eA);
         HG.A(fA);
         HG.A(gA);
         HG.A(hA);

         int var1;
         for(int var2 = 0; var2 < 6; ++var2) {
            for(var1 = 0; var1 < 15; ++var1) {
               HG.A(ea[var2][var1]);
            }
         }

         var1 = 0;

         while(true) {
            if (var1 >= 19) {
               HG.E(var0);
               break;
            }

            HG.A(za[var1]);
            ++var1;
         }
      } catch (Exception var3) {
         HG.f = null;
         HG.g = null;
         HG.h = null;
         HG.i = null;
         return false;
      }

      HG.f = null;
      HG.g = null;
      HG.h = null;
      HG.i = null;
      return true;
   }

   public static boolean GA(int var0) {
      if (HA(var0)) {
         try {
            HG.F(var0);
            HG.i.readLong();
            da = HG.G();
            oa = HG.G();
            aA = HG.G();
            bA = HG.G();
            cA = HG.G();
            dA = HG.G();
            eA = HG.G();
            fA = HG.G();
            gA = HG.G();
            hA = HG.G();
            ea = new int[6][15][];

            for(int var1 = 0; var1 < 6; ++var1) {
               for(var0 = 0; var0 < 15; ++var0) {
                  ea[var1][var0] = HG.G();
               }
            }

            za = new int[19][];

            for(var0 = 0; var0 < 19; ++var0) {
               za[var0] = HG.G();
            }

            HG.f = null;
            HG.g = null;
            HG.h = null;
            HG.i = null;
            return true;
         } catch (Exception var2) {
            HG.f = null;
            HG.g = null;
            HG.h = null;
            HG.i = null;
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean HA(int var0) {
      return HG.B(var0);
   }

   public A(HG var1) {
      super(false);
      a = var1;
      this.setFullScreenMode(true);
      f = this.getWidth();
      g = this.getHeight();
   }

   public void paint(Graphics var1) {
   }

   public void W(Graphics var1) {
      C(var1);
      if (HG.gA) {
         HG.C(var1);
         if (!c) {
            if (hd) {
               Q(var1);
            }

            if (nC) {
               N(var1);
            }
         }
      }

   }

   static void UB() {
      if (C(90) && (!oC || oC && c)) {
         c = !c;
         if (c) {
            WB();
         } else {
            VB();
         }
      }

      int var0;
      if (c) {
         for(var0 = 0; var0 < 20; ++var0) {
            if (x[var0] == 20) {
               h = (h << 4) + (long)var0;
               if (I()) {
                  h = 0L;
               }
            }
         }
      } else if (nC) {
         XA();
      } else if (hd) {
         DB();
      } else if (nD && !q) {
         GB();
      } else if (eb && !q) {
         T();
      } else if (db && !q) {
         U();
      } else {
         short var6;
         if (HG.gA) {
            if (HG.hA >= 0 && HG.iA >= 0) {
               var6 = HG.fA[HG.hA][(HG.iA << 2) + 2];
               if (var6 != 107 && var6 != 106) {
                  if (C(60)) {
                     HG.R();
                  }

                  if (C(55)) {
                     HG.S();
                  }
               } else {
                  if (C(61)) {
                     HG.S();
                  }

                  if (C(62)) {
                     HG.R();
                  }
               }
            }

            if (HG.hA != 19) {
               if (HG.hA == 21) {
                  if (HG.MA(6)) {
                     if (C(112) && HG.iA >= 0) {
                        var0 = HG.fA[HG.hA][HG.iA * 4 + 3] & 32767;
                        HG.pa = B.a[var0];
                        HG.aA = HG.iA - 1;
                        HG.DA(27);
                     }

                     if (C(113) && HG.iA >= 0) {
                        var0 = HG.fA[HG.hA][HG.iA * 4 + 3] & 32767;
                        HG.pa = B.a[var0];
                        HG.aA = HG.iA - 1;
                        HG.DA(19);
                     }
                  }

                  if (HG.ka) {
                     if (C(61)) {
                        B.M();
                        HG.iA = -1;
                        HG.B(HG.hA);
                     }

                     if (C(62)) {
                        B.L();
                        HG.iA = -1;
                        HG.B(HG.hA);
                     }
                  }
               } else if (HG.hA == 24) {
                  if (HG.MA(6) && C(112)) {
                     HG.DA(6);
                     if (HG.hA == 20) {
                        HG.DA(6);
                     }
                  }
               } else if (HG.hA == 23) {
                  if (C(61)) {
                     --HG.la;
                     if (HG.la < 0) {
                        HG.la = 3;
                     }

                     HG.B(HG.hA);
                  }

                  if (C(62)) {
                     ++HG.la;
                     if (HG.la >= 4) {
                        HG.la = 0;
                     }

                     HG.B(HG.hA);
                  }
               } else if (HG.hA == 25) {
                  if (C(61)) {
                     --HG.bA;
                     if (HG.bA < 1) {
                        HG.bA = 2;
                     }

                     HG.B(HG.hA);
                  }

                  if (C(62)) {
                     ++HG.bA;
                     if (HG.bA >= 3) {
                        HG.bA = 1;
                     }

                     HG.B(HG.hA);
                  }
               }
            } else {
               if (C(61)) {
                  --HG.xa;
                  if (HG.xa < 0) {
                     HG.xa = 5;
                  }

                  HG.iA = -1;
                  HG.B(HG.hA);
               }

               if (C(62)) {
                  ++HG.xa;
                  if (HG.xa >= 6) {
                     HG.xa = 0;
                  }

                  HG.iA = -1;
                  HG.B(HG.hA);
               }

               if (HG.MA(6)) {
                  if (C(110) && HG.iA >= 0) {
                     HG.ya = HG.fA[HG.hA][HG.iA * 4 + 3] & 32767;
                     HG.pa = ea[HG.xa][HG.ya];
                     boolean var7 = true;
                     if (HG.xa == 2 && ma[HG.pa[4]][3] == 0) {
                        var7 = false;
                     }

                     if (var7) {
                        HG.DA(14);
                     }
                  }

                  if (C(111)) {
                     byte var9;
                     if (HG.xa != 5 && HG.xa != 4 && da[11] != 0) {
                        if ((HG.dA & 1) != 0) {
                           var9 = 22;
                        } else {
                           var9 = 13;
                        }
                     } else {
                        var9 = -1;
                     }

                     if (HG.iA >= 0 && var9 >= 0) {
                        HG.ya = HG.fA[HG.hA][HG.iA * 4 + 3] & 32767;
                        HG.pa = ea[HG.xa][HG.ya];
                        HG.DA(var9);
                     }
                  }

                  if (C(112) && HG.iA >= 0) {
                     HG.ya = HG.fA[HG.hA][HG.iA * 4 + 3] & 32767;
                     HG.pa = ea[HG.xa][HG.ya];
                     HG.ja = B.F(HG.pa);
                     HG.DA(27);
                  }

                  if (C(114) && HG.iA >= 0) {
                     HG.ya = HG.fA[HG.hA][HG.iA * 4 + 3] & 32767;
                     HG.pa = ea[HG.xa][HG.ya];
                     if (HG.xa != 1 && HG.xa != 5 && (HG.dA & 1) == 0 && (HG.xa != 2 || ma[HG.pa[4]][3] != 0)) {
                        HG.DA(15);
                     }
                  }
               }
            }

            if (C(80)) {
               if (HG.pA >= 0) {
                  HG.DA(HG.pA);
               } else {
                  HG.T();
               }
            }

            if (C(65)) {
               HG.T();
            }

            if (C(85)) {
               if (HG.qA >= 0) {
                  HG.DA(HG.qA);
               } else {
                  HG.U();
               }
            }

            if (C(109) && ((HG.dA & 2) != 0 || (HG.dA & 1) != 0)) {
               if (HG.hA == 21) {
                  HG.LA(19);
               } else if ((HG.dA & 1) != 0) {
                  HG.LA(21);
               }
            }
         } else if (C(50)) {
            HG.jA.removeAllElements();
            HG.LA(14);
            HG.gA = true;
         } else if (!q) {
            switch(t) {
            case 6:
               if (C(45)) {
                  if (yD >= 0) {
                     A(10, 0, 0, 0, 0, true);
                     r.A(HG.cb, yD, ae, be, false);
                     (new Thread(r)).start();
                  } else if ((short)(da[12] & '\uffff') > 0) {
                     HG.jA.removeAllElements();
                     HG.LA(18);
                     HG.gA = true;
                  }
               } else {
                  label472: {
                     if (C(65)) {
                        if (yD >= 0) {
                           A(10, 0, 0, 0, 0, true);
                           r.A(HG.cb, yD, ae, be, false);
                           (new Thread(r)).start();
                           break label472;
                        }

                        if (ub >= 0 && gB == -1) {
                           int var1;
                           int[] var10000;
                           switch(ub) {
                           case 0:
                              I(tb);
                              ub = -1;
                              tb = -1;
                              F((short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
                              break;
                           case 1:
                              short var13 = (short)((B.a[tb][2] & -65536) >> 16);
                              short var11 = (short)(da[0] & '\uffff');
                              short var10 = (short)((da[0] & -65536) >> 16);
                              short var8 = (short)(fa[var13][0] & '\uffff');
                              var6 = (short)((fa[var13][0] & -65536) >> 16);
                              if (var10 > var6) {
                                 var10000 = fa[var13];
                                 var10000[27] &= -65536;
                                 var10000 = fa[var13];
                                 var10000[27] |= 2;
                              } else if (var10 < var6) {
                                 var10000 = fa[var13];
                                 var10000[27] &= -65536;
                                 var10000 = fa[var13];
                                 var10000[27] |= 0;
                              } else if (var11 < var8) {
                                 var10000 = fa[var13];
                                 var10000[27] &= -65536;
                                 var10000 = fa[var13];
                                 var10000[27] |= 3;
                              } else {
                                 var10000 = fa[var13];
                                 var10000[27] &= -65536;
                                 var10000 = fa[var13];
                                 var10000[27] |= 1;
                              }

                              if (!A(9, var13, 0, 0, 0, false)) {
                                 int var12 = A(B.a[tb])[13];
                                 var1 = 0;
                                 byte var14 = 114;
                                 od = -1;
                                 if ((var12 & 8) != 0) {
                                    var1 = HG.A((int)114, (int)116);
                                    var14 = 125;
                                 } else if ((var12 & 4) != 0) {
                                    var1 = HG.A((int)111, (int)113);
                                    var14 = 114;
                                 } else if ((var12 & 2) != 0) {
                                    var1 = HG.A((int)108, (int)110);
                                    var14 = 116;
                                 } else if ((var12 & 1) != 0) {
                                    var1 = HG.A((int)104, (int)107);
                                    var14 = 116;
                                 }

                                 if (A(fa[var13])[0] == 149) {
                                    var14 = 123;
                                 }

                                 fD = true;
                                 A(var14, var1, (int[])null);
                              }
                           case 2:
                           default:
                              break;
                           case 3:
                           case 4:
                           case 5:
                           case 6:
                              int var5 = B.E();
                              byte var4 = (byte)(B.a[tb][8] >> 8 & 255);
                              if ((var5 & 1 << var4) == 0) {
                                 byte var3 = (byte)(B.a[tb][8] >> 16 & 255);
                                 byte var2 = (byte)(B.a[tb][8] >> 24 & 255);
                                 if ((var5 & 1 << var4 + 1) != 0) {
                                    if (var3 > 0) {
                                       for(var1 = 0; var1 < ea[5].length; ++var1) {
                                          var0 = ea[5][var1][4];
                                          if (var0 >= 0 && pa[var0][4] == var3) {
                                             var5 |= 1 << var4;
                                             A(12, 7, (short)((B.a[tb][2] & -65536) >> 16), (byte)(B.a[tb][8] & 255), 0, false);
                                             E(B.a[tb], false);
                                             if ((byte)(B.a[tb][8] & 255) == 5) {
                                                var10000 = B.a[tb];
                                                var10000[3] |= 32768;
                                                A(B.a[tb], true);
                                                bc = true;
                                             }

                                             HG.M(9);
                                             var2 = 0;
                                             B.B(var5);
                                             break;
                                          }
                                       }

                                       if ((var5 & 1 << var4) == 0) {
                                          HG.M(31);
                                          A(12, 7, (short)((B.a[tb][2] & -65536) >> 16), 1, 0, false);
                                       }
                                    }

                                    if (var2 > 0) {
                                       BA(tb);
                                       if (lD == 0) {
                                          HG.M(31);
                                       }
                                    }
                                 } else if (var3 <= 0 && var2 <= 0) {
                                    var5 |= 1 << var4;
                                    A(12, 7, (short)((B.a[tb][2] & -65536) >> 16), (byte)(B.a[tb][8] & 255), 0, false);
                                    E(B.a[tb], false);
                                    if ((byte)(B.a[tb][8] & 255) == 5) {
                                       var10000 = B.a[tb];
                                       var10000[3] |= 32768;
                                       A(B.a[tb], true);
                                       bc = true;
                                    }

                                    HG.M(9);
                                 } else {
                                    var5 |= 1 << var4 + 1;
                                    A(12, 7, (short)((B.a[tb][2] & -65536) >> 16), 1, 0, false);
                                    HG.M(31);
                                 }
                              }

                              B.B(var5);
                              F((short)(da[0] & '\uffff'), (short)((da[0] & -65536) >> 16));
                              break;
                           case 7:
                              if (!A(12, 7, (short)((B.a[tb][2] & -65536) >> 16), 8, 0, false)) {
                                 if ((B.a[tb][3] & 32) != 0 && (B.a[tb][13] & 2) == 0) {
                                    HG.za = B.K();
                                 } else {
                                    HG.za = 0;
                                 }

                                 HG.jA.removeAllElements();
                                 HG.LA(21);
                                 HG.gA = true;
                              }
                           }

                           D();
                           F();
                        }
                     }

                     if (C(35)) {
                        eB = true;
                     }

                     if (C(15)) {
                        cB = true;
                     }

                     if (C(20)) {
                        dB = true;
                     }

                     if (C(25)) {
                        aB = true;
                     }

                     if (C(30)) {
                        bB = true;
                     }

                     if (C(33)) {
                        aB = true;
                        cB = true;
                     }

                     if (C(34)) {
                        aB = true;
                        dB = true;
                     }

                     if (C(31)) {
                        bB = true;
                        cB = true;
                     }

                     if (C(32)) {
                        bB = true;
                        dB = true;
                     }

                     if (C(100)) {
                        fB = true;
                     }

                     if (C(95) && (short)(da[12] & '\uffff') > 0) {
                        db = true;
                        Q();
                     }
                  }
               }
            }
         }
      }

      E();
   }

   public void hideNotify() {
      WB();
   }

   public void showNotify() {
   }

   public static void VB() {
      c = false;
      HG.N();
      h = 0L;
   }

   public static void WB() {
      if (t > 3) {
         c = true;
      }

      if (HG.MA(1)) {
         HG.M();
      } else {
         HG.L();
      }

   }

   public void run() {
      for(; b; d = System.currentTimeMillis()) {
         UB();
         if (!c) {
            this.C();
         }

         this.W(this.s);
         this.flushGraphics();
         long var1 = System.currentTimeMillis() - d;
         ++o;
         if (o == 100000) {
            o = 0;
         }

         if (var1 < 80L) {
            try {
               Thread.sleep(80L - var1);
            } catch (Exception var3) {
            }
         }
      }

      for(int var7 = 0; var7 < v; ++var7) {
         byte[] var4 = u[var7];
         byte var5 = var4[0];
         int var6 = B(var5);
         if (w[var6] == 5) {
            w[var6] = 10;
         }
      }

   }

   public void sizeChanged(int var1, int var2) {
      f = var1;
      g = var2;
   }

   public void IA(int var1) {
      Runtime.getRuntime();
      HG.I();
      HG.l[4] = true;
      String var2 = System.getProperty("microedition.locale");
      if (var2 != null) {
         var2 = var2.toUpperCase();
      }

      HG.B(var2);
      YA();
      sA = HG.I(396);
      tA = HG.I(407);
      tA = tA + "\n" + HG.I(408);
      tA = tA + " " + HG.I(298);
      HG.B();
      TB();
      switch(var1) {
      case 1:
         MA();
         RA();
         HG.K();
      default:
      }
   }

   static {
      v = u.length;
      w = new byte[v];
      x = new byte[20];
      y = new byte[20];
      z = new short[165];
      aa = new short[45];
      ba = new short[15];
      ca = new String[1];
      da = null;
      ea = (int[][][])null;
      fa = (int[][])null;
      ga = (int[][])null;
      ha = (int[][])null;
      ia = (int[][])null;
      ja = (int[][])null;
      ka = (int[][])null;
      la = (int[][])null;
      ma = (int[][])null;
      na = (int[][])null;
      oa = null;
      pa = (int[][])null;
      qa = (int[][])null;
      ra = (int[][])null;
      sa = (int[][])null;
      ta = (int[][])null;
      ua = (int[][])null;
      va = (int[][])null;
      wa = (int[][])null;
      xa = null;
      ya = (int[][])null;
      za = (int[][])null;
      aA = null;
      bA = null;
      cA = null;
      dA = null;
      eA = null;
      fA = null;
      gA = null;
      hA = null;
      iA = null;
      jA = (int[][])null;
      short[][] var10000 = (short[][])null;
      kA = (int[][])null;
      lA = (short[][])null;
      mA = 0;
      nA = 0;
      oA = 0;
      pA = 3;
      qA = false;
      rA = null;
      sA = null;
      tA = null;
      ab = false;
      bb = new int[3];
      cb = new int[2];
      db = false;
      eb = false;
      fb = false;
      gb = 4;
      hb = 4;
      pb = 0;
      qb = 0;
      rb = 0;
      sb = 0;
      tb = -1;
      ub = -1;
      vb = -1;
      wb = 0;
      xb = "";
      yb = 126;
      zb = new int[7];
      aB = false;
      bB = false;
      cB = false;
      dB = false;
      eB = false;
      fB = false;
      gB = 0;
      hB = false;
      iB = 0;
      jB = false;
      kB = false;
      lB = -1;
      mB = -1;
      nB = new int[]{2, 3, 4};
      oB = new int[]{5};
      pB = new int[]{6, 7};
      qB = new int[]{0, 1, 31, 32, 33};
      rB = new int[]{34, 35};
      sB = new int[]{9, 10, 13, 14, 17, 18, 22, 23, 24, 25, 26, 28, 29, 30};
      xB = new int[]{0, 0};
      yB = new int[]{0, 0};
      zB = new int[]{0, 0};
      ac = new int[2];
      bc = false;
      gc = new int[0][][];
      kc = null;
      nc = new short[]{100, 1, 101, 0, 102, 0, 103, 0, 104, 0, 105, 0, 106, 0, 107, 0};
      oc = new byte[]{4, 5, 6, 7, -1, -1, -1, -1, 4, 5, 6, 7, 4, 5, 6, 7, 4};
      pc = new byte[][]{{0, 1, 1, 3, 3, 2, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 2, 2, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 1, 1, 0, 0}};
      aC = new short[4];
      bC = (byte[][])null;
      cC = (int[][])null;
      dC = new int[4][20];
      eC = 0;
      fC = 0;
      gC = 0;
      hC = 0;
      iC = 0;
      jC = new int[7];
      kC = new int[]{9133598, 0, 11908783, 4474695, 2048, 4096, 256, 9133598, 0, 4474695, 11908783, 1024, 4096, 128};
      lC = new int[2];
      mC = new int[2];
      nC = false;
      oC = false;
      pC = null;
      qC = "";
      rC = "";
      sC = -1;
      tC = -1;
      uC = -1;
      vC = -1;
      wC = -1;
      xC = 0;
      yC = 0;
      zC = 0;
      ad = 0;
      bd = 0;
      cd = -1;
      dd = 0;
      ed = -1;
      fd = null;
      gd = -1;
      hd = false;
      id = new Vector();
      jd = null;
      kd = 0;
      ld = 0;
      md = 0;
      nd = 0;
      od = -1;
      pd = null;
      qd = false;
      rd = true;
      sd = -1L;
      td = 0;
      ud = 0;
      vd = 0;
      wd = 0;
      xd = -1;
      yd = 0;
      zd = -1;
      aD = -1;
      bD = 0;
      cD = 0;
      dD = 1;
      eD = false;
      fD = false;
      gD = new Hashtable();
      hD = 0;
      iD = 0;
      jD = 0;
      kD = 0;
      lD = 0;
      mD = 0;
      nD = false;
      oD = "";
      pD = (int[][])null;
      qD = (int[][])null;
      rD = false;
      sD = new int[4];
      tD = new int[2];
      uD = new int[2];
      vD = 0;
      new Random();
      yD = -1;
      zD = -1;
      ae = -1;
      be = -1;
      ce = new int[2];
      de = new int[2];
      ee = new int[2];
      fe = new int[2];
      ge = new int[2];
      he = new int[2];
      ie = new int[3];
      je = new int[3];
      ke = new int[2];
      le = new int[2];
      me = new int[2];
      ne = -1L;
      oe = -1L;
   }
}
