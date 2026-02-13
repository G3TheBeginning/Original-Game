import java.io.DataInputStream;
import java.io.IOException;

public class B {
   public static int[][] a = (int[][])null;
   public static int b = -1;
   public static int c = -1;
   public static int d = 16;
   public static int e = 16;
   public static int f = 0;
   static int[][] g = (int[][])null;
   public static int h = -1;
   public static boolean i = true;
   public static int j = 0;
   public static int k = 0;
   private static int[][][] l = new int[6][][];
   public static int m = 0;
   public static int n = 0;
   public static int o = 0;
   public static int p = 0;
   public static int q = 0;
   public static int r = 0;
   public static int s = 0;
   public static int[] t = new int[4];
   public static int[][] u;
   private static int[] v = new int[2];
   private static int[] w = new int[4];
   private static int[] x = new int[2];
   public static int[] y = new int[2];
   public static int[] z = new int[4];
   public static int[] aa = new int[4];
   private static int[] ba = new int[4];
   public static int[] ca = new int[2];
   public static int[] da = new int[2];
   public static int[] ea = new int[4];
   public static int[] fa = new int[4];
   public static int[] ga = new int[4];
   public static int[] ha = new int[2];
   public static int[] ia = new int[2];
   private static int[] ja = new int[4];
   private static int[] ka = new int[4];
   private static int[] la = new int[2];
   private static int[] ma = new int[2];
   private static int[] na = new int[2];
   public static int[][][] oa;
   public static int[][][] pa;
   public static int qa;
   public static int ra;
   public static int sa;
   public static int ta;
   public static int ua;
   public static int va;
   public static int wa;
   public static int[] xa;
   public static int ya;
   public static int za;
   public static int[] aA;
   public static int[] bA;
   public static int[] cA;
   public static int[][] dA;
   public static int eA;
   private static int fA;
   private static int gA;

