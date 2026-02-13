import java.io.DataInputStream;
import java.io.IOException;

public final class a {
   public static int[][] c = (int[][])null;
   public static int m = -1;
   public static int u = -1;
   public static int g = 16;
   public static int l = 16;
   public static int A = 0;
   public static int[][] b = (int[][])null;
   public static int d = -1;
   public static boolean a = true;
   public static int h = 0;
   public static int a = 0;
   private static int[][][] c = new int[6][][];
   public static int r = 0;
   public static int w = 0;
   public static int x = 0;
   public static int k = 0;
   public static int j = 0;
   public static int t = 0;
   public static int c = 0;
   public static int[] e = new int[4];
   public static int[][] a;
   private static int[] t = new int[2];
   private static int[] v = new int[4];
   private static int[] u = new int[2];
   public static int[] q = new int[2];
   public static int[] k = new int[4];
   public static int[] a = new int[4];
   private static int[] f = new int[4];
   public static int[] h = new int[2];
   public static int[] b = new int[2];
   public static int[] o = new int[4];
   public static int[] p = new int[4];
   public static int[] s = new int[4];
   public static int[] x = new int[2];
   public static int[] d = new int[2];
   private static int[] r = new int[4];
   private static int[] l = new int[4];
   private static int[] n = new int[2];
   private static int[] g = new int[2];
   private static int[] c = new int[2];
   public static int[][][] a;
   public static int[][][] b;
   public static int y;
   public static int v;
   public static int i;
   public static int f;
   public static int o;
   public static int p;
   public static int s;
   public static int[] w;
   public static int n;
   public static int b;
   public static int[] j;
   public static int[] i;
   public static int[] m;
   public static int[][] d;
   public static int e;
   private static int q;
   private static int z;

