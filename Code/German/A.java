import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class A extends Canvas implements Runnable {
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
   static int s = -1;
   static final byte[][] t = new byte[][]{{15, 15, 0, 7}, {20, 15, 3, 13}, {25, 15, 1, 9}, {30, 15, 2, 11}, {31, 15, 8}, {32, 15, 14}, {33, 15, 6}, {34, 15, 12}, {35, 15, 4, 10}, {50, 0, 17}, {45, 0, 18}, {40, 0, 5}, {55, 0, 0, 7}, {60, 0, 3, 13}, {61, 0, 1, 9}, {62, 0, 2, 11}, {65, 0, 4, 10}, {85, 0, 17}, {80, 0, 18}, {90, 0, 5}, {95, 0, 15}, {100, 0, 16}, {101, 0, 6}, {102, 0, 7}, {103, 0, 8}, {104, 0, 9}, {115, 0, 10}, {105, 0, 11}, {106, 0, 12}, {107, 0, 13}, {108, 0, 14}, {109, 0, 16}, {110, 0, 6}, {111, 0, 8}, {112, 0, 12}, {113, 0, 14}, {114, 0, 15}, {116, 15, 0}, {117, 15, 3}, {118, 0, 5}};
   static int u;
   static byte[] v;
   static byte[] w;
   static byte[] x;
   static short[] y;
   static short[] z;
   static short[] aa;
   static String[] ba;
   static int[] ca;
   static int[][][] da;
   static int[][] ea;
   static int[][] fa;
   static int[][] ga;
   static int[][] ha;
   static int[][] ia;
   static int[][] ja;
   static int[][] ka;
   static int[][] la;
   static int[][] ma;
   static int[] na;
   static int[][] oa;
   static int[][] pa;
   static int[][] qa;
   static int[][] ra;
   static int[][] sa;
   static int[][] ta;
   static int[][] ua;
   static int[][] va;
   static int[] wa;
   static int[][] xa;
   static int[][] ya;
   static int[] za;
   static int[] aA;
   static int[] bA;
   static int[] cA;
   static int[] dA;
   static int[] eA;
   static int[] fA;
   static int[] gA;
   static int[] hA;
   static int[][] iA;
   static int[][] jA;
   static short[][] kA;
   static int lA;
   static int mA;
   public static int nA;
   public static int oA;
   static boolean pA;
   private static int[] qA;
   private static String rA;
   private static String sA;
   static Image tA;
   static Graphics uA;
   static int vA;
   static int wA;
   static int xA;
   static int yA;
   static boolean zA;
   static int[] ab;
   private static int[] bb;
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
   private static int gc;
   private static int hc;
   private static byte[] ic;
   private static DataInputStream jc;
   static byte[] kc;
   static byte[] lc;
   public static short[] mc;
   public static byte[] nc;
   public static byte[][] oc;
   public static byte[][][][] pc;
   public static byte[][][][] qc;
   public static byte[][][] rc;
   public static short[][][][][] sc;
   public static short[][] tc;
   public static byte[][][] uc;
   public static int[][][][] vc;
   public static byte[][] wc;
   public static Image[][][] xc;
   public static byte[][][] yc;
   private static short[] zc;
   public static int[][][] aC;
   static int[] bC;
   static byte[][] cC;
   static int[][] dC;
   static int[][] eC;
   static int fC;
   static int gC;
   static int hC;
   static int iC;
   static int jC;
   static int[] kC;
   public static int[] lC;
   private static int[] mC;
   private static int[] nC;
   static boolean oC;
   static boolean pC;
   static String[] qC;
   static String rC;
   static String sC;
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
   static int fd;
   static int[] gd;
   static int hd;
   static boolean id;
   static Vector jd;
   static String[] kd;
   static int ld;
   static int md;
   static int nd;
   static int od;
   static int pd;
   static int[] qd;
   static boolean rd;
   static boolean sd;
   static long td;
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
   static int eD;
   static boolean fD;
   static boolean gD;
   private static Hashtable hD;
   private static byte iD;
   static int jD;
   static int kD;
   static int lD;
   static int mD;
   static int nD;
   static boolean oD;
   static String pD;
   public static int[][] qD;
   public static int[][] rD;
   public static boolean sD;
   private static int[] tD;
   public static int[] uD;
   public static int[] vD;
   public static int wD;
   static String xD;
   static int yD;
   public static int zD;
   public static int ae;
   public static int be;
   public static int ce;
   static int[] de;
   static int[] ee;
   static int[] fe;
   static int[] ge;
   static int[] he;
   private static int[] ie;
   private static int[] je;
   static int[] ke;
   static int[] le;
   static int[] me;
   static int[] ne;
   private static int[] oe;
   private static int[] pe;
   private static int[] qe;
   private static int[] re;
   private static int[] se;
   private static int[] te;
   private static int[] ue;
   private static int[] ve;
   static int[] we;
   private static int[] xe;
   private static int[] ye;
   private static int[] ze;
   private static int[] aE;
   private static int[] bE;
   private static int[] cE;
   private static int[] dE;
   private static int[] eE;
   private static int[] fE;
   public static int[] gE;
   private static int[] hE;
   private static int[] iE;
   private static final int[] jE;
   private static int[] kE;
   private static int[] lE;
   private static int[] mE;
   private static int[] nE;
   private static int[] oE;
   private static int[] pE;
   private static int[] qE;
   private static int[] rE;
   private static int[] sE;
   public static long tE;
   public static long uE;

   public void A(int var1) {
      this.B();
      s = var1;
      this.A();
   }

   public void A() {
      switch(s) {
      case 1:
         G();
         break;
      case 2:
         m = null;
         HG.iA = false;
         HG.fA = 0;
         HG.kA = -1;
         D();
         HG.M(0);
         break;
      case 5:
         HG.LA(0);
         W(159);
      }

   }

   public void B() {
   }

   public void C() {
      switch(s) {
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
               r.A(HG.eb, 1);
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
               HG.iA = true;
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
                  this.A(5);
                  HG.LA(0);
                  HG.iA = true;
               }
            }
         }
      case 3:
      case 5:
      default:
         break;
      case 4:
         HG.fb.destroyApp(false);
         break;
      case 6:
         synchronized(r.h) {
            if (!HG.iA || HG.jA > 17) {
               TA();
               if (!oC && !id) {
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
         if (s != 2 && s != 1) {
            if (s != 3) {
               w[var2] = 20;
               x[var2] = 0;
            }
         } else {
            k = 0L;
         }
      }

   }

   protected void keyRepeated(int var1) {
   }

   protected void keyReleased(int var1) {
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
         x[17] = 10;
         break;
      case -6:
         x[18] = 10;
         break;
      case -5:
         x[4] = 10;
         break;
      case -4:
         x[2] = 10;
         break;
      case -3:
         x[1] = 10;
         break;
      case -2:
         x[3] = 10;
         break;
      case -1:
         x[0] = 10;
         break;
      case 35:
         x[15] = 10;
         break;
      case 42:
         x[16] = 10;
         break;
      case 48:
         x[5] = 10;
         break;
      case 49:
         x[6] = 10;
         break;
      case 50:
         x[7] = 10;
         break;
      case 51:
         x[8] = 10;
         break;
      case 52:
         x[9] = 10;
         break;
      case 53:
         x[10] = 10;
         break;
      case 54:
         x[11] = 10;
         break;
      case 55:
         x[12] = 10;
         break;
      case 56:
         x[13] = 10;
         break;
      case 57:
         x[14] = 10;
      }

   }

   static void D() {
      for(int var0 = 0; var0 < 20; ++var0) {
         x[var0] = 10;
      }

   }

   static void E() {
      int var0;
      for(var0 = 0; var0 < 20; ++var0) {
         if (w[var0] == 30 && (x[var0] == 10 || x[var0] == 40)) {
            w[var0] = 10;
            x[var0] = 0;
         }
      }

      for(int var7 = 0; var7 < u; ++var7) {
         byte[] var6 = t[var7];
         byte var8 = var6[0];
         int var5 = B(var8);
         int var4 = var6.length;
         boolean var3 = false;
         boolean var2 = false;

         for(int var1 = 2; var1 < var4; ++var1) {
            var8 = var6[var1];
            if (w[var8] == 20) {
               var2 = true;
            } else if (w[var8] == 30) {
               var3 = true;
            }
         }

         if (var2) {
            v[var5] = 5;
         } else if (var3) {
            v[var5] = 10;
         } else {
            v[var5] = 0;
         }
      }

      for(var0 = 0; var0 < 20; ++var0) {
         if (w[var0] == 20) {
            w[var0] = 30;
         }
      }

   }

   static int B(int var0) {
      int var3 = -1;

      for(int var2 = u - 1; var2 >= 0; --var2) {
         byte[] var1 = t[var2];
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
         var1 = v[var0] == 5;
         if (!var1) {
            byte[] var2 = t[var0];
            boolean var3 = v[var0] == 10;
            if (var3) {
               var3 = var2[1] == 15;
               var1 = var3;
            }
         }
      }

      return var1;
   }

   static void F() {
      int var1 = v.length;

      for(int var0 = 0; var0 < var1; ++var0) {
         v[var0] = 0;
      }

   }

   public static void A(String var0, int var1, int var2, int var3, int var4, Graphics var5) {
      var1 += 0;
      var2 += 0;
      short var6 = y[var3 * 11 + 4];
      short var13 = y[var3 * 11 + 0];
      short var12 = y[var3 * 11 + 1];
      int var11 = y[var3 * 11 + 2];
      int var10 = y[var3 * 11 + 3];
      boolean var16 = (var6 & 256) == 256;
      boolean var9 = (var6 & 128) == 128;
      boolean var8 = (var6 & 512) == 512;
      if (var16) {
         short var7 = y[var3 * 11 + 6];
         var6 = y[var3 * 11 + 7];
         var4 = var7 + y[var3 * 11 + 8];
         int var15 = var6 + y[var3 * 11 + 9];
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
         y[var0 * 11 + 5] = 1;
      } else {
         y[var0 * 11 + 5] = 0;
      }

   }

   public static void A(int var0, int var1, int var2, int var3, int var4) {
      y[var0 * 11 + 6] = (short)var1;
      y[var0 * 11 + 7] = (short)var2;
      y[var0 * 11 + 8] = (short)var3;
      y[var0 * 11 + 9] = (short)var4;
   }

   public static void A(int var0, int var1, int var2, int var3, int var4, int var5) {
      y[var0 * 11 + 0] = (short)var1;
      y[var0 * 11 + 1] = (short)var2;
      y[var0 * 11 + 2] = (short)var3;
      y[var0 * 11 + 3] = (short)var4;
      y[var0 * 11 + 4] = (short)var5;
      A(var0, true);
   }

   public static void A(int var0, int var1, int var2) {
      z[var0 * 3 + 0] = (short)var1;
      z[var0 * 3 + 1] = (short)var2;
      z[var0 * 3 + 2] = 0;
   }

   public static void A(int var0, int var1) {
      y[var0 * 11 + 10] = (short)var1;
   }

   public static void A(String var0, int var1, int var2, Graphics var3) {
      if (y[var1 * 11 + 5] == 1) {
         short var4 = y[var1 * 11 + 4];
         boolean var5 = (var4 & 32) == 32;
         String[] var6;
         if (var5) {
            var6 = HG.A(var0, j[var2], y[var1 * 11 + 2], 0);
         } else {
            var6 = ba;
            var6[0] = var0;
         }

         A(var6, var1, var2, var3);
      }

   }

   public static void A(String[] var0, int var1, int var2, Graphics var3) {
      if (y[var1 * 11 + 5] == 1) {
         short var11 = y[var1 * 11 + 4];
         short var9 = y[var1 * 11 + 0];
         int var8 = y[var1 * 11 + 1];
         short var7 = y[var1 * 11 + 2];
         short var6 = y[var1 * 11 + 3];
         Font var5 = j[var2];
         int var4 = j[var2].getHeight();
         if ((var11 & 8) == 8) {
            var8 += (var6 - var4) / 2;
         }

         String[] var25 = var0;
         int var24 = var0.length * var4 + y[var1 * 11 + 10];
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
         boolean var17 = z[var1 * 3 + 0] != 0;
         int var16 = 0;
         short var15 = z[var1 * 3 + 0];
         short var14 = z[var1 * 3 + 1];
         boolean var13 = false;
         int var12 = -1;
         int var27;
         int var28;
         if (!var19) {
            if (var10) {
               var28 = var23 - var7 + 20;
               var27 = z[var1 * 3 + 2];
               if (var27 < 0) {
                  var27 = -var27;
               }

               if (var23 > var7) {
                  var13 = true;
                  if (var27 >= var28) {
                     var12 = var23 + 20;
                  }
               } else if (var14 == 0) {
                  z[var1 * 3 + 2] = 0;
               }

               if (var24 > var6) {
                  var13 = true;
                  if (var24 <= var27) {
                     z[var1 * 3 + 2] = (short)var6;
                  }
               } else if (var15 == 0) {
                  z[var1 * 3 + 2] = 0;
               }
            }
         } else if (var10) {
            if (var23 > var7) {
               var13 = true;
            } else if (var14 == 0) {
               z[var1 * 3 + 2] = 0;
            }

            if (var24 > var6) {
               var13 = true;
            } else if (var15 == 0) {
               z[var1 * 3 + 2] = 0;
            }
         }

         int var26;
         if (var19 && var13) {
            short var29 = z[var1 * 3 + 2];
            var26 = var6 - var24;
            aa[var1 * 1 + 0] = 0;
            if (var29 < var26) {
               z[var1 * 3 + 2] = (short)var26;
               aa[var1 * 1 + 0] = 1;
            }

            if (var29 > 0) {
               z[var1 * 3 + 2] = 0;
               aa[var1 * 1 + 0] = 2;
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
               if (var18 < y[var1 * 11 + 0]) {
                  var18 = y[var1 * 11 + 0];
               }
            }

            var27 = var8;
            if (var17) {
               var15 = z[var1 * 3 + 0];
               if (var15 != 0) {
                  var18 += z[var1 * 3 + 2];
                  if (var26 > var7 && var18 + var12 <= y[var1 * 11 + 0] && var12 != -1) {
                     z[var1 * 3 + 2] = 0;
                  }
               }
            } else {
               var14 = z[var1 * 3 + 1];
               if (var14 != 0) {
                  var27 = var8 + z[var1 * 3 + 2];
                  if (var24 > var6 && var27 + -1 <= y[var1 * 11 + 1]) {
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
                  var30 = z;
                  var30[var1 * 3 + 2] += var15;
               } else {
                  var30 = z;
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
         var0 = new DataInputStream(HG.fb.getClass().getResourceAsStream("/a"));
         cc = new short[var0.readShort()];

         int var1;
         for(var1 = 0; var1 < cc.length; ++var1) {
            cc[var1] = var0.readShort();
         }

         HG.hA = new short[var0.readShort()][];

         for(int var3 = 0; var3 < HG.hA.length; ++var3) {
            HG.hA[var3] = new short[var0.readShort()];

            for(var1 = 0; var1 < HG.hA[var3].length; ++var1) {
               HG.hA[var3][var1] = var0.readShort();
            }
         }

         qA = new int[var0.readShort()];

         for(var1 = 0; var1 < qA.length; ++var1) {
            qA[var1] = var0.readShort();
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
      ca = new int[55];
      da = new int[6][15][];

      for(int var0 = 0; var0 < 15; ++var0) {
         da[0][var0] = new int[9];
         da[1][var0] = new int[9];
         da[2][var0] = new int[7];
         da[3][var0] = new int[8];
         da[4][var0] = new int[6];
         da[5][var0] = new int[6];
      }

      na = new int[23];
      ya = new int[19][4];
      za = null;
      aA = null;
      cA = null;
      bA = null;
      dA = null;
      eA = null;
      fA = null;
      gA = null;
   }

   public static boolean I() {
      if (h == 2579220938L) {
         pA = !pA;
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 2578033336L) {
         int[] var10000 = ca;
         var10000[12] &= -65536;
         var10000 = ca;
         var10000[12] |= 0;
         J(ca[4], ca[5], 4096);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 41284439224L) {
         A(4, 5, true, false, ca);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 659427265720L) {
         A(5, 5, true, false, ca);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else if (h == 10555380766664L) {
         A(2, 10, true, false, ca);
         if (HG.MA(3)) {
            Display.getDisplay(a).vibrate(500);
         }

         return true;
      } else {
         if (h == 41297607096L) {
            A(24, 10, true, false, ca);
            if (HG.MA(3)) {
               Display.getDisplay(a).vibrate(500);
            }
         } else {
            if (h == 41217071517L) {
               A(3, 10, true, false, ca);
               if (HG.MA(3)) {
                  Display.getDisplay(a).vibrate(500);
               }

               return true;
            }

            if (h == 659437426872L) {
               if (gB >= 0) {
                  A(10000, ea[gB], ca);
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
         var1 = 1 + ea.length;
      } else if ((var0 & 64) != 0) {
         var1 = 1 + ea.length + pa.length;
      } else if ((var0 & 128) != 0) {
         var1 = 1 + ea.length + pa.length + ga.length;
      } else if ((var0 & 256) != 0) {
         var1 = 1 + ea.length + pa.length + ga.length + ia.length;
      } else if ((var0 & 512) != 0) {
         var1 = 1 + ea.length + pa.length + ga.length + ia.length + ka.length;
      } else if ((var0 & 8192) != 0) {
         var1 = 1 + ea.length + pa.length + ga.length + ia.length + ka.length + ma.length;
      } else if ((var0 & 1024) != 0) {
         var1 = 1 + ea.length + pa.length + ga.length + ia.length + ka.length + ma.length + sa.length;
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
         return ga[var1];
      case 1:
         return ia[var1];
      case 2:
         return ka[var1];
      case 3:
         return sa[var1];
      case 4:
         return ua[var1];
      case 5:
         return ma[var1];
      case 6:
         return ea[var1];
      case 7:
         return pa[var1];
      default:
         return null;
      }
   }

   static int[] A(int[] var0) {
      if ((var0[3] & 32) != 0) {
         return fa[var0[11]];
      } else if ((var0[3] & 64) != 0) {
         return ha[var0[4]];
      } else if ((var0[3] & 128) != 0) {
         return ja[var0[4]];
      } else if ((var0[3] & 256) != 0) {
         return la[var0[4]];
      } else if ((var0[3] & 512) != 0) {
         return oa[var0[4]];
      } else if ((var0[3] & 4096) != 0) {
         return qa[var0[4]];
      } else if ((var0[3] & 8192) != 0) {
         return ta[var0[4]];
      } else {
         return (var0[3] & 1024) != 0 ? va[var0[4]] : null;
      }
   }

   static void B(int[][] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         var0[var1][4] = -1;
         var0[var1][0] = -1;
      }

   }

   static void A(int[] var0, boolean var1) {
      if (wa != null) {
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
                  if (var16 >= 0 && var10 >= 0 && var16 <= B.c * 2 && var10 < B.b * 2 && (wa[var16 * B.b * 2 * 3 + var10 * 3 + 2] & '쀀') != 32768) {
                     var10000 = wa;
                     var10001 = var16 * B.b * 2 * 3 + var10 * 3 + 2;
                     var10000[var10001] &= -49153;
                     var10000 = wa;
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
                     if (var4 >= 0 && var10 >= 0 && var4 <= B.c * 2 && var10 < B.b * 2 && (wa[var4 * B.b * 2 * 3 + var10 * 3 + 2] & '쀀') != 32768) {
                        var10000 = wa;
                        var10001 = var4 * B.b * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] &= -49153;
                        var10000 = wa;
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
                        var10000 = wa;
                        var10001 = var16 * B.b * 2 * 3 + var10 * 3 + 2;
                        var10000[var10001] &= -49153;
                        var10000 = wa;
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
      if (wa != null) {
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
               int[] var10000 = wa;
               int var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
               var10000[var10001] &= -49153;
               var10000 = wa;
               var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
               var10000[var10001] |= 0;
               if (var4) {
                  var10000 = wa;
                  var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                  var10000[var10001] &= 65535;
                  var10000 = wa;
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
                           var10000 = wa;
                           var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                           var10000[var10001] &= -49153;
                           var10000 = wa;
                           var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                           var10000[var10001] |= 32768;
                        }
                     } else if ((wa[var5 * B.b * 2 * 3 + var6 * 3 + 2] & '쀀') != 32768 && ((B.a[var0][3] & 32) != 0 || (B.a[var0][3] & 16) != 0) && (B.a[var0][3] & '耀') == 0) {
                        A(B.a[var0], false);
                     }
                  }
               } else {
                  var10000 = wa;
                  var10001 = var5 * B.b * 2 * 3 + var6 * 3 + 2;
                  var10000[var10001] &= -49153;
                  var10000 = wa;
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
      if (var2 >= 0 && var3 >= 0 && var3 < B.c * 2 && var2 < B.b * 2 && (wa[var3 * B.b * 2 * 3 + var2 * 3 + 2] & '쀀') != 32768) {
         if ((wa[var3 * B.b * 2 * 3 + var2 * 3 + 2] & '쀀') == 16384) {
            return false;
         } else {
            if (var4) {
               B.A(ea[var0], B.y);
               int[] var9 = A(ea[var0]);
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

            if (var5 && (short)((wa[var3 * B.b * 2 * 3 + var2 * 3 + 2] & -65536) >> 16) >= 0) {
               byte var11 = (byte)(wa[var3 * B.b * 2 * 3 + var2 * 3 + 2] >> 16 & 255);
               var2 = (byte)(wa[var3 * B.b * 2 * 3 + var2 * 3 + 2] >> 24 & 255) - ea[var11][24];
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
                  var0 = qA[var0 >> 24] << 8;
               } else {
                  var0 = qA[var0 >> 22] << 7;
               }
            } else if (var0 >= 67108864) {
               var0 = qA[var0 >> 20] << 6;
            } else {
               var0 = qA[var0 >> 18] << 5;
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
                  var0 = qA[var0 >> 16] << 4;
               } else {
                  var0 = qA[var0 >> 14] << 3;
               }
            } else if (var0 >= 262144) {
               var0 = qA[var0 >> 12] << 2;
            } else {
               var0 = qA[var0 >> 10] << 1;
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
               var0 = qA[var0 >> 8] + 1;
            } else {
               var0 = (qA[var0 >> 6] >> 1) + 1;
            }
         } else if (var0 >= 1024) {
            var0 = (qA[var0 >> 4] >> 2) + 1;
         } else {
            var0 = (qA[var0 >> 2] >> 3) + 1;
         }

         if (var0 * var0 > var1) {
            --var0;
            var10000 = var0;
         } else {
            var10000 = var0;
         }

         return var10000;
      } else {
         return var0 >= 0 ? qA[var0] >> 4 : -1;
      }
   }

   public static void A(Graphics var0) {
      var0.setClip(0, 0, f, g);
      var0.setColor(i[3]);
      var0.fillRect(0, 0, f, g);
      var0.setColor(i[0]);
      A(3, 0, 0, f, g, 44);
      A((String)sA, 3, 1, var0);
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
         switch(s) {
         case 1:
         case 3:
            if (r == null) {
               if (s == 1) {
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
                  var0.drawString(rA, var4 + 0, var2 - var1 + 0, 17);
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
               if (ca[11] != 0) {
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
      xA = f / B.d + 2;
      yA = g / B.e + 2;
      tA = Image.createImage(xA * B.d, yA * B.e);
      uA = tA.getGraphics();
      vA = -1;
      wA = -1;
      zA = true;
   }

   static void K() {
      tA = null;
      uA = null;
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
            var11 = ha[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 128) != 0) {
            var11 = ja[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 256) != 0) {
            var11 = la[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 8192) != 0) {
            var11 = ta[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         } else if ((var0[3] & 1024) != 0) {
            var11 = va[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
            var8 = o % cc[1223];
         } else if ((var0[3] & 4096) != 0) {
            var11 = qa[var0[4]];
            var7 = var0[7];
            if (!var1) {
               var8 = (short)(var0[10] & '\uffff');
               R(var0);
            }
         } else if ((var0[3] & 512) != 0) {
            var11 = oa[var0[4]];
            var10 = (short)(var0[5] & '\uffff');
            var9 = (B.d >> 1) - (short)((var0[5] & -65536) >> 16);
         }

         if (var11 != null) {
            B.B(var0, ab);
            int var6 = ab[0] * B.d >> 12;
            int var5 = (ab[1] - ab[2]) * B.d >> 12;
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
            B(var0, var2);
         }

         if ((var0[3] & 2048) != 0 && !var1) {
            C(var0, var2);
         }

         if ((var0[3] & 16384) != 0 && !var1) {
            D(var0, var2);
         }

         if ((var0[3] & 262144) != 0 && !var1) {
            E(var0, var2);
         }

      }
   }

   public static void A(int[] var0, Graphics var1) {
      B.A(var0, bb);
      int var4 = bb[0] * B.d >> 12;
      int var3 = bb[1] * B.d >> 12;
      short var5 = (short)(B.f & '\uffff');
      short var2;
      byte var6;
      if (!HG.d) {
         var2 = 171;
         if (var5 == 0) {
            var6 = 0;
         } else {
            var6 = 1;
         }
      } else {
         var2 = 172;
         var6 = 0;
      }

      if (L(var2, var6)) {
         A(var4, var3, var2, var6, 0, 0, var1);
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
      if ((HG.iA && HG.jA > 17 || !HG.iA) && !id && HG.fA == 0) {
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

         A(ca, var0);

         for(var19 = 0; var19 < ea.length; ++var19) {
            if ((ea[var19][3] & 65536) == 0) {
               A(ea[var19], var0);
            }
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

      if (!HG.iA) {
         if (gB == -1) {
            K(var0);
         }

         J(var0);
         U(var0);
         S(var0);
         if (id) {
            Q(var0);
         } else if (oD) {
            R(var0);
         }

         if (oC) {
            N(var0);
         }
      }

      var0.setClip(0, 0, f, g);
   }

   public static void E(Graphics var0) {
      F(var0);
      B.A(ca, cb);
      int var2 = cb[0] * B.d >> 12;
      int var1 = cb[1] * B.d >> 12;
      if (W(134)) {
         A(var2, var1, 134, 0, 0, 0, var0);
      }

      V(var0);
      if (!HG.iA) {
         if (db || eb) {
            A((Graphics)var0, 0);
            G(var0);
         }

         if (oC) {
            N(var0);
         }
      }

      var0.setClip(0, 0, f, g);
   }

   static void A(int var0, int var1, int var2, int var3) {
      uA.setColor(0);

      for(int var13 = var0; var13 < var2; ++var13) {
         for(int var12 = var1; var12 < var3; ++var12) {
            int var11 = var13 % xA * B.d;
            int var10 = var12 % yA * B.e;
            uA.fillRect(var11, var10, B.d, B.e);
            if (var13 >= 0 && var13 < B.g[0].length && var12 >= 0 && var12 < B.g.length) {
               short var9 = (short)(B.f & '\uffff');

               for(int var8 = 0; var8 < (ca[11] == 0 ? 2 : 1); ++var8) {
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

                     uA.drawRegion(ec[var9][var14], var0, var15, B.d, B.e, var6, var11, var10, 20);
                  }

                  var9 = (short)((B.f & -65536) >> 16);
               }
            }
         }
      }

   }

   static void M() {
      int var1 = vA;
      int var0 = wA;
      vA = tB / B.d;
      if (tB < 0) {
         --vA;
      }

      wA = uB / B.e;
      if (uB < 0) {
         --wA;
      }

      if (zA) {
         A(vA, wA, vA + xA, wA + yA);
         zA = false;
      } else {
         if (vA != var1) {
            if (var1 < vA) {
               while(var1 + xA < vA) {
                  var1 += xA;
               }

               A(var1 + xA, var0, vA + xA, var0 + yA);
            } else {
               while(var1 - xA > vA) {
                  var1 -= xA;
               }

               A(vA, var0, var1, var0 + yA);
            }

            var1 = vA;
         }

         if (wA != var0) {
            if (var0 < wA) {
               while(var0 + yA < wA) {
                  var0 += yA;
               }

               A(var1, var0 + yA, var1 + xA, wA + yA);
            } else {
               while(var0 - yA > wA) {
                  var0 -= yA;
               }

               A(var1, wA, var1 + xA, var0);
            }
         }
      }

   }

   static void F(Graphics var0) {
      M();
      int var4 = -vA % xA * B.d;
      int var3 = -wA % yA * B.e;
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

      var0.drawRegion(tA, 0, 0, tA.getWidth(), tA.getHeight(), 0, var4 - var2, var3 - var1, 20);
      var0.drawRegion(tA, 0, 0, tA.getWidth(), tA.getHeight(), 0, var4 - var2 + xA * B.d, var3 - var1, 20);
      var0.drawRegion(tA, 0, 0, tA.getWidth(), tA.getHeight(), 0, var4 - var2, var3 - var1 + yA * B.e, 20);
      var0.drawRegion(tA, 0, 0, tA.getWidth(), tA.getHeight(), 0, var4 - var2 + xA * B.d, var3 - var1 + yA * B.e, 20);
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
      int var1 = ca[40];
      if ((ca[39] & 1 << var1) == 0) {
         nb = HG.I(429);
      } else {
         int var2;
         int[][] var3;
         int[][] var4;
         short var5;
         short var0 = (short)(ca[31 + var1] & '\uffff');
         var5 = (short)((ca[31 + var1] & -65536) >> 16);
         var4 = da[var0];
         var3 = (int[][])null;
         var2 = -1;
         var1 = -1;
         label34:
         switch(var0) {
         case 0:
            var3 = ha;
            int var6 = 6;

            while(true) {
               if (var6 > 7) {
                  break label34;
               }

               if (var4[var5][var6] > 0) {
                  if (ra[(short)((var4[var5][var6] & -65536) >> 16)][1] == 0) {
                     var2 = ra[(short)((var4[var5][var6] & -65536) >> 16)][0];
                  } else {
                     var1 = ra[(short)((var4[var5][var6] & -65536) >> 16)][0];
                  }
               }

               ++var6;
            }
         case 1:
            var3 = ja;
            break;
         case 2:
            var3 = la;
            break;
         case 3:
            var3 = ta;
            break;
         case 4:
            var3 = va;
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
      int var0 = ca[40];
      return (ca[39] & 1 << var0) == 0 ? -1 : (short)(ca[31 + var0] & '\uffff');
   }

   public static int S() {
      int var0 = ca[40];
      return (ca[39] & 1 << var0) == 0 ? -1 : (short)((ca[31 + var0] & -65536) >> 16);
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
      int var0 = ca[40];
      int var2 = G(var0);
      boolean var3 = false;
      if (C(65) || fb) {
         int var1 = (short)HG.za & '\uffff' | (short)HG.aA << 16 & -65536;
         ca[31 + var2] = var1;
         int[] var10000 = ca;
         var10000[39] |= 1 << var2;

         for(var0 = 0; var0 < 8; ++var0) {
            if (var0 != var2 && var1 == ca[31 + var0]) {
               ca[31 + var0] = -1;
               var10000 = ca;
               var10000[39] &= ~(1 << var0);
            }
         }

         var3 = true;
      }

      if (C(95) || C(85) || var3) {
         eb = false;
         D();
         if (HG.jA != 19 && HG.jA != 21) {
            HG.U();
         } else {
            HG.B(HG.jA);
         }

         HG.iA = true;
      }

      ca[40] = var2;
      Q();
   }

   public static void U() {
      int var0 = ca[40];
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
      ca[40] = var0;
      Q();
      if (fb) {
         db = false;
         G(R(), S());
         D();
      }

   }

   public static void G(Graphics var0) {
      int var4 = ca[40];

      for(int var3 = 0; var3 < 8; ++var3) {
         short var2 = (short)(ca[31 + var3] & '\uffff');
         short var1 = (short)((ca[31 + var3] & -65536) >> 16);
         if (var2 != -1 && var1 != -1 && (ca[39] & 1 << var3) != 0 && da[var2][var1][4] != -1) {
            int var5 = A(da[var2][var1])[2];
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
         ob = HG.I(fa[ea[var0][11]][0]);
         short var1 = (short)(ea[var0][12] & '\uffff');
         short var2 = (short)((ea[var0][12] & -65536) >> 16);
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
         int var4 = ea[gB][4] * B.d >> 12;
         int var3 = ea[gB][5] * B.d >> 12;
         byte var2;
         if (hB) {
            var2 = 1;
         } else {
            var2 = 0;
         }

         short[] var1 = D(ea[gB], true);
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
      int var3 = j[1].getHeight() + 4 + 5;
      int var2 = g - (cc[1387] + cc[1607] - 7);
      int var1 = f - 2 * var4 - 1;
      int var0 = g - (var3 + 5);
      if (var2 > var0) {
         var2 = var0;
      }

      A(6, var4 + 4, var2 + 4, var1 - 8, var3, 532);
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
                     return la[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 64) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return ha[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 128) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return ja[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 8192) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return ta[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 1024) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return va[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 512) != 0) {
                     tb = var3;
                     ub = 0;
                     vb = 3;
                     return oa[B.a[var3][4]];
                  }

                  if ((B.a[var3][3] & 32) != 0) {
                     if (N((short)((B.a[var3][2] & -65536) >> 16)) && (B.a[var3][13] & 2) == 0 && (B.a[var3][3] & 65536) == 0) {
                        tb = var3;
                        ub = 1;
                        vb = 2;
                        return fa[B.a[var3][11]];
                     }

                     if ((B.a[var3][13] & 2) != 0) {
                        short var4 = (short)(B.a[var3][17] & '\uffff');
                        var4 = (short)((hA[var4] & -65536) >> 16);
                        if (var4 > 0) {
                           tb = var3;
                           ub = 7;
                           vb = 1;
                           return fa[B.a[var3][11]];
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
                                 for(var1 = 0; var1 < da[5].length; ++var1) {
                                    var0 = da[5][var1][4];
                                    if (var0 >= 0 && oa[var0][4] == var2) {
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
                        if ((short)((hA[var0] & -65536) >> 16) != 0) {
                           ub = 7;
                           vb = 1;
                           tb = var3;
                           return qa[B.a[var3][4]];
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
      return qa[B.a[var3][4]];
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
      int var6 = ca[30];

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
         switch(ca[30]) {
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
            B.B(var4, ab);
            var3 = ab[0] * B.d >> 12;
            var2 = (ab[1] - ab[2]) * B.d >> 12;
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
         int var4 = j[1].getHeight() + 4 + 5 - 1;
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
         if (ca[11] >= 0) {
            var10000 = dA;
            var10001 = ca[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 128) != 0 && B(1, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (ca[11] >= 0) {
            var10000 = eA;
            var10001 = ca[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 256) != 0 && B(2, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (ca[11] >= 0) {
            var10000 = aA;
            var10001 = ca[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 8192) != 0 && B(3, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (ca[11] >= 0) {
            var10000 = fA;
            var10001 = ca[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 512) != 0 && B(5, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (ca[11] >= 0) {
            var10000 = bA;
            var10001 = ca[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else if ((B.a[var0][3] & 1024) != 0 && B(4, B.a[var0])) {
         var1 = (short)((B.a[var0][2] & -65536) >> 16);
         if (ca[11] >= 0) {
            var10000 = gA;
            var10001 = ca[11];
            var10000[var10001] |= 1 << var1;
         }

         return true;
      } else {
         D(241, 230, 101, 106);
         return false;
      }
   }

   static boolean A(int var0, int[] var1) {
      int[][] var3 = da[var0];

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
      short var3 = (short)(da[var0][var1][8] & '\uffff');
      short var4 = (short)((da[var0][var1][8] & -65536) >> 16);
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
         if (ca[42] != var1) {
            if (A(var0, var1, true)) {
               if (ca[42] != -1) {
                  B(var0, ca[42], false);
                  ca[42] = -1;
               }

               ca[42] = var1;
               ca[45] = -1;
               B(var0, ca[42], true);
            }
         } else {
            B(var0, ca[42], false);
            ca[42] = -1;
         }

         HG.M(12);
         break;
      case 1:
         if (ca[41] != var1) {
            if (A(var0, var1, true)) {
               if (ca[41] != -1) {
                  B(var0, ca[41], false);
                  ca[41] = -1;
               }

               ca[41] = var1;
               B(var0, ca[41], true);
            }
         } else {
            B(var0, ca[41], false);
            ca[41] = -1;
         }

         HG.M(11);
         break;
      case 2:
         E(da[var0][var1]);
         if (da[var0][var1][6] <= 1) {
            int var3 = (short)var0 & '\uffff' | (short)var1 << 16 & -65536;

            for(var2 = 0; var2 < 8; ++var2) {
               if (var3 == ca[31 + var2]) {
                  var10000 = ca;
                  var10000[39] &= ~(1 << var2);
                  var10000 = ca;
                  var10000[31 + var2] &= 65535;
                  var10000 = ca;
                  var10000[31 + var2] |= (short)da[var0][var1][4] << 16 & -65536;
               }
            }

            da[var0][var1][4] = -1;
         } else {
            int var10002 = da[var0][var1][6]--;
         }
         break;
      case 3:
         var2 = ta[da[var0][var1][4]][10];
         if (var2 == 1) {
            if (ca[44] != -1) {
               B(var0, ca[44], false);
            }

            if (ca[44] != var1) {
               ca[44] = var1;
               B(var0, ca[44], true);
            } else {
               ca[44] = -1;
            }
         } else if (var2 == 0) {
            var2 = ca[43];
            if ((short)(var2 & '\uffff') == var1) {
               B(var0, (short)(var2 & '\uffff'), false);
               var10000 = ca;
               var10000[43] &= -65536;
               var10000 = ca;
               var10000[43] |= 65535;
            } else if ((short)((var2 & -65536) >> 16) == var1) {
               B(var0, (short)((var2 & -65536) >> 16), false);
               var10000 = ca;
               var10000[43] &= 65535;
               var10000 = ca;
               var10000[43] |= -65536;
            } else if ((short)(var2 & '\uffff') == -1) {
               var10000 = ca;
               var10000[43] &= -65536;
               var10000 = ca;
               var10000[43] |= (short)var1 & '\uffff';
               B(var0, (short)(ca[43] & '\uffff'), true);
            } else if ((short)((var2 & -65536) >> 16) == -1) {
               var10000 = ca;
               var10000[43] &= 65535;
               var10000 = ca;
               var10000[43] |= (short)var1 << 16 & -65536;
               B(var0, (short)((ca[43] & -65536) >> 16), true);
            }
         }
         break;
      case 4:
         if (ca[42] != -1) {
            B(0, ca[42], false);
            ca[42] = -1;
         }

         if (ca[45] != var1) {
            ca[45] = var1;
         } else {
            ca[45] = -1;
         }
      }

      boolean var6 = false;
      boolean var5 = false;

      while(true) {
         while(ca[42] != -1 && !A(0, ca[42], false)) {
            B(0, ca[42], false);
            ca[42] = -1;
            var6 = true;
         }

         if (ca[41] == -1 || A(1, ca[41], false)) {
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

         B(0, ca[41], false);
         ca[41] = -1;
         var5 = true;
      }
   }

   static void A(boolean var0) {
      int var6 = 1;
      if ((da[HG.za][HG.aA][3] & 256) != 0) {
         var6 = cd;
      }

      int var5 = A(HG.za, HG.aA, var6, false, false);
      int var4;
      if (var0) {
         var4 = B.A(tb, B.a[var5]);
      } else {
         var4 = B.A(tb, (int[])null);
      }

      short var3 = (short)(hA[var4] & '\uffff');
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
         var10000 = hA;
         var10000[var4] &= -65536;
         var10000 = hA;
         var10000[var4] |= (short)var5 & '\uffff';
         var10000 = B.a[var5];
         var10000[1] &= -65536;
         var10000 = B.a[var5];
         var10000[1] |= (short)var3 & '\uffff';
         int var8 = (short)((hA[var4] & -65536) >> 16) + 1;
         var10000 = hA;
         var10000[var4] &= 65535;
         var10000 = hA;
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

      HG.B(HG.jA);
   }

   static boolean B(boolean var0) {
      int var8 = B.A(tb, (int[])null) + HG.bA;
      short var7 = (short)(hA[var8] & '\uffff');
      short var6 = -1;
      int var1 = 0;

      short var5;
      for(var5 = -1; var7 != -1; var7 = (short)(B.a[var7][1] & '\uffff')) {
         if (HG.cA == var1) {
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
               var1 *= cd;
               var4 = B.a[var5][6];
               var3 = B.a[var5][4];
               B.a[var5][6] = cd;
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
               var4 -= cd;
               if (var4 > 0) {
                  B.a[var5][4] = var3;
                  B.a[var5][6] = var4;
               }
            }

            if (var4 == 0) {
               short var9 = (short)(B.a[var7][1] & '\uffff');
               int[] var10000;
               if (var6 == -1) {
                  var10000 = hA;
                  var10000[var8] &= -65536;
                  var10000 = hA;
                  var10000[var8] |= (short)var9 & '\uffff';
               } else {
                  var10000 = B.a[var6];
                  var10000[1] &= -65536;
                  var10000 = B.a[var6];
                  var10000[1] |= (short)var9 & '\uffff';
               }

               var1 = (short)((hA[var8] & -65536) >> 16) - 1;
               var10000 = hA;
               var10000[var8] &= 65535;
               var10000 = hA;
               var10000[var8] |= (short)var1 << 16 & -65536;
               if (var1 == 0 && ca[11] == -1) {
                  B.a[tb][8] = 0;
               }
            }

            HG.W(21);
         }
      } else if (var0) {
         K(0);
      }

      return var0 || (short)((hA[var8] & -65536) >> 16) > 0;
   }

   static int H(int var0, int var1) {
      int var3 = 0;

      for(int var2 = 0; var2 < da[var0].length; ++var2) {
         if (da[var0][var2][4] == var1) {
            if (var0 == 2) {
               var3 += da[var0][var2][6];
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
         for(var0 = 0; var0 < da[var2].length; ++var0) {
            if (da[var2][var0][4] == var4) {
               if (var3 > var1) {
                  int[] var10000 = da[var2][var0];
                  var10000[6] -= var1;
               } else if (var3 == var1) {
                  A(var2, var0, var3, true, false);
               }

               return;
            }
         }
      } else {
         for(var0 = 0; var0 < da[var2].length; ++var0) {
            if (da[var2][var0][4] == var4) {
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
            var2 = A(ga);
            var6 = D(da[var0][var1][3]);
            if (var2 >= 0 && var6 >= 0) {
               System.arraycopy(da[var0][var1], 0, ga[var2], 0, da[var0][var1].length);
               B.a[var6] = ga[var2];
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
                  B.A(ga[var2], (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
               }
            }
         }

         if (ca[42] == var1) {
            B(var0, ca[42], false);
            ca[42] = -1;
         }
         break;
      case 1:
         if (!var3) {
            var2 = A(ia);
            var6 = D(da[var0][var1][3]);
            if (var2 >= 0 && var6 >= 0) {
               System.arraycopy(da[var0][var1], 0, ia[var2], 0, da[var0][var1].length);
               B.a[var6] = ia[var2];
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
                  B.A(ia[var2], (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
               }
            }
         }

         if (ca[41] == var1) {
            B(var0, ca[41], false);
            ca[41] = -1;
         }
         break;
      case 2:
         if (!var3) {
            var9 = A(ka);
            var6 = D(da[var0][var1][3]);
            if (var9 >= 0 && var6 >= 0) {
               System.arraycopy(da[var0][var1], 0, ka[var9], 0, da[var0][var1].length);
               ka[var9][6] = var2;
               var5 = da[var0][var1][6] - var2;
               da[var0][var1][6] = var5;
               B.a[var6] = ka[var9];
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
                  B.A(ka[var9], (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
               }
            }
         }
         break;
      case 3:
         if (!var3) {
            var2 = A(sa);
            var6 = D(da[var0][var1][3]);
            if (var2 >= 0 && var6 >= 0) {
               System.arraycopy(da[var0][var1], 0, sa[var2], 0, da[var0][var1].length);
               B.a[var6] = sa[var2];
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
                  B.A(sa[var2], (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
               }
            }

            if ((short)(ca[43] & '\uffff') == var1) {
               B(var0, (short)(ca[43] & '\uffff'), false);
               var10000 = ca;
               var10000[43] &= -65536;
               var10000 = ca;
               var10000[43] |= 65535;
            } else if ((short)((ca[43] & -65536) >> 16) == var1) {
               B(var0, (short)((ca[43] & -65536) >> 16), false);
               var10000 = ca;
               var10000[43] &= 65535;
               var10000 = ca;
               var10000[43] |= -65536;
            } else if (ca[44] == var1) {
               B(var0, ca[44], false);
               ca[44] = -1;
            }
         }
      }

      if (var5 <= 0) {
         var9 = (short)var0 & '\uffff' | (short)var1 << 16 & -65536;

         for(var2 = 0; var2 < 8; ++var2) {
            if (var9 == ca[31 + var2]) {
               var10000 = ca;
               var10000[39] &= ~(1 << var2);
               var10000 = ca;
               var10000[31 + var2] &= 65535;
               var10000 = ca;
               var10000[31 + var2] |= (short)da[var0][var1][4] << 16 & -65536;
            }
         }

         da[var0][var1][4] = -1;
      }

      if (var4) {
         short var8 = (short)(ca[0] & '\uffff');
         short var7 = (short)((ca[0] & -65536) >> 16);
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

         F((short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
      }

      return var6;
   }

   static void E(int[] var0) {
      var0 = la[var0[4]];
      A(var0[6], var0[3], true, false, ca);
      HG.M(33);
   }

   public static void B(int var0, int var1, boolean var2) {
      if (var0 != -1) {
         if (var1 != -1) {
            if (da[var0][var1][4] != -1) {
               B(da[var0][var1], var2);
            }
         }
      }
   }

   public static void B(int[] var0, boolean var1) {
      int[] var4 = A(var0);
      if ((var0[3] & 128) != 0) {
         int[] var10000;
         if (var1) {
            var10000 = ca;
            var10000[27] += var4[11];
            var10000 = ca;
            var10000[28] += var4[12];
            var10000 = ca;
            var10000[29] += var4[13];
         } else {
            var10000 = ca;
            var10000[27] -= var4[11];
            var10000 = ca;
            var10000[28] -= var4[12];
            var10000 = ca;
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
               var2 = ra[(short)((var0[6 + var3] & -65536) >> 16)][3];
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

            A(var6, var5, true, true, ca);
         }
      }

   }

   static int B(int var0, boolean var1) {
      switch(var0) {
      case 0:
         return (short)(ca[12] & '\uffff');
      case 1:
         return (short)(ca[13] & '\uffff');
      case 2:
         if (var1) {
            return (short)(ca[54] & '\uffff');
         }

         return (short)(ca[54] & '\uffff');
      case 3:
         if (var1) {
            return (short)((ca[54] & -65536) >> 16);
         }

         return (short)((ca[54] & -65536) >> 16);
      case 4:
         if (var1) {
            return (short)((ca[14] & -65536) >> 16);
         }

         return (short)(ca[14] & '\uffff');
      case 5:
         if (var1) {
            return (short)((ca[15] & -65536) >> 16);
         }

         return (short)(ca[15] & '\uffff');
      case 6:
         return ca[47];
      case 7:
         return ca[49];
      case 8:
         return ca[50];
      case 9:
         return (short)(ca[26] & '\uffff');
      case 10:
         return ca[27];
      case 11:
         return ca[28];
      case 12:
         if (var1) {
            return (short)((ca[20] & -65536) >> 16);
         }

         return (short)(ca[20] & '\uffff');
      case 13:
         if (var1) {
            return (short)((ca[21] & -65536) >> 16);
         }

         return (short)(ca[21] & '\uffff');
      case 14:
         if (var1) {
            return (short)((ca[22] & -65536) >> 16);
         }

         return (short)(ca[22] & '\uffff');
      case 15:
         if (var1) {
            return (short)((ca[23] & -65536) >> 16);
         }

         return (short)(ca[23] & '\uffff');
      case 16:
         return ca[51];
      case 17:
         if (var1) {
            return (short)((ca[25] & -65536) >> 16);
         }

         return (short)(ca[25] & '\uffff');
      case 18:
         return (short)(ca[24] & '\uffff');
      case 19:
         return ca[29];
      case 20:
      default:
         return 0;
      case 21:
         return ca[46];
      case 22:
         return ca[16];
      case 23:
         return ca[48];
      case 24:
         return ca[19];
      case 25:
         return ca[17];
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
            if (pA) {
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
         var0.fillRect(HG.va, HG.wa, HG.xa - 1, HG.ya);
      }

      var0.setColor(i[6]);
      var0.drawRect(var7, var5, var6, var11);
      var0.drawRect(var7 + 1, var5 + 1, var6 - 1, var11 - 1);
      var0.setColor(i[5]);
      var0.drawRect(var7, var5, var6 - 1, var11 - 1);
      if (var2) {
         var0.drawRect(HG.va, HG.wa, HG.xa - 1, HG.ya);
      }

      Font var13 = j[2];
      var11 = j[2].getHeight();
      int var9;
      if (var1) {
         var0.setFont(var13);
         var9 = var13.stringWidth("" + ca[46]);
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
         var0.drawString("" + ca[46], var8 + cc[1628] + 4 + 0, var9 + 0, 20);
      }

      var7 = cc[1639] / cc[1644];
      short var14 = cc[1640];
      var9 = (HG.wa - var5 - var7 >> 1) + 1;
      int var10;
      if (var2) {
         var10 = HG.ta - HG.wa;
         if (var10 < 0) {
            B((f >> 1) - var7, HG.wa + HG.ya + 2, 149, 0, var0);
         }

         if (var10 > HG.ya - HG.ua) {
            B(f >> 1, HG.wa + HG.ya + 2, 149, 1, var0);
         }

         if (HG.ma) {
            B(HG.va, var5 + var9, 160, 1, var0);
            B(HG.va + HG.xa - var14, var5 + var9, 160, 0, var0);
         }

         if (HG.ma) {
            var9 = HG.va + var7 + 2;
         } else {
            var9 = HG.va + 2;
         }

         A(2, var9, var5 + 1, f - 2 * var9, var11 + 6, 540);
         A((String)HG.la, 2, 2, var0);
      }

      if (var4 == 126 && HG.iA && !id && (HG.jA == 19 || HG.jA == 20)) {
         var0.setClip(0, 0, f, g);
         var0.setColor(i[5]);
         var10 = f - dc[138][3] - dc[126][3] + 2 + 30;
         var9 = g - dc[146][4] - dc[139][4] + 2;
         var0.drawRect(var10 - 2, var9 - 1, 7, 34);
         B((Graphics)var0, 30);
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
      short var6 = (short)(ca[53] & '\uffff');
      short var5 = (short)((ca[53] & -65536) >> 16);
      boolean var4 = false;
      boolean var3 = false;

      int[] var10000;
      for(int var2 = 0; var2 < 15; ++var2) {
         if (da[2][var2][4] >= 0) {
            int[] var7 = A(da[2][var2]);
            int var1 = 0;
            int var8;
            if (var7[6] == 26) {
               var1 = da[2][var2][6] - var6;
               if (var1 < 0) {
                  var8 = var6 + var1;
                  var10000 = ca;
                  var10000[53] &= -65536;
                  var10000 = ca;
                  var10000[53] |= (short)var8 & '\uffff';
               }

               var6 = 0;
               var3 = true;
            } else if (var7[6] == 27) {
               var1 = da[2][var2][6] - var5;
               if (var1 < 0) {
                  var8 = var5 + var1;
                  var10000 = ca;
                  var10000[53] &= 65535;
                  var10000 = ca;
                  var10000[53] |= (short)var8 << 16 & -65536;
               }

               var5 = 0;
               var4 = true;
            }

            if (var1 > 0) {
               var8 = (short)da[2][var2][4] & '\uffff' | 131072;
               I(var8, var1);
            }
         }
      }

      if (!var4) {
         var10000 = ca;
         var10000[53] &= 65535;
         var10000 = ca;
         var10000[53] |= 0;
      }

      if (!var3) {
         var10000 = ca;
         var10000[53] &= -65536;
         var10000 = ca;
         var10000[53] |= 0;
      }

   }

   public static void AA() {
      int var0;
      for(var0 = 0; var0 < ca.length; ++var0) {
         ca[var0] = -1;
      }

      ca[4] = 2048;
      ca[5] = 2048;
      ca[12] = 3276850;
      ca[13] = 1310740;
      ca[16] = 1024;
      ca[30] = 2;
      ca[14] = 1310740;
      ca[15] = 983055;
      ca[27] = 0;
      ca[28] = 0;
      ca[27] = 0;
      ca[17] = 0;
      ca[19] = 0;
      ca[20] = 327685;
      ca[21] = 327685;
      ca[22] = 327685;
      ca[23] = 327685;
      ca[24] = 0;
      ca[25] = 327685;
      ca[26] = 327685;
      ca[46] = 50;
      ca[40] = 0;
      ca[47] = 0;
      ca[48] = 0;
      ca[49] = 0;
      ca[50] = 0;
      ca[51] = 0;
      ca[53] = 0;
      ca[54] = 1310770;
      ca[41] = -1;
      ca[42] = -1;
      ca[43] = -1;
      ca[44] = -1;
      ca[45] = -1;
      ca[18] = 1;
      ca[11] = 13;
      ca[39] = 0;

      for(int var2 = 0; var2 < da.length; ++var2) {
         for(int var1 = 0; var1 < da[var2].length; ++var1) {
            for(var0 = 0; var0 < da[var2][var1].length; ++var0) {
               da[var2][var1][var0] = -1;
            }
         }
      }

   }

   public static int J(int var0) {
      return var0 >= 30 ? -1 : var0 * var0 * 60;
   }

   public static boolean K(int var0) {
      if (ca[46] + var0 < 0) {
         return false;
      } else {
         int[] var10000 = ca;
         var10000[46] += var0;
         return true;
      }
   }

   public static int[] BA() {
      int var0 = ca[42];
      return var0 != -1 && da[0][var0][4] != -1 ? da[0][var0] : null;
   }

   public static void J(int var0, int var1) {
      ca[4] = (var0 << 12) + 2048;
      ca[5] = (var1 << 12) + 2048;
      if (B.h >= 0) {
         ca[30] = B.h;
         B.h = -1;
      }

      gB = -1;
      iB = -1;
      lB = -1;
      kB = true;
      D((int[])ca, 0);
      E(ca, 0);
      F(ca, 0);

      int var2;
      for(var2 = 0; var2 < O(ca); ++var2) {
         B(ca, var2, 0);
      }

      for(var2 = 0; var2 < P(ca); ++var2) {
         C(ca, var2, 0);
      }

      for(var2 = 0; var2 < Q(ca); ++var2) {
         D(ca, var2, 0);
      }

      N(ca, 0);
      B.A(ca, var0, var1);
   }

   public static void CA() {
      int var2 = 0;
      int var0 = Z(BA());
      int var1 = ca[42];
      byte var3;
      switch(var0) {
      case 0:
         var3 = oc[0][1];
         var2 = A(da[0][var1])[16];
         break;
      case 1:
         var2 = A(da[0][var1])[16];
         var1 = J(ca);
         var0 = 0;
         if (oc[0][2] < qc[var1].length) {
            var0 = qc[var1][oc[0][2]].length;
         }

         if (var2 > var0) {
            var3 = oc[0][1];
         } else {
            var3 = oc[0][2];
         }
         break;
      case 2:
         var3 = oc[0][3];
         var2 = A(da[0][var1])[16];
         break;
      case 3:
         var3 = oc[0][4];
         var2 = A(da[0][var1])[16];
         break;
      case 4:
         var3 = oc[0][5];
         break;
      default:
         var3 = oc[0][0];
      }

      if (ca[45] != -1) {
         var3 = oc[0][5];
         var2 = 0;
      }

      if (var3 < 0 || var3 >= K(ca)) {
         var3 = 0;
      }

      if (var2 < 0 || var2 >= M(ca)) {
         var2 = 0;
      }

      if (L(ca) != var3) {
         E(ca, var3);
      }

      if (N(ca) != var2) {
         F(ca, var2);
      }

   }

   public static boolean DA() {
      if (ca[45] != -1 && da[4][ca[45]][4] != -1) {
         int[] var0 = va[da[4][ca[45]][4]];
         if (var0[6] == 0) {
            return false;
         }
      }

      return true;
   }

   public static int EA() {
      int var4 = -1;
      int var3 = -1;

      for(int var2 = 0; var2 < ea.length; ++var2) {
         if (L(var2) && M(var2)) {
            int var1 = (ea[var2][4] - ca[4]) * B.d >> 12;
            int var0 = (ea[var2][5] - ca[5]) * B.d >> 12;
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
      if (ea.length == 0) {
         gB = -1;
      } else {
         int var1;
         if (gB == -1) {
            var1 = 0;
         } else {
            var1 = gB + 1;
         }

         gB = -1;

         for(int var0 = 0; var0 < ea.length; ++var0) {
            if (var1 == ea.length) {
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
      if (var0 >= 0 && var0 < ea.length) {
         if (ea[var0][11] == -1) {
            return false;
         } else if ((ea[var0][13] & 2) == 0 && (ea[var0][3] & 65536) == 0 && !N(var0)) {
            int var1 = (ea[var0][4] * B.d >> 12) - tB;
            var0 = (ea[var0][5] * B.d >> 12) - uB;
            return var1 >= 0 && var1 <= f && var0 >= 0 && var0 <= g;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean M(int var0) {
      if (var0 >= 0 && var0 <= ea.length) {
         int var2 = V(BA());
         if (ca[45] != -1 && da[4][ca[45]][4] != -1) {
            int[] var1 = va[da[4][ca[45]][4]];
            if (var1[6] > 0) {
               var2 = var1[7] * 4096 / 10;
            }
         }

         boolean var3;
         if (B.A(ca, ea[var0], var2) && B.F(ca, ea[var0])) {
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
      int[][] var3 = da[var0];
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
                     var6 = (short)(ca[53] & '\uffff');
                     var0 = var6 + var1[6];
                     var10000 = ca;
                     var10000[53] &= -65536;
                     var10000 = ca;
                     var10000[53] |= (short)var0 & '\uffff';
                  } else if (var1[4] == 2) {
                     var6 = (short)((ca[53] & -65536) >> 16);
                     var0 = var6 + var1[6];
                     var10000 = ca;
                     var10000[53] &= 65535;
                     var10000 = ca;
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
                     var7 = (short)(ca[53] & '\uffff');
                     var2 = var7 + var1[6];
                     var10000 = ca;
                     var10000[53] &= -65536;
                     var10000 = ca;
                     var10000[53] |= (short)var2 & '\uffff';
                  } else if (var1[4] == 2) {
                     var7 = (short)((ca[53] & -65536) >> 16);
                     var2 = var7 + var1[6];
                     var10000 = ca;
                     var10000[53] &= 65535;
                     var10000 = ca;
                     var10000[53] |= (short)var2 << 16 & -65536;
                  }
               }

               for(int var4 = 0; var4 < 8; ++var4) {
                  short var8 = (short)(ca[31 + var4] & '\uffff');
                  var7 = (short)((ca[31 + var4] & -65536) >> 16);
                  if ((ca[39] & 1 << var4) == 0 && var8 == var0 && var7 == var1[4]) {
                     var10000 = ca;
                     var10000[31 + var4] &= 65535;
                     var10000 = ca;
                     var10000[31 + var4] |= (short)var5 << 16 & -65536;
                     var10000 = ca;
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
      if (ca[11] != 0) {
         return false;
      } else if ((short)(B.f & '\uffff') == 1 && (short)((B.f & -65536) >> 16) == 2) {
         if (HG.A((int)10) != 0) {
            return false;
         } else {
            short var6 = (short)(ca[0] & '\uffff');
            short var5 = (short)((ca[0] & -65536) >> 16);
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
                  switch(ca[30]) {
                  case 0:
                  case 1:
                  case 2:
                  case 3:
                  default:
                     var8 = 1;
                  }
               }
            }

            switch(ca[30]) {
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

            B.M();
            String var10 = HG.I(432);

            String var11;
            for(var4 = 0; var4 < B.xA; ++var4) {
               var11 = "";
               switch(B.yA[var4]) {
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
               if (var4 + 1 < B.xA) {
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
      if (ca[11] == 0) {
         eB = false;
      }

      int var0;
      int[] var10000;
      if ((short)(ca[12] & '\uffff') <= 0) {
         N(ca, 16);
         if ((ca[3] & 8388608) == 0) {
            A(17, 0, 0, 0, 0, true);
            HG.M(30);
            if (HG.MA(3)) {
               Display.getDisplay(a).vibrate(1000);
            }

            var10000 = ca;
            var10000[3] |= 8388608;
            var10000 = ca;
            var10000[3] |= 32768;
            A(ca, true);
            gB = -1;
            tb = -1;
            ub = -1;
            vb = -1;
            db = false;
            eb = false;
            sD = false;

            for(var0 = 0; var0 < qD.length; ++var0) {
               if ((byte)(qD[var0][6] >> 16 & 255) == 0) {
                  qD[var0][6] = -1;
               }
            }

            for(var0 = 0; var0 < eC.length; ++var0) {
               eC[var0][0] = 0;
            }

            if (HG.iA) {
               HG.DA(11);
            }

            H(gB);
         }

         if (C(ca, false) && eB) {
            if (!HA(2) && !HA(3)) {
               D(390, 382, 1, 34);
            } else {
               byte var9 = 30;
               short var11 = 312;
               if (tE >= 0L && uE >= 0L) {
                  if (tE > uE) {
                     var9 = 39;
                     var11 = 313;
                  }
               } else if (tE >= 0L) {
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
         if (o % 20 == 0 && !sD) {
            var0 = (short)((ca[13] & -65536) >> 16) * 3 / 100;
            if (var0 == 0) {
               var0 = 1;
            }

            A(1, var0, true, false, ca);
         }

         var0 = J(ca[18]);
         if (var0 >= 0 && var0 <= ca[17]) {
            int var10002 = ca[18]++;
            HG.M(7);
            N(ca[4], ca[5], (short)(ca[2] & '\uffff'));
            A(24, 10, true, false, ca);
            A(2, 10, true, false, ca);
         }

         if (G(ca) == 8 || G(ca) == 9 || G(ca) == 10 || G(ca) == 11) {
            if (!C(ca, true)) {
               var4 = true;
            } else if (ca[45] == -1) {
               int[] var6 = BA();
               if (iB != -1 && jB) {
                  lB = A(ca, ea[iB], var6);
               } else {
                  lB = 10;
               }

               iB = -1;
               jB = false;
               H(gB);
            }
         }

         int var1;
         if (!var4 && !sD) {
            int var3;
            if (!cB && !dB || !aB && !bB) {
               var3 = ca[52];
            } else {
               var3 = F(ca[52] * ca[52] >> 1);
            }

            int var2 = ca[4];
            var1 = ca[5];
            if (cB) {
               var1 -= var3;
               ca[30] = 0;
               var5 = true;
            }

            if (dB) {
               var1 += var3;
               ca[30] = 2;
               var5 = true;
            }

            if (aB) {
               var2 -= var3;
               ca[30] = 3;
               var5 = true;
            }

            if (bB) {
               var2 += var3;
               ca[30] = 1;
               var5 = true;
            }

            if (var5) {
               --mB;
               if (mB == 2 && (short)(B.f & '\uffff') == 0) {
                  F(ca, true);
               }

               if (mB <= 0) {
                  mB = 4;
                  if ((short)(B.f & '\uffff') == 0) {
                     F(ca, false);
                  }
               }

               var0 = ca[0];
               var1 = B.A(ca, var2, var1, 4128);
               if (var1 == -2) {
                  var10000 = ca;
                  var10000[52] += ca[16] >> 3;
                  if (ca[52] > ca[16]) {
                     ca[52] = ca[16];
                  }
               } else {
                  ca[52] = ca[16] >> 1;
               }

               if (ca[0] != var0) {
                  boolean var8 = A(8, (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16), (short)(var0 & '\uffff'), (short)((var0 & -65536) >> 16), false);
                  boolean var10 = A(13, (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16), (short)(var0 & '\uffff'), (short)((var0 & -65536) >> 16), false);
                  boolean var7 = ca[11] == 0 && A(18, (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16), 0, 0, false);
                  if (!var7) {
                     zD = -1;
                  }

                  if (!var8 && !var10 && !var7 && GA()) {
                     return;
                  }
               }
            } else {
               ca[52] = ca[16] >> 1;
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
            if (var0 == 3 && (short)((ca[53] & -65536) >> 16) <= 0) {
               hB = false;
            } else if (var0 == 2 && (short)(ca[53] & '\uffff') <= 0) {
               hB = false;
            }
         } else {
            gB = -1;
            hB = false;
            H(gB);
         }

         --lB;
         if (ca[45] == -1) {
            sD = false;
         }

         if (eB && lB < 0) {
            if (ca[45] >= 0) {
               DA(ca[45]);
               N(ca, 12 + ca[30]);
            } else if (gB != -1) {
               if (hB) {
                  var1 = ea[gB][4] - ca[4];
                  var0 = ea[gB][5] - ca[5];
                  ca[30] = N(var1, var0);
                  N(ca, 8 + ca[30]);
                  iB = gB;
                  jB = hB;
                  lB = Integer.MAX_VALUE;
               }
            } else {
               N(ca, 8 + ca[30]);
               iB = -1;
               jB = false;
               lB = Integer.MAX_VALUE;
            }

            var4 = true;
         }

         if (!var4) {
            if (!sD) {
               if (var5) {
                  N(ca, 4 + ca[30]);
               } else {
                  N(ca, 0 + ca[30]);
               }
            }

            C(ca, true);
         }

         CA();
         F((short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
         cB = false;
         dB = false;
         aB = false;
         bB = false;
         eB = false;
         fB = false;
      }
   }

   public static void IA() {
      tB = (ca[4] * B.d >> 12) - (f >> 1);
      uB = (ca[5] * B.d >> 12) - (g >> 1);
      JA();
   }

   public static void JA() {
      boolean var2 = true;
      if (gB != -1) {
         int var1 = ca[4] - ea[gB][4];
         int var0 = ca[5] - ea[gB][5];
         if (E(var1) * 4 / 3 < (f << 12) / B.d && E(var0) * 4 / 3 < (g << 12) / B.d) {
            var2 = false;
            var1 = ca[4] + ea[gB][4] >> 1;
            var0 = ca[5] + ea[gB][5] >> 1;
            vB = (var1 * B.d >> 12) - (f >> 1);
            wB = (var0 * B.d >> 12) - (g >> 1);
         }
      }

      if (var2) {
         vB = (ca[4] * B.d >> 12) - (f >> 1);
         wB = (ca[5] * B.d >> 12) - (g >> 1);
         switch(ca[30]) {
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
      if (ca[11] != 0) {
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

         if (uB < -(0 * B.e) - yD) {
            uB = -(0 * B.e) - yD;
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
      for(int var15 = 0; var15 < ea.length; ++var15) {
         int[] var14 = ea[var15];
         int[] var13 = fa[var14[11]];
         int var12 = ea[var15][13];
         if ((ea[var15][3] & 65536) == 0 && !P(var15)) {
            boolean var11 = N(var15);
            boolean var10 = (var12 & 128) != 0;
            boolean var9 = (var12 & 8) != 0;
            boolean var8 = (short)(ea[var15][20] & '\uffff') >= 0;
            boolean var7 = ea[var15][22] >= 0 || (var12 & 64) != 0;
            boolean var10000;
            if ((var12 & 16) != 0) {
               var10000 = true;
            } else {
               var10000 = false;
            }

            boolean var6 = ((var13[13] & 1) != 0 || (var13[13] & 2) != 0 || (var13[13] & 4) != 0) && var13[27] == 0;
            boolean var5 = (short)((ea[var15][12] & -65536) >> 16) > 0 && (short)(ea[var15][12] & '\uffff') * 100 / (short)((ea[var15][12] & -65536) >> 16) < 50;
            boolean var4 = (short)((ea[var15][12] & -65536) >> 16) > 0 && (short)(ea[var15][12] & '\uffff') * 100 / (short)((ea[var15][12] & -65536) >> 16) < 20;
            boolean var3 = false;
            boolean var2 = (var13[13] & 128) != 0;
            int var10002;
            if (ea[var15][21] >= 0) {
               var10002 = ea[var15][21]--;
            }

            short var1 = (short)((ea[var15][26] & -65536) >> 16);
            int var0 = (short)(ea[var15][26] & '\uffff');
            int var16;
            if (var1 >= 0 && var8) {
               var16 = var1 - 1;
               if (var16 < 0) {
                  var16 = 20;
                  ++var0;
               }

               ea[var15][26] = (short)var0 & '\uffff' | (short)var16 << 16 & -65536;
            }

            int[] var30;
            if (var10) {
               if (ea[var15][25] <= 0) {
                  var30 = ea[var15];
                  var30[13] &= -129;
                  var1 = (short)(ea[var15][20] & '\uffff');
                  if (var1 >= 0) {
                     B.a[var1][20] = -1;
                     B.a[var1][22] = -1;
                     ea[var15][20] = -1;
                     ea[var15][22] = -1;
                     continue;
                  }
               }

               var10002 = ea[var15][25]--;
            }

            if ((var12 & 512) != 0 && (bc || ea[var15][30] > 0)) {
               var10002 = ea[var15][30]--;
               if (bc || ea[var15][30] <= 0) {
                  var30 = ea[var15];
                  var30[13] &= -513;
                  ea[var15][20] = -1;
                  ea[var15][22] = -1;
                  ea[var15][30] = 0;
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
                        short var20 = (short)((ea[var15][17 + var19] & -65536) >> 16);
                        var1 = (short)(ea[var15][17 + var19] & '\uffff');
                        if (var1 == 2 && var20 >= 0) {
                           var17 = A(ka[var20]);
                           if (var17[6] == 0 && var17[3] > 0) {
                              A(var17[6], var17[3], true, false, ea[var15]);
                              ea[var15][17 + var19] = -1;
                              var5 = true;
                              H(gB);
                              L(ea[var15][4], ea[var15][5], (short)(ea[var15][2] & '\uffff'));
                              ea[var15][21] = 20;
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
                        var27 = V(ga[var14[14]]);
                        var21 = Z(ga[var14[14]]);
                        if (var21 == 0 || var21 == 1) {
                           var16 = var27 * var27;
                        }
                     }

                     if (var14[15] >= 0) {
                        var19 = V(ga[var14[15]]);
                        var21 = Z(ga[var14[15]]);
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
                        ea[var15][26] = 10;
                        if (Q(var15)) {
                           continue;
                        }

                        if (ea[var15][21] < 0) {
                           var0 = C(var15, var28, var3);
                           if (var0 != -1) {
                              var0 = B.a[var28][4] - ea[var15][4];
                              var16 = B.a[var28][5] - ea[var15][5];
                              var0 = N(var0, var16);
                              ea[var15][27] = (short)var0 & '\uffff' | (short)var0 << 16 & -65536;
                              N(ea[var15], 8 + var0);
                              var30 = ea[var15];
                              var30[13] |= 16;
                              if (var2) {
                                 D(var15, true);
                              }

                              T(var15);
                              var30 = ea[var15];
                              var30[13] &= -65;
                              ea[var15][22] = -1;
                              continue;
                           }
                        } else {
                           N(ea[var15], 0 + (short)(ea[var15][27] & '\uffff'));
                           var7 = false;
                           var23 = true;
                        }
                     }

                     if (!var23) {
                        var0 = var13[11] * 4096;
                        if (B.A(ea[var15], B.a[var28], var0)) {
                           if ((var13[13] & 1) == 0 && (var13[13] & 2) == 0 && (ea[var15][13] & 128) == 0 && !var11 && ((short)(ea[var15][20] & '\uffff') != (short)((ea[var15][20] & -65536) >> 16) || ea[var15][20] == -1) && (short)(ea[var15][26] & '\uffff') < 3) {
                              if (var2) {
                                 D(var15, false);
                              }

                              if ((short)((ea[var15][26] & -65536) >> 16) == 20) {
                                 var0 = B.a[var28][4] - ea[var15][4];
                                 var16 = B.a[var28][5] - ea[var15][5];
                                 var0 = N(var0, var16);
                                 ea[var15][27] = (short)var0 & '\uffff' | (short)var0 << 16 & -65536;
                                 N(ea[var15], 12 + (short)(ea[var15][27] & '\uffff'));
                              }

                              if (C(ea[var15], true)) {
                                 N(ea[var15], 0 + (short)(ea[var15][27] & '\uffff'));
                              }
                              continue;
                           }

                           if (!var7) {
                              ea[var15][22] = F(B.a[var28]);
                              var7 = true;
                           }
                        } else if ((var13[13] & 1) == 0 && (var13[13] & 2) == 0 && (short)(ea[var15][26] & '\uffff') <= 3) {
                           if ((ea[var15][13] & '耀') == 0) {
                              var30 = ea[var15];
                              var30[20] &= -65536;
                              var30 = ea[var15];
                              var30[20] |= 65535;
                              ea[var15][22] = ea[var15][23];
                              ea[var15][26] = 1376256;
                           }
                        } else if (ea[var15][22] == -1) {
                           ea[var15][22] = F(B.a[var28]);
                           var30 = ea[var15];
                           var30[13] &= -65;
                           var30 = ea[var15];
                           var30[13] &= -513;
                        } else {
                           xB[0] = ea[var15][4];
                           xB[1] = ea[var15][5];
                           long var18 = (long)var0;
                           if ((var13[13] & 1) == 0 && (ea[var15][13] & '耀') == 0) {
                              if ((var13[13] & 2) != 0) {
                                 var18 *= 4L;
                              } else if ((var13[13] & 4) != 0) {
                                 var18 *= 3L;
                              } else if ((var13[13] & 8) != 0) {
                                 var18 *= 2L;
                              }

                              yB[0] = ((short)(ea[var15][23] & '\uffff') << 11) + 2048;
                              yB[1] = ((short)((ea[var15][23] & -65536) >> 16) << 11) + 2048;
                              if (A(xB, yB) > var18 * var18 || (ea[var15][13] & 16384) != 0) {
                                 if ((ea[var15][13] & 64) != 0) {
                                    var30 = ea[var15];
                                    var30[13] &= -65;
                                    T(var15);
                                 }

                                 var30 = ea[var15];
                                 var30[13] |= 16384;
                                 if (F(ea[var15]) != ea[var15][23]) {
                                    ea[var15][22] = ea[var15][23];
                                    var7 = true;
                                 }

                                 var30 = ea[var15];
                                 var30[20] &= -65536;
                                 var30 = ea[var15];
                                 var30[20] |= 65535;
                                 var30 = ea[var15];
                                 var30[20] &= 65535;
                                 var30 = ea[var15];
                                 var30[20] |= (short)var28 << 16 & -65536;
                              }
                           }
                        }
                     }
                  } else if ((fa[ea[var15][11]][13] & 8) == 0) {
                     if ((ea[var15][13] & 131072) == 0) {
                        C(var15, var6);
                     }
                  } else {
                     var30 = ea[var15];
                     var30[20] &= -65536;
                     var30 = ea[var15];
                     var30[20] |= 65535;
                  }
               }

               if (var7 && (ea[var15][13] & 512) == 0) {
                  if ((ea[var15][13] & 16384) == 0 && o % ea.length == var15) {
                     var0 = ea[var15][29];
                     short var25 = (short)(var14[20] & '\uffff');
                     if (var25 >= 0) {
                        xB[0] = ((short)(ea[var15][0] & '\uffff') << 12) + 2048;
                        xB[1] = ((short)((ea[var15][0] & -65536) >> 16) << 12) + 2048;
                        yB[0] = ((short)(B.a[var25][0] & '\uffff') << 12) + 2048;
                        yB[1] = ((short)((B.a[var25][0] & -65536) >> 16) << 12) + 2048;
                        long var29 = A(xB, yB);
                        yB[0] = ((short)(ea[var15][22] & '\uffff') / 2 << 12) + 2048;
                        yB[1] = ((short)((ea[var15][22] & -65536) >> 16) / 2 << 12) + 2048;
                        long var24 = A(xB, yB);
                        xB[0] = ((short)(B.a[var25][0] & '\uffff') << 12) + 2048;
                        xB[1] = ((short)((B.a[var25][0] & -65536) >> 16) << 12) + 2048;
                        long var26 = A(xB, yB) - (long)(var0 * var0);
                        if (var29 < var24 + var26 && var26 > (long)(var0 * var0) || F(ea[var15]) == ea[var15][22]) {
                           ea[var15][22] = F(B.a[var25]);
                           var30 = ea[var15];
                           var30[13] &= -65;
                           var30 = ea[var15];
                           var30[13] &= -513;
                           T(var15);
                           var7 = true;
                        }
                     }
                  }

                  O(var15);
               }

               if (!var8) {
                  if ((fa[ea[var15][11]][13] & 8) == 0 && (ea[var15][13] & 131072) == 0) {
                     C(var15, var6);
                  }

                  if (!var7 && (short)(ea[var15][20] & '\uffff') == -1) {
                     N(ea[var15], 0 + (short)(ea[var15][27] & '\uffff'));
                     var30 = ea[var15];
                     var30[13] &= -16385;
                     if (var13[27] == 0 || var13[27] == 9) {
                        var10002 = ea[var15][31]--;
                        if (ea[var15][31] <= 0) {
                           ea[var15][31] = HG.A((int)20, (int)50);
                           var0 = F(ea[var15]);
                           var16 = (short)(var0 & '\uffff') + HG.A((int)-5, (int)5);
                           var0 = (short)((var0 & -65536) >> 16) + HG.A((int)-5, (int)5);
                           if (A(var15, 0, var16, var0, true, false)) {
                              ea[var15][22] = (short)var16 & '\uffff' | (short)var0 << 16 & -65536;
                           }
                        }
                     }
                  }
               }

               C(ea[var15], true);
            }
         }
      }

      bc = false;
   }

   static void LA() {
      nA = 0;
      int var7 = 0;

      for(int var6 = 0; var6 < ea.length; ++var6) {
         ea[var6][21] = -1;
         ea[var6][20] = -1;
         ea[var6][16] = -1;
         ea[var6][22] = -1;
         ea[var6][26] = 1376256;
         ea[var6][31] = HG.A((int)20, (int)50);
         ea[var6][29] = fa[ea[var6][11]][29];
         ea[var6][23] = F(ea[var6]);
         short var2 = (short)(ea[var6][12] & '\uffff');
         int var0;
         int var1;
         if (ca[11] >= 0) {
            var1 = 0;

            for(var0 = 0; var0 < 2; ++var0) {
               if ((short)(ea[var6][17 + var0] & '\uffff') == 5) {
                  if ((bA[ca[11]] & 1 << B.j + var7) == 0) {
                     ++var1;
                  }

                  ++var7;
               }
            }

            if (var1 == 0 && var2 < 0) {
               int[] var10000 = ea[var6];
               var10000[3] |= 65536;
               if ((ea[var6][3] & 2) != 0) {
                  B.D(ea[var6]);
               }

               ea[var6][0] = -1;
               var10000 = cA;
               int var10001 = ca[11];
               var10000[var10001] |= 1 << var6;
            }
         }

         if (ca[11] == -1 || (cA[ca[11]] & 1 << var6) == 0) {
            if ((ea[var6][3] & 65536) == 0 && !N(var6) && var2 > 0) {
               ++nA;
            }

            int var5 = ea[var6][11];
            short var8 = (short)(fa[var5][1] & '\uffff');
            short var4 = (short)((fa[var5][1] & -65536) >> 16);
            byte var3 = (byte)(fa[var5][4] & 255);
            byte var10 = (byte)(fa[var5][4] >> 8 & 255);
            var1 = (byte)(fa[var5][4] >> 16 & 255);
            D(ea[var6], 1 + var8 - 134);
            E(ea[var6], oc[0][0]);
            F(ea[var6], 0);
            var0 = O(ea[var6]);
            if (O(ea[var6]) > 0) {
               B(ea[var6], 0, var4);
            }

            if (fa[var5][4] != -1) {
               if (var0 >= 1) {
                  B(ea[var6], 1, var3);
               }

               if (var1 < 0) {
                  var1 = var1 * -1 - 1;
                  if (Q(ea[var6]) > 0) {
                     D(ea[var6], 0, 1);
                  }
               } else if (var0 >= 2) {
                  B(ea[var6], 2, var10);
               }

               if (J(ea[var6], 0) > 0) {
                  C(ea[var6], 0, var1);
               }
            }

            if (fa[ea[var6][11]][27] != 7 && fa[ea[var6][11]][27] != 8) {
               B.G(var6);
            }

            var0 = ea[var6][14];
            if (var0 >= 0) {
               ea[var6][29] = V(ga[var0]);
               int[] var9 = A(ga[var0]);
               C(var6, var9);
            }

            N(ea[var6], 0 + (short)(ea[var6][27] & '\uffff'));
         }
      }

   }

   static boolean N(int var0) {
      int var1 = fa[ea[var0][11]][27];
      return ea[var0][11] >= 0 && (var1 == 6 || var1 == 7 || var1 == 8 || var1 == 9);
   }

   static void C(int var0, int[] var1) {
      if (var1 != null) {
         int var4 = J(ea[var0]);
         byte var3 = oc[var4][0];
         switch(var1[15]) {
         case 0:
            var3 = oc[var4][1];
            break;
         case 1:
            int var2 = 0;
            if (oc[var4][2] < qc[var4].length) {
               var2 = qc[var4][oc[var4][2]].length;
            }

            if (var1[16] > var2) {
               var3 = oc[var4][1];
            } else {
               var3 = oc[var4][2];
            }
            break;
         case 2:
            var3 = oc[var4][3];
            break;
         case 3:
            var3 = oc[var4][4];
         }

         int var5 = var1[16];
         if (var3 >= K(ea[var0])) {
            var3 = 0;
         }

         E(ea[var0], var3);
         if (var5 >= M(ea[var0])) {
            var5 = 0;
         }

         F(ea[var0], var5);
      }
   }

   static boolean D(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         return (ea[var0][13] & 128) == 0 && (short)(ca[12] & '\uffff') > 0;
      } else if ((var1[3] & 32) != 0) {
         if ((var1[13] & 2) == 0 && (var1[3] & 65536) == 0) {
            return (ea[var0][13] & 128) == 0 || (var1[13] & 128) == 0;
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
      int[] var5 = fa[ea[var0][11]];
      long var3 = (long)(var5[11] * 4096);
      short var2 = -1;
      xB[0] = ea[var0][4];
      xB[1] = ea[var0][5];
      long var6;
      if ((ea[var0][13] & 128) == 0 && !N(var0)) {
         yB[0] = ca[4];
         yB[1] = ca[5];
         var6 = A(xB, yB);
         if (var6 <= var3 * var3 && (short)(ca[12] & '\uffff') > 0) {
            ea[var0][22] = F(ca);
            var2 = (short)(ca[2] & '\uffff');
         }
      }

      int var8;
      if (var1 && (ea[var0][13] & 128) == 0) {
         for(var8 = 0; var8 < ea.length; ++var8) {
            if (var8 != var0 && ((fa[ea[var8][11]][13] & 8) != 0 || N(var8)) && ((short)(fa[ea[var8][11]][1] & '\uffff') != (short)(var5[1] & '\uffff') || (ea[var0][13] & 128) != 0)) {
               yB[0] = ea[var8][4];
               yB[1] = ea[var8][5];
               var6 = A(xB, yB);
               if (var6 <= var3 * var3 && D(var0, ea[var8])) {
                  ea[var0][22] = F(ea[var8]);
                  var2 = (short)(ea[var8][2] & '\uffff');
                  break;
               }
            }
         }
      } else if (N(var0) || (ea[var0][13] & 128) != 0) {
         for(var8 = 0; var8 < ea.length; ++var8) {
            if (var8 != var0 && !N(var8)) {
               yB[0] = ea[var8][4];
               yB[1] = ea[var8][5];
               long var9 = A(xB, yB);
               if (var9 <= var3 * var3 && D(var0, ea[var8])) {
                  ea[var0][22] = F(ea[var8]);
                  var2 = (short)(ea[var8][2] & '\uffff');
                  break;
               }
            }
         }
      }

      int[] var10000;
      if (var2 >= 0) {
         var10000 = ea[var0];
         var10000[13] &= -513;
         var10000 = ea[var0];
         var10000[20] &= -65536;
         var10000 = ea[var0];
         var10000[20] |= (short)var2 & '\uffff';
      } else {
         var10000 = ea[var0];
         var10000[20] &= -65536;
         var10000 = ea[var0];
         var10000[20] |= 65535;
         var10000 = ea[var0];
         var10000[13] &= -32769;
      }

      if (var2 != (short)((ea[var0][20] & -65536) >> 16)) {
         var8 = ea[var0][14];
         if (var8 >= 0) {
            ea[var0][29] = V(ga[var8]);
         }

         ea[var0][26] = 1376256;
         var10000 = ea[var0];
         var10000[13] &= -32769;
      }

   }

   static void O(int var0) {
      int var2 = ((short)(ea[var0][22] & '\uffff') << 11) + 2048;
      int var1 = ((short)((ea[var0][22] & -65536) >> 16) << 11) + 2048;
      int[] var6 = A(ea[var0]);
      if ((ea[var0][13] & 64) != 0) {
         var1 = ea[var0][24];
         var2 = (short)(xa[var0][var1] & '\uffff') << 11;
         var1 = (short)((xa[var0][var1] & -65536) >> 16) << 11;
         var2 -= (short)(var6[2] & '\uffff');
         var1 -= (short)((var6[2] & -65536) >> 16);
      }

      int var5 = ea[var0][4];
      int var4 = ea[var0][5];
      int var3 = var2;
      var2 = var1;
      if ((ea[var0][13] & 64) == 0) {
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
         B.A(ea[var0], var3, var2, 0);
         if ((ea[var0][13] & 64) != 0) {
            var2 = (short)(ea[var0][0] & '\uffff') * 2;
            var3 = (short)((ea[var0][0] & -65536) >> 16) * 2;
            var1 = var2 + ((short)(var6[3] & '\uffff') - (short)(var6[2] & '\uffff') >> 11);
            var5 = var3 + ((short)((var6[3] & -65536) >> 16) - (short)((var6[2] & -65536) >> 16) >> 11);

            for(var4 = var3; var4 <= var5; ++var4) {
               for(var3 = var2; var3 <= var1; ++var3) {
                  if (B(0, B.c * 2, var4) && B(0, B.b * 2, var3) && (byte)(wa[var4 * B.b * 2 * 3 + var3 * 3 + 2] >> 16 & 255) == var0) {
                     var10000 = wa;
                     int var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                     var10000[var10001] &= 65535;
                     var10000 = wa;
                     var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                     var10000[var10001] |= -65536;
                  }
               }
            }

            int var10002 = ea[var0][24]++;
            if (ea[var0][24] >= xa[var0].length) {
               ea[var0][22] = -1;
               var10000 = ea[var0];
               var10000[13] &= -65;
               T(var0);
               if ((ea[var0][13] & 65536) != 0) {
                  var10000 = ea[var0];
                  var10000[13] &= -65537;
                  var10000 = ea[var0];
                  var10000[13] &= -131073;
                  A(14, var0, (short)(ea[var0][0] & '\uffff'), (short)((ea[var0][0] & -65536) >> 16), 0, false);
               }
            } else {
               var8 = (short)(xa[var0][ea[var0][24]] & '\uffff');
               var7 = (short)((xa[var0][ea[var0][24]] & -65536) >> 16);
               A(ea[var0], true);
               if (!A(var0, 1, var8, var7, true, false)) {
                  ea[var0][22] = xa[var0][xa[var0].length - 1];
                  S(var0);
               }

               A(ea[var0], false);
            }
         } else {
            ea[var0][22] = -1;
            if ((ea[var0][13] & 65536) != 0) {
               var10000 = ea[var0];
               var10000[13] &= -65537;
               var10000 = ea[var0];
               var10000[13] &= -131073;
               A(14, var0, (short)(ea[var0][0] & '\uffff'), (short)((ea[var0][0] & -65536) >> 16), 0, false);
            }
         }
      } else {
         if ((ea[var0][3] & 2) != 0) {
            B.D(ea[var0]);
         }

         A(yB, var1, zB);
         var10000 = ea[var0];
         var10000[4] += zB[0];
         var10000 = ea[var0];
         var10000[5] += zB[1];
         var1 = F(ea[var0]);
         var8 = (short)(var1 & '\uffff');
         var7 = (short)((var1 & -65536) >> 16);
         ea[var0][0] = (short)(ea[var0][4] >> 12) & '\uffff' | (short)(ea[var0][5] >> 12) << 16 & -65536;
         if ((ea[var0][13] & 64) == 0 && !A(var0, 0, var8, var7, true, false)) {
            var10000 = ea[var0];
            var10000[4] -= zB[0];
            var10000 = ea[var0];
            var10000[5] -= zB[1];
            ea[var0][0] = (short)(ea[var0][4] >> 12) & '\uffff' | (short)(ea[var0][5] >> 12) << 16 & -65536;
            A(ea[var0], false);
            B.C(ea[var0]);
            N(ea[var0], 0 + (short)(ea[var0][27] & '\uffff'));
            S(var0);
            return;
         }

         B.C(ea[var0]);
         var1 = N(yB[0], yB[1]);
         if ((short)((ea[var0][27] & -65536) >> 16) == var1) {
            var10000 = ea[var0];
            var10000[27] &= -65536;
            var10000 = ea[var0];
            var10000[27] |= (short)var1 & '\uffff';
         }

         var10000 = ea[var0];
         var10000[27] &= 65535;
         var10000 = ea[var0];
         var10000[27] |= (short)var1 << 16 & -65536;
         var7 = (short)(ea[var0][27] & '\uffff');
         N(ea[var0], 4 + var7);
      }

   }

   static int C(int var0, int var1, boolean var2) {
      int[] var10000 = ea[var0];
      var10000[20] &= 65535;
      var10000 = ea[var0];
      var10000[20] |= (short)var1 << 16 & -65536;
      long var6 = A(xB, yB);
      int var10002;
      int var3;
      if (ea[var0][14] >= 0) {
         int var5 = ea[var0][14];
         var3 = V(ga[var5]);
         ea[var0][29] = var3;
         if (var6 <= (long)(var3 * var3)) {
            boolean var4 = true;
            var3 = Z(ga[var5]);
            if (var3 == 2 || var3 == 3) {
               if (B.F(ea[var0], B.a[var1]) && ea[var0][28] > 0 && !var2) {
                  var10002 = ea[var0][28]--;
               } else {
                  var4 = false;
               }
            }

            if (var4) {
               C(var0, A(ga[var5]));
               var10000 = ea[var0];
               var10000[13] &= -8193;
               return var3;
            }
         }
      }

      if (ea[var0][15] >= 0) {
         var3 = ea[var0][15];
         int var8 = V(ga[var3]);
         ea[var0][29] = var8;
         if (var6 <= (long)(var8 * var8)) {
            boolean var9 = true;
            var8 = Z(ga[var3]);
            if (var8 == 2 || var8 == 3) {
               if (B.F(ea[var0], B.a[var1]) && ea[var0][28] > 0 && !var2) {
                  var10002 = ea[var0][28]--;
               } else {
                  var9 = false;
               }
            }

            if (var9) {
               C(var0, A(ga[var3]));
               var10000 = ea[var0];
               var10000[13] |= 8192;
               return var8;
            }
         }
      }

      if (ea[var0][14] == -1 && ea[var0][15] == -1) {
         ea[var0][29] = fa[ea[var0][11]][29];
         return 5;
      } else {
         return -1;
      }
   }

   static boolean P(int var0) {
      if ((short)(ea[var0][12] & '\uffff') > 0) {
         return false;
      } else {
         N(ea[var0], 16);
         C(ea[var0], false);
         if ((ea[var0][13] & 2) == 0) {
            int[] var10000 = ea[var0];
            var10000[13] |= 2;
            var10000 = ea[var0];
            var10000[3] |= 32768;
            A(ea[var0], true);
            if (ca[11] >= 0) {
               var10000 = cA;
               int var10001 = ca[11];
               var10000[var10001] |= 1 << var0;
            }

            U(var0);
            HG.M(fa[ea[var0][11]][28]);
            if (!N(var0)) {
               --nA;
               if (nA <= 0) {
                  HG.L();
                  HG.M(oA);
                  A(15, 0, 0, 0, 0, false);
               }
            }

            A(4, var0, 0, 0, 0, false);
         }

         return true;
      }
   }

   static boolean Q(int var0) {
      if ((ea[var0][13] & 16) == 0) {
         return false;
      } else if (C(ea[var0], true)) {
         int[] var2 = null;
         int var1;
         if ((ea[var0][13] & 8192) == 0) {
            var1 = ea[var0][14];
         } else {
            var1 = ea[var0][15];
         }

         if (var1 >= 0) {
            var2 = ga[var1];
         }

         short var3 = (short)(ea[var0][20] & '\uffff');
         ea[var0][21] = A(ea[var0], B.a[var3], var2);
         int[] var10000 = ea[var0];
         var10000[13] &= -17;
         return false;
      } else {
         return true;
      }
   }

   static boolean R(int var0) {
      short var2 = (short)(ea[var0][20] & '\uffff');
      int var1 = ea[var0][29];
      int var16 = var1 >> 11;
      int var15 = var1 * var1;
      int var14 = -1;
      long var12 = -1L;
      if (var2 >= 0) {
         var1 = F(ea[var0]);
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
         ea[var0][22] = var14;
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
            var10000 = wa;
            var10001 = var2 * B.b * 2 * 3 + var1 * 3 + 1;
            var10000[var10001] &= 65535;
            var10000 = wa;
            var10001 = var2 * B.b * 2 * 3 + var1 * 3 + 1;
            var10000[var10001] |= 0;
         }
      }

      A(ea[var0], true);
      if ((short)(ea[var0][20] & '\uffff') == 0) {
         A(ca, true);
      }

      var1 = F(ea[var0]);
      int var17 = (short)(var1 & '\uffff');
      int var16 = (short)((var1 & -65536) >> 16);
      short var15 = (short)(ea[var0][22] & '\uffff');
      short var14 = (short)((ea[var0][22] & -65536) >> 16);
      if (!A(var0, 1, var15, var14, true, false)) {
         if ((short)(ea[var0][20] & '\uffff') < 0) {
            if ((ea[var0][13] & 65536) != 0) {
               var10000 = ea[var0];
               var10000[13] &= -65537;
               var10000 = ea[var0];
               var10000[13] &= -131073;
               A(14, var0, var15 / 2, var14 / 2, 0, false);
            }

            ea[var0][22] = -1;
            return false;
         }

         if (!R(var0)) {
            A(ea[var0], false);
            A(ca, false);
            ea[var0][22] = -1;
            ea[var0][20] = -1;
            return false;
         }

         var15 = (short)(ea[var0][22] & '\uffff');
         var14 = (short)((ea[var0][22] & -65536) >> 16);
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
         if ((ea[var0][13] & 65536) != 0) {
            var10000 = ea[var0];
            var10000[13] &= -65537;
            var10000 = ea[var0];
            var10000[13] &= -131073;
            A(14, var0, var15 / 2, var14 / 2, 0, false);
         }

         ea[var0][22] = -1;
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
                  if (A(var0, var1, var4, var3, true, true) && (short)((wa[var3 * B.b * 2 * 3 + var4 * 3 + 1] & -65536) >> 16) != 2) {
                     if (var6 != 0 && var5 != 0) {
                        var13 = (short)((wa[var16 * B.b * 2 * 3 + var17 * 3 + 0] & -65536) >> 16) + 7;
                     } else {
                        var13 = (short)((wa[var16 * B.b * 2 * 3 + var17 * 3 + 0] & -65536) >> 16) + 5;
                     }

                     if ((short)((wa[var3 * B.b * 2 * 3 + var4 * 3 + 1] & -65536) >> 16) != 1 || var13 <= (short)((wa[var3 * B.b * 2 * 3 + var4 * 3 + 0] & -65536) >> 16)) {
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
                  if ((short)((wa[var1 * B.b * 2 * 3 + var2 * 3 + 1] & -65536) >> 16) == 1 && (var18 > (short)(wa[var1 * B.b * 2 * 3 + var2 * 3 + 0] & '\uffff') || var18 < 0)) {
                     var18 = (short)(wa[var1 * B.b * 2 * 3 + var2 * 3 + 0] & '\uffff');
                     var17 = var2;
                     var16 = var1;
                  }
               }
            }

            if (var18 == -1 || var7 > 250) {
               var10000 = ea[var0];
               var10000[13] &= -257;
               var10000 = ea[var0];
               var10000[13] |= 512;
               ea[var0][30] = 20;
               A(ea[var0], false);
               A(ca, false);
               if ((ea[var0][13] & 65536) != 0) {
                  var10000 = ea[var0];
                  var10000[13] &= -65537;
                  var10000 = ea[var0];
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
         if (xa[var0] == null || xa[var0].length != var1 - 1) {
            if (var1 <= 1) {
               A(ea[var0], false);
               A(ca, false);
               if ((ea[var0][13] & 65536) != 0) {
                  var10000 = ea[var0];
                  var10000[13] &= -65537;
                  var10000 = ea[var0];
                  var10000[13] &= -131073;
                  A(14, var0, var15 / 2, var14 / 2, 0, false);
               }

               ea[var0][22] = -1;
               return false;
            }

            xa[var0] = new int[var1 - 1];
         }

         short var20 = var15;
         short var21 = var14;
         int[] var19 = A(ea[var0]);
         var6 = (short)(var19[3] & '\uffff') - (short)(var19[2] & '\uffff') >> 11;

         for(var5 = (short)((var19[3] & -65536) >> 16) - (short)((var19[2] & -65536) >> 16) >> 11; var1 > 1; --var1) {
            xa[var0][var1 - 2] = (short)var20 & '\uffff' | (short)var21 << 16 & -65536;

            for(var4 = var21; var4 <= var21 + var5; ++var4) {
               for(var3 = var20; var3 <= var20 + var6; ++var3) {
                  var10000 = wa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] &= -16711681;
                  var10000 = wa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] |= (byte)var0 << 16 & 16711680;
                  var10000 = wa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] &= 16777215;
                  var10000 = wa;
                  var10001 = var4 * B.b * 2 * 3 + var3 * 3 + 2;
                  var10000[var10001] |= (byte)(var1 - 2) << 24 & -16777216;
               }
            }

            var3 = B.A(var20, var21);
            var20 = (short)(var3 & '\uffff');
            var21 = (short)((var3 & -65536) >> 16);
         }

         ea[var0][24] = 0;
         var10000 = ea[var0];
         var10000[13] |= 64;
         if (ea[var0][22] == -1) {
            ea[var0][22] = xa[var0][0];
         }

         A(ea[var0], false);
         return true;
      }
   }

   static void T(int var0) {
      if (xa[var0] != null) {
         int[] var1 = A(ea[var0]);
         int var7 = (short)(var1[3] & '\uffff') - (short)(var1[2] & '\uffff') >> 11;
         int var6 = (short)((var1[3] & -65536) >> 16) - (short)((var1[2] & -65536) >> 16) >> 11;

         for(int var5 = 0; var5 < xa[var0].length; ++var5) {
            short var4 = (short)(xa[var0][var5] & '\uffff');
            short var3 = (short)((xa[var0][var5] & -65536) >> 16);

            for(int var2 = var3; var2 <= var3 + var6; ++var2) {
               for(int var8 = var4; var8 <= var4 + var7; ++var8) {
                  if ((byte)(wa[var2 * B.b * 2 * 3 + var8 * 3 + 2] >> 16 & 255) == var0) {
                     int[] var10000 = wa;
                     int var10001 = var2 * B.b * 2 * 3 + var8 * 3 + 2;
                     var10000[var10001] &= 65535;
                     var10000 = wa;
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
         int[] var10000 = wa;
         int var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= 65535;
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var2 << 16 & -65536;
      }
   }

   static void A(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if (var0 >= 0 && var1 >= 0 && var1 < B.c * 2 && var0 < B.b * 2) {
         int[] var10000 = wa;
         int var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] &= -65536;
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] |= (short)var2 & '\uffff';
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] &= 65535;
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 0;
         var10000[var10001] |= (short)var3 << 16 & -65536;
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= -65536;
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var4 & '\uffff';
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] &= 65535;
         var10000 = wa;
         var10001 = var1 * B.b * 2 * 3 + var0 * 3 + 1;
         var10000[var10001] |= (short)var5 << 16 & -65536;
         B.A(var0, var1, var6, var7);
      }
   }

   static void U(int var0) {
      int var6 = B.s;
      int var5 = 0;
      int[] var10000 = hA;
      var10000[var6] &= -65536;
      var10000 = hA;
      var10000[var6] |= 65535;
      var10000 = hA;
      var10000[var6] &= 65535;
      var10000 = hA;
      var10000[var6] |= 0;
      ++B.s;
      int var1 = ea[var0][14];
      short var2;
      short var7;
      if (var1 >= 0 && ((ha[ga[var1][4]][3] & 1) != 0 || (ga[var1][3] & 131072) != 0 || HG.A((int)100) >= 50)) {
         var2 = (short)(ga[var1][2] & '\uffff');
         var7 = (short)(hA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = hA;
         var10000[var6] &= -65536;
         var10000 = hA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      var1 = ea[var0][15];
      if (var1 >= 0 && ((ha[ga[var1][4]][3] & 1) != 0 || (ga[var1][3] & 131072) != 0 || HG.A((int)100) >= 50)) {
         var2 = (short)(ga[var1][2] & '\uffff');
         var7 = (short)(hA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = hA;
         var10000[var6] &= -65536;
         var10000 = hA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      var1 = ea[var0][16];
      if (var1 >= 0 && ((ja[ia[var1][4]][3] & 1) != 0 || (ia[var1][3] & 131072) != 0 || HG.A((int)100) >= 50)) {
         var2 = (short)(ia[var1][2] & '\uffff');
         var7 = (short)(hA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = hA;
         var10000[var6] &= -65536;
         var10000 = hA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      for(int var4 = 0; var4 < 2; ++var4) {
         short var3 = (short)(ea[var0][17 + var4] & '\uffff');
         var2 = (short)((ea[var0][17 + var4] & -65536) >> 16);
         if (var3 >= 0 && var2 >= 0) {
            var7 = -1;
            if (var3 == 2) {
               var7 = (short)(ka[var2][2] & '\uffff');
            } else if (var3 == 3) {
               var7 = (short)(sa[var2][2] & '\uffff');
            } else if (var3 == 5) {
               var7 = (short)(ma[var2][2] & '\uffff');
            }

            if (var7 >= 0) {
               var2 = (short)(hA[var6] & '\uffff');
               var10000 = B.a[var7];
               var10000[1] &= -65536;
               var10000 = B.a[var7];
               var10000[1] |= (short)var2 & '\uffff';
               var10000 = hA;
               var10000[var6] &= -65536;
               var10000 = hA;
               var10000[var6] |= (short)var7 & '\uffff';
               ++var5;
            }
         }
      }

      if (ea[var0][19] > 0) {
         var2 = (short)(ka[ea[var0][19]][2] & '\uffff');
         var7 = (short)(hA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = hA;
         var10000[var6] &= -65536;
         var10000 = hA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      if (ea[var0][28] > 0) {
         int var8 = A(ka);
         ka[var8][6] = ea[var0][28];

         for(int var9 = 0; var9 < 2; ++var9) {
            if (ea[var0][14 + var9] >= 0) {
               var1 = Z(ga[ea[var0][14 + var9]]);
               if (var1 == 2) {
                  ka[var8][4] = 1;
                  break;
               }

               if (var1 == 3) {
                  ka[var8][4] = 2;
                  break;
               }
            }
         }

         var2 = (short)(ka[var8][2] & '\uffff');
         var7 = (short)(hA[var6] & '\uffff');
         var10000 = B.a[var2];
         var10000[1] &= -65536;
         var10000 = B.a[var2];
         var10000[1] |= (short)var7 & '\uffff';
         var10000 = hA;
         var10000[var6] &= -65536;
         var10000 = hA;
         var10000[var6] |= (short)var2 & '\uffff';
         ++var5;
      }

      var10000 = ea[var0];
      var10000[17] &= -65536;
      var10000 = ea[var0];
      var10000[17] |= (short)var6 & '\uffff';
      var10000 = hA;
      var10000[var6] &= 65535;
      var10000 = hA;
      var10000[var6] |= (short)var5 << 16 & -65536;
   }

   public static void D(int var0, boolean var1) {
      int[] var6 = A(ea[var0]);
      int var4 = ea[var0][4];
      int var3 = ea[var0][5];
      int var2 = var6[11] * 4096;
      short var5 = (short)(ea[var0][20] & '\uffff');
      var2 <<= 1;
      B.aa[0] = var4 - var2;
      B.aa[2] = var4 + var2;
      B.aa[1] = var3 - var2;
      B.aa[3] = var3 + var2;
      var4 = (var2 >> 1) - 2048;

      for(var3 = B.A((int[])B.aa, 32); var3 != -1; var3 = (short)((B.a[var3][1] & -65536) >> 16)) {
         if ((B.a[var3][3] & 65536) == 0 && (B.a[var3][13] & 2) == 0) {
            int[] var7 = A(B.a[var3]);
            if (!N((short)((B.a[var3][2] & -65536) >> 16)) && (B.a[var3][11] == ea[var0][11] || var7[1] == var6[1])) {
               var2 = B.a[var3][29];
               if (var1) {
                  ea[var0][26] = 10;
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
      var0 = ea[var0][11];
      if ((fa[var0][13] & 2048) != 0) {
         var0 = fa[var0][12] / 5;
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
      dc = new short[273][];
      ec = new Image[273][];
      fc = new int[273];
      int var1 = 0;

      int var0;
      for(var0 = 0; var0 < 273; ++var0) {
         if ((cc[var0 * 11 + 9] & 2) != 0) {
            ++var1;
         }
      }

      ic = null;
      gc = -1;

      int var2;
      short var7;
      try {
         System.gc();
         jc = new DataInputStream(HG.fb.getClass().getResourceAsStream("/i"));
         short var6 = jc.readShort();
         ic = new byte[var6];
         short var3 = jc.readShort();

         for(var2 = 0; var2 < var3; ++var2) {
            var7 = jc.readShort();

            for(var0 = 0; var0 < 273; ++var0) {
               if (var7 == cc[var0 * 11 + 3]) {
                  short[] var10000 = cc;
                  var10000[var0 * 11 + 9] = (short)(var10000[var0 * 11 + 9] | 4);
               }
            }
         }
      } catch (Exception var5) {
         ic = new byte[32767];
      }

      for(var2 = 0; var2 < 273; ++var2) {
         if ((cc[var2 * 11 + 9] & 2) != 0) {
            var7 = cc[var2 * 11 + 4];

            for(var0 = 0; var0 < (var7 == -1 ? 1 : 1 + aC[var7][1].length / aC[var7][0].length); ++var0) {
               K(var2, var0);
            }
         }
      }

      A(true, 0, 75);

      try {
         if (jc != null) {
            jc.close();
         }
      } catch (Exception var4) {
      }

      jc = null;
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

      kc = null;
      lc = null;
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
      var4 *= 7;
      if (cc[var2 * 11 + 4] == 5) {
         var3 = B.k;
      }

      if (dc != null) {
         if (cc != null) {
            if (cc[var2 * 11 + 3] != -1) {
               if (var2 >= 0 && var2 < dc.length) {
                  if (dc[var2] != null) {
                     if (var4 >= 0 && var4 < dc[var2].length) {
                        if (var3 >= 0 || var3 < ec[var2].length) {
                           if (ec[var2][var3] != null) {
                              if (var6 == 0 && var7 == 0) {
                                 switch(var5) {
                                 case 2:
                                    var8.drawRegion(ec[var2][var3], dc[var2][var4 + 1], dc[var2][var4 + 2], dc[var2][var4 + 3], dc[var2][var4 + 4], var5, var0 - dc[var2][var4 + 3] - dc[var2][var4 + 5], var1 + dc[var2][var4 + 6], 20);
                                    break;
                                 default:
                                    var8.drawRegion(ec[var2][var3], dc[var2][var4 + 1], dc[var2][var4 + 2], dc[var2][var4 + 3], dc[var2][var4 + 4], var5, var0 + dc[var2][var4 + 5], var1 + dc[var2][var4 + 6], 20);
                                 }
                              } else {
                                 short var12 = dc[var2][var4 + 3];
                                 short var11 = dc[var2][var4 + 4];
                                 int var10 = var4 + N(var6, var7) * 7;
                                 if (var10 < 0 || var10 >= dc[var2].length) {
                                    return;
                                 }

                                 int var9;
                                 if (E(var6) > E(var7)) {
                                    var9 = var12 * var7 / var6;

                                    for(var5 = 0; var5 < var12; ++var5) {
                                       var4 = var5 * var7 / var6 - (var9 >> 1);
                                       var8.drawRegion(ec[var2][var3], dc[var2][var10 + 1] + var5, dc[var2][var10 + 2], 1, dc[var2][var10 + 4], 0, var0 + var5 - (var12 >> 1), var1 + var4 - (var11 >> 1), 20);
                                    }
                                 } else {
                                    var9 = var11 * var6 / var7;

                                    for(var5 = 0; var5 < var11; ++var5) {
                                       var4 = var5 * var6 / var7 - (var9 >> 1);
                                       var8.drawRegion(ec[var2][var3], dc[var2][var10 + 1], dc[var2][var10 + 2] + var5, dc[var2][var10 + 3], 1, 0, var0 + var4 - (var12 >> 1), var1 + var5 - (var11 >> 1), 20);
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

   public static boolean W(int var0) {
      return L(var0, 0);
   }

   public static boolean L(int var0, int var1) {
      boolean var8 = false;
      if (cc[var0 * 11 + 4] == 5) {
         var1 = B.k;
      }

      if (var0 >= 0 && var0 < ec.length) {
         short var2 = cc[var0 * 11 + 3];
         short var4 = cc[var0 * 11 + 4];
         if (var4 < -1 || var4 >= aC.length) {
            var4 = -1;
         }

         if (var1 >= 0 && var1 < (var4 == -1 ? 1 : 1 + aC[var4][1].length / aC[var4][0].length)) {
            if (ec[var0] == null) {
               ec[var0] = new Image[var4 == -1 ? 1 : 1 + aC[var4][1].length / aC[var4][0].length];
            }

            if (ec[var0][var1] != null) {
               return true;
            } else if ((cc[var0 * 11 + 9] & 1) != 0) {
               return false;
            } else {
               System.gc();
               if (var2 == -1) {
                  return false;
               } else {
                  String var3 = "/";
                  if (var2 < 10) {
                     var3 = "/" + "0";
                  }

                  if (var2 < 100) {
                     var3 = var3 + "0";
                  }

                  var3 = var3 + "" + var2;
                  DataInputStream var7 = null;

                  short[] var10000;
                  label361: {
                     try {
                        if ((cc[var0 * 11 + 9] & 4) != 0 && (gc == var0 || M(var0, var2))) {
                           if (var1 != 0 && var4 != -1) {
                              byte[] var18 = new byte[hc];
                              System.arraycopy(ic, 0, var18, 0, hc);
                              A(var18, hc, var1 - 1, aC[var4][0], aC[var4][1]);
                              ec[var0][var1] = Image.createImage(var18, 0, hc);
                           } else {
                              ec[var0][var1] = Image.createImage(ic, 0, hc);
                           }
                        }

                        if (ec[var0][var1] == null) {
                           throw new Exception();
                        }

                        System.gc();
                        cc[var0 * 11 + 0] = (short)ec[var0][var1].getWidth();
                        cc[var0 * 11 + 1] = (short)ec[var0][var1].getHeight();
                        if (dc[var0] == null) {
                           InputStream var19 = HG.fb.getClass().getResourceAsStream(var3 + ".off");
                           int var20;
                           if (var19 == null) {
                              cc[var0 * 11 + 2] = (short)(cc[var0 * 11 + 5] * cc[var0 * 11 + 6]);
                              dc[var0] = new short[cc[var0 * 11 + 2] * 7];
                              int var6 = 0;
                              int var5 = 0;
                              switch(cc[var0 * 11 + 7]) {
                              case 0:
                                 var6 = 0;
                                 break;
                              case 1:
                                 var6 = -cc[var0 * 11 + 0] / cc[var0 * 11 + 5];
                                 break;
                              case 2:
                                 var6 = -(cc[var0 * 11 + 0] / cc[var0 * 11 + 5] >> 1);
                              }

                              switch(cc[var0 * 11 + 8]) {
                              case 0:
                                 var5 = 0;
                                 break;
                              case 1:
                                 var5 = -cc[var0 * 11 + 1] / cc[var0 * 11 + 6];
                                 break;
                              case 2:
                                 var5 = -(cc[var0 * 11 + 1] / cc[var0 * 11 + 6] >> 1);
                              }

                              int var21 = 0;
                              int var22 = 0;

                              while(true) {
                                 if (var22 >= cc[var0 * 11 + 6]) {
                                    break label361;
                                 }

                                 for(var20 = 0; var20 < cc[var0 * 11 + 5]; ++var20) {
                                    dc[var0][var21 + 0] = (short)var0;
                                    dc[var0][var21 + 1] = (short)(cc[var0 * 11 + 0] * var20 / cc[var0 * 11 + 5]);
                                    dc[var0][var21 + 2] = (short)(cc[var0 * 11 + 1] * var22 / cc[var0 * 11 + 6]);
                                    dc[var0][var21 + 3] = (short)(cc[var0 * 11 + 0] / cc[var0 * 11 + 5]);
                                    dc[var0][var21 + 4] = (short)(cc[var0 * 11 + 1] / cc[var0 * 11 + 6]);
                                    dc[var0][var21 + 5] = (short)var6;
                                    dc[var0][var21 + 6] = (short)var5;
                                    var21 += 7;
                                 }

                                 ++var22;
                              }
                           } else {
                              var7 = new DataInputStream(var19);
                              byte var23 = var7.readByte();
                              cc[var0 * 11 + 2] = (short)var23;
                              dc[var0] = new short[var23 * 7];

                              for(var20 = 0; var20 < var23 * 7; ++var20) {
                                 dc[var0][var20] = (short)var7.readByte();
                              }

                              var7.close();
                              var7 = null;
                              break label361;
                           }
                        }
                     } catch (Exception var16) {
                        ec[var0][var1] = null;
                        dc[var0] = null;
                        var8 = true;
                        var10000 = cc;
                        var10000[var0 * 11 + 9] = (short)(var10000[var0 * 11 + 9] | 1);
                        break label361;
                     } finally {
                        try {
                           if (var7 != null) {
                              var7.close();
                           }
                        } catch (Exception var15) {
                        }

                     }

                     return true;
                  }

                  if (!var8) {
                     return true;
                  } else {
                     var2 = cc[var0 * 11 + 10];
                     if (var2 != -1 && L(var2, 0)) {
                        ec[var0][var1] = ec[var2][0];
                        dc[var0] = dc[var2];
                        short var24 = cc[var0 * 11 + 4];

                        for(var1 = 0; var1 < 11; ++var1) {
                           cc[var0 * 11 + var1] = cc[var2 * 11 + var1];
                        }

                        cc[var0 * 11 + 10] = (short)var2;
                        cc[var0 * 11 + 4] = (short)var24;
                        var10000 = cc;
                        var10000[var0 * 11 + 9] = (short)(var10000[var0 * 11 + 9] & -2);
                        return true;
                     } else {
                        return false;
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static boolean X(int var0) {
      DataInputStream var2 = null;
      boolean var1 = false;
      kc = null;
      lc = null;
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

         label151: {
            try {
               InputStream var14 = HG.fb.getClass().getResourceAsStream(var3 + ".png");
               if (var14 != null) {
                  var2 = new DataInputStream(var14);
                  kc = new byte[var2.available()];
                  var2.read(kc, 0, kc.length);
                  var1 = true;
                  var2.close();
                  var2 = null;
                  var14 = HG.fb.getClass().getResourceAsStream(var3 + ".off");
                  if (var14 == null) {
                     return true;
                  }

                  var2 = new DataInputStream(var14);
                  var2.readByte();
                  lc = new byte[var2.available()];
                  var2.read(lc, 0, lc.length);
                  var2.close();
                  var2 = null;
                  break label151;
               }
            } catch (Exception var12) {
               kc = null;
               lc = null;
               System.gc();
               break label151;
            } finally {
               try {
                  if (var2 != null) {
                     var2.close();
                  }
               } catch (Exception var11) {
               }

            }

            return false;
         }

         System.gc();
         return var1;
      }
   }

   public static void OA() {
      if (jc == null) {
         QA();
      }
   }

   public static void PA() {
      try {
         jc.close();
      } catch (Exception var3) {
      } finally {
         jc = null;
      }

   }

   private static void QA() {
      short var1;
      int var5;
      if (jc != null) {
         try {
            if (jc.markSupported()) {
               jc.reset();
               jc.readShort();
               var1 = jc.readShort();

               for(var5 = 0; var5 < var1; ++var5) {
                  jc.readShort();
               }

               return;
            }

            jc.close();
            jc = null;
         } catch (Exception var4) {
         }
      }

      jc = null;
      InputStream var0 = HG.fb.getClass().getResourceAsStream("/i");
      if (var0 != null) {
         try {
            jc = new DataInputStream(var0);
            jc.readShort();
            var1 = jc.readShort();

            for(var5 = 0; var5 < var1; ++var5) {
               jc.readShort();
            }
         } catch (Exception var3) {
            try {
               jc.close();
            } catch (Exception var2) {
            }

            jc = null;
         }

      }
   }

   public static boolean M(int var0, int var1) {
      boolean var6 = false;
      boolean var5 = false;
      if (ic == null) {
         return false;
      } else {
         kc = null;
         lc = null;

         try {
            boolean var4 = true;
            if (jc == null) {
               QA();
               var5 = true;
               var4 = false;
            }

            while(true) {
               short var3 = jc.readShort();
               hc = jc.readShort();
               short var2 = jc.readShort();
               if (var3 > var1 && var4) {
                  QA();
                  var3 = jc.readShort();
                  hc = jc.readShort();
                  var2 = jc.readShort();
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
                     kc = new byte[hc];
                     jc.read(kc, 0, kc.length);
                     if (var2 != 0) {
                        jc.readByte();
                        lc = new byte[var2 - 1];
                        jc.read(lc, 0, lc.length);
                     }

                     var6 = true;
                  } else {
                     gc = var0;
                     jc.read(ic, 0, hc);
                     if (var2 != 0 && dc[var0] == null) {
                        byte var16 = 0;
                        byte var15 = jc.readByte();
                        int var17 = var16 + 1;
                        cc[var0 * 11 + 2] = (short)var15;
                        System.gc();
                        dc[var0] = new short[var15 * 7];

                        for(var1 = 0; var1 < var15 * 7; ++var1) {
                           dc[var0][var1] = (short)jc.readByte();
                           ++var17;
                        }
                     } else {
                        jc.skip((long)var2);
                     }

                     var6 = true;
                  }
                  break;
               }

               jc.skip((long)(hc + var2));
            }
         } catch (Exception var13) {
            var13.printStackTrace();
         } finally {
            if (var5) {
               try {
                  jc.close();
                  jc = null;
               } catch (Exception var12) {
               }
            }

         }

         return var6;
      }
   }

   public static void RA() {
      pc = new byte[8][][][];
      xc = new Image[8][][];
      rc = new byte[8][][];
      qc = new byte[8][][][];
      yc = new byte[8][][];
      tc = new short[8][];
      vc = new int[8][][][];
      wc = new byte[8][];
      uc = new byte[8][][];
      sc = new short[8][][][][];
   }

   public static void SA() {
      for(int var1 = 0; var1 < pc.length; ++var1) {
         short var0 = mc[var1 * 2 + 1];
         if ((var0 & 1) == 0) {
            pc[var1] = (byte[][][])null;
            xc[var1] = (Image[][])null;
            rc[var1] = (byte[][])null;
            qc[var1] = (byte[][][])null;
            yc[var1] = (byte[][])null;
            tc[var1] = null;
            vc[var1] = (int[][][])null;
            wc[var1] = null;
            uc[var1] = (byte[][])null;
            sc[var1] = (short[][][][])null;
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
            if (pc[var1] == null) {
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
         return var1 >= 0 && var1 < pc.length ? (short)((var0[7] & -65536) >> 16) : -1;
      }
   }

   public static int K(int[] var0) {
      if ((var0[3] & 4) == 0) {
         return -1;
      } else {
         int var1 = J(var0);
         return var1 == -1 ? -1 : pc[var1].length;
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
         C((int[])var0, 0);
      }
   }

   public static int M(int[] var0) {
      int var1 = J(var0);
      if (var1 == -1) {
         return -1;
      } else {
         int var2 = L(var0);
         return var2 >= 0 && var2 < qc[var1].length ? qc[var1][var2].length : -1;
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
      return var1 == -1 ? -1 : vc[var1].length;
   }

   public static int H(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < vc[var2].length ? vc[var2][var1].length : -1;
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

            for(int var6 = 0; var6 < xc[var3].length; ++var6) {
               short var7 = tc[var3][var6 * 6 + 1];
               short var5 = tc[var3][var6 * 6 + 0];
               if (var7 == var1 && xc[var3][var6][var2] == null) {
                  byte[] var10 = yc[var3][var6];
                  int var8 = 0;
                  if (var10 != null) {
                     var8 = var10.length;
                  }

                  if (var10 == null) {
                     var10 = P(var3, var5);
                     if (var10 != null) {
                        var8 = var10.length;
                        yc[var3][var6] = var10;
                     }

                     if (var10 == null) {
                        boolean var9 = X(var5);
                        if (!var9 || lc != null) {
                           continue;
                        }

                        var10 = kc;
                        var8 = var10.length;
                     }
                  }

                  if (var2 == 0) {
                     xc[var3][var6][var2] = Image.createImage(var10, 0, var8);
                  } else {
                     A(var10, var8, 0, vc[var3][var1][0], vc[var3][var1][var2]);
                     xc[var3][var6][var2] = Image.createImage(var10, 0, var8);
                     A(var10, var8, 0, vc[var3][var1][var2], vc[var3][var1][0]);
                  }
               }
            }

         }
      }
   }

   public static int P(int[] var0) {
      int var1 = J(var0);
      return var1 == -1 ? -1 : wc[var1].length;
   }

   public static int J(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < wc[var2].length ? wc[var2][var1] : -1;
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
      return var1 == -1 ? -1 : uc[var1].length;
   }

   public static int L(int[] var0, int var1) {
      int var2 = J(var0);
      if (var2 == -1) {
         return -1;
      } else {
         return var1 >= 0 && var1 < uc[var2].length ? uc[var2][var1].length : -1;
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
            C((int[])var0, 0);
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
         if (pc[var6] == null) {
            return true;
         } else if (var7 >= 0 && var7 < 17) {
            int var5 = L(var0);
            if (var5 == -1 || var5 >= pc[var6].length) {
               var5 = 0;
            }

            ++var8;
            int var4 = 0;
            int var3 = 0;

            for(int var2 = pc[var6][var5][var7][0]; var2 < var8; ++var4) {
               var3 += 5;
               if (var3 >= pc[var6][var5][var7].length) {
                  if (var1) {
                     var8 = 1;
                     var4 = 0;
                  }

                  var9 = true;
                  break;
               }

               var2 += pc[var6][var5][var7][var3];
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

   public static void B(int[] var0, Graphics var1) {
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

         if (var13 < 0 || var13 >= pc.length) {
            return;
         }

         if (pc[var13] == null) {
            return;
         }

         if (var12 >= pc[var13].length || var12 < 0) {
            var12 = 0;
         }

         if (var11 >= qc[var13][var12].length || var11 < 0) {
            var11 = 0;
         }

         if (var14 < 0 || var14 >= 17) {
            return;
         }

         if (var2 * 5 < -pc[var13][var12][var14].length || var2 * 5 >= pc[var13][var12][var14].length) {
            return;
         }

         int var10 = 1 + var2 * 5;

         for(int var9 = 0; var9 < 4; ++var9) {
            byte var8 = qc[var13][var12][var11][var14 * 4 + var9];
            if (var8 != -1) {
               short var16 = tc[var13][var8 * 6 + 2];
               int var7 = 0;
               if (var16 != -1) {
                  var7 = K(var0, var16);
                  if (var7 == -1) {
                     var7 = 0;
                  }
               }

               short var6 = tc[var13][var8 * 6 + 3];
               short var3 = tc[var13][var8 * 6 + 5];
               if (var3 != -1) {
                  var2 = M(var0, var3);
                  if (var2 == -1) {
                     var2 = 0;
                  }

                  var8 = uc[var13][var3][var2];
               }

               var3 = tc[var13][var8 * 6 + 1];
               int var5 = 0;
               if (var3 != -1) {
                  var5 = I(var0, var3);
                  if (var5 == -1) {
                     var5 = 0;
                  }
               }

               byte var17 = pc[var13][var12][var14][var10 + var9];
               if (var5 >= xc[var13][var8].length) {
                  var5 = 0;
               }

               if (xc[var13][var8][var5] == null) {
                  B(var0, var3, var5);
               }

               if (xc[var13][var8][var5] == null) {
                  return;
               }

               int var4 = var0[4] * B.d >> 12;
               int var18 = var0[5] * B.d >> 12;
               var4 -= tB;
               var18 -= uB;
               if (var17 >= 0) {
                  var2 = var17 * 7;
                  var2 += var7 * var6 * 7;
                  if (var2 < 0 || var2 >= rc[var13][var8].length) {
                     var2 = 0;
                  }

                  var1.drawRegion(xc[var13][var8][var5], rc[var13][var8][var2 + 1], rc[var13][var8][var2 + 2], rc[var13][var8][var2 + 3], rc[var13][var8][var2 + 4], 0, var4 + rc[var13][var8][var2 + 5], var18 + rc[var13][var8][var2 + 6], 20);
               } else {
                  var2 = (-var17 - 1) * 7;
                  var2 += var7 * var6 * 7;
                  if (var2 < 0 || var2 >= rc[var13][var8].length) {
                     var2 = 0;
                  }

                  var1.drawRegion(xc[var13][var8][var5], rc[var13][var8][var2 + 1], rc[var13][var8][var2 + 2], rc[var13][var8][var2 + 3], rc[var13][var8][var2 + 4], 2, var4 - rc[var13][var8][var2 + 3] - rc[var13][var8][var2 + 5], var18 + rc[var13][var8][var2 + 6], 20);
               }
            }
         }
      } catch (Exception var15) {
      }

   }

   public static short[] D(int[] var0, boolean var1) {
      if ((var0[3] & 4) == 0) {
         zc[0] = 0;
         zc[1] = 0;
         zc[2] = 0;
         zc[3] = 0;
         return null;
      } else {
         int var5 = J(var0);
         if (var5 == -1) {
            return null;
         } else if (xc[var5] == null) {
            return null;
         } else {
            int var4 = L(var0);
            int var3 = N(var0);
            int var2 = G(var0);
            int var6 = I(var0);
            if (var1) {
               if (nc[var2] != -1) {
                  var2 = nc[var2];
               }

               var6 = 0;
            }

            if (var4 < 0 || var4 >= sc[var5].length) {
               var4 = 0;
            }

            if (var3 < 0 || var3 >= sc[var5][var4].length) {
               var3 = 0;
            }

            for(int var7 = 0; var7 < 4; ++var7) {
               zc[var7] = sc[var5][var4][var3][var2][var6 * 4 + var7];
            }

            return zc;
         }
      }
   }

   public static void Y(int var0) {
      if (pc[var0] == null) {
         short var2 = mc[var0 * 2 + 0];
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
            var17 = new DataInputStream(HG.fb.getClass().getResourceAsStream(var1));
            var17.readInt();
            byte var3 = var17.readByte();
            byte var27 = var17.readByte();
            byte var29 = var17.readByte();
            if (var3 != 4 || var27 != 17 || var29 != 7) {
               pc[var0] = (byte[][][])null;
               return;
            }

            byte var4 = var17.readByte();
            pc[var0] = new byte[var4][17][];

            int var28;
            int var30;
            for(var30 = 0; var30 < var4; ++var30) {
               for(var28 = 0; var28 < 17; ++var28) {
                  var29 = var17.readByte();
                  pc[var0][var30][var28] = new byte[var29 * 5];
                  var17.read(pc[var0][var30][var28], 0, pc[var0][var30][var28].length);
               }
            }

            qc[var0] = new byte[pc[var0].length][][];

            int var5;
            int var31;
            for(var5 = 0; var5 < qc[var0].length; ++var5) {
               var4 = var17.readByte();
               qc[var0][var5] = new byte[var4][68];

               for(var30 = 0; var30 < var4; ++var30) {
                  for(var28 = 0; var28 < 17; ++var28) {
                     for(var31 = 0; var31 < 4; ++var31) {
                        qc[var0][var5][var30][var28 * 4 + var31] = var17.readByte();
                     }
                  }
               }
            }

            byte var7 = var17.readByte();
            tc[var0] = new short[var7 * 6];
            var28 = 0;

            while(true) {
               if (var28 >= var7) {
                  var28 = var17.readInt();
                  uc[var0] = new byte[var28][];

                  for(var31 = 0; var31 < var28; ++var31) {
                     uc[var0][var31] = new byte[var17.readByte()];
                     var17.read(uc[var0][var31], 0, uc[var0][var31].length);
                  }

                  byte var6 = var17.readByte();
                  vc[var0] = new int[var6][][];

                  for(var5 = 0; var5 < var6; ++var5) {
                     var4 = var17.readByte();
                     var3 = var17.readByte();
                     vc[var0][var5] = new int[var4][var3];

                     for(var28 = 0; var28 < var4; ++var28) {
                        for(var31 = 0; var31 < var3; ++var31) {
                           vc[var0][var5][var28][var31] = var17.readInt();
                        }
                     }
                  }

                  var27 = var17.readByte();
                  wc[var0] = new byte[var27];

                  for(var31 = 0; var31 < var27; ++var31) {
                     wc[var0][var31] = var17.readByte();
                  }

                  xc[var0] = new Image[var7][];
                  yc[var0] = new byte[var7][];
                  rc[var0] = new byte[var7][];
                  var17.readInt();
                  OA();

                  int var32;
                  short var35;
                  for(var5 = 0; var5 < var7; ++var5) {
                     var17.readInt();
                     var32 = var17.readInt();
                     var30 = var17.readInt();
                     if (O(var0, var5)) {
                        var17.skip((long)var32);
                        rc[var0][var5] = new byte[var30];
                        var17.read(rc[var0][var5], 0, rc[var0][var5].length);
                     } else {
                        var2 = tc[var0][var5 * 6 + 1];
                        byte[] var38;
                        if (var32 == 0) {
                           var35 = tc[var0][var5 * 6 + 0];
                           boolean var36 = X(var35);
                           if (!var36 || lc != null) {
                              pc[var0] = (byte[][][])null;
                              throw new Exception("");
                           }

                           var38 = kc;
                           var32 = var38.length;
                        } else {
                           var38 = new byte[var32];
                           var17.read(var38, 0, var38.length);
                        }

                        rc[var0][var5] = new byte[var30];
                        var17.read(rc[var0][var5], 0, rc[var0][var5].length);
                        if (var2 == -1) {
                           xc[var0][var5] = new Image[1];
                           xc[var0][var5][0] = Image.createImage(var38, 0, var32);
                           yc[var0][var5] = null;
                        } else {
                           yc[var0][var5] = var38;
                           var31 = vc[var0][var2].length;
                           xc[var0][var5] = new Image[var31];
                        }

                        System.gc();
                     }
                  }

                  PA();

                  for(var32 = 0; var32 < var7; ++var32) {
                     if (xc[var0][var32][0] != null) {
                        var30 = xc[var0][var32][0].getWidth();
                        var28 = xc[var0][var32][0].getHeight();

                        for(var31 = 0; var31 < rc[var0][var32].length; var31 += 7) {
                           if (rc[var0][var32][var31 + 1] < 0 || rc[var0][var32][var31 + 1] >= var30) {
                              rc[var0][var32][var31 + 1] = 0;
                           }

                           if (rc[var0][var32][var31 + 2] < 0 || rc[var0][var32][var31 + 2] >= var28) {
                              rc[var0][var32][var31 + 2] = 0;
                           }

                           if (rc[var0][var32][var31 + 1] + rc[var0][var32][var31 + 3] > var30) {
                              rc[var0][var32][var31 + 3] = 1;
                           }

                           if (rc[var0][var32][var31 + 2] + rc[var0][var32][var31 + 4] > var28) {
                              rc[var0][var32][var31 + 4] = 1;
                           }
                        }
                     }
                  }

                  sc[var0] = new short[qc[var0].length][][][];

                  for(int var16 = 0; var16 < qc[var0].length; ++var16) {
                     sc[var0][var16] = new short[qc[var0][var16].length][][];

                     for(int var15 = 0; var15 < qc[var0][var16].length; ++var15) {
                        sc[var0][var16][var15] = new short[17][];

                        for(int var14 = 0; var14 < 17; ++var14) {
                           int var13 = pc[var0][var16][var14].length / 5;
                           sc[var0][var16][var15][var14] = new short[var13 * 4];

                           for(int var12 = 0; var12 < var13; ++var12) {
                              short var11 = 32767;
                              short var10 = -32768;
                              short var9 = 32767;
                              short var8 = -32768;

                              for(int var37 = 0; var37 < 4; ++var37) {
                                 var6 = qc[var0][var16][var15][var14 * 4 + var37];
                                 var5 = pc[var0][var16][var14][5 * var12 + var37 + 1];
                                 if (var6 != -1) {
                                    boolean var34 = false;
                                    if (var5 < 0) {
                                       var5 *= -1;
                                       --var5;
                                       var34 = true;
                                    }

                                    short var33 = (short)rc[var0][var6][var5 * 7 + 5];
                                    var2 = (short)rc[var0][var6][var5 * 7 + 6];
                                    var35 = (short)rc[var0][var6][var5 * 7 + 3];
                                    short var39 = (short)rc[var0][var6][var5 * 7 + 4];
                                    if (var34) {
                                       var33 = (short)(var33 * -1);
                                       var33 -= var35;
                                    }

                                    if (var11 > var33) {
                                       var11 = var33;
                                    }

                                    if (var10 < var33 + var35) {
                                       var10 = (short)(var33 + var35);
                                    }

                                    if (var9 > var2) {
                                       var9 = var2;
                                    }

                                    if (var8 < var2 + var39) {
                                       var8 = (short)(var2 + var39);
                                    }
                                 }
                              }

                              sc[var0][var16][var15][var14][var12 * 4 + 0] = var11;
                              sc[var0][var16][var15][var14][var12 * 4 + 2] = var10;
                              sc[var0][var16][var15][var14][var12 * 4 + 1] = var9;
                              sc[var0][var16][var15][var14][var12 * 4 + 3] = var8;
                           }
                        }
                     }
                  }

                  for(var31 = 0; var31 < 8; ++var31) {
                     if (var31 != var0 && mc[var31 * 2 + 0] == mc[var0 * 2 + 0]) {
                        pc[var31] = pc[var0];
                        xc[var31] = xc[var0];
                        rc[var31] = rc[var0];
                        qc[var31] = qc[var0];
                        yc[var31] = yc[var0];
                        tc[var31] = tc[var0];
                        vc[var31] = vc[var0];
                        wc[var31] = wc[var0];
                        uc[var31] = uc[var0];
                        sc[var31] = sc[var0];
                     }
                  }
                  break;
               }

               for(var31 = 0; var31 < 6; ++var31) {
                  tc[var0][var28 * 6 + var31] = var17.readShort();
               }

               ++var28;
            }
         } catch (Exception var25) {
            var25.printStackTrace();
            pc[var0] = (byte[][][])null;
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
      short var5 = tc[var0][var1 * 6 + 0];
      short var4 = tc[var0][var1 * 6 + 1];

      for(int var3 = 0; var3 < 8; ++var3) {
         if (var3 != var0 && pc[var3] != null) {
            for(int var2 = 0; var2 < xc[var3].length; ++var2) {
               if (var5 == tc[var3][var2 * 6 + 0] && tc[var3][var2 * 6 + 1] == -1 && var4 == -1) {
                  xc[var0][var1] = new Image[1];
                  xc[var0][var1][0] = xc[var3][var2][0];
                  yc[var0][var1] = yc[var3][var2];
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static byte[] P(int var0, int var1) {
      short var2 = mc[var0 * 2 + 0];
      byte[] var7 = null;
      System.gc();
      DataInputStream var6 = null;
      String var16 = "/";
      if (var2 < 10) {
         var16 = "/" + "0";
      }

      if (var2 < 100) {
         var16 = var16 + "0";
      }

      var16 = var16 + "" + var2 + ".mdl";

      try {
         var6 = new DataInputStream(HG.fb.getClass().getResourceAsStream(var16));
         var0 = var6.readInt();
         var6.skip((long)var0);
         int var5 = var6.readInt();

         for(int var4 = 0; var4 < var5; ++var4) {
            int var3 = var6.readInt();
            int var17 = var6.readInt();
            var0 = var6.readInt();
            if (var3 == var1 && var17 != 0) {
               var7 = new byte[var17];
               var6.read(var7, 0, var17);
               break;
            }

            var6.skip((long)(var17 + var0));
         }
      } catch (Exception var14) {
         var14.printStackTrace();
      } finally {
         try {
            if (var6 != null) {
               var6.close();
            }
         } catch (Exception var13) {
         }

      }

      return var7;
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
            short var3 = cc[qa[var0[4]][1] * 11 + 5];
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

   private static boolean A(byte[] var0) {
      boolean var3 = true;
      byte[] var2 = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10};

      for(int var1 = 0; var1 < 8; ++var1) {
         if (var2[var1] != var0[var1]) {
            var3 = false;
         }
      }

      return var3;
   }

   private static int A(byte[] var0, int var1) {
      int var2 = (var0[var1 + 0] & 255) << 24 | (var0[var1 + 1] & 255) << 16 | (var0[var1 + 2] & 255) << 8 | var0[var1 + 3] & 255;
      if (var2 < 0) {
         var2 = 0;
      }

      return var2;
   }

   private static boolean B(byte[] var0, int var1) {
      if ((var0[var1 + 4 + 0] & -33) != 80) {
         return false;
      } else if ((var0[var1 + 4 + 1] & -33) != 76) {
         return false;
      } else if ((var0[var1 + 4 + 2] & -33) != 84) {
         return false;
      } else {
         return (var0[var1 + 4 + 3] & -33) == 69;
      }
   }

   private static int A(byte[] var0, int var1, int var2) {
      int var3;
      int var4;
      if (bC == null) {
         bC = new int[256];

         for(int var5 = 0; var5 < 256; ++var5) {
            var4 = var5;

            for(var3 = 0; var3 < 8; ++var3) {
               if ((var4 & 1) == 1) {
                  var4 = -306674912 ^ var4 >>> 1;
               } else {
                  var4 >>>= 1;
               }
            }

            bC[var5] = var4;
         }
      }

      var4 = -1;

      for(var3 = var1; var3 < var1 + var2; ++var3) {
         var4 = bC[(var4 ^ var0[var3]) & 255] ^ var4 >>> 8;
      }

      return ~var4;
   }

   private static boolean C(byte[] var0, int var1) {
      int var3 = A(var0, var1);
      int var2 = (var0[var1 + 8 + var3 + 0] & 255) << 24 | (var0[var1 + 8 + var3 + 1] & 255) << 16 | (var0[var1 + 8 + var3 + 2] & 255) << 8 | var0[var1 + 8 + var3 + 3] & 255;
      int var4 = A(var0, var1 + 4, var3 + 4);
      return var2 == var4;
   }

   private static void D(byte[] var0, int var1) {
      int var3 = (var0[var1 + 0] & 255) << 24 | (var0[var1 + 1] & 255) << 16 | (var0[var1 + 2] & 255) << 8 | var0[var1 + 3] & 255;
      int var2 = A(var0, var1 + 4, var3 + 4);
      var0[var1 + 8 + var3 + 0] = (byte)(var2 >>> 24 & 255);
      var0[var1 + 8 + var3 + 1] = (byte)(var2 >>> 16 & 255);
      var0[var1 + 8 + var3 + 2] = (byte)(var2 >>> 8 & 255);
      var0[var1 + 8 + var3 + 3] = (byte)(var2 >>> 0 & 255);
   }

   public static boolean A(byte[] var0, int var1, int var2, int[] var3, int[] var4) {
      try {
         if (!A(var0)) {
            return false;
         } else {
            int var5;
            for(int var6 = 8; var6 < var1; var6 += var5 + 12) {
               var5 = A(var0, var6);
               if (var5 > 0 && C(var0, var6) && B(var0, var6)) {
                  A(var0, var6 + 8, var5, var2, var3, var4);
                  D(var0, var6);
               }
            }

            return true;
         }
      } catch (Exception var7) {
         return false;
      }
   }

   private static void A(byte[] var0, int var1, int var2, int var3, int[] var4, int[] var5) {
      try {
         int var11 = 0;
         int var10 = 0;

         for(int var9 = var1; var9 < var1 + var2; var9 += 3) {
            boolean var8 = false;

            for(int var7 = 0; var7 < var4.length; ++var7) {
               if (!var8 && (var0[var9 + 0] & 255) == (var4[var7] >> 16 & 255) && (var0[var9 + 1] & 255) == (var4[var7] >> 8 & 255) && (var0[var9 + 2] & 255) == (var4[var7] >> 0 & 255)) {
                  int var6 = var4.length * var3 + var7;
                  var8 = true;
                  ++var10;
                  var0[var9 + 0] = (byte)(var5[var6] >> 16 & 255);
                  var0[var9 + 1] = (byte)(var5[var6] >> 8 & 255);
                  var0[var9 + 2] = (byte)(var5[var6] >> 0 & 255);
               }
            }

            ++var11;
         }
      } catch (Exception var12) {
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
      if ((ca[3] & 8388608) == 0 && (short)(ca[12] & '\uffff') > 0) {
         boolean var11 = false;
         int var10 = dC.length;

         while(true) {
            boolean var6;
            int[] var9;
            do {
               --var10;
               if (var10 < 0) {
                  return var11;
               }

               var9 = dC[var10];
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

               if (eC[var12][0] == 0) {
                  var8 = eC[var12];
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
      if (dC != null && dC.length > 0) {
         int var1 = 4;

         while(true) {
            --var1;
            if (var1 < 0) {
               break;
            }

            int[] var0 = eC[var1];
            if (var0[0] != 0) {
               O(var0, var1);
            }
         }
      }

   }

   public static final void O(int[] var0, int var1) {
      int[] var20 = dC[var0[1]];
      byte[] var19 = cC[var0[2]];
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
               cD = var18 - 1;
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
               sd = true;
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
            dC[var16][1] = 0;
            break;
         case 5:
            dC[var16][1] = 1;
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
               var0[var12++] = fC;
               break label428;
            case 1:
               var0[var12++] = gC;
               break label428;
            case 2:
               var0[var12++] = hC;
               break label428;
            case 3:
               var0[var12++] = iC;
               break label428;
            case 4:
               var0[var12++] = jC;
            default:
               break label428;
            }
         case 34:
            switch(var16) {
            case 0:
               fC = var15;
               break label428;
            case 1:
               gC = var15;
               break label428;
            case 2:
               hC = var15;
               break label428;
            case 3:
               iC = var15;
               break label428;
            case 4:
               jC = var15;
            default:
               break label428;
            }
         case 35:
            switch(var16) {
            case 0:
               fC += var15;
               break label428;
            case 1:
               gC += var15;
               break label428;
            case 2:
               hC += var15;
               break label428;
            case 3:
               iC += var15;
               break label428;
            case 4:
               jC += var15;
            default:
               break label428;
            }
         case 36:
            if ((na[var16] & 1 << var15) != 0) {
               var0[var12++] = 1;
            } else {
               var0[var12++] = 0;
            }
            break;
         case 37:
            var33 = na;
            var33[var16] |= 1 << var15;
            break;
         case 38:
            var33 = na;
            var33[var16] &= ~(1 << var15);
            break;
         case 39:
            int[] var30 = B(var16, var15);
            var23 = A(var30);
            boolean var28 = true;
            if (var23 != null && ca[11] >= 0) {
               var5 = var30[3];
               var4 = ca[11];
               short var31 = (short)((var30[2] & -65536) >> 16);
               if ((var5 & 128) != 0 && (eA[var4] & 1 << var31) != 0 || (var5 & 64) != 0 && (dA[var4] & 1 << var31) != 0 || (var5 & 32) != 0 && (cA[var4] & 1 << var31) != 0 || (var5 & 256) != 0 && (aA[var4] & 1 << var31) != 0 || (var5 & 512) != 0 && (bA[var4] & 1 << var31) != 0 || (var5 & 1024) != 0 && (gA[var4] & 1 << var31) != 0 || (var5 & 8192) != 0 && (fA[var4] & 1 << var31) != 0) {
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
               ++nA;
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
               --nA;
               if (nA <= 0 && HG.S(oA) != 0) {
                  HG.L();
                  HG.M(oA);
               }
            }
            break;
         case 41:
            I(var16, var15, var14);
            String var29;
            if (ca[11] == -1) {
               var29 = HG.I(85) + " " + HG.I(86);
               if (B.wA == 2) {
                  var21 = 435;
               } else {
                  var21 = 436;
               }
            } else if (ca[11] <= var16) {
               var29 = HG.I(84);
               var21 = 315 + var16;
            } else {
               var29 = HG.I(85);
               var21 = 315 + ca[11];
            }

            A(var29, HG.I(var21), 100, 101);
            var0[0] = 2;
            gd = var0;
            hd = var1;
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
            r.A(HG.eb, var16, var15, var14, false);
            (new Thread(r)).start();
            var11 = true;
            break;
         case 46:
            ca[30] = var16;
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
               F((short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
            }
            break;
         case 48:
            var33 = ea[var16];
            var33[12] &= -65536;
            var33 = ea[var16];
            var33[12] |= 65535;
            break;
         case 49:
            AA(var16);
            break;
         case 50:
            A(var16, var15, var0);
            sd = false;
            var2 = true;
            break;
         case 51:
            if (ld == var16) {
               var18 = var15;
            }
            break;
         case 52:
            HG.bA = B.Q();
            HG.lA.removeAllElements();
            HG.LA(21);
            HG.iA = true;
            break;
         case 53:
            pd = var16;
            break;
         case 54:
            aD = var16;
            yd = var15;
            zd = var14;
            var4 = B(aD, true);
            byte var9 = 1;
            byte var8 = 1;
            if (aD == 2 || aD == 3) {
               var8 = 2;
            }

            var3 = 0;
            if (aD == 2) {
               var3 = 50 + ca[18] * 10;
            }

            if (var4 - var3 >= 80 * var8) {
               var9 = 4;
            } else if (var4 - var3 >= 65 * var8) {
               var9 = 3;
            } else if (var4 - var3 >= 50 * var8) {
               var9 = 2;
            }

            eD = var9;
            if (ca[19] < var9) {
               if (fD) {
                  bD = 0;
               } else {
                  bD = 1;
               }
            } else {
               int var7 = 0;
               if (zd > 0) {
                  if (yd > 0) {
                     var7 = H(2, yd);
                  } else {
                     var7 = ca[46];
                  }

                  if (var7 < zd) {
                     if (fD) {
                        bD = 0;
                     } else {
                        bD = 2;
                     }
                     break;
                  }
               }

               String var27 = "";
               if (zd > 0) {
                  var27 = HG.I(la[yd][0]);
               }

               var5 = 1;
               dD = 0;

               for(var4 = 0; var4 < 3; ++var4) {
                  var21 = var5 * var9;
                  var3 = var5 * zd * var9;
                  if (ca[19] < var21 || var7 < var3) {
                     break;
                  }

                  String var22 = HG.I(aD + 29) + " +" + var5 * var8 + "\n(LP: " + var21;
                  if (zd > 0) {
                     var22 = var22 + " " + var27 + ": " + var3;
                  }

                  var22 = var22 + " )";
                  A(var22);
                  ++dD;
                  if (var5 == 1) {
                     var5 = 5;
                  } else {
                     var5 += 5;
                  }
               }

               AA(83);
               A(od, 471, var0);
               if (fD) {
                  A(od, 472, var0);
               }

               var2 = true;
            }
            break;
         case 55:
            if (ld < dD && bD == -1) {
               byte var6 = 1;
               if (aD == 2 || aD == 3) {
                  var6 = 2;
               }

               var5 = 1;

               for(var3 = 0; var3 < ld; ++var3) {
                  if (var5 == 1) {
                     var5 = 5;
                  } else {
                     var5 += 5;
                  }
               }

               var4 = var5 * eD;
               var3 = var5 * zd * eD;
               A(aD, var5 * var6, true, false, ca);
               A(24, -var4, true, false, ca);
               if (zd > 0) {
                  if (yd > 0) {
                     var4 = (short)yd & '\uffff' | 131072;
                     I(var4, var3);
                  } else {
                     K(-var3);
                  }
               }

               fD = true;
            }

            if (bD == 1) {
               var18 = var15;
               fD = false;
            } else if (bD == 2) {
               var18 = var14;
               fD = false;
            } else if (ld < dD && bD != 0) {
               var18 = cD;
            } else {
               var18 = var16;
               fD = false;
            }

            bD = -1;
            aD = -1;
            yd = -1;
            zd = 0;
            break;
         case 64:
            A(var16, var15, true, false, ca);
            break;
         case 65:
            A(var16, var15, false, false, ca);
            break;
         case 66:
            var23 = B(var16, var15);
            if (A(var16, var23)) {
               var23[3] &= -65537;
               B(var16, var23);
            } else {
               A(HG.I(227), HG.I(230), 101, 106);
               var23[3] &= -65537;
               B.A(var23, (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
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
            if (ca[42] >= 0) {
               var0[var12++] = 1;
            } else {
               var0[var12++] = 0;
            }
            break;
         case 71:
            if (ca[41] >= 0) {
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
            if (wa != null) {
               var33 = ea[var16];
               var33[13] |= 131072;
               var33 = ea[var16];
               var33[20] &= -65536;
               var33 = ea[var16];
               var33[20] |= 65535;
            } else {
               E(var16, var15, var14);
               A(14, var16, var15, var14, 0, false);
            }
         case 42:
            if (wa != null) {
               ea[var16][22] = (short)(var15 * 2) & '\uffff' | (short)(var14 * 2) << 16 & -65536;
               var33 = ea[var16];
               var33[13] |= 65536;
            } else {
               E(var16, var15, var14);
               A(14, var16, var15, var14, 0, false);
            }
            break;
         case 75:
            if (zD != var16) {
               A((int)10, (int)-2, (int)0);
            }

            zD = var16;
            ae = var15;
            be = var14;
            ce = var13;
            break;
         case 76:
            q = true;
            HG.lA.removeAllElements();
            HG.iA = false;
            HG.fA = 0;
            HG.kA = -1;
            break;
         case 80:
            ya[var16][1] = var15;
            var3 = var14 - var15;
            if (var3 > ya[var16][2]) {
               ya[var16][2] = var3;
            }

            if ((short)(ya[var16][0] & '\uffff') == 0) {
               var33 = ya[var16];
               var33[0] &= -65536;
               var33 = ya[var16];
               var33[0] |= 1;
            }

            var33 = ya[var16];
            var33[0] &= 65535;
            var33 = ya[var16];
            var33[0] |= (short)var13 << 16 & -65536;
            break;
         case 81:
            var33 = ya[var16];
            var33[0] &= -65536;
            var33 = ya[var16];
            var33[0] |= 2;
            if (var15 > ya[var16][2]) {
               ya[var16][2] = var15 - ya[var16][1];
            }
         }

         if (var10) {
            var17 = 0;
         }
      } while(!var2 && !var11);

      if (var11) {
         var0[0] = 0;
         pd = -1;
         sd = true;
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
         return (short)(ca[14] & '\uffff');
      } else if ((var0[3] & 32) != 0) {
         int var1 = var0[11];
         return fa[var1][7];
      } else {
         return 0;
      }
   }

   static int T(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(ca[15] & '\uffff');
      } else if ((var0[3] & 32) != 0) {
         int var1 = var0[11];
         return fa[var1][8];
      } else {
         return 0;
      }
   }

   static int U(int[] var0) {
      if ((var0[3] & 16) != 0) {
         return (short)(ca[26] & '\uffff');
      } else {
         return (var0[3] & 32) != 0 ? 0 : 0;
      }
   }

   static int E(int var0, int[] var1) {
      if ((var1[3] & 16) != 0) {
         switch(var0) {
         case 0:
            return (short)(ca[20] & '\uffff') + ca[51];
         case 1:
            return (short)(ca[21] & '\uffff') + ca[51];
         case 2:
            return (short)(ca[22] & '\uffff') + ca[51];
         case 3:
            return (short)(ca[23] & '\uffff') + ca[51];
         case 4:
            return (short)(ca[24] & '\uffff') + ca[51];
         case 5:
            return 10 + ca[51];
         }
      }

      if ((var1[3] & 32) != 0) {
         int var2 = var1[11];
         switch(var0) {
         case 0:
            return fa[var2][17];
         case 1:
            return fa[var2][18];
         case 2:
            return fa[var2][19];
         case 3:
            return fa[var2][20];
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
            return ca[27];
         case 2:
         case 3:
            return ca[28];
         case 4:
            return ca[29];
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
               var2 = ja[ia[var1[16]][4]][11];
            }

            return fa[var3][14] + var2;
         case 2:
         case 3:
            if (var1[16] != -1) {
               var2 = ja[ia[var1[16]][4]][12];
            }

            return fa[var3][15] + var2;
         case 4:
            if (var1[16] != -1) {
               var2 = ja[ia[var1[16]][4]][13];
            }

            return fa[var3][16] + var2;
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
         if (!pA) {
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
         A(25, var6[12], true, false, ca);
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
      if (!R(var2, var1)) {
         return 0;
      } else {
         int var8 = G(var0, var2, var6);
         var6 = F(var0, var2, var6);
         var6 = HG.A(var8, var6);
         if (var7) {
            var6 += ca[48];
            var6 += ca[49];
            var6 += ca[50];
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

   public static int Q(int var0, int var1) {
      return 200 + (var0 << 1) + var1 >> 2;
   }

   public static boolean R(int var0, int var1) {
      return Q(var0, var1) > HG.A((int)100);
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
            var3 = fa[var0[11]][29];
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
         var6 -= ca[47];
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
               if ((fa[var1[11]][13] & 128) != 0) {
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
         return ha[var1][13];
      }
   }

   public static int W(int[] var0) {
      if (var0 == null) {
         return 2;
      } else {
         int var1 = var0[4];
         return ha[var1][11];
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
         return ha[var1][14];
      }
   }

   public static int Y(int[] var0) {
      if (var0 == null) {
         return 100;
      } else {
         int var1 = var0[4];
         return ha[var1][12];
      }
   }

   public static int Z(int[] var0) {
      if (var0 == null) {
         return 5;
      } else {
         int var1 = var0[4];
         return ha[var1][15];
      }
   }

   public static int[] C(int[] var0, int[] var1) {
      int var2;
      for(var2 = 0; var2 < kC.length; ++var2) {
         kC[var2] = -1;
      }

      for(int var3 = 0; var3 < 2; ++var3) {
         if (var0[6 + var3] != -1) {
            var2 = ra[(short)((var0[6 + var3] & -65536) >> 16)][3];
            kC[var3] = (short)var2 & '\uffff' | (short)(var0[6 + var3] & '\uffff') << 16 & -65536;
         }
      }

      for(int var4 = 0; var4 < 5; ++var4) {
         kC[2 + var4] = var1[5 + var4];
      }

      return kC;
   }

   public static void UA() {
      iA = new int[1 + ea.length][15];

      for(int var1 = 0; var1 < iA.length; ++var1) {
         for(int var0 = 0; var0 < iA[var1].length; ++var0) {
            iA[var1][var0] = -1;
         }

         iA[var1][0] = -1;
         iA[var1][4] = -1;
         iA[var1][5] = -1;
         iA[var1][3] = 65536;
      }

   }

   public static void VA() {
      iA = (int[][])null;
   }

   public static void A(int[] var0, int[] var1, int var2, int var3, int var4, int var5) {
      short var6 = (short)(var0[2] & '\uffff');
      iA[var6][0] = var0[0];
      iA[var6][4] = var0[4];
      iA[var6][5] = var0[5];
      iA[var6][6] = var0[4];
      iA[var6][7] = var0[5];
      iA[var6][9] = var0[4];
      iA[var6][10] = var0[5];
      iA[var6][11] = (short)(var0[2] & '\uffff') & '\uffff' | (short)(var1[2] & '\uffff') << 16 & -65536;
      iA[var6][12] = 0 | (short)var4 << 16 & -65536;
      var4 = var0[4] - var1[4];
      int var9 = var0[5] - var1[5];
      if (var4 <= 32767 && var4 >= -32768 && var9 <= 32767 && var9 >= -32768) {
         var9 = F(var4 * var4 + var9 * var9);
         var9 = 10 * var9 / (var2 + 1) + 1;
      } else {
         var9 = 10;
      }

      iA[var6][13] = (short)var9 & '\uffff' | (short)var9 << 16 & -65536;
      iA[var6][8] = (short)lC[var3 * 7 + 5] & '\uffff' | (short)lC[var3 * 7 + 5] << 16 & -65536;
      iA[var6][14] = (short)var3 & '\uffff' | (short)var5 << 16 & -65536;
      int[] var10000 = iA[var6];
      var10000[3] &= -65537;
      B.C(iA[var6]);
      if ((var0[3] & 16) != 0) {
         int var7 = Z(BA());
         short var8;
         if (var7 == 2) {
            var8 = (short)(ca[53] & '\uffff');
            var7 = var8 - 1;
            var10000 = ca;
            var10000[53] &= -65536;
            var10000 = ca;
            var10000[53] |= (short)var7 & '\uffff';
         } else if (var7 == 3) {
            var8 = (short)((ca[53] & -65536) >> 16);
            var7 = var8 - 1;
            var10000 = ca;
            var10000[53] &= 65535;
            var10000 = ca;
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
            if ((fa[B.a[var1][11]][13] & 128) != 0) {
               D((short)((B.a[var1][2] & -65536) >> 16), true);
            }
         }
      }

      int var3;
      if (var1 != -1 && ((B.a[var1][3] & 16) != 0 || (B.a[var1][3] & 32) != 0)) {
         var4 = B.a[var1];
         B.D(var4, mC);
         var3 = var0[4] - var0[6];
         int var6 = var0[5] - var0[7];
         var0[6] = mC[0];
         var0[7] = mC[1];
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
      for(int var9 = 0; var9 < iA.length; ++var9) {
         if ((iA[var9][3] & 65536) == 0) {
            short var8 = (short)(iA[var9][14] & '\uffff');
            int[] var0 = B.a[(short)((iA[var9][11] & -65536) >> 16)];
            short var7 = (short)((iA[var9][13] & -65536) >> 16);
            short var6 = (short)(iA[var9][13] & '\uffff');
            int var12 = var6 - 1;
            if (var12 == 0) {
               P(iA[var9], (short)((iA[var9][11] & -65536) >> 16));
            } else {
               int[] var10000 = iA[var9];
               var10000[13] &= -65536;
               var10000 = iA[var9];
               var10000[13] |= (short)var12 & '\uffff';
               int var5 = iA[var9][9] - var0[4];
               int var4 = iA[var9][10] - var0[5];
               int var3 = F(var5 * var5 + var4 * var4);
               if (var3 == 0) {
                  var10000 = iA[var9];
                  var10000[3] |= 65536;
                  B.D(iA[var9]);
               } else {
                  int var2 = iA[var9][6];
                  int var1 = iA[var9][7];
                  iA[var9][6] = var5 * var12 / var7 + var0[4];
                  iA[var9][7] = var4 * var12 / var7 + var0[5];
                  int var10 = B.A(var2, var1, iA[var9][6], iA[var9][7], 4144, nC, true);
                  if (var10 != -2 && var10 != (short)(iA[var9][11] & '\uffff')) {
                     if (var10 == -1) {
                        P(iA[var9], -1);
                     } else {
                        P(iA[var9], var10);
                     }
                  } else {
                     iA[var9][4] = iA[var9][6] + var5 * lC[var8 * 7 + 4] / var3;
                     iA[var9][5] = iA[var9][7] + var4 * lC[var8 * 7 + 4] / var3;
                     short var11 = (short)((iA[var9][8] & -65536) >> 16);
                     var3 = var11 + lC[var8 * 7 + 6] * (var12 - (var7 >> 1));
                     if (((short)((iA[var9][14] & -65536) >> 16) & 1) != 0) {
                        B(var2, var1, var11, nC[0] - var2, nC[1] - var1, var3 - var11, 2);
                     }

                     if (((short)((iA[var9][14] & -65536) >> 16) & 2) != 0) {
                        A(var2, var1, var11, nC[0] - var2, nC[1] - var1, var3 - var11, 2);
                     }

                     iA[var9][8] = (short)var11 & '\uffff' | (short)var3 << 16 & -65536;
                     B.D(iA[var9]);
                     var1 = iA[var9][4] >> 12;
                     var10 = iA[var9][5] >> 12;
                     iA[var9][0] = (short)var1 & '\uffff' | (short)var10 << 16 & -65536;
                     B.C(iA[var9]);
                  }
               }
            }
         }
      }

   }

   public static void C(int[] var0, Graphics var1) {
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
      var5.setColor(lC[8]);
      var5.drawLine(var0, var1, var2, var6);
      short var7 = (short)(var4 & '\uffff');
      short var8 = (short)((var4 & -65536) >> 16);
      var1 -= var7 * B.d >> 12;
      var3 = var6 - (var8 * B.d >> 12);
      var5.setColor(lC[7]);
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
      var5.setColor(lC[1]);
      var5.drawLine(var0, var6, var1, var2);
      short var7 = (short)(var4 & '\uffff');
      short var13 = (short)((var4 & -65536) >> 16);
      int var12 = var6 - (var7 * B.d >> 12);
      int var11 = var2 - (var13 * B.d >> 12);
      var5.setColor(lC[0]);
      var5.drawLine(var0, var12, var1, var11);
      int var10 = (var0 * 26 + var1 * 6) / 32;
      int var9 = (var12 * 26 + var11 * 6) / 32;
      int var8 = (var0 * 28 + var1 * 4) / 32;
      int var14 = (var12 * 28 + var11 * 4) / 32;
      var6 = (var0 * 30 + var1 * 2) / 32;
      var4 = (var12 * 30 + var11 * 2) / 32;
      var3 = (var0 * 2 + var1 * 30) / 32;
      var2 = (var12 * 2 + var11 * 30) / 32;
      var5.setColor(lC[2]);
      var5.drawLine(var3, var2, var1, var11);
      var5.setColor(lC[3]);
      var5.drawLine(var10, var9, var8, var14);
      var5.drawLine(var6, var4, var0, var12);
   }

   public static void I(int var0, int var1, int var2) {
      tC = var0;
      uC = var1;
      vC = var2;
   }

   public static void A(String var0, String var1, int var2, int var3, int var4, int var5, int var6) {
      A(var0, var1, var2, var3);
      pC = true;
      ad = var4;
      bd = var5;
      cd = ad;
      sC = "";
      ed = var6;

      for(int var7 = 0; var7 < qC.length; ++var7) {
         if (qC[var7].indexOf("@1") >= 0) {
            fd = var7;
         } else if (qC[var7].indexOf("@x") >= 0) {
            dd = var7;
         }
      }

   }

   public static void A(String var0, String var1, int var2, int var3) {
      pC = false;
      dd = -1;
      fd = -1;
      Font var4 = j[2];
      qC = HG.A(var0, var4, f - 5 - 5, 0);
      rC = var1;
      int var6 = j[2].getHeight() * qC.length + 4;
      if (var6 < g >> 2) {
         var6 = g >> 2;
      } else if (var6 > g * 2 / 3) {
         var6 = g * 2 / 3;
      }

      int var5 = j[2].getHeight() + 3;
      yC = var6 + var5 + cc[1486] + 3 + 2;
      zC = g - yC >> 1;
      A(8, 5, zC + 2, f - 5 - 5, var5 + 5, 532);
      A(7, 5, zC + var5 + 2, f - 5 - 5, var6 + 5, 33);
      A((int)8, (int)-2, (int)0);
      wC = var2;
      xC = var3;
      oC = true;
   }

   public static void D(int var0, int var1, int var2, int var3) {
      A(HG.I(var0), HG.I(var1), var2, var3);
   }

   public static void M(Graphics var0) {
      int var2 = cc[1486] + 5;
      int var1 = j[2].getHeight() + 3;
      var0.setColor(i[6]);
      var0.fillRect(0, zC, f, yC);
      var0.setColor(i[3]);
      var0.fillRect(3, zC + var1 + 2, f - 6, yC - (var2 + var1) - 2);
      var0.fillRect(3, zC + yC + 2 - var2, f - 6, var2 - 5);
      var0.setColor(i[8]);
      var0.fillRect(3, zC + 3, f - 6, var1 - 3);
      var0.setColor(i[5]);
      var0.drawRect(1, zC + 1, f - 3, yC - 3);
      var0.drawRect(1, zC + var1, f - 3, yC - (var2 + var1));
      B(1, zC + 1, 152, 0, var0);
      B(f - 1, zC + 1, 152, 0, 0, 2, var0);
      if (pC) {
         var1 = cc[1639] / cc[1644];
         B((f >> 1) - var1, zC + yC - var2 + 4, 149, 0, var0);
         B(f >> 1, zC + yC - var2 + 4, 149, 1, var0);
      }

      var1 = cc[1485] / cc[1490];
      if (wC != 106) {
         B(4 + (var1 >> 1), zC + yC - 3, 135, 0, var0);
      }

      if (xC != 106) {
         B(f - 2 - (var1 >> 1), zC + yC - 3, 135, 1, var0);
      }

   }

   public static void N(Graphics var0) {
      var0.setClip(0, 0, f, g);
      M(var0);
      A((String)rC, 8, 2, var0);
      if (pC) {
         String var4 = "";
         String var3 = "";
         int var1;
         int var2;
         String var5;
         if (fd >= 0) {
            var4 = qC[fd];
            var2 = var4.indexOf("@1");
            var1 = var4.lastIndexOf(64);
            if (var1 <= var2) {
               var1 = var2 + 1;
            }

            var5 = var4.substring(0, var2) + ed * cd + var4.substring(var1 + 1);
            qC[fd] = var5;
         }

         if (dd >= 0) {
            var3 = qC[dd];
            var2 = var3.indexOf("@x");
            var1 = var3.lastIndexOf(64);
            if (var1 <= var2) {
               var1 = var2 + 1;
            }

            var5 = var3.substring(0, var2) + cd + var3.substring(var1 + 1);
            qC[dd] = var5;
         }

         A((String[])qC, 7, 2, var0);
         if (dd >= 0) {
            qC[dd] = var3;
         }

         if (fd >= 0) {
            qC[fd] = var4;
         }
      } else {
         A((String[])qC, 7, 2, var0);
      }

   }

   public static void XA() {
      if (C(80) && wC != 106) {
         oC = false;
         pC = false;
         HG.DA(wC);
      }

      if (C(85) && xC != 106) {
         oC = false;
         pC = false;
         HG.DA(xC);
      }

      if (pC) {
         boolean var0 = false;
         if (C(116)) {
            ++cd;
            if (cd > bd) {
               cd = ad;
            }

            sC = "";
         }

         if (C(117)) {
            --cd;
            if (cd < ad) {
               cd = bd;
            }

            sC = "";
         }

         if (C(118)) {
            sC = sC + "0";
            var0 = true;
         }

         if (C(101)) {
            sC = sC + "1";
            var0 = true;
         }

         if (C(102)) {
            sC = sC + "2";
            var0 = true;
         }

         if (C(103)) {
            sC = sC + "3";
            var0 = true;
         }

         if (C(104)) {
            sC = sC + "4";
            var0 = true;
         }

         if (C(115)) {
            sC = sC + "5";
            var0 = true;
         }

         if (C(105)) {
            sC = sC + "6";
            var0 = true;
         }

         if (C(106)) {
            sC = sC + "7";
            var0 = true;
         }

         if (C(107)) {
            sC = sC + "8";
            var0 = true;
         }

         if (C(108)) {
            sC = sC + "9";
            var0 = true;
         }

         if (C(95)) {
            sC = "";
            cd = 0;
         }

         if (var0) {
            int var1 = 0;

            try {
               var1 = Integer.parseInt(sC);
            } catch (Exception var2) {
            }

            cd = var1;
            if (cd < ad) {
               cd = ad;
               sC = "";
            } else if (cd > bd) {
               cd = bd;
               sC = "";
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
         byte[] var2 = (byte[])hD.get(new Integer(var0));
         String var5 = null;
         if (var2 == null) {
            return "lol :D";
         } else {
            switch(iD) {
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
      if (cC != null) {
         hD.clear();
         Vector var10 = new Vector();

         int var1;
         int var3;
         for(var3 = 0; var3 < cC.length; ++var3) {
            byte[] var2 = cC[var3];
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
                        String var13 = "/" + HG.t + "." + HG.l[1 + var9] + "." + "lng";
                        InputStream var8 = HG.fb.getClass().getResourceAsStream(var13);
                        if (var8 == null) {
                           System.err.println("couldn't open lang file");
                        } else {
                           int var7 = var8.available();
                           byte[] var18 = new byte[5];
                           var8.read(var18, 0, 5);
                           iD = var18[2];
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
                                    hD.put(var10.elementAt(var3), var14);
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
      hD.clear();
   }

   public static void BB() {
      ud = cc[1617] / cc[1622] >> 1;
      vd = cc[1618] / cc[1623];
      wd = f - (2 * ud + 8 + 8);
      xd = g - (cc[1607] + cc[1387] + 2 * vd + 5 + 4);
      ud += 8;
      vd += 5;
      pd = -1;
   }

   public static void AA(int var0) {
      A(Z(var0));
   }

   public static void A(String var0) {
      Font var2 = j[2];
      int var1 = cc[1683] + 16;
      jd.addElement(HG.A(var0, var2, wd - var1, 0));
   }

   public static void A(int var0, int var1, int[] var2) {
      A((int)10, (int)-2, (int)0);
      if (pd < 0) {
         if (ub == 1 && tb >= 0) {
            int[] var3 = A(B.a[tb]);
            if (var3 != null) {
               pd = var3[0];
            }
         }

         if (pd < 0) {
            pd = 0;
         }
      }

      Font var4 = j[2];
      int var6 = j[2].getHeight();
      kd = HG.A(Z(var1), var4, wd, 0);
      A(9, ud, vd, wd, xd, 113);
      A((int)9, (int)0, (int)-2);
      A(9, 15 + cc[1695]);
      nd = 0;

      for(int var7 = 0; var7 < jd.size(); ++var7) {
         String[] var5 = (String[])jd.elementAt(var7);
         nd += var6 * var5.length + 10;
      }

      ld = 0;
      id = true;
      qd = var2;
      md = 0;
      od = var0;
      if (qd != null) {
         qd[0] = 2;
      }

      nd += 10 + cc[1695];
      rd = false;
      if (qd != null && sd) {
         td = System.currentTimeMillis() + 500L;
      } else {
         td = -1L;
      }

   }

   public static void O(Graphics var0) {
      A(9, ud, vd, wd, xd);
      A((String[])kd, 9, 2, var0);
      int var1 = vd + j[2].getHeight() * kd.length + 10 + z[29];
      var0.setClip(ud, vd, wd, xd - 1);
      B(f >> 1, var1, 154, 0, var0);
      B(f >> 1, var1, 154, 0, 0, 2, var0);
   }

   public static void P(Graphics var0) {
      A(10, ud, vd, wd, xd);
      int var6 = md;
      int var5 = j[2].getHeight();
      int var4 = cc[1683] + 16;
      int var3 = (var5 - cc[1684] >> 1) + 5;

      for(int var2 = 0; var2 < jd.size(); ++var2) {
         A(10, ud + var4, vd + var6 + 5, wd - var4, xd - var6 + 5, 305);
         String[] var1 = (String[])jd.elementAt(var2);
         var0.setClip(ud, vd, wd, xd - 1);
         if (var2 == ld) {
            var0.setColor(i[13]);
            var0.fillRect(ud, vd + var6, wd, var5 * var1.length + 10);
            var0.setColor(i[5]);
         }

         B(ud + 8, vd + var6 + var3, 153, 0, var0);
         var6 += var5 * var1.length + 10;
         A((String[])var1, 10, 2, var0);
      }

      var0.setClip(ud, vd, wd, xd - 1);
      B(f >> 1, vd + var6 + 5, 154, 0, var0);
      B(f >> 1, vd + var6 + 5, 154, 0, 0, 2, var0);
   }

   public static void Q(Graphics var0) {
      var0.setClip(0, 0, f, g);
      boolean var7 = false;
      boolean var6 = false;
      if (rd) {
         A(var0, false, false, false, 126);
      } else {
         A(var0, false, false, false, od);
      }

      var0.setClip(ud, vd, wd, xd - 1);
      var0.setColor(i[5]);
      int var5 = cc[1639] / cc[1644];
      short var4 = cc[1640];
      int var3 = vd + xd + 3;
      if (rd) {
         P(var0);
         if (md > xd - nd) {
            var7 = true;
         }

         if (md < 0) {
            var6 = true;
         }

         var0.setClip(0, 0, f, g);
         B(ud, var3, 160, 1, var0);
         B(cc[1606] >> 1, g, 136, 3, var0);
         A((Graphics)var0, 126, (String)HG.I(174));
      } else {
         O(var0);
         int var2 = kd.length * j[2].getHeight() + y[109];
         short var1 = z[29];
         if (var1 > xd - var2) {
            var7 = true;
         }

         if (var1 < 0) {
            var6 = true;
         }

         var0.setClip(0, 0, f, g);
         if (!jd.isEmpty()) {
            B(ud + wd - var4, var3, 160, 0, var0);
         }

         B(cc[1606] >> 1, g, 136, 3, var0);
         A(var0, od, HG.I(pd));
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
      var0.setColor(i[8]);
      var0.fillRect(var5, var1, var4, var3);
      var0.setColor(i[6]);
      var0.drawRect(var5, var1 + 1, var4 - 1, var3 - 1);
      var0.setColor(i[5]);
      var0.drawRect(var5, var1, var4 - 1, var3 - 1);
      B(var5, var1, 152, 0, var0);
      B(f - 1, var1, 152, 0, 0, 2, var0);
      A(10, var5 + 4, var1 + 4, var4 - 8, var3 - 8, 156);
      A((String)var2, 10, 2, var0);
   }

   public static void CB() {
      if (qd != null) {
         qd[0] = 1;
      }

      id = false;
      jd.removeAllElements();
      qd = null;
      if (gD) {
         pd = -1;
      }

      gD = false;
   }

   public static void DB() {
      if (C(80) || C(65)) {
         if (!rd && !jd.isEmpty()) {
            rd = true;
         } else if (td < 0L || System.currentTimeMillis() >= td) {
            CB();
         }
      }

      int var0;
      String[] var10000;
      int var4;
      short[] var9;
      if (C(55)) {
         if (rd) {
            var4 = j[2].getHeight();
            boolean var3 = nd > xd;
            if (!var3) {
               --ld;
            } else {
               int var2 = vd + md;
               boolean var1 = false;
               var0 = ld - 1;
               if (var0 < 0) {
                  for(var0 = 0; var0 < ld; ++var0) {
                     var2 += ((String[])jd.elementAt(var0)).length * var4 + 10;
                  }

                  if (var2 >= vd) {
                     --ld;
                  }

                  var1 = true;
               } else {
                  for(var0 = 0; var0 < ld; ++var0) {
                     var2 += ((String[])jd.elementAt(var0)).length * var4 + 10;
                  }

                  var10000 = (String[])jd.elementAt(ld);
                  if (var2 > xd / 2) {
                     --ld;
                     var1 = true;
                  }
               }

               md += var4;
               if (md > 0) {
                  md = 0;
                  if (!var1) {
                     --ld;
                  }
               }
            }

            if (ld < 0) {
               ld = jd.size() - 1;
               if (var3) {
                  md = xd - nd;
               }
            }
         } else {
            var9 = z;
            var9[29] = (short)(var9[29] + j[2].getHeight());
         }
      }

      if (C(60)) {
         if (rd) {
            var4 = j[2].getHeight();
            boolean var5 = nd > xd;
            if (!var5) {
               ++ld;
            } else {
               int var8 = vd + md;
               boolean var7 = false;
               int var6 = ld + 1;
               if (var6 >= jd.size()) {
                  for(var0 = 0; var0 < ld; ++var0) {
                     var8 += ((String[])jd.elementAt(var0)).length * var4 + 10;
                  }

                  var0 = var8 + ((String[])jd.elementAt(ld)).length * var4 + 20 + cc[1695];
                  if (var0 <= vd + xd) {
                     ++ld;
                  }

                  var7 = true;
               } else {
                  for(var0 = 0; var0 < var6; ++var0) {
                     var8 += ((String[])jd.elementAt(var0)).length * var4;
                  }

                  var10000 = (String[])jd.elementAt(var6);
                  if (var8 < vd + xd / 2) {
                     ++ld;
                     var7 = true;
                  }
               }

               md -= var4;
               if (md < xd - nd) {
                  md = xd - nd;
                  if (!var7) {
                     ++ld;
                  }
               }
            }

            if (ld >= jd.size()) {
               ld = 0;
               md = 0;
            }
         } else {
            var9 = z;
            var9[29] = (short)(var9[29] - j[2].getHeight());
         }
      }

      if (rd && C(61)) {
         rd = false;
      }

      if (!rd && C(62) && !jd.isEmpty()) {
         rd = true;
      }

      D();
   }

   static void BA(int var0) {
      lD = 0;

      for(int var2 = 0; var2 < da[2].length; ++var2) {
         int var1 = da[2][var2][4];
         if (var1 >= 0 && la[var1][6] == 20) {
            lD += da[2][var2][6];
         }
      }

      if (lD > 0) {
         mD = lD;
         jD = (byte)(B.a[var0][8] >> 24 & 255);
         short var3 = (short)((B.a[var0][9] & -65536) >> 16);
         nD = (short)var3 & '\uffff' | (short)var0 << 16 & -65536;
         kD = 0;
         oD = true;
         pD = " x " + lD;
      } else {
         D(239, 230, 101, 106);
      }

   }

   static void R(Graphics var0) {
      if ((na[2] & 128) == 0 && (na[2] & 1) != 0) {
         pd = 174;
         gD = true;
         A(126, 463, (int[])null);
         int[] var10000 = na;
         var10000[2] |= 128;
      } else {
         var0.setClip(0, 0, f, g);
         var0.setColor(i[3]);
         var0.fillRect(0, 0, f, g);
         int var3 = f >> 1;
         int var8 = cc[1838] + 5;
         int var2 = var8 * jD + cc[1772] + cc[1794] + (cc[1805] >> 1);
         int var1 = g - (var2 + cc[1607] + cc[1387]) >> 1;
         var2 += var1;
         var1 = cc[1760] / cc[1765];
         B((f >> 1) + 3 * var1, var2, 160, 0, var0);
         B((f >> 1) - 4 * var1, var2, 160, 1, var0);
         var0.setClip(10, 0, f - 20, f);
         B(var3, var2, 161, 0, var0);
         int var7 = var2 - cc[1772];

         for(int var6 = 0; var6 < jD; ++var6) {
            boolean var5 = false;
            if ((nD & 1 << var6) != 0) {
               var5 = true;
            }

            int var4;
            if (kD > var6) {
               var4 = (f - cc[1782] >> 1) - cc[1837] - 10 >> 1;
            } else {
               var4 = (f - cc[1782] >> 1) - cc[1837] - 10;
            }

            for(var1 = 0; var1 < var8; var1 += cc[1805]) {
               B(f >> 1, var7 - var1, 162, 0, var0);
               if (kD > var6) {
                  B(f >> 1, var7 - var1, 164, 0, var0);
               } else if (kD == var6) {
                  B(f >> 1, var7, 168, 0, var0);
               }
            }

            var3 = cc[1782] >> 1;
            var1 = 0;
            if (kD > var6) {
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
            if (kD > var6) {
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
               if (kD > var6) {
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
         var1 = f - j[2].stringWidth(pD) - (cc[1507] / cc[1512] >> 1) - 5;
         B(var1, var2, 137, 6, var0);
         var1 += cc[1507] / cc[1512] >> 1;
         var2 -= var3 >> 1;
         var0.setColor(i[5]);
         var0.setFont(j[2]);
         var0.drawString(pD, var1 + 0, var2 + 0, 20);
         A((Graphics)var0, 1);
         B(f - (cc[1606] >> 1), g, 136, 1, var0);
      }
   }

   static boolean EB() {
      int var0 = 100 - (short)(ca[25] & '\uffff');
      return var0 >= 0 && HG.A((int)100) <= var0;
   }

   static void FB() {
      int var2 = mD - lD;

      for(int var1 = 0; var1 < da[2].length; ++var1) {
         int var0 = da[2][var1][4];
         if (var0 >= 0 && la[var0][6] == 20) {
            var0 = (short)var0 & '\uffff' | 131072;
            I(var0, var2);
            break;
         }
      }

   }

   static void GB() {
      if (C(61)) {
         if ((nD & 1 << kD) != 0) {
            kD = 0;
            if (EB()) {
               --lD;
               HG.M(32);
               pD = " x " + lD;
            }
         } else {
            ++kD;
         }
      } else if (C(62)) {
         if ((nD & 1 << kD) == 0) {
            kD = 0;
            if (EB()) {
               --lD;
               HG.M(32);
               pD = " x " + lD;
            }
         } else {
            ++kD;
         }
      } else if (C(85)) {
         oD = false;
         FB();
      }

      if (kD >= jD) {
         short var2 = (short)((nD & -65536) >> 16);
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
         oD = false;
         FB();
         F((short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
      }

      if (lD <= 0) {
         D(239, 230, 101, 106);
         FB();
         oD = false;
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
      A((Graphics)var0, 0);
      if (!db && !eb) {
         if (gB == -1) {
            L(var0);
         }
      } else {
         G(var0);
      }

      I(var0);
      var0.setClip(0, 0, f, g);
      B(cc[1606] >> 1, g, 136, 2, var0);
      B(f - (cc[1606] >> 1), g, 136, 1, var0);
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
            if ((short)(ca[53] & '\uffff') == 0) {
               var5 = 143;
            } else if ((short)(ca[53] & '\uffff') <= 10) {
               var5 = 142;
            } else {
               var5 = 141;
            }
            break;
         case 3:
            if ((short)((ca[53] & -65536) >> 16) == 0) {
               var5 = 143;
            } else if ((short)((ca[53] & -65536) >> 16) <= 10) {
               var5 = 142;
            } else {
               var5 = 141;
            }
            break;
         default:
            var5 = 139;
         }

         if (ca[45] != -1) {
            int[] var7 = A(da[4][ca[45]]);
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
         short var2 = (short)(ca[12] & '\uffff');
         short var4 = (short)((ca[12] & -65536) >> 16);
         if (var4 == 0) {
            var1 = 32;
         } else {
            var1 = 32 * var2 / var4;
         }

         var0.setColor(16711680);
         var0.fillRect(33, var3 + 2 + 32 - var1, 5, var1);
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
         short var3 = (short)(ca[13] & '\uffff');
         short var6 = (short)((ca[13] & -65536) >> 16);
         if (var6 == 0) {
            var2 = 32;
         } else {
            var2 = 32 * var3 / var6;
         }

         var0.setColor(8421631);
         var0.fillRect(var5 + 2 + var1, var4 + 2 + 32 - var2, 5, var2);
      }
   }

   public static void IB() {
      if (qD == null) {
         qD = new int[10][11];
         rD = new int[10][];
      }

      for(int var0 = 0; var0 < qD.length; ++var0) {
         qD[var0][6] = -1;
         qD[var0][0] = -1;
         qD[var0][4] = -1;
         qD[var0][5] = -1;
         qD[var0][3] = 0;
      }

   }

   public static void DA(int var0) {
      if (!sD) {
         int var1 = KB();
         if (var1 >= 0) {
            int var3 = da[4][var0][4];
            int[] var2 = va[var3];
            var0 = var2[4] * (short)((ca[13] & -65536) >> 16) / 100;
            if (var0 > (short)(ca[13] & '\uffff')) {
               return;
            }

            if ((short)((var2[6] & -65536) >> 16) > 0) {
               rD[var1] = null;
            } else if ((short)(var2[6] & '\uffff') == 0) {
               rD[var1] = ca;
            } else if (gB >= 0) {
               rD[var1] = ea[gB];
            } else {
               rD[var1] = null;
               var0 = var2[7] * 4096 / 10;
               switch(ca[30]) {
               case 0:
                  qD[var1][9] = ca[4];
                  qD[var1][10] = ca[5] - var0;
                  break;
               case 1:
                  qD[var1][9] = ca[4] + var0;
                  qD[var1][10] = ca[5];
                  break;
               case 2:
                  qD[var1][9] = ca[4];
                  qD[var1][10] = ca[5] + var0;
                  break;
               case 3:
                  qD[var1][9] = ca[4] - var0;
                  qD[var1][10] = ca[5];
               }
            }

            int[] var10000 = qD[var1];
            var10000[6] &= -256;
            var10000 = qD[var1];
            var10000[6] |= (byte)var3 & 255;
            var10000 = qD[var1];
            var10000[6] &= -65281;
            var10000 = qD[var1];
            var10000[6] |= 256;
            var10000 = qD[var1];
            var10000[6] &= -16711681;
            var10000 = qD[var1];
            var10000[6] |= 0;
            var10000 = qD[var1];
            var10000[6] &= 16777215;
            var10000 = qD[var1];
            var10000[6] |= 33554432;
            if (var2[5] == -1 && !sD) {
               HG.M(var2[9]);
            }

            qD[var1][7] = 0;
            qD[var1][8] = 655360;
            qD[var1][4] = ca[4];
            qD[var1][5] = ca[5];
            sD = true;
            D();
            F();
         }
      } else {
         sD = false;
         D();
         F();
      }

   }

   public static void JB() {
      for(int var5 = 0; var5 < qD.length; ++var5) {
         if (qD[var5][6] != -1) {
            int[] var4 = va[(byte)(qD[var5][6] & 255)];
            int var3 = var4[4] * (short)((ca[13] & -65536) >> 16) / 100;
            if (var3 < 1) {
               var3 = 1;
            }

            int var0;
            int[] var10000;
            int var1;
            byte var6;
            if ((byte)(qD[var5][6] >> 16 & 255) == 0) {
               if ((short)(var4[6] & '\uffff') != 0 && gB >= 0 && !B.A(ca, ea[gB], var4[7] * 4096 / 10)) {
                  A(1, var3 * ((byte)(qD[var5][6] >> 8 & 255) - 1), true, false, ca);
                  qD[var5][6] = -1;
                  sD = false;
               } else {
                  byte var8 = (byte)(qD[var5][6] >> 8 & 255);
                  int var9 = var4[5];
                  var6 = (byte)(qD[var5][6] >> 24 & 255);
                  if (var6 >= 0 && sD) {
                     if (gB != -1) {
                        ca[30] = N(ea[gB][4] - ca[4], ea[gB][5] - ca[5]);
                        N(ca, 12 + ca[30]);
                     }

                     var0 = var6 - 1;
                     var10000 = qD[var5];
                     var10000[6] &= 16777215;
                     var10000 = qD[var5];
                     var10000[6] |= (byte)var0 << 24 & -16777216;
                  } else if ((short)(ca[13] & '\uffff') - var3 >= 0 && sD) {
                     if (var9 == -1) {
                        if (!B(var5, var8, rD[var5])) {
                           A(1, -var3, true, false, ca);
                           lB = 10;
                           qD[var5][6] = -1;
                           sD = false;
                           continue;
                        }

                        var8 = 0;
                     }

                     A(1, -var3, true, false, ca);
                     var1 = var8 + 1;
                     var10000 = qD[var5];
                     var10000[6] &= -65281;
                     var10000 = qD[var5];
                     var10000[6] |= (byte)var1 << 8 & '\uff00';
                     var10000 = qD[var5];
                     var10000[6] &= 16777215;
                     var10000 = qD[var5];
                     var10000[6] |= 33554432;
                  } else {
                     if ((short)((var4[6] & -65536) >> 16) > 0) {
                        short var7;
                        short var10;
                        if ((short)(var4[6] & '\uffff') == 0) {
                           var10 = (short)(ca[0] & '\uffff');
                           var7 = (short)((ca[0] & -65536) >> 16);
                           qD[var5][0] = (short)var10 & '\uffff' | (short)var7 << 16 & -65536;
                           qD[var5][4] = ca[4];
                           qD[var5][5] = ca[5];
                           qD[var5][9] = ca[4];
                           qD[var5][10] = ca[5];
                        } else if (gB >= 0 && rD[var5] == null) {
                           var10 = (short)(ea[gB][0] & '\uffff');
                           var7 = (short)((ea[gB][0] & -65536) >> 16);
                           qD[var5][0] = (short)var10 & '\uffff' | (short)var7 << 16 & -65536;
                           qD[var5][4] = ea[gB][4];
                           qD[var5][5] = ea[gB][5];
                           qD[var5][9] = ea[gB][4];
                           qD[var5][10] = ea[gB][5];
                        } else {
                           qD[var5][4] = ca[4];
                           qD[var5][5] = ca[5];
                           qD[var5][9] = ca[4];
                           qD[var5][10] = ca[5];
                        }
                     }

                     if (var9 != -1) {
                        A(1, -var3, true, false, ca);
                        N(ca, 8 + ca[30]);
                        var10000 = qD[var5];
                        var10000[6] &= -16711681;
                        var10000 = qD[var5];
                        var10000[6] |= 131072;
                        HG.M(var4[9]);
                        B.A(qD[var5], (short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
                     } else {
                        qD[var5][6] = -1;
                        N(ca, 0 + ca[30]);
                     }

                     sD = false;
                     lB = 10;
                  }
               }
            } else if ((byte)(qD[var5][6] >> 16 & 255) == 3) {
               byte var2 = (byte)(qD[var5][6] >> 8 & 255);
               var0 = var4[5];
               if (var4[3] > 0) {
                  var1 = var0 * (var2 >> 1);
               } else {
                  var1 = var0 * var2;
               }

               if (var1 <= 0) {
                  var10000 = qD[var5];
                  var10000[6] &= -16711681;
                  var10000 = qD[var5];
                  var10000[6] |= 262144;
               } else {
                  var6 = (byte)(qD[var5][6] >> 24 & 255);
                  if (var6 < 0) {
                     var10000 = qD[var5];
                     var10000[6] &= 16777215;
                     var10000 = qD[var5];
                     var10000[6] |= 167772160;
                     B(var5, var2, rD[var5]);
                     var10000 = qD[var5];
                     var10000[7] += 10;
                     if (qD[var5][7] >= var1 * var3) {
                        if (var4[8] == 3) {
                           B(var5, var2, rD[var5]);
                        }

                        var10000 = qD[var5];
                        var10000[6] &= -16711681;
                        var10000 = qD[var5];
                        var10000[6] |= 262144;
                     }
                  } else {
                     var0 = var6 - 1;
                     var10000 = qD[var5];
                     var10000[6] &= 16777215;
                     var10000 = qD[var5];
                     var10000[6] |= (byte)var0 << 24 & -16777216;
                  }

                  E(var5, true);
               }
            } else if ((byte)(qD[var5][6] >> 16 & 255) == 2) {
               if (!EA(var5)) {
                  var10000 = qD[var5];
                  var10000[6] &= -16711681;
                  var10000 = qD[var5];
                  var10000[6] |= 196608;
                  var10000 = qD[var5];
                  var10000[6] &= 16777215;
                  var10000 = qD[var5];
                  var10000[6] |= 167772160;
                  var6 = (byte)(qD[var5][6] >> 8 & 255);
                  B(var5, var6, rD[var5]);
               }
            } else if ((byte)(qD[var5][6] >> 16 & 255) == 4 && !E(var5, false)) {
               qD[var5][6] = -1;
               B.A(qD[var5], -1, -1);
            }
         }
      }

   }

   public static boolean E(int var0, boolean var1) {
      short var3 = (short)(qD[var0][8] & '\uffff');
      short var2 = (short)((qD[var0][8] & -65536) >> 16);
      int var4 = var3 + 1;
      if (var4 >= var2) {
         if (!var1) {
            return false;
         }

         var4 = 0;
      }

      int[] var10000 = qD[var0];
      var10000[8] &= -65536;
      var10000 = qD[var0];
      var10000[8] |= (short)var4 & '\uffff';
      return true;
   }

   public static boolean B(int var0, int var1, int[] var2) {
      int[] var7 = va[(byte)(qD[var0][6] & 255)];
      int var6 = var7[5];
      int var4 = (short)((var7[6] & -65536) >> 16) * 4096;
      short var3 = (short)(var7[6] & '\uffff');
      int var5 = var7[4] * (short)((ca[13] & -65536) >> 16) / 100;
      if (var5 < 1) {
         var5 = 1;
      }

      if (var2 != null) {
         G(var0, var2);
      }

      if ((short)((var7[6] & -65536) >> 16) > 0 && var2 == null) {
         if (var3 == 0 || var3 == 2) {
            B(var0, var1, ca);
         }

         tD[0] = qD[var0][9] - var4;
         tD[2] = qD[var0][9] + var4;
         tD[1] = qD[var0][10] - var4;
         tD[3] = qD[var0][10] + var4;

         for(int var10 = B.A((int[])tD, 32); var10 != -1; var10 = (short)((B.a[var10][1] & -65536) >> 16)) {
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
               if (var6 < 0 && (short)(ca[12] & '\uffff') == (short)((ca[12] & -65536) >> 16)) {
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
               if (var6 < 0 && (short)(ca[12] & '\uffff') <= 0) {
                  return false;
               }

               A(0, -var0, true, false, var2);
            }

            if (var11) {
               if ((short)(var2[20] & '\uffff') == -1 || (short)(var2[26] & '\uffff') < 3) {
                  short var9 = (short)(ca[2] & '\uffff');
                  var2[20] &= -65536;
                  var2[20] |= (short)var9 & '\uffff';
                  var2[22] = F(ca);
                  var2[26] = 10;
                  if ((fa[var2[11]][13] & 128) != 0) {
                     D((short)((var2[2] & -65536) >> 16), true);
                  }
               }

               A(var0, var2, ca);
               H(gB);
            }
            break;
         case 2:
            if (var11 && qD[var0][7] == 0 && fa[var2[11]][27] != 4) {
               var2[13] |= 128;
               var2[20] = -1;
               var2[22] = F(var2);
               var2[25] = var6 * var1 * var5 * (100 - F(4, var2)) / 100;
            }

            if (var2[25] <= 0) {
               var10000 = qD[var0];
               var10000[6] &= -16711681;
               var10000 = qD[var0];
               var10000[6] |= 262144;
            }
            break;
         case 3:
            if (var11) {
               if (qD[var0][7] >= var6 * var1 * var5 * (100 - F(4, var2)) / 100) {
                  var2[13] &= -9;
                  N(var2, 0 + (short)(var2[27] & '\uffff'));
                  var10000 = qD[var0];
                  var10000[6] &= -16711681;
                  var10000 = qD[var0];
                  var10000[6] |= 262144;
               } else if (qD[var0][7] == 0 && fa[var2[11]][27] != 4) {
                  var2[13] |= 8;
                  N(var2, 16);
                  short var8 = (short)(ca[2] & '\uffff');
                  var2[20] &= -65536;
                  var2[20] |= (short)var8 & '\uffff';
                  if ((fa[var2[11]][13] & 128) != 0) {
                     D((short)((var2[2] & -65536) >> 16), true);
                  }
               }
            }
         }

         return true;
      }
   }

   public static int KB() {
      for(int var0 = 0; var0 < qD.length; ++var0) {
         if (qD[var0][6] == -1) {
            return var0;
         }
      }

      return -1;
   }

   public static boolean EA(int var0) {
      int var4 = qD[var0][4];
      int var3 = qD[var0][5];
      int var1;
      int var2;
      if (rD[var0] != null) {
         var2 = rD[var0][4];
         var1 = rD[var0][5];
      } else {
         var2 = qD[var0][9];
         var1 = qD[var0][10];
      }

      yB[0] = var2 - var4;
      yB[1] = var1 - var3;
      if (B(yB) <= 2048) {
         return false;
      } else {
         A((int[])yB, 2048, (int[])zB);
         var2 = var4 + zB[0];
         var1 = var3 + zB[1];
         var3 = B.A(var4, var3, var2, var1, 4128, uD, true);
         qD[var0][4] = uD[0];
         qD[var0][5] = uD[1];
         var2 = uD[0] >> 12;
         if (uD[0] < 0) {
            --var2;
         }

         var1 = uD[1] >> 12;
         if (uD[1] < 0) {
            --var1;
         }

         B.A(qD[var0], var2, var1);
         if (var2 < 0 || var2 >= B.b || var1 < 0 || var1 >= B.c) {
            var3 = -1;
         }

         if (var3 != -2) {
            if (var3 != -1) {
               if ((B.a[var3][3] & 32) != 0) {
                  rD[var0] = B.a[var3];
               } else {
                  rD[var0] = null;
               }
            } else {
               rD[var0] = null;
            }

            return false;
         } else {
            AA(qD[var0]);
            return true;
         }
      }
   }

   public static void D(int[] var0, Graphics var1) {
      int[] var4 = va[(byte)(var0[6] & 255)];
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
            var7 = 173;
            var6 = 1;
            var5 = 4096;
            var2 = true;
         }
      case 448:
         if (!var2) {
            var7 = 173;
            var6 = 2;
            var5 = 4096;
         }

         if ((byte)(var0[6] >> 16 & 255) == 2) {
            if (rD[var3] != null) {
               B.A(rD[var3], vD);
            } else {
               vD[0] = var0[9];
               vD[1] = var0[10];
            }

            int var11 = vD[0] - var0[4];
            int var9 = vD[1] - var0[5];
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
      jA = new int[64][13];
      kA = new short[64][60];

      for(int var1 = 0; var1 < jA.length; ++var1) {
         for(int var0 = 0; var0 < jA[var1].length; ++var0) {
            jA[var1][var0] = -1;
         }

         jA[var1][0] = -1;
         jA[var1][3] = 0;
      }

      wD = 0;
   }

   public static void PB() {
      jA = (int[][])null;
      kA = (short[][])null;
   }

   public static void QB() {
      for(int var0 = 0; var0 < jA.length; ++var0) {
         if ((jA[var0][3] & 65536) == 0) {
            int var10002 = jA[var0][10]--;
            if (jA[var0][10] <= 0) {
               int[] var10000 = jA[var0];
               var10000[3] |= 65536;
               B.A(jA[var0], -1, -1);
            } else {
               switch(jA[var0][11]) {
               case 0:
                  BA(jA[var0]);
                  break;
               case 1:
                  GA(jA[var0]);
                  break;
               case 2:
                  DA(jA[var0]);
                  break;
               case 3:
                  EA(jA[var0]);
                  break;
               case 4:
                  FA(jA[var0]);
                  break;
               case 5:
                  HA(jA[var0]);
                  break;
               case 6:
                  IA(jA[var0]);
                  break;
               case 7:
                  JA(jA[var0]);
                  break;
               case 8:
                  KA(jA[var0]);
                  break;
               case 9:
                  LA(jA[var0]);
                  break;
               case 10:
                  MA(jA[var0]);
                  break;
               case 11:
                  NA(jA[var0]);
                  break;
               case 12:
                  OA(jA[var0]);
                  break;
               case 13:
                  PA(jA[var0]);
                  break;
               case 14:
                  CA(jA[var0]);
               }
            }
         }
      }

   }

   public static void E(int[] var0, Graphics var1) {
      switch(var0[11]) {
      case 0:
         F(var0, var1);
         break;
      case 1:
         K(var0, var1);
         break;
      case 2:
         H(var0, var1);
         break;
      case 3:
         I(var0, var1);
         break;
      case 4:
         J(var0, var1);
         break;
      case 5:
         L(var0, var1);
         break;
      case 6:
         M(var0, var1);
         break;
      case 7:
         N(var0, var1);
         break;
      case 8:
         O(var0, var1);
         break;
      case 9:
         P(var0, var1);
         break;
      case 10:
         Q(var0, var1);
         break;
      case 11:
         R(var0, var1);
         break;
      case 12:
         S(var0, var1);
         break;
      case 13:
         T(var0, var1);
         break;
      case 14:
         G(var0, var1);
      }

   }

   static void RB() {
      short var3 = 0;
      short var1 = 0;
      short var2 = 0;
      short var0 = 0;
      xD = HG.I(315);
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
      if (j[2].stringWidth(xD) >= f - (var5 << 1)) {
         var6 = 4;
         var5 = 4 + var0;
         yD = var7 + (var0 << 1) + 8;
      } else {
         var6 = 4 + var2;
         var5 = 4;
         if (var7 < var0) {
            var7 = var0;
         }

         yD = var7 + 8;
      }

      int var4 = f - (var6 << 1);
      A(11, var6, var5, var4, var7, 156);
      A((int)11, (int)-2, (int)0);
   }

   static void SB() {
      xD = null;
   }

   static void V(Graphics var0) {
      var0.setClip(0, 0, f, g);
      var0.setColor(i[21]);
      var0.drawRect(0, 0, f - 1, yD - 1);
      var0.setColor(i[20]);
      var0.drawRect(1, 1, f - 3, yD - 3);
      var0.setColor(i[19]);
      var0.fillRect(2, 2, f - 4, yD - 4);
      var0.setColor(i[18]);
      A((String)xD, 11, 2, var0);
      var0.setClip(0, 0, f, g);
      if (W(155) && W(152)) {
         B(1, 1, 152, 0, var0);
         B(f - 1, 1, 152, 0, 0, 2, var0);
         B(0, yD - cc[1673], 155, 0, 0, 0, var0);
         B(f - cc[1672] - 1, yD - cc[1673] - 1, 152, 0, 0, 3, var0);
      }

      if (zD >= 0 && !eb && !db) {
         W(ae);
         if (ae >= 0) {
         }

         B(0, g, 146, 0, var0);
         B(cc[1606] >> 1, g, 136, 3, var0);
         int var2 = g - cc[1607];
         if (ae >= 0) {
            B(0, var2, 138, 0, var0);
            int var1 = 0 + cc[1518];
            B(var1, var2, ae, 0, var0);
         }

         A(var0, ae, HG.I(315 + zD));
      }

   }

   public static void G(int var0, int[] var1) {
      int[] var3 = va[(byte)(qD[var0][6] & 255)];
      B(var0, var1, ee);
      short var2 = -1;
      if (var1 != null) {
         var2 = (short)(var1[2] & '\uffff');
      }

      switch(var3[0]) {
      case 448:
         E(ee[0], ee[1], 4096, var2);
         break;
      case 450:
         K(ee[0], ee[1], var2);
         break;
      case 452:
         H(var0, de);
         E(qD[var0][4], qD[var0][5], 4096, de[0], de[1], 0);
         break;
      case 454:
         S(ee[0], ee[1]);
         break;
      case 456:
         L(ee[0], ee[1], var2);
         if (HG.d) {
            L(ee[0], ee[1], var2);
         }
         break;
      case 458:
         H(var0, de);
         C(qD[var0][4], qD[var0][5], 4096, de[0], de[1], 0);
         break;
      case 460:
         M(ee[0], ee[1], var2);
         T(qD[var0][4], qD[var0][5]);
      }

   }

   public static void AA(int[] var0) {
      int[] var2 = va[(byte)(var0[6] & 255)];
      short var1 = (short)((var0[2] & -65536) >> 16);
      switch(var2[0]) {
      case 448:
         H(var1, de);
         F(var0[4], var0[5], 4096, de[0], de[1], 0);
         break;
      case 452:
         H(var1, fe);
         D(var0[4], var0[5], 4096, fe[0], fe[1], 0);
         break;
      case 458:
         H(var1, fe);
         B(var0[4], var0[5], 4096, fe[0], fe[1], 0);
      }

   }

   public static void H(int var0, int[] var1) {
      if (rD[var0] != null) {
         B.A(rD[var0], he);
      } else {
         he[0] = qD[var0][9];
         he[1] = qD[var0][10];
      }

      ge[0] = he[0] - qD[var0][4];
      ge[1] = he[1] - qD[var0][5];
      int var2 = B(ge);
      var1[0] = ge[0] * 2048 / (var2 + 1);
      var1[1] = ge[1] * 2048 / (var2 + 1);
   }

   public static void B(int var0, int[] var1, int[] var2) {
      if (var1 != null) {
         B.A(var1, var2);
         var2[1] = B.A(var1) + 1;
      } else {
         var2[0] = qD[var0][9];
         var2[1] = qD[var0][10];
      }

   }

   public static void J(int var0, int var1, int var2) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      int var5 = HG.A((int)512) - 256;
      int var4 = HG.A((int)512) - 256;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var2;
      jA[wD][7] = var5;
      jA[wD][8] = var4;
      jA[wD][9] = 512;
      jA[wD][10] = 128;
      jA[wD][11] = 0;
      jA[wD][12] = HG.A();

      for(var2 = 0; var2 < 60; var2 += 6) {
         kA[wD][var2 + 0] = 0;
         kA[wD][var2 + 1] = 0;
         kA[wD][var2 + 2] = 0;
         kA[wD][var2 + 3] = (short)(HG.A((int)128) - 64);
         kA[wD][var2 + 4] = (short)(HG.A((int)128) - 64);
         kA[wD][var2 + 5] = (short)(HG.A((int)128) - 64);
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void BA(int[] var0) {
      if (var0[6] >= 0) {
         var0[4] += var0[7];
         var0[5] += var0[8];
         var0[6] += var0[9];
         var0[9] -= 128;
         short var1 = (short)((var0[2] & -65536) >> 16);

         for(int var2 = 0; var2 < 60; var2 += 6) {
            short[] var10000 = kA[var1];
            var10000[var2 + 0] += kA[var1][var2 + 3];
            var10000 = kA[var1];
            var10000[var2 + 1] += kA[var1][var2 + 4];
         }

      }
   }

   public static void F(int[] var0, Graphics var1) {
      short var4 = (short)((var0[2] & -65536) >> 16);
      int var3 = (var0[4] * B.d >> 12) - tB;
      int var2 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      int var5;
      int var6;
      int var7;
      if (!HG.d) {
         var7 = 124 * var0[10] / 128 << 16 | 0 * var0[10] / 128 << 8 | 0 * var0[10] / 128;
         var1.setColor(var7);

         for(var6 = 0; var6 < 60; var6 += 6) {
            var5 = var3 + (kA[var4][var6 + 0] * B.d >> 12);
            var7 = var2 + (kA[var4][var6 + 1] * B.d >> 12) - (kA[var4][var6 + 2] * B.d >> 12);
            var1.fillRect(var5, var7, 2, 2);
         }
      } else {
         var7 = var0[10] * 255 / 128 << 24;
         var5 = var7 | 8126464 | 0 | 0;

         for(var7 = 0; var7 < ie.length; ++var7) {
            ie[var7] = var5;
         }

         for(var6 = 0; var6 < 60; var6 += 6) {
            var5 = var3 + (kA[var4][var6 + 0] * B.d >> 12);
            var7 = var2 + (kA[var4][var6 + 1] * B.d >> 12) - (kA[var4][var6 + 2] * B.d >> 12);
            var1.drawRGB(ie, 0, 2, var5, var7, 2, 2, true);
         }
      }

   }

   public static void K(int var0, int var1, int var2) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = 0;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 20;
      jA[wD][11] = 14;
      jA[wD][12] = var2;
      B.A(jA[wD], var0 >> 12, var1 >> 12);
      CA(jA[wD]);
      ++wD;
      wD %= 64;
   }

   public static void CA(int[] var0) {
      if (var0[12] != -1) {
         B.A(B.a[var0[12]], je);
         je[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = je[0];
         var0[5] = je[1] + 1;
         int var1 = 8192;
         if ((B.a[var0[12]][3] & 4) != 0) {
            short[] var2 = D(B.a[var0[12]], true);
            var1 = -((var2[1] << 12) / B.d);
         }

         var0[6] = var1;
      }

   }

   public static void G(int[] var0, Graphics var1) {
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
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      B.C(var0, oe);
      int var5 = oe[0] + oe[2] >> 1;
      int var4 = oe[1] + oe[3] >> 1;
      int var2 = 0;
      if ((var0[3] & 4) != 0) {
         var2 = G(var0) & 3;
      }

      byte var7;
      byte var8;
      switch(var2) {
      case 0:
         if (var1) {
            jA[wD][4] = oe[0];
         } else {
            jA[wD][4] = oe[2];
         }

         jA[wD][5] = var4;
         var8 = 3;
         var7 = 6;
         break;
      case 1:
         jA[wD][4] = var5;
         if (var1) {
            jA[wD][5] = oe[3];
         } else {
            jA[wD][5] = oe[1];
            var10000 = jA[wD];
            var10000[5] += 12288 / B.d;
         }

         var8 = 6;
         var7 = 3;
         break;
      case 2:
         if (var1) {
            jA[wD][4] = oe[2];
         } else {
            jA[wD][4] = oe[0];
         }

         jA[wD][5] = var4;
         var8 = 3;
         var7 = 6;
         break;
      case 3:
         jA[wD][4] = var5;
         if (var1) {
            jA[wD][5] = oe[1];
            var10000 = jA[wD];
            var10000[5] += 12288 / B.d;
         } else {
            jA[wD][5] = oe[3];
         }

         var8 = 6;
         var7 = 3;
         break;
      default:
         var10000 = jA[wD];
         var10000[3] |= 65536;
         return;
      }

      int var3 = 1 - HG.A((int)3);
      int var6 = 1 - HG.A((int)3);
      var10000 = jA[wD];
      var10000[4] += (var3 << 12) / B.d;
      var10000 = jA[wD];
      var10000[5] += (var6 << 12) / B.d;
      jA[wD][6] = 0;
      jA[wD][7] = var2;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 64;
      jA[wD][11] = 2;
      jA[wD][12] = (short)var8 & '\uffff' | (short)var7 << 16 & -65536;
      B.A(jA[wD], (short)(var0[0] & '\uffff'), (short)((var0[0] & -65536) >> 16));
      ++wD;
      wD %= 64;
   }

   public static void DA(int[] var0) {
   }

   public static void H(int[] var0, Graphics var1) {
      short var8 = (short)(var0[12] & '\uffff');
      short var7 = (short)((var0[12] & -65536) >> 16);
      int var2 = var0[7];
      int var6 = (var0[4] * B.d >> 12) - tB;
      int var5 = (var0[5] * B.d >> 12) - uB;
      if (HG.d) {
         int[] var4 = null;
         switch(var2) {
         case 0:
            var8 = 3;
            var7 = 6;
            var4 = ke;
            break;
         case 1:
            var8 = 6;
            var7 = 3;
            var4 = le;
            break;
         case 2:
            var8 = 3;
            var7 = 6;
            var4 = me;
            break;
         case 3:
            var8 = 6;
            var7 = 3;
            var4 = ne;
         }

         for(int var3 = 0; var3 < var4.length; ++var3) {
            var2 = var4[var3] & 255;
            var2 = var0[10] * var2 / 64 << 24 | var4[var3] >> 8 & 16777215;
            pe[var3] = var2;
         }

         var1.drawRGB(pe, 0, var8, var6 - (var8 >> 1), var5 - (var7 >> 1), var8, var7, true);
      } else {
         int var9 = (96 * var0[10] + 147 * (64 - var0[10])) / 64 << 16 | (101 * var0[10] + 151 * (64 - var0[10])) / 64 << 8 | (111 * var0[10] + 162 * (64 - var0[10])) / 64;
         var1.setColor(var9);
         var1.fillRect(var6, var5, var8, var7);
      }

   }

   public static void B(int var0, int var1, int var2, int var3, int var4, int var5) {
      A(var0, var1, var2, var3, var4, var5, 10);
   }

   public static void A(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 > 10) {
         var6 = 10;
      }

      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var2;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 10;
      jA[wD][11] = 3;
      jA[wD][12] = var6;
      qe[0] = var3;
      qe[1] = var4;
      qe[2] = var5;
      int var7 = B(qe);

      for(var2 = 0; var2 < var6 * 6; var2 += 6) {
         kA[wD][var2 + 0] = (short)(var3 * var2 / 60);
         kA[wD][var2 + 1] = (short)(var4 * var2 / 60);
         kA[wD][var2 + 2] = (short)(var5 * var2 / 60);
         kA[wD][var2 + 3] = (short)(HG.A(var7 >> 3) - (var7 >> 4));
         kA[wD][var2 + 4] = (short)(HG.A(var7 >> 3) - (var7 >> 4));
         kA[wD][var2 + 5] = (short)(HG.A(var7 >> 3) - (var7 >> 4));
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void EA(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);
      int var2 = var0[12];

      for(int var3 = 0; var3 < var2 * 6; var3 += 6) {
         short[] var10000 = kA[var1];
         var10000[var3 + 0] = (short)(var10000[var3 + 0] + HG.A((int)128) - 64 + kA[var1][var3 + 3]);
         var10000 = kA[var1];
         var10000[var3 + 1] = (short)(var10000[var3 + 1] + HG.A((int)128) - 64 + kA[var1][var3 + 4]);
         var10000 = kA[var1];
         var10000[var3 + 2] = (short)(var10000[var3 + 2] + HG.A((int)128) - 64 + kA[var1][var3 + 5]);
      }

   }

   public static void I(int[] var0, Graphics var1) {
      int var5 = (var0[4] * B.d >> 12) - tB;
      int var4 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var3 = (short)((var0[2] & -65536) >> 16);
      int var2 = var0[12];
      int var6;
      int var7;
      int var8;
      if (!HG.d) {
         if (!W(175)) {
            return;
         }

         for(var7 = 0; var7 < var2 * 6; var7 += 6) {
            var6 = var5 + (kA[var3][var7 + 0] * B.d >> 12);
            var8 = var4 + (kA[var3][var7 + 1] * B.d >> 12) - (kA[var3][var7 + 2] * B.d >> 12);
            B(var6, var8, 175, HG.A((int)cc[1927]), var1);
         }
      } else {
         for(var7 = 0; var7 < se.length; ++var7) {
            var6 = se[var7] & 255;
            var6 = var0[10] * var6 / 10 << 24 | se[var7] >> 8 & 16777215;
            re[var7] = var6;
         }

         for(var7 = 0; var7 < var2 * 6; var7 += 6) {
            var6 = var5 + (kA[var3][var7 + 0] * B.d >> 12);
            var8 = var4 + (kA[var3][var7 + 1] * B.d >> 12) - (kA[var3][var7 + 2] * B.d >> 12);
            var1.drawRGB(re, 0, 3, var6, var8, 3, 3, true);
         }
      }

   }

   public static void C(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var2;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 15;
      jA[wD][11] = 4;
      jA[wD][12] = HG.A();
      te[0] = var3;
      te[1] = var4;
      te[2] = var5;

      for(var2 = 0; var2 < 60; var2 += 6) {
         kA[wD][var2 + 0] = (short)HG.A((int)2048);
         kA[wD][var2 + 1] = (short)HG.A((int)2048);
         kA[wD][var2 + 2] = (short)HG.A((int)2048);
         kA[wD][var2 + 3] = (short)((var3 >> 2) + (HG.A((int)512) - 256));
         kA[wD][var2 + 4] = (short)((var4 >> 2) + (HG.A((int)512) - 256));
         kA[wD][var2 + 5] = (short)((var5 >> 2) + (HG.A((int)512) - 256));
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void FA(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);

      for(int var2 = 0; var2 < 60; var2 += 6) {
         short[] var10000 = kA[var1];
         var10000[var2 + 0] = (short)(var10000[var2 + 0] + HG.A((int)128) - 64 + kA[var1][var2 + 3]);
         var10000 = kA[var1];
         var10000[var2 + 1] = (short)(var10000[var2 + 1] + HG.A((int)128) - 64 + kA[var1][var2 + 4]);
         var10000 = kA[var1];
         var10000[var2 + 2] = (short)(var10000[var2 + 2] + HG.A((int)128) - 64 + kA[var1][var2 + 5]);
      }

   }

   public static void J(int[] var0, Graphics var1) {
      int var4 = (var0[4] * B.d >> 12) - tB;
      int var3 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var2 = (short)((var0[2] & -65536) >> 16);
      int var5;
      int var6;
      int var7;
      if (!HG.d) {
         if (!W(175)) {
            return;
         }

         for(var6 = 0; var6 < 60; var6 += 6) {
            var5 = var4 + (kA[var2][var6 + 0] * B.d >> 12);
            var7 = var3 + (kA[var2][var6 + 1] * B.d >> 12) - (kA[var2][var6 + 2] * B.d >> 12);
            B(var5, var7, 175, HG.A((int)cc[1927]), var1);
         }
      } else {
         for(var6 = 0; var6 < ve.length; ++var6) {
            var5 = ve[var6] & 255;
            var5 = var0[10] * var5 / 15 << 24 | ve[var6] >> 8 & 16777215;
            ue[var6] = var5;
         }

         for(var6 = 0; var6 < 60; var6 += 6) {
            var5 = var4 + (kA[var2][var6 + 0] * B.d >> 12);
            var7 = var3 + (kA[var2][var6 + 1] * B.d >> 12) - (kA[var2][var6 + 2] * B.d >> 12);
            var1.drawRGB(ue, 0, 3, var5, var7, 3, 3, true);
         }
      }

   }

   public static void Q(int[] var0, int var1) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      if (var1 != -1 && (B.a[var1][3] & 4) != 0) {
         var10000 = jA[wD];
         var10000[3] |= 65536;
      } else {
         jA[wD][4] = var0[4];
         jA[wD][5] = var0[5];
         jA[wD][6] = var0[8];
         jA[wD][7] = var0[6];
         jA[wD][8] = var0[7];
         jA[wD][9] = var1;
         jA[wD][10] = 128;
         jA[wD][11] = 1;
         jA[wD][12] = (short)(var0[14] & '\uffff');
         B.A(jA[wD], var0[4] >> 12, var0[5] >> 12);
         ++wD;
         wD %= 64;
      }
   }

   public static void GA(int[] var0) {
      short var1 = (short)(var0[9] & '\uffff');
      if (var1 != -1) {
         B.A(var0, (short)(B.a[var1][0] & '\uffff'), (short)((B.a[var1][0] & -65536) >> 16));
      }

   }

   public static void K(int[] var0, Graphics var1) {
      int var6 = var0[4];
      int var5 = var0[5];
      int var4 = var0[7];
      int var3 = var0[8];
      short var2 = (short)(var0[9] & '\uffff');
      if (var2 != -1 && (B.a[var2][3] & 4) != 0) {
         B.A(B.a[var2], we);
         var6 = 0;
         var5 = 0;
         var4 = 0;
         var3 = 0;
         int var7 = G(B.a[var2]) & 3;
         switch(var7) {
         case 0:
            var6 = var0[4];
            var5 = var0[5];
            var4 = var0[7];
            var3 = var0[8];
            break;
         case 1:
            var6 = -var0[5];
            var5 = var0[4];
            var4 = -var0[8];
            var3 = var0[7];
            break;
         case 2:
            var6 = -var0[4];
            var5 = -var0[5];
            var4 = -var0[7];
            var3 = -var0[8];
            break;
         case 3:
            var6 = var0[5];
            var5 = -var0[4];
            var4 = var0[8];
            var3 = -var0[7];
         }

         var7 = var6 + we[0];
         var5 += we[1];
         var4 += we[0];
         var3 += we[1];
         var6 = var7;
         var5 = var5;
         var4 = var4;
         var3 = var3;
      }

      switch(var0[12]) {
      case 0:
         B(var6, var5, var4, var3, var0[6], var1);
         break;
      case 1:
         A(var6, var5, var4, var3, var0[6], var1);
      }

   }

   public static void D(int var0, int var1, int var2, int var3, int var4, int var5) {
      B(var0, var1, var2, var3, var4, var5, 10);
   }

   public static void B(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      if (var6 > 10) {
         var6 = 10;
      }

      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var2;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 16;
      jA[wD][11] = 5;
      jA[wD][12] = var6;
      xe[0] = var3;
      xe[1] = var4;
      xe[2] = var5;
      int var7 = B(xe);

      for(var2 = 0; var2 < var6 * 6; var2 += 6) {
         kA[wD][var2 + 0] = (short)(var3 * var2 / 60 + HG.A(var7 >> 1));
         kA[wD][var2 + 1] = (short)(var4 * var2 / 60 + HG.A(var7 >> 1));
         kA[wD][var2 + 2] = (short)(var5 * var2 / 60 + HG.A(var7 >> 1));
         kA[wD][var2 + 3] = (short)(160 - HG.A((int)10));
         kA[wD][var2 + 4] = 0;
         kA[wD][var2 + 5] = 0;
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void HA(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);
      int var2 = var0[12];

      for(int var3 = 0; var3 < var2 * 6; var3 += 6) {
         short[] var10000 = kA[var1];
         var10000[var3 + 0] = (short)(var10000[var3 + 0] + (HG.A((int)256) - 128));
         var10000 = kA[var1];
         var10000[var3 + 1] = (short)(var10000[var3 + 1] + (HG.A((int)256) - 128));
         var10000 = kA[var1];
         var10000[var3 + 2] = (short)(var10000[var3 + 2] + HG.A((int)256));
         var10000 = kA[var1];
         var10000[var3 + 3] = (short)(var10000[var3 + 3] - (10 + HG.A((int)10)));
      }

   }

   public static void L(int[] var0, Graphics var1) {
      int var5 = (var0[4] * B.d >> 12) - tB;
      int var4 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var3 = (short)((var0[2] & -65536) >> 16);
      int var2 = 0;
      int var12 = var0[12];

      for(int var11 = 0; var11 < var12 * 6; var11 += 6) {
         short var10 = kA[var3][var11 + 3];
         if (var10 >= 0) {
            int var9;
            int var13;
            if (var10 > 80) {
               var13 = 255 - 255 * (var10 - 80) / 160;
               var9 = 16711680 | var13 << 8;
            } else if (!HG.d) {
               var13 = 255 * var10 / 160;
               var9 = var13 << 16 | var13 << 8 | var13;
            } else {
               var9 = 0;
            }

            int var8 = var5 + (kA[var3][var11 + 0] * B.d >> 12);
            int var7 = var4 + (kA[var3][var11 + 1] * B.d >> 12) - (kA[var3][var11 + 2] * B.d >> 12);
            if (!HG.d) {
               var1.setColor(var9);
               var1.fillRect(var8, var7, 2, 2);
            } else {
               for(int var6 = 0; var6 < ze.length; ++var6) {
                  var13 = ze[var6] & 255;
                  var13 = var10 * var13 / 160 << 24 | var9 & 16777215;
                  ye[var6] = var13;
               }

               var1.drawRGB(ye, 0, 3, var8, var7, 3, 3, true);
            }

            ++var2;
         }
      }

   }

   public static void E(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var2;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 24;
      jA[wD][11] = 6;
      jA[wD][12] = 0;
      aE[0] = var3;
      aE[1] = var4;
      aE[2] = var5;

      for(var2 = 0; var2 < 60; var2 += 6) {
         kA[wD][var2 + 0] = (short)HG.A((int)2048);
         kA[wD][var2 + 1] = (short)HG.A((int)2048);
         kA[wD][var2 + 2] = (short)HG.A((int)2048);
         kA[wD][var2 + 3] = (short)(HG.A((int)512) - 256);
         kA[wD][var2 + 4] = (short)(HG.A((int)512) - 256);
         kA[wD][var2 + 5] = (short)(240 - HG.A((int)10));
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void IA(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);
      short[] var10000;
      int var2;
      if (jA[var1][10] > 12) {
         for(var2 = 0; var2 < 60; var2 += 6) {
            var10000 = kA[var1];
            var10000[var2 + 0] = (short)(var10000[var2 + 0] + (jA[var1][10] - 12) * (HG.A((int)512) - 256 + kA[var1][var2 + 3]) / 12);
            var10000 = kA[var1];
            var10000[var2 + 1] = (short)(var10000[var2 + 1] + (jA[var1][10] - 12) * (HG.A((int)512) - 256 + kA[var1][var2 + 4]) / 12);
            var10000 = kA[var1];
            var10000[var2 + 2] = (short)(var10000[var2 + 2] + HG.A((int)256));
            var10000 = kA[var1];
            var10000[var2 + 5] = (short)(var10000[var2 + 5] - 10);
         }
      } else {
         for(var2 = 0; var2 < 60; var2 += 6) {
            var10000 = kA[var1];
            var10000[var2 + 2] = (short)(var10000[var2 + 2] + HG.A((int)256));
            var10000 = kA[var1];
            var10000[var2 + 5] = (short)(var10000[var2 + 5] - 10);
         }
      }

   }

   public static void M(int[] var0, Graphics var1) {
      int var3 = (var0[4] * B.d >> 12) - tB;
      int var2 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var11 = (short)((var0[2] & -65536) >> 16);
      int var10 = 0;

      for(int var9 = 0; var9 < 60; var9 += 6) {
         short var8 = kA[var11][var9 + 5];
         if (var8 >= 0) {
            int var7;
            int var12;
            if (var8 > 120) {
               var12 = 255 - 255 * (var8 - 120) / 240;
               var7 = 16711680 | var12 << 8;
            } else if (!HG.d) {
               var12 = 255 * var8 / 240;
               var7 = var12 << 16 | var12 << 8 | var12;
            } else {
               var7 = 0;
            }

            int var6 = var3 + (kA[var11][var9 + 0] * B.d >> 12);
            int var5 = var2 + (kA[var11][var9 + 1] * B.d >> 12) - (kA[var11][var9 + 2] * B.d >> 12);
            if (!HG.d) {
               var1.setColor(var7);
               var1.fillRect(var6, var5, 2, 2);
            } else {
               for(int var4 = 0; var4 < cE.length; ++var4) {
                  var12 = cE[var4] & 255;
                  var12 = var8 * var12 / 240 << 24 | var7 & 16777215;
                  bE[var4] = var12;
               }

               var1.drawRGB(bE, 0, 3, var6, var5, 3, 3, true);
            }

            ++var10;
         }
      }

   }

   public static void F(int var0, int var1, int var2, int var3, int var4, int var5) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var2;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 16;
      jA[wD][11] = 7;
      jA[wD][12] = HG.A((int)10);
      dE[0] = var3;
      dE[1] = var4;
      dE[2] = var5;
      B(dE);

      for(var2 = 0; var2 < 30; var2 += 6) {
         kA[wD][var2 + 0] = (short)(var3 * var2 / 30 + (HG.A((int)4096) - 2048));
         kA[wD][var2 + 1] = (short)(var4 * var2 / 30 + (HG.A((int)4096) - 2048));
         kA[wD][var2 + 2] = (short)(var5 * var2 / 30 + (HG.A((int)4096) - 2048));
         kA[wD][var2 + 3] = (short)(80 - HG.A((int)5));
         kA[wD][var2 + 4] = 0;
         kA[wD][var2 + 5] = 0;
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void JA(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);

      for(int var2 = 0; var2 < 30; var2 += 6) {
         short[] var10000 = kA[var1];
         var10000[var2 + 0] = (short)(var10000[var2 + 0] + (HG.A((int)256) - 128));
         var10000 = kA[var1];
         var10000[var2 + 1] = (short)(var10000[var2 + 1] + (HG.A((int)256) - 128));
         var10000 = kA[var1];
         var10000[var2 + 2] = (short)(var10000[var2 + 2] + HG.A((int)256));
         var10000 = kA[var1];
         var10000[var2 + 3] = (short)(var10000[var2 + 3] - (5 + HG.A((int)5)));
      }

   }

   public static void N(int[] var0, Graphics var1) {
      int var3 = (var0[4] * B.d >> 12) - tB;
      int var2 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var10 = (short)((var0[2] & -65536) >> 16);
      int var9 = 0;

      for(int var8 = 0; var8 < 30; var8 += 6) {
         short var7 = kA[var10][var8 + 3];
         if (var7 >= 0) {
            int var6 = var3 + (kA[var10][var8 + 0] * B.d >> 12);
            int var5 = var2 + (kA[var10][var8 + 1] * B.d >> 12) - (kA[var10][var8 + 2] * B.d >> 12);
            int var11;
            if (!HG.d) {
               var11 = (0 * var7 + 0 * (80 - var7)) / 80 << 16 | (190 * var7 + 76 * (80 - var7)) / 80 << 8 | (0 * var7 + 0 * (80 - var7)) / 80;
               var1.setColor(var11);
               var1.fillRect(var6, var5, 3, 3);
            } else {
               for(int var4 = 0; var4 < fE.length; ++var4) {
                  var11 = fE[var4] >> 8 & 255;
                  var11 = var11 * 0 >> 8 << 16 | var11 * 190 >> 8 << 8 | var11 * 0 >> 8;
                  var11 = var7 * (fE[var4] & 255) / 80 << 24 | var11 & 16777215;
                  eE[var4] = var11;
               }

               var1.drawRGB(eE, 0, 5, var6, var5, 5, 6, true);
            }

            ++var9;
         }
      }

   }

   public static void E(int var0, int var1, int var2, int var3) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var2;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 16;
      jA[wD][11] = 8;
      jA[wD][12] = var3;
      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void KA(int[] var0) {
      if (var0[12] != -1) {
         B.A(B.a[var0[12]], gE);
         gE[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = gE[0];
         var0[5] = gE[1] + 1;
      }

   }

   public static void O(int[] var0, Graphics var1) {
      int var6 = (var0[4] * B.d >> 12) - tB;
      int var5 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      if (!HG.d) {
         if (W(177)) {
            B(var6, var5, 177, 0, var1);
         }
      } else {
         for(int var4 = 0; var4 < iE.length; ++var4) {
            int var2 = iE[var4] >> 8 & 255;
            int var3 = var2 * 0 >> 8 << 16 | var2 * 190 >> 8 << 8 | var2 * 0 >> 8;
            var2 = 255 - 255 * E(8 - var0[10]) / 8;
            var2 = var2 * (iE[var4] & 255) >> 8 << 24 | var3 & 16777215;
            hE[var4] = var2;
         }

         var1.drawRGB(hE, 0, 16, var6 - 8, var5 - 8, 16, 16, true);
      }

   }

   public static void L(int var0, int var1, int var2) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = 0;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 24;
      jA[wD][11] = 9;
      jA[wD][12] = var2;

      for(var2 = 0; var2 < 60; var2 += 6) {
         kA[wD][var2 + 0] = (short)(HG.A((int)4096) - 2048);
         kA[wD][var2 + 1] = (short)(HG.A((int)4096) - 2048);
         kA[wD][var2 + 2] = (short)(HG.A((int)8192) + 0);
         kA[wD][var2 + 3] = 0;
         kA[wD][var2 + 4] = 0;
         kA[wD][var2 + 5] = 0;
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void LA(int[] var0) {
      short var2 = (short)((var0[2] & -65536) >> 16);

      for(int var1 = 0; var1 < 60; var1 += 6) {
         short[] var10000 = kA[var2];
         var10000[var1 + 2] = (short)(var10000[var1 + 2] + 256);
         if (kA[var2][var1 + 2] > 8192) {
            kA[var2][var1 + 2] = (short)(0 + HG.A((int)256));
         }
      }

      if (var0[12] != -1) {
         B.A(B.a[var0[12]], jE);
         jE[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = jE[0];
         var0[5] = jE[1] + 1;
      }

   }

   public static void P(int[] var0, Graphics var1) {
      int var8 = (var0[4] * B.d >> 12) - tB;
      int var7 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var6 = (short)((var0[2] & -65536) >> 16);
      int var2;
      int var3;
      int var4;
      if (!HG.d) {
         for(var4 = 0; var4 < 60; var4 += 6) {
            var3 = (8192 - kA[var6][var4 + 2] - 0) * var0[10];
            var2 = (210 * var3 + 113 * (196608 - var3)) / 196608 << 16 | (255 * var3 + 141 * (196608 - var3)) / 196608 << 8 | (253 * var3 + 140 * (196608 - var3)) / 196608;
            var1.setColor(var2);
            var3 = var8 + (kA[var6][var4 + 0] * B.d >> 12);
            var2 = var7 + (kA[var6][var4 + 1] * B.d >> 12) - (kA[var6][var4 + 2] * B.d >> 12);
            var1.fillRect(var3, var2, 1, 8);
         }
      } else {
         for(int var5 = 0; var5 < 60; var5 += 6) {
            for(var4 = 0; var4 < lE.length; ++var4) {
               var3 = (8192 - kA[var6][var5 + 2] - 0) * var0[10];
               var2 = lE[var4] & 255;
               var2 = var3 * var2 / 196608 << 24 | lE[var4] >> 8 & 16777215;
               kE[var4] = var2;
            }

            var3 = var8 + (kA[var6][var5 + 0] * B.d >> 12);
            var2 = var7 + (kA[var6][var5 + 1] * B.d >> 12) - (kA[var6][var5 + 2] * B.d >> 12);
            var1.drawRGB(kE, 0, 1, var3, var2 - 8, 1, 8, true);
         }
      }

   }

   public static void S(int var0, int var1) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0 + HG.A((int)8192) - 4096;
      jA[wD][5] = var1 + HG.A((int)8192) - 4096;
      jA[wD][6] = 16384;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 40;
      jA[wD][11] = 10;
      jA[wD][12] = 0;
      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
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

   public static void Q(int[] var0, Graphics var1) {
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

      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = var3;
      jA[wD][7] = 0;
      jA[wD][8] = 512;
      jA[wD][9] = 0;
      jA[wD][10] = 20;
      jA[wD][11] = 11;
      jA[wD][12] = var2;
      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
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

   public static void R(int[] var0, Graphics var1) {
      int var6 = (var0[4] * B.d >> 12) + (var0[7] * B.d >> 12) - tB;
      int var5 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      if (!HG.d) {
         if (W(178)) {
            B(var6, var5, 178, 0, var1);
         }
      } else {
         for(int var4 = 0; var4 < nE.length; ++var4) {
            int var2 = nE[var4] >> 8 & 255;
            int var3 = var2 * 84 >> 8 << 16 | var2 * 76 >> 8 << 8 | var2 * 255 >> 8;
            var2 = 255 - 255 * E(10 - var0[10]) / 10;
            var2 = var2 * (nE[var4] & 255) >> 8 << 24 | var3 & 16777215;
            mE[var4] = var2;
         }

         var1.drawRGB(mE, 0, 4, var6 - 2, var5 - 2, 4, 4, true);
      }

   }

   public static void T(int var0, int var1) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1 - 8192;
      if (jA[wD][5] < 0) {
         jA[wD][5] = 0;
      }

      jA[wD][6] = 0;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 10;
      jA[wD][11] = 12;
      jA[wD][12] = 0;

      for(int var2 = 0; var2 < 60; var2 += 6) {
         kA[wD][var2 + 0] = (short)(HG.A((int)16384) - 8192);
         kA[wD][var2 + 1] = (short)HG.A((int)16384);
         kA[wD][var2 + 2] = 0;
         kA[wD][var2 + 3] = 0;
         kA[wD][var2 + 4] = 0;
         kA[wD][var2 + 5] = 0;
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void OA(int[] var0) {
      short var1 = (short)((var0[2] & -65536) >> 16);

      for(int var2 = 0; var2 < 60; var2 += 6) {
         short[] var10000 = kA[var1];
         var10000[var2 + 0] = (short)(var10000[var2 + 0] + (HG.A((int)2) == 0 ? 4096 / B.d : -(4096 / B.d)));
      }

   }

   public static void S(int[] var0, Graphics var1) {
      int var7 = (var0[4] * B.d >> 12) - tB;
      int var6 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var5 = (short)((var0[2] & -65536) >> 16);
      int var2;
      int var3;
      int var8;
      if (!HG.d) {
         if (W(179)) {
            for(var3 = 0; var3 < 60; var3 += 6) {
               var2 = var7 + (kA[var5][var3 + 0] * B.d >> 12);
               var8 = var6 + (kA[var5][var3 + 1] * B.d >> 12) - (kA[var5][var3 + 2] * B.d >> 12);
               B(var2, var8, 179, 0, var1);
            }
         }
      } else {
         for(int var4 = 0; var4 < pE.length; ++var4) {
            var2 = pE[var4] >> 8 & 255;
            var3 = var2 * 84 >> 8 << 16 | var2 * 76 >> 8 << 8 | var2 * 255 >> 8;
            var2 = 255 - 255 * E(5 - var0[10]) / 5;
            var2 = var2 * (pE[var4] & 255) >> 8 << 24 | var3 & 16777215;
            oE[var4] = var2;
         }

         for(var3 = 0; var3 < 60; var3 += 6) {
            var2 = var7 + (kA[var5][var3 + 0] * B.d >> 12);
            var8 = var6 + (kA[var5][var3 + 1] * B.d >> 12) - (kA[var5][var3 + 2] * B.d >> 12);
            var1.drawRGB(oE, 0, 8, var2 - 4, var8 - 2, 8, 4, true);
         }
      }

   }

   public static void N(int var0, int var1, int var2) {
      int[] var10000 = jA[wD];
      var10000[3] &= -65537;
      jA[wD][4] = var0;
      jA[wD][5] = var1;
      jA[wD][6] = 0;
      jA[wD][7] = 0;
      jA[wD][8] = 0;
      jA[wD][9] = 0;
      jA[wD][10] = 20;
      jA[wD][11] = 13;
      jA[wD][12] = var2;

      for(var2 = 0; var2 < 60; var2 += 6) {
         kA[wD][var2 + 0] = (short)(HG.A((int)4096) - 2048);
         kA[wD][var2 + 1] = (short)(HG.A((int)4096) - 2048);
         kA[wD][var2 + 2] = (short)(HG.A((int)12288) + 0);
         kA[wD][var2 + 3] = 0;
         kA[wD][var2 + 4] = 0;
         kA[wD][var2 + 5] = 0;
      }

      B.A(jA[wD], var0 >> 12, var1 >> 12);
      ++wD;
      wD %= 64;
   }

   public static void PA(int[] var0) {
      short var2 = (short)((var0[2] & -65536) >> 16);

      for(int var1 = 0; var1 < 60; var1 += 6) {
         short[] var10000 = kA[var2];
         var10000[var1 + 2] = (short)(var10000[var1 + 2] + 1024);
         if (kA[var2][var1 + 2] > 12288) {
            kA[var2][var1 + 2] = (short)(0 + HG.A((int)256));
         }
      }

      if (var0[12] != -1) {
         B.A(B.a[var0[12]], qE);
         qE[1] = B.A(B.a[var0[12]]) + 1;
         var0[4] = qE[0];
         var0[5] = qE[1] + 1;
      }

   }

   public static void T(int[] var0, Graphics var1) {
      int var8 = (var0[4] * B.d >> 12) - tB;
      int var7 = (var0[5] * B.d >> 12) - (var0[6] * B.d >> 12) - uB;
      short var6 = (short)((var0[2] & -65536) >> 16);
      int var2;
      int var3;
      int var4;
      if (!HG.d) {
         for(var4 = 0; var4 < 60; var4 += 6) {
            var3 = (12288 - kA[var6][var4 + 2] - 0) * var0[10];
            var2 = (255 * var3 + 128 * (245760 - var3)) / 245760 << 16 | (255 * var3 + 128 * (245760 - var3)) / 245760 << 8 | (0 * var3 + 0 * (245760 - var3)) / 245760;
            var1.setColor(var2);
            var3 = var8 + (kA[var6][var4 + 0] * B.d >> 12);
            var2 = var7 + (kA[var6][var4 + 1] * B.d >> 12) - (kA[var6][var4 + 2] * B.d >> 12);
            var1.fillRect(var3, var2, 1, 8);
         }
      } else {
         for(int var5 = 0; var5 < 60; var5 += 6) {
            for(var4 = 0; var4 < sE.length; ++var4) {
               var3 = (12288 - kA[var6][var5 + 2] - 0) * var0[10];
               var2 = sE[var4] & 255;
               var2 = var3 * var2 / 245760 << 24 | sE[var4] >> 8 & 16777215;
               rE[var4] = var2;
            }

            var3 = var8 + (kA[var6][var5 + 0] * B.d >> 12);
            var2 = var7 + (kA[var6][var5 + 1] * B.d >> 12) - (kA[var6][var5 + 2] * B.d >> 12);
            var1.drawRGB(rE, 0, 3, var3, var2 - 8, 3, 8, true);
         }
      }

   }

   public static void TB() {
      if (HA(3)) {
         try {
            HG.F(3);
            tE = HG.k.readLong();
            HG.h = null;
            HG.i = null;
            HG.j = null;
            HG.k = null;
         } catch (Exception var1) {
            HG.h = null;
            HG.i = null;
            HG.j = null;
            HG.k = null;
         }
      }

      if (HA(2)) {
         try {
            HG.F(2);
            uE = HG.k.readLong();
            HG.h = null;
            HG.i = null;
            HG.j = null;
            HG.k = null;
         } catch (Exception var0) {
            HG.h = null;
            HG.i = null;
            HG.j = null;
            HG.k = null;
         }
      }

   }

   public static boolean FA(int var0) {
      try {
         HG.H();
         if (var0 == 3) {
            tE = System.currentTimeMillis();
            HG.i.writeLong(tE);
         } else {
            uE = System.currentTimeMillis();
            HG.i.writeLong(uE);
         }

         if (ca[11] == -1) {
            ca[11] = 0;
            ca[0] = (short)cC[0][3] & '\uffff' | (short)cC[0][4] << 16 & -65536;
         }

         HG.A(ca);
         HG.A(na);
         HG.A(za);
         HG.A(aA);
         HG.A(bA);
         HG.A(cA);
         HG.A(dA);
         HG.A(eA);
         HG.A(fA);
         HG.A(gA);

         int var1;
         for(int var2 = 0; var2 < 6; ++var2) {
            for(var1 = 0; var1 < 15; ++var1) {
               HG.A(da[var2][var1]);
            }
         }

         var1 = 0;

         while(true) {
            if (var1 >= 19) {
               HG.E(var0);
               break;
            }

            HG.A(ya[var1]);
            ++var1;
         }
      } catch (Exception var3) {
         HG.h = null;
         HG.i = null;
         HG.j = null;
         HG.k = null;
         return false;
      }

      HG.h = null;
      HG.i = null;
      HG.j = null;
      HG.k = null;
      return true;
   }

   public static boolean GA(int var0) {
      if (HA(var0)) {
         try {
            HG.F(var0);
            HG.k.readLong();
            ca = HG.G();
            na = HG.G();
            za = HG.G();
            aA = HG.G();
            bA = HG.G();
            cA = HG.G();
            dA = HG.G();
            eA = HG.G();
            fA = HG.G();
            gA = HG.G();
            da = new int[6][15][];

            for(int var1 = 0; var1 < 6; ++var1) {
               for(var0 = 0; var0 < 15; ++var0) {
                  da[var1][var0] = HG.G();
               }
            }

            ya = new int[19][];

            for(var0 = 0; var0 < 19; ++var0) {
               ya[var0] = HG.G();
            }

            HG.h = null;
            HG.i = null;
            HG.j = null;
            HG.k = null;
            return true;
         } catch (Exception var2) {
            HG.h = null;
            HG.i = null;
            HG.j = null;
            HG.k = null;
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
      a = var1;
      this.setFullScreenMode(true);
      f = this.getWidth();
      g = this.getHeight();
   }

   public void paint(Graphics var1) {
      C(var1);
      if (HG.iA) {
         HG.C(var1);
         if (!c) {
            if (id) {
               Q(var1);
            }

            if (oC) {
               N(var1);
            }
         }
      }

   }

   static void UB() {
      if (C(90) && (!pC || pC && c)) {
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
            if (w[var0] == 20) {
               h = (h << 4) + (long)var0;
               if (I()) {
                  h = 0L;
               }
            }
         }
      } else if (oC) {
         XA();
      } else if (id) {
         DB();
      } else if (oD && !q) {
         GB();
      } else if (eb && !q) {
         T();
      } else if (db && !q) {
         U();
      } else {
         short var6;
         if (HG.iA) {
            if (HG.jA >= 0 && HG.kA >= 0) {
               var6 = HG.hA[HG.jA][(HG.kA << 2) + 2];
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

            if (HG.jA != 19) {
               if (HG.jA == 21) {
                  if (HG.MA(6)) {
                     if (C(112) && HG.kA >= 0) {
                        var0 = HG.hA[HG.jA][HG.kA * 4 + 3] & 32767;
                        HG.ra = B.a[var0];
                        HG.cA = HG.kA - 1;
                        HG.DA(27);
                     }

                     if (C(113) && HG.kA >= 0) {
                        var0 = HG.hA[HG.jA][HG.kA * 4 + 3] & 32767;
                        HG.ra = B.a[var0];
                        HG.cA = HG.kA - 1;
                        HG.DA(19);
                     }
                  }

                  if (HG.ma) {
                     if (C(61)) {
                        B.S();
                        HG.kA = -1;
                        HG.B(HG.jA);
                     }

                     if (C(62)) {
                        B.R();
                        HG.kA = -1;
                        HG.B(HG.jA);
                     }
                  }
               } else if (HG.jA == 24) {
                  if (HG.MA(6) && C(112)) {
                     HG.DA(6);
                     if (HG.jA == 20) {
                        HG.DA(6);
                     }
                  }
               } else if (HG.jA == 23) {
                  if (C(61)) {
                     --HG.na;
                     if (HG.na < 0) {
                        HG.na = 3;
                     }

                     HG.B(HG.jA);
                  }

                  if (C(62)) {
                     ++HG.na;
                     if (HG.na >= 4) {
                        HG.na = 0;
                     }

                     HG.B(HG.jA);
                  }
               } else if (HG.jA == 25) {
                  if (C(61)) {
                     --HG.dA;
                     if (HG.dA < 1) {
                        HG.dA = 2;
                     }

                     HG.B(HG.jA);
                  }

                  if (C(62)) {
                     ++HG.dA;
                     if (HG.dA >= 3) {
                        HG.dA = 1;
                     }

                     HG.B(HG.jA);
                  }
               }
            } else {
               if (C(61)) {
                  --HG.za;
                  if (HG.za < 0) {
                     HG.za = 5;
                  }

                  HG.kA = -1;
                  HG.B(HG.jA);
               }

               if (C(62)) {
                  ++HG.za;
                  if (HG.za >= 6) {
                     HG.za = 0;
                  }

                  HG.kA = -1;
                  HG.B(HG.jA);
               }

               if (HG.MA(6)) {
                  if (C(110) && HG.kA >= 0) {
                     HG.aA = HG.hA[HG.jA][HG.kA * 4 + 3] & 32767;
                     HG.ra = da[HG.za][HG.aA];
                     boolean var7 = true;
                     if (HG.za == 2 && la[HG.ra[4]][3] == 0) {
                        var7 = false;
                     }

                     if (var7) {
                        HG.DA(14);
                     }
                  }

                  if (C(111)) {
                     byte var9;
                     if (HG.za != 5 && HG.za != 4 && ca[11] != 0) {
                        if ((HG.fA & 1) != 0) {
                           var9 = 22;
                        } else {
                           var9 = 13;
                        }
                     } else {
                        var9 = -1;
                     }

                     if (HG.kA >= 0 && var9 >= 0) {
                        HG.aA = HG.hA[HG.jA][HG.kA * 4 + 3] & 32767;
                        HG.ra = da[HG.za][HG.aA];
                        HG.DA(var9);
                     }
                  }

                  if (C(112) && HG.kA >= 0) {
                     HG.aA = HG.hA[HG.jA][HG.kA * 4 + 3] & 32767;
                     HG.ra = da[HG.za][HG.aA];
                     HG.la = B.F(HG.ra);
                     HG.DA(27);
                  }

                  if (C(114) && HG.kA >= 0) {
                     HG.aA = HG.hA[HG.jA][HG.kA * 4 + 3] & 32767;
                     HG.ra = da[HG.za][HG.aA];
                     if (HG.za != 1 && HG.za != 5 && (HG.fA & 1) == 0 && (HG.za != 2 || la[HG.ra[4]][3] != 0)) {
                        HG.DA(15);
                     }
                  }
               }
            }

            if (C(80)) {
               if (HG.rA >= 0) {
                  HG.DA(HG.rA);
               } else {
                  HG.T();
               }
            }

            if (C(65)) {
               HG.T();
            }

            if (C(85)) {
               if (HG.sA >= 0) {
                  HG.DA(HG.sA);
               } else {
                  HG.U();
               }
            }

            if (C(109) && ((HG.fA & 2) != 0 || (HG.fA & 1) != 0)) {
               if (HG.jA == 21) {
                  HG.LA(19);
               } else if ((HG.fA & 1) != 0) {
                  HG.LA(21);
               }
            }
         } else if (C(50)) {
            HG.lA.removeAllElements();
            HG.LA(14);
            HG.iA = true;
         } else if (!q) {
            switch(s) {
            case 6:
               if (C(45)) {
                  if (zD >= 0) {
                     A(10, 0, 0, 0, 0, true);
                     r.A(HG.eb, zD, be, ce, false);
                     (new Thread(r)).start();
                  } else if ((short)(ca[12] & '\uffff') > 0) {
                     HG.lA.removeAllElements();
                     HG.LA(18);
                     HG.iA = true;
                  }
               } else {
                  label472: {
                     if (C(65)) {
                        if (zD >= 0) {
                           A(10, 0, 0, 0, 0, true);
                           r.A(HG.eb, zD, be, ce, false);
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
                              F((short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
                              break;
                           case 1:
                              short var13 = (short)((B.a[tb][2] & -65536) >> 16);
                              short var11 = (short)(ca[0] & '\uffff');
                              short var10 = (short)((ca[0] & -65536) >> 16);
                              short var8 = (short)(ea[var13][0] & '\uffff');
                              var6 = (short)((ea[var13][0] & -65536) >> 16);
                              if (var10 > var6) {
                                 var10000 = ea[var13];
                                 var10000[27] &= -65536;
                                 var10000 = ea[var13];
                                 var10000[27] |= 2;
                              } else if (var10 < var6) {
                                 var10000 = ea[var13];
                                 var10000[27] &= -65536;
                                 var10000 = ea[var13];
                                 var10000[27] |= 0;
                              } else if (var11 < var8) {
                                 var10000 = ea[var13];
                                 var10000[27] &= -65536;
                                 var10000 = ea[var13];
                                 var10000[27] |= 3;
                              } else {
                                 var10000 = ea[var13];
                                 var10000[27] &= -65536;
                                 var10000 = ea[var13];
                                 var10000[27] |= 1;
                              }

                              if (!A(9, var13, 0, 0, 0, false)) {
                                 int var12 = A(B.a[tb])[13];
                                 var1 = 0;
                                 byte var14 = 114;
                                 pd = -1;
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

                                 if (A(ea[var13])[0] == 149) {
                                    var14 = 123;
                                 }

                                 gD = true;
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
                                       for(var1 = 0; var1 < da[5].length; ++var1) {
                                          var0 = da[5][var1][4];
                                          if (var0 >= 0 && oa[var0][4] == var3) {
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
                                       if (mD == 0) {
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
                              F((short)(ca[0] & '\uffff'), (short)((ca[0] & -65536) >> 16));
                              break;
                           case 7:
                              if (!A(12, 7, (short)((B.a[tb][2] & -65536) >> 16), 8, 0, false)) {
                                 if ((B.a[tb][3] & 32) != 0 && (B.a[tb][13] & 2) == 0) {
                                    HG.bA = B.Q();
                                 } else {
                                    HG.bA = 0;
                                 }

                                 HG.lA.removeAllElements();
                                 HG.LA(21);
                                 HG.iA = true;
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

                     if (C(95) && (short)(ca[12] & '\uffff') > 0) {
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
      if (s > 3) {
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

         this.repaint();
         this.serviceRepaints();
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

      for(int var7 = 0; var7 < u; ++var7) {
         byte[] var4 = t[var7];
         byte var5 = var4[0];
         int var6 = B(var5);
         if (v[var6] == 5) {
            v[var6] = 10;
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
      HG.n[4] = true;
      String var2 = System.getProperty("microedition.locale");
      if (var2 != null) {
         var2 = var2.toUpperCase();
      }

      HG.B(var2);
      YA();
      rA = HG.I(396);
      sA = HG.I(407);
      sA = sA + "\n" + HG.I(408);
      sA = sA + " " + HG.I(298);
      HG.B();
      TB();
      switch(var1) {
      case 1:
         MA();
         RA();
         HG.K();
         W(159);
      default:
      }
   }

   static {
      u = t.length;
      v = new byte[u];
      w = new byte[20];
      x = new byte[20];
      y = new short[165];
      z = new short[45];
      aa = new short[15];
      ba = new String[1];
      ca = null;
      da = (int[][][])null;
      ea = (int[][])null;
      fa = (int[][])null;
      ga = (int[][])null;
      ha = (int[][])null;
      ia = (int[][])null;
      ja = (int[][])null;
      ka = (int[][])null;
      la = (int[][])null;
      ma = (int[][])null;
      na = null;
      oa = (int[][])null;
      pa = (int[][])null;
      qa = (int[][])null;
      ra = (int[][])null;
      sa = (int[][])null;
      ta = (int[][])null;
      ua = (int[][])null;
      va = (int[][])null;
      wa = null;
      xa = (int[][])null;
      ya = (int[][])null;
      za = null;
      aA = null;
      bA = null;
      cA = null;
      dA = null;
      eA = null;
      fA = null;
      gA = null;
      hA = null;
      iA = (int[][])null;
      short[][] var10000 = (short[][])null;
      jA = (int[][])null;
      kA = (short[][])null;
      lA = 0;
      mA = 0;
      nA = 0;
      oA = 3;
      pA = false;
      qA = null;
      rA = null;
      sA = null;
      zA = false;
      ab = new int[3];
      bb = new int[2];
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
      jc = null;
      mc = new short[]{100, 1, 101, 0, 102, 0, 103, 0, 104, 0, 105, 0, 106, 0, 107, 0};
      nc = new byte[]{4, 5, 6, 7, -1, -1, -1, -1, 4, 5, 6, 7, 4, 5, 6, 7, 4};
      oc = new byte[][]{{0, 1, 5, 4, 2, 3, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 1, 5, 4, 2, 3, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0}, {0, 1, 5, 4, 2, 3, 0}, {0, 1, 5, 4, 2, 3, 0}};
      zc = new short[4];
      aC = new int[][][]{{{3407872, 9372162, 13107714, 16646401}, {13312, 167682, 182274, 130561, 52, 131727, 131784, 66046}}, {{14421004, 7143424, 3217682}, {842764, 27904, 1650962}}, {{6317423, 8357007, 9672610}, {1052939, 2170388, 3287581}}, {{16777215, 16776643, 16775223, 16756224, 16730112}, {16777215, 16185851, 15463158, 13557993, 11455450, 6198098, 5211714, 2514711, 3238946, 999951}}, {{11796479, 65535, 185083, 239096}, {14869247, 11315711, 9404927, 7559679, 11140522, 1242901, 1299989, 1291541, 16776839, 16764434, 16742162, 16719104}}, {{2833446, 2504478, 2239772, 1581331}, {6172198, 5971226, 4660764, 3478289, 3292493, 2701384, 2436922, 1712939, 2829099, 1973790, 1118481, 131586, 6441004, 4337950, 3220502, 2234383, 7251627, 5339517, 3823450, 2175540}}};
      bC = null;
      cC = (byte[][])null;
      dC = (int[][])null;
      eC = new int[4][20];
      fC = 0;
      gC = 0;
      hC = 0;
      iC = 0;
      jC = 0;
      kC = new int[7];
      lC = new int[]{9133598, 0, 11908783, 4474695, 2048, 4096, 256, 9133598, 0, 4474695, 11908783, 1024, 4096, 128};
      mC = new int[2];
      nC = new int[2];
      oC = false;
      pC = false;
      qC = null;
      rC = "";
      sC = "";
      tC = -1;
      uC = -1;
      vC = -1;
      wC = -1;
      xC = -1;
      yC = 0;
      zC = 0;
      ad = 0;
      bd = 0;
      cd = 0;
      dd = -1;
      ed = 0;
      fd = -1;
      gd = null;
      hd = -1;
      id = false;
      jd = new Vector();
      kd = null;
      ld = 0;
      md = 0;
      nd = 0;
      od = 0;
      pd = -1;
      qd = null;
      rd = false;
      sd = true;
      td = -1L;
      ud = 0;
      vd = 0;
      wd = 0;
      xd = 0;
      yd = -1;
      zd = 0;
      aD = -1;
      bD = -1;
      cD = 0;
      dD = 0;
      eD = 1;
      fD = false;
      gD = false;
      hD = new Hashtable();
      iD = 0;
      jD = 0;
      kD = 0;
      lD = 0;
      mD = 0;
      nD = 0;
      oD = false;
      pD = "";
      qD = (int[][])null;
      rD = (int[][])null;
      sD = false;
      tD = new int[4];
      uD = new int[2];
      vD = new int[2];
      wD = 0;
      new Random();
      zD = -1;
      ae = -1;
      be = -1;
      ce = -1;
      de = new int[2];
      ee = new int[2];
      fe = new int[2];
      ge = new int[2];
      he = new int[2];
      ie = new int[4];
      je = new int[2];
      ke = new int[]{2088005690, 2088005795, 2088005702, 2088005753, 2088005704, 2088005832, 2088005741, 2088005694, 2088005753, 2088005757, 2088005706, 2088005753, 2088005763, 2088005718, 2088005832, 2088005733, 2088005847, 2088005753};
      le = new int[]{2088005753, 2088005832, 2088005753, 2088005753, 2088005832, 2088005702, 2088005847, 2088005718, 2088005706, 2088005694, 2088005704, 2088005795, 2088005733, 2088005763, 2088005757, 2088005741, 2088005753, 2088005690};
      me = new int[]{2088005702, 2088005795, 2088005690, 2088005832, 2088005704, 2088005753, 2088005753, 2088005694, 2088005741, 2088005753, 2088005706, 2088005757, 2088005832, 2088005718, 2088005763, 2088005753, 2088005847, 2088005733};
      ne = new int[]{2088005702, 2088005832, 2088005753, 2088005753, 2088005832, 2088005753, 2088005795, 2088005704, 2088005694, 2088005706, 2088005718, 2088005847, 2088005690, 2088005753, 2088005741, 2088005757, 2088005763, 2088005733};
      oe = new int[4];
      pe = new int[18];
      qe = new int[3];
      re = new int[9];
      se = new int[]{-553648665, -671089408, -822084154, -687866624, -452985351, -553648896, -1023410986, -738198272, -1040188194};
      te = new int[3];
      ue = new int[9];
      ve = new int[]{-553648665, -671089408, -822084154, -687866624, -452985351, -553648896, -1023410986, -738198272, -1040188194};
      we = new int[2];
      xe = new int[3];
      ye = new int[9];
      ze = new int[]{64, 128, 64, 128, 160, 128, 160, 240, 160};
      aE = new int[3];
      bE = new int[9];
      cE = new int[]{64, 128, 64, 128, 160, 128, 160, 240, 160};
      dE = new int[3];
      eE = new int[30];
      fE = new int[]{0, 44748, 48844, 43468, 0, 43724, 48895, 48895, 47615, 35276, 44492, 21122, 48895, 21122, 34508, 38348, 40959, 31999, 40959, 28620, 0, 28620, 38348, 28620, 0, 0, 38307, 28620, 38307, 24320};
      gE = new int[2];
      hE = new int[256];
      iE = new int[]{0, 0, 0, 0, 0, 14151, 14193, 14193, 14193, 14193, 14193, 14151, 0, 0, 0, 0, 0, 0, 0, 24330, 24346, 19853, 19410, 19410, 19410, 19410, 19410, 19853, 24346, 24330, 0, 0, 0, 0, 0, 24377, 24473, 36817, 41714, 41714, 41714, 41714, 41714, 36817, 24473, 24377, 0, 0, 0, 24330, 24377, 31107, 35039, 44019, 48895, 48895, 48895, 48895, 48895, 41715, 28127, 26755, 24377, 24330, 0, 24346, 24473, 35039, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 43007, 33023, 28127, 24473, 24346, 0, 39450, 39577, 43743, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 46591, 43007, 35551, 29849, 29722, 0, 48666, 48793, 48863, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 39903, 32921, 32794, 0, 48666, 48793, 48863, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 48895, 39903, 32921, 32794, 0, 48666, 48793, 43726, 35281, 37086, 40940, 47612, 48895, 47612, 40940, 37086, 35281, 33998, 32921, 32794, 0, 48666, 48793, 37823, 15784, 20923, 30419, 44786, 47353, 44786, 30419, 20923, 15784, 27327, 32921, 32794, 0, 48666, 48793, 39112, 22466, 19381, 23224, 35539, 37593, 35539, 23224, 19381, 22466, 29128, 32921, 32794, 0, 39450, 39577, 37843, 35039, 32719, 29891, 27326, 30148, 32715, 31431, 29903, 28127, 31187, 32921, 32794, 0, 24346, 24473, 35039, 48895, 48895, 42728, 20654, 24760, 35282, 45554, 43007, 33023, 32991, 32921, 32794, 0, 24330, 24377, 31107, 35039, 44019, 46838, 40673, 41700, 42990, 40186, 34815, 27647, 29327, 32825, 32778, 0, 0, 0, 24377, 24473, 42193, 48882, 48882, 48882, 46834, 36850, 30175, 24511, 24392, 0, 0, 0, 0, 0, 24330, 24346, 47245, 48850, 48850, 48850, 46802, 37074, 32143, 24352, 24332, 0, 0};
      jE = new int[2];
      kE = new int[8];
      lE = new int[]{-671089168, -452985392, -738198096, -738198128, -738198160, -738198192, -738198224, -738198256};
      mE = new int[16];
      nE = new int[]{55280, 55280, 55280, 55280, 0, 0, 55280, 0, 0, 55280, 0, 0, 55280, 55280, 55280, 55280};
      oE = new int[32];
      pE = new int[]{65296, 65306, 65314, 65319, 65314, 65307, 65296, 65287, 65329, 65352, 65374, 65382, 65375, 65357, 65333, 65309, 65382, 65414, 65437, 65448, 65441, 65423, 65390, 65347, 65428, 65456, 65474, 65486, 65482, 65468, 65437, 65389};
      qE = new int[2];
      rE = new int[24];
      sE = new int[]{-65360, -65296, -65360, -65392, -65328, -65392, -65424, -65360, -65424, -65456, -65392, -65456, -65472, -65424, -65472, -65488, -65456, -65488, -65504, -65488, -65504, -65520, -65520, -65520};
      tE = -1L;
      uE = -1L;
   }
}
