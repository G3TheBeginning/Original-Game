import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.Stack;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreNotFoundException;

public class HG extends MIDlet implements CommandListener, PlayerListener {
   public static char[] a = new char[]{'\n', ' ', ',', '?', '-', ':', ';', '/', '.', '!'};
   public static final Random b = new Random();
   public static String c;
   static boolean d = false;
   static int e = 2;
   static int f = -1;
   static int g = 0;
   static ByteArrayOutputStream h;
   static DataOutputStream i;
   static ByteArrayInputStream j;
   static DataInputStream k;
   static String[] l = new String[]{"MAIN", "DIALOGUE_INITRIA", "DIALOGUE_KHORINIS", "DIALOGUE_MISC", "QUESTS"};
   static byte[] m = new byte[]{1, 2, 2, 2, 2};
   static boolean[] n;
   static String[][] o;
   static byte[] p;
   static byte q;
   static String r;
   static String[][] s;
   static String t;
   public static int[][] u;
   public static Object[] v;
   public static int[][] w;
   public static byte[] x;
   public static int[] y;
   public static long[] z;
   public static short aa;
   public static short ba;
   public static final String[] ca;
   public static final String[] da;
   public static int ea;
   public static D fa;
   static int ga;
   public static int ha;
   static boolean ia;
   static int ja;
   static boolean ka;
   public static String la;
   public static boolean ma;
   public static int na;
   public static Vector oa;
   public static Vector pa;
   public static int qa;
   public static int[] ra;
   static int[] sa;
   static int ta;
   static int ua;
   static int va;
   static int wa;
   static int xa;
   static int ya;
   static int za;
   static int aA;
   static int bA;
   static int cA;
   static int dA;
   static int eA;
   static int fA;
   static boolean gA;
   static short[][] hA;
   static boolean iA;
   static short jA;
   static int kA;
   static Stack lA;
   static String[] mA;
   static String[][] nA;
   static int oA;
   static int pA;
   static byte[] qA;
   static int rA;
   static int sA;
   static int tA;
   static int uA;
   static int vA;
   static int wA;
   static boolean xA;
   static boolean yA;
   static boolean zA;
   static int ab;
   static int bb;
   static int cb;
   private static byte[] db;
   static A eb;
   static HG fb;

   public static DataInputStream A(String var0) throws NullPointerException {
      DataInputStream var1 = null;

      try {
         InputStream var3 = fb.getClass().getResourceAsStream(var0);
         if (var3 != null) {
            var1 = new DataInputStream(var3);
         }
      } catch (Exception var2) {
      }

      if (var1 == null) {
         throw new NullPointerException();
      } else {
         return var1;
      }
   }

   public static String[] A(String var0, Font var1, int var2, int var3) {
      var0.length();
      int var11 = 0;
      int var10 = 0;
      String var9 = "";
      String var8 = "";
      if (var3 > 0) {
         var2 -= var3 * var1.charWidth(' ');
      }

      while(var0.length() > 0) {
         int var4 = var0.length();

         int var5;
         int var6;
         for(var6 = 0; var6 < a.length; ++var6) {
            var5 = var0.indexOf(a[var6]);
            if (var5 < var4 && var5 != -1) {
               var4 = var5;
            }
         }

         String var7;
         if (var4 == var0.length()) {
            var7 = var0.substring(0, var4);
            var0 = "";
         } else {
            var7 = var0.substring(0, var4 + 1);
            var0 = var0.substring(var4 + 1, var0.length());
         }

         if (var7.length() <= 1) {
            var6 = var1.charsWidth(var7.toCharArray(), 0, var7.length());
         } else {
            var6 = var1.charsWidth(var7.trim().toCharArray(), 0, var7.trim().length());
         }

         var5 = 0;
         if (var7.trim().length() != var7.length()) {
            var5 = var1.charWidth(' ');
         }

         if (var11 + var6 < var2 && var9.indexOf(10) == -1) {
            var9 = var9 + var7;
            var11 += var6 + var5;
         } else {
            var4 = 0;
            if (var6 > var2) {
               label163:
               while(true) {
                  while(true) {
                     if (var4 >= var7.length()) {
                        break label163;
                     }

                     if (var11 + var1.charWidth(var7.charAt(var4)) >= var2) {
                        if (var4 > 1) {
                           var9 = var9 + var7.substring(0, var4 - 1);
                           var7 = var7.substring(var4 - 1, var7.length());
                           var6 = var1.charsWidth(var7.trim().toCharArray(), 0, var7.trim().length());
                        }

                        if (var6 < var2) {
                           if (var9.indexOf(10) == 0) {
                              ++var10;
                           }

                           var8 = var8 + var9;
                           if (var9.indexOf(10) == -1 || var9.indexOf(10) == 0) {
                              var8 = var8 + '\n';
                           }

                           var9 = var7;
                           var11 = var6 + var5;
                           ++var10;
                           break label163;
                        }

                        if (var9.indexOf(10) == 0) {
                           ++var10;
                        }

                        var8 = var8 + var9;
                        if (var9.indexOf("\n") == -1 || var9.indexOf(10) == 0) {
                           var8 = var8 + '\n';
                        }

                        var9 = "";
                        ++var10;
                        var11 = 0;
                        var4 = 0;
                     } else {
                        var11 += var1.charWidth(var7.charAt(var4));
                        ++var4;
                     }
                  }
               }
            } else {
               if (var9.length() > 0) {
                  if (var9.indexOf(10) == -1 && var7.indexOf(10) != 0) {
                     var9 = var9 + '\n';
                  }

                  var8 = var8 + var9;
                  if (var7.indexOf(10) != 0 || var0.indexOf(10) == 0 && var7.indexOf(10) == 0 || var9.indexOf(10) != -1) {
                     if (var7.indexOf(10) != -1 && var9.indexOf(10) == -1) {
                        --var10;
                     }

                     ++var10;
                  }
               }

               var9 = var7;
               var11 = var6 + var5;
            }
         }

         if (var0.length() == 0 && var7.length() > 0) {
            var8 = var8 + var9;
         }
      }

      String[] var15 = new String[var10 + 1];
      String var14 = "";
      if (var3 > 0) {
         for(int var13 = 0; var13 < var3; ++var13) {
            var14 = var14 + ' ';
         }
      }

      var2 = 0;

      int var12;
      for(var12 = 0; var2 != -1 && var10 + 1 != var12; ++var12) {
         var2 = var8.indexOf("\n");
         if (var2 == -1) {
            var0 = var8.substring(0, var8.length());
         } else {
            var0 = var8.substring(0, var2);
         }

         var15[var12] = var0.trim();
         if (var3 > 0) {
            var15[var12] = var14 + var15[var12];
         }

         if (var2 >= var8.length() || var2 == -1) {
            var8 = "";
            break;
         }

         var8 = var8.substring(var2 + 1, var8.length());
      }

      if (var10 > 0 && var8.length() > 0) {
         if (var3 > 0) {
            var15[var12] = var14 + var8;
         } else {
            var15[var12] = var8;
         }
      }

      return var15;
   }

   public static final int A(int var0, int var1) {
      if (var1 == var0) {
         return var0;
      } else {
         if (var1 < var0) {
            int var2 = var0;
            var0 = var1;
            var1 = var2;
         }

         var1 = var1 - var0 + 1;
         return var0 + (b.nextInt() & Integer.MAX_VALUE) % var1;
      }
   }

   public static final int A(int var0) {
      return var0 <= 0 ? 0 : (b.nextInt() & Integer.MAX_VALUE) % var0;
   }

   public static final int A() {
      return b.nextInt() & Integer.MAX_VALUE;
   }

   public static void B() {
      InputStream var3 = null;
      c = null;

      int var12;
      try {
         var3 = fb.getClass().getResourceAsStream("/mi");
         byte[] var0 = new byte[2];
         var3.read(var0, 0, 2);
         int var2 = (var0[0] & 255) << 8 | var0[1] & 255;
         if (var2 > 0) {
            byte[] var1 = new byte[var2];
            var12 = var3.read(var1, 0, var2);
            if (var12 == var2) {
               c = new String(var1);
            }
         }
      } catch (Exception var10) {
      } finally {
         try {
            var3.close();
         } catch (Exception var9) {
         }

      }

      if (c != null) {
         var12 = D(0, 383);
         if (var12 == -1) {
            var12 = hA[0].length / 4 - 1;
         }

         A(0, var12 + 1, 388, 5, 101, -1);
      }

   }

   public static boolean C() {
      boolean var1 = false;
      if (c != null) {
         try {
            var1 = fb.platformRequest(c);
         } catch (Exception var2) {
         }
      }

      return var1;
   }

   void D() {
      Display var1 = Display.getDisplay(this);
      e = var1.numAlphaLevels();
      if (e > 2) {
         d = true;
      } else {
         d = false;
      }

   }

   public static int[] E() {
      int[] var2 = null;

      try {
         DataInputStream var1 = new DataInputStream(A("c"));
         f = var1.readInt();
         var2 = new int[f];

         for(int var0 = 0; var0 < f; ++var0) {
            var2[var0] = var1.readInt();
         }
      } catch (Exception var3) {
      }

      return var2;
   }

   public static Font[] F() {
      Font[] var7 = new Font[3];

      int var0;
      for(var0 = 0; var0 < 3; ++var0) {
         var7[var0] = Font.getDefaultFont();
      }

      try {
         DataInputStream var6 = new DataInputStream(A("f"));
         short var5 = var6.readShort();

         for(int var4 = 0; var4 < var5; ++var4) {
            short var3 = var6.readShort();
            byte var2 = 0;
            byte var1 = 0;
            var0 = 0;
            if ((var3 >> 0 & 1) == 1) {
               var2 = 32;
            } else if ((var3 >> 2 & 1) == 1) {
               var2 = 64;
            }

            if ((var3 >> 4 & 1) == 1) {
               var1 = 8;
            } else if ((var3 >> 5 & 1) == 1) {
               var1 = 16;
            }

            if ((var3 >> 6 & 1) == 1) {
               var0 = 1;
            }

            if ((var3 >> 7 & 1) == 1) {
               var0 |= 2;
            }

            if ((var3 >> 8 & 1) == 1) {
               var0 |= 4;
            }

            var7[var4] = Font.getFont(var2, var0, var1);
         }
      } catch (Exception var8) {
      }

      return var7;
   }

   public static final int[] G() throws IOException {
      short var0 = k.readShort();
      int[] var1 = new int[var0];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = k.readInt();
      }