   public static void A() {
      int var0 = 1 + A.fa.length;
      var0 += A.qa.length;
      var0 += A.ha.length;
      var0 += A.ja.length;
      var0 += A.la.length;
      var0 += A.na.length;
      var0 += A.ta.length;
      var0 += A.va.length;
      var0 += A.jA.length;
      var0 += A.kA.length;
      var0 += A.pD.length;
      a = new int[var0][];
      byte var2 = 0;
      a[0] = A.da;
      int[] var10000 = A.da;
      var10000[2] &= -65536;
      var10000 = A.da;
      var10000[2] |= 0;
      var10000 = A.da;
      var10000[2] &= 65535;
      var10000 = A.da;
      var10000[2] |= 0;
      A.da[1] = -1;
      A.da[3] = 0;
      var10000 = A.da;
      var10000[3] |= 16;
      var10000 = A.da;
      var10000[3] |= 4;
      var10000 = A.da;
      var10000[3] |= 8;
      int var3 = var2 + 1;

      for(var0 = 0; var0 < A.fa.length; ++var0) {
         a[var3] = A.fa[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 32;
         var10000 = a[var3];
         var10000[3] |= 8;
         var10000 = a[var3];
         var10000[3] |= 4;
         ++var3;
      }

      for(var0 = 0; var0 < A.qa.length; ++var0) {
         a[var3] = A.qa[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 4096;
         ++var3;
      }

      for(var0 = 0; var0 < A.ha.length; ++var0) {
         a[var3] = A.ha[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 64;
         ++var3;
      }

      for(var0 = 0; var0 < A.ja.length; ++var0) {
         a[var3] = A.ja[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 128;
         ++var3;
      }

      for(var0 = 0; var0 < A.la.length; ++var0) {
         a[var3] = A.la[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 256;
         ++var3;
      }

      for(var0 = 0; var0 < A.na.length; ++var0) {
         a[var3] = A.na[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 512;
         ++var3;
      }

      for(var0 = 0; var0 < A.ta.length; ++var0) {
         a[var3] = A.ta[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 8192;
         ++var3;
      }

      for(var0 = 0; var0 < A.va.length; ++var0) {
         a[var3] = A.va[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 1024;
         ++var3;
      }

      for(var0 = 0; var0 < A.jA.length; ++var0) {
         a[var3] = A.jA[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 2048;
         var10000 = a[var3];
         var10000[3] |= 8;
         var10000 = a[var3];
         var10000[3] |= 65536;
         ++var3;
      }

      for(var0 = 0; var0 < A.kA.length; ++var0) {
         a[var3] = A.kA[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 262144;
         var10000 = a[var3];
         var10000[3] |= 8;
         var10000 = a[var3];
         var10000[3] |= 32768;
         var10000 = a[var3];
         var10000[3] |= 65536;
         ++var3;
      }

      for(var0 = 0; var0 < A.pD.length; ++var0) {
         a[var3] = A.pD[var0];
         var10000 = a[var3];
         var10000[2] &= -65536;
         var10000 = a[var3];
         var10000[2] |= (short)var3 & '\uffff';
         var10000 = a[var3];
         var10000[2] &= 65535;
         var10000 = a[var3];
         var10000[2] |= (short)var0 << 16 & -65536;
         a[var3][1] = -1;
         var10000 = a[var3];
         var10000[3] |= 16384;
         var10000 = a[var3];
         var10000[3] |= 8;
         ++var3;
      }

      for(int var1 = 0; var1 < var3; ++var1) {
         if ((a[var1][3] & 65536) == 0) {
            var0 = B(a[var1]);
            A(a[var1], (short)(var0 & '\uffff'), (short)((var0 & -65536) >> 16));
         }
      }

   }

   public static void B() {
      a = (int[][])null;
   }

   public static void A(int var0, int var1, int var2, int var3) {
      var2 = var2 & 127 | (var3 & 127) << 7;
      var0 = var1 * b * 2 * 3 + var0 * 3;
      int[] var10000 = A.xa;
      var10000[var0 + 2] &= -16384;
      var10000 = A.xa;
      var10000[var0 + 2] |= var2 & 16383;
   }

   public static int A(int var0, int var1) {
      var0 = A.xa[var1 * b * 2 * 3 + var0 * 3 + 2];
      var1 = var0 & 127;
      var0 = var0 >> 7 & 127;
      return (short)var1 & '\uffff' | (short)var0 << 16 & -65536;
   }

   public static void C() {
      A.K((short)(f & '\uffff'), 0);
      A.K((short)((f & -65536) >> 16), 0);

      for(int var0 = 0; var0 < A.qa.length; ++var0) {
         A.K(A.ra[A.qa[var0][4]][1], 0);
         A.K(A.ra[A.qa[var0][4]][1] - 8 + 185, 0);
      }

      l[0] = A.ia;
      l[1] = A.ka;
      l[2] = A.ua;
      l[3] = A.ma;
      l[4] = A.wa;
      l[5] = A.pa;

      for(int var3 = 0; var3 < 6; ++var3) {
         for(int var2 = 0; var2 < l[var3].length; ++var2) {
            short var1 = (short)(l[var3][var2][1] & '\uffff');
            short var4 = (short)((l[var3][var2][1] & -65536) >> 16);
            A.K(var1, var4);
         }
      }

   }

   public static void D() {
      A.SB();
      A.O();
      A.VA();
      A.PB();
      A.MB();
      G();
      B();
      A.NA();
      A.SA();
      A.W();
      A.K();
      A.AB();
      b = -1;
      c = -1;
      g = (int[][])null;
      A.xa = null;
      A.ya = (int[][])null;
      A.fa = (int[][])null;
      A.ha = (int[][])null;
      A.ja = (int[][])null;
      A.la = (int[][])null;
      A.na = (int[][])null;
      A.qa = (int[][])null;
      A.ta = (int[][])null;
      A.va = (int[][])null;
      A.iA = null;
      s = 0;
      r = 0;
      A.bC = (byte[][])null;
      A.cC = (int[][])null;
      A.da[11] = -1;
      A.pA = 3;
      A.hd = false;
      A.nC = false;

      for(int var0 = 0; var0 < A.dC.length; ++var0) {
         A.dC[var0][0] = 0;
      }

      j = 0;
      A.rD = false;
      A.q = false;
      System.gc();
   }

   public static void B(int var0, int var1) {
      C.c = 25;
      if (i) {
         A.xa = new int[c * 2 * b * 2 * 3];

         for(int var2 = 0; var2 < A.xa.length; var2 += 3) {
            int[] var10000 = A.xa;
            var10000[var2] &= -65536;
            var10000 = A.xa;
            var10000[var2] |= 65535;
         }
      }

      A.L();
      A.J();
      A.UA();
      A.OB();
      A.LB();
      A.IB();
      F();
      A();
      C.c = 50;
      C.c = 50;
      A.J(var0, var1);
      A.LA();
      C();
      A.A(true, 50, 75);
      C.c = 75;
      C.c = 75;
      A.HB();
      C.c = 77;
      A.RB();
      C.c = 79;
      A.N();
      C.c = 81;
      A.Y();
      C.c = 84;
      A.V();
      C.c = 86;
      A.BB();
      C.c = 88;
      A.IA();
      C.c = 90;
      O();
      C.c = 93;
      N();
      C.c = 95;
      A.A(0, 0, g[0].length * 2, g.length * 2, true);
      C.c = 97;
      C.c = 100;
      short var3 = (short)((f & -65536) >> 16);
      switch(var3) {
      case 3:
      case 5:
         A.pA = 4;
         break;
      case 4:
      case 6:
         A.pA = 5;
         break;
      case 7:
         A.pA = 6;
         break;
      default:
         A.pA = 3;
      }

      A.yD = -1;
      A.c = false;
      System.gc();
   }

   public static int[][] A(int var0, DataInputStream var1) throws IOException {
      k = 0;
      if (var0 == 4 || var0 == 15) {
         k = 1;
      }

      if (var0 == 5 || var0 == 16) {
         k = 0;
      }

      if (var0 == 6 || var0 == 17) {
         k = 2;
      }

      if (var0 == 7 || var0 == 18) {
         k = 3;
      }

      if (var0 == 12 || var0 == 48) {
         k = 4;
      }

      if (var0 == 3 || var0 == 24) {
         k = 0;
      }

      m = 0;
      n = 0;
      q = 0;
      o = 0;
      p = 0;
      r = 0;
      s = 0;
      var1.readShort();
      short var2 = var1.readShort();
      if (A.aA == null) {
         A.aA = new int[var2];
         A.bA = new int[var2];
         A.dA = new int[var2];
         A.cA = new int[var2];
         A.eA = new int[var2];
         A.fA = new int[var2];
         A.gA = new int[var2];
         A.hA = new int[var2];
      }

      var1.close();
      System.gc();

      try {
         DataInputStream var4 = new DataInputStream(HG.db.getClass().getResourceAsStream("m" + var0));
         int[][] var5 = A(var4, true);
         B(var4);
         var4.close();
         System.gc();
         return var5;
      } catch (Exception var3) {
         return (int[][])null;
      }
   }

   public static void A(int var0, int var1, int var2) {
      if ((short)(A.da[12] & '\uffff') > 0) {
         if (A.da[11] != var0) {
            if (var0 == 14) {
               A.da[0] = 2031633;
            }

            A.FA(3);
         }

         H();
         D();
         C.c = 0;
         A.da[11] = var0;
         DataInputStream var3 = null;

         label84: {
            try {
               var3 = new DataInputStream(HG.db.getClass().getResourceAsStream("d"));
               A(var3);
               g = A(var0, var3);
               break label84;
            } catch (Exception var10) {
            } finally {
               try {
                  var3.close();
               } catch (Exception var9) {
               }

            }

            return;
         }

         System.gc();
         C.c = 25;
         A.ZA();
         B(var1, var2);
         A.A(2, 0, 0, 0, 0, true);
         A.A(18, var1, var2, 0, 0, false);
      }
   }

   public static boolean A(int var0) {
      DataInputStream var3 = null;
      boolean var2 = false;
      boolean var9 = false;

      label84: {
         label83: {
            try {
               var9 = true;

               for(int var1 = 0; var1 < var0; ++var1) {
                  var3 = new DataInputStream(HG.db.getClass().getResourceAsStream("m" + (52 + var1)));
                  oa[var1] = A(var3, false);
                  B(var3);
                  pa[var1] = A.qa;
                  var3.close();
                  var3 = null;
                  D();
               }

               var2 = true;
               var9 = false;
               break label83;
            } catch (Exception var13) {
               var13.printStackTrace();
               var9 = false;
            } finally {
               if (var9) {
                  try {
                     var3.close();
                  } catch (Exception var10) {
                  }

               }
            }

            try {
               var3.close();
            } catch (Exception var11) {
            }
            break label84;
         }

         try {
            null.close();
         } catch (Exception var12) {
         }
      }

      System.gc();
      return var2;
   }

   public static void A(DataInputStream var0) throws IOException {
      C(var0);
      D(var0);
      E(var0);
      F(var0);
      G(var0);
      H(var0);
      I(var0);
      J(var0);
      K(var0);
   }

   public static void B(DataInputStream var0) throws IOException {
      L(var0);
      M(var0);
      N(var0);
      A((DataInputStream)var0, 0);
      A((DataInputStream)var0, 1);
      O(var0);
      A((DataInputStream)var0, 2);
      P(var0);
      Q(var0);
      R(var0);
   }

   public static int[][] A(DataInputStream var0, int var1, int[][] var2, boolean var3) throws IOException {
      short var5 = var0.readShort();
      short var4 = var0.readShort();
      byte var6 = var0.readByte();
      if (A.da[11] == 0) {
         d = 8;
         e = 8;
      } else {
         d = 16;
         e = 16;
      }

      if (var3) {
         if (var1 == 0) {
            f &= -65536;
            f |= (short)var6 & '\uffff';
         } else {
            f &= 65535;
            f |= (short)var6 << 16 & -65536;
         }
      }

      byte var10 = var0.readByte();
      int var7;
      int var8;
      int var11;
      switch(var10) {
      case 0:
         if (var2 == null) {
            var2 = new int[var4][var5];
         }

         for(var8 = 0; var8 < var4; ++var8) {
            for(var7 = 0; var7 < var5; ++var7) {
               var6 = var0.readByte();
               var10 = var0.readByte();
               var11 = (var6 | var10 << 8) << 16 * var1;
               var2[var8][var7] |= var11 & '\uffff' << 16 * var1;
            }
         }

         return var2;
      case 1:
         if (var2 == null) {
            var2 = new int[var4][var5];
         }

         int var9 = 0;
         var8 = 0;

         while(true) {
            while(var8 < var4) {
               var7 = var0.readByte();
               if (var7 < 0) {
                  while(true) {
                     ++var7;
                     if (var7 > 0) {
                        break;
                     }

                     var11 = -1 << 16 * var1;
                     var2[var8][var9] |= var11 & '\uffff' << 16 * var1;
                     ++var9;
                     if (var9 >= var5) {
                        var9 = 0;
                        ++var8;
                     }
                  }
               } else {
                  while(true) {
                     --var7;
                     if (var7 < 0) {
                        break;
                     }

                     var6 = var0.readByte();
                     var10 = var0.readByte();
                     var11 = (var6 | var10 << 8) << 16 * var1;
                     var2[var8][var9] |= var11 & '\uffff' << 16 * var1;
                     ++var9;
                     if (var9 >= var5) {
                        var9 = 0;
                        ++var8;
                     }
                  }
               }
            }

            return var2;
         }
      default:
         throw new IOException();
      }
   }

   public static void C(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var3 = var0.readShort();
      if (A.ga == null) {
         A.ga = new int[var3][30];

         for(int var2 = 0; var2 < var3; ++var2) {
            A.ga[var2][13] = 0;
            A.ga[var2][0] = var0.readByte() << 16 | var0.readShort();
            A.ga[var2][6] = var0.readShort();
            A.ga[var2][12] = var0.readShort();
            A.ga[var2][5] = var0.readByte();
            A.ga[var2][7] = var0.readByte();
            A.ga[var2][8] = var0.readByte();
            A.ga[var2][10] = var0.readByte();
            A.ga[var2][17] = var0.readByte();
            A.ga[var2][18] = var0.readByte();
            A.ga[var2][19] = var0.readByte();
            A.ga[var2][20] = var0.readByte();
            A.ga[var2][11] = var0.readByte();
            A.ga[var2][14] = var0.readByte();
            A.ga[var2][15] = var0.readByte();
            A.ga[var2][16] = var0.readByte();
            A.ga[var2][25] = var0.readByte();
            A.ga[var2][27] = var0.readByte();
            A.ga[var2][23] = var0.readByte();
            A.ga[var2][24] = var0.readByte();
            A.ga[var2][26] = var0.readByte();
            A.ga[var2][21] = var0.readByte();
            A.ga[var2][22] = var0.readByte();
            A.ga[var2][28] = var0.readByte();
            A.ga[var2][9] = 4096 / var0.readByte();
            A.ga[var2][29] = var0.readByte() * 4096 / 10;
            int[] var10000 = A.ga[var2];
            var10000[13] |= 1 << var0.readByte();
            byte var4 = var0.readByte();
            if ((var4 & 1) != 0) {
               var10000 = A.ga[var2];
               var10000[13] |= 512;
            }

            if ((var4 & 2) != 0) {
               var10000 = A.ga[var2];
               var10000[13] |= 1024;
            }

            if ((var4 & 4) != 0) {
               var10000 = A.ga[var2];
               var10000[13] |= 2048;
            }

            if ((var4 & 8) != 0) {
               var10000 = A.ga[var2];
               var10000[13] |= 128;
            }

            int var5 = var0.readInt();
            A.ga[var2][2] = (short)(((byte)(var5 >> 24 & 255) << 12) / d) & '\uffff' | (short)(((byte)(var5 >> 8 & 255) << 12) / d) << 16 & -65536;
            A.ga[var2][3] = (short)(((byte)(var5 >> 16 & 255) << 12) / d) & '\uffff' | (short)(((byte)(var5 & 255) << 12) / d) << 16 & -65536;
            A.ga[var2][1] = var0.readShort() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            A.ga[var2][4] = -1;
            var4 = var0.readByte();
            if (var4 == 1) {
               var10000 = A.ga[var2];
               var10000[4] &= -256;
               var10000 = A.ga[var2];
               var10000[4] |= var0.readByte() & 255;
               var10000 = A.ga[var2];
               var10000[4] &= -65281;
               var10000 = A.ga[var2];
               var10000[4] |= var0.readByte() << 8 & '\uff00';
               var10000 = A.ga[var2];
               var10000[4] &= -16711681;
               var10000 = A.ga[var2];
               var10000[4] |= var0.readByte() << 16 & 16711680;
            }
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void D(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (A.ma == null) {
         A.ma = new int[var2][7];

         for(int var3 = 0; var3 < var2; ++var3) {
            A.ma[var3][0] = var0.readByte() << 16 | var0.readShort();
            A.ma[var3][5] = var0.readByte();
            A.ma[var3][3] = var0.readByte();
            A.ma[var3][6] = var0.readByte();
            A.ma[var3][4] = var0.readShort();
            int[] var10000 = A.ma[var3];
            var10000[1] &= -65536;
            var10000 = A.ma[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            A.ma[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void E(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (A.pa == null) {
         A.pa = new int[var2][5];

         for(int var3 = 0; var3 < var2; ++var3) {
            A.pa[var3][0] = var0.readByte() << 16 | var0.readShort();
            A.pa[var3][3] = var0.readByte() << 16 | var0.readShort();
            A.pa[var3][4] = var0.readByte();
            int[] var10000 = A.pa[var3];
            var10000[1] &= -65536;
            var10000 = A.pa[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            A.pa[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void F(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var4 = var0.readShort();
      if (A.ia == null) {
         A.ia = new int[var4][17];

         for(int var3 = 0; var3 < var4; ++var3) {
            A.ia[var3][0] = var0.readByte() << 16 | var0.readShort();
            A.ia[var3][15] = var0.readByte();
            A.ia[var3][11] = var0.readByte();
            A.ia[var3][10] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            A.ia[var3][13] = var0.readByte() * 4096 / 10;
            A.ia[var3][12] = var0.readByte();
            A.ia[var3][4] = var0.readShort();
            A.ia[var3][14] = var0.readByte();

            int var5;
            for(var5 = 0; var5 < 5; ++var5) {
               A.ia[var3][5 + var5] = -1;
            }

            byte var2 = var0.readByte();
            int[] var10000;
            if (var2 >= 1) {
               var10000 = A.ia[var3];
               var10000[3] |= 1;

               for(var5 = 0; var5 < var2; ++var5) {
                  A.ia[var3][5 + var5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
               }
            }

            var10000 = A.ia[var3];
            var10000[1] &= -65536;
            var10000 = A.ia[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            A.ia[var3][2] = var0.readByte();
            A.ia[var3][16] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void G(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var4 = var0.readShort();
      if (A.ka == null) {
         A.ka = new int[var4][14];

         for(int var3 = 0; var3 < var4; ++var3) {
            A.ka[var3][0] = var0.readByte() << 16 | var0.readShort();
            A.ka[var3][10] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            A.ka[var3][11] = var0.readByte();
            A.ka[var3][12] = var0.readByte();
            A.ka[var3][13] = var0.readByte();
            A.ka[var3][4] = var0.readShort();

            int var5;
            for(var5 = 0; var5 < 5; ++var5) {
               A.ka[var3][5 + var5] = -1;
            }

            byte var2 = var0.readByte();
            int[] var10000;
            if (var2 >= 1) {
               var10000 = A.ka[var3];
               var10000[3] |= 1;

               for(var5 = 0; var5 < var2; ++var5) {
                  A.ka[var3][5 + var5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
               }
            }

            var10000 = A.ka[var3];
            var10000[1] &= -65536;
            var10000 = A.ka[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            A.ka[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void H(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var4 = var0.readShort();
      if (A.ra == null) {
         A.ra = new int[var4][6];

         for(int var3 = 0; var3 < var4; ++var3) {
            int var5 = var0.readInt();
            A.ra[var3][2] = (short)(((byte)(var5 >> 24 & 255) << 12) / d) & '\uffff' | (short)(((byte)(var5 >> 8 & 255) << 12) / d) << 16 & -65536;
            A.ra[var3][3] = (short)(((byte)(var5 >> 16 & 255) << 12) / d) & '\uffff' | (short)(((byte)(var5 & 255) << 12) / d) << 16 & -65536;
            A.ra[var3][4] = (var0.readByte() << 12) / d;
            short var2 = var0.readShort();
            byte var6 = var0.readByte();
            if ((var6 & 128) == 128) {
               A.ra[var3][5] = 1;
               var6 = (byte)(var6 & 127);
            }

            A.ra[var3][1] = (short)var2 & '\uffff' | (short)var6 << 16 & -65536;
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void I(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var4 = var0.readShort();
      if (A.ua == null) {
         A.ua = new int[var4][12];

         for(int var3 = 0; var3 < var4; ++var3) {
            A.ua[var3][0] = var0.readByte() << 16 | var0.readShort();
            A.ua[var3][10] = var0.readByte();
            A.ua[var3][11] = var0.readByte();
            A.ua[var3][4] = var0.readShort();

            int var5;
            for(var5 = 0; var5 < 5; ++var5) {
               A.ua[var3][5 + var5] = -1;
            }

            byte var2 = var0.readByte();
            int[] var10000;
            if (var2 >= 1) {
               var10000 = A.ua[var3];
               var10000[3] |= 1;

               for(var5 = 0; var5 < var2; ++var5) {
                  A.ua[var3][5 + var5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
               }
            }

            var10000 = A.ua[var3];
            var10000[1] &= -65536;
            var10000 = A.ua[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            A.ua[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void J(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (A.wa == null) {
         A.wa = new int[var2][11];

         for(int var3 = 0; var3 < var2; ++var3) {
            A.wa[var3][0] = var0.readByte() << 16 | var0.readShort();
            A.wa[var3][10] = var0.readByte() << 16 | var0.readShort();
            A.wa[var3][8] = var0.readByte();
            A.wa[var3][3] = var0.readByte();
            A.wa[var3][4] = var0.readByte();
            A.wa[var3][5] = var0.readByte();
            A.wa[var3][6] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            A.wa[var3][7] = var0.readByte();
            A.wa[var3][9] = var0.readByte();
            A.wa[var3][1] = var0.readShort() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            A.wa[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static void K(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (A.sa == null) {
         A.sa = new int[var2][5];

         for(int var3 = 0; var3 < var2; ++var3) {
            A.sa[var3][0] = var0.readByte() << 16 | var0.readShort();
            A.sa[var3][1] = var0.readByte();
            A.sa[var3][3] = var0.readByte();
            A.sa[var3][2] = var0.readByte();
            A.sa[var3][4] = var0.readByte();
            if (A.sa[var3][1] == 0) {
               ++A.mA;
            } else if (A.sa[var3][1] == 1) {
               ++A.nA;
            }
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static int[][] A(DataInputStream var0, boolean var1) throws IOException {
      b = var0.readShort();
      c = var0.readShort();
      byte var4 = var0.readByte();
      int[][] var3 = (int[][])null;

      for(int var2 = 0; var2 < var4; ++var2) {
         var3 = A(var0, var2, var3, var1);
      }

      return var3;
   }

   public static void L(DataInputStream var0) throws IOException {
      byte var5 = var0.readByte();
      A.fa = new int[var5][32];
      A.ya = new int[var5][];

      for(int var4 = 0; var4 < var5; ++var4) {
         A.fa[var4][11] = var0.readByte();
         int var1 = A.ga[A.fa[var4][11]][27];
         if (var1 < 6 || var1 > 8) {
            i = true;
         }

         byte var2 = var0.readByte();
         byte var6 = var0.readByte();
         A.fa[var4][4] = var2 * 4096 + 2048;
         A.fa[var4][5] = var6 * 4096 + 4095;
         A.fa[var4][12] = (short)A.ga[A.fa[var4][11]][6] & '\uffff' | (short)A.ga[A.fa[var4][11]][6] << 16 & -65536;
         A.fa[var4][14] = var0.readByte();
         A.fa[var4][15] = var0.readByte();
         var6 = var0.readByte();
         int[] var10000;
         if ((var6 & 1) != 0) {
            var10000 = A.fa[var4];
            var10000[13] |= 1024;
         }

         if ((var6 & 2) != 0) {
            var10000 = A.fa[var4];
            var10000[13] |= 2048;
         }

         if ((var6 & 4) != 0) {
            var10000 = A.fa[var4];
            var10000[13] |= 4096;
         }

         if (A.fa[var4][14] >= 0 || A.ga[A.fa[var4][11]][23] >= 0 && A.fa[var4][14] != -2) {
            ++m;
         }

         if (A.fa[var4][15] >= 0 || A.ga[A.fa[var4][11]][24] >= 0 && A.fa[var4][15] != -2) {
            ++m;
         }

         if (A.ga[A.fa[var4][11]][26] >= 0) {
            ++q;
         }

         var1 = -1;
         if (A.fa[var4][14] >= 0) {
            var1 = A.ia[A.fa[var4][14]][15];
         }

         if (A.fa[var4][15] >= 0 && var1 != 2 && var1 != 3) {
            var1 = A.ia[A.fa[var4][15]][15];
         }

         if (A.ga[A.fa[var4][11]][23] >= 0 && var1 != 2 && var1 != 3) {
            var1 = A.ga[A.fa[var4][11]][23];
         }

         if (A.ga[A.fa[var4][11]][24] >= 0 && var1 != 2 && var1 != 3) {
            var1 = A.ga[A.fa[var4][11]][24];
         }

         if (var1 == 2 || var1 == 3) {
            ++n;
         }

         boolean var3 = false;

         for(int var7 = 0; var7 < 2; ++var7) {
            var6 = var0.readByte();
            switch(var6) {
            case 2:
               A.fa[var4][17 + var7] = (short)var6 & '\uffff' | (short)var0.readByte() << 16 & -65536;
               ++n;
               break;
            case 3:
               A.fa[var4][17 + var7] = (short)var6 & '\uffff' | (short)var0.readByte() << 16 & -65536;
               ++o;
               break;
            case 4:
            default:
               A.fa[var4][17 + var7] = -1;
               break;
            case 5:
               A.fa[var4][17 + var7] = (short)var6 & '\uffff' | (short)var0.readByte() << 16 & -65536;
               var3 = true;
               ++p;
            }

            if (A.fa[var4][17 + var7] == -1 && A.ga[A.fa[var4][11]][21 + var7] != -1) {
               ++n;
            }
         }

         A.fa[var4][19] = A.V(var4);
         A.fa[var4][21] = -1;
         if (A.ga[A.fa[var4][11]][27] != 7 && A.ga[A.fa[var4][11]][27] != 8) {
            ++s;
         } else {
            m += 25;
            n += 25;
            q += 25;
            o += 25;
            s += 4;
         }

         if ((A.dA[A.da[11]] & 1 << var4) != 0) {
            if (var3) {
               A.fa[var4][14] = -1;
               A.fa[var4][15] = -1;
               A.fa[var4][19] = 0;
               if ((short)(A.fa[var4][17] & '\uffff') != 5) {
                  A.fa[var4][17] = -1;
               }

               if ((short)(A.fa[var4][18] & '\uffff') != 5) {
                  A.fa[var4][18] = -1;
               }

               var10000 = A.fa[var4];
               var10000[12] &= -65536;
               var10000 = A.fa[var4];
               var10000[12] |= 65535;
               var10000 = A.dA;
               int var10001 = A.da[11];
               var10000[var10001] &= ~(1 << var4);
            } else {
               var10000 = A.fa[var4];
               var10000[3] |= 65536;
               A.fa[var4][0] = -1;
            }
         }

         var10000 = A.fa[var4];
         var10000[27] &= -65536;
         var10000 = A.fa[var4];
         var10000[27] |= (short)var0.readByte() & '\uffff';
      }

   }

   public static void M(DataInputStream var0) throws IOException {
      byte var2 = var0.readByte();
      A.la = new int[var2 + n + 15][7];
      A.B(A.la);

      for(int var1 = 0; var1 < var2; ++var1) {
         A.la[var1][4] = var0.readByte();
         A.la[var1][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         A.la[var1][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         A.la[var1][6] = var0.readByte();
         if (A.da[11] >= 0 && (A.bA[A.da[11]] & 1 << var1) != 0) {
            int[] var10000 = A.la[var1];
            var10000[3] |= 65536;
         }
      }

   }

   public static void N(DataInputStream var0) throws IOException {
      byte var2 = var0.readByte();
      j = var2;
      A.na = new int[var2 + p][6];
      A.B(A.na);

      for(int var1 = 0; var1 < var2; ++var1) {
         A.na[var1][4] = var0.readByte();
         A.na[var1][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         A.na[var1][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         if (A.da[11] >= 0 && (A.cA[A.da[11]] & 1 << var1) != 0) {
            int[] var10000 = A.na[var1];
            var10000[3] |= 65536;
         }
      }

   }

   public static void A(DataInputStream var0, int var1) throws IOException {
      byte var5 = var0.readByte();
      int[][] var4 = (int[][])null;
      int[] var3 = null;
      int[][] var10000 = (int[][])null;
      byte var2 = 0;
      switch(var1) {
      case 0:
         A.ha = new int[var5 + m + 15][9];
         var4 = A.ha;
         var2 = 6;
         var3 = A.eA;
         break;
      case 1:
         A.ja = new int[var5 + q + 15][9];
         var4 = A.ja;
         var2 = 7;
         var3 = A.fA;
         break;
      case 2:
         A.ta = new int[var5 + o + 15][8];
         var4 = A.ta;
         var2 = 13;
         var3 = A.gA;
      }

      A.B(var4);

      for(var1 = 0; var1 < var5; ++var1) {
         var4[var1][4] = var0.readByte();
         var4[var1][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         var4[var1][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         if (var0.readByte() == 1) {
            var4[var1][3] |= 131072;
         }

         var4[var1][3] |= 1 << var2;
         A(var4[var1][4], (var4[var1][3] & 131072) != 0, var4[var1]);
         if (A.da[11] >= 0 && (var3[A.da[11]] & 1 << var1) != 0) {
            var4[var1][3] |= 65536;
         }
      }

   }

   public static void O(DataInputStream var0) throws IOException {
      byte var8 = var0.readByte();
      A.qa = new int[var8][11];

      for(int var7 = 0; var7 < var8; ++var7) {
         A.qa[var7][4] = var0.readByte();
         byte var6 = var0.readByte();
         byte var5 = var0.readByte();
         byte var4 = var0.readByte();
         byte var3 = var0.readByte();
         A.qa[var7][6] = var0.readByte();
         A.qa[var7][7] = var0.readByte();
         byte var2 = var0.readByte();
         byte var1 = var0.readByte();
         A.qa[var7][8] = (short)var2 & '\uffff' | (short)var1 << 16 & -65536;
         int var10;
         int[] var10000;
         if (var2 > 0) {
            if (var2 != 4 && var2 != 5) {
               if (var2 == 8) {
                  ++s;
               }
            } else {
               var10 = A.qa[var7][6];
               var10000 = A.qa[var7];
               var10000[8] &= 16777215;
               var10000 = A.qa[var7];
               var10000[8] |= (byte)var10 << 24 & -16777216;
               A.qa[var7][6] = 0;
               ++s;
               var10 = A.CA(var10);
               var10000 = A.qa[var7];
               var10000[9] &= 65535;
               var10000 = A.qa[var7];
               var10000[9] |= (short)var10 << 16 & -65536;
               if (A.da[11] >= 0 && (A.aA[A.da[11]] & 1 << r) != 0) {
                  var10 = A.cc[A.ra[A.qa[var7][4]][1] * 11 + 5] - 1;
                  var10000 = A.qa[var7];
                  var10000[10] &= -65536;
                  var10000 = A.qa[var7];
                  var10000[10] |= (short)var10 & '\uffff';
                  if (var2 == 5) {
                     var10000 = A.qa[var7];
                     var10000[3] |= 32768;
                     A.bc = true;
                  }
               }

               var10000 = A.qa[var7];
               var10000[8] &= -65281;
               var10000 = A.qa[var7];
               var10000[8] |= (byte)r << 8 & '\uff00';
               r += 2;
            }
         } else {
            short var9 = A.cc[A.ra[A.qa[var7][4]][1] * 11 + 5];
            if (var9 > 1) {
               var10000 = A.qa[var7];
               var10000[10] &= -65536;
               var10000 = A.qa[var7];
               var10000[10] |= (short)HG.A((int)var9) & '\uffff';
               A.E(A.qa[var7], true);
            }
         }

         var10000 = A.qa[var7];
         var10000[10] &= 16777215;
         var10000 = A.qa[var7];
         var10000[10] |= 16777216;
         var10 = (var6 << 12) + (var4 << 12) / d + 2048;
         int var11 = (var5 << 12) - (var3 << 12) / d + 4096 + A.qa[var7][6] * 4096 - 1;
         A.qa[var7][0] = (short)(var10 >> 12) & '\uffff' | (short)(var11 >> 12) << 16 & -65536;
         A.qa[var7][5] = (short)(var10 % 4096) & '\uffff' | (short)(var11 % 4096) << 16 & -65536;
         if (A.ra[A.qa[var7][4]][2] == A.ra[A.qa[var7][4]][3]) {
            var10000 = A.qa[var7];
            var10000[3] |= 32768;
         }
      }

   }

   public static void P(DataInputStream var0) throws IOException {
      byte var2 = var0.readByte();
      A.va = new int[var2][6];
      A.B(A.va);

      for(int var1 = 0; var1 < var2; ++var1) {
         A.va[var1][4] = var0.readByte();
         A.va[var1][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         A.va[var1][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         if (A.da[11] >= 0 && (A.hA[A.da[11]] & 1 << var1) != 0) {
            int[] var10000 = A.va[var1];
            var10000[3] |= 65536;
         }
      }

   }

   public static void Q(DataInputStream var0) throws IOException {
      byte var2 = var0.readByte();
      A.cC = new int[var2][7];

      for(int var1 = 0; var1 < var2; ++var1) {
         A.cC[var1][0] = var0.readByte();
         A.cC[var1][1] = 1;
         switch(A.cC[var1][0]) {
         case 3:
         case 11:
            A.cC[var1][2] = var0.readByte();
            A.cC[var1][3] = var0.readShort();
            break;
         case 4:
         case 9:
            A.cC[var1][2] = var0.readShort();
         case 5:
         case 6:
         case 7:
         case 10:
         case 15:
         case 16:
         case 17:
         default:
            break;
         case 8:
         case 13:
         case 18:
            A.cC[var1][2] = var0.readByte();
            A.cC[var1][3] = var0.readByte();
            A.cC[var1][4] = var0.readByte();
            A.cC[var1][5] = var0.readByte();
            break;
         case 12:
            A.cC[var1][2] = var0.readByte();
            A.cC[var1][3] = var0.readShort();
            A.cC[var1][4] = var0.readByte();
            break;
         case 14:
            A.cC[var1][2] = var0.readShort();
            A.cC[var1][3] = var0.readByte();
            A.cC[var1][4] = var0.readByte();
         }

         A.cC[var1][6] = var0.readByte();
      }

   }

   public static void R(DataInputStream var0) throws IOException {
      byte var3 = var0.readByte();
      A.bC = new byte[var3][];

      for(int var2 = 0; var2 < var3; ++var2) {
         short var1 = var0.readShort();
         A.bC[var2] = new byte[var1];
         var0.read(A.bC[var2], 0, var1);
      }

   }

   static int E() {
      int var0;
      if (A.da[11] == -1) {
         var0 = eA;
      } else {
         var0 = A.aA[A.da[11]];
      }

      return var0;
   }

   static void B(int var0) {
      if (A.da[11] == -1) {
         eA = var0;
      } else {
         A.aA[A.da[11]] = var0;
      }

   }

   public static void F() {
      u = new int[c][b];

      for(int var1 = 0; var1 < u.length; ++var1) {
         for(int var0 = 0; var0 < u[var1].length; ++var0) {
            u[var1][var0] = -1;
         }
      }

   }

   public static void G() {
      u = (int[][])null;
   }

   public static void A(int[] var0, int[] var1) {
      if ((var0[3] & 2048) != 0) {
         var1[0] = var0[4] + var0[6] >> 1;
         var1[1] = var0[5] + var0[7] >> 1;
      } else if ((var0[3] & 8) != 0) {
         var1[0] = var0[4];
         var1[1] = var0[5];
      } else {
         var1[0] = (short)(var0[0] & '\uffff') << 12;
         var1[1] = (short)((var0[0] & -65536) >> 16) << 12;
         if ((var0[3] & 4096) != 0) {
            var1[0] += (short)(var0[5] & '\uffff');
            var1[1] += (short)((var0[5] & -65536) >> 16);
         } else {
            var1[0] += 2048;
            var1[1] += 2048;
         }

      }
   }

   public static void B(int[] var0, int[] var1) {
      A(var0, var1);
      var1[2] = 0;
      if ((var0[3] & 4096) != 0) {
         var1[2] = var0[6] * 4096;
      }

   }

   public static int A(int[] var0) {
      if ((var0[3] & 4096) != 0) {
         A(var0, v);
         int var1 = v[1];
         var0 = A.A(var0);
         return var1 + var0[4];
      } else {
         C(var0, w);
         return w[3];
      }
   }

   public static int B(int[] var0) {
      if ((var0[3] & 8) == 0) {
         return var0[0];
      } else {
         A(var0, x);
         int[] var10000;
         if (x[0] < 0) {
            var10000 = x;
            var10000[0] -= 4096;
         }

         if (x[1] < 0) {
            var10000 = x;
            var10000[1] -= 4096;
         }

         return (short)(x[0] >> 12) & '\uffff' | (short)(x[1] >> 12) << 16 & -65536;
      }
   }

   public static void C(int[] var0, int[] var1) {
      A(var0, y);
      short var5 = 0;
      short var4 = 0;
      short var3 = 0;
      short var2 = 0;
      if ((var0[3] & 16) != 0) {
         var5 = -1024;
         var4 = 1024;
         var3 = -2048;
         var2 = 256;
      }

      if ((var0[3] & 32) != 0) {
         int[] var6 = A.ga[var0[11]];
         var5 = (short)(var6[2] & '\uffff');
         var3 = (short)((var6[2] & -65536) >> 16);
         var4 = (short)(var6[3] & '\uffff');
         var2 = (short)((var6[3] & -65536) >> 16);
      }

      if ((var0[3] & 4096) != 0) {
         var0 = A.ra[var0[4]];
         var5 = (short)(var0[2] & '\uffff');
         var3 = (short)((var0[2] & -65536) >> 16);
         var4 = (short)(var0[3] & '\uffff');
         var2 = (short)((var0[3] & -65536) >> 16);
      }

      var1[0] = y[0] + var5;
      var1[1] = y[1] + var3;
      var1[2] = y[0] + var4;
      var1[3] = y[1] + var2;
   }

   public static void D(int[] var0, int[] var1) {
      C(var0, z);
      var1[0] = z[2] + z[0] >> 1;
      var1[1] = z[3] + z[1] >> 1;
   }

   public static boolean E(int[] var0, int[] var1) {
      return var0[0] <= var1[2] && var0[1] <= var1[3] && var0[2] >= var1[0] && var0[3] >= var1[1];
   }

   public static boolean A(int var0, int var1, int var2, int var3, int[] var4, int[] var5) {
      int var11 = 0;
      int var10 = 0;
      boolean var9 = false;
      boolean var8 = false;
      boolean var7 = false;
      int var6 = var2 - var0;
      if (var6 < 0 && var4[2] <= var0 && var4[2] >= var2) {
         var11 = var4[2] - var0;
         var9 = true;
      }

      if (var6 > 0 && var4[0] >= var0 && var4[0] <= var2) {
         var11 = var4[0] - var0;
         var9 = true;
      }

      if (var9) {
         var6 = var1 + (int)((long)(var3 - var1) * (long)var11 / (long)(var2 - var0));
         if (var6 >= var4[1] && var6 <= var4[3]) {
            var2 = var0 + var11;
            var3 = var6;
            var7 = true;
         }
      }

      var6 = var3 - var1;
      if (var6 < 0 && var4[3] <= var1 && var4[3] >= var3) {
         var10 = var4[3] - var1;
         var8 = true;
      }

      if (var6 > 0 && var4[1] >= var1 && var4[1] <= var3) {
         var10 = var4[1] - var1;
         var8 = true;
      }

      if (var8) {
         var0 += (int)((long)(var2 - var0) * (long)var10 / (long)(var3 - var1));
         if (var0 >= var4[0] && var0 <= var4[2]) {
            var2 = var0;
            var3 = var1 + var10;
            var7 = true;
         }
      }

      var5[0] = var2;
      var5[1] = var3;
      return var7;
   }

   public static void C(int[] var0) {
      int var1 = var0[0];
      short var2 = (short)(var1 & '\uffff');
      short var3 = (short)((var1 & -65536) >> 16);
      var0[3] |= 2;
      var0[1] &= -65536;
      var0[1] |= (short)u[var3][var2] & '\uffff';
      u[var3][var2] = (short)(var0[2] & '\uffff');
      A.A(var0, false);
   }

   public static void D(int[] var0) {
      int var1 = var0[0];
      short var4 = (short)(var1 & '\uffff');
      short var3 = (short)((var1 & -65536) >> 16);
      var0[3] &= -3;
      var1 = u[var3][var4];

      int var2;
      for(var2 = -1; var1 != -1 && a[var1] != var0; var1 = (short)(a[var1][1] & '\uffff')) {
         var2 = var1;
      }

      short var5 = (short)(var0[1] & '\uffff');
      if (var2 != -1) {
         int[] var10000 = a[var2];
         var10000[1] &= -65536;
         var10000 = a[var2];
         var10000[1] |= (short)var5 & '\uffff';
      } else {
         u[var3][var4] = var5;
      }

      var0[1] &= -65536;
      var0[1] |= 65535;
      A.A(var0, true);
   }

   public static int A(int[] var0, int var1) {
      if (var1 == 0) {
         return -1;
      } else {
         int var8 = -1;
         int var7 = (var0[0] >> 12) - 6;
         int var2 = (var0[1] >> 12) - 6;
         int var6 = (var0[2] >> 12) + 6;
         int var5 = (var0[3] >> 12) + 6;
         if (var7 < 0) {
            var7 = 0;
         }

         if (var2 < 0) {
            var2 = 0;
         }

         if (var6 > b) {
            var6 = b;
         }

         if (var5 > c) {
            var5 = c;
         }

         for(int var4 = var2; var4 < var5; ++var4) {
            for(int var3 = var7; var3 < var6; ++var3) {
               var2 = u[var4][var3];

               while(var2 != -1) {
                  C(a[var2], aa);
                  if ((var1 & a[var2][3]) == 0) {
                     var2 = (short)(a[var2][1] & '\uffff');
                  } else if (!E(var0, aa)) {
                     var2 = (short)(a[var2][1] & '\uffff');
                  } else {
                     int[] var10000 = a[var2];
                     var10000[1] &= 65535;
                     var10000 = a[var2];
                     var10000[1] |= (short)var8 << 16 & -65536;
                     var8 = var2;
                     var2 = (short)(a[var2][1] & '\uffff');
                  }
               }
            }
         }

         return var8;
      }
   }

   public static int A(int var0, int var1, int var2, int var3, int var4, int[] var5) {
      return A(var0, var1, var2, var3, var4, var5, false);
   }

   public static int A(int var0, int var1, int var2, int var3, int var4, int[] var5, boolean var6) {
      boolean var11 = false;
      boolean var10 = false;
      int var9 = -2;
      int var7;
      int var8;
      if (var3 - var1 > 0) {
         for(var8 = var1 + (4096 - var1 % 4096); var8 < var3; var8 += 4096) {
            var7 = var0 + (int)((long)(var2 - var0) * (long)(var8 - var1) / (long)(var3 - var1));
            if (!A.C(var7 >> 12, var8 >> 12)) {
               var2 = var7;
               var3 = var8;
               var11 = true;
               break;
            }
         }
      }

      if (var3 - var1 < 0) {
         for(var8 = var1 - var1 % 4096 - 1; var8 > var3; var8 -= 4096) {
            var7 = var0 + (int)((long)(var2 - var0) * (long)(var8 - var1) / (long)(var3 - var1));
            if (!A.C(var7 >> 12, var8 >> 12)) {
               var2 = var7;
               var3 = var8;
               var11 = true;
               break;
            }
         }
      }

      if (var2 - var0 > 0) {
         for(var8 = var0 + (4096 - var0 % 4096); var8 < var2; var8 += 4096) {
            var7 = var1 + (int)((long)(var3 - var1) * (long)(var8 - var0) / (long)(var2 - var0));
            if (!A.C(var8 >> 12, var7 >> 12)) {
               var2 = var8;
               var3 = var7;
               var11 = true;
               break;
            }
         }
      }

      if (var2 - var0 < 0) {
         for(var8 = var0 - var0 % 4096 - 1; var8 > var2; var8 -= 4096) {
            var7 = var1 + (int)((long)(var3 - var1) * (long)(var8 - var0) / (long)(var2 - var0));
            if (!A.C(var8 >> 12, var7 >> 12)) {
               var2 = var8;
               var3 = var7;
               var11 = true;
               break;
            }
         }
      }

      if (var0 < var2) {
         ba[0] = var0;
         ba[2] = var2;
      } else {
         ba[0] = var2;
         ba[2] = var0;
      }

      if (var1 < var3) {
         ba[1] = var1;
         ba[3] = var3;
      } else {
         ba[1] = var3;
         ba[3] = var1;
      }

      var4 = A(ba, var4);
      var5[0] = var2;
      var5[1] = var3;

      while(true) {
         while(var4 != -1) {
            if ((a[var4][3] & '耀') != 0) {
               var4 = (short)((a[var4][1] & -65536) >> 16);
            } else {
               if (var6 && (a[var4][3] & 4096) != 0) {
                  int[] var12 = A.ra[a[var4][4]];
                  if (var12[5] != 0) {
                     var4 = (short)((a[var4][1] & -65536) >> 16);
                     continue;
                  }
               }

               C(a[var4], ba);
               if (A(var0, var1, var5[0], var5[1], ba, var5)) {
                  var10 = true;
                  var9 = var4;
               }

               var4 = (short)((a[var4][1] & -65536) >> 16);
            }
         }

         if (!var11 && !var10) {
            return -2;
         }

         if (var11) {
            return -1;
         }

         return var9;
      }
   }

   public static void A(int[] var0, int var1, int var2) {
      if ((var0[3] & 2) != 0) {
         D(var0);
      }

      var0[0] = (short)var1 & '\uffff' | (short)var2 << 16 & -65536;
      if (var1 >= 0 && var1 < b && var2 >= 0 && var2 < c) {
         C(var0);
      }

   }

   public static int A(int[] var0, int var1, int var2, int var3, int var4) {
      int var11 = -2;
      int var10 = var0[var2];
      C(var0, ea);
      ca[0] = fa[0] + fa[2] >> 1;
      ca[1] = fa[1] + fa[3] >> 1;
      var0[var2] = var1;
      C(var0, fa);
      if (fa[0] >= 0 && fa[1] >= 0 && fa[2] < b * 4096 && fa[3] < c * 4096) {
         int var5 = fa[0] >> 12;
         int var9 = fa[1] >> 12;
         int var8 = fa[2] >> 12;
         int var7 = fa[3] >> 12;

         for(int var6 = var5; var6 <= var8; ++var6) {
            for(var5 = var9; var5 <= var7; ++var5) {
               if (!A.C(var6, var5)) {
                  var0[var2] = var10;
                  return -1;
               }
            }
         }

         int[] var10000;
         for(var5 = A(ea, var3); var5 != -1; var5 = (short)((a[var5][1] & -65536) >> 16)) {
            D(a[var5], da);
            if (var10 < var1 && da[var4] <= ca[var4] || var10 > var1 && da[var4] >= ca[var4]) {
               var10000 = a[var5];
               var10000[3] |= 2097152;
            }
         }

         for(var1 = A(fa, var3); var1 != -1 && ((a[var1][3] & '耀') != 0 || (a[var1][3] & 2097152) != 0); var1 = (short)((a[var1][1] & -65536) >> 16)) {
         }

         if (var1 != -1) {
            var11 = var1;
            var0[var2] = var10;
         }

         for(int var12 = A(ea, var3); var12 != -1; var12 = (short)((a[var12][1] & -65536) >> 16)) {
            var10000 = a[var12];
            var10000[3] &= -2097153;
         }

         return var11;
      } else {
         var0[var2] = var10;
         return -1;
      }
   }

   public static int A(int[] var0, boolean var1, boolean var2) {
      int var8 = 0;
      int var7 = var0[0] + var0[2] >> 1;
      int var6 = var0[1] + var0[3] >> 1;
      int var5 = var0[0] >> 12;
      int var4 = var0[1] >> 12;
      int var3 = var0[2] >> 12;
      int var9 = var0[3] >> 12;
      if (var5 < 0) {
         var5 = 0;
      }

      if (var4 < 0) {
         var4 = 0;
      }

      if (var3 >= b) {
         var3 = b - 1;
      }

      if (var9 >= c) {
         var9 = c - 1;
      }

      int var10;
      int var11;
      if (var1) {
         if (var2) {
            var10 = var3;
         } else {
            var10 = var5;
         }

         for(var11 = var4; var11 <= var9; ++var11) {
            if (!A.C(var10, var11)) {
               if (var6 < var11 * 4096 + 2048) {
                  if (A.C(var10, var11 - 1)) {
                     var8 |= 1;
                  }
               } else if (A.C(var10, var11 + 1)) {
                  var8 |= 2;
               }
            }
         }
      } else {
         if (var2) {
            var10 = var9;
         } else {
            var10 = var4;
         }

         for(var11 = var5; var11 <= var3; ++var11) {
            if (!A.C(var11, var10)) {
               if (var7 < var11 * 4096 + 2048) {
                  if (A.C(var11 - 1, var10)) {
                     var8 |= 1;
                  }
               } else if (A.C(var11 + 1, var10)) {
                  var8 |= 2;
               }
            }
         }
      }

      return var8;
   }

   public static int A(int[] var0, int var1, int var2, int var3) {
      if ((var0[3] & 8) == 0) {
         return -2;
      } else {
         int var13 = var0[4];
         int var12 = var0[5];
         if (var13 == var1 && var12 == var2) {
            return -2;
         } else {
            boolean var11 = false;
            int var10 = -1;
            D(var0);
            boolean var9 = false;
            boolean var8 = false;
            if (var13 != var1 && var12 != var2) {
               var9 = true;
               var8 = true;
            } else {
               boolean var7 = true;
               boolean var6 = true;
               boolean var5 = false;
               C(var0, ga);

               int var4;
               int[] var10000;
               for(var4 = A(ga, var3); var4 != -1; var4 = (short)((a[var4][1] & -65536) >> 16)) {
                  var10000 = a[var4];
                  var10000[3] |= 2097152;
               }

               ha[0] = ga[0] + ga[2] >> 1;
               ha[1] = ga[1] + ga[3] >> 1;
               if (var1 != var13) {
                  if (var1 < var13) {
                     var10000 = ga;
                     var10000[0] += var1 - var13;
                     var4 = A(ga, true, false);
                  } else {
                     var10000 = ga;
                     var10000[2] += var1 - var13;
                     var4 = A(ga, true, true);
                  }

                  var9 = true;
               } else {
                  if (var2 < var12) {
                     var10000 = ga;
                     var10000[1] += var2 - var12;
                     var4 = A(ga, false, false);
                  } else {
                     var10000 = ga;
                     var10000[3] += var2 - var12;
                     var4 = A(ga, false, true);
                  }

                  var8 = true;
               }

               switch(var4) {
               case 0:
                  break;
               case 1:
                  var5 = true;
                  var7 = false;
                  break;
               case 2:
                  var5 = true;
                  var6 = false;
                  break;
               default:
                  var5 = true;
                  var7 = false;
                  var6 = false;
               }

               var4 = A(ga, var3);
               if (var4 != -1) {
                  label127:
                  while(true) {
                     while(true) {
                        if (var4 == -1) {
                           break label127;
                        }

                        if ((a[var4][3] & 2097152) != 0) {
                           var10000 = a[var4];
                           var10000[3] &= -2097153;
                           var4 = (short)((a[var4][1] & -65536) >> 16);
                        } else if ((a[var4][3] & '耀') != 0) {
                           var4 = (short)((a[var4][1] & -65536) >> 16);
                        } else if ((a[var4][3] & 4096) != 0 && (short)(a[var4][8] & '\uffff') > 0) {
                           var4 = (short)((a[var4][1] & -65536) >> 16);
                        } else {
                           var5 = true;
                           D(a[var4], ia);
                           if (var9) {
                              if (ia[1] > ha[1]) {
                                 var7 = false;
                              } else {
                                 var6 = false;
                              }
                           } else if (ia[0] > ha[0]) {
                              var7 = false;
                           } else {
                              var6 = false;
                           }

                           var4 = (short)((a[var4][1] & -65536) >> 16);
                        }
                     }
                  }
               }

               if (var5) {
                  if (var7) {
                     if (var9) {
                        var9 = false;
                        var8 = true;
                        var2 += Math.abs(var1 - var13);
                        var1 = var13;
                     } else {
                        var9 = true;
                        var8 = false;
                        var1 += Math.abs(var2 - var12);
                        var2 = var12;
                     }
                  }

                  if (var6) {
                     if (var9) {
                        var9 = false;
                        var8 = true;
                        var2 -= Math.abs(var1 - var13);
                        var1 = var13;
                     } else {
                        var9 = true;
                        var8 = false;
                        var1 -= Math.abs(var2 - var12);
                        var2 = var12;
                     }
                  }
               }
            }

            if (var1 >= 0 && var2 >= 0 && var1 < b * 4096 && var2 < c * 4096) {
               if (var9) {
                  var1 = A(var0, var1, 4, var3, 0);
                  if (var1 == -1) {
                     var11 = true;
                  } else if (var1 >= 0) {
                     var10 = var1;
                  }
               }

               if (var8) {
                  var1 = A(var0, var2, 5, var3, 1);
                  if (var1 == -1) {
                     var11 = true;
                  } else if (var1 >= 0) {
                     var10 = var1;
                  }
               }

               var0[0] = (short)(var0[4] >> 12) & '\uffff' | (short)(var0[5] >> 12) << 16 & -65536;
               C(var0);
               if (var10 != -1) {
                  return var10;
               } else {
                  return var11 ? -1 : -2;
               }
            } else {
               C(var0);
               return -1;
            }
         }
      }
   }

   public static boolean A(int[] var0, int[] var1, int var2) {
      C(var0, ja);
      C(var1, ka);
      int[] var10000 = ja;
      var10000[0] -= var2;
      var10000 = ja;
      var10000[1] -= var2;
      var10000 = ja;
      var10000[2] += var2;
      var10000 = ja;
      var10000[3] += var2;
      return E(ja, ka);
   }

   public static boolean F(int[] var0, int[] var1) {
      A(var0, la);
      A(var1, ma);
      int var2 = A(la[0], la[1], ma[0], ma[1], 4144, na, true);
      short var3 = (short)(var1[2] & '\uffff');
      return var2 == -2 || var2 == var3;
   }

   public static void H() {
      xa = null;
      oa = (int[][][])null;
      pa = (int[][][])null;
      aA = null;
      bA = null;
      cA = null;
      dA = (int[][])null;
      System.gc();
   }

   public static void I() {
      eA = 0;

      for(int var25 = 0; var25 < A.qa.length; ++var25) {
         int[] var24 = A.qa[var25];
         int[] var10000 = g[(short)((var24[0] & -65536) >> 16)];
         var10000[(short)(var24[0] & '\uffff')] |= Integer.MIN_VALUE;
         byte var1 = (byte)(var24[8] & 255);
         if (var1 > 0) {
            if (r >= 30) {
               var24[8] = 0;
            } else {
               int var0;
               switch(var1) {
               case 4:
                  var24[8] &= -16711681;
                  var24[8] |= 16711680;
                  var0 = HG.A((int)6);
                  var24[8] &= 16777215;
                  var24[8] |= (byte)var0 << 24 & -16777216;
                  var0 = A.CA(var0);
                  var24[9] &= 65535;
                  var24[9] |= (short)var0 << 16 & -65536;
                  var24[8] &= -65281;
                  var24[8] |= (byte)r << 8 & '\uff00';
                  r += 2;
               case 8:
                  if (var1 != 8 || HG.A((int)2) == 0) {
                     ++s;
                     var0 = A.da[17] / 5;
                     int var23 = var0 + A.ma[0][4];
                     if (var23 > 2500) {
                        var23 = 2500;
                     }

                     int var22 = 0;

                     for(; var22 < 4; ++var22) {
                        int[][] var21 = (int[][])null;
                        int[][] var20 = (int[][])null;
                        byte var19 = -1;
                        byte var18 = -1;
                        byte var17 = -1;
                        byte var16 = -1;
                        byte var15 = -1;
                        byte var14 = -1;
                        byte var13 = -1;
                        byte var12 = -1;
                        short var11 = 0;
                        boolean var10 = false;
                        switch(var22) {
                        case 0:
                           var20 = A.ha;
                           var21 = A.ia;
                           var19 = 10;
                           var18 = 10;
                           var17 = 12;
                           var16 = 0;
                           var15 = 2;
                           var13 = 4;
                           var11 = 64;
                           var10 = true;
                           break;
                        case 1:
                           var20 = A.ja;
                           var21 = A.ka;
                           var19 = 10;
                           var18 = 10;
                           var17 = 12;
                           var16 = 0;
                           var15 = 2;
                           var13 = 4;
                           var11 = 128;
                           var10 = true;
                           break;
                        case 2:
                           var20 = A.ta;
                           var21 = A.ua;
                           var19 = 10;
                           var18 = 10;
                           var17 = 12;
                           var16 = 0;
                           var15 = 2;
                           var13 = 4;
                           var11 = 8192;
                           var10 = true;
                           break;
                        case 3:
                           var20 = A.la;
                           var21 = A.ma;
                           var19 = 10;
                           var16 = 1;
                           var15 = 5;
                           var13 = 4;
                           var12 = 6;
                           var11 = 256;
                           var14 = 0;
                           var10 = false;
                        }

                        for(int var9 = 0; var9 < var15; ++var9) {
                           if (var9 < var16 || HG.A((int)var19) == 0) {
                              boolean var8 = false;
                              boolean var7 = false;
                              if (var18 != -1) {
                                 var8 = HG.A((int)var18) == 0;
                              }

                              if (var17 != -1 && var8) {
                                 var7 = HG.A((int)var17) == 0;
                              }

                              int var6 = -1;
                              int var5 = -1;
                              var0 = 0;
                              int var2 = 0;

                              int var26;
                              for(var26 = 0; var26 < var21.length; ++var26) {
                                 if (var21[var26][var13] <= var23) {
                                    if (var18 != -1 && var17 != -1) {
                                       if ((var21[var26][3] & 1) != 0) {
                                          ++var2;
                                       } else {
                                          ++var0;
                                       }
                                    } else {
                                       ++var0;
                                    }
                                 }
                              }

                              if (var0 == 0) {
                                 break;
                              }

                              int var4 = HG.A(var2);
                              int var3 = HG.A(var0);
                              var2 = 0;
                              var26 = 0;

                              for(var0 = 0; var0 < var21.length; ++var0) {
                                 if (var21[var0][var13] <= var23) {
                                    if (var18 != -1 && var17 != -1) {
                                       if ((var21[var0][3] & 1) != 0) {
                                          if (var4 == var2) {
                                             var5 = var0;
                                          }

                                          ++var2;
                                       } else {
                                          if (var3 == var26) {
                                             var6 = var0;
                                          }

                                          ++var26;
                                       }
                                    } else {
                                       if (var3 == var26) {
                                          var6 = var0;
                                       }

                                       ++var26;
                                    }
                                 }
                              }

                              if (var7 && var5 != -1) {
                                 var8 = false;
                                 var6 = var5;
                              }

                              var0 = A.A(var20);
                              if (var0 != -1) {
                                 if (var9 == 0 && var14 != -1) {
                                    var6 = var14;
                                 }

                                 var20[var0][0] = var24[0];
                                 var20[var0][3] = var11;
                                 if (var10) {
                                    A(var6, var8, var20[var0]);
                                 } else {
                                    var20[var0][4] = var6;
                                    var20[var0][5] = 0;
                                 }

                                 if (!var10 && var6 == 0 && var12 != -1) {
                                    var26 = var23 / 20;
                                    var2 = (HG.A(var26) >> 2) + HG.A((int)2);
                                    var2 += (HG.A(var26) >> 2) + HG.A((int)2);
                                    var2 += (HG.A(var26) >> 2) + HG.A((int)2);
                                    var26 = (var26 >> 2) + 2;
                                    var20[var0][var12] = var26 + var2;
                                 } else if (var12 != -1) {
                                    var20[var0][var12] = HG.A((int)8) + 1;
                                 }
                              }
                           }
                        }
                     }
                  } else {
                     var24[8] = 0;
                  }
               }
            }
         }
      }

   }

   public static int C(int var0, int var1) {
      for(int var4 = 0; var4 < 15; ++var4) {
         for(int var3 = var1 - var4; var3 <= var1 + var4; ++var3) {
            for(int var2 = var0 - var4; var2 <= var0 + var4; ++var2) {
               if (var2 >= 0 && var2 < g[0].length && var3 >= 0 && var3 < g.length && (g[var3][var2] & '耀') != 0 && (g[var3][var2] & Integer.MIN_VALUE) == 0) {
                  return (short)var2 & '\uffff' | (short)var3 << 16 & -65536;
               }
            }
         }
      }

      return -1;
   }

   public static void J() {
      System.gc();
      aA = new int[A.ga.length];
      bA = new int[A.ga.length];
      cA = new int[A.ga.length];
      dA = new int[2][A.ga.length];
      int var4 = 0;

      int var0;
      int var1;
      for(var1 = 0; var1 < A.ga.length; ++var1) {
         if (A.ga[var1][5] - 3 <= A.da[18] && A.ga[var1][27] < 5) {
            for(var0 = 0; var0 < var4 && aA[var0] != A.ga[var1][27]; ++var0) {
            }

            if (var0 == var4) {
               aA[var4++] = A.ga[var1][27];
            }
         }
      }

      if (var4 == 0) {
         aA[var4++] = A.ga[0][27];
      }

      int var2;
      int var3;
      for(var3 = 0; var3 < var4; ++var3) {
         var2 = HG.A(var4);
         var1 = HG.A(var4);
         var0 = aA[var2];
         aA[var2] = aA[var1];
         aA[var1] = var0;
      }

      za = 1;
      if (var4 > 1 && HG.A((int)5) == 0) {
         ++za;
      }

      if (za > 2) {
         za = 2;
      }

      for(int var5 = 0; var5 < za; ++var5) {
         var1 = aA[var5];
         var4 = 0;

         for(var0 = 0; var0 < A.ga.length; ++var0) {
            if (A.ga[var0][27] == var1 && A.ga[var0][5] - 3 <= A.da[18]) {
               dA[var5][var4++] = var0;
            }
         }

         if (var4 == 0) {
            dA[var5][var4++] = 0;
         }

         for(var3 = 0; var3 < var4; ++var3) {
            var2 = HG.A(var4);
            var1 = HG.A(var4);
            var0 = dA[var5][var2];
            dA[var5][var2] = dA[var5][var1];
            dA[var5][var1] = var0;
         }

         if (var4 > 2) {
            var4 = 2;
         }

         cA[var5] = var4;
         var1 = 0;

         for(var0 = 0; var0 < var4; ++var0) {
            var1 += A.ga[dA[var5][var0]][5];
         }

         var0 = var1 / var4;
         ++var0;
         var0 = A.da[18] * 5 / var0;
         ++var0;
         if (var0 < 3) {
            var0 = 3;
         }

         if (var0 > 6) {
            var0 = 6;
         }

         bA[var5] = var0;
      }

   }

   public static int C(int var0) {
      while(true) {
         int[] var10000;
         int var1;
         short var10001;
         int var3;
         for(var3 = 0; var3 < var0; ++var3) {
            int var2 = HG.A(qa >> 1) + (qa >> 2);
            var1 = HG.A(ra >> 1) + (ra >> 2);
            xa[wa + var3] = C(var2, var1);
            if (xa[wa + var3] == -1) {
               break;
            }

            var10000 = g[(short)((xa[wa + var3] & -65536) >> 16)];
            var10001 = (short)(xa[wa + var3] & '\uffff');
            var10000[var10001] &= -32769;
         }

         for(var1 = 0; var1 < var3; ++var1) {
            var10000 = g[(short)((xa[wa + var1] & -65536) >> 16)];
            var10001 = (short)(xa[wa + var1] & '\uffff');
            var10000[var10001] |= 32768;
         }

         if (var3 == var0) {
            for(var1 = 0; var1 < var0; ++var1) {
               var10000 = g[(short)((xa[wa + var1] & -65536) >> 16)];
               var10001 = (short)(xa[wa + var1] & '\uffff');
               var10000[var10001] |= Integer.MIN_VALUE;
            }

            return var0;
         }

         --var0;
      }
   }

   public static void A(boolean var0) {
      if (A.ga.length == 0) {
         A.fa = new int[0][0];
      } else {
         wa = 0;

         int var1;
         int var6;
         for(var1 = 0; var1 < za; ++var1) {
            var6 = bA[var1];
            bA[var1] = C(var6);
            wa += bA[var1];
         }

         A.fa = new int[wa][32];
         wa = 0;

         for(int var5 = 0; var5 < za; ++var5) {
            for(int var4 = 0; var4 < bA[var5]; ++var4) {
               var6 = HG.A(cA[var5]);
               int var3 = dA[var5][var6];
               int var2 = wa;
               var1 = xa[wa++];
               int[] var7 = A.fa[var2];
               var7[0] = var1;
               var7[1] = -1;
               var7[2] = -1;
               var7[3] = 0;
               var7[4] = ((short)(var1 & '\uffff') << 12) + 2048;
               var7[5] = ((short)((var1 & -65536) >> 16) << 12) + 2048;
               var7[6] = 0;
               var7[7] = 0;
               var7[8] = 0;
               var7[9] = 0;
               var7[10] = 0;
               var7[11] = var3;
               var7[12] = (short)A.ga[var3][6] & '\uffff' | (short)A.ga[var3][6] << 16 & -65536;
               var7[13] = 0;
               var7[14] = -1;
               var7[15] = -1;
               var7[17] = -1;
               var7[18] = -1;
               var7[20] = -1;
               var7[21] = -1;
               var7[22] = -1;
               var7[24] = -1;
               var7[19] = A.V(var2);
               sa += 2;
               ta += 2;
               ua += 4;
               va += 2;
               ++s;
            }
         }

      }
   }

   public static void D(int var0) {
      switch(var0) {
      case 0:
         var0 = C(qa >> 1, 2);
         break;
      case 1:
         var0 = C(qa - 1 - 2, ra >> 1);
         break;
      case 2:
         var0 = C(qa >> 1, ra - 1 - 2);
         break;
      case 3:
      default:
         var0 = C(2, ra >> 1);
         break;
      case 4:
         var0 = C(qa >> 1, ra >> 1);
      }

      int[] var10000;
      if (var0 != -1) {
         fA = (short)(var0 & '\uffff');
         gA = (short)((var0 & -65536) >> 16);
      } else {
         for(int var1 = 0; var1 < g.length; ++var1) {
            for(var0 = 0; var0 < g[0].length; ++var0) {
               g[var1][var0] = -65536;
               var10000 = g[var1];
               var10000[var0] |= 32768;
               var10000 = g[var1];
               var10000[var0] &= Integer.MAX_VALUE;
            }
         }

         fA = g[0].length >> 1;
         gA = g.length >> 1;
         A.qa = new int[0][0];
      }

      var10000 = g[gA];
      int var10001 = fA;
      var10000[var10001] |= Integer.MIN_VALUE;
      A(false);
   }

   public static void D(int var0, int var1) {
      A.cC = new int[4][7];
      A.cC[0][0] = 8;
      A.cC[0][1] = 1;
      A.cC[0][2] = 0;
      A.cC[0][3] = qa - 1;
      A.cC[0][4] = 0;
      A.cC[0][5] = 1;
      A.cC[0][6] = 0;
      A.cC[1][0] = 8;
      A.cC[1][1] = 1;
      A.cC[1][2] = 0;
      A.cC[1][3] = qa - 1;
      A.cC[1][4] = ra - 2;
      A.cC[1][5] = ra - 1;
      A.cC[1][6] = 0;
      A.cC[2][0] = 8;
      A.cC[2][1] = 1;
      A.cC[2][2] = 0;
      A.cC[2][3] = 1;
      A.cC[2][4] = 0;
      A.cC[2][5] = ra - 1;
      A.cC[2][6] = 0;
      A.cC[3][0] = 8;
      A.cC[3][1] = 1;
      A.cC[3][2] = qa - 2;
      A.cC[3][3] = qa - 1;
      A.cC[3][4] = 0;
      A.cC[3][5] = ra - 1;
      A.cC[3][6] = 0;
      A.bC = new byte[1][5];
      A.bC[0][0] = 41;
      A.bC[0][1] = 0;
      A.bC[0][2] = 0;
      A.bC[0][3] = (byte)var0;
      A.bC[0][4] = (byte)var1;
   }

   public static boolean B(int var0, int var1, int var2) {
      try {
         if (A.da == null) {
            return false;
         } else {
            C.c = 0;
            ya = var0;
            short var4 = (short)(A.da[0] & '\uffff');
            short var3 = (short)((A.da[0] & -65536) >> 16);
            D();
            sa = 0;
            ta = 0;
            ua = 0;
            va = 0;
            oa = new int[1][][];
            pa = new int[1][][];
            if (!A(1)) {
               return false;
            } else {
               A.W(0);
               f = 0;
               C.c = 15;
               C.c = 15;
               g = oa[0];

               for(var1 = 0; var1 < g.length; ++var1) {
                  for(var0 = 0; var0 < g[0].length; ++var0) {
                     int[] var10000 = g[var1];
                     var10000[var0] |= 32768;
                     var10000 = g[var1];
                     var10000[var0] &= Integer.MAX_VALUE;
                  }
               }

               A.qa = pa[0];
               qa = g[0].length;
               ra = g.length;
               wa = 0;
               xa = new int[qa * ra];
               C.c = 20;
               C.c = 20;
               D(var2);
               b = qa;
               c = ra;
               A.da[11] = -1;
               H();
               A.xa = new int[c * 2 * b * 2 * 3];
               A.ya = new int[A.fa.length][];
               A.ha = new int[sa + 15][9];
               A.ja = new int[ta + 15][9];
               A.la = new int[ua + 15][7];
               A.na = new int[0][0];
               A.va = new int[0][0];
               A.ta = new int[va + 15][8];
               A.B(A.ha);
               A.B(A.ja);
               A.B(A.la);
               A.B(A.ta);
               I();
               D(var4, var3);
               C.c = 25;
               B(fA, gA);
               return true;
            }
         }
      } catch (Exception var5) {
         var5.printStackTrace();
         return false;
      }
   }

   public static int A(int var0, int[] var1) {
      short var2 = (short)((a[var0][2] & -65536) >> 16);
      if ((a[var0][3] & 4096) != 0) {
         return (short)(A.qa[var2][9] & '\uffff');
      } else if ((a[var0][3] & 32) != 0) {
         var0 = (short)(A.fa[var2][17] & '\uffff');
         if (var1 != null) {
            if ((var1[3] & 128) != 0) {
               ++var0;
            } else if ((var1[3] & 256) != 0) {
               var0 += 2;
            } else if ((var1[3] & 8192) != 0) {
               var0 += 3;
            }
         }

         return var0;
      } else {
         return -1;
      }
   }

   public static int K() {
      int var1 = A(A.tb, (int[])null);

      for(int var0 = 0; var0 < 4; ++var0) {
         if ((short)((A.iA[var1 + var0] & -65536) >> 16) > 0) {
            return var0;
         }
      }

      return -1;
   }

   public static void L() {
      int var0 = A(A.tb, (int[])null);
      ++HG.za;
      if (HG.za >= 4) {
         HG.za = 0;
      }

      if ((short)((A.iA[var0 + HG.za] & -65536) >> 16) <= 0) {
         if (K() < 0) {
            HG.za = 0;
            return;
         }

         L();
      }

   }

   public static void M() {
      int var0 = A(A.tb, (int[])null);
      --HG.za;
      if (HG.za < 0) {
         HG.za = 3;
      }

      if ((short)((A.iA[var0 + HG.za] & -65536) >> 16) <= 0) {
         if (K() < 0) {
            HG.za = 0;
            return;
         }

         M();
      }

   }

   public static void N() {
      if (A.iA == null) {
         A.iA = new int[s];
         s = 0;
      }

      for(int var9 = 0; var9 < A.fa.length; ++var9) {
         if (A.ga[A.fa[var9][11]][27] == 7 || A.ga[A.fa[var9][11]][27] == 8) {
            int[] var10000 = A.fa[var9];
            var10000[17] &= -65536;
            var10000 = A.fa[var9];
            var10000[17] |= (short)s & '\uffff';
            short var8 = (short)(A.fa[var9][17] & '\uffff');
            var10000 = A.iA;
            var10000[var8] &= -65536;
            var10000 = A.iA;
            var10000[var8] |= 65535;
            var10000 = A.iA;
            var10000[var8] &= 65535;
            var10000 = A.iA;
            var10000[var8] |= 0;
            ++s;
            int var0;
            int var1;
            int var2;
            short var3;
            int var4;
            int var5;
            int var6;
            int var7;
            boolean var10;
            short var11;
            short var12;
            if (A.ga[A.fa[var9][11]][27] == 7) {
               var7 = A.ga[A.fa[var9][11]][25];
               var6 = HG.A((int)5, (int)15);
               var10000 = A.iA;
               var10000[var8] &= 65535;
               var10000 = A.iA;
               var10000[var8] |= (short)var6 << 16 & -65536;
               var5 = A.ia.length;

               for(var0 = 0; var0 < A.ia.length; ++var0) {
                  if ((A.ia[var0][3] & 1) != 0) {
                     var5 = var0 - 1;
                     break;
                  }
               }

               for(var4 = 0; var4 < var6; ++var4) {
                  var2 = A.A(A.ha);
                  if (var2 >= 0) {
                     var1 = HG.A(var5);
                     var10 = HG.A((int)100) < var7;
                     var3 = (short)(A.ha[var2][2] & '\uffff');
                     A(var1, var10, a[var3]);
                     var10000 = a[var3];
                     var10000[3] |= 65536;
                     if ((a[var3][3] & 2) != 0) {
                        D(a[var3]);
                     }

                     var12 = (short)(A.iA[var8] & '\uffff');
                     var11 = var12;

                     for(var10 = false; var11 != -1; var11 = (short)(a[var11][1] & '\uffff')) {
                        if (a[var11][4] == a[var3][4] && a[var11][6] == -1 && a[var11][7] == -1 && a[var3][6] == -1 && a[var3][7] == -1) {
                           a[var3][4] = -1;
                           var10 = true;
                           break;
                        }
                     }

                     if (!var10) {
                        var10000 = a[var3];
                        var10000[1] &= -65536;
                        var10000 = a[var3];
                        var10000[1] |= (short)var12 & '\uffff';
                        var10000 = A.iA;
                        var10000[var8] &= -65536;
                        var10000 = A.iA;
                        var10000[var8] |= (short)var3 & '\uffff';
                     }
                  }
               }
            }

            int var16 = var8 + 1;
            var10000 = A.iA;
            var10000[var16] &= -65536;
            var10000 = A.iA;
            var10000[var16] |= 65535;
            var10000 = A.iA;
            var10000[var16] &= 65535;
            var10000 = A.iA;
            var10000[var16] |= 0;
            ++s;
            if (A.ga[A.fa[var9][11]][27] == 7) {
               var7 = A.ga[A.fa[var9][11]][25];
               var6 = HG.A((int)5, (int)15);
               var10000 = A.iA;
               var10000[var16] &= 65535;
               var10000 = A.iA;
               var10000[var16] |= (short)var6 << 16 & -65536;
               var5 = A.ka.length;

               for(var0 = 0; var0 < A.ka.length; ++var0) {
                  if ((A.ka[var0][3] & 1) != 0) {
                     var5 = var0 - 1;
                     break;
                  }
               }

               for(var4 = 0; var4 < var6; ++var4) {
                  var2 = A.A(A.ja);
                  if (var2 >= 0) {
                     var1 = HG.A(var5);
                     var10 = HG.A((int)100) < var7;
                     var3 = (short)(A.ja[var2][2] & '\uffff');
                     A(var1, var10, a[var3]);
                     var10000 = a[var3];
                     var10000[3] |= 65536;
                     if ((a[var3][3] & 2) != 0) {
                        D(a[var3]);
                     }

                     var12 = (short)(A.iA[var16] & '\uffff');
                     var11 = var12;

                     for(var10 = false; var11 != -1; var11 = (short)(a[var11][1] & '\uffff')) {
                        if (a[var11][4] == a[var3][4] && a[var11][6] == -1 && a[var11][7] == -1 && a[var3][6] == -1 && a[var3][7] == -1) {
                           a[var3][4] = -1;
                           var10 = true;
                           break;
                        }
                     }

                     if (!var10) {
                        var10000 = a[var3];
                        var10000[1] &= -65536;
                        var10000 = a[var3];
                        var10000[1] |= (short)var12 & '\uffff';
                        var10000 = A.iA;
                        var10000[var16] &= -65536;
                        var10000 = A.iA;
                        var10000[var16] |= (short)var3 & '\uffff';
                     }
                  }
               }
            }

            ++var16;
            var10000 = A.iA;
            var10000[var16] &= -65536;
            var10000 = A.iA;
            var10000[var16] |= 65535;
            var10000 = A.iA;
            var10000[var16] &= 65535;
            var10000 = A.iA;
            var10000[var16] |= 0;
            ++s;
            byte var13 = 3;
            var4 = A.ma.length - 1;
            if (A.ga[A.fa[var9][11]][27] == 7) {
               var13 = 1;
               var4 = 2;
            }

            var0 = HG.A((int)5, (int)15);
            var10000 = A.iA;
            var10000[var16] &= 65535;
            var10000 = A.iA;
            var10000[var16] |= (short)var0 << 16 & -65536;

            for(int var14 = var13; var14 <= var4; ++var14) {
               if (A.ma[var14][5] != 0 && A.da[18] >= A.ma[var14][5]) {
                  var2 = A.A(A.la);
                  if (var2 >= 0) {
                     short var15 = (short)(A.la[var2][2] & '\uffff');
                     A.la[var2][4] = var14;
                     if (A.ga[A.fa[var9][11]][27] == 7) {
                        A.la[var2][6] = HG.A((int)100, (int)300);
                     } else {
                        A.la[var2][6] = HG.A((int)5, (int)10);
                     }

                     var10000 = a[var15];
                     var10000[3] |= 65536;
                     if ((a[var15][3] & 2) != 0) {
                        D(a[var15]);
                     }

                     var11 = (short)(A.iA[var16] & '\uffff');
                     var10000 = a[var15];
                     var10000[1] &= -65536;
                     var10000 = a[var15];
                     var10000[1] |= (short)var11 & '\uffff';
                     var10000 = A.iA;
                     var10000[var16] &= -65536;
                     var10000 = A.iA;
                     var10000[var16] |= (short)var15 & '\uffff';
                  }
               }
            }

            ++var16;
            var10000 = A.iA;
            var10000[var16] &= -65536;
            var10000 = A.iA;
            var10000[var16] |= 65535;
            var10000 = A.iA;
            var10000[var16] &= 65535;
            var10000 = A.iA;
            var10000[var16] |= 0;
            ++s;
            if (A.ga[A.fa[var9][11]][27] == 8) {
               var7 = A.ga[A.fa[var9][11]][25];
               var6 = HG.A((int)5, (int)15);
               var10000 = A.iA;
               var10000[var16] &= 65535;
               var10000 = A.iA;
               var10000[var16] |= (short)var6 << 16 & -65536;
               var5 = A.ua.length;

               for(var0 = 0; var0 < A.ua.length; ++var0) {
                  if ((A.ua[var0][3] & 1) != 0) {
                     var5 = var0 - 1;
                     break;
                  }
               }

               for(var4 = 0; var4 < var6; ++var4) {
                  var2 = A.A(A.ta);
                  if (var2 >= 0) {
                     var1 = HG.A(var5);
                     var10 = HG.A((int)100) < var7;
                     var3 = (short)(A.ta[var2][2] & '\uffff');
                     A(var1, var10, a[var3]);
                     var10000 = a[var3];
                     var10000[3] |= 65536;
                     if ((a[var3][3] & 2) != 0) {
                        D(a[var3]);
                     }

                     var12 = (short)(A.iA[var16] & '\uffff');
                     var11 = var12;

                     for(var10 = false; var11 != -1; var11 = (short)(a[var11][1] & '\uffff')) {
                        if (a[var11][4] == a[var3][4] && a[var11][6] == -1 && a[var11][7] == -1 && a[var3][6] == -1 && a[var3][7] == -1) {
                           a[var3][4] = -1;
                           var10 = true;
                           break;
                        }
                     }

                     if (!var10) {
                        var10000 = a[var3];
                        var10000[1] &= -65536;
                        var10000 = a[var3];
                        var10000[1] |= (short)var12 & '\uffff';
                        var10000 = A.iA;
                        var10000[var16] &= -65536;
                        var10000 = A.iA;
                        var10000[var16] |= (short)var3 & '\uffff';
                     }
                  }
               }
            }
         }
      }

   }

   public static void O() {
      if (A.iA == null) {
         A.iA = new int[s];
         s = 0;
      }

      for(int var6 = 0; var6 < A.qa.length; ++var6) {
         byte var0 = (byte)(A.qa[var6][8] & 255);
         if (var0 == 4 || var0 == 8) {
            int[] var10000 = A.qa[var6];
            var10000[9] &= -65536;
            var10000 = A.qa[var6];
            var10000[9] |= (short)s & '\uffff';
            short var5 = (short)(A.qa[var6][9] & '\uffff');
            var10000 = A.iA;
            var10000[var5] &= -65536;
            var10000 = A.iA;
            var10000[var5] |= 65535;
            ++s;
            short var1 = (short)((A.qa[var6][0] & -65536) >> 16);
            short var7 = (short)(A.qa[var6][0] & '\uffff');
            int var8 = u[var1][var7];
            int var4 = var8;

            short var2;
            int var3;
            for(var3 = 0; var4 != -1; var4 = var2) {
               var2 = (short)(a[var4][1] & '\uffff');
               if ((a[var4][3] & 256) != 0 || (a[var4][3] & 512) != 0 || (a[var4][3] & 64) != 0 || (a[var4][3] & 128) != 0 || (a[var4][3] & 1024) != 0 || (a[var4][3] & 8192) != 0) {
                  var10000 = a[var4];
                  var10000[3] |= 65536;
                  if ((a[var4][3] & 2) != 0) {
                     D(a[var4]);
                  }

                  var1 = (short)(A.qa[var6][9] & '\uffff');
                  var7 = (short)(A.iA[var1] & '\uffff');
                  var10000 = a[var4];
                  var10000[1] &= -65536;
                  var10000 = a[var4];
                  var10000[1] |= (short)var7 & '\uffff';
                  var10000 = A.iA;
                  var10000[var1] &= -65536;
                  var10000 = A.iA;
                  var10000[var1] |= (short)var4 & '\uffff';
                  ++var3;
               }
            }

            var10000 = A.iA;
            var10000[var5] &= 65535;
            var10000 = A.iA;
            var10000[var5] |= (short)var3 << 16 & -65536;
         }
      }

   }

   static void E(int var0) {
      int[] var5 = A.fa[var0];
      int[] var4 = A.ga[var5[11]];
      int var1;
      int var2;
      if ((short)(var5[12] & '\uffff') > 0) {
         for(var2 = 0; var2 < 2; ++var2) {
            var1 = A.A(A.ha);
            if (var5[14 + var2] >= 0) {
               A(var5[14 + var2], (var5[13] & 1 << 10 + var2) != 0, A.ha[var1]);
            } else if (var4[23 + var2] >= 0 && var5[14 + var2] != -2) {
               if (!A(var0, var4[23 + var2], (var5[13] & 1 << 10 + var2) != 0, var1)) {
                  var1 = -1;
               }
            } else {
               var1 = -1;
            }

            if (var1 >= 0 && (A.ia[A.ha[var1][4]][15] == 2 || A.ia[A.ha[var1][4]][15] == 3)) {
               var5[28] = 20;
            }

            var5[14 + var2] = var1;
         }

         if (var4[26] >= 0) {
            var1 = A.A(A.ja);
            A(var4[26], (var5[13] & 4096) != 0, A.ja[var1]);
            var5[16] = var1;
         }
      }

      for(int var3 = 0; var3 < 2; ++var3) {
         if (var5[17 + var3] >= 0) {
            short var8 = (short)(var5[17 + var3] & '\uffff');
            short var9 = (short)((var5[17 + var3] & -65536) >> 16);
            if (var8 == 3) {
               C(var0, 17 + var3, var9);
            } else if (var8 == 2) {
               B(var0, 17 + var3, var9, 1);
            } else if (var8 == 5) {
               var1 = A.A(A.na);
               A.na[var1][4] = var9;
               var5[17 + var3] &= 65535;
               var5[17 + var3] |= (short)var1 << 16 & -65536;
            }
         } else if ((short)(var5[12] & '\uffff') > 0 && var5[17 + var3] != -2) {
            if (var4[21 + var3] >= 0) {
               B(var0, 17 + var3, var4[21 + var3], 1);
            } else if (var4[21 + var3] == -2) {
               boolean var6 = (var4[13] & 1024) != 0;
               boolean var7 = (var4[13] & 512) != 0;
               if (var7 && var6) {
                  var1 = HG.A((int)100);
                  if (var1 >= 70) {
                     C(var0, 17 + var3, HG.A(A.ua.length - 1));
                  } else if (var1 >= 40) {
                     B(var0, 17 + var3, HG.A((int)3, (int)(A.ma.length - 1)), 1);
                  } else {
                     var5[17 + var3] = -1;
                  }
               } else if (var7) {
                  B(var0, 17 + var3, HG.A((int)3, (int)(A.ma.length - 1)), 1);
               } else if (var6) {
                  var2 = 0;

                  for(var1 = A.ua.length - 1; var1 >= 0; --var1) {
                     if ((A.ua[var1][3] & 1) == 0) {
                        var2 = var1;
                        break;
                     }
                  }

                  C(var0, 17 + var3, HG.A(var2));
               }
            }
         }
      }

      if (A.fa[var0][19] > 0 && (short)(var5[12] & '\uffff') > 0) {
         A.fa[var0][19] = B(var0, 19, 0, A.fa[var0][19]);
      }

   }

   static int B(int var0, int var1, int var2, int var3) {
      int var4 = A.A(A.la);
      A.la[var4][4] = var2;
      A.la[var4][6] = var3;
      int[] var10000 = A.fa[var0];
      var10000[var1] &= 65535;
      var10000 = A.fa[var0];
      var10000[var1] |= (short)var4 << 16 & -65536;
      var10000 = A.fa[var0];
      var10000[var1] &= -65536;
      var10000 = A.fa[var0];
      var10000[var1] |= 2;
      return var4;
   }

   static void C(int var0, int var1, int var2) {
      int var3 = A.A(A.ta);
      A.ta[var3][4] = var2;
      A.ta[var3][6] = -1;
      A.ta[var3][7] = -1;
      int[] var10000 = A.fa[var0];
      var10000[var1] &= 65535;
      var10000 = A.fa[var0];
      var10000[var1] |= (short)var3 << 16 & -65536;
      if (HG.A((int)100) <= A.ga[A.fa[var0][11]][25]) {
         E(A.ta[var3]);
      }

   }

   static void A(int var0, boolean var1, int[] var2) {
      var2[4] = var0;
      var2[6] = -1;
      var2[7] = -1;
      if ((var2[3] & 64) != 0 || (var2[3] & 128) != 0) {
         var2[8] = A.A(var2)[10];
      }

      if (var1) {
         E(var2);
      }

   }

   static boolean A(int var0, int var1, boolean var2, int var3) {
      if (var1 < 0) {
         return false;
      } else {
         int var6 = 0;

         boolean var4;
         int var5;
         for(var5 = 0; var5 < A.ia.length; ++var5) {
            var4 = false;
            if ((A.ia[var5][3] & 1) != 0) {
               var4 = false;
            } else if ((short)(A.ia[var5][10] & '\uffff') == 0) {
               var4 = A.ga[A.fa[var0][11]][7] >= (short)((A.ia[var5][10] & -65536) >> 16);
            } else if ((short)(A.ia[var5][10] & '\uffff') == 1) {
               var4 = A.ga[A.fa[var0][11]][8] >= (short)((A.ia[var5][10] & -65536) >> 16);
            }

            if (A.ia[var5][15] == var1 && var4) {
               ++var6;
            }
         }

         if (var6 > 0) {
            int var7 = HG.A((int)1, (int)var6);
            var6 = 1;

            for(var5 = 0; var5 < A.ia.length; ++var5) {
               var4 = false;
               if ((A.ia[var5][3] & 1) != 0) {
                  var4 = false;
               } else if ((short)(A.ia[var5][10] & '\uffff') == 0) {
                  var4 = A.ga[A.fa[var0][11]][7] >= (short)((A.ia[var5][10] & -65536) >> 16);
               } else if ((short)(A.ia[var5][10] & '\uffff') == 1) {
                  var4 = A.ga[A.fa[var0][11]][8] >= (short)((A.ia[var5][10] & -65536) >> 16);
               }

               if (A.ia[var5][15] == var1 && var4) {
                  if (var6 == var7) {
                     A.ha[var3][4] = var5;
                     A.ha[var3][6] = -1;
                     A.ha[var3][7] = -1;
                     A.ha[var3][8] = A.ia[var5][10];
                     if (var2) {
                        E(A.ha[var3]);
                     }
                  }

                  ++var6;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   static int B(int[] var0, int var1, int var2, int var3, int var4) {
      int var6 = 0;
      int var8 = var1;
      if (var1 > 10) {
         var8 = 10;
      } else if (var1 <= 0) {
         return 0;
      }

      int var5;
      for(var5 = 0; var5 < A.sa.length; ++var5) {
         if ((A.sa[var5][4] & 1 << var3) != 0 && A.sa[var5][1] == var2) {
            ++var6;
         }
      }

      if (var6 > 0) {
         int var7 = HG.A((int)1, (int)var6);
         var6 = 0;

         for(var5 = 0; var5 < A.sa.length; ++var5) {
            if ((A.sa[var5][4] & 1 << var3) != 0 && A.sa[var5][1] == var2) {
               ++var6;
               if (var6 == var7) {
                  var2 = HG.A((int)1, (int)var8) * A.sa[var5][2];
                  var0[var4] = (short)var2 & '\uffff' | (short)var5 << 16 & -65536;
                  return var1 - var2;
               }
            }
         }
      }

      return 0;
   }

   static void E(int[] var0) {
      int var3 = A.da[18];
      if (var3 < 5) {
         var3 = 5;
      }

      A.A(var0);
      byte var2 = 0;
      if ((var0[3] & 64) != 0) {
         var2 = 0;
      } else if ((var0[3] & 128) != 0) {
         var2 = 1;
      } else if ((var0[3] & 8192) != 0) {
         var2 = 2;
      }

      int var1 = HG.A((int)0, (int)100);
      if (var1 < 50) {
         B(var0, var3, 1, var2, 6);
      } else if (var1 < 75) {
         B(var0, var3, 0, var2, 7);
      } else {
         var1 = B(var0, var3, 1, var2, 6);
         B(var0, var1, 0, var2, 7);
      }

      var0[3] |= 131072;
   }

   static String F(int[] var0) {
      int[] var1 = A.A(var0);
      if (var1 == null) {
         return null;
      } else {
         String var2 = HG.I(var1[0]);
         if ((var0[3] & 131072) != 0) {
            if (var0[7] >= 0) {
               var2 = HG.I(A.sa[(short)((var0[7] & -65536) >> 16)][0]) + " " + var2;
            }

            if (var0[6] >= 0) {
               var2 = var2 + " " + HG.I(A.sa[(short)((var0[6] & -65536) >> 16)][0]);
            }
         }

         return var2;
      }
   }

   static int G(int[] var0) {
      int[] var1 = A.A(var0);
      int var2 = var1[4];
      if ((var0[3] & 131072) != 0) {
         int var3 = 0;
         if (var0[6] > 0) {
            var3 = 0 + (short)(var0[6] & '\uffff');
         }

         if (var0[7] > 0) {
            var3 += (short)(var0[7] & '\uffff');
         }

         var2 += var2 * 150 / 100 * (var3 >> 2);
      }

      return var2;
   }
}