   public static final void k() {
      boolean var0 = false;
      c = new int[1 + c.q.length + c.x.length + c.i.length + c.n.length + c.l.length + c.d.length + c.y.length + c.f.length + c.j.length + c.o.length + c.v.length][];
      byte var3 = 0;
      c[0] = c.O;
      int[] var10000 = c.O;
      var10000[2] &= -65536;
      var10000 = c.O;
      var10000[2] |= 0;
      var10000 = c.O;
      var10000[2] &= 65535;
      var10000 = c.O;
      var10000[2] |= 0;
      c.O[1] = -1;
      c.O[3] = 0;
      var10000 = c.O;
      var10000[3] |= 16;
      var10000 = c.O;
      var10000[3] |= 4;
      var10000 = c.O;
      var10000[3] |= 8;
      int var4 = var3 + 1;

      int var1;
      for(var1 = 0; var1 < c.q.length; ++var1) {
         c[var4] = c.q[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 32;
         var10000 = c[var4];
         var10000[3] |= 8;
         var10000 = c[var4];
         var10000[3] |= 4;
         ++var4;
      }

      for(var1 = 0; var1 < c.x.length; ++var1) {
         c[var4] = c.x[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 4096;
         ++var4;
      }

      for(var1 = 0; var1 < c.i.length; ++var1) {
         c[var4] = c.i[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 64;
         ++var4;
      }

      for(var1 = 0; var1 < c.n.length; ++var1) {
         c[var4] = c.n[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 128;
         ++var4;
      }

      for(var1 = 0; var1 < c.l.length; ++var1) {
         c[var4] = c.l[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 256;
         ++var4;
      }

      for(var1 = 0; var1 < c.d.length; ++var1) {
         c[var4] = c.d[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 512;
         ++var4;
      }

      for(var1 = 0; var1 < c.y.length; ++var1) {
         c[var4] = c.y[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 8192;
         ++var4;
      }

      for(var1 = 0; var1 < c.f.length; ++var1) {
         c[var4] = c.f[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 1024;
         ++var4;
      }

      for(var1 = 0; var1 < c.j.length; ++var1) {
         c[var4] = c.j[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 2048;
         var10000 = c[var4];
         var10000[3] |= 8;
         var10000 = c[var4];
         var10000[3] |= 65536;
         ++var4;
      }

      for(var1 = 0; var1 < c.o.length; ++var1) {
         c[var4] = c.o[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 262144;
         var10000 = c[var4];
         var10000[3] |= 8;
         var10000 = c[var4];
         var10000[3] |= 32768;
         var10000 = c[var4];
         var10000[3] |= 65536;
         ++var4;
      }

      for(var1 = 0; var1 < c.v.length; ++var1) {
         c[var4] = c.v[var1];
         var10000 = c[var4];
         var10000[2] &= -65536;
         var10000 = c[var4];
         var10000[2] |= (short)var4 & '\uffff';
         var10000 = c[var4];
         var10000[2] &= 65535;
         var10000 = c[var4];
         var10000[2] |= (short)var1 << 16 & -65536;
         c[var4][1] = -1;
         var10000 = c[var4];
         var10000[3] |= 16384;
         var10000 = c[var4];
         var10000[3] |= 8;
         ++var4;
      }

      for(var1 = 0; var1 < var4; ++var1) {
         if ((c[var1][3] & 65536) == 0) {
            int var2 = b(c[var1]);
            a(c[var1], (short)(var2 & '\uffff'), (short)((var2 & -65536) >> 16));
         }
      }

   }

   public static final void d() {
      c = (int[][])null;
   }

   public static final void a(int var0, int var1, int var2, int var3) {
      int var4 = var2 & 127 | (var3 & 127) << 7;
      int var5 = var1 * m * 2 * 3 + var0 * 3;
      int[] var10000 = c.M;
      var10000[var5 + 2] &= -16384;
      var10000 = c.M;
      var10000[var5 + 2] |= var4 & 16383;
   }

   public static final int b(int var0, int var1) {
      int var2;
      int var3 = (var2 = c.M[var1 * m * 2 * 3 + var0 * 3 + 2]) & 127;
      int var4 = var2 >> 7 & 127;
      return (short)var3 & '\uffff' | (short)var4 << 16 & -65536;
   }

   public static final void i() {
      c.g((short)(A & '\uffff'), 0);
      c.g((short)((A & -65536) >> 16), 0);

      int var0;
      for(var0 = 0; var0 < c.x.length; ++var0) {
         c.g(c.w[c.x[var0][4]][1], 0);
         c.g(c.w[c.x[var0][4]][1] - 8 + 185, 0);
      }

      c[0] = c.e;
      c[1] = c.p;
      c[2] = c.h;
      c[3] = c.r;
      c[4] = c.u;
      c[5] = c.c;

      for(var0 = 0; var0 < 6; ++var0) {
         for(int var1 = 0; var1 < c[var0].length; ++var1) {
            short var2 = (short)(c[var0][var1][1] & '\uffff');
            short var3 = (short)((c[var0][var1][1] & -65536) >> 16);
            c.g(var2, var3);
         }
      }

   }

   public static final void m() {
      c.H();
      c.c();
      c.D();
      c.U();
      h();
      d();
      c.E();
      c.Y();
      c.L();
      c.B();
      c.X();
      m = -1;
      u = -1;
      b = (int[][])null;
      c.M = null;
      c.b = (int[][])null;
      c.q = (int[][])null;
      c.i = (int[][])null;
      c.n = (int[][])null;
      c.l = (int[][])null;
      c.d = (int[][])null;
      c.x = (int[][])null;
      c.y = (int[][])null;
      c.f = (int[][])null;
      c.D = null;
      c = 0;
      t = 0;
      c.b = (byte[][])null;
      c.t = (int[][])null;
      c.O[11] = -1;
      c.ab = 3;
      c.q = false;
      c.t = false;

      for(int var0 = 0; var0 < c.k.length; ++var0) {
         c.k[var0][0] = 0;
      }

      h = 0;
      c.s = false;
      c.p = false;
      System.gc();
   }

   public static final void b(int var0, int var1) {
      b.a = 25;
      if (a) {
         c.M = new int[u * 2 * m * 2 * 3];

         for(int var2 = 0; var2 < c.M.length; var2 += 3) {
            int[] var10000 = c.M;
            var10000[var2] &= -65536;
            var10000 = c.M;
            var10000[var2] |= 65535;
         }
      }

      c.S();
      c.I();
      c.m();
      c.R();
      c.i();
      e();
      k();
      b.a = 50;
      b.a = 50;
      c.f(var0, var1);
      c.e();
      i();
      c.a(true, 50, 75);
      b.a = 75;
      b.a = 75;
      b.a = 77;
      c.l();
      b.a = 79;
      c.O();
      b.a = 81;
      c.t();
      b.a = 84;
      c.p();
      b.a = 86;
      c.q();
      b.a = 88;
      c.aa();
      b.a = 90;
      b();
      b.a = 93;
      l();
      b.a = 95;
      c.a(0, 0, b[0].length * 2, b.length * 2, true);
      b.a = 97;
      b.a = 100;
      switch((short)((A & -65536) >> 16)) {
      case 3:
      case 5:
         c.ab = 4;
         break;
      case 4:
      case 6:
         c.ab = 5;
         break;
      case 7:
         c.ab = 6;
         break;
      default:
         c.ab = 3;
      }

      c.P = -1;
      c.y = false;
      System.gc();
   }

   public static final int[][] a(int var0, DataInputStream var1) throws IOException {
      a = 0;
      if (var0 == 4 || var0 == 15) {
         a = 1;
      }

      if (var0 == 5 || var0 == 16) {
         a = 0;
      }

      if (var0 == 6 || var0 == 17) {
         a = 2;
      }

      if (var0 == 7 || var0 == 18) {
         a = 3;
      }

      if (var0 == 12 || var0 == 48) {
         a = 4;
      }

      if (var0 == 3 || var0 == 24) {
         a = 0;
      }

      r = 0;
      w = 0;
      j = 0;
      x = 0;
      k = 0;
      t = 0;
      c = 0;
      var1.readShort();
      short var3 = var1.readShort();
      if (c.C == null) {
         c.C = new int[var3];
         c.B = new int[var3];
         c.J = new int[var3];
         c.u = new int[var3];
         c.K = new int[var3];
         c.x = new int[var3];
         c.s = new int[var3];
         c.E = new int[var3];
      }

      for(int var4 = 0; var4 < var3; ++var4) {
         short var5 = var1.readShort();
         if (var4 == var0) {
            int[][] var6 = a(var1, true);
            b(var1);
            return var6;
         }

         var1.skip((long)var5);
      }

      return (int[][])null;
   }

   public static final void b(int var0, int var1, int var2) {
      if ((short)(c.O[12] & '\uffff') > 0) {
         if (c.O[11] != var0) {
            if (var0 == 14) {
               c.O[0] = 2031633;
            }

            c.e(3);
         }

         a();
         m();
         b.a = 0;
         c.O[11] = var0;
         DataInputStream var3 = null;

         label81: {
            try {
               o(var3 = new DataInputStream(HG.a.getClass().getResourceAsStream("d")));
               b = a(var0, var3);
               break label81;
            } catch (Exception var14) {
            } finally {
               try {
                  var3.close();
               } catch (Exception var13) {
               }

            }

            return;
         }

         System.gc();
         b.a = 25;
         c.n();
         b(var1, var2);
         c.a(2, 0, 0, 0, 0, true);
         c.a(18, var1, var2, 0, 0, false);
      }
   }

   public static final boolean a(int var0) {
      DataInputStream var1 = null;
      boolean var2 = false;
      int var3 = 0;
      boolean var4 = false;

      try {
         o(var1 = new DataInputStream(HG.a.getClass().getResourceAsStream("d")));
         var1.readShort();
         short var6 = var1.readShort();

         for(int var7 = 0; var7 < var6; ++var7) {
            short var8 = var1.readShort();
            if (var7 < 52) {
               var1.skip((long)var8);
            } else {
               a[var3] = a(var1, false);
               b(var1);
               b[var3] = c.x;
               m();
               ++var3;
               b.a = 15 * var3 / var0 + 0;
               if (var3 == var0) {
                  var2 = true;
                  break;
               }
            }
         }
      } catch (Exception var17) {
         var17.printStackTrace();
      } finally {
         try {
            var1.close();
         } catch (Exception var16) {
         }

      }

      System.gc();
      return var2;
   }

   public static final void o(DataInputStream var0) throws IOException {
      i(var0);
      q(var0);
      d(var0);
      c(var0);
      l(var0);
      p(var0);
      r(var0);
      e(var0);
      m(var0);
   }

   public static final void b(DataInputStream var0) throws IOException {
      f(var0);
      g(var0);
      a(var0);
      a((DataInputStream)var0, 0);
      a((DataInputStream)var0, 1);
      h(var0);
      a((DataInputStream)var0, 2);
      n(var0);
      k(var0);
      j(var0);
   }

   public static final int[][] a(DataInputStream var0, int var1, int[][] var2, boolean var3) throws IOException {
      short var4 = var0.readShort();
      short var5 = var0.readShort();
      byte var6 = var0.readByte();
      if (c.O[11] == 0) {
         g = 8;
         l = 8;
      } else {
         g = 16;
         l = 16;
      }

      if (var3) {
         if (var1 == 0) {
            A &= -65536;
            A |= (short)var6 & '\uffff';
         } else {
            A &= 65535;
            A |= (short)var6 << 16 & -65536;
         }
      }

      int var8;
      int var9;
      byte var11;
      switch(var0.readByte()) {
      case 0:
         if (var2 == null) {
            var2 = new int[var5][var4];
         }

         for(var8 = 0; var8 < var5; ++var8) {
            for(var9 = 0; var9 < var4; ++var9) {
               byte var14 = var0.readByte();
               var11 = var0.readByte();
               int var16 = (var14 | var11 << 8) << 16 * var1;
               var2[var8][var9] |= var16 & '\uffff' << 16 * var1;
            }
         }

         return var2;
      case 1:
         if (var2 == null) {
            var2 = new int[var5][var4];
         }

         var8 = 0;
         var9 = 0;

         while(true) {
            while(var9 < var5) {
               int var10;
               if ((var10 = var0.readByte()) < 0) {
                  while(true) {
                     ++var10;
                     if (var10 > 0) {
                        break;
                     }

                     int var15 = -1 << 16 * var1;
                     var2[var9][var8] |= var15 & '\uffff' << 16 * var1;
                     ++var8;
                     if (var8 >= var4) {
                        var8 = 0;
                        ++var9;
                     }
                  }
               } else {
                  while(true) {
                     --var10;
                     if (var10 < 0) {
                        break;
                     }

                     var11 = var0.readByte();
                     byte var12 = var0.readByte();
                     int var13 = (var11 | var12 << 8) << 16 * var1;
                     var2[var9][var8] |= var13 & '\uffff' << 16 * var1;
                     ++var8;
                     if (var8 >= var4) {
                        var8 = 0;
                        ++var9;
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

   public static final void i(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.a == null) {
         c.a = new int[var2][30];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.a[var3][13] = 0;
            c.a[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.a[var3][6] = var0.readShort();
            c.a[var3][12] = var0.readShort();
            c.a[var3][5] = var0.readByte();
            c.a[var3][7] = var0.readByte();
            c.a[var3][8] = var0.readByte();
            c.a[var3][10] = var0.readByte();
            c.a[var3][17] = var0.readByte();
            c.a[var3][18] = var0.readByte();
            c.a[var3][19] = var0.readByte();
            c.a[var3][20] = var0.readByte();
            c.a[var3][11] = var0.readByte();
            c.a[var3][14] = var0.readByte();
            c.a[var3][15] = var0.readByte();
            c.a[var3][16] = var0.readByte();
            c.a[var3][25] = var0.readByte();
            c.a[var3][27] = var0.readByte();
            c.a[var3][23] = var0.readByte();
            c.a[var3][24] = var0.readByte();
            c.a[var3][26] = var0.readByte();
            c.a[var3][21] = var0.readByte();
            c.a[var3][22] = var0.readByte();
            c.a[var3][28] = var0.readByte();
            c.a[var3][9] = 4096 / var0.readByte();
            c.a[var3][29] = var0.readByte() * 4096 / 10;
            int[] var10000 = c.a[var3];
            var10000[13] |= 1 << var0.readByte();
            byte var4;
            if (((var4 = var0.readByte()) & 1) != 0) {
               var10000 = c.a[var3];
               var10000[13] |= 512;
            }

            if ((var4 & 2) != 0) {
               var10000 = c.a[var3];
               var10000[13] |= 1024;
            }

            if ((var4 & 4) != 0) {
               var10000 = c.a[var3];
               var10000[13] |= 2048;
            }

            if ((var4 & 8) != 0) {
               var10000 = c.a[var3];
               var10000[13] |= 128;
            }

            int var5 = var0.readInt();
            c.a[var3][2] = (short)(((byte)(var5 >> 24 & 255) << 12) / g) & '\uffff' | (short)(((byte)(var5 >> 8 & 255) << 12) / g) << 16 & -65536;
            c.a[var3][3] = (short)(((byte)(var5 >> 16 & 255) << 12) / g) & '\uffff' | (short)(((byte)(var5 & 255) << 12) / g) << 16 & -65536;
            c.a[var3][1] = var0.readShort() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            c.a[var3][4] = -1;
            if (var0.readByte() == 1) {
               var10000 = c.a[var3];
               var10000[4] &= -256;
               var10000 = c.a[var3];
               var10000[4] |= var0.readByte() & 255;
               var10000 = c.a[var3];
               var10000[4] &= -65281;
               var10000 = c.a[var3];
               var10000[4] |= var0.readByte() << 8 & '\uff00';
               var10000 = c.a[var3];
               var10000[4] &= -16711681;
               var10000 = c.a[var3];
               var10000[4] |= var0.readByte() << 16 & 16711680;
            }

            if (c.a[var3][27] == 9) {
               var10000 = c.a[var3];
               var10000[4] &= -256;
               var10000 = c.a[var3];
               var10000[4] |= 0;
               var10000 = c.a[var3];
               var10000[4] &= -65281;
               var10000 = c.a[var3];
               var10000[4] |= 0;
               var10000 = c.a[var3];
               var10000[4] &= -16711681;
               var10000 = c.a[var3];
               var10000[4] |= 0;
               var10000 = c.a[var3];
               var10000[4] &= 65535;
               var10000 = c.a[var3];
               var10000[4] |= 0;
            }
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void q(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.r == null) {
         c.r = new int[var2][7];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.r[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.r[var3][5] = var0.readByte();
            c.r[var3][3] = var0.readByte();
            c.r[var3][6] = var0.readByte();
            c.r[var3][4] = var0.readShort();
            int[] var10000 = c.r[var3];
            var10000[1] &= -65536;
            var10000 = c.r[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            c.r[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void d(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.c == null) {
         c.c = new int[var2][5];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.c[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.c[var3][3] = var0.readByte() << 16 | var0.readShort();
            c.c[var3][4] = var0.readByte();
            int[] var10000 = c.c[var3];
            var10000[1] &= -65536;
            var10000 = c.c[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            c.c[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void c(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.e == null) {
         c.e = new int[var2][17];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.e[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.e[var3][15] = var0.readByte();
            c.e[var3][11] = var0.readByte();
            c.e[var3][10] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            c.e[var3][13] = var0.readByte() * 4096 / 10;
            c.e[var3][12] = var0.readByte();
            c.e[var3][4] = var0.readShort();
            c.e[var3][14] = var0.readByte();

            for(int var4 = 0; var4 < 5; ++var4) {
               c.e[var3][5 + var4] = -1;
            }

            int[] var10000;
            byte var6;
            if ((var6 = var0.readByte()) >= 1) {
               var10000 = c.e[var3];
               var10000[3] |= 1;

               for(int var5 = 0; var5 < var6; ++var5) {
                  c.e[var3][5 + var5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
               }
            }

            var10000 = c.e[var3];
            var10000[1] &= -65536;
            var10000 = c.e[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            c.e[var3][2] = var0.readByte();
            c.e[var3][16] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void l(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.p == null) {
         c.p = new int[var2][14];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.p[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.p[var3][10] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            c.p[var3][11] = var0.readByte();
            c.p[var3][12] = var0.readByte();
            c.p[var3][13] = var0.readByte();
            c.p[var3][4] = var0.readShort();

            for(int var4 = 0; var4 < 5; ++var4) {
               c.p[var3][5 + var4] = -1;
            }

            int[] var10000;
            byte var6;
            if ((var6 = var0.readByte()) >= 1) {
               var10000 = c.p[var3];
               var10000[3] |= 1;

               for(int var5 = 0; var5 < var6; ++var5) {
                  c.p[var3][5 + var5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
               }
            }

            var10000 = c.p[var3];
            var10000[1] &= -65536;
            var10000 = c.p[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            c.p[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void p(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.w == null) {
         c.w = new int[var2][6];

         for(int var3 = 0; var3 < var2; ++var3) {
            int var4 = var0.readInt();
            c.w[var3][2] = (short)(((byte)(var4 >> 24 & 255) << 12) / g) & '\uffff' | (short)(((byte)(var4 >> 8 & 255) << 12) / g) << 16 & -65536;
            c.w[var3][3] = (short)(((byte)(var4 >> 16 & 255) << 12) / g) & '\uffff' | (short)(((byte)(var4 & 255) << 12) / g) << 16 & -65536;
            c.w[var3][4] = (var0.readByte() << 12) / g;
            short var5 = var0.readShort();
            byte var6;
            if (((var6 = var0.readByte()) & 128) == 128) {
               c.w[var3][5] = 1;
               var6 = (byte)(var6 & 127);
            }

            c.w[var3][1] = (short)var5 & '\uffff' | (short)var6 << 16 & -65536;
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void r(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.h == null) {
         c.h = new int[var2][12];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.h[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.h[var3][10] = var0.readByte();
            c.h[var3][11] = var0.readByte();
            c.h[var3][4] = var0.readShort();

            for(int var4 = 0; var4 < 5; ++var4) {
               c.h[var3][5 + var4] = -1;
            }

            int[] var10000;
            byte var6;
            if ((var6 = var0.readByte()) >= 1) {
               var10000 = c.h[var3];
               var10000[3] |= 1;

               for(int var5 = 0; var5 < var6; ++var5) {
                  c.h[var3][5 + var5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
               }
            }

            var10000 = c.h[var3];
            var10000[1] &= -65536;
            var10000 = c.h[var3];
            var10000[1] |= var0.readShort() & '\uffff';
            c.h[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void e(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.u == null) {
         c.u = new int[var2][11];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.u[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.u[var3][10] = var0.readByte() << 16 | var0.readShort();
            c.u[var3][8] = var0.readByte();
            c.u[var3][3] = var0.readByte();
            c.u[var3][4] = var0.readByte();
            c.u[var3][5] = var0.readByte();
            c.u[var3][6] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            c.u[var3][7] = var0.readByte();
            c.u[var3][9] = var0.readByte();
            c.u[var3][1] = var0.readShort() & '\uffff' | (short)var0.readByte() << 16 & -65536;
            c.u[var3][2] = var0.readByte();
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final void m(DataInputStream var0) throws IOException {
      short var1 = var0.readShort();
      short var2 = var0.readShort();
      if (c.g == null) {
         c.g = new int[var2][5];

         for(int var3 = 0; var3 < var2; ++var3) {
            c.g[var3][0] = var0.readByte() << 16 | var0.readShort();
            c.g[var3][1] = var0.readByte();
            c.g[var3][3] = var0.readByte();
            c.g[var3][2] = var0.readByte();
            c.g[var3][4] = var0.readByte();
            if (c.g[var3][1] == 0) {
               ++c.t;
            } else if (c.g[var3][1] == 1) {
               ++c.Z;
            }
         }
      } else {
         var0.skip((long)(var1 - 2));
      }

   }

   public static final int[][] a(DataInputStream var0, boolean var1) throws IOException {
      m = var0.readShort();
      u = var0.readShort();
      byte var2 = var0.readByte();
      int[][] var3 = (int[][])null;

      for(int var4 = 0; var4 < var2; ++var4) {
         var3 = a(var0, var4, var3, var1);
      }

      return var3;
   }

   public static final void f(DataInputStream var0) throws IOException {
      byte var1;
      c.q = new int[var1 = var0.readByte()][32];
      c.b = new int[var1][];
      if (c.O[11] <= 2) {
         a = false;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         c.q[var2][11] = var0.readByte();
         int var3;
         if ((var3 = c.a[c.q[var2][11]][27]) != 9 && (var3 < 6 || var3 > 8)) {
            a = true;
         }

         byte var4 = var0.readByte();
         byte var5 = var0.readByte();
         c.q[var2][4] = var4 * 4096 + 2048;
         c.q[var2][5] = var5 * 4096 + 4095;
         c.q[var2][12] = (short)c.a[c.q[var2][11]][6] & '\uffff' | (short)c.a[c.q[var2][11]][6] << 16 & -65536;
         c.q[var2][14] = var0.readByte();
         c.q[var2][15] = var0.readByte();
         byte var6;
         int[] var10000;
         if (((var6 = var0.readByte()) & 1) != 0) {
            var10000 = c.q[var2];
            var10000[13] |= 1024;
         }

         if ((var6 & 2) != 0) {
            var10000 = c.q[var2];
            var10000[13] |= 2048;
         }

         if ((var6 & 4) != 0) {
            var10000 = c.q[var2];
            var10000[13] |= 4096;
         }

         if (c.q[var2][14] >= 0 || c.a[c.q[var2][11]][23] >= 0 && c.q[var2][14] != -2) {
            ++r;
         }

         if (c.q[var2][15] >= 0 || c.a[c.q[var2][11]][24] >= 0 && c.q[var2][15] != -2) {
            ++r;
         }

         if (c.a[c.q[var2][11]][26] >= 0) {
            ++j;
         }

         int var7 = -1;
         if (c.q[var2][14] >= 0) {
            var7 = c.e[c.q[var2][14]][15];
         }

         if (c.q[var2][15] >= 0 && var7 != 2 && var7 != 3) {
            var7 = c.e[c.q[var2][15]][15];
         }

         if (c.a[c.q[var2][11]][23] >= 0 && var7 != 2 && var7 != 3) {
            var7 = c.a[c.q[var2][11]][23];
         }

         if (c.a[c.q[var2][11]][24] >= 0 && var7 != 2 && var7 != 3) {
            var7 = c.a[c.q[var2][11]][24];
         }

         if (var7 == 2 || var7 == 3) {
            ++w;
         }

         boolean var8 = false;

         for(int var9 = 0; var9 < 2; ++var9) {
            byte var10;
            switch(var10 = var0.readByte()) {
            case 2:
               c.q[var2][17 + var9] = (short)var10 & '\uffff' | (short)var0.readByte() << 16 & -65536;
               ++w;
               break;
            case 3:
               c.q[var2][17 + var9] = (short)var10 & '\uffff' | (short)var0.readByte() << 16 & -65536;
               ++x;
               break;
            case 4:
            default:
               c.q[var2][17 + var9] = -1;
               break;
            case 5:
               c.q[var2][17 + var9] = (short)var10 & '\uffff' | (short)var0.readByte() << 16 & -65536;
               var8 = true;
               ++k;
            }

            if (c.q[var2][17 + var9] == -1 && c.a[c.q[var2][11]][21 + var9] != -1) {
               ++w;
            }
         }

         c.q[var2][19] = c.c(var2);
         c.q[var2][21] = -1;
         if (c.a[c.q[var2][11]][27] != 7 && c.a[c.q[var2][11]][27] != 8) {
            ++c;
         } else {
            r += 25;
            w += 25;
            j += 25;
            x += 25;
            c += 4;
         }

         if ((c.J[c.O[11]] & 1 << var2) != 0) {
            if (var8) {
               c.q[var2][14] = -1;
               c.q[var2][15] = -1;
               c.q[var2][19] = 0;
               if ((short)(c.q[var2][17] & '\uffff') != 5) {
                  c.q[var2][17] = -1;
               }

               if ((short)(c.q[var2][18] & '\uffff') != 5) {
                  c.q[var2][18] = -1;
               }

               var10000 = c.q[var2];
               var10000[12] &= -65536;
               var10000 = c.q[var2];
               var10000[12] |= 65535;
               var10000 = c.J;
               int var10001 = c.O[11];
               var10000[var10001] &= ~(1 << var2);
            } else {
               var10000 = c.q[var2];
               var10000[3] |= 65536;
               c.q[var2][0] = -1;
            }
         }

         var10000 = c.q[var2];
         var10000[27] &= -65536;
         var10000 = c.q[var2];
         var10000[27] |= (short)var0.readByte() & '\uffff';
         if (c.O[11] <= 2 && var3 == 9) {
            var10000 = c.q[var2];
            var10000[3] |= 65536;
         }
      }

   }

   public static final void g(DataInputStream var0) throws IOException {
      byte var1;
      c.l = new int[(var1 = var0.readByte()) + w + 15][7];
      c.a(c.l);

      for(int var2 = 0; var2 < var1; ++var2) {
         c.l[var2][4] = var0.readByte();
         c.l[var2][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         c.l[var2][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         c.l[var2][6] = var0.readByte();
         if (c.O[11] >= 0 && (c.B[c.O[11]] & 1 << var2) != 0) {
            int[] var10000 = c.l[var2];
            var10000[3] |= 65536;
         }
      }

   }

   public static final void a(DataInputStream var0) throws IOException {
      byte var1;
      h = var1 = var0.readByte();
      c.d = new int[var1 + k][6];
      c.a(c.d);

      for(int var2 = 0; var2 < var1; ++var2) {
         c.d[var2][4] = var0.readByte();
         c.d[var2][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         c.d[var2][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         if (c.O[11] >= 0 && (c.u[c.O[11]] & 1 << var2) != 0) {
            int[] var10000 = c.d[var2];
            var10000[3] |= 65536;
         }
      }

   }

   public static final void a(DataInputStream var0, int var1) throws IOException {
      byte var2 = var0.readByte();
      int[][] var3 = (int[][])null;
      int[] var4 = null;
      Object var5 = null;
      byte var6 = 0;
      switch(var1) {
      case 0:
         c.i = new int[var2 + r + 15][9];
         var3 = c.i;
         var6 = 6;
         var4 = c.K;
         break;
      case 1:
         c.n = new int[var2 + j + 15][9];
         var3 = c.n;
         var6 = 7;
         var4 = c.x;
         break;
      case 2:
         c.y = new int[var2 + x + 15][8];
         var3 = c.y;
         var6 = 13;
         var4 = c.s;
      }

      c.a(var3);

      for(int var7 = 0; var7 < var2; ++var7) {
         var3[var7][4] = var0.readByte();
         var3[var7][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         var3[var7][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         if (var0.readByte() == 1) {
            var3[var7][3] |= 131072;
         }

         var3[var7][3] |= 1 << var6;
         a(var3[var7][4], (var3[var7][3] & 131072) != 0, var3[var7]);
         if (c.O[11] >= 0 && (var4[c.O[11]] & 1 << var7) != 0) {
            var3[var7][3] |= 65536;
         }
      }

   }

   public static final void h(DataInputStream var0) throws IOException {
      byte var1;
      c.x = new int[var1 = var0.readByte()][11];

      for(int var2 = 0; var2 < var1; ++var2) {
         c.x[var2][4] = var0.readByte();
         byte var3 = var0.readByte();
         byte var4 = var0.readByte();
         byte var5 = var0.readByte();
         byte var6 = var0.readByte();
         c.x[var2][6] = var0.readByte();
         c.x[var2][7] = var0.readByte();
         byte var7 = var0.readByte();
         byte var8 = var0.readByte();
         c.x[var2][8] = (short)var7 & '\uffff' | (short)var8 << 16 & -65536;
         int var10;
         int var12;
         int[] var10000;
         if (var7 > 0) {
            if (var7 != 4 && var7 != 5) {
               if (var7 == 8) {
                  ++c;
               }
            } else {
               var12 = c.x[var2][6];
               var10000 = c.x[var2];
               var10000[8] &= 16777215;
               var10000 = c.x[var2];
               var10000[8] |= (byte)var12 << 24 & -16777216;
               c.x[var2][6] = 0;
               ++c;
               var10 = c.h(var12);
               var10000 = c.x[var2];
               var10000[9] &= 65535;
               var10000 = c.x[var2];
               var10000[9] |= (short)var10 << 16 & -65536;
               if (c.O[11] >= 0 && (c.C[c.O[11]] & 1 << t) != 0) {
                  int var11 = c.b[c.w[c.x[var2][4]][1] * 11 + 5] - 1;
                  var10000 = c.x[var2];
                  var10000[10] &= -65536;
                  var10000 = c.x[var2];
                  var10000[10] |= (short)var11 & '\uffff';
                  if (var7 == 5) {
                     var10000 = c.x[var2];
                     var10000[3] |= 32768;
                     c.n = true;
                  }
               }

               var10000 = c.x[var2];
               var10000[8] &= -65281;
               var10000 = c.x[var2];
               var10000[8] |= (byte)t << 8 & '\uff00';
               t += 2;
            }
         } else {
            short var9;
            if ((var9 = c.b[c.w[c.x[var2][4]][1] * 11 + 5]) > 1) {
               var10000 = c.x[var2];
               var10000[10] &= -65536;
               var10000 = c.x[var2];
               var10000[10] |= (short)HG.e(var9) & '\uffff';
               c.a(c.x[var2], true);
            }
         }

         var10000 = c.x[var2];
         var10000[10] &= 16777215;
         var10000 = c.x[var2];
         var10000[10] |= 16777216;
         var12 = (var3 << 12) + (var5 << 12) / g + 2048;
         var10 = (var4 << 12) - (var6 << 12) / g + 4096 + c.x[var2][6] * 4096 - 1;
         c.x[var2][0] = (short)(var12 >> 12) & '\uffff' | (short)(var10 >> 12) << 16 & -65536;
         c.x[var2][5] = (short)(var12 % 4096) & '\uffff' | (short)(var10 % 4096) << 16 & -65536;
         if (c.w[c.x[var2][4]][2] == c.w[c.x[var2][4]][3]) {
            var10000 = c.x[var2];
            var10000[3] |= 32768;
         }
      }

   }

   public static final void n(DataInputStream var0) throws IOException {
      byte var1;
      c.f = new int[var1 = var0.readByte()][6];
      c.a(c.f);

      for(int var2 = 0; var2 < var1; ++var2) {
         c.f[var2][4] = var0.readByte();
         c.f[var2][0] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         c.f[var2][5] = (short)var0.readByte() & '\uffff' | (short)var0.readByte() << 16 & -65536;
         if (c.O[11] >= 0 && (c.E[c.O[11]] & 1 << var2) != 0) {
            int[] var10000 = c.f[var2];
            var10000[3] |= 65536;
         }
      }

   }

   public static final void k(DataInputStream var0) throws IOException {
      byte var1;
      c.t = new int[var1 = var0.readByte()][7];

      for(int var2 = 0; var2 < var1; ++var2) {
         c.t[var2][0] = var0.readByte();
         c.t[var2][1] = 1;
         switch(c.t[var2][0]) {
         case 3:
         case 11:
            c.t[var2][2] = var0.readByte();
            c.t[var2][3] = var0.readShort();
            break;
         case 4:
         case 9:
            c.t[var2][2] = var0.readShort();
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
            c.t[var2][2] = var0.readByte();
            c.t[var2][3] = var0.readByte();
            c.t[var2][4] = var0.readByte();
            c.t[var2][5] = var0.readByte();
            break;
         case 12:
            c.t[var2][2] = var0.readByte();
            c.t[var2][3] = var0.readShort();
            c.t[var2][4] = var0.readByte();
            break;
         case 14:
            c.t[var2][2] = var0.readShort();
            c.t[var2][3] = var0.readByte();
            c.t[var2][4] = var0.readByte();
         }

         c.t[var2][6] = var0.readByte();
      }

   }

   public static final void j(DataInputStream var0) throws IOException {
      byte var1;
      c.b = new byte[var1 = var0.readByte()][];

      for(int var2 = 0; var2 < var1; ++var2) {
         short var3 = var0.readShort();
         c.b[var2] = new byte[var3];
         var0.read(c.b[var2], 0, var3);
      }

   }

   public static final int b() {
      boolean var0 = false;
      int var1;
      if (c.O[11] == -1) {
         var1 = e;
      } else {
         var1 = c.C[c.O[11]];
      }

      return var1;
   }

   public static final void a(int var0) {
      if (c.O[11] == -1) {
         e = var0;
      } else {
         c.C[c.O[11]] = var0;
      }
   }

   public static final void e() {
      a = new int[u][m];

      for(int var0 = 0; var0 < a.length; ++var0) {
         for(int var1 = 0; var1 < a[var0].length; ++var1) {
            a[var0][var1] = -1;
         }
      }

   }

   public static final void h() {
      a = (int[][])null;
   }

   public static final void c(int[] var0, int[] var1) {
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

   public static final void a(int[] var0, int[] var1) {
      c(var0, var1);
      var1[2] = 0;
      if ((var0[3] & 4096) != 0) {
         var1[2] = var0[6] * 4096;
      }

   }

   public static final int c(int[] var0) {
      if ((var0[3] & 4096) != 0) {
         c(var0, t);
         int var1 = t[1];
         int[] var2 = c.a(var0);
         return var1 + var2[4];
      } else {
         d(var0, v);
         return v[3];
      }
   }

   public static final int b(int[] var0) {
      if ((var0[3] & 8) == 0) {
         return var0[0];
      } else {
         c(var0, u);
         int[] var10000;
         if (u[0] < 0) {
            var10000 = u;
            var10000[0] -= 4096;
         }

         if (u[1] < 0) {
            var10000 = u;
            var10000[1] -= 4096;
         }

         return (short)(u[0] >> 12) & '\uffff' | (short)(u[1] >> 12) << 16 & -65536;
      }
   }

   public static final void d(int[] var0, int[] var1) {
      c(var0, q);
      short var2 = 0;
      short var3 = 0;
      short var4 = 0;
      short var5 = 0;
      if ((var0[3] & 16) != 0) {
         var2 = -1024;
         var3 = 1024;
         var4 = -2048;
         var5 = 256;
      }

      int[] var6;
      if ((var0[3] & 32) != 0) {
         var2 = (short)((var6 = c.a[var0[11]])[2] & '\uffff');
         var4 = (short)((var6[2] & -65536) >> 16);
         var3 = (short)(var6[3] & '\uffff');
         var5 = (short)((var6[3] & -65536) >> 16);
      }

      if ((var0[3] & 4096) != 0) {
         var2 = (short)((var6 = c.w[var0[4]])[2] & '\uffff');
         var4 = (short)((var6[2] & -65536) >> 16);
         var3 = (short)(var6[3] & '\uffff');
         var5 = (short)((var6[3] & -65536) >> 16);
      }

      var1[0] = q[0] + var2;
      var1[1] = q[1] + var4;
      var1[2] = q[0] + var3;
      var1[3] = q[1] + var5;
   }

   public static final void b(int[] var0, int[] var1) {
      d(var0, k);
      var1[0] = k[2] + k[0] >> 1;
      var1[1] = k[3] + k[1] >> 1;
   }

   public static final boolean a(int[] var0, int[] var1) {
      return var0[0] <= var1[2] && var0[1] <= var1[3] && var0[2] >= var1[0] && var0[3] >= var1[1];
   }

   public static final boolean a(int var0, int var1, int var2, int var3, int[] var4, int[] var5) {
      boolean var6 = false;
      boolean var7 = false;
      int var8 = 0;
      int var9 = 0;
      boolean var12 = false;
      boolean var13 = false;
      boolean var14 = false;
      int var15;
      if ((var15 = var2 - var0) < 0 && var4[2] <= var0 && var4[2] >= var2) {
         var8 = var4[2] - var0;
         var12 = true;
      }

      if (var15 > 0 && var4[0] >= var0 && var4[0] <= var2) {
         var8 = var4[0] - var0;
         var12 = true;
      }

      int var11;
      if (var12 && (var11 = var1 + (int)((long)(var3 - var1) * (long)var8 / (long)(var2 - var0))) >= var4[1] && var11 <= var4[3]) {
         var2 = var0 + var8;
         var3 = var11;
         var14 = true;
      }

      int var16;
      if ((var16 = var3 - var1) < 0 && var4[3] <= var1 && var4[3] >= var3) {
         var9 = var4[3] - var1;
         var13 = true;
      }

      if (var16 > 0 && var4[1] >= var1 && var4[1] <= var3) {
         var9 = var4[1] - var1;
         var13 = true;
      }

      int var10;
      if (var13 && (var10 = var0 + (int)((long)(var2 - var0) * (long)var9 / (long)(var3 - var1))) >= var4[0] && var10 <= var4[2]) {
         var2 = var10;
         var3 = var1 + var9;
         var14 = true;
      }

      var5[0] = var2;
      var5[1] = var3;
      return var14;
   }

   public static final void a(int[] var0) {
      int var1;
      short var2 = (short)((var1 = var0[0]) & '\uffff');
      short var3 = (short)((var1 & -65536) >> 16);
      var0[3] |= 2;
      var0[1] &= -65536;
      var0[1] |= (short)a[var3][var2] & '\uffff';
      a[var3][var2] = (short)(var0[2] & '\uffff');
      c.b(var0, false);
   }

   public static final void b(int[] var0) {
      int var1;
      short var2 = (short)((var1 = var0[0]) & '\uffff');
      short var3 = (short)((var1 & -65536) >> 16);
      var0[3] &= -3;
      int var4 = a[var3][var2];

      int var5;
      for(var5 = -1; var4 != -1 && c[var4] != var0; var4 = (short)(c[var4][1] & '\uffff')) {
         var5 = var4;
      }

      short var6 = (short)(var0[1] & '\uffff');
      if (var5 != -1) {
         int[] var10000 = c[var5];
         var10000[1] &= -65536;
         var10000 = c[var5];
         var10000[1] |= (short)var6 & '\uffff';
      } else {
         a[var3][var2] = var6;
      }

      var0[1] &= -65536;
      var0[1] |= 65535;
      c.b(var0, true);
   }

   public static final int a(int[] var0, int var1) {
      if (var1 == 0) {
         return -1;
      } else {
         int var2 = -1;
         boolean var3 = false;
         int var4 = (var0[0] >> 12) - 6;
         int var5 = (var0[1] >> 12) - 6;
         int var6 = (var0[2] >> 12) + 6;
         int var7 = (var0[3] >> 12) + 6;
         if (var4 < 0) {
            var4 = 0;
         }

         if (var5 < 0) {
            var5 = 0;
         }

         if (var6 > m) {
            var6 = m;
         }

         if (var7 > u) {
            var7 = u;
         }

         for(int var8 = var5; var8 < var7; ++var8) {
            for(int var9 = var4; var9 < var6; ++var9) {
               int var10 = a[var8][var9];

               while(var10 != -1) {
                  d(c[var10], a);
                  if ((var1 & c[var10][3]) == 0) {
                     var10 = (short)(c[var10][1] & '\uffff');
                  } else if (!a(var0, a)) {
                     var10 = (short)(c[var10][1] & '\uffff');
                  } else {
                     int[] var10000 = c[var10];
                     var10000[1] &= 65535;
                     var10000 = c[var10];
                     var10000[1] |= (short)var2 << 16 & -65536;
                     var2 = var10;
                     var10 = (short)(c[var10][1] & '\uffff');
                  }
               }
            }
         }

         return var2;
      }
   }

   public static final int a(int var0, int var1, int var2, int var3, int var4, int[] var5) {
      return a(var0, var1, var2, var3, var4, var5, false);
   }

   public static final int a(int var0, int var1, int var2, int var3, int var4, int[] var5, boolean var6) {
      boolean var7 = false;
      boolean var8 = false;
      int var13 = -2;
      boolean var12 = false;
      int var9;
      int var17;
      if (var3 - var1 > 0) {
         for(var17 = var1 + (4096 - var1 % 4096); var17 < var3; var17 += 4096) {
            if (!c.e((var9 = var0 + (int)((long)(var2 - var0) * (long)(var17 - var1) / (long)(var3 - var1))) >> 12, var17 >> 12)) {
               var2 = var9;
               var3 = var17;
               var7 = true;
               break;
            }
         }
      }

      if (var3 - var1 < 0) {
         for(var17 = var1 - var1 % 4096 - 1; var17 > var3; var17 -= 4096) {
            if (!c.e((var9 = var0 + (int)((long)(var2 - var0) * (long)(var17 - var1) / (long)(var3 - var1))) >> 12, var17 >> 12)) {
               var2 = var9;
               var3 = var17;
               var7 = true;
               break;
            }
         }
      }

      boolean var11 = false;
      int var10;
      int var16;
      if (var2 - var0 > 0) {
         for(var16 = var0 + (4096 - var0 % 4096); var16 < var2; var16 += 4096) {
            var10 = var1 + (int)((long)(var3 - var1) * (long)(var16 - var0) / (long)(var2 - var0));
            if (!c.e(var16 >> 12, var10 >> 12)) {
               var2 = var16;
               var3 = var10;
               var7 = true;
               break;
            }
         }
      }

      if (var2 - var0 < 0) {
         for(var16 = var0 - var0 % 4096 - 1; var16 > var2; var16 -= 4096) {
            var10 = var1 + (int)((long)(var3 - var1) * (long)(var16 - var0) / (long)(var2 - var0));
            if (!c.e(var16 >> 12, var10 >> 12)) {
               var2 = var16;
               var3 = var10;
               var7 = true;
               break;
            }
         }
      }

      if (var0 < var2) {
         f[0] = var0;
         f[2] = var2;
      } else {
         f[0] = var2;
         f[2] = var0;
      }

      if (var1 < var3) {
         f[1] = var1;
         f[3] = var3;
      } else {
         f[1] = var3;
         f[3] = var1;
      }

      int var14 = a(f, var4);
      var5[0] = var2;
      var5[1] = var3;

      while(true) {
         while(var14 != -1) {
            if ((c[var14][3] & '耀') != 0) {
               var14 = (short)((c[var14][1] & -65536) >> 16);
            } else if (var6 && (c[var14][3] & 4096) != 0 && c.w[c[var14][4]][5] != 0) {
               var14 = (short)((c[var14][1] & -65536) >> 16);
            } else {
               d(c[var14], f);
               if (a(var0, var1, var5[0], var5[1], f, var5)) {
                  var8 = true;
                  var13 = var14;
               }

               var14 = (short)((c[var14][1] & -65536) >> 16);
            }
         }

         if (!var7 && !var8) {
            return -2;
         }

         if (var7) {
            return -1;
         }

         return var13;
      }
   }

   public static final void a(int[] var0, int var1, int var2) {
      if ((var0[3] & 2) != 0) {
         b(var0);
      }

      var0[0] = (short)var1 & '\uffff' | (short)var2 << 16 & -65536;
      if (var1 >= 0 && var1 < m && var2 >= 0 && var2 < u) {
         a(var0);
      }

   }

   public static final int a(int[] var0, int var1, int var2, int var3, int var4) {
      int var5 = -2;
      int var6 = var0[var2];
      d(var0, o);
      h[0] = p[0] + p[2] >> 1;
      h[1] = p[1] + p[3] >> 1;
      var0[var2] = var1;
      d(var0, p);
      if (p[0] >= 0 && p[1] >= 0 && p[2] < m * 4096 && p[3] < u * 4096) {
         int var7 = p[0] >> 12;
         int var8 = p[1] >> 12;
         int var9 = p[2] >> 12;
         int var10 = p[3] >> 12;

         int var11;
         for(var11 = var7; var11 <= var9; ++var11) {
            for(int var12 = var8; var12 <= var10; ++var12) {
               if (!c.e(var11, var12)) {
                  var0[var2] = var6;
                  return -1;
               }
            }
         }

         int[] var10000;
         for(var11 = a(o, var3); var11 != -1; var11 = (short)((c[var11][1] & -65536) >> 16)) {
            b(c[var11], b);
            if (var6 < var1 && b[var4] <= h[var4] || var6 > var1 && b[var4] >= h[var4]) {
               var10000 = c[var11];
               var10000[3] |= 2097152;
            }
         }

         for(var11 = a(p, var3); var11 != -1 && ((c[var11][3] & '耀') != 0 || (c[var11][3] & 2097152) != 0); var11 = (short)((c[var11][1] & -65536) >> 16)) {
         }

         if (var11 != -1) {
            var5 = var11;
            var0[var2] = var6;
         }

         for(var11 = a(o, var3); var11 != -1; var11 = (short)((c[var11][1] & -65536) >> 16)) {
            var10000 = c[var11];
            var10000[3] &= -2097153;
         }

         return var5;
      } else {
         var0[var2] = var6;
         return -1;
      }
   }

   public static final int a(int[] var0, boolean var1, boolean var2) {
      int var3 = 0;
      int var4 = var0[0] + var0[2] >> 1;
      int var5 = var0[1] + var0[3] >> 1;
      int var6 = var0[0] >> 12;
      int var7 = var0[1] >> 12;
      int var8 = var0[2] >> 12;
      int var9 = var0[3] >> 12;
      if (var6 < 0) {
         var6 = 0;
      }

      if (var7 < 0) {
         var7 = 0;
      }

      if (var8 >= m) {
         var8 = m - 1;
      }

      if (var9 >= u) {
         var9 = u - 1;
      }

      boolean var10 = false;
      int var11;
      int var12;
      if (var1) {
         if (var2) {
            var12 = var8;
         } else {
            var12 = var6;
         }

         for(var11 = var7; var11 <= var9; ++var11) {
            if (!c.e(var12, var11)) {
               if (var5 < var11 * 4096 + 2048) {
                  if (c.e(var12, var11 - 1)) {
                     var3 |= 1;
                  }
               } else if (c.e(var12, var11 + 1)) {
                  var3 |= 2;
               }
            }
         }
      } else {
         if (var2) {
            var12 = var9;
         } else {
            var12 = var7;
         }

         for(var11 = var6; var11 <= var8; ++var11) {
            if (!c.e(var11, var12)) {
               if (var4 < var11 * 4096 + 2048) {
                  if (c.e(var11 - 1, var12)) {
                     var3 |= 1;
                  }
               } else if (c.e(var11 + 1, var12)) {
                  var3 |= 2;
               }
            }
         }
      }

      return var3;
   }

   public static final int a(int[] var0, int var1, int var2, int var3) {
      if ((var0[3] & 8) == 0) {
         return -2;
      } else {
         int var4 = var0[4];
         int var5 = var0[5];
         if (var4 == var1 && var5 == var2) {
            return -2;
         } else {
            boolean var6 = false;
            int var7 = -1;
            b(var0);
            boolean var8 = false;
            boolean var9 = false;
            if (var4 != var1 && var5 != var2) {
               var8 = true;
               var9 = true;
            } else {
               boolean var10 = true;
               boolean var11 = true;
               boolean var12 = false;
               d(var0, s);

               int var13;
               int[] var10000;
               for(var13 = a(s, var3); var13 != -1; var13 = (short)((c[var13][1] & -65536) >> 16)) {
                  var10000 = c[var13];
                  var10000[3] |= 2097152;
               }

               x[0] = s[0] + s[2] >> 1;
               x[1] = s[1] + s[3] >> 1;
               int var14;
               if (var1 != var4) {
                  if (var1 < var4) {
                     var10000 = s;
                     var10000[0] += var1 - var4;
                     var14 = a(s, true, false);
                  } else {
                     var10000 = s;
                     var10000[2] += var1 - var4;
                     var14 = a(s, true, true);
                  }

                  var8 = true;
               } else {
                  if (var2 < var5) {
                     var10000 = s;
                     var10000[1] += var2 - var5;
                     var14 = a(s, false, false);
                  } else {
                     var10000 = s;
                     var10000[3] += var2 - var5;
                     var14 = a(s, false, true);
                  }

                  var9 = true;
               }

               switch(var14) {
               case 0:
                  break;
               case 1:
                  var12 = true;
                  var10 = false;
                  break;
               case 2:
                  var12 = true;
                  var11 = false;
                  break;
               case 3:
               default:
                  var12 = true;
                  var10 = false;
                  var11 = false;
               }

               if ((var13 = a(s, var3)) != -1) {
                  label127:
                  while(true) {
                     while(true) {
                        if (var13 == -1) {
                           break label127;
                        }

                        if ((c[var13][3] & 2097152) != 0) {
                           var10000 = c[var13];
                           var10000[3] &= -2097153;
                           var13 = (short)((c[var13][1] & -65536) >> 16);
                        } else if ((c[var13][3] & '耀') != 0) {
                           var13 = (short)((c[var13][1] & -65536) >> 16);
                        } else if ((c[var13][3] & 4096) != 0 && (short)(c[var13][8] & '\uffff') > 0) {
                           var13 = (short)((c[var13][1] & -65536) >> 16);
                        } else {
                           var12 = true;
                           b(c[var13], d);
                           if (var8) {
                              if (d[1] > x[1]) {
                                 var10 = false;
                              } else {
                                 var11 = false;
                              }
                           } else if (d[0] > x[0]) {
                              var10 = false;
                           } else {
                              var11 = false;
                           }

                           var13 = (short)((c[var13][1] & -65536) >> 16);
                        }
                     }
                  }
               }

               if (var12) {
                  if (var10) {
                     if (var8) {
                        var8 = false;
                        var9 = true;
                        var2 += Math.abs(var1 - var4);
                        var1 = var4;
                     } else {
                        var8 = true;
                        var9 = false;
                        var1 += Math.abs(var2 - var5);
                        var2 = var5;
                     }
                  }

                  if (var11) {
                     if (var8) {
                        var8 = false;
                        var9 = true;
                        var2 -= Math.abs(var1 - var4);
                        var1 = var4;
                     } else {
                        var8 = true;
                        var9 = false;
                        var1 -= Math.abs(var2 - var5);
                        var2 = var5;
                     }
                  }
               }
            }

            if (var1 >= 0 && var2 >= 0 && var1 < m * 4096 && var2 < u * 4096) {
               int var15;
               if (var8) {
                  if ((var15 = a(var0, var1, 4, var3, 0)) == -1) {
                     var6 = true;
                  } else if (var15 >= 0) {
                     var7 = var15;
                  }
               }

               if (var9) {
                  if ((var15 = a(var0, var2, 5, var3, 1)) == -1) {
                     var6 = true;
                  } else if (var15 >= 0) {
                     var7 = var15;
                  }
               }

               var0[0] = (short)(var0[4] >> 12) & '\uffff' | (short)(var0[5] >> 12) << 16 & -65536;
               a(var0);
               if (var7 != -1) {
                  return var7;
               } else {
                  return var6 ? -1 : -2;
               }
            } else {
               a(var0);
               return -1;
            }
         }
      }
   }

   public static final boolean a(int[] var0, int[] var1, int var2) {
      d(var0, r);
      d(var1, l);
      int[] var10000 = r;
      var10000[0] -= var2;
      var10000 = r;
      var10000[1] -= var2;
      var10000 = r;
      var10000[2] += var2;
      var10000 = r;
      var10000[3] += var2;
      return a(r, l);
   }

   public static final boolean b(int[] var0, int[] var1) {
      c(var0, n);
      c(var1, g);
      int var2 = a(n[0], n[1], g[0], g[1], 4144, c, true);
      short var3 = (short)(var1[2] & '\uffff');
      return var2 == -2 || var2 == var3;
   }

   public static final void a() {
      w = null;
      a = (int[][][])null;
      b = (int[][][])null;
      j = null;
      i = null;
      m = null;
      d = (int[][])null;
      System.gc();
   }

   public static final void f() {
      e = 0;

      for(int var0 = 0; var0 < c.x.length; ++var0) {
         int[] var1 = c.x[var0];
         int[] var10000 = b[(short)((var1[0] & -65536) >> 16)];
         var10000[(short)(var1[0] & '\uffff')] |= Integer.MIN_VALUE;
         byte var2;
         if ((var2 = (byte)(var1[8] & 255)) > 0) {
            if (t >= 30) {
               var1[8] = 0;
            } else {
               switch(var2) {
               case 4:
                  var1[8] &= -16711681;
                  var1[8] |= 16711680;
                  int var3 = HG.e(6);
                  var1[8] &= 16777215;
                  var1[8] |= (byte)var3 << 24 & -16777216;
                  int var4 = c.h(var3);
                  var1[9] &= 65535;
                  var1[9] |= (short)var4 << 16 & -65536;
                  var1[8] &= -65281;
                  var1[8] |= (byte)t << 8 & '\uff00';
                  t += 2;
               case 8:
                  if (var2 != 8 || HG.e(2) == 0) {
                     ++c;
                     int var5;
                     if ((var5 = c.O[17] / 5 + c.r[0][4]) > 2500) {
                        var5 = 2500;
                     }

                     int var6 = 0;

                     for(; var6 < 4; ++var6) {
                        int[][] var7 = (int[][])null;
                        int[][] var8 = (int[][])null;
                        byte var9 = -1;
                        byte var10 = -1;
                        byte var11 = -1;
                        byte var12 = -1;
                        byte var13 = -1;
                        byte var14 = -1;
                        byte var15 = -1;
                        byte var16 = -1;
                        short var17 = 0;
                        boolean var18 = false;
                        switch(var6) {
                        case 0:
                           var8 = c.i;
                           var7 = c.e;
                           var9 = 10;
                           var10 = 10;
                           var11 = 12;
                           var12 = 0;
                           var13 = 2;
                           var15 = 4;
                           var17 = 64;
                           var18 = true;
                           break;
                        case 1:
                           var8 = c.n;
                           var7 = c.p;
                           var9 = 10;
                           var10 = 10;
                           var11 = 12;
                           var12 = 0;
                           var13 = 2;
                           var15 = 4;
                           var17 = 128;
                           var18 = true;
                           break;
                        case 2:
                           var8 = c.y;
                           var7 = c.h;
                           var9 = 10;
                           var10 = 10;
                           var11 = 12;
                           var12 = 0;
                           var13 = 2;
                           var15 = 4;
                           var17 = 8192;
                           var18 = true;
                           break;
                        case 3:
                           var8 = c.l;
                           var7 = c.r;
                           var9 = 10;
                           var12 = 1;
                           var13 = 5;
                           var15 = 4;
                           var16 = 6;
                           var17 = 256;
                           var14 = 0;
                           var18 = false;
                        }

                        for(int var19 = 0; var19 < var13; ++var19) {
                           if (var19 < var12 || HG.e(var9) == 0) {
                              boolean var20 = false;
                              boolean var21 = false;
                              if (var10 != -1) {
                                 var20 = HG.e(var10) == 0;
                              }

                              if (var11 != -1 && var20) {
                                 var21 = HG.e(var11) == 0;
                              }

                              int var22 = -1;
                              int var23 = -1;
                              int var24 = 0;
                              int var25 = 0;

                              int var26;
                              for(var26 = 0; var26 < var7.length; ++var26) {
                                 if (var7[var26][var15] <= var5) {
                                    if (var10 != -1 && var11 != -1) {
                                       if ((var7[var26][3] & 1) != 0) {
                                          ++var25;
                                       } else {
                                          ++var24;
                                       }
                                    } else {
                                       ++var24;
                                    }
                                 }
                              }

                              if (var24 == 0) {
                                 break;
                              }

                              var26 = HG.e(var25);
                              int var27 = HG.e(var24);
                              var25 = 0;
                              var24 = 0;

                              int var28;
                              for(var28 = 0; var28 < var7.length; ++var28) {
                                 if (var7[var28][var15] <= var5) {
                                    if (var10 != -1 && var11 != -1) {
                                       if ((var7[var28][3] & 1) != 0) {
                                          if (var26 == var25) {
                                             var23 = var28;
                                          }

                                          ++var25;
                                       } else {
                                          if (var27 == var24) {
                                             var22 = var28;
                                          }

                                          ++var24;
                                       }
                                    } else {
                                       if (var27 == var24) {
                                          var22 = var28;
                                       }

                                       ++var24;
                                    }
                                 }
                              }

                              if (var21 && var23 != -1) {
                                 var20 = false;
                                 var22 = var23;
                              }

                              if ((var28 = c.a(var8)) != -1) {
                                 if (var19 == 0 && var14 != -1) {
                                    var22 = var14;
                                 }

                                 var8[var28][0] = var1[0];
                                 var8[var28][3] = var17;
                                 if (var18) {
                                    a(var22, var20, var8[var28]);
                                 } else {
                                    var8[var28][4] = var22;
                                    var8[var28][5] = 0;
                                 }

                                 if (!var18 && var22 == 0 && var16 != -1) {
                                    int var29;
                                    int var30 = (HG.e(var29 = var5 / 20) >> 2) + HG.e(2) + (HG.e(var29) >> 2) + HG.e(2) + (HG.e(var29) >> 2) + HG.e(2);
                                    int var31 = (var29 >> 2) + 2;
                                    var8[var28][var16] = var31 + var30;
                                 } else if (var16 != -1) {
                                    var8[var28][var16] = HG.e(8) + 1;
                                 }
                              }
                           }
                        }
                     }
                  } else {
                     var1[8] = 0;
                  }
               }
            }
         }
      }

   }

   public static final int a(int var0, int var1) {
      for(int var2 = 0; var2 < 15; ++var2) {
         for(int var3 = var1 - var2; var3 <= var1 + var2; ++var3) {
            for(int var4 = var0 - var2; var4 <= var0 + var2; ++var4) {
               if (var4 >= 0 && var4 < b[0].length && var3 >= 0 && var3 < b.length && (b[var3][var4] & '耀') != 0 && (b[var3][var4] & Integer.MIN_VALUE) == 0) {
                  return (short)var4 & '\uffff' | (short)var3 << 16 & -65536;
               }
            }
         }
      }

      return -1;
   }

   public static final void j() {
      System.gc();
      j = new int[c.a.length];
      i = new int[c.a.length];
      m = new int[c.a.length];
      d = new int[2][c.a.length];
      int var0 = 0;

      int var1;
      int var8;
      for(var1 = 0; var1 < c.a.length; ++var1) {
         if (c.a[var1][5] - 3 <= c.O[18] && c.a[var1][27] < 5) {
            boolean var2 = false;

            for(var8 = 0; var8 < var0 && j[var8] != c.a[var1][27]; ++var8) {
            }

            if (var8 == var0) {
               j[var0++] = c.a[var1][27];
            }
         }
      }

      if (var0 == 0) {
         j[var0++] = c.a[0][27];
      }

      int var3;
      int var4;
      for(var1 = 0; var1 < var0; ++var1) {
         var8 = HG.e(var0);
         var3 = HG.e(var0);
         var4 = j[var8];
         j[var8] = j[var3];
         j[var3] = var4;
      }

      b = 1;
      if (var0 > 1 && HG.e(5) == 0) {
         ++b;
      }

      if (b > 2) {
         b = 2;
      }

      for(var1 = 0; var1 < b; ++var1) {
         var8 = j[var1];
         var3 = 0;

         for(var4 = 0; var4 < c.a.length; ++var4) {
            if (c.a[var4][27] == var8 && c.a[var4][5] - 3 <= c.O[18]) {
               d[var1][var3++] = var4;
            }
         }

         if (var3 == 0) {
            d[var1][var3++] = 0;
         }

         int var5;
         for(var4 = 0; var4 < var3; ++var4) {
            var5 = HG.e(var3);
            int var6 = HG.e(var3);
            int var7 = d[var1][var5];
            d[var1][var5] = d[var1][var6];
            d[var1][var6] = var7;
         }

         if (var3 > 2) {
            var3 = 2;
         }

         m[var1] = var3;
         var4 = 0;

         for(var5 = 0; var5 < var3; ++var5) {
            var4 += c.a[d[var1][var5]][5];
         }

         var4 /= var3;
         ++var4;
         var5 = c.O[18] * 5 / var4;
         ++var5;
         if (var5 < 3) {
            var5 = 3;
         }

         if (var5 > 6) {
            var5 = 6;
         }

         i[var1] = var5;
      }

   }

   public static final int a(int var0) {
      while(true) {
         int[] var10000;
         int var1;
         short var10001;
         int var2;
         for(var1 = 0; var1 < var0; ++var1) {
            var2 = HG.e(y >> 1) + (y >> 2);
            int var3 = HG.e(v >> 1) + (v >> 2);
            w[s + var1] = a(var2, var3);
            if (w[s + var1] == -1) {
               break;
            }

            var10000 = b[(short)((w[s + var1] & -65536) >> 16)];
            var10001 = (short)(w[s + var1] & '\uffff');
            var10000[var10001] &= -32769;
         }

         for(var2 = 0; var2 < var1; ++var2) {
            var10000 = b[(short)((w[s + var2] & -65536) >> 16)];
            var10001 = (short)(w[s + var2] & '\uffff');
            var10000[var10001] |= 32768;
         }

         if (var1 == var0) {
            for(var1 = 0; var1 < var0; ++var1) {
               var10000 = b[(short)((w[s + var1] & -65536) >> 16)];
               var10001 = (short)(w[s + var1] & '\uffff');
               var10000[var10001] |= Integer.MIN_VALUE;
            }

            return var0;
         }

         --var0;
      }
   }

   public static final void a(boolean var0) {
      if (c.a.length == 0) {
         c.q = new int[0][0];
      } else {
         s = 0;

         int var1;
         int var3;
         for(var1 = 0; var1 < b; ++var1) {
            boolean var2 = false;
            var3 = i[var1];
            i[var1] = a(var3);
            s += i[var1];
         }

         c.q = new int[s][32];
         s = 0;

         for(var1 = 0; var1 < b; ++var1) {
            for(var3 = 0; var3 < i[var1]; ++var3) {
               int var4 = HG.e(m[var1]);
               var4 = d[var1][var4];
               int var5 = s;
               int var6 = w[s++];
               int[] var7;
               (var7 = c.q[var5])[0] = var6;
               var7[1] = -1;
               var7[2] = -1;
               var7[3] = 0;
               var7[4] = ((short)(var6 & '\uffff') << 12) + 2048;
               var7[5] = ((short)((var6 & -65536) >> 16) << 12) + 2048;
               var7[6] = 0;
               var7[7] = 0;
               var7[8] = 0;
               var7[9] = 0;
               var7[10] = 0;
               var7[11] = var4;
               var7[12] = (short)c.a[var4][6] & '\uffff' | (short)c.a[var4][6] << 16 & -65536;
               var7[13] = 0;
               var7[14] = -1;
               var7[15] = -1;
               var7[17] = -1;
               var7[18] = -1;
               var7[20] = -1;
               var7[21] = -1;
               var7[22] = -1;
               var7[24] = -1;
               var7[19] = c.c(var5);
               i += 2;
               f += 2;
               o += 4;
               p += 2;
               ++c;
            }
         }

      }
   }

   public static final void c(int var0) {
      boolean var1 = false;
      int var2;
      switch(var0) {
      case 0:
         var2 = a(y >> 1, 2);
         break;
      case 1:
         var2 = a(y - 1 - 2, v >> 1);
         break;
      case 2:
         var2 = a(y >> 1, v - 1 - 2);
         break;
      case 3:
      default:
         var2 = a(2, v >> 1);
         break;
      case 4:
         var2 = a(y >> 1, v >> 1);
      }

      int[] var10000;
      if (var2 != -1) {
         q = (short)(var2 & '\uffff');
         z = (short)((var2 & -65536) >> 16);
      } else {
         for(int var3 = 0; var3 < b.length; ++var3) {
            for(int var4 = 0; var4 < b[0].length; ++var4) {
               b[var3][var4] = -65536;
               var10000 = b[var3];
               var10000[var4] |= 32768;
               var10000 = b[var3];
               var10000[var4] &= Integer.MAX_VALUE;
            }
         }

         q = b[0].length >> 1;
         z = b.length >> 1;
         c.x = new int[0][0];
      }

      var10000 = b[z];
      int var10001 = q;
      var10000[var10001] |= Integer.MIN_VALUE;
      a(false);
   }

   public static final void a(int var0, int var1) {
      c.t = new int[4][7];
      c.t[0][0] = 8;
      c.t[0][1] = 1;
      c.t[0][2] = 0;
      c.t[0][3] = y - 1;
      c.t[0][4] = 0;
      c.t[0][5] = 1;
      c.t[0][6] = 0;
      c.t[1][0] = 8;
      c.t[1][1] = 1;
      c.t[1][2] = 0;
      c.t[1][3] = y - 1;
      c.t[1][4] = v - 2;
      c.t[1][5] = v - 1;
      c.t[1][6] = 0;
      c.t[2][0] = 8;
      c.t[2][1] = 1;
      c.t[2][2] = 0;
      c.t[2][3] = 1;
      c.t[2][4] = 0;
      c.t[2][5] = v - 1;
      c.t[2][6] = 0;
      c.t[3][0] = 8;
      c.t[3][1] = 1;
      c.t[3][2] = y - 2;
      c.t[3][3] = y - 1;
      c.t[3][4] = 0;
      c.t[3][5] = v - 1;
      c.t[3][6] = 0;
      c.b = new byte[1][5];
      c.b[0][0] = 41;
      c.b[0][1] = 0;
      c.b[0][2] = 0;
      c.b[0][3] = (byte)var0;
      c.b[0][4] = (byte)var1;
   }

   public static final boolean a(int var0, int var1, int var2) {
      try {
         if (c.O == null) {
            return false;
         } else {
            b.a = 0;
            n = var0;
            short var3 = (short)(c.O[0] & '\uffff');
            short var4 = (short)((c.O[0] & -65536) >> 16);
            m();
            i = 0;
            f = 0;
            o = 0;
            p = 0;
            a = new int[1][][];
            b = new int[1][][];
            if (!a(1)) {
               return false;
            } else {
               c.l(0);
               A = 0;
               b.a = 15;
               b.a = 15;
               b = a[0];

               for(int var5 = 0; var5 < b.length; ++var5) {
                  for(int var6 = 0; var6 < b[0].length; ++var6) {
                     int[] var10000 = b[var5];
                     var10000[var6] |= 32768;
                     var10000 = b[var5];
                     var10000[var6] &= Integer.MAX_VALUE;
                  }
               }

               c.x = b[0];
               y = b[0].length;
               v = b.length;
               s = 0;
               w = new int[y * v];
               b.a = 20;
               b.a = 20;
               c(var2);
               m = y;
               u = v;
               c.O[11] = -1;
               a();
               c.M = new int[u * 2 * m * 2 * 3];
               c.b = new int[c.q.length][];
               c.i = new int[i + 15][9];
               c.n = new int[f + 15][9];
               c.l = new int[o + 15][7];
               c.d = new int[0][0];
               c.f = new int[0][0];
               c.y = new int[p + 15][8];
               c.a(c.i);
               c.a(c.n);
               c.a(c.l);
               c.a(c.y);
               f();
               a(var3, var4);
               b.a = 25;
               b(q, z);
               return true;
            }
         }
      } catch (Exception var7) {
         var7.printStackTrace();
         return false;
      }
   }

   public static final int a(int var0, int[] var1) {
      short var2 = (short)((c[var0][2] & -65536) >> 16);
      if ((c[var0][3] & 4096) != 0) {
         return (short)(c.x[var2][9] & '\uffff');
      } else if ((c[var0][3] & 32) != 0) {
         int var3 = (short)(c.q[var2][17] & '\uffff');
         if (var1 != null) {
            if ((var1[3] & 128) != 0) {
               ++var3;
            } else if ((var1[3] & 256) != 0) {
               var3 += 2;
            } else if ((var1[3] & 8192) != 0) {
               var3 += 3;
            }
         }

         return var3;
      } else {
         return -1;
      }
   }

   public static final int a() {
      int var0 = a(c.ag, (int[])null);

      for(int var1 = 0; var1 < 4; ++var1) {
         if ((short)((c.D[var0 + var1] & -65536) >> 16) > 0) {
            return var1;
         }
      }

      return -1;
   }

   public static final void g() {
      int var0 = a(c.ag, (int[])null);
      ++HG.G;
      if (HG.G >= 4) {
         HG.G = 0;
      }

      if ((short)((c.D[var0 + HG.G] & -65536) >> 16) <= 0) {
         if (a() >= 0) {
            g();
         } else {
            HG.G = 0;
         }
      }
   }

   public static final void c() {
      int var0 = a(c.ag, (int[])null);
      --HG.G;
      if (HG.G < 0) {
         HG.G = 3;
      }

      if ((short)((c.D[var0 + HG.G] & -65536) >> 16) <= 0) {
         if (a() >= 0) {
            c();
         } else {
            HG.G = 0;
         }
      }
   }

   public static final void l() {
      if (c.D == null) {
         c.D = new int[c];
         c = 0;
      }

      for(int var0 = 0; var0 < c.q.length; ++var0) {
         if (c.a[c.q[var0][11]][27] == 7 || c.a[c.q[var0][11]][27] == 8) {
            int[] var10000 = c.q[var0];
            var10000[17] &= -65536;
            var10000 = c.q[var0];
            var10000[17] |= (short)c & '\uffff';
            short var1 = (short)(c.q[var0][17] & '\uffff');
            var10000 = c.D;
            var10000[var1] &= -65536;
            var10000 = c.D;
            var10000[var1] |= 65535;
            var10000 = c.D;
            var10000[var1] &= 65535;
            var10000 = c.D;
            var10000[var1] |= 0;
            ++c;
            int var2;
            int var3;
            int var4;
            int var5;
            int var6;
            int var7;
            boolean var8;
            short var9;
            short var10;
            short var11;
            boolean var12;
            if (c.a[c.q[var0][11]][27] == 7) {
               var2 = c.a[c.q[var0][11]][25];
               var3 = HG.b(5, 15);
               var10000 = c.D;
               var10000[var1] &= 65535;
               var10000 = c.D;
               var10000[var1] |= (short)var3 << 16 & -65536;
               var4 = c.e.length;

               for(var5 = 0; var5 < c.e.length; ++var5) {
                  if ((c.e[var5][3] & 1) != 0) {
                     var4 = var5 - 1;
                     break;
                  }
               }

               for(var5 = 0; var5 < var3; ++var5) {
                  if ((var6 = c.a(c.i)) >= 0) {
                     var7 = HG.e(var4);
                     var8 = HG.e(100) < var2;
                     var9 = (short)(c.i[var6][2] & '\uffff');
                     a(var7, var8, c[var9]);
                     var10000 = c[var9];
                     var10000[3] |= 65536;
                     if ((c[var9][3] & 2) != 0) {
                        b(c[var9]);
                     }

                     var11 = var10 = (short)(c.D[var1] & '\uffff');

                     for(var12 = false; var11 != -1; var11 = (short)(c[var11][1] & '\uffff')) {
                        if (c[var11][4] == c[var9][4] && c[var11][6] == -1 && c[var11][7] == -1 && c[var9][6] == -1 && c[var9][7] == -1) {
                           c[var9][4] = -1;
                           var12 = true;
                           break;
                        }
                     }

                     if (!var12) {
                        var10000 = c[var9];
                        var10000[1] &= -65536;
                        var10000 = c[var9];
                        var10000[1] |= (short)var10 & '\uffff';
                        var10000 = c.D;
                        var10000[var1] &= -65536;
                        var10000 = c.D;
                        var10000[var1] |= (short)var9 & '\uffff';
                     }
                  }
               }
            }

            int var15 = var1 + 1;
            var10000 = c.D;
            var10000[var15] &= -65536;
            var10000 = c.D;
            var10000[var15] |= 65535;
            var10000 = c.D;
            var10000[var15] &= 65535;
            var10000 = c.D;
            var10000[var15] |= 0;
            ++c;
            if (c.a[c.q[var0][11]][27] == 7) {
               var2 = c.a[c.q[var0][11]][25];
               var3 = HG.b(5, 15);
               var10000 = c.D;
               var10000[var15] &= 65535;
               var10000 = c.D;
               var10000[var15] |= (short)var3 << 16 & -65536;
               var4 = c.p.length;

               for(var5 = 0; var5 < c.p.length; ++var5) {
                  if ((c.p[var5][3] & 1) != 0) {
                     var4 = var5 - 1;
                     break;
                  }
               }

               for(var5 = 0; var5 < var3; ++var5) {
                  if ((var6 = c.a(c.n)) >= 0) {
                     var7 = HG.e(var4);
                     var8 = HG.e(100) < var2;
                     var9 = (short)(c.n[var6][2] & '\uffff');
                     a(var7, var8, c[var9]);
                     var10000 = c[var9];
                     var10000[3] |= 65536;
                     if ((c[var9][3] & 2) != 0) {
                        b(c[var9]);
                     }

                     var11 = var10 = (short)(c.D[var15] & '\uffff');

                     for(var12 = false; var11 != -1; var11 = (short)(c[var11][1] & '\uffff')) {
                        if (c[var11][4] == c[var9][4] && c[var11][6] == -1 && c[var11][7] == -1 && c[var9][6] == -1 && c[var9][7] == -1) {
                           c[var9][4] = -1;
                           var12 = true;
                           break;
                        }
                     }

                     if (!var12) {
                        var10000 = c[var9];
                        var10000[1] &= -65536;
                        var10000 = c[var9];
                        var10000[1] |= (short)var10 & '\uffff';
                        var10000 = c.D;
                        var10000[var15] &= -65536;
                        var10000 = c.D;
                        var10000[var15] |= (short)var9 & '\uffff';
                     }
                  }
               }
            }

            ++var15;
            var10000 = c.D;
            var10000[var15] &= -65536;
            var10000 = c.D;
            var10000[var15] |= 65535;
            var10000 = c.D;
            var10000[var15] &= 65535;
            var10000 = c.D;
            var10000[var15] |= 0;
            ++c;
            byte var16 = 3;
            var3 = c.r.length - 1;
            if (c.a[c.q[var0][11]][27] == 7) {
               var16 = 1;
               var3 = 2;
            }

            var4 = HG.b(5, 15);
            var10000 = c.D;
            var10000[var15] &= 65535;
            var10000 = c.D;
            var10000[var15] |= (short)var4 << 16 & -65536;

            for(var5 = var16; var5 <= var3; ++var5) {
               if (c.r[var5][5] != 0 && c.O[18] >= c.r[var5][5] && (var6 = c.a(c.l)) >= 0) {
                  short var17 = (short)(c.l[var6][2] & '\uffff');
                  c.l[var6][4] = var5;
                  if (c.a[c.q[var0][11]][27] == 7) {
                     c.l[var6][6] = HG.b(100, 300);
                  } else {
                     c.l[var6][6] = HG.b(5, 10);
                  }

                  var10000 = c[var17];
                  var10000[3] |= 65536;
                  if ((c[var17][3] & 2) != 0) {
                     b(c[var17]);
                  }

                  var9 = (short)(c.D[var15] & '\uffff');
                  var10000 = c[var17];
                  var10000[1] &= -65536;
                  var10000 = c[var17];
                  var10000[1] |= (short)var9 & '\uffff';
                  var10000 = c.D;
                  var10000[var15] &= -65536;
                  var10000 = c.D;
                  var10000[var15] |= (short)var17 & '\uffff';
               }
            }

            ++var15;
            var10000 = c.D;
            var10000[var15] &= -65536;
            var10000 = c.D;
            var10000[var15] |= 65535;
            var10000 = c.D;
            var10000[var15] &= 65535;
            var10000 = c.D;
            var10000[var15] |= 0;
            ++c;
            if (c.a[c.q[var0][11]][27] == 8) {
               var4 = c.a[c.q[var0][11]][25];
               var5 = HG.b(5, 15);
               var10000 = c.D;
               var10000[var15] &= 65535;
               var10000 = c.D;
               var10000[var15] |= (short)var5 << 16 & -65536;
               var6 = c.h.length;

               for(var7 = 0; var7 < c.h.length; ++var7) {
                  if ((c.h[var7][3] & 1) != 0) {
                     var6 = var7 - 1;
                     break;
                  }
               }

               for(var7 = 0; var7 < var5; ++var7) {
                  int var18;
                  if ((var18 = c.a(c.y)) >= 0) {
                     int var19 = HG.e(var6);
                     boolean var20 = HG.e(100) < var4;
                     var11 = (short)(c.y[var18][2] & '\uffff');
                     a(var19, var20, c[var11]);
                     var10000 = c[var11];
                     var10000[3] |= 65536;
                     if ((c[var11][3] & 2) != 0) {
                        b(c[var11]);
                     }

                     short var21;
                     short var13 = var21 = (short)(c.D[var15] & '\uffff');

                     boolean var14;
                     for(var14 = false; var13 != -1; var13 = (short)(c[var13][1] & '\uffff')) {
                        if (c[var13][4] == c[var11][4] && c[var13][6] == -1 && c[var13][7] == -1 && c[var11][6] == -1 && c[var11][7] == -1) {
                           c[var11][4] = -1;
                           var14 = true;
                           break;
                        }
                     }

                     if (!var14) {
                        var10000 = c[var11];
                        var10000[1] &= -65536;
                        var10000 = c[var11];
                        var10000[1] |= (short)var21 & '\uffff';
                        var10000 = c.D;
                        var10000[var15] &= -65536;
                        var10000 = c.D;
                        var10000[var15] |= (short)var11 & '\uffff';
                     }
                  }
               }
            }
         }
      }

   }

   public static final void b() {
      if (c.D == null) {
         c.D = new int[c];
         c = 0;
      }

      for(int var0 = 0; var0 < c.x.length; ++var0) {
         byte var1;
         if ((var1 = (byte)(c.x[var0][8] & 255)) == 4 || var1 == 8) {
            int[] var10000 = c.x[var0];
            var10000[9] &= -65536;
            var10000 = c.x[var0];
            var10000[9] |= (short)c & '\uffff';
            short var2 = (short)(c.x[var0][9] & '\uffff');
            var10000 = c.D;
            var10000[var2] &= -65536;
            var10000 = c.D;
            var10000[var2] |= 65535;
            ++c;
            short var3 = (short)((c.x[var0][0] & -65536) >> 16);
            short var4 = (short)(c.x[var0][0] & '\uffff');
            int var6 = a[var3][var4];

            int var7;
            short var8;
            for(var7 = 0; var6 != -1; var6 = var8) {
               var8 = (short)(c[var6][1] & '\uffff');
               if ((c[var6][3] & 256) != 0 || (c[var6][3] & 512) != 0 || (c[var6][3] & 64) != 0 || (c[var6][3] & 128) != 0 || (c[var6][3] & 1024) != 0 || (c[var6][3] & 8192) != 0) {
                  var10000 = c[var6];
                  var10000[3] |= 65536;
                  if ((c[var6][3] & 2) != 0) {
                     b(c[var6]);
                  }

                  short var9 = (short)(c.x[var0][9] & '\uffff');
                  short var10 = (short)(c.D[var9] & '\uffff');
                  var10000 = c[var6];
                  var10000[1] &= -65536;
                  var10000 = c[var6];
                  var10000[1] |= (short)var10 & '\uffff';
                  var10000 = c.D;
                  var10000[var9] &= -65536;
                  var10000 = c.D;
                  var10000[var9] |= (short)var6 & '\uffff';
                  ++var7;
               }
            }

            var10000 = c.D;
            var10000[var2] &= 65535;
            var10000 = c.D;
            var10000[var2] |= (short)var7 << 16 & -65536;
         }
      }

   }

   public static final void b(int var0) {
      int[] var1 = c.q[var0];
      int[] var2 = c.a[var1[11]];
      int var3;
      if ((short)(var1[12] & '\uffff') > 0) {
         for(var3 = 0; var3 < 2; ++var3) {
            int var4 = c.a(c.i);
            if (var1[14 + var3] >= 0) {
               a(var1[14 + var3], (var1[13] & 1 << 10 + var3) != 0, c.i[var4]);
            } else if (var2[23 + var3] >= 0 && var1[14 + var3] != -2) {
               if (!a(var0, var2[23 + var3], (var1[13] & 1 << 10 + var3) != 0, var4)) {
                  var4 = -1;
               }
            } else {
               var4 = -1;
            }

            if (var4 >= 0 && (c.e[c.i[var4][4]][15] == 2 || c.e[c.i[var4][4]][15] == 3)) {
               var1[28] = 20;
            }

            var1[14 + var3] = var4;
         }

         if (var2[26] >= 0) {
            var3 = c.a(c.n);
            a(var2[26], (var1[13] & 4096) != 0, c.n[var3]);
            var1[16] = var3;
         }
      }

      for(var3 = 0; var3 < 2; ++var3) {
         int var6;
         if (var1[17 + var3] >= 0) {
            short var10 = (short)(var1[17 + var3] & '\uffff');
            short var8 = (short)((var1[17 + var3] & -65536) >> 16);
            if (var10 == 3) {
               a(var0, 17 + var3, var8);
            } else if (var10 == 2) {
               a(var0, 17 + var3, var8, 1);
            } else if (var10 == 5) {
               var6 = c.a(c.d);
               c.d[var6][4] = var8;
               var1[17 + var3] &= 65535;
               var1[17 + var3] |= (short)var6 << 16 & -65536;
            }
         } else if ((short)(var1[12] & '\uffff') > 0 && var1[17 + var3] != -2) {
            if (var2[21 + var3] >= 0) {
               a(var0, 17 + var3, var2[21 + var3], 1);
            } else if (var2[21 + var3] == -2) {
               boolean var9 = (var2[13] & 1024) != 0;
               boolean var5;
               if ((var5 = (var2[13] & 512) != 0) && var9) {
                  if ((var6 = HG.e(100)) >= 70) {
                     a(var0, 17 + var3, HG.e(c.h.length - 1));
                  } else if (var6 >= 40) {
                     a(var0, 17 + var3, HG.b(3, c.r.length - 1), 1);
                  } else {
                     var1[17 + var3] = -1;
                  }
               } else if (var5) {
                  a(var0, 17 + var3, HG.b(3, c.r.length - 1), 1);
               } else if (var9) {
                  var6 = 0;

                  for(int var7 = c.h.length - 1; var7 >= 0; --var7) {
                     if ((c.h[var7][3] & 1) == 0) {
                        var6 = var7;
                        break;
                     }
                  }

                  a(var0, 17 + var3, HG.e(var6));
               }
            }
         }
      }

      if (c.q[var0][19] > 0 && (short)(var1[12] & '\uffff') > 0) {
         c.q[var0][19] = a(var0, 19, 0, c.q[var0][19]);
      }

   }

   public static final int a(int var0, int var1, int var2, int var3) {
      int var4 = c.a(c.l);
      c.l[var4][4] = var2;
      c.l[var4][6] = var3;
      int[] var10000 = c.q[var0];
      var10000[var1] &= 65535;
      var10000 = c.q[var0];
      var10000[var1] |= (short)var4 << 16 & -65536;
      var10000 = c.q[var0];
      var10000[var1] &= -65536;
      var10000 = c.q[var0];
      var10000[var1] |= 2;
      return var4;
   }

   public static final void a(int var0, int var1, int var2) {
      int var3 = c.a(c.y);
      c.y[var3][4] = var2;
      c.y[var3][6] = -1;
      c.y[var3][7] = -1;
      int[] var10000 = c.q[var0];
      var10000[var1] &= 65535;
      var10000 = c.q[var0];
      var10000[var1] |= (short)var3 << 16 & -65536;
      if (HG.e(100) <= c.a[c.q[var0][11]][25]) {
         c(c.y[var3]);
      }

   }

   public static final void a(int var0, boolean var1, int[] var2) {
      var2[4] = var0;
      var2[6] = -1;
      var2[7] = -1;
      if ((var2[3] & 64) != 0 || (var2[3] & 128) != 0) {
         var2[8] = c.a(var2)[10];
      }

      if (var1) {
         c(var2);
      }

   }

   public static final boolean a(int var0, int var1, boolean var2, int var3) {
      if (var1 < 0) {
         return false;
      } else {
         int var4 = 0;

         int var5;
         for(var5 = 0; var5 < c.e.length; ++var5) {
            boolean var6 = false;
            if ((c.e[var5][3] & 1) != 0) {
               var6 = false;
            } else if ((short)(c.e[var5][10] & '\uffff') == 0) {
               var6 = c.a[c.q[var0][11]][7] >= (short)((c.e[var5][10] & -65536) >> 16);
            } else if ((short)(c.e[var5][10] & '\uffff') == 1) {
               var6 = c.a[c.q[var0][11]][8] >= (short)((c.e[var5][10] & -65536) >> 16);
            }

            if (c.e[var5][15] == var1 && var6) {
               ++var4;
            }
         }

         if (var4 > 0) {
            var5 = HG.b(1, var4);
            var4 = 1;

            for(int var8 = 0; var8 < c.e.length; ++var8) {
               boolean var7 = false;
               if ((c.e[var8][3] & 1) != 0) {
                  var7 = false;
               } else if ((short)(c.e[var8][10] & '\uffff') == 0) {
                  var7 = c.a[c.q[var0][11]][7] >= (short)((c.e[var8][10] & -65536) >> 16);
               } else if ((short)(c.e[var8][10] & '\uffff') == 1) {
                  var7 = c.a[c.q[var0][11]][8] >= (short)((c.e[var8][10] & -65536) >> 16);
               }

               if (c.e[var8][15] == var1 && var7) {
                  if (var4 == var5) {
                     c.i[var3][4] = var8;
                     c.i[var3][6] = -1;
                     c.i[var3][7] = -1;
                     c.i[var3][8] = c.e[var8][10];
                     if (var2) {
                        c(c.i[var3]);
                     }
                  }

                  ++var4;
               }
            }

            return true;
         } else {
            return false;
         }
      }
   }

   public static final int b(int[] var0, int var1, int var2, int var3, int var4) {
      int var5 = 0;
      int var6 = var1;
      if (var1 > 10) {
         var6 = 10;
      } else if (var1 <= 0) {
         return 0;
      }

      int var7;
      for(var7 = 0; var7 < c.g.length; ++var7) {
         if ((c.g[var7][4] & 1 << var3) != 0 && c.g[var7][1] == var2) {
            ++var5;
         }
      }

      if (var5 > 0) {
         var5 = HG.b(1, var5);
         var7 = 0;

         for(int var8 = 0; var8 < c.g.length; ++var8) {
            if ((c.g[var8][4] & 1 << var3) != 0 && c.g[var8][1] == var2) {
               ++var7;
               if (var7 == var5) {
                  int var9 = HG.b(1, var6) * c.g[var8][2];
                  var0[var4] = (short)var9 & '\uffff' | (short)var8 << 16 & -65536;
                  return var1 - var9;
               }
            }
         }
      }

      return 0;
   }

   public static final void c(int[] var0) {
      int var1;
      if ((var1 = c.O[18]) < 5) {
         var1 = 5;
      }

      Object var2 = null;
      byte var3 = 0;
      if ((var0[3] & 64) != 0) {
         var3 = 0;
      } else if ((var0[3] & 128) != 0) {
         var3 = 1;
      } else if ((var0[3] & 8192) != 0) {
         var3 = 2;
      }

      int var4;
      if ((var4 = HG.b(0, 100)) < 50) {
         b(var0, var1, 1, var3, 6);
      } else if (var4 < 75) {
         b(var0, var1, 0, var3, 7);
      } else {
         var1 = b(var0, var1, 1, var3, 6);
         b(var0, var1, 0, var3, 7);
      }

      var0[3] |= 131072;
   }

   public static final String a(int[] var0) {
      int[] var1;
      if ((var1 = c.a(var0)) == null) {
         return null;
      } else {
         String var2 = HG.a(var1[0]);
         if ((var0[3] & 131072) != 0) {
            if (var0[7] >= 0) {
               var2 = HG.a(c.g[(short)((var0[7] & -65536) >> 16)][0]) + " " + var2;
            }

            if (var0[6] >= 0) {
               var2 = var2 + " " + HG.a(c.g[(short)((var0[6] & -65536) >> 16)][0]);
            }
         }

         return var2;
      }
   }

   public static final int a(int[] var0) {
      int var2 = c.a(var0)[4];
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