      return var1;
   }

   public static final void A(int[] var0) throws IOException {
      i.writeShort(var0.length);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         i.writeInt(var0[var1]);
      }

   }

   public static final boolean B(int var0) {
      RecordStore var1;
      try {
         var1 = RecordStore.openRecordStore("RECSTR" + var0, false);
      } catch (Exception var3) {
         return false;
      }

      if (var1 != null) {
         try {
            var1.closeRecordStore();
         } catch (Exception var2) {
         }
      }

      return true;
   }

   public static final void C(int var0) {
      if (B(var0)) {
         try {
            RecordStore var1 = RecordStore.openRecordStore("RECSTR" + var0, false);
            if (var1.getNumRecords() == 1) {
               var1.deleteRecord(1);
            }

            var1.closeRecordStore();
            RecordStore.deleteRecordStore("RECSTR" + var0);
         } catch (Exception var2) {
         }

      }
   }

   public static final byte[] D(int var0) {
      g = -1;
      RecordStore var1 = null;

      byte[] var4;
      try {
         var1 = RecordStore.openRecordStore("RECSTR" + var0, false);
         var4 = var1.getRecord(1);
         g = 0;
      } catch (Exception var3) {
         var4 = null;
         g = -1;
      }

      if (var1 != null) {
         try {
            var1.closeRecordStore();
         } catch (Exception var2) {
         }
      }

      return var4;
   }

   public static final int A(int var0, byte[] var1) {
      g = 0;
      RecordStore var3 = null;
      boolean var2 = false;

      try {
         var3 = RecordStore.openRecordStore("RECSTR" + var0, true);
         if (var3.getNumRecords() < 1) {
            var3.addRecord(var1, 0, 1);
            var2 = true;
         }

         if (var3.getSizeAvailable() < var1.length * 2) {
            g = -2;
         } else {
            var3.setRecord(1, var1, 0, var1.length);
            var2 = false;
         }
      } catch (RecordStoreNotFoundException var5) {
         g = -2;
      } catch (Exception var6) {
         g = -1;
      }

      if (var3 != null) {
         try {
            var3.closeRecordStore();
            if (var2) {
               C(var0);
            }
         } catch (Exception var4) {
         }
      }

      return g;
   }

   public static void H() {
      if (h == null) {
         h = new ByteArrayOutputStream();
      } else {
         h.reset();
      }

      if (i == null) {
         i = new DataOutputStream(h);
      }

   }

   public static void E(int var0) {
      if (h != null) {
         byte[] var2 = h.toByteArray();
         int var1 = var2.length;
         if (var1 > 0) {
            A(var0, var2);
         }
      }

   }

   public static void F(int var0) {
      H();
      byte[] var1 = D(var0);
      if (var1 != null) {
         j = new ByteArrayInputStream(var1);
         k = new DataInputStream(j);
      }

   }

   public static int I() {
      InputStream var3;
      try {
         var3 = fb.getClass().getResourceAsStream("/ldf");
      } catch (Exception var11) {
         return -1;
      }

      if (var3 == null) {
         return -1;
      } else {
         try {
            var3.read();
            q = (byte)var3.read();
            byte var0 = (byte)var3.read();
            byte[] var14 = new byte[var0];
            var3.read(var14);
            r = new String(var14);
            if (q == 3) {
               byte var2 = (byte)var3.read();
               s = new String[var2][2];

               for(int var1 = 0; var1 < var2; ++var1) {
                  var0 = (byte)var3.read();
                  var14 = new byte[var0];
                  var3.read(var14);
                  s[var1][0] = new String(var14);
                  var0 = (byte)var3.read();
                  var14 = new byte[var0];
                  var3.read(var14);
                  s[var1][1] = new String(var14);
               }
            }

            return 0;
         } catch (Exception var12) {
         } finally {
            try {
               var3.close();
            } catch (Exception var10) {
               return -1;
            }
         }

         return -1;
      }
   }

   public static int B(String var0) {
      int var3 = 0;
      switch(q) {
      case 0:
         var3 = -1;
         break;
      case 1:
         t = r;
         break;
      case 2:
         t = var0;
         break;
      case 3:
         int var2 = 0;

         for(boolean var1 = true; var2 < s.length && var1; ++var2) {
            if (s[var2][0].compareTo(var0) == 0) {
               t = s[var2][1];
               var1 = false;
            }
         }
      }

      if (var3 != -1) {
         var3 = J();
      }

      return var3;
   }

   public static int J() {
      byte var1 = 0;

      for(int var0 = 0; var0 < l.length; ++var0) {
         if (o[var0] == null) {
            if ((m[var0] == 1 || m[var0] != 0 && n[var0]) && G(var0) == -1) {
               var1 = -1;
               break;
            }
         } else if (m[var0] != 1 && !n[var0]) {
            o[var0] = null;
         }
      }

      return var1;
   }

   public static int G(int var0) {
      InputStream var3 = null;

      try {
         if (t == null) {
            t = r;
         }

         String var1 = "/" + t + "." + l[var0] + "." + "lng";
         var3 = fb.getClass().getResourceAsStream(var1);
         if (var3 == null) {
            return -1;
         }

         byte[] var15 = new byte[2];
         var3.read(var15, 0, 2);
         int var2 = ((var15[1] & 255) << 8 | var15[0] & 255) - 2;
         if (var2 < 0) {
            return -1;
         }

         var15 = new byte[var2];
         if (var3.read(var15, 0, var2) == var2) {
            var2 = (var15[2] & 255) << 8 | var15[1] & 255;
            p = var15;
            o[var0] = new String[var2];

            for(int var16 = 0; var16 < var2; ++var16) {
               o[var0][var16] = H(var16);
            }

            return 0;
         }

         o[var0] = new String[0];
      } catch (Exception var13) {
         return 0;
      } finally {
         try {
            var3.close();
         } catch (Exception var12) {
         }

         p = null;
      }

      return -1;
   }

   public static String H(int var0) {
      String var1 = "";
      if (q == 0) {
         return "null_3";
      } else {
         ++var0;
         var0 *= 2;
         if (var0 >= 0 && var0 < p.length) {
            int var2 = (p[var0 + 4] & 255) << 8 | p[var0 + 3] & 255;
            var0 = (p[var0 + 2] & 255) << 8 | p[var0 + 1] & 255;
            if (var0 >= p.length) {
               return "";
            } else {
               byte[] var6 = new byte[var2 - var0];
               System.arraycopy(p, var0, var6, 0, var6.length);
               switch(p[0]) {
               case 0:
                  var1 = (new String(var6, 0, var6.length)).replace('\r', '\n');
                  break;
               case 1:
                  StringBuffer var5 = new StringBuffer(var6.length / 2);

                  for(var0 = 0; var0 < var6.length - 1; var0 += 2) {
                     var5.append((char)((var6[var0 + 1] & 255) << 8 | var6[var0] & 255));
                  }

                  var1 = var5.toString().replace('\r', '\n');
                  break;
               case 2:
                  byte[] var4 = new byte[var6.length + 2];
                  var4[0] = (byte)(var6.length >>> 8);
                  var4[1] = (byte)var6.length;
                  System.arraycopy(var6, 0, var4, 2, var6.length);

                  try {
                     var1 = (new DataInputStream(new ByteArrayInputStream(var4))).readUTF().replace('\r', '\n');
                  } catch (Exception var3) {
                  }
               }

               return var1;
            }
         } else {
            return "";
         }
      }
   }

   public static String I(int var0) {
      String var3 = "";
      int var2 = var0 & '\uffff';
      int var1 = (var0 & 16711680) >> 16;
      if (o != null && var1 >= 0 && var1 < o.length) {
         if (o[var1] == null) {
            if (m[var1] == 4) {
               G(var1);
               if (o[var1] != null) {
                  var3 = I(var0);
               }
            }
         } else if (var2 >= 0 && var2 < o[var1].length && o[var1][var2] != null) {
            var3 = o[var1][var2];
         }
      }

      return var3;
   }

   public static void J(int var0) {
      if (var0 >= 0) {
         int var5 = u[var0][0];
         int var4 = u[var0][1];
         int var2 = u[var0][2];
         boolean var3 = true;
         if (w[var0][1] != -1) {
            var3 = false;
         }

         int var1;
         if (var3) {
            for(var1 = 0; var1 < ea; ++var1) {
               if (w[var1][1] == var4) {
                  var3 = false;
                  w[var0][0] = var5;
                  w[var0][1] = w[var1][1];
                  w[var0][2] = var1;
                  break;
               }
            }
         }

         if (var3) {
            String var12 = "";
            if (var4 < 10) {
               var12 = "0";
            }

            var12 = "/" + var12 + var4 + ca[var2];
            String var13 = da[var2];
            InputStream var15 = null;

            try {
               var15 = fb.getClass().getResourceAsStream(var12);
            } catch (Exception var11) {
            }

            try {
               var15.available();
               v[var0] = Manager.createPlayer(var15, var13);
            } catch (Exception var10) {
            }

            Player var14 = (Player)v[var0];

            try {
               var14.realize();
            } catch (Exception var9) {
            }

            try {
               var14.prefetch();
            } catch (Exception var8) {
            }

            try {
               var14.addPlayerListener(fb);
            } catch (Exception var7) {
            }

            v[var0] = var14;
            w[var0][0] = var5;
            w[var0][2] = var0;
            w[var0][1] = var4;

            try {
               var15.close();
            } catch (Exception var6) {
            }
         }

         if (v[w[var0][2]] == null) {
            for(var1 = 0; var1 < ea; ++var1) {
               if (w[var1][1] == w[var0][1]) {
                  w[var1][2] = -1;
                  w[var1][1] = -1;
                  w[var1][0] = -1;
               }
            }

            ++ga;
            if (ga <= 2) {
               J(var0);
            }
         }
      }

   }

   public static void K(int var0) {
      Player var5 = null;
      int var4 = R(var0);
      int var3 = Integer.MIN_VALUE;
      if (var4 >= 0) {
         int var1;
         int var2;
         for(var2 = 0; var2 < ea; ++var2) {
            if (x[var2] == 0) {
               var1 = u[var2][3];
               if (var3 < var1) {
                  var3 = var1;
               }
            }
         }

         boolean var10 = false;
         if (var4 >= 0) {
            var1 = u[var4][3];
            var10 = var1 > var3;
         }

         if (var10) {
            N(var0);
            var2 = w[var4][2];

            for(var10 = false; !var10 && ha < 3; ++ha) {
               if (var2 < 0) {
                  J(var4);
                  var2 = w[var4][2];
               }

               if (var2 >= 0 && v[var2] != null) {
                  var5 = (Player)v[var2];
                  var10 = var5.getState() == 300;
                  if (!var10) {
                     L();
                  }
               }
            }

            ha = 0;
            if (var10) {
               try {
                  var0 = var5.getState();
                  if (var0 != 300 && var0 != 0) {
                     var5.prefetch();
                  }
               } catch (Exception var8) {
                  return;
               }

               try {
                  var5.setLoopCount(1);
                  var5.start();
                  x[var4] = 0;
               } catch (Exception var7) {
               }

               try {
                  VolumeControl var9 = (VolumeControl)var5.getControl("VolumeControl");
                  var1 = u[var4][4];
                  var10 = (var1 >> 5 & 1) == 1;
                  if (var10) {
                     var1 = 0 + 255 * ba / 125;
                     var9.setLevel(var1);
                  } else {
                     var1 = 0 + 255 * aa / 125;
                     var9.setLevel(var1);
                  }
               } catch (Exception var6) {
               }
            }
         }
      }

   }

   public static void L(int var0) {
      if (var0 >= 0) {
         int var2 = R(var0);
         var0 = w[var2][2];
         if (var0 >= 0) {
            Player var1 = (Player)v[var0];

            try {
               if (var1.getState() != 0) {
                  var1.stop();
               }
            } catch (Exception var3) {
            }

            x[var2] = 1;
            var0 = u[var2][4];
            boolean var5 = (var0 >> 1 & 1) != 1;
            if (var5) {
               try {
                  if (var1.getState() == 300) {
                     var1.deallocate();
                  }

                  if (var1.getState() == 200 || var1.getState() == 100) {
                     var1.close();
                  }
               } catch (Exception var4) {
               }

               v[var2] = null;
               w[var2][0] = -1;
               w[var2][1] = -1;
               w[var2][2] = -1;
               x[var2] = -1;
            }
         }
      }

   }

   public void playerUpdate(Player var1, String var2, Object var3) {
      if (!ka) {
         int var6 = -1;

         int var4;
         for(var4 = 0; var4 < ea; ++var4) {
            Player var8 = (Player)v[var4];
            if (var1 == var8) {
               var6 = var4;
               break;
            }
         }

         int var5 = -1;
         var4 = -1;

         for(int var9 = 0; var9 < ea; ++var9) {
            int var7 = w[var9][2];
            if (var6 == var7 && x[var9] == 0) {
               var5 = w[var9][0];
               var4 = R(var5);
               break;
            }
         }

         if (var4 >= 0) {
            if (var2 == "stopped") {
               O(var5);
            } else if (var2 == "endOfMedia") {
               O(var5);
               x[var4] = 2;
               P(var4);
            }
         }
      }

   }

   public static void K() {
      O();
      ea = u.length;
      if (v == null) {
         v = new Object[ea];
         w = new int[ea][4];
         x = new byte[ea];
         y = new int[ea];
         z = new long[ea];
      }

      int var0;
      for(var0 = 0; var0 < ea; ++var0) {
         w[var0][0] = -1;
         w[var0][1] = -1;
         w[var0][2] = -1;
         x[var0] = -1;
         y[var0] = -1;
         z[var0] = -1L;
         v[var0] = null;
      }

      System.gc();
      boolean var3 = false;

      for(int var2 = 0; var2 < ea; ++var2) {
         var0 = u[var2][4];
         boolean var1 = (var0 >> 2 & 1) == 1;
         boolean var4 = (var0 >> 0 & 1) == 1;
         var4 = var4 && v[var2] == null;
         if (var4) {
            J(var2);
         }

         if (var1) {
            var3 = true;
         }

         C.c = 25 * var2 / ea + 75;
      }

      if (var3 && fa == null) {
         fa = new D();
         fa.start();
      }

      ia = true;
   }

   public static void M(int var0) {
      if (var0 >= 0) {
         int var2 = R(var0);
         if (var2 >= 0) {
            int var1 = u[var2][4];
            if ((var1 >> 3 & 1) == 1 && !MA(1) && !MA(5) || (var1 >> 3 & 1) != 1 && !MA(2) && u[var2][1] != 0 && !MA(5) || MA(0)) {
               return;
            }

            boolean var7 = (var1 >> 2 & 1) == 1;
            int var6 = var0;
            if (u[var2][5] >= 0) {
               Vector var5 = new Vector(1, 1);
               int var4 = u[var2][5];

               for(int var3 = 0; var3 < ea; ++var3) {
                  if (u[var2][5] >= 0) {
                     var0 = u[var3][5];
                     if (var0 == var4) {
                        var5.addElement(new Integer(u[var3][0]));
                     }
                  }
               }

               var0 = var5.size();
               if (var0 > 1) {
                  var6 = (Integer)var5.elementAt(A(var0));
               }
            }

            if (var7) {
               if (!D.b) {
                  fa = new D();
                  fa.start();
               }

               D.A(var6);
            } else {
               Q(var6);
            }

            if (x[var2] != 0) {
               x[var2] = 4;
            }
         }
      }

   }

   public static void N(int var0) {
      int var1 = R(var0);
      if (var1 >= 0) {
         int var7 = u[var1][3];
         var1 = u[var1][4];
         boolean var6 = (var1 >> 3 & 1) == 1;

         for(int var5 = 0; var5 < ea; ++var5) {
            boolean var8 = u[var5][3] < var7;
            if (x[var5] != 0 && x[var5] != 4) {
               var8 = false;
            }

            if (x[var5] == 2) {
               var8 = true;
            }

            if (var8) {
               int var4 = w[var5][0];
               var1 = u[var5][4];
               boolean var3 = (var1 >> 3 & 1) == 1;
               boolean var2 = (var1 >> 4 & 1) == 1;
               var8 = false;
               if (var2) {
                  if (var3 && var6 || !var3 && !var6) {
                     var8 = true;
                  }
               } else {
                  var8 = true;
               }

               if (var8) {
                  B(var4, var0);
               }
            }
         }
      }

   }

   public static void B(int var0, int var1) {
      var1 = R(var0);
      if (var1 > 0) {
         x[var1] = 1;
         O(var0);
      }

   }

   public static void O(int var0) {
      if (var0 >= 0) {
         int var1 = R(var0);
         var1 = u[var1][4];
         boolean var2 = (var1 >> 2 & 1) == 1;
         if (!var2) {
            L(var0);
         } else {
            D.B(var0);
         }
      }

   }

   public static boolean P(int var0) {
      boolean var3 = false;
      int var6 = w[var0][0];
      if (var0 >= 0) {
         int var1 = u[var0][4];
         boolean var2 = (var1 >> 3 & 1) == 1;
         boolean var7 = x[var0] == 2;
         if (u[var0][6] > 0) {
            x[var0] = 2;
            M(u[var0][6]);
            return true;
         }

         if (var2 && var7) {
            int var5 = var6;
            if (u[var0][5] >= 0) {
               int var4 = u[var0][5];
               Vector var9 = new Vector(1, 1);

               for(int var8 = 0; var8 < ea; ++var8) {
                  if (u[var0][5] >= 0) {
                     var1 = u[var8][5];
                     if (var1 == var4 && var6 != u[var8][0]) {
                        var9.addElement(new Integer(u[var8][0]));
                     }
                  }
               }

               var1 = var9.size();
               if (var1 > 1) {
                  while(var5 == var6) {
                     var5 = (Integer)var9.elementAt(A(var1));
                  }
               }
            }

            if (var5 < 0) {
               var5 = u[var0][0];
            }

            x[var0] = 2;
            M(var5);
            var3 = true;
         }
      }

      return var3;
   }

   public static void L() {
      for(int var1 = 0; var1 < ea; ++var1) {
         int var0 = w[var1][0];
         O(var0);
      }

   }

   public static void Q(int var0) {
      if (!ka) {
         K(var0);
         R(ja);
      }

   }

   public static void M() {
      if (!ka) {
         System.currentTimeMillis();
      }

      ka = true;

      for(int var1 = 0; var1 < ea; ++var1) {
         if (x[var1] == 0 || x[var1] == 4) {
            int var0 = w[var1][0];
            y[var1] = var0;
            O(var0);
            x[var1] = 3;
         }
      }

   }

   public static void N() {
      ka = false;

      for(int var1 = 0; var1 < ea; ++var1) {
         if (x[var1] == 3) {
            int var0 = y[var1];
            M(var0);
         }
      }

   }

   public static int R(int var0) {
      int var2 = -1;

      int var1;
      for(var1 = 0; var1 < ea; ++var1) {
         if (w[var1][0] == var0) {
            var2 = var1;
            break;
         }
      }

      if (var2 == -1) {
         for(var1 = 0; var1 < ea; ++var1) {
            if (u[var1][0] == var0) {
               var2 = var1;
               break;
            }
         }
      }

      return var2;
   }

   public static int S(int var0) {
      int var1 = R(var0);
      byte var2 = -1;
      if (var1 >= 0) {
         var2 = x[var1];
      }

      return var2;
   }

   private static void O() {
      int var4 = 0;
      int[][] var3 = new int[][]{{0, 0, 0, 0, 0, -1, 1, 19814}, {1, 1, 0, 0, 8, -1, -1, 48410}, {2, 2, 0, 0, 8, -1, -1, 66031}, {3, 3, 0, 0, 8, -1, -1, 145382}, {4, 4, 0, 0, 8, -1, -1, 99005}, {5, 5, 0, 0, 8, -1, -1, 37399}, {6, 6, 0, 0, 8, -1, -1, 58859}, {7, 10, 0, 6, 0, -1, -1, 2116}, {8, 11, 0, 6, 0, -1, -1, 3749}, {9, 20, 1, 0, 0, -1, -1, 976}, {10, 21, 1, 0, 0, -1, -1, 644}, {11, 22, 1, 0, 0, -1, -1, 1044}, {12, 23, 1, 0, 0, -1, -1, 856}, {13, 24, 1, 0, 0, -1, -1, 3627}, {14, 25, 1, 0, 0, -1, -1, 1568}, {15, 26, 1, 0, 0, -1, -1, 1679}, {16, 27, 1, 0, 0, -1, -1, 1420}, {17, 28, 1, 0, 0, -1, -1, 3721}, {18, 30, 1, 0, 0, -1, -1, 655}, {19, 31, 1, 0, 0, -1, -1, 524}, {20, 32, 1, 0, 0, -1, -1, 987}, {21, 33, 1, 0, 0, -1, -1, 684}, {22, 34, 1, 1, 0, -1, -1, 939}, {23, 35, 1, 5, 0, -1, -1, 1449}, {24, 36, 1, 5, 0, -1, -1, 1239}, {25, 38, 1, 5, 0, -1, -1, 1547}, {26, 39, 1, 5, 0, -1, -1, 1117}, {27, 40, 1, 5, 0, -1, -1, 1428}, {28, 41, 1, 5, 0, -1, -1, 1801}, {29, 42, 1, 5, 0, -1, -1, 1652}, {30, 43, 1, 9, 0, -1, -1, 2176}, {31, 50, 1, 0, 0, -1, -1, 959}, {32, 51, 1, 0, 0, -1, -1, 864}, {33, 52, 1, 0, 0, -1, -1, 767}};
      int[] var2 = new int[var3.length];

      int var1;
      for(var1 = 0; var1 < var3.length; ++var1) {
         String var0;
         if (var3[var1][1] < 10) {
            var0 = "/0" + var3[var1][1] + ca[var3[var1][2]];
         } else {
            var0 = "/" + var3[var1][1] + ca[var3[var1][2]];
         }

         InputStream var5 = "".getClass().getResourceAsStream(var0);
         if (var5 == null) {
            var2[var1] = 0;
         } else {
            var2[var1] = 1;
            ++var4;
         }
      }

      u = new int[var4][8];
      var1 = 0;

      for(int var6 = 0; var6 < var3.length; ++var6) {
         if (var2[var6] == 1) {
            System.arraycopy(var3[var6], 0, u[var1], 0, var3[var6].length);
            ++var1;
         }
      }

   }

   static void A(String var0, String var1, boolean var2) {
      int var6 = xa - 16;
      Font var5 = A.j[2];
      String[] var4;
      if (var1.length() > 0) {
         var4 = A(var0 + " " + var1, var5, var6, 0);
      } else {
         var4 = A(var0, var5, var6, 0);
      }

      int var3 = var4.length;
      if (var4.length > 1) {
         var4 = A(var0, var5, var6, 0);

         for(int var7 = 0; var7 < var4.length; ++var7) {
            oa.addElement(var4[var7]);
            if (var7 < var3 - 1) {
               pa.addElement("");
            } else {
               pa.addElement(var1);
            }
         }

         if (var3 > var4.length) {
            oa.addElement("");
            pa.addElement(var1);
         }
      } else {
         oa.addElement(var0);
         pa.addElement(var1);
      }

      if (var2) {
         qa = pa.size() - 1;
      }

   }

   static String T(int var0) {
      String var1;
      if (var0 < 0) {
         var1 = " (" + var0 + ")";
      } else {
         var1 = " (+" + var0 + ")";
      }

      return var1;
   }

   static void U(int var0) {
      qa = -1;
      ma = true;
      oa.removeAllElements();
      pa.removeAllElements();
      la = I(51 + na);
      A.yb = 126;
      String var5;
      switch(na) {
      case 0:
         A(I(58), "" + A.ca[18], false);
         A(I(51), "" + A.ca[17], false);
         var0 = A.J(A.ca[18]);
         if (var0 >= 0) {
            A(I(66), "" + var0, false);
         } else {
            A(I(63), "", false);
         }

         A(I(57), "" + A.ca[19], false);
         break;
      case 1:
         var5 = T((short)((A.ca[12] & -65536) >> 16) - (short)(A.ca[54] & '\uffff'));
         A(I(55), (short)(A.ca[12] & '\uffff') + "/" + (short)((A.ca[12] & -65536) >> 16) + var5, false);
         var5 = T((short)((A.ca[13] & -65536) >> 16) - (short)((A.ca[54] & -65536) >> 16));
         A(I(61), (short)(A.ca[13] & '\uffff') + "/" + (short)((A.ca[13] & -65536) >> 16) + var5, false);
         var5 = T((short)(A.ca[14] & '\uffff') - (short)((A.ca[14] & -65536) >> 16));
         A(I(33), "" + (short)(A.ca[14] & '\uffff') + var5, false);
         var5 = T((short)(A.ca[15] & '\uffff') - (short)((A.ca[15] & -65536) >> 16));
         A(I(34), "" + (short)(A.ca[15] & '\uffff') + var5, false);
         break;
      case 2:
         int var4 = (short)(A.ca[20] & '\uffff') - (short)((A.ca[20] & -65536) >> 16);
         int var3 = (short)(A.ca[21] & '\uffff') - (short)((A.ca[21] & -65536) >> 16);
         int var2 = (short)(A.ca[22] & '\uffff') - (short)((A.ca[22] & -65536) >> 16);
         int var1 = (short)(A.ca[23] & '\uffff') - (short)((A.ca[23] & -65536) >> 16);
         var0 = A.Z(A.BA());
         switch(var0) {
         case 0:
            var4 += A.ca[51];
            break;
         case 1:
            var3 += A.ca[51];
            break;
         case 2:
            var2 += A.ca[51];
            break;
         case 3:
            var1 += A.ca[51];
         }

         var5 = T(var4);
         A(I(67), "" + (short)(A.ca[20] & '\uffff') + var5, false);
         var5 = T(var3);
         A(I(72), "" + (short)(A.ca[21] & '\uffff') + var5, false);
         var5 = T(var2);
         A(I(43), "" + (short)(A.ca[22] & '\uffff') + var5, false);
         var5 = T(var1);
         A(I(44), "" + (short)(A.ca[23] & '\uffff') + var5, false);
         var5 = T((short)(A.ca[25] & '\uffff') - (short)((A.ca[25] & -65536) >> 16));
         A(I(46), "" + (short)(A.ca[25] & '\uffff') + var5, false);
         break;
      case 3:
         A(I(68), "", false);
         A("  " + I(47), "" + A.ca[27], false);
         A("  " + I(70), "" + A.ca[28], false);
      }

   }

   static void A(int[] var0, int[] var1) {
      boolean var14 = true;
      if ((var0[3] & 64) != 0 || (var0[3] & 128) != 0) {
         var14 = A.D(var0);
         if (!var14) {
            A("\n" + I(292), "", false);
            A(I(64 + (short)(var1[10] & '\uffff')), "" + (short)((var1[10] & -65536) >> 16), true);
         }
      }

      int var4 = 0;

      int var2;
      for(var2 = 0; var2 < sa.length; ++var2) {
         sa[var2] = -1;
      }

      int var3;
      for(var3 = 0; var3 < 2; ++var3) {
         if (var0[6 + var3] != -1) {
            var2 = A.ra[(short)((var0[6 + var3] & -65536) >> 16)][3];
            sa[var3] = (short)var2 & '\uffff' | (short)(var0[6 + var3] & '\uffff') << 16 & -65536;
            ++var4;
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         if (var1[5 + var2] != -1) {
            sa[2 + var2] = var1[5 + var2];
            ++var4;
         }
      }

      if (var4 != 0) {
         A("\n" + I(60), "", false);

         for(var4 = 0; var4 < sa.length; ++var4) {
            if (sa[var4] != -1) {
               short var15 = (short)(sa[var4] & '\uffff');
               short var16 = (short)((sa[var4] & -65536) >> 16);
               if (var16 < 0) {
                  A(I(29 + var15), "" + var16, false);
               } else {
                  A(I(29 + var15), "+" + var16, false);
               }
            }
         }
      }

      int var5;
      if ((var0[3] & 64) != 0) {
         A.B(0, A.ca[42], false);
         A.B(var0, true);
         var3 = A.Z(var0);
         var2 = A.E(var3, A.ca);
         int var13 = A.F((short)(A.ca[14] & '\uffff'), A.E(var3, A.ca), A.W(var0));
         int var12 = A.G((short)(A.ca[14] & '\uffff'), A.E(var3, A.ca), A.W(var0));
         int var11 = A.Y(var0);
         int var10 = A.Q(var2, (short)(A.ca[15] & '\uffff'));
         int var9 = A.B(A.X(var0) + (short)(A.ca[26] & '\uffff'), (short)(A.ca[14] & '\uffff'), (short)(A.ca[15] & '\uffff'), var2);
         int var8 = A.V(var0) * 10 / 4096;
         A.B(var0, false);
         A.B(0, A.ca[42], true);
         var2 = A.Z(A.BA());
         var2 = A.E(var2, A.ca);
         int var7 = A.F((short)(A.ca[14] & '\uffff'), A.E(var3, A.ca), A.W(A.BA()));
         int var6 = A.G((short)(A.ca[14] & '\uffff'), A.E(var3, A.ca), A.W(A.BA()));
         var5 = A.Y(A.BA());
         var4 = A.Q(var2, (short)(A.ca[15] & '\uffff'));
         var3 = A.B(A.X(A.BA()) + (short)(A.ca[26] & '\uffff'), (short)(A.ca[14] & '\uffff'), (short)(A.ca[15] & '\uffff'), var2);
         var2 = A.V(A.BA()) * 10 / 4096;
         A("\n" + I(290), "" + var13 + T(var13 - var7), false);
         A(I(291), "" + var12 + T(var12 - var6), false);
         A(I(289), "" + var10 + T(var10 - var4), false);
         A(I(287), "" + var11 + T(var11 - var5), false);
         A(I(69), "" + var8 + T(var8 - var2), false);
         A(I(288), "" + var9 + T(var9 - var3), false);
         if (var14) {
            A("\n" + I(64 + (short)(var1[10] & '\uffff')), "" + (short)((var1[10] & -65536) >> 16), false);
         }
      }

      if ((var0[3] & 128) != 0) {
         A.B(1, A.ca[41], false);
         A.B(var0, true);
         var3 = A.ca[27];
         var2 = A.ca[28];
         A.B(var0, false);
         A.B(1, A.ca[41], true);
         var5 = A.ca[27];
         var4 = A.ca[28];
         A("\n" + I(68), "", false);
         A(I(47), "" + var3 + T(var3 - var5), false);
         A(I(70), "" + var2 + T(var2 - var4), false);
         if (var14) {
            A("\n" + I(64 + (short)(var1[10] & '\uffff')), "" + (short)((var1[10] & -65536) >> 16), false);
         }
      }

   }

   static void V(int var0) {
      oa.removeAllElements();
      pa.removeAllElements();
      la = B.F(ra);
      qa = -1;
      ma = false;
      int[] var1 = A.A(ra);
      if ((ra[3] & 64) != 0) {
         A(I(var1[15] + 73), "", false);
         A(I(252), "" + B.G(ra), false);
         A(ra, var1);
      } else if ((ra[3] & 128) != 0) {
         A(I(252), "" + B.G(ra), false);
         A(ra, var1);
      } else if ((ra[3] & 8192) != 0) {
         A(I(77 + var1[10]), "", false);
         A(I(252), "" + B.G(ra), false);
         A(ra, var1);
      } else if ((ra[3] & 256) != 0) {
         A(I(var1[0] + 1), "", false);
         if (var1[3] != 0) {
            if (var1[3] > 0) {
               A(I(29 + var1[6]), "+" + var1[3], false);
            } else {
               A(I(29 + var1[6]), "" + var1[3], false);
            }
         }

         A(I(252), "" + B.G(ra), false);
      } else if ((ra[3] & 1024) != 0) {
         A(I(var1[10]), "", false);
      } else if ((ra[3] & 512) != 0) {
         A(I(var1[3]), "", false);
      }

   }

   static int W(int var0) {
      int var7 = 0;
      int var6 = 4;
      fA |= 1;
      short[] var5 = hA[var0];
      int var1 = B.a[A.tb][3];
      int var4;
      if ((var1 & 32) == 0 && (var1 & 4096) == 0) {
         short var3 = (short)(B.a[A.tb][0] & '\uffff');
         short var10 = (short)((B.a[A.tb][0] & -65536) >> 16);

         for(var4 = B.u[var10][var3]; var4 >= 0 && (B.a[var4][3] & 10176) <= 0; var4 = (short)(B.a[var4][1] & '\uffff')) {
         }
      } else {
         int var2 = B.A(A.tb, (int[])null) + bA;
         var4 = (short)(A.hA[var2] & '\uffff');
      }

      boolean var11 = (var1 & 32) != 0 && (B.a[A.tb][13] & 2) == 0;
      boolean var8 = (var1 & 32) != 0 && (B.a[A.tb][13] & 2) != 0;
      A.yb = 126;
      if (var11) {
         ma = true;
         la = I(232 + bA);
         A.yb = 113;
      } else if (var8) {
         ma = false;
         la = B.F(B.a[A.tb]);
      } else {
         ma = false;
         la = I(221);
      }

      var1 = 0;

      for(int var13 = 0; var13 < 30; ++var13) {
         if (var4 < 0) {
            var5[var6 + 0] = -1;
            var5[var6 + 1] = -1;
            var5[var6 + 2] = 4;
            var5[var6 + 3] = -1;
            if (kA == var13 + 1) {
               kA = -1;
            }
         } else {
            int[] var12 = A.A(B.a[var4]);
            short var9 = (short)var4;
            if (((B.a[var4][3] & 64) != 0 || (B.a[var4][3] & 128) != 0) && !A.D(B.a[var4])) {
               var9 = (short)(var9 | '耀');
            }

            var5[var6 + 0] = (short)var12[0];
            var5[var6 + 1] = 21;
            var5[var6 + 2] = 105;
            var5[var6 + 3] = var9;

            for(var4 = (short)(B.a[var4][1] & '\uffff'); var4 >= 0 && (B.a[var4][3] & 10176) <= 0; var4 = (short)(B.a[var4][1] & '\uffff')) {
            }

            ++var7;
            var1 = var13 + 1;
            if (kA == -1) {
               kA = var13 + 1;
            }
         }

         var6 += 4;
      }

      hA[var0] = var5;
      if (var7 == 0 && (B.a[A.tb][3] & 4096) != 0) {
         la = I(228);
         ma = false;
      }

      if (var7 > 1) {
      }

      if (kA == -1) {
         kA = var1;
      }

      return var7;
   }

   static void P() {
      fA |= 2;
      short[] var6 = hA[19];
      int[][] var5 = A.da[za];
      int[][] var4 = (int[][])null;
      la = I(232 + za);
      ma = true;
      A.yb = 126;
      switch(za) {
      case 0:
         var4 = A.ha;
         break;
      case 1:
         var4 = A.ja;
         break;
      case 2:
         eb.Z();
         var4 = A.la;
         break;
      case 3:
         var4 = A.ta;
         break;
      case 4:
         var4 = A.va;
         break;
      case 5:
         var4 = A.oa;
      }

      int var3 = 4;
      int var0 = 0;
      int var2 = 0;

      for(int var1 = 0; var1 < var5.length; ++var1) {
         if (var5[var1][4] == -1) {
            var6[var3 + 0] = -1;
            var6[var3 + 1] = -1;
            var6[var3 + 2] = 4;
            var6[var3 + 3] = -1;
            if (kA == var1 + 1) {
               kA = -1;
            }
         } else {
            short var7 = (short)var1;
            if ((za == 0 || za == 1) && !A.D(var5[var1])) {
               var7 = (short)(var7 | '耀');
            }

            var6[var3 + 0] = (short)var4[var5[var1][4]][0];
            var6[var3 + 1] = 12;
            var6[var3 + 2] = 105;
            var6[var3 + 3] = var7;
            var0 = var1 + 1;
            ++var2;
            if (kA == -1) {
               kA = var1 + 1;
            }
         }

         var3 += 4;
      }

      var3 += 4;
      if ((fA & 1) != 0) {
         var6[var3 + 1] = 11;
      } else {
         var6[var3 + 1] = 6;
      }

      hA[19] = var6;
      if (kA == -1) {
         kA = var0;
      }

      if (var2 > 1) {
      }

   }

   static void X(int var0) {
      short[] var1 = hA[var0];
      la = B.F(ra);
      ma = false;
      if ((B.a[A.tb][3] & 32) != 0 && (B.a[A.tb][13] & 2) == 0) {
         var1[4] = 218;
         var1[7] = 45;
      } else {
         var1[4] = 250;
         var1[7] = 43;
      }

   }

   static void Y(int var0) {
      short[] var1 = hA[var0];
      la = B.F(ra);
      ma = false;
      byte var2 = 4;
      var1[4] = 217;
      var1[5] = 14;
      var1[6] = 109;
      var1[7] = 40;
      if ((za != 0 || aA != A.ca[42]) && (za != 1 || aA != A.ca[41]) && (za != 3 || aA != (short)(A.ca[43] & '\uffff') && aA != (short)((A.ca[43] & -65536) >> 16) && aA != A.ca[44]) && (za != 4 || aA != A.ca[45])) {
         if (za != 2 && za != 5) {
            var1[4] = 217;
         } else if (za == 2 || za == 5) {
            if (za != 5 && A.la[ra[4]][3] != 0) {
               var1[4] = 251;
            } else {
               var1[4] = -1;
               var1[5] = -1;
               var1[6] = 4;
               var1[7] = -1;
            }
         }
      } else {
         var1[4] = 222;
      }

      var0 = var2 + 4;
      var0 += 4;
      if (za != 5 && za != 4 && A.ca[11] != 0) {
         if ((fA & 1) != 0) {
            if ((B.a[A.tb][3] & 32) != 0 && (B.a[A.tb][13] & 2) == 0) {
               var1[12] = 248;
            } else {
               var1[12] = 223;
            }

            var1[13] = 22;
            var1[14] = 109;
            var1[15] = 44;
         } else {
            var1[12] = 226;
            var1[13] = 13;
            var1[14] = 109;
            var1[15] = 44;
         }
      } else {
         var1[12] = -1;
         var1[13] = -1;
         var1[14] = 4;
         var1[15] = -1;
      }

      var0 += 4;
      if (za != 1 && za != 5 && (fA & 1) == 0 && (za != 2 || A.la[ra[4]][3] != 0)) {
         var1[16] = 246;
         var1[17] = 15;
         var1[18] = 109;
         var1[19] = 47;
      } else {
         var1[16] = -1;
         var1[17] = -1;
         var1[18] = 4;
         var1[19] = -1;
      }

   }

   static void Z(int var0) {
      short[] var4 = hA[var0];
      la = I(244 + (dA - 1));
      A.yb = 126;
      ma = true;
      int var2 = 3;

      int var1;
      for(var1 = 0; var1 < A.ya.length; ++var1) {
         A.ya[var1][3] = -1;
         if ((short)(A.ya[var1][0] & '\uffff') == dA) {
            ++var2;
         }
      }

      if (var4.length != var2 * 4) {
         var4 = new short[var2 * 4];
      }

      byte var3 = 0;
      var4[0] = -1;
      var4[1] = -1;
      var4[2] = 6;
      var4[3] = 1;
      int var5 = var3 + 4;
      var2 = 1;

      for(var1 = 0; var1 < A.ya.length; ++var1) {
         if ((short)(A.ya[var1][0] & '\uffff') == dA && (short)((A.ya[var1][0] & -65536) >> 16) == 1) {
            var4[var5 + 0] = (short)A.ya[var1][1];
            var4[var5 + 1] = 28;
            var4[var5 + 2] = 109;
            var4[var5 + 3] = 37;
            var5 += 4;
            A.ya[var1][3] = var2++;
         }
      }

      for(var1 = 0; var1 < A.ya.length; ++var1) {
         if ((short)(A.ya[var1][0] & '\uffff') == dA && (short)((A.ya[var1][0] & -65536) >> 16) == 0) {
            var4[var5 + 0] = (short)A.ya[var1][1];
            var4[var5 + 1] = 28;
            var4[var5 + 2] = 109;
            var4[var5 + 3] = 37;
            var5 += 4;
            A.ya[var1][3] = var2++;
         }
      }

      var4[var5 + 0] = 136;
      var4[var5 + 1] = 11;
      var4[var5 + 2] = 3;
      var4[var5 + 3] = 1;
      var5 += 4;
      var4[var5 + 0] = 136;
      var4[var5 + 1] = 6;
      var4[var5 + 2] = 2;
      var4[var5 + 3] = 0;
      hA[var0] = var4;
   }

   static void AA(int var0) {
      la = I(A.ya[eA][1]);
      ma = false;
   }

   static void BA(int var0) {
      short[] var2 = hA[var0];
      byte var1 = 12;
      if (A.ca[11] != -1 && (short)(A.ca[12] & '\uffff') > 0) {
         var2[12] = 247;
         var2[13] = 37;
         var2[14] = 101;
         var2[15] = -1;
      } else {
         var2[12] = -1;
         var2[13] = -1;
         var2[14] = 4;
         var2[15] = -1;
      }

      int var3 = var1 + 4;
      A(var2, 16, (short)36, (short)38);
      hA[var0] = var2;
   }

   public static void A(short[] var0, int var1, short var2, short var3) {
      if (A.tE >= 0L && A.uE >= 0L) {
         if (A.tE > A.uE) {
            var0[var1 + 0] = 373;
            var0[var1 + 1] = var3;
         } else {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
         }

         var0[var1 + 2] = 101;
         var0[var1 + 3] = -1;
         var1 += 4;
         if (A.tE > A.uE) {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
         } else {
            var0[var1 + 0] = 373;
            var0[var1 + 1] = var3;
         }

         var0[var1 + 2] = 101;
         var0[var1 + 3] = -1;
      } else {
         if (A.uE >= 0L) {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
            var0[var1 + 2] = 101;
         } else if (A.tE >= 0L) {
            var0[var1 + 0] = 373;
            var0[var1 + 1] = var3;
            var0[var1 + 2] = 101;
         } else {
            var0[var1 + 0] = -1;
            var0[var1 + 1] = -1;
            var0[var1 + 2] = 4;
         }

         var0[var1 + 3] = -1;
         var1 += 4;
         var0[var1 + 0] = -1;
         var0[var1 + 1] = -1;
         var0[var1 + 2] = 4;
         var0[var1 + 3] = -1;
      }

   }

   public static void CA(int var0) {
      short[] var1 = hA[var0];
      A(var1, 4, (short)30, (short)39);
   }

   public static void A(Graphics var0, String var1) {
      var0.setColor(A.i[5]);
      A.A((String)var1, 2, 2, var0);
   }

   public static int A(Graphics var0, String var1, int var2, boolean var3, int var4) {
      int var9 = A.j[2].getHeight();
      int var8 = var9 + 5;
      if (var0 != null && var1 != null) {
         int var5 = A.cc[1717] / A.cc[1721];
         int var7 = 5 + va;
         int var6 = (var8 >> 1) - 1;
         var5 = var5 + 10 + 0;
         if (var3) {
            var0.setColor(A.i[10]);
            var0.fillRect(va, var2, xa, var9 + 2);
            var0.setColor(A.i[5]);
            A.A(1, va + var5, var2, xa - var5, var9, 281);
            A.A((String)var1, 1, 2, var0);
            A(var2, var8, kA);
         } else if (var2 > -var8 && var2 <= A.g) {
            var0.setColor(A.i[5]);
            A.A(0, va + var5, var2, xa - var5, var9, 281);
            A.A((String)var1, 0, 2, var0);
         }

         if (var2 > -var8 && var2 <= A.g) {
            var0.setClip(va, wa, xa, ya);
            A.B(var7, var2 + var6, 156, qA[var4], var0);
         }
      }

      return var8;
   }

   public static int A(Graphics var0, String var1, int var2, int var3, int var4, boolean var5) {
      if (var0 != null) {
         int var6 = A.f - (A.cc[1386] + A.cc[1529] + 2 * A.cc[1518]);
         var2 = A.cc[1650] / A.cc[1655];
         int var8 = A.cc[1651] / A.cc[1656];
         int var7 = (var6 - var2 * pA) / (pA + 1);
         var6 = var2 + var7;
         var2 = var6 * pA + var7;
         var2 = A.f - var2 >> 1;
         var4 = var2 + var4 * var6 + var7;
         var2 = A.g - (A.cc[1387] + A.cc[1607] - 7);
         var6 = A.g - (var8 + 5);
         if (var2 > var6) {
            var2 = var6;
         }

         var0.setClip(0, 0, A.f, A.g);
         A.B(var4, var2, 150, var3, var0);
         if (var5) {
            A.B(var4, var2, 150, 59, var0);
            A.nb = var1;
            A.H(var0);
         }
      }

      return 0;
   }

   public static int A(Graphics var0, String[] var1, int var2, int var3, int var4) {
      if (var1 == null) {
         return 0;
      } else {
         int var7 = A.j[2].getHeight();
         int var6 = var1.length;
         int var5 = var7 * var6;
         if (var0 != null) {
            int var8 = var2;
            var2 = va;
            if (jA > 17) {
               var8 += 5;
               var2 += 8;
            } else {
               var2 += 3;
            }

            if (var3 <= 0) {
               var0.setColor(A.i[5]);
            } else {
               var0.setColor(A.i[var3]);
            }

            var0.setFont(A.j[2]);

            for(var3 = 0; var3 < var6; ++var3) {
               if (var8 >= wa && var8 + var7 <= wa + ya) {
                  var0.drawString(var1[var3], var2 + 0, var8 + 0, 20);
               }

               var8 += var7;
            }
         }

         return jA > 17 ? var5 + var4 + 5 : var5 + var4;
      }
   }

   public static int A(Graphics var0, String[] var1, int var2) {
      int var4 = A.j[2].getHeight();
      int var3 = var1.length;
      if (var0 != null) {
         int var6 = var2;
         int var5 = A.f >> 1;
         var0.setColor(A.i[26]);
         var0.setFont(A.j[2]);

         for(var2 = 0; var2 < var3; ++var2) {
            if (var6 >= wa && var6 + var4 <= wa + ya) {
               var0.drawString(var1[var2], var5 + 0, var6 + 0, 17);
            }

            var6 += var4;
         }
      }

      return var4 * var3;
   }

   public static int A(Graphics var0, int var1) {
      int var3 = oa.size();
      int var2 = A.j[2].getHeight();
      if (var0 != null) {
         int var4 = var1 + 5;
         var0.setClip(va, wa, xa, ya - 2);
         var0.setFont(A.j[2]);

         for(var1 = 0; var1 < var3; ++var1) {
            if (var4 >= wa + 5 && var4 + var2 <= wa + ya) {
               var0.drawString((String)oa.elementAt(var1), va + 8 + 0, var4 + 0, 20);
               if (qa == var1) {
                  var0.setColor(A.i[16]);
               } else {
                  var0.setColor(A.i[5]);
               }

               var0.drawString((String)pa.elementAt(var1), va + xa - 8 + 0, var4 + 0, 24);
            }

            var4 += var2;
         }
      }

      return var2 * var3 + 5 + 10;
   }

   public static int A(Graphics var0, String var1, int var2, int var3, boolean var4) {
      int var8 = A.j[1].getHeight();
      int var7 = var8 + 5;
      if (var0 != null && var1 != null) {
         var0.setClip(va, wa + 1, xa, ya - 2);
         int var6 = A.cc[1650] / A.cc[1655];
         int var5 = A.cc[1651] / A.cc[1656];
         var5 = (var8 + 5 - var5 >> 1) + 1;
         var0.setFont(A.j[1]);
         if (var4) {
            var0.setColor(A.i[10]);
            var0.fillRect(va, var3, xa, var8 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(va, var3, xa - 1, var8 + 5);
            A.B(va + 3, var3 + var5, 150, var2, var0);
            A.A(1, va + 2 + var6 + 5, var3 + 1, xa - var6 - 5 - 6, var8 + 5, 409);
            A.A((String)var1, 1, 1, var0);
            A(var3, var7, kA);
         } else if (var3 > -var7 && var3 <= A.g) {
            var0.setColor(A.i[9]);
            var0.fillRect(va, var3, xa, var8 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(va, var3, xa - 1, var8 + 5);
            A.B(va + 3, var3 + var5, 150, var2, var0);
            A.A(0, va + 2 + var6 + 5, var3 + 1, xa - var6 - 5 - 6, var8 + 5, 281);
            A.A((String)var1, 0, 1, var0);
         }
      }

      return var7;
   }

   public static int A(Graphics var0, String var1, boolean var2, int var3, int var4) {
      int var7 = A.j[1].getHeight();
      int var6 = var7 + 5;
      if (var0 != null && var1 != null) {
         boolean var5 = (var4 & '耀') != 0;
         int var13 = var4 & 32767;
         int var12 = A.i[9];
         int var11 = A.i[10];
         int var10 = 0;
         int var9 = A.cc[1650] / A.cc[1655];
         int var8 = A.cc[1651] / A.cc[1656];
         if (jA == 19) {
            var1 = B.F(A.da[za][var13]);
            int[] var15 = A.A(A.da[za][var13]);
            var10 = var15[2];
            if (za == 0 && var13 == A.ca[42]) {
               var12 = A.i[11];
               var11 = A.i[12];
            } else if (za == 2 && A.da[za][var13][6] > 1) {
               var1 = A.da[za][var13][6] + "x " + var1;
            } else if (za == 1 && var13 == A.ca[41]) {
               var12 = A.i[11];
               var11 = A.i[12];
            } else if (za == 4 && var13 == A.ca[45]) {
               var12 = A.i[11];
               var11 = A.i[12];
            } else if (za == 3) {
               if (var15[10] == 1 && A.ca[44] == var13) {
                  var12 = A.i[11];
                  var11 = A.i[12];
               } else if (var15[10] == 0 && ((short)(A.ca[43] & '\uffff') == var13 || (short)((A.ca[43] & -65536) >> 16) == var13)) {
                  var12 = A.i[11];
                  var11 = A.i[12];
               }
            }
         } else if (jA == 21) {
            var1 = B.F(B.a[var13]);
            var10 = A.A(B.a[var13])[2];
            if ((B.a[var13][3] & 256) != 0 && B.a[var13][6] > 1) {
               var1 = B.a[var13][6] + "x " + var1;
            }
         }

         var0.setFont(A.j[1]);
         int var14;
         if (var2) {
            var0.setColor(var11);
            var0.fillRect(va, var3, xa, var7 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(va, var3, xa - 1, var7 + 5);
            var14 = (var7 + 5 - var8 >> 1) + 1;
            A.B(va + 3, var3 + var14, 150, var10, var0);
            A.A(1, va + 2 + var9 + 5, var3 + 1, xa - var9 - 5 - 4, var7 + 5, 409);
            if (var5) {
               var0.setColor(A.i[16]);
            }

            A.A((String)var1, 1, 1, var0);
            A(var3, var6, kA);
         } else if (var3 > -var6 && var3 <= A.g) {
            var0.setColor(var12);
            var0.fillRect(va, var3, xa, var7 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(va, var3, xa - 1, var7 + 5);
            var14 = (var7 + 5 - var8 >> 1) + 1;
            A.B(va + 3, var3 + var14, 150, var10, var0);
            A.A(0, va + 2 + var9 + 5, var3 + 1, xa - var9 - 5 - 4, var7 + 5, 281);
            if (var5) {
               var0.setColor(A.i[16]);
            }

            A.A((String)var1, 0, 1, var0);
         }
      }

      return var6;
   }

   public static int A(Graphics var0) {
      var0.setClip(0, 0, A.f, A.g);
      if (var0 != null) {
         boolean var8 = false;
         boolean var7 = false;
         int var6 = 0;
         int var5 = 2;
         int var4 = 135;
         int var3 = 135;
         int var2;
         if (iA) {
            var2 = kA;
            short[] var1 = hA[jA];
            if (var2 >= 0) {
               short var9 = var1[(var2 << 2) + 2];
               var8 = var9 != 103 && var9 != 104 && var9 != 108;
            }

            var7 = lA.size() > 0;
            if (tA >= 0) {
               var6 = tA;
               var4 = vA;
               var8 = true;
            }

            if (uA >= 0) {
               var5 = uA;
               var3 = wA;
               var7 = true;
            }

            if (sA == 35) {
               var7 = false;
            }

            if (rA == 35) {
               var8 = false;
            }
         }

         int var10;
         if (jA <= 17) {
            var2 = 10 + (A.cc[var4 * 11 + 0] / A.cc[var4 * 11 + 5] >> 1);
            var10 = A.g - 10;
         } else {
            var10 = A.g;
            var2 = A.cc[1606] >> 1;
         }

         if (var8) {
            A.B(var2, var10, var4, var6, var0);
         }

         if (var7) {
            A.B(A.f - var2, var10, var3, var5, var0);
         }

         var3 = wa + ya + 2;
         var2 = A.cc[1639] / A.cc[1644];
         var10 = ta - wa;
         if (var10 < 0) {
            A.B((A.f >> 1) - var2, var3, 149, 0, var0);
         }

         if (var10 > ya - ua) {
            A.B(A.f >> 1, var3, 149, 1, var0);
         }
      }

      return 0;
   }

   public static void B(Graphics var0) {
      var0.setClip(0, 0, A.f, A.g);
      var0.setColor(A.i[8]);
      var0.fillRect(0, 0, A.f, A.g);
      int var3 = A.cc[1738] / A.cc[1743];
      int var2 = A.f - 10;
      int var4 = A.g - 10;
      int var1 = 5;
      if (jA != 0) {
         var1 = A.cc[1728] >> 1;
         var4 = A.g - var1 - 5;
      }

      var0.setColor(A.i[3]);
      var0.drawRect(7, var1 + 2, var2 - 3, var4 - 3);
      var0.setColor(A.i[6]);
      var0.drawRect(6, var1 + 1, var2 - 3, var4 - 3);
      var0.setColor(A.i[5]);
      var0.drawRect(5, var1, var2 - 3, var4 - 3);
      A.B(5, var1, 158, 0, var0);
      A.B(5 + var2 - var3, var1, 158, 1, var0);
      var1 += 3;
      if (jA == 0) {
         var1 += 5;
         A.B(A.f >> 1, var1, 159, 0, var0);
         var2 = var1 + A.cc[1750] + 5;
      } else {
         var3 = 6 + A.cc[1728];
         var4 = A.g - 10;
         var2 = A.f - 26;
         A.B(A.f >> 1, 3, 157, 0, var0);
         var0.setColor(A.i[4]);
         var1 = A.j[2].getHeight() + 5;
         var0.fillRect(13, var3, var2, var1);
         var0.setColor(A.i[6]);
         var0.drawRect(13, var3, var2, var1);
         var0.drawRect(14, var3 + 1, var2 - 1, var1 - 1);
         var0.setColor(A.i[5]);
         var0.drawRect(13, var3, var2 - 1, var1 - 1);
         var2 = var3 + (var1 - 1);
      }

      var1 = A.f - 26;
      var3 = var4 - (var2 + A.cc[1486] + 3);
      var0.setColor(A.i[3]);
      var0.fillRect(13, var2, var1, var3);
      var0.setColor(A.i[6]);
      var0.drawRect(13, var2, var1, var3);
      var0.drawRect(14, var2 + 1, var1 - 1, var3 - 1);
      var0.setColor(A.i[5]);
      var0.drawRect(13, var2, var1 - 1, var3 - 1);
      A.B(13, var2, 152, 0, var0);
      A.B(13 + var1, var2, 152, 0, 0, 2, var0);
      var2 += var3;
      var1 = A.f >> 1;
      A.B(var1, var2, 152, 0, var0);
      A.B(var1, var2, 152, 0, 0, 2, var0);
   }

   public static int A(Graphics var0, String var1, int var2, boolean var3) {
      int var5 = A.j[2].getHeight();
      int var4 = var5 + 5;
      if (var0 != null && var1 != null) {
         var0.setFont(A.j[2]);
         if (var3) {
            var0.setColor(A.i[10]);
            var0.fillRect(va, var2, xa, var5 + 2);
            var0.setColor(A.i[5]);
            A.A(1, va, var2, xa, var5, 284);
            A.A((String)var1, 1, 2, var0);
            A(var2, var4, kA);
         } else if (var2 > -var4 && var2 <= A.g) {
            var0.setColor(A.i[5]);
            A.A(0, va, var2, xa, var5, 284);
            A.A((String)var1, 0, 2, var0);
         }
      }

      return var4;
   }

   static void DA(int var0) {
      short var1;
      int var5;
      short var6;
      String var9;
      short[] var11;
      switch(var0) {
      case 1:
         gA = true;
         iA = false;
         fA = 0;
         kA = -1;
         A.D();
         A.H();
         A.AA();
         A.r.A(eb, 13, 7, 3, false);
         (new Thread(A.r)).start();
         break;
      case 2:
         eb.A(4);
         fb.destroyApp(false);
         break;
      case 3:
         lA.removeAllElements();
         iA = false;
         fA = 0;
         kA = -1;
         A.D();
         break;
      case 4:
         A.FA(2);
      case 34:
         gA = false;
         lA.removeAllElements();
         B.D();
         eb.A(5);
         LA(0);
         L();
         M(1);
         iA = true;
         break;
      case 5:
         if (c != null) {
            if (C()) {
               eb.A(4);
            } else {
               LA(0);
            }
         } else {
            LA(13);
         }
         break;
      case 6:
         U();
         break;
      case 7:
         W();
         if (MA(0)) {
            L();
         } else if (MA(2)) {
            if (S(0) != 0) {
               L();
            }
         } else if (gA) {
            if (A.nA > 0) {
               if (S(2) != 0) {
                  L();
                  M(2);
               }
            } else if (S(A.oA) != 0) {
               L();
               M(A.oA);
            }
         } else if (S(1) != 0 && S(0) != 0) {
            L();
            M(1);
         }

         U();
         break;
      case 8:
         V();
         U();
         break;
      case 9:
         if (MA(0)) {
            E(1, 1);
            W();
         }

         eb.A(2);
         break;
      case 10:
         E(0, 1);
         W();
         eb.A(2);
         break;
      case 11:
         iA = false;
         fA = 0;
         kA = -1;
         A.D();
         break;
      case 12:
         var11 = hA[jA];
         aA = var11[kA * 4 + 3] & 32767;
         ra = A.da[za][aA];
         lA.push(new Integer(jA));
         lA.push(new Integer(kA));
         LA(20);
         break;
      case 13:
         int[] var12 = A.da[za][aA];
         if ((var12[3] & 256) != 0) {
            var9 = I(224) + "\n" + I(242) + ": @x@@";
            A.A(var9, B.F(var12), 26, 101, 1, var12[6], 0);
         } else {
            A.A(za, aA, 1, false, true);
            if (jA != 19 && jA != 21) {
               U();
            } else {
               B(jA);
            }
         }
         break;
      case 14:
         A.G(za, aA);
         if (jA != 19 && jA != 21) {
            U();
         } else {
            B(jA);
         }
         break;
      case 15:
         iA = false;
         fA = 0;
         kA = -1;
         A.Q();
         A.eb = true;
         break;
      case 19:
         var5 = B.a[A.tb][3];
         int var4;
         if ((var5 & 32) == 0 && (var5 & 4096) == 0) {
            var1 = (short)(B.a[A.tb][0] & '\uffff');
            var6 = (short)((B.a[A.tb][0] & -65536) >> 16);

            for(var4 = B.u[var6][var1]; var4 >= 0 && (B.a[var4][3] & 10176) <= 0; var4 = (short)(B.a[var4][1] & '\uffff')) {
            }
         } else {
            var0 = B.A(A.tb, (int[])null) + bA;
            var4 = (short)(A.hA[var0] & '\uffff');
         }

         int var10 = var4;
         int var8 = 0;
         var1 = -1;

         while(var4 != -1) {
            if (cA == var8) {
               var1 = (short)(B.a[var4][2] & '\uffff');
               break;
            }

            ++var8;

            for(var4 = (short)(B.a[var4][1] & '\uffff'); var4 >= 0 && (B.a[var4][3] & 10176) <= 0; var4 = (short)(B.a[var4][1] & '\uffff')) {
            }
         }

         if ((B.a[A.tb][3] & 32) != 0 && (B.a[A.tb][13] & 2) == 0) {
            var9 = I(219) + "\n" + I(252) + ": ";
            if ((B.a[var1][3] & 256) != 0) {
               var9 = var9 + "@1@@\n" + I(242) + ": @x@@";
               A.A(var9, B.F(B.a[var1]), 24, 101, 1, B.a[var1][6], B.G(B.a[var1]));
            } else {
               var9 = var9 + B.G(B.a[var1]);
               A.A(var9, B.F(B.a[var1]), 24, 101);
            }

            if (jA != 19 && jA != 21) {
               U();
            }
         } else if ((10176 & B.a[A.tb][3]) > 0) {
            A.I(var1);
            var0 = W(21);
            if (var0 == 0) {
               DA(11);
            } else {
               if (var0 == 1) {
                  int[] var10000 = B.a[var10];
                  var10000[3] &= -524289;
                  var10000 = B.a[var10];
                  var10000[3] &= -1048577;
               }

               if (jA != 19 && jA != 21) {
                  A.F((short)(A.ca[0] & '\uffff'), (short)((A.ca[0] & -65536) >> 16));
                  U();
               }
            }
         } else if (A.B(false)) {
            U();
         } else {
            DA(11);
         }
         break;
      case 21:
         var11 = hA[jA];
         var0 = var11[kA * 4 + 3] & 32767;
         ra = B.a[var0];
         cA = kA - 1;
         lA.push(new Integer(jA));
         lA.push(new Integer(kA));
         LA(22);
         break;
      case 22:
         int[] var7 = A.da[za][aA];
         if ((B.a[A.tb][3] & 32) != 0 && (B.a[A.tb][13] & 2) == 0) {
            var9 = I(249) + "\n" + I(252) + ": ";
            var5 = B.G(var7);
            if (var5 % 2 != 0) {
               ++var5;
            }

            var5 = var5 * 40 / 100;
            if ((var7[3] & 256) != 0) {
               var9 = var9 + "@1@@\n" + I(242) + ": @x@@";
               A.A(var9, B.F(var7), 23, 101, 1, var7[6], var5);
            } else {
               var9 = var9 + var5;
               A.A(var9, B.F(var7), 23, 101);
            }
         } else if ((10176 & B.a[A.tb][3]) > 0) {
            if ((var7[3] & 256) == 0) {
               A.cd = 1;
               DA(29);
               break;
            }

            var9 = I(224) + "\n" + I(242) + ": @x@@";
            A.A(var9, B.F(var7), 29, 101, 1, var7[6], 0);
         } else {
            if ((var7[3] & 256) == 0) {
               if (jA != 19 && jA != 21) {
                  U();
               }

               A.A(false);
               break;
            }

            var9 = I(224) + "\n" + I(242) + ": @x@@";
            A.A(var9, B.F(var7), 25, 101, 1, var7[6], B.G(var7));
         }

         if (jA != 19 && jA != 21) {
            U();
         }
         break;
      case 23:
         A.A(true);
         break;
      case 24:
         A.B(true);
         break;
      case 25:
         A.A(false);
         break;
      case 26:
         A.A(za, aA, A.cd, false, true);
         if (jA != 19 && jA != 21) {
            U();
         } else {
            B(jA);
         }
         break;
      case 27:
         lA.push(new Integer(jA));
         lA.push(new Integer(kA));
         LA(24);
         break;
      case 28:
         for(var0 = 0; var0 < A.ya.length; ++var0) {
            if (A.ya[var0][3] == kA) {
               eA = var0;
               break;
            }
         }

         lA.push(new Integer(jA));
         lA.push(new Integer(kA));
         LA(26);
         break;
      case 29:
         short var3 = (short)(A.ca[0] & '\uffff');
         short var2 = (short)((A.ca[0] & -65536) >> 16);
         var1 = (short)(B.a[A.tb][0] & '\uffff');
         var6 = (short)((B.a[A.tb][0] & -65536) >> 16);
         A.ca[0] = (short)var1 & '\uffff' | (short)var6 << 16 & -65536;
         A.A(za, aA, A.cd, false, true);
         A.ca[0] = (short)var3 & '\uffff' | (short)var2 << 16 & -65536;
         if (jA != 19 && jA != 21) {
            U();
         } else {
            B(jA);
         }
         break;
      case 30:
         gA = true;
         iA = false;
         fA = 0;
         kA = -1;
         A.s = 5;
         A.H();
         A.AA();
         A.GA(2);
         A.r.A(eb, A.ca[11], (short)(A.ca[0] & '\uffff'), (short)((A.ca[0] & -65536) >> 16), false);
         (new Thread(A.r)).start();
         break;
      case 31:
         if (!A.HA(2) && !A.HA(3)) {
            DA(1);
         } else {
            lA.push(new Integer(jA));
            lA.push(new Integer(kA));
            LA(1);
         }
         break;
      case 32:
         A.FA(2);
         break;
      case 33:
         if ((short)(A.ca[12] & '\uffff') <= 0) {
            DA(34);
         } else {
            lA.push(new Integer(jA));
            lA.push(new Integer(kA));
            if (A.ca[11] == -1) {
               LA(16);
            } else {
               LA(15);
            }
         }
      case 35:
      default:
         break;
      case 36:
         A.D(312, 238, 30, 6);
         break;
      case 37:
         A.D(462, 247, 32, 6);
         break;
      case 38:
         A.D(313, 238, 39, 6);
         break;
      case 39:
         gA = true;
         iA = false;
         fA = 0;
         kA = -1;
         A.s = 5;
         A.H();
         A.AA();
         A.GA(3);
         A.r.A(eb, A.ca[11], (short)(A.ca[0] & '\uffff'), (short)((A.ca[0] & -65536) >> 16), false);
         (new Thread(A.r)).start();
         break;
      case 40:
         LA(15);
         break;
      case 100:
         A.gd[0] = 1;
         A.O(A.gd, A.hd);
         A.gd = null;
         A.hd = -1;
         A.A(10, 0, 0, 0, 0, true);
         A.r.A(eb, A.tC, A.uC, A.vC, false);
         (new Thread(A.r)).start();
         break;
      case 101:
         if (A.gd != null) {
            A.gd[0] = 0;
            A.gd = null;
            A.hd = -1;
         }

         A.oC = false;
         break;
      case 102:
         A.A(10, 0, 0, 0, 0, true);
         A.r.A(eb, A.tC, A.uC, A.vC, true);
         (new Thread(A.r)).start();
         break;
      case 103:
         var0 = A.eC[A.tC][9];
         A.eC[A.tC][var0++] = 1;
         A.eC[A.tC][9] = var0;
         A.eC[A.tC][0] = 1;
         break;
      case 104:
         var0 = A.eC[A.tC][9];
         A.eC[A.tC][var0++] = 0;
         A.eC[A.tC][9] = var0;
         A.eC[A.tC][0] = 1;
         break;
      case 105:
         A.eC[A.tC][0] = 1;
      }

   }

   static int EA(int var0) {
      int var2 = 0;
      short[] var1 = hA[var0];
      oA = GA(var0);
      int var4 = 0;

      for(int var3 = 0; var3 < oA; ++var3) {
         short var5 = var1[(var3 << 2) + 2];
         String[] var6;
         switch(var5) {
         case 50:
            var6 = nA[var4++];
            var2 += A((Graphics)null, var6, 0);
            break;
         case 100:
         case 101:
            var2 += A((Graphics)null, (String)null, 0, false);
            break;
         case 102:
            var2 += A((Graphics)null, (String)null, 0, false, 0);
            break;
         case 103:
         case 104:
            var6 = nA[var4++];
            var2 += A((Graphics)null, var6, 0, -1, (byte)(var1[(var3 << 2) + 3] & 255));
            break;
         case 105:
            var2 += A((Graphics)null, (String)null, false, 0, 0);
            break;
         case 108:
            var2 += A((Graphics)null, 0);
            break;
         case 109:
            var2 += A((Graphics)null, (String)null, 0, 0, false);
         }
      }

      return var2;
   }

   public static boolean A(short var0) {
      short[] var1 = hA[var0];
      short var3 = var1[3];
      short var2 = var1[2];
      boolean var4 = false;
      int var5;
      if (var2 == 6 && var3 == 1) {
         va = A.cc[1617] / A.cc[1622];
         wa = A.C(true) + 3;
         xa = A.f - (A.cc[1617] / A.cc[1622] + A.cc[1617] / A.cc[1622]);
         ya = A.g - (A.C(true) + 3 + A.cc[1607] + A.cc[1387] + A.cc[1617] / A.cc[1622] + A.cc[1640] + 5);
         var5 = A.cc[1650] / A.cc[1655] + 5;
         A.A(0, va + var5, wa, xa, ya);
         A.A(1, va + var5, wa, xa, ya);
      } else if (jA == 0) {
         va = 17;
         wa = 20 + A.cc[1750] + A.cc[1486];
         xa = A.f - 2 * va;
         ya = A.g - 10 - 5 - A.cc[1486] - wa - (A.cc[1640] + 5);
         A.A(0, va, wa, xa, ya);
         A.A(1, va, wa, xa, ya);
      } else {
         var5 = A.j[2].getHeight() + 5;
         va = 17;
         wa = A.cc[1728] + 8 + var5 + A.cc[1486];
         xa = A.f - 2 * va;
         ya = A.g - 10 - (wa + A.cc[1486] + 4) - (A.cc[1640] + 5);
         A.A(2, va + 2, A.cc[1728] + 6, xa - 4, var5, 28);
         A.A(0, va, wa, xa, ya);
         A.A(1, va, wa, xa, ya);
      }

      switch(var0) {
      case 1:
         CA(var0);
         break;
      case 14:
         BA(var0);
         break;
      case 18:
         fA = 0;
         break;
      case 19:
         P();
         var4 = true;
         break;
      case 20:
         Y(var0);
         break;
      case 21:
         W(var0);
         var4 = true;
         break;
      case 22:
         X(var0);
         break;
      case 23:
         fA |= 8;
         U(var0);
         break;
      case 24:
         V(var0);
         break;
      case 25:
         fA |= 4;
         Z(var0);
         break;
      case 26:
         AA(var0);
      }

      Q();
      return var4;
   }

   public static void Q() {
      A.A((int)0, (int)0, (int)0);
      A.A((int)1, (int)-2, (int)0);
      A.A((int)2, (int)-2, (int)0);
   }

   public static String[] A(int var0, Font var1, int var2) {
      String[] var3 = null;
      switch(var0) {
      case 1:
         char[] var7 = (new String("11-01-2008")).toCharArray();
         String var8 = "(c) 20" + var7[8] + var7[9] + ",\n" + I(473) + "\n" + I(13) + "\nv " + fb.getAppProperty("MIDlet-Version");
         var3 = A(var8, var1, var2, 0);
         break;
      case 2:
         var3 = A(I(303) + ", " + I(293) + ":\n" + I(201) + "\n\n" + I(300) + ", " + I(297) + ":\n" + I(195) + "\n\n" + I(302) + ", " + I(295) + ":\n" + I(199) + "\n\n" + I(304) + ", " + I(296) + ":\n" + I(203) + "\n\n" + I(306) + ", " + I(294) + ":\n" + I(207) + "\n\n" + I(299) + ":\n" + I(193) + "\n\n" + I(301) + ":\n" + I(197) + "\n\n" + I(305) + ":\n" + I(205) + "\n\n" + I(307) + ":\n" + I(209) + "\n\n" + I(309) + ":\n" + I(213) + "\n\n" + I(308) + ":\n" + I(189) + "\n\n" + I(310) + ":\n" + I(191) + "\n\n" + I(311) + ":\n" + I(211), var1, var2, 0);
         break;
      case 3:
         var3 = A(I(303) + ", " + I(293) + ":\n" + I(200) + "\n\n" + I(300) + ", " + I(297) + ":\n" + I(194) + "\n\n" + I(302) + ", " + I(295) + ":\n" + I(198) + "\n\n" + I(304) + ", " + I(296) + ":\n" + I(202) + "\n\n" + I(306) + ", " + I(294) + ":\n" + I(206) + "\n\n" + I(309) + ":\n" + I(212) + "\n\n" + I(310) + ":\n" + I(190) + "\n\n" + I(311) + ":\n" + I(210) + "\n\n\n" + I(298) + ":\n" + I(407), var1, var2, 0);
         break;
      case 4:
         if ((short)(A.ya[eA][0] & '\uffff') == 1) {
            var0 = A.ya[eA][1] + A.ya[eA][2];
            var3 = A(I(var0), var1, var2, 0);
         }
         break;
      case 5:
         int var6 = A.ya[eA][1];
         int var5 = var6 + A.ya[eA][2];
         if ((short)(A.ya[eA][0] & '\uffff') == 1) {
            --var5;
         }

         String var4 = "";

         for(var0 = var5; var0 > var6; --var0) {
            if ((short)(A.ya[eA][0] & '\uffff') != 1 && var0 == var5) {
               var4 = var4 + I(var0);
            } else {
               var4 = var4 + "\n" + I(var0);
            }

            if (var0 > var6 + 1) {
               var4 = var4 + "\n";
            }
         }

         if (var4.length() > 0) {
            var3 = A(var4, var1, var2, 0);
         }
         break;
      case 6:
         var3 = A(I(299) + ":\n" + I(192) + "\n\n" + I(301) + ":\n" + I(196) + "\n\n" + I(305) + ":\n" + I(204) + "\n\n" + I(307) + ":\n" + I(208) + "\n\n" + I(308) + ":\n" + I(188), var1, var2, 0);
      }

      return var3;
   }

   public static void A(int var0, int var1, int var2) {
      int var3 = var0 + var1;
      var1 = wa + ya;
      if (var3 > var1) {
         var0 = var3 - var1;
         ta -= var0;
      } else if (var0 < wa) {
         var0 = wa - var0;
         ta += var0;
      }

      var0 = IA(jA);
      if (var2 == var0) {
         ta = wa;
      }

   }

   public static byte FA(int var0) {
      byte var1 = 0;
      switch(var0) {
      case 0:
         if (MA(0)) {
            var1 = 1;
         }
         break;
      case 1:
         if (MA(1)) {
            var1 = 1;
         }
         break;
      case 2:
         if (MA(2)) {
            var1 = 1;
         }
         break;
      case 3:
         if (MA(3)) {
            var1 = 1;
         }
         break;
      case 4:
         if (!MA(3)) {
            var1 = 1;
         }
      case 5:
      case 6:
      default:
         break;
      case 7:
         if (MA(5)) {
            var1 = 1;
         }
         break;
      case 8:
         if (MA(6)) {
            var1 = 1;
         }
         break;
      case 9:
         if (!MA(6)) {
            var1 = 1;
         }
      }

      return var1;
   }

   public static void C(int var0, int var1) {
      switch(var0) {
      case 0:
         if (var1 == 1) {
            E(0, 1);
         }
         break;
      case 1:
         if (var1 == 1) {
            E(1, 1);
         }
         break;
      case 2:
         if (var1 == 1) {
            E(2, 1);
         }
         break;
      case 3:
         if (var1 == 1) {
            E(3, 1);
         }
         break;
      case 4:
         if (var1 == 1) {
            E(3, 0);
         }
      case 5:
      case 6:
      case 7:
      default:
         break;
      case 8:
         if (var1 == 1) {
            E(6, 1);
         }
         break;
      case 9:
         if (var1 == 1) {
            E(6, 0);
         }
      }

   }

   static int GA(int var0) {
      short var1 = 0;
      short[] var5 = hA[var0];
      int var4 = var5.length / 4;
      int var3 = 0;

      for(int var2 = 0; var2 < var4; ++var2) {
         var3 += 4;
         ++var1;
      }

      return var1;
   }

   static int HA(int var0) {
      short var1 = 0;
      short[] var5 = hA[var0];
      int var4 = var5.length / 4;
      int var3 = 0;

      for(int var2 = 0; var2 < var4; ++var2) {
         short var6 = var5[var3 + 2];
         var3 += 4;
         if (var6 > 99 && var6 < 200) {
            ++var1;
         }
      }

      return var1;
   }

   static String A(short var0, short var1) {
      String var3 = "";
      short[] var2 = hA[var0];
      int var4 = var2[(var1 << 2) + 0];
      if (var4 >= 0) {
         if (var0 == 25) {
            var4 |= 262144;
         }

         var3 = I(var4);
      }

      return var3;
   }

   static int IA(int var0) {
      int var1 = -1;
      GA(var0);
      short[] var4 = hA[var0];
      boolean var3 = false;

      for(int var2 = 0; !var3; ++var2) {
         var0 = (var2 << 2) + 2;
         if (var0 <= var4.length) {
            short var5 = var4[var0];
            if (var5 > 99 && var5 < 200) {
               var1 = var2;
               var3 = true;
            }
         } else {
            var3 = true;
         }
      }

      return var1;
   }

   static int JA(int var0) {
      int var1 = -1;
      short[] var3 = hA[var0];
      var0 = var3.length / 4;

      for(int var2 = var0 - 1; var2 >= 0; --var2) {
         short var4 = var3[(var2 << 2) + 2];
         if (var4 > 99 && var4 < 200) {
            var1 = var2;
            break;
         }
      }

      return var1;
   }

   static int D(int var0, int var1) {
      if (var0 >= 0 && var0 < hA.length) {
         short[] var2 = hA[var0];

         for(var0 = 0; var0 < var2.length; var0 += 4) {
            if (var2[var0 + 0] == var1) {
               return var0 / 4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   static void A(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 >= 0 && var0 < hA.length) {
         short[] var6 = hA[var0];
         int var7 = var1 * 4;
         if (var7 >= 0 && var7 <= var6.length) {
            short[] var8 = new short[var6.length + 4];
            if (var7 == 0) {
               System.arraycopy(var6, 0, var8, 4, var6.length);
            } else if (var7 == var6.length) {
               System.arraycopy(var6, 0, var8, 0, var6.length);
            } else {
               System.arraycopy(var6, 0, var8, 0, var7);
               System.arraycopy(var6, var7, var8, var7 + 4, var6.length - var7);
            }

            var8[var7 + 0] = (short)var2;
            var8[var7 + 1] = (short)var3;
            var8[var7 + 2] = (short)var4;
            var8[var7 + 3] = (short)var5;
            hA[var0] = var8;
         }
      }
   }

   static void R() {
      boolean var0 = HA(jA) > 0;
      if (var0) {
         short[] var2 = hA[jA];
         short var1 = var2[kA * 4 + 2];
         int var3 = var2.length / 4;
         if (var1 == 103 || var1 == 104 || var1 == 108) {
            var3 = ua - wa - ya;
            if (-ta < var3) {
               ta -= A.j[2].getHeight();
            }

            if (xA) {
               if (bb >= 0) {
                  kA = bb;
               } else {
                  ++kA;
               }
            }

            return;
         }

         ++kA;
         if (kA >= var3) {
            kA = 0;
            ta = wa;
         }

         short var4 = var2[kA * 4 + 2];
         if (var4 <= 99 || var4 >= 200) {
            R();
         }
      }

      Q();
   }

   static void S() {
      boolean var0 = HA(jA) > 0;
      int var3 = kA;
      if (var0) {
         short[] var2 = hA[jA];
         short var1 = var2[kA * 4 + 2];
         if (var1 != 103 && var1 != 104 && var1 != 108) {
            if (cb >= 0 && cb < kA) {
               kA = cb;
            } else {
               --kA;
            }
         } else {
            if (ta < wa) {
               ta += A.j[2].getHeight();
            } else {
               --kA;
            }

            if (yA && var3 == kA) {
               --kA;
            }
         }

         int var6 = IA(jA);
         int var4 = JA(jA);
         if (kA < var6) {
            kA = var4;
         }

         short var5 = var2[kA * 4 + 2];
         if (var5 <= 99 || var5 >= 200) {
            S();
         }
      }

   }

   static void T() {
      int var0 = hA[jA].length / 4;
      if (kA >= 0 && kA < var0) {
         short[] var2 = hA[jA];
         int var1 = kA * 4;
         short var7 = var2[var1 + 1];
         short var8 = var2[var1 + 3];
         short var9 = var2[var1 + 2];
         switch(var9) {
         case 100:
         case 107:
            lA.push(new Integer(jA));
            lA.push(new Integer(kA));
            LA(var7);
            break;
         case 101:
         case 105:
         case 106:
         case 109:
            DA(var7);
            break;
         case 102:
            int var6 = -1;

            short[] var10;
            int var11;
            for(var11 = 0; var11 <= kA; ++var11) {
               var10 = hA[jA];
               var9 = var10[(var11 << 2) + 2];
               if (var9 == 102) {
                  ++var6;
               }
            }

            int var5 = GA(jA);
            short var4 = var8;
            if (var8 >= 0) {
               int var3 = 0;

               for(var11 = 0; var11 < var5; ++var11) {
                  var10 = hA[jA];
                  var8 = var10[(var11 << 2) + 2];
                  if (var8 == 102) {
                     var8 = var10[(var11 << 2) + 3];
                     if (var8 == var4) {
                        qA[var3] = 0;
                     }

                     ++var3;
                  }
               }
            }

            qA[var6] = 1;
            C(var7, 1);
         case 103:
         case 104:
         case 108:
         }
      }

   }

   static void B(short var0) {
      boolean var6 = A(var0);
      ta = wa;
      short[] var5 = hA[jA];
      oA = GA(var0);
      if (mA == null || mA.length != oA) {
         mA = new String[oA];
      }

      int var4 = 0;
      int var3 = 0;
      pA = 0;
      rA = -1;
      sA = -1;
      tA = -1;
      uA = -1;
      vA = -1;
      wA = -1;

      short var1;
      short var2;
      for(var2 = 0; var2 < oA; ++var2) {
         var1 = var5[(var2 << 2) + 2];
         switch(var1) {
         case 2:
            sA = var5[(var2 << 2) + 1];
            uA = var5[(var2 << 2) + 3];
            wA = var5[(var2 << 2) + 0];
            break;
         case 3:
            rA = var5[(var2 << 2) + 1];
            tA = var5[(var2 << 2) + 3];
            vA = var5[(var2 << 2) + 0];
         case 4:
         case 5:
         case 6:
            break;
         case 50:
         case 103:
         case 104:
            ++var4;
            break;
         case 102:
            ++var3;
         case 109:
         default:
            mA[var2] = A(var0, var2);
            break;
         case 106:
         case 107:
            ++pA;
            mA[var2] = A(var0, var2);
         }
      }

      if (var3 > 0) {
         if (qA == null || qA.length != var3) {
            qA = new byte[var3];
         }

         var3 = 0;

         for(int var7 = 0; var7 < oA; ++var7) {
            var1 = var5[(var7 << 2) + 2];
            if (var1 == 102) {
               var1 = var5[(var7 << 2) + 1];
               qA[var3] = FA(var1);
               ++var3;
            }
         }
      }

      if (var4 > 0) {
         nA = new String[var4][];
         var3 = 0;

         for(var2 = 0; var2 < oA; ++var2) {
            var1 = var5[(var2 << 2) + 2];
            if (var1 != 103 && var1 != 50) {
               if (var1 == 104) {
                  var1 = var5[(var2 << 2) + 1];
                  nA[var3] = A(var1, A.j[2], xa - 8 - 8);
                  ++var3;
               }
            } else {
               nA[var3] = A(A(var0, var2), A.j[2], xa - 6, 0);
               ++var3;
            }
         }
      }

      ua = EA(var0);
      if (!var6) {
         kA = IA(var0);
      }

      if (kA < 0 || kA * 4 + 2 >= hA[var0].length || hA[var0][kA * 4 + 2] <= 99 || hA[var0][kA * 4 + 2] >= 200) {
         kA = IA(var0);
      }

   }

   static void KA(int var0) {
      mA = null;
      nA = (String[][])null;
      oA = 0;
   }

   static void C(Graphics var0) {
      if (A.c) {
         A.A(var0);
      } else if (jA != -1) {
         if (jA <= 17) {
            B(var0);
         }

         short[] var13 = hA[jA];
         int var12 = ta;
         int var11 = 0;
         int var10 = 0;
         int var9 = 0;
         xA = false;
         yA = false;
         boolean var8 = false;
         zA = false;
         bb = -1;
         cb = -1;

         for(int var7 = 0; var7 < oA; ++var7) {
            short var6 = var13[(var7 << 2) + 2];
            if (var6 >= 0) {
               String var5;
               if (mA != null && mA[var7] != null) {
                  var5 = mA[var7];
               } else {
                  var5 = "null";
               }

               var0.setClip(va, wa, xa, ya);
               short var1;
               boolean var2;
               int var3;
               int var14;
               int var15;
               switch(var6) {
               case 1:
                  A(var0, var5);
               case 2:
               case 3:
               case 4:
                  break;
               case 5:
                  var1 = var13[(var7 << 2) + 3];
                  A.A((Graphics)var0, var1);
                  break;
               case 6:
                  var1 = var13[(var7 << 2) + 3];
                  boolean var17 = (var1 & 2) == 2 || (var1 & 1) == 1;
                  var2 = (var1 & 4) == 4 || (var1 & 1) == 1;
                  boolean var19 = (var1 & 8) == 8 || (var1 & 1) == 1;
                  if (var17) {
                     A.A(var0, var2, var19, true, A.yb);
                     if ((fA & 1) != 0) {
                        var0.setClip(0, 0, A.f, A.g);
                        var0.setColor(A.i[5]);
                        int var20 = A.cc[1518] + A.cc[1386] - 1 + 7;
                        var3 = A.f - var20 - 1 - 7;
                        var15 = A.j[2].getHeight() + 5 + 5;
                        var14 = A.g - var15 - (A.cc[1387] - var15 >> 1) - A.cc[1607];
                        A.A(10, var20 + 4, var14 + 4, var3 - 8, var15 - 8, 156);
                        A.A((String)(I(406) + I(309)), 10, 2, var0);
                     }
                  }
                  break;
               case 50:
                  String[] var18 = nA[var11];
                  ++var11;
                  var14 = A(var0, var18, var12);
                  var12 += var14;
                  break;
               case 102:
               default:
                  boolean var21 = var7 == kA;
                  if (var6 == 102) {
                     var3 = A((Graphics)null, var5, var12, var21, var10);
                  } else {
                     var3 = A((Graphics)null, var5, var12, var21);
                  }

                  zA = true;
                  var15 = var12 + var3;
                  var14 = wa + ya;
                  if ((var15 <= wa || var12 >= var14) && !var21) {
                     if (var6 == 102) {
                        ++var10;
                     }
                  } else {
                     if (var6 == 102) {
                        A(var0, var5, var12, var21, var10);
                        ++var10;
                     } else {
                        A(var0, var5, var12, var21);
                     }

                     if (var8 && var7 > kA) {
                        xA = true;
                        if (bb < 0) {
                           bb = var7;
                        }
                     }

                     zA = true;
                     ab = var7;
                  }

                  var12 += var3;
                  break;
               case 103:
               case 104:
                  String[] var22 = nA[var11];
                  ++var11;
                  byte var4 = (byte)(var13[(var7 << 2) + 3] & 255);
                  var3 = A((Graphics)null, var22, var12, -1, var4);
                  var15 = var12 + var3;
                  var14 = wa + ya;
                  if (var15 > var14) {
                  }

                  if (var15 > wa && var12 < var14) {
                     byte var16 = (byte)(var13[(var7 << 2) + 3] >> 8 & 255);
                     A(var0, var22, var12, var16, var4);
                     var8 = true;
                     if (zA && ab < kA) {
                        yA = true;
                        cb = var7;
                     }
                  }

                  var12 += var3;
                  break;
               case 105:
                  var2 = var7 == kA;
                  var1 = var13[(var7 << 2) + 3];
                  var14 = A(var0, var5, var2, var12, var1);
                  var12 += var14;
                  break;
               case 106:
               case 107:
                  var2 = var7 == kA;
                  var1 = var13[(var7 << 2) + 3];
                  var12 += A(var0, var5, var12, var1, var9, var2);
                  ++var9;
                  break;
               case 108:
                  var14 = A(var0, var12);
                  var12 += var14;
                  break;
               case 109:
                  var2 = var7 == kA;
                  var1 = var13[(var7 << 2) + 3];
                  var12 += A(var0, var5, var1, var12, var2);
               }
            }
         }

         if (jA == 19 || jA == 21) {
            var0.setColor(A.i[5]);
            var0.drawLine(va, wa, va + xa - 1, wa);
         }

         A(var0);
      }
   }

   static void U() {
      if (!lA.empty()) {
         int var1 = (Integer)lA.pop();
         int var0 = (Integer)lA.pop();
         kA = var1;
         LA(var0);
         if (hA[jA][var1 * 4 + 2] > 99 && hA[jA][var1 * 4 + 2] < 200) {
            kA = var1;
         }
      }

   }

   static void LA(int var0) {
      short var1 = (short)var0;
      KA(jA);
      jA = var1;
      B(var1);
   }

   public static void V() {
      if (B((int)0)) {
         db = D(0);
         if (db.length != 7) {
            db = new byte[7];
         }
      } else {
         db[0] = 0;
         db[1] = 0;
         db[2] = 0;
         db[5] = 0;
         db[6] = 0;
         db[3] = 1;
         db[4] = 0;
         W();
      }

   }

   public static void W() {
      A(0, db);
   }

   public static void E(int var0, int var1) {
      if (var0 >= -1 && var0 < db.length && (var1 == 0 || var1 == 1)) {
         if (var0 == 1 && var1 == 1) {
            db[1] = 1;
            db[2] = 0;
            db[5] = 0;
         } else if (var0 == 2 && var1 == 1) {
            db[1] = 0;
            db[2] = 1;
            db[5] = 0;
         } else if (var0 == 0 && var1 == 1) {
            db[1] = 0;
            db[2] = 0;
            db[5] = 0;
         } else if (var0 == 5 && var1 == 1) {
            db[1] = 0;
            db[2] = 0;
            db[5] = 1;
         } else {
            db[var0] = (byte)var1;
         }

      }
   }

   public static boolean MA(int var0) {
      if (var0 >= -1 && var0 < db.length) {
         if (var0 == 0) {
            return db[1] == 0 && db[2] == 0 && db[5] == 0;
         } else {
            return db[var0] == 1;
         }
      } else {
         return false;
      }
   }

   public HG() {
      fb = this;
      if (eb == null) {
         eb = new A(this);
         A.i = E();
         A.j = F();
         Display.getDisplay(this).setCurrent(eb);
         this.D();
         A.e = new Thread(eb);
         A.e.start();
         V();
         eb.A(1);
      }

   }

   public void destroyApp(boolean var1) {
      this.notifyDestroyed();
   }

   public void pauseApp() {
      if (eb != null) {
         A.WB();
      }

   }

   protected void startApp() {
   }

   public void commandAction(Command var1, Displayable var2) {
   }

   static {
      n = new boolean[l.length];
      o = new String[l.length][];
      q = 0;
      r = "";
      s = (String[][])null;
      t = "";
      u = (int[][])null;
      aa = 100;
      ba = 100;
      ca = new String[]{".mid", ".amr", ".wav", ".mp3", ".ott", ".mmf", ".spf", ".wav"};
      da = new String[]{"audio/midi", "audio/amr", "audio/x-wav", "audio/mpeg", "", "audio/mmf", "", "audio/x-wav"};
      ea = 0;
      ga = 0;
      ha = 0;
      ia = false;
      ja = -1;
      ka = false;
      la = "";
      ma = true;
      na = 0;
      oa = new Vector();
      pa = new Vector();
      qa = -1;
      ra = null;
      sa = new int[7];
      ta = 0;
      ua = 0;
      va = 0;
      wa = 0;
      xa = 0;
      ya = 0;
      za = 0;
      aA = 0;
      bA = 0;
      cA = 0;
      dA = 1;
      eA = 0;
      fA = 0;
      gA = false;
      hA = (short[][])null;
      iA = true;
      jA = -1;
      kA = 0;
      lA = new Stack();
      mA = null;
      nA = (String[][])null;
      oA = 0;
      pA = 0;
      rA = -1;
      sA = -1;
      tA = -1;
      uA = -1;
      vA = -1;
      wA = -1;
      xA = false;
      yA = false;
      zA = false;
      ab = 0;
      bb = -1;
      cb = -1;
      db = new byte[7];
      eb = null;
      fb = null;
   }
}
