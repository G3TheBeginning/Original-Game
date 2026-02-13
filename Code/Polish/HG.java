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
   static int d = -1;
   static int e = 0;
   static ByteArrayOutputStream f;
   static DataOutputStream g;
   static ByteArrayInputStream h;
   static DataInputStream i;
   static String[] j = new String[]{"MAIN", "DIALOGUE_INITRIA", "DIALOGUE_KHORINIS", "DIALOGUE_MISC", "QUESTS"};
   static byte[] k = new byte[]{1, 2, 2, 2, 2};
   static boolean[] l;
   static String[][] m;
   static byte[] n;
   static byte o;
   static String p;
   static String[][] q;
   static String r;
   public static int[][] s;
   public static Object[] t;
   public static int[][] u;
   public static byte[] v;
   public static int[] w;
   public static long[] x;
   public static short y;
   public static short z;
   public static final String[] aa;
   public static final String[] ba;
   public static int ca;
   public static D da;
   static int ea;
   public static int fa;
   static boolean ga;
   static int ha;
   static boolean ia;
   public static String ja;
   public static boolean ka;
   public static int la;
   public static Vector ma;
   public static Vector na;
   public static int oa;
   public static int[] pa;
   static int[] qa;
   static int ra;
   static int sa;
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
   static boolean eA;
   static short[][] fA;
   static boolean gA;
   static short hA;
   static int iA;
   static Stack jA;
   static String[] kA;
   static String[][] lA;
   static int mA;
   static int nA;
   static byte[] oA;
   static int pA;
   static int qA;
   static int rA;
   static int sA;
   static int tA;
   static int uA;
   static boolean vA;
   static boolean wA;
   static boolean xA;
   static int yA;
   static int zA;
   static int ab;
   private static byte[] bb;
   static A cb;
   static HG db;

   public static DataInputStream A(String var0) throws NullPointerException {
      DataInputStream var1 = null;

      try {
         InputStream var3 = db.getClass().getResourceAsStream(var0);
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
         var3 = db.getClass().getResourceAsStream("/mi");
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
            var12 = fA[0].length / 4 - 1;
         }

         A(0, var12 + 1, 388, 5, 101, -1);
      }

   }

   public static boolean C() {
      boolean var1 = false;
      if (c != null) {
         try {
            var1 = db.platformRequest(c);
         } catch (Exception var2) {
         }
      }

      return var1;
   }

   void D() {
   }

   public static int[] E() {
      int[] var2 = null;

      try {
         DataInputStream var1 = new DataInputStream(A("c"));
         d = var1.readInt();
         var2 = new int[d];

         for(int var0 = 0; var0 < d; ++var0) {
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
      short var0 = i.readShort();
      int[] var1 = new int[var0];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = i.readInt();
      }

      return var1;
   }

   public static final void A(int[] var0) throws IOException {
      g.writeShort(var0.length);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         g.writeInt(var0[var1]);
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
      e = -1;
      RecordStore var1 = null;

      byte[] var4;
      try {
         var1 = RecordStore.openRecordStore("RECSTR" + var0, false);
         var4 = var1.getRecord(1);
         e = 0;
      } catch (Exception var3) {
         var4 = null;
         e = -1;
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
      e = 0;
      RecordStore var3 = null;
      boolean var2 = false;

      try {
         var3 = RecordStore.openRecordStore("RECSTR" + var0, true);
         if (var3.getNumRecords() < 1) {
            var3.addRecord(var1, 0, 1);
            var2 = true;
         }

         if (var3.getSizeAvailable() < var1.length * 2) {
            e = -2;
         } else {
            var3.setRecord(1, var1, 0, var1.length);
            var2 = false;
         }
      } catch (RecordStoreNotFoundException var5) {
         e = -2;
      } catch (Exception var6) {
         e = -1;
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

      return e;
   }

   public static void H() {
      if (f == null) {
         f = new ByteArrayOutputStream();
      } else {
         f.reset();
      }

      if (g == null) {
         g = new DataOutputStream(f);
      }

   }

   public static void E(int var0) {
      if (f != null) {
         byte[] var2 = f.toByteArray();
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
         h = new ByteArrayInputStream(var1);
         i = new DataInputStream(h);
      }

   }

   public static int I() {
      InputStream var3;
      try {
         var3 = db.getClass().getResourceAsStream("/ldf");
      } catch (Exception var11) {
         return -1;
      }

      if (var3 == null) {
         return -1;
      } else {
         try {
            var3.read();
            o = (byte)var3.read();
            byte var0 = (byte)var3.read();
            byte[] var14 = new byte[var0];
            var3.read(var14);
            p = new String(var14);
            if (o == 3) {
               byte var2 = (byte)var3.read();
               q = new String[var2][2];

               for(int var1 = 0; var1 < var2; ++var1) {
                  var0 = (byte)var3.read();
                  var14 = new byte[var0];
                  var3.read(var14);
                  q[var1][0] = new String(var14);
                  var0 = (byte)var3.read();
                  var14 = new byte[var0];
                  var3.read(var14);
                  q[var1][1] = new String(var14);
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
      switch(o) {
      case 0:
         var3 = -1;
         break;
      case 1:
         r = p;
         break;
      case 2:
         r = var0;
         break;
      case 3:
         int var2 = 0;

         for(boolean var1 = true; var2 < q.length && var1; ++var2) {
            if (q[var2][0].compareTo(var0) == 0) {
               r = q[var2][1];
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

      for(int var0 = 0; var0 < j.length; ++var0) {
         if (m[var0] == null) {
            if ((k[var0] == 1 || k[var0] != 0 && l[var0]) && G(var0) == -1) {
               var1 = -1;
               break;
            }
         } else if (k[var0] != 1 && !l[var0]) {
            m[var0] = null;
         }
      }

      return var1;
   }

   public static int G(int var0) {
      InputStream var3 = null;

      try {
         if (r == null) {
            r = p;
         }

         String var1 = "/" + r + "." + j[var0] + "." + "lng";
         var3 = db.getClass().getResourceAsStream(var1);
         if (var3 == null) {
            return -1;
         }

         byte[] var15 = new byte[2];
         var3.read(var15, 0, 2);
         int var2 = ((var15[1] & 255) << 8 | var15[0] & 255) - 2;
         if (var2 >= 0) {
            var15 = new byte[var2];
            if (var3.read(var15, 0, var2) != var2) {
               m[var0] = new String[0];
               return -1;
            }

            var2 = (var15[2] & 255) << 8 | var15[1] & 255;
            n = var15;
            m[var0] = new String[var2];

            for(int var16 = 0; var16 < var2; ++var16) {
               m[var0][var16] = H(var16);
            }

            return 0;
         }
      } catch (Exception var13) {
         return 0;
      } finally {
         try {
            var3.close();
         } catch (Exception var12) {
         }

         n = null;
      }

      return -1;
   }

   public static String H(int var0) {
      String var1 = "";
      if (o == 0) {
         return "null_3";
      } else {
         ++var0;
         var0 *= 2;
         if (var0 >= 0 && var0 < n.length) {
            int var2 = (n[var0 + 4] & 255) << 8 | n[var0 + 3] & 255;
            var0 = (n[var0 + 2] & 255) << 8 | n[var0 + 1] & 255;
            if (var0 >= n.length) {
               return "";
            } else {
               byte[] var6 = new byte[var2 - var0];
               System.arraycopy(n, var0, var6, 0, var6.length);
               switch(n[0]) {
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
      if (m != null && var1 >= 0 && var1 < m.length) {
         if (m[var1] == null) {
            if (k[var1] == 4) {
               G(var1);
               if (m[var1] != null) {
                  var3 = I(var0);
               }
            }
         } else if (var2 >= 0 && var2 < m[var1].length && m[var1][var2] != null) {
            var3 = m[var1][var2];
         }
      }

      return var3;
   }

   public static void J(int var0) {
      if (var0 >= 0) {
         int var5 = s[var0][0];
         int var4 = s[var0][1];
         int var2 = s[var0][2];
         boolean var3 = true;
         if (u[var0][1] != -1) {
            var3 = false;
         }

         int var1;
         if (var3) {
            for(var1 = 0; var1 < ca; ++var1) {
               if (u[var1][1] == var4) {
                  var3 = false;
                  u[var0][0] = var5;
                  u[var0][1] = u[var1][1];
                  u[var0][2] = var1;
                  break;
               }
            }
         }

         if (var3) {
            String var12 = "";
            if (var4 < 10) {
               var12 = "0";
            }

            var12 = "/" + var12 + var4 + aa[var2];
            String var13 = ba[var2];
            InputStream var15 = null;

            try {
               var15 = db.getClass().getResourceAsStream(var12);
            } catch (Exception var11) {
            }

            try {
               var15.available();
               t[var0] = Manager.createPlayer(var15, var13);
            } catch (Exception var10) {
            }

            Player var14 = (Player)t[var0];

            try {
               var14.realize();
            } catch (Exception var9) {
            }

            try {
               var14.prefetch();
            } catch (Exception var8) {
            }

            try {
               var14.addPlayerListener(db);
            } catch (Exception var7) {
            }

            t[var0] = var14;
            u[var0][0] = var5;
            u[var0][2] = var0;
            u[var0][1] = var4;

            try {
               var15.close();
            } catch (Exception var6) {
            }
         }

         if (t[u[var0][2]] == null) {
            for(var1 = 0; var1 < ca; ++var1) {
               if (u[var1][1] == u[var0][1]) {
                  u[var1][2] = -1;
                  u[var1][1] = -1;
                  u[var1][0] = -1;
               }
            }

            ++ea;
            if (ea <= 2) {
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
         for(var2 = 0; var2 < ca; ++var2) {
            if (v[var2] == 0) {
               var1 = s[var2][3];
               if (var3 < var1) {
                  var3 = var1;
               }
            }
         }

         boolean var10 = false;
         if (var4 >= 0) {
            var1 = s[var4][3];
            var10 = var1 > var3;
         }

         if (var10) {
            N(var0);
            var2 = u[var4][2];

            for(var10 = false; !var10 && fa < 3; ++fa) {
               if (var2 < 0) {
                  J(var4);
                  var2 = u[var4][2];
               }

               if (var2 >= 0 && t[var2] != null) {
                  var5 = (Player)t[var2];
                  var10 = var5.getState() == 300;
                  if (!var10) {
                     L();
                  }
               }
            }

            fa = 0;
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
                  v[var4] = 0;
               } catch (Exception var7) {
               }

               try {
                  VolumeControl var9 = (VolumeControl)var5.getControl("VolumeControl");
                  var1 = s[var4][4];
                  var10 = (var1 >> 5 & 1) == 1;
                  if (var10) {
                     var1 = 0 + 255 * z / 125;
                     var9.setLevel(var1);
                  } else {
                     var1 = 0 + 255 * y / 125;
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
         var0 = u[var2][2];
         if (var0 >= 0) {
            Player var1 = (Player)t[var0];

            try {
               if (var1.getState() != 0) {
                  var1.stop();
               }
            } catch (Exception var3) {
            }

            v[var2] = 1;
            var0 = s[var2][4];
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

               t[var2] = null;
               u[var2][0] = -1;
               u[var2][1] = -1;
               u[var2][2] = -1;
               v[var2] = -1;
            }
         }
      }

   }

   public void playerUpdate(Player var1, String var2, Object var3) {
      if (!ia) {
         int var6 = -1;

         int var4;
         for(var4 = 0; var4 < ca; ++var4) {
            Player var8 = (Player)t[var4];
            if (var1 == var8) {
               var6 = var4;
               break;
            }
         }

         int var5 = -1;
         var4 = -1;

         for(int var9 = 0; var9 < ca; ++var9) {
            int var7 = u[var9][2];
            if (var6 == var7 && v[var9] == 0) {
               var5 = u[var9][0];
               var4 = R(var5);
               break;
            }
         }

         if (var4 >= 0) {
            if (var2 == "stopped") {
               O(var5);
            } else if (var2 == "endOfMedia") {
               O(var5);
               v[var4] = 2;
               P(var4);
            }
         }
      }

   }

   public static void K() {
      O();
      ca = s.length;
      if (t == null) {
         t = new Object[ca];
         u = new int[ca][4];
         v = new byte[ca];
         w = new int[ca];
         x = new long[ca];
      }

      int var0;
      for(var0 = 0; var0 < ca; ++var0) {
         u[var0][0] = -1;
         u[var0][1] = -1;
         u[var0][2] = -1;
         v[var0] = -1;
         w[var0] = -1;
         x[var0] = -1L;
         t[var0] = null;
      }

      System.gc();
      boolean var3 = false;

      for(int var2 = 0; var2 < ca; ++var2) {
         var0 = s[var2][4];
         boolean var1 = (var0 >> 2 & 1) == 1;
         boolean var4 = (var0 >> 0 & 1) == 1;
         var4 = var4 && t[var2] == null;
         if (var4) {
            J(var2);
         }

         if (var1) {
            var3 = true;
         }

         C.c = 25 * var2 / ca + 75;
      }

      if (var3 && da == null) {
         da = new D();
         da.start();
      }

      ga = true;
   }

   public static void M(int var0) {
      if (var0 >= 0) {
         int var2 = R(var0);
         if (var2 >= 0) {
            int var1 = s[var2][4];
            if ((var1 >> 3 & 1) == 1 && !MA(1) && !MA(5) || (var1 >> 3 & 1) != 1 && !MA(2) && s[var2][1] != 0 && !MA(5) || MA(0)) {
               return;
            }

            boolean var7 = (var1 >> 2 & 1) == 1;
            int var6 = var0;
            if (s[var2][5] >= 0) {
               Vector var5 = new Vector(1, 1);
               int var4 = s[var2][5];

               for(int var3 = 0; var3 < ca; ++var3) {
                  if (s[var2][5] >= 0) {
                     var0 = s[var3][5];
                     if (var0 == var4) {
                        var5.addElement(new Integer(s[var3][0]));
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
                  da = new D();
                  da.start();
               }

               D.A(var6);
            } else {
               Q(var6);
            }

            if (v[var2] != 0) {
               v[var2] = 4;
            }
         }
      }

   }

   public static void N(int var0) {
      int var1 = R(var0);
      if (var1 >= 0) {
         int var7 = s[var1][3];
         var1 = s[var1][4];
         boolean var6 = (var1 >> 3 & 1) == 1;

         for(int var5 = 0; var5 < ca; ++var5) {
            boolean var8 = s[var5][3] < var7;
            if (v[var5] != 0 && v[var5] != 4) {
               var8 = false;
            }

            if (v[var5] == 2) {
               var8 = true;
            }

            if (var8) {
               int var4 = u[var5][0];
               var1 = s[var5][4];
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
         v[var1] = 1;
         O(var0);
      }

   }

   public static void O(int var0) {
      if (var0 >= 0) {
         int var1 = R(var0);
         var1 = s[var1][4];
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
      int var6 = u[var0][0];
      if (var0 >= 0) {
         int var1 = s[var0][4];
         boolean var2 = (var1 >> 3 & 1) == 1;
         boolean var7 = v[var0] == 2;
         if (s[var0][6] > 0) {
            v[var0] = 2;
            M(s[var0][6]);
            return true;
         }

         if (var2 && var7) {
            int var5 = var6;
            if (s[var0][5] >= 0) {
               int var4 = s[var0][5];
               Vector var9 = new Vector(1, 1);

               for(int var8 = 0; var8 < ca; ++var8) {
                  if (s[var0][5] >= 0) {
                     var1 = s[var8][5];
                     if (var1 == var4 && var6 != s[var8][0]) {
                        var9.addElement(new Integer(s[var8][0]));
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
               var5 = s[var0][0];
            }

            v[var0] = 2;
            M(var5);
            var3 = true;
         }
      }

      return var3;
   }

   public static void L() {
      for(int var1 = 0; var1 < ca; ++var1) {
         int var0 = u[var1][0];
         O(var0);
      }

   }

   public static void Q(int var0) {
      if (!ia) {
         K(var0);
         R(ha);
      }

   }

   public static void M() {
      if (!ia) {
         System.currentTimeMillis();
      }

      ia = true;

      for(int var1 = 0; var1 < ca; ++var1) {
         if (v[var1] == 0 || v[var1] == 4) {
            int var0 = u[var1][0];
            w[var1] = var0;
            O(var0);
            v[var1] = 3;
         }
      }

   }

   public static void N() {
      ia = false;

      for(int var1 = 0; var1 < ca; ++var1) {
         if (v[var1] == 3) {
            int var0 = w[var1];
            M(var0);
         }
      }

   }

   public static int R(int var0) {
      int var2 = -1;

      int var1;
      for(var1 = 0; var1 < ca; ++var1) {
         if (u[var1][0] == var0) {
            var2 = var1;
            break;
         }
      }

      if (var2 == -1) {
         for(var1 = 0; var1 < ca; ++var1) {
            if (s[var1][0] == var0) {
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
         var2 = v[var1];
      }

      return var2;
   }

   private static void O() {
      int var4 = 0;
      int[][] var3 = new int[][]{{0, 0, 0, 0, 3, -1, 1, 19814}, {1, 1, 0, 0, 11, -1, -1, 48410}, {2, 2, 0, 0, 11, -1, -1, 66431}, {3, 3, 0, 0, 11, -1, -1, 145382}, {4, 4, 0, 0, 11, -1, -1, 99005}, {5, 5, 0, 0, 11, -1, -1, 37399}, {6, 6, 0, 0, 11, -1, -1, 58859}, {7, 10, 0, 6, 3, -1, -1, 2116}, {8, 11, 0, 6, 3, -1, -1, 3749}, {9, 20, 0, 0, 3, -1, -1, 906}, {10, 21, 0, 0, 3, -1, -1, 699}, {11, 22, 0, 0, 3, -1, -1, 1247}, {12, 23, 0, 0, 3, -1, -1, 1247}, {13, 24, 0, 0, 3, -1, -1, 1871}, {14, 25, 0, 0, 3, -1, -1, 1410}, {15, 26, 0, 0, 3, -1, -1, 2139}, {16, 27, 0, 0, 3, -1, -1, 1410}, {17, 28, 0, 0, 3, -1, -1, 2139}, {18, 30, 0, 0, 3, -1, -1, 1087}, {19, 31, 0, 0, 3, -1, -1, 518}, {20, 32, 0, 0, 3, -1, -1, 1087}, {21, 33, 0, 0, 3, -1, -1, 647}, {22, 34, 0, 1, 3, -1, -1, 831}, {23, 35, 0, 5, 3, -1, -1, 1088}, {24, 35, 0, 5, 3, -1, -1, 1088}, {25, 35, 0, 5, 3, -1, -1, 1088}, {26, 35, 0, 5, 3, -1, -1, 1088}, {27, 35, 0, 5, 3, -1, -1, 1088}, {28, 35, 0, 5, 3, -1, -1, 1088}, {29, 35, 0, 5, 3, -1, -1, 1088}, {30, 43, 0, 9, 3, -1, -1, 4747}, {31, 50, 0, 0, 3, -1, -1, 704}, {32, 51, 0, 0, 3, -1, -1, 862}, {33, 52, 0, 0, 3, -1, -1, 702}};
      int[] var2 = new int[var3.length];

      int var1;
      for(var1 = 0; var1 < var3.length; ++var1) {
         String var0;
         if (var3[var1][1] < 10) {
            var0 = "/0" + var3[var1][1] + aa[var3[var1][2]];
         } else {
            var0 = "/" + var3[var1][1] + aa[var3[var1][2]];
         }

         InputStream var5 = "".getClass().getResourceAsStream(var0);
         if (var5 == null) {
            var2[var1] = 0;
         } else {
            var2[var1] = 1;
            ++var4;
         }
      }

      s = new int[var4][8];
      var1 = 0;

      for(int var6 = 0; var6 < var3.length; ++var6) {
         if (var2[var6] == 1) {
            System.arraycopy(var3[var6], 0, s[var1], 0, var3[var6].length);
            ++var1;
         }
      }

   }

   static void A(String var0, String var1, boolean var2) {
      int var6 = va - 16;
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
            ma.addElement(var4[var7]);
            if (var7 < var3 - 1) {
               na.addElement("");
            } else {
               na.addElement(var1);
            }
         }

         if (var3 > var4.length) {
            ma.addElement("");
            na.addElement(var1);
         }
      } else {
         ma.addElement(var0);
         na.addElement(var1);
      }

      if (var2) {
         oa = na.size() - 1;
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
      oa = -1;
      ka = true;
      ma.removeAllElements();
      na.removeAllElements();
      ja = I(51 + la);
      A.yb = 126;
      String var5;
      switch(la) {
      case 0:
         A(I(58), "" + A.da[18], false);
         A(I(51), "" + A.da[17], false);
         var0 = A.J(A.da[18]);
         if (var0 >= 0) {
            A(I(66), "" + var0, false);
         } else {
            A(I(63), "", false);
         }

         A(I(57), "" + A.da[19], false);
         break;
      case 1:
         var5 = T((short)((A.da[12] & -65536) >> 16) - (short)(A.da[54] & '\uffff'));
         A(I(55), (short)(A.da[12] & '\uffff') + "/" + (short)((A.da[12] & -65536) >> 16) + var5, false);
         var5 = T((short)((A.da[13] & -65536) >> 16) - (short)((A.da[54] & -65536) >> 16));
         A(I(61), (short)(A.da[13] & '\uffff') + "/" + (short)((A.da[13] & -65536) >> 16) + var5, false);
         var5 = T((short)(A.da[14] & '\uffff') - (short)((A.da[14] & -65536) >> 16));
         A(I(33), "" + (short)(A.da[14] & '\uffff') + var5, false);
         var5 = T((short)(A.da[15] & '\uffff') - (short)((A.da[15] & -65536) >> 16));
         A(I(34), "" + (short)(A.da[15] & '\uffff') + var5, false);
         break;
      case 2:
         int var4 = (short)(A.da[20] & '\uffff') - (short)((A.da[20] & -65536) >> 16);
         int var3 = (short)(A.da[21] & '\uffff') - (short)((A.da[21] & -65536) >> 16);
         int var2 = (short)(A.da[22] & '\uffff') - (short)((A.da[22] & -65536) >> 16);
         int var1 = (short)(A.da[23] & '\uffff') - (short)((A.da[23] & -65536) >> 16);
         var0 = A.Z(A.BA());
         switch(var0) {
         case 0:
            var4 += A.da[51];
            break;
         case 1:
            var3 += A.da[51];
            break;
         case 2:
            var2 += A.da[51];
            break;
         case 3:
            var1 += A.da[51];
         }

         var5 = T(var4);
         A(I(67), "" + (short)(A.da[20] & '\uffff') + var5, false);
         var5 = T(var3);
         A(I(72), "" + (short)(A.da[21] & '\uffff') + var5, false);
         var5 = T(var2);
         A(I(43), "" + (short)(A.da[22] & '\uffff') + var5, false);
         var5 = T(var1);
         A(I(44), "" + (short)(A.da[23] & '\uffff') + var5, false);
         var5 = T((short)(A.da[25] & '\uffff') - (short)((A.da[25] & -65536) >> 16));
         A(I(46), "" + (short)(A.da[25] & '\uffff') + var5, false);
         break;
      case 3:
         A(I(68), "", false);
         A("  " + I(47), "" + A.da[27], false);
         A("  " + I(70), "" + A.da[28], false);
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
      for(var2 = 0; var2 < qa.length; ++var2) {
         qa[var2] = -1;
      }

      int var3;
      for(var3 = 0; var3 < 2; ++var3) {
         if (var0[6 + var3] != -1) {
            var2 = A.sa[(short)((var0[6 + var3] & -65536) >> 16)][3];
            qa[var3] = (short)var2 & '\uffff' | (short)(var0[6 + var3] & '\uffff') << 16 & -65536;
            ++var4;
         }
      }

      for(var2 = 0; var2 < 5; ++var2) {
         if (var1[5 + var2] != -1) {
            qa[2 + var2] = var1[5 + var2];
            ++var4;
         }
      }

      if (var4 != 0) {
         A("\n" + I(60), "", false);

         for(var4 = 0; var4 < qa.length; ++var4) {
            if (qa[var4] != -1) {
               short var15 = (short)(qa[var4] & '\uffff');
               short var16 = (short)((qa[var4] & -65536) >> 16);
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
         A.B(0, A.da[42], false);
         A.B(var0, true);
         var3 = A.Z(var0);
         var2 = A.E(var3, A.da);
         int var13 = A.F((short)(A.da[14] & '\uffff'), A.E(var3, A.da), A.W(var0));
         int var12 = A.G((short)(A.da[14] & '\uffff'), A.E(var3, A.da), A.W(var0));
         int var11 = A.Y(var0);
         int var10 = A.P(var2, (short)(A.da[15] & '\uffff'));
         int var9 = A.B(A.X(var0) + (short)(A.da[26] & '\uffff'), (short)(A.da[14] & '\uffff'), (short)(A.da[15] & '\uffff'), var2);
         int var8 = A.V(var0) * 10 / 4096;
         A.B(var0, false);
         A.B(0, A.da[42], true);
         var2 = A.Z(A.BA());
         var2 = A.E(var2, A.da);
         int var7 = A.F((short)(A.da[14] & '\uffff'), A.E(var3, A.da), A.W(A.BA()));
         int var6 = A.G((short)(A.da[14] & '\uffff'), A.E(var3, A.da), A.W(A.BA()));
         var5 = A.Y(A.BA());
         var4 = A.P(var2, (short)(A.da[15] & '\uffff'));
         var3 = A.B(A.X(A.BA()) + (short)(A.da[26] & '\uffff'), (short)(A.da[14] & '\uffff'), (short)(A.da[15] & '\uffff'), var2);
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
         A.B(1, A.da[41], false);
         A.B(var0, true);
         var3 = A.da[27];
         var2 = A.da[28];
         A.B(var0, false);
         A.B(1, A.da[41], true);
         var5 = A.da[27];
         var4 = A.da[28];
         A("\n" + I(68), "", false);
         A(I(47), "" + var3 + T(var3 - var5), false);
         A(I(70), "" + var2 + T(var2 - var4), false);
         if (var14) {
            A("\n" + I(64 + (short)(var1[10] & '\uffff')), "" + (short)((var1[10] & -65536) >> 16), false);
         }
      }

   }

   static void V(int var0) {
      ma.removeAllElements();
      na.removeAllElements();
      ja = B.F(pa);
      oa = -1;
      ka = false;
      int[] var1 = A.A(pa);
      if ((pa[3] & 64) != 0) {
         A(I(var1[15] + 73), "", false);
         A(I(252), "" + B.G(pa), false);
         A(pa, var1);
      } else if ((pa[3] & 128) != 0) {
         A(I(252), "" + B.G(pa), false);
         A(pa, var1);
      } else if ((pa[3] & 8192) != 0) {
         A(I(77 + var1[10]), "", false);
         A(I(252), "" + B.G(pa), false);
         A(pa, var1);
      } else if ((pa[3] & 256) != 0) {
         A(I(var1[0] + 1), "", false);
         if (var1[3] != 0) {
            if (var1[3] > 0) {
               A(I(29 + var1[6]), "+" + var1[3], false);
            } else {
               A(I(29 + var1[6]), "" + var1[3], false);
            }
         }

         A(I(252), "" + B.G(pa), false);
      } else if ((pa[3] & 1024) != 0) {
         A(I(var1[10]), "", false);
      } else if ((pa[3] & 512) != 0) {
         A(I(var1[3]), "", false);
      }

   }

   static int W(int var0) {
      int var7 = 0;
      int var6 = 4;
      dA |= 1;
      short[] var5 = fA[var0];
      int var1 = B.a[A.tb][3];
      int var4;
      if ((var1 & 32) == 0 && (var1 & 4096) == 0) {
         short var3 = (short)(B.a[A.tb][0] & '\uffff');
         short var10 = (short)((B.a[A.tb][0] & -65536) >> 16);

         for(var4 = B.u[var10][var3]; var4 >= 0 && (B.a[var4][3] & 10176) <= 0; var4 = (short)(B.a[var4][1] & '\uffff')) {
         }
      } else {
         int var2 = B.A(A.tb, (int[])null) + za;
         var4 = (short)(A.iA[var2] & '\uffff');
      }

      boolean var11 = (var1 & 32) != 0 && (B.a[A.tb][13] & 2) == 0;
      boolean var8 = (var1 & 32) != 0 && (B.a[A.tb][13] & 2) != 0;
      A.yb = 126;
      if (var11) {
         ka = true;
         ja = I(232 + za);
         A.yb = 113;
      } else if (var8) {
         ka = false;
         ja = B.F(B.a[A.tb]);
      } else {
         ka = false;
         ja = I(221);
      }

      var1 = 0;

      for(int var13 = 0; var13 < 30; ++var13) {
         if (var4 < 0) {
            var5[var6 + 0] = -1;
            var5[var6 + 1] = -1;
            var5[var6 + 2] = 4;
            var5[var6 + 3] = -1;
            if (iA == var13 + 1) {
               iA = -1;
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
            if (iA == -1) {
               iA = var13 + 1;
            }
         }

         var6 += 4;
      }

      fA[var0] = var5;
      if (var7 == 0 && (B.a[A.tb][3] & 4096) != 0) {
         ja = I(228);
         ka = false;
      }

      if (var7 > 1) {
      }

      if (iA == -1) {
         iA = var1;
      }

      return var7;
   }

   static void P() {
      dA |= 2;
      short[] var6 = fA[19];
      int[][] var5 = A.ea[xa];
      int[][] var4 = (int[][])null;
      ja = I(232 + xa);
      ka = true;
      A.yb = 126;
      switch(xa) {
      case 0:
         var4 = A.ia;
         break;
      case 1:
         var4 = A.ka;
         break;
      case 2:
         cb.Z();
         var4 = A.ma;
         break;
      case 3:
         var4 = A.ua;
         break;
      case 4:
         var4 = A.wa;
         break;
      case 5:
         var4 = A.pa;
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
            if (iA == var1 + 1) {
               iA = -1;
            }
         } else {
            short var7 = (short)var1;
            if ((xa == 0 || xa == 1) && !A.D(var5[var1])) {
               var7 = (short)(var7 | '耀');
            }

            var6[var3 + 0] = (short)var4[var5[var1][4]][0];
            var6[var3 + 1] = 12;
            var6[var3 + 2] = 105;
            var6[var3 + 3] = var7;
            var0 = var1 + 1;
            ++var2;
            if (iA == -1) {
               iA = var1 + 1;
            }
         }

         var3 += 4;
      }

      var3 += 4;
      if ((dA & 1) != 0) {
         var6[var3 + 1] = 11;
      } else {
         var6[var3 + 1] = 6;
      }

      fA[19] = var6;
      if (iA == -1) {
         iA = var0;
      }

      if (var2 > 1) {
      }

   }

   static void X(int var0) {
      short[] var1 = fA[var0];
      ja = B.F(pa);
      ka = false;
      if ((B.a[A.tb][3] & 32) != 0 && (B.a[A.tb][13] & 2) == 0) {
         var1[4] = 218;
         var1[7] = 45;
      } else {
         var1[4] = 250;
         var1[7] = 43;
      }

   }

   static void Y(int var0) {
      short[] var1 = fA[var0];
      ja = B.F(pa);
      ka = false;
      byte var2 = 4;
      var1[4] = 217;
      var1[5] = 14;
      var1[6] = 109;
      var1[7] = 40;
      if ((xa != 0 || ya != A.da[42]) && (xa != 1 || ya != A.da[41]) && (xa != 3 || ya != (short)(A.da[43] & '\uffff') && ya != (short)((A.da[43] & -65536) >> 16) && ya != A.da[44]) && (xa != 4 || ya != A.da[45])) {
         if (xa != 2 && xa != 5) {
            var1[4] = 217;
         } else if (xa == 2 || xa == 5) {
            if (xa != 5 && A.ma[pa[4]][3] != 0) {
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
      if (xa != 5 && xa != 4 && A.da[11] != 0) {
         if ((dA & 1) != 0) {
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
      if (xa != 1 && xa != 5 && (dA & 1) == 0 && (xa != 2 || A.ma[pa[4]][3] != 0)) {
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
      short[] var4 = fA[var0];
      ja = I(244 + (bA - 1));
      A.yb = 126;
      ka = true;
      int var2 = 3;

      int var1;
      for(var1 = 0; var1 < A.za.length; ++var1) {
         A.za[var1][3] = -1;
         if ((short)(A.za[var1][0] & '\uffff') == bA) {
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

      for(var1 = 0; var1 < A.za.length; ++var1) {
         if ((short)(A.za[var1][0] & '\uffff') == bA && (short)((A.za[var1][0] & -65536) >> 16) == 1) {
            var4[var5 + 0] = (short)A.za[var1][1];
            var4[var5 + 1] = 28;
            var4[var5 + 2] = 109;
            var4[var5 + 3] = 37;
            var5 += 4;
            A.za[var1][3] = var2++;
         }
      }

      for(var1 = 0; var1 < A.za.length; ++var1) {
         if ((short)(A.za[var1][0] & '\uffff') == bA && (short)((A.za[var1][0] & -65536) >> 16) == 0) {
            var4[var5 + 0] = (short)A.za[var1][1];
            var4[var5 + 1] = 28;
            var4[var5 + 2] = 109;
            var4[var5 + 3] = 37;
            var5 += 4;
            A.za[var1][3] = var2++;
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
      fA[var0] = var4;
   }

   static void AA(int var0) {
      ja = I(A.za[cA][1]);
      ka = false;
   }

   static void BA(int var0) {
      short[] var2 = fA[var0];
      byte var1 = 12;
      if (A.da[11] != -1 && (short)(A.da[12] & '\uffff') > 0) {
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
      fA[var0] = var2;
   }

   public static void A(short[] var0, int var1, short var2, short var3) {
      if (A.ne >= 0L && A.oe >= 0L) {
         if (A.ne > A.oe) {
            var0[var1 + 0] = 373;
            var0[var1 + 1] = var3;
         } else {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
         }

         var0[var1 + 2] = 101;
         var0[var1 + 3] = -1;
         var1 += 4;
         if (A.ne > A.oe) {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
         } else {
            var0[var1 + 0] = 373;
            var0[var1 + 1] = var3;
         }

         var0[var1 + 2] = 101;
         var0[var1 + 3] = -1;
      } else {
         if (A.oe >= 0L) {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
            var0[var1 + 2] = 101;
         } else if (A.ne >= 0L) {
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
      short[] var1 = fA[var0];
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
         int var7 = 5 + ta;
         int var6 = (var8 >> 1) - 1;
         var5 = var5 + 10 + 0;
         if (var3) {
            var0.setColor(A.i[10]);
            var0.fillRect(ta, var2, va, var9 + 2);
            var0.setColor(A.i[5]);
            A.A(1, ta + var5, var2, va - var5, var9, 281);
            A.A((String)var1, 1, 2, var0);
            A(var2, var8, iA);
         } else if (var2 > -var8 && var2 <= A.g) {
            var0.setColor(A.i[5]);
            A.A(0, ta + var5, var2, va - var5, var9, 281);
            A.A((String)var1, 0, 2, var0);
         }

         if (var2 > -var8 && var2 <= A.g) {
            var0.setClip(ta, ua, va, wa);
            A.B(var7, var2 + var6, 156, oA[var4], var0);
         }
      }

      return var8;
   }

   public static int A(Graphics var0, String var1, int var2, int var3, int var4, boolean var5) {
      if (var0 != null) {
         int var6 = A.f - (A.cc[1386] + A.cc[1529] + 2 * A.cc[1518]);
         var2 = A.cc[1650] / A.cc[1655];
         int var8 = A.cc[1651] / A.cc[1656];
         int var7 = (var6 - var2 * nA) / (nA + 1);
         var6 = var2 + var7;
         var2 = var6 * nA + var7;
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
            var2 = ta;
            if (hA > 17) {
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
               if (var8 >= ua && var8 + var7 <= ua + wa) {
                  var0.drawString(var1[var3], var2 + 0, var8 + 0, 20);
               }

               var8 += var7;
            }
         }

         return hA > 17 ? var5 + var4 + 5 : var5 + var4;
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
            if (var6 >= ua && var6 + var4 <= ua + wa) {
               var0.drawString(var1[var2], var5 + 0, var6 + 0, 17);
            }

            var6 += var4;
         }
      }

      return var4 * var3;
   }

   public static int A(Graphics var0, int var1) {
      int var3 = ma.size();
      int var2 = A.j[2].getHeight();
      if (var0 != null) {
         int var4 = var1 + 5;
         var0.setClip(ta, ua, va, wa - 2);
         var0.setFont(A.j[2]);

         for(var1 = 0; var1 < var3; ++var1) {
            if (var4 >= ua + 5 && var4 + var2 <= ua + wa) {
               var0.drawString((String)ma.elementAt(var1), ta + 8 + 0, var4 + 0, 20);
               if (oa == var1) {
                  var0.setColor(A.i[16]);
               } else {
                  var0.setColor(A.i[5]);
               }

               var0.drawString((String)na.elementAt(var1), ta + va - 8 + 0, var4 + 0, 24);
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
         var0.setClip(ta, ua + 1, va, wa - 2);
         int var6 = A.cc[1650] / A.cc[1655];
         int var5 = A.cc[1651] / A.cc[1656];
         var5 = (var8 + 5 - var5 >> 1) + 1;
         var0.setFont(A.j[1]);
         if (var4) {
            var0.setColor(A.i[10]);
            var0.fillRect(ta, var3, va, var8 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(ta, var3, va - 1, var8 + 5);
            A.B(ta + 3, var3 + var5, 150, var2, var0);
            A.A(1, ta + 2 + var6 + 5, var3 + 1, va - var6 - 5 - 6, var8 + 5, 409);
            A.A((String)var1, 1, 1, var0);
            A(var3, var7, iA);
         } else if (var3 > -var7 && var3 <= A.g) {
            var0.setColor(A.i[9]);
            var0.fillRect(ta, var3, va, var8 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(ta, var3, va - 1, var8 + 5);
            A.B(ta + 3, var3 + var5, 150, var2, var0);
            A.A(0, ta + 2 + var6 + 5, var3 + 1, va - var6 - 5 - 6, var8 + 5, 281);
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
         if (hA == 19) {
            var1 = B.F(A.ea[xa][var13]);
            int[] var15 = A.A(A.ea[xa][var13]);
            var10 = var15[2];
            if (xa == 0 && var13 == A.da[42]) {
               var12 = A.i[11];
               var11 = A.i[12];
            } else if (xa == 2 && A.ea[xa][var13][6] > 1) {
               var1 = A.ea[xa][var13][6] + "x " + var1;
            } else if (xa == 1 && var13 == A.da[41]) {
               var12 = A.i[11];
               var11 = A.i[12];
            } else if (xa == 4 && var13 == A.da[45]) {
               var12 = A.i[11];
               var11 = A.i[12];
            } else if (xa == 3) {
               if (var15[10] == 1 && A.da[44] == var13) {
                  var12 = A.i[11];
                  var11 = A.i[12];
               } else if (var15[10] == 0 && ((short)(A.da[43] & '\uffff') == var13 || (short)((A.da[43] & -65536) >> 16) == var13)) {
                  var12 = A.i[11];
                  var11 = A.i[12];
               }
            }
         } else if (hA == 21) {
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
            var0.fillRect(ta, var3, va, var7 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(ta, var3, va - 1, var7 + 5);
            var14 = (var7 + 5 - var8 >> 1) + 1;
            A.B(ta + 3, var3 + var14, 150, var10, var0);
            A.A(1, ta + 2 + var9 + 5, var3 + 1, va - var9 - 5 - 4, var7 + 5, 409);
            if (var5) {
               var0.setColor(A.i[16]);
            }

            A.A((String)var1, 1, 1, var0);
            A(var3, var6, iA);
         } else if (var3 > -var6 && var3 <= A.g) {
            var0.setColor(var12);
            var0.fillRect(ta, var3, va, var7 + 5);
            var0.setColor(A.i[5]);
            var0.drawRect(ta, var3, va - 1, var7 + 5);
            var14 = (var7 + 5 - var8 >> 1) + 1;
            A.B(ta + 3, var3 + var14, 150, var10, var0);
            A.A(0, ta + 2 + var9 + 5, var3 + 1, va - var9 - 5 - 4, var7 + 5, 281);
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
         if (gA) {
            var2 = iA;
            short[] var1 = fA[hA];
            if (var2 >= 0) {
               short var9 = var1[(var2 << 2) + 2];
               var8 = var9 != 103 && var9 != 104 && var9 != 108;
            }

            var7 = jA.size() > 0;
            if (rA >= 0) {
               var6 = rA;
               var4 = tA;
               var8 = true;
            }

            if (sA >= 0) {
               var5 = sA;
               var3 = uA;
               var7 = true;
            }

            if (qA == 35) {
               var7 = false;
            }

            if (pA == 35) {
               var8 = false;
            }
         }

         int var10;
         if (hA <= 17) {
            var2 = 10 + (A.cc[var4 * 11 + 0] / A.cc[var4 * 11 + 5] >> 1);
            var10 = A.g - 5;
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

         var3 = ua + wa + 2;
         var2 = A.cc[1639] / A.cc[1644];
         var10 = ra - ua;
         if (var10 < 0) {
            A.B((A.f >> 1) - var2, var3, 149, 0, var0);
         }

         if (var10 > wa - sa) {
            A.B(A.f >> 1, var3, 149, 1, var0);
         }
      }

      return 0;
   }

   public static void B(Graphics var0) {
      var0.setClip(0, 0, A.f, A.g);
      var0.setColor(A.i[8]);
      var0.fillRect(0, 0, A.f, A.g);
      int var4 = A.f - 10;
      int var3 = A.g - 5;
      int var2 = 6;
      if (hA == 0) {
         var2 = 6 + A.cc[1728];
         var4 = A.f - 10;
         A.B(A.f >> 1, 3, 157, 0, var0);
      }

      int var1;
      if (hA != 0) {
         var0.setColor(A.i[4]);
         var1 = A.j[2].getHeight() + 5;
         var0.fillRect(5, var2, var4, var1);
         var0.setColor(A.i[6]);
         var0.drawRect(5, var2, var4, var1);
         var0.drawRect(6, var2 + 1, var4 - 1, var1 - 1);
         var0.setColor(A.i[5]);
         var0.drawRect(5, var2, var4 - 1, var1 - 1);
         var2 += var1 - 1;
      }

      var1 = A.f - 10;
      var3 -= var2 + A.cc[1486] + 3;
      var0.setColor(A.i[3]);
      var0.fillRect(5, var2, var1, var3);
      var0.setColor(A.i[6]);
      var0.drawRect(5, var2, var1, var3);
      var0.drawRect(6, var2 + 1, var1 - 1, var3 - 1);
      var0.setColor(A.i[5]);
      var0.drawRect(5, var2, var1 - 1, var3 - 1);
      A.B(5, var2, 152, 0, var0);
      A.B(5 + var1, var2, 152, 0, 0, 2, var0);
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
            var0.fillRect(ta, var2, va, var5 + 2);
            var0.setColor(A.i[5]);
            A.A(1, ta, var2, va, var5, 284);
            A.A((String)var1, 1, 2, var0);
            A(var2, var4, iA);
         } else if (var2 > -var4 && var2 <= A.g) {
            var0.setColor(A.i[5]);
            A.A(0, ta, var2, va, var5, 284);
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
         eA = true;
         gA = false;
         dA = 0;
         iA = -1;
         A.D();
         A.H();
         A.AA();
         A.r.A(cb, 13, 7, 3, false);
         (new Thread(A.r)).start();
         break;
      case 2:
         cb.A(4);
         db.destroyApp(false);
         break;
      case 3:
         jA.removeAllElements();
         gA = false;
         dA = 0;
         iA = -1;
         A.D();
         break;
      case 4:
         A.FA(2);
      case 34:
         eA = false;
         jA.removeAllElements();
         B.D();
         cb.A(5);
         LA(0);
         L();
         M(1);
         gA = true;
         break;
      case 5:
         if (c != null) {
            if (C()) {
               cb.A(4);
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
         } else if (eA) {
            if (A.oA > 0) {
               if (S(2) != 0) {
                  L();
                  M(2);
               }
            } else if (S(A.pA) != 0) {
               L();
               M(A.pA);
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
            E(2, 1);
            W();
         }

         cb.A(2);
         break;
      case 10:
         E(0, 1);
         W();
         cb.A(2);
         break;
      case 11:
         gA = false;
         dA = 0;
         iA = -1;
         A.D();
         break;
      case 12:
         var11 = fA[hA];
         ya = var11[iA * 4 + 3] & 32767;
         pa = A.ea[xa][ya];
         jA.push(new Integer(hA));
         jA.push(new Integer(iA));
         LA(20);
         break;
      case 13:
         int[] var12 = A.ea[xa][ya];
         if ((var12[3] & 256) != 0) {
            var9 = I(224) + "\n" + I(242) + ": @x@@";
            A.A(var9, B.F(var12), 26, 101, 1, var12[6], 0);
         } else {
            A.A(xa, ya, 1, false, true);
            if (hA != 19 && hA != 21) {
               U();
            } else {
               B(hA);
            }
         }
         break;
      case 14:
         A.G(xa, ya);
         if (hA != 19 && hA != 21) {
            U();
         } else {
            B(hA);
         }
         break;
      case 15:
         gA = false;
         dA = 0;
         iA = -1;
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
            var0 = B.A(A.tb, (int[])null) + za;
            var4 = (short)(A.iA[var0] & '\uffff');
         }

         int var10 = var4;
         int var8 = 0;
         var1 = -1;

         while(var4 != -1) {
            if (aA == var8) {
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

            if (hA != 19 && hA != 21) {
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

               if (hA != 19 && hA != 21) {
                  A.F((short)(A.da[0] & '\uffff'), (short)((A.da[0] & -65536) >> 16));
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
         var11 = fA[hA];
         var0 = var11[iA * 4 + 3] & 32767;
         pa = B.a[var0];
         aA = iA - 1;
         jA.push(new Integer(hA));
         jA.push(new Integer(iA));
         LA(22);
         break;
      case 22:
         int[] var7 = A.ea[xa][ya];
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
               A.bd = 1;
               DA(29);
               break;
            }

            var9 = I(224) + "\n" + I(242) + ": @x@@";
            A.A(var9, B.F(var7), 29, 101, 1, var7[6], 0);
         } else {
            if ((var7[3] & 256) == 0) {
               if (hA != 19 && hA != 21) {
                  U();
               }

               A.A(false);
               break;
            }

            var9 = I(224) + "\n" + I(242) + ": @x@@";
            A.A(var9, B.F(var7), 25, 101, 1, var7[6], B.G(var7));
         }

         if (hA != 19 && hA != 21) {
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
         A.A(xa, ya, A.bd, false, true);
         if (hA != 19 && hA != 21) {
            U();
         } else {
            B(hA);
         }
         break;
      case 27:
         jA.push(new Integer(hA));
         jA.push(new Integer(iA));
         LA(24);
         break;
      case 28:
         for(var0 = 0; var0 < A.za.length; ++var0) {
            if (A.za[var0][3] == iA) {
               cA = var0;
               break;
            }
         }

         jA.push(new Integer(hA));
         jA.push(new Integer(iA));
         LA(26);
         break;
      case 29:
         short var3 = (short)(A.da[0] & '\uffff');
         short var2 = (short)((A.da[0] & -65536) >> 16);
         var1 = (short)(B.a[A.tb][0] & '\uffff');
         var6 = (short)((B.a[A.tb][0] & -65536) >> 16);
         A.da[0] = (short)var1 & '\uffff' | (short)var6 << 16 & -65536;
         A.A(xa, ya, A.bd, false, true);
         A.da[0] = (short)var3 & '\uffff' | (short)var2 << 16 & -65536;
         if (hA != 19 && hA != 21) {
            U();
         } else {
            B(hA);
         }
         break;
      case 30:
         eA = true;
         gA = false;
         dA = 0;
         iA = -1;
         A.t = 5;
         A.H();
         A.AA();
         A.GA(2);
         A.r.A(cb, A.da[11], (short)(A.da[0] & '\uffff'), (short)((A.da[0] & -65536) >> 16), false);
         (new Thread(A.r)).start();
         break;
      case 31:
         if (!A.HA(2) && !A.HA(3)) {
            DA(1);
         } else {
            jA.push(new Integer(hA));
            jA.push(new Integer(iA));
            LA(1);
         }
         break;
      case 32:
         A.FA(2);
         break;
      case 33:
         if ((short)(A.da[12] & '\uffff') <= 0) {
            DA(34);
         } else {
            jA.push(new Integer(hA));
            jA.push(new Integer(iA));
            if (A.da[11] == -1) {
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
         eA = true;
         gA = false;
         dA = 0;
         iA = -1;
         A.t = 5;
         A.H();
         A.AA();
         A.GA(3);
         A.r.A(cb, A.da[11], (short)(A.da[0] & '\uffff'), (short)((A.da[0] & -65536) >> 16), false);
         (new Thread(A.r)).start();
         break;
      case 40:
         LA(15);
         break;
      case 100:
         A.fd[0] = 1;
         A.O(A.fd, A.gd);
         A.fd = null;
         A.gd = -1;
         A.A(10, 0, 0, 0, 0, true);
         A.r.A(cb, A.sC, A.tC, A.uC, false);
         (new Thread(A.r)).start();
         break;
      case 101:
         if (A.fd != null) {
            A.fd[0] = 0;
            A.fd = null;
            A.gd = -1;
         }

         A.nC = false;
         break;
      case 102:
         A.A(10, 0, 0, 0, 0, true);
         A.r.A(cb, A.sC, A.tC, A.uC, true);
         (new Thread(A.r)).start();
         break;
      case 103:
         var0 = A.dC[A.sC][9];
         A.dC[A.sC][var0++] = 1;
         A.dC[A.sC][9] = var0;
         A.dC[A.sC][0] = 1;
         break;
      case 104:
         var0 = A.dC[A.sC][9];
         A.dC[A.sC][var0++] = 0;
         A.dC[A.sC][9] = var0;
         A.dC[A.sC][0] = 1;
         break;
      case 105:
         A.dC[A.sC][0] = 1;
      }

   }

   static int EA(int var0) {
      int var2 = 0;
      short[] var1 = fA[var0];
      mA = GA(var0);
      int var4 = 0;

      for(int var3 = 0; var3 < mA; ++var3) {
         short var5 = var1[(var3 << 2) + 2];
         String[] var6;
         switch(var5) {
         case 50:
            var6 = lA[var4++];
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
            var6 = lA[var4++];
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
      short[] var1 = fA[var0];
      short var3 = var1[3];
      short var2 = var1[2];
      boolean var4 = false;
      int var5;
      if (var2 == 6 && var3 == 1) {
         ta = A.cc[1617] / A.cc[1622];
         ua = A.C(true) + 3;
         va = A.f - (A.cc[1617] / A.cc[1622] + A.cc[1617] / A.cc[1622]);
         wa = A.g - (A.C(true) + 3 + A.cc[1607] + A.cc[1387] + A.cc[1617] / A.cc[1622] + A.cc[1640] + 5);
         var5 = A.cc[1650] / A.cc[1655] + 5;
         A.A(0, ta + var5, ua, va, wa);
         A.A(1, ta + var5, ua, va, wa);
      } else if (hA == 0) {
         ta = 12;
         ua = 10 + A.cc[1728] + A.cc[1486];
         va = A.f - 2 * ta;
         wa = A.g - 5 - 5 - A.cc[1486] - ua - (A.cc[1640] + 5);
         A.A(0, ta, ua, va, wa);
         A.A(1, ta, ua, va, wa);
      } else {
         var5 = A.j[2].getHeight() + 5;
         ta = 12;
         ua = 8 + var5 + A.cc[1486];
         va = A.f - 2 * ta;
         wa = A.g - 5 - (ua + A.cc[1486] + 4) - (A.cc[1640] + 5);
         A.A(2, ta + 2, 6, va - 4, var5, 28);
         A.A(0, ta, ua, va, wa);
         A.A(1, ta, ua, va, wa);
      }

      switch(var0) {
      case 1:
         CA(var0);
         break;
      case 14:
         BA(var0);
         break;
      case 18:
         dA = 0;
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
         dA |= 8;
         U(var0);
         break;
      case 24:
         V(var0);
         break;
      case 25:
         dA |= 4;
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
         String var8 = "(c) 20" + var7[8] + var7[9] + ",\n" + I(473) + "\n" + I(13) + "\nv " + db.getAppProperty("MIDlet-Version");
         var3 = A(var8, var1, var2, 0);
         break;
      case 2:
         var3 = A(I(303) + ", " + I(293) + ":\n" + I(201) + "\n\n" + I(300) + ", " + I(297) + ":\n" + I(195) + "\n\n" + I(302) + ", " + I(295) + ":\n" + I(199) + "\n\n" + I(304) + ", " + I(296) + ":\n" + I(203) + "\n\n" + I(306) + ", " + I(294) + ":\n" + I(207) + "\n\n" + I(299) + ":\n" + I(193) + "\n\n" + I(301) + ":\n" + I(197) + "\n\n" + I(305) + ":\n" + I(205) + "\n\n" + I(307) + ":\n" + I(209) + "\n\n" + I(309) + ":\n" + I(213) + "\n\n" + I(308) + ":\n" + I(189) + "\n\n" + I(310) + ":\n" + I(191) + "\n\n" + I(311) + ":\n" + I(211), var1, var2, 0);
         break;
      case 3:
         var3 = A(I(303) + ", " + I(293) + ":\n" + I(200) + "\n\n" + I(300) + ", " + I(297) + ":\n" + I(194) + "\n\n" + I(302) + ", " + I(295) + ":\n" + I(198) + "\n\n" + I(304) + ", " + I(296) + ":\n" + I(202) + "\n\n" + I(306) + ", " + I(294) + ":\n" + I(206) + "\n\n" + I(309) + ":\n" + I(212) + "\n\n" + I(310) + ":\n" + I(190) + "\n\n" + I(311) + ":\n" + I(210) + "\n\n\n" + I(298) + ":\n" + I(407), var1, var2, 0);
         break;
      case 4:
         if ((short)(A.za[cA][0] & '\uffff') == 1) {
            var0 = A.za[cA][1] + A.za[cA][2];
            var3 = A(I(var0), var1, var2, 0);
         }
         break;
      case 5:
         int var6 = A.za[cA][1];
         int var5 = var6 + A.za[cA][2];
         if ((short)(A.za[cA][0] & '\uffff') == 1) {
            --var5;
         }

         String var4 = "";

         for(var0 = var5; var0 > var6; --var0) {
            if ((short)(A.za[cA][0] & '\uffff') != 1 && var0 == var5) {
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
      var1 = ua + wa;
      if (var3 > var1) {
         var0 = var3 - var1;
         ra -= var0;
      } else if (var0 < ua) {
         var0 = ua - var0;
         ra += var0;
      }

      var0 = IA(hA);
      if (var2 == var0) {
         ra = ua;
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
      short[] var5 = fA[var0];
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
      short[] var5 = fA[var0];
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
      short[] var2 = fA[var0];
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
      short[] var4 = fA[var0];
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
      short[] var3 = fA[var0];
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
      if (var0 >= 0 && var0 < fA.length) {
         short[] var2 = fA[var0];

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
      if (var0 >= 0 && var0 < fA.length) {
         short[] var6 = fA[var0];
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
            fA[var0] = var8;
         }
      }
   }

   static void R() {
      boolean var0 = HA(hA) > 0;
      if (var0) {
         short[] var2 = fA[hA];
         short var1 = var2[iA * 4 + 2];
         int var3 = var2.length / 4;
         if (var1 == 103 || var1 == 104 || var1 == 108) {
            var3 = sa - ua - wa;
            if (-ra < var3) {
               ra -= A.j[2].getHeight();
            }

            if (vA) {
               if (zA >= 0) {
                  iA = zA;
               } else {
                  ++iA;
               }
            }

            return;
         }

         ++iA;
         if (iA >= var3) {
            iA = 0;
            ra = ua;
         }

         short var4 = var2[iA * 4 + 2];
         if (var4 <= 99 || var4 >= 200) {
            R();
         }
      }

      Q();
   }

   static void S() {
      boolean var0 = HA(hA) > 0;
      int var3 = iA;
      if (var0) {
         short[] var2 = fA[hA];
         short var1 = var2[iA * 4 + 2];
         if (var1 != 103 && var1 != 104 && var1 != 108) {
            if (ab >= 0 && ab < iA) {
               iA = ab;
            } else {
               --iA;
            }
         } else {
            if (ra < ua) {
               ra += A.j[2].getHeight();
            } else {
               --iA;
            }

            if (wA && var3 == iA) {
               --iA;
            }
         }

         int var6 = IA(hA);
         int var4 = JA(hA);
         if (iA < var6) {
            iA = var4;
         }

         short var5 = var2[iA * 4 + 2];
         if (var5 <= 99 || var5 >= 200) {
            S();
         }
      }

   }

   static void T() {
      int var0 = fA[hA].length / 4;
      if (iA >= 0 && iA < var0) {
         short[] var2 = fA[hA];
         int var1 = iA * 4;
         short var7 = var2[var1 + 1];
         short var8 = var2[var1 + 3];
         short var9 = var2[var1 + 2];
         switch(var9) {
         case 100:
         case 107:
            jA.push(new Integer(hA));
            jA.push(new Integer(iA));
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
            for(var11 = 0; var11 <= iA; ++var11) {
               var10 = fA[hA];
               var9 = var10[(var11 << 2) + 2];
               if (var9 == 102) {
                  ++var6;
               }
            }

            int var5 = GA(hA);
            short var4 = var8;
            if (var8 >= 0) {
               int var3 = 0;

               for(var11 = 0; var11 < var5; ++var11) {
                  var10 = fA[hA];
                  var8 = var10[(var11 << 2) + 2];
                  if (var8 == 102) {
                     var8 = var10[(var11 << 2) + 3];
                     if (var8 == var4) {
                        oA[var3] = 0;
                     }

                     ++var3;
                  }
               }
            }

            oA[var6] = 1;
            C(var7, 1);
         case 103:
         case 104:
         case 108:
         }
      }

   }

   static void B(short var0) {
      boolean var6 = A(var0);
      ra = ua;
      short[] var5 = fA[hA];
      mA = GA(var0);
      if (kA == null || kA.length != mA) {
         kA = new String[mA];
      }

      int var4 = 0;
      int var3 = 0;
      nA = 0;
      pA = -1;
      qA = -1;
      rA = -1;
      sA = -1;
      tA = -1;
      uA = -1;

      short var1;
      short var2;
      for(var2 = 0; var2 < mA; ++var2) {
         var1 = var5[(var2 << 2) + 2];
         switch(var1) {
         case 2:
            qA = var5[(var2 << 2) + 1];
            sA = var5[(var2 << 2) + 3];
            uA = var5[(var2 << 2) + 0];
            break;
         case 3:
            pA = var5[(var2 << 2) + 1];
            rA = var5[(var2 << 2) + 3];
            tA = var5[(var2 << 2) + 0];
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
            kA[var2] = A(var0, var2);
            break;
         case 106:
         case 107:
            ++nA;
            kA[var2] = A(var0, var2);
         }
      }

      if (var3 > 0) {
         if (oA == null || oA.length != var3) {
            oA = new byte[var3];
         }

         var3 = 0;

         for(int var7 = 0; var7 < mA; ++var7) {
            var1 = var5[(var7 << 2) + 2];
            if (var1 == 102) {
               var1 = var5[(var7 << 2) + 1];
               oA[var3] = FA(var1);
               ++var3;
            }
         }
      }

      if (var4 > 0) {
         lA = new String[var4][];
         var3 = 0;

         for(var2 = 0; var2 < mA; ++var2) {
            var1 = var5[(var2 << 2) + 2];
            if (var1 != 103 && var1 != 50) {
               if (var1 == 104) {
                  var1 = var5[(var2 << 2) + 1];
                  lA[var3] = A(var1, A.j[2], va - 8 - 8);
                  ++var3;
               }
            } else {
               lA[var3] = A(A(var0, var2), A.j[2], va - 6, 0);
               ++var3;
            }
         }
      }

      sa = EA(var0);
      if (!var6) {
         iA = IA(var0);
      }

      if (iA < 0 || iA * 4 + 2 >= fA[var0].length || fA[var0][iA * 4 + 2] <= 99 || fA[var0][iA * 4 + 2] >= 200) {
         iA = IA(var0);
      }

   }

   static void KA(int var0) {
      kA = null;
      lA = (String[][])null;
      mA = 0;
   }

   static void C(Graphics var0) {
      if (A.c) {
         A.A(var0);
      } else if (hA != -1) {
         if (hA <= 17) {
            B(var0);
         }

         short[] var13 = fA[hA];
         int var12 = ra;
         int var11 = 0;
         int var10 = 0;
         int var9 = 0;
         vA = false;
         wA = false;
         boolean var8 = false;
         xA = false;
         zA = -1;
         ab = -1;

         for(int var7 = 0; var7 < mA; ++var7) {
            short var6 = var13[(var7 << 2) + 2];
            if (var6 >= 0) {
               String var5;
               if (kA != null && kA[var7] != null) {
                  var5 = kA[var7];
               } else {
                  var5 = "null";
               }

               var0.setClip(ta, ua, va, wa);
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
                     if ((dA & 1) != 0) {
                        var0.setClip(0, 0, A.f, A.g);
                        var0.setColor(A.i[5]);
                        int var20 = A.cc[1518] + A.cc[1386] - 1 + 5;
                        var3 = A.f - var20 - 1 - 5;
                        var15 = A.j[2].getHeight() + 5 + 5;
                        var14 = A.g - var15 - (A.cc[1387] - var15 >> 1) - A.cc[1607];
                        A.A(10, var20 + 4, var14 + 4, var3 - 8, var15 - 8, 156);
                        A.A((String)(I(406) + I(309)), 10, 2, var0);
                     }
                  }
                  break;
               case 50:
                  String[] var18 = lA[var11];
                  ++var11;
                  var14 = A(var0, var18, var12);
                  var12 += var14;
                  break;
               case 102:
               default:
                  boolean var21 = var7 == iA;
                  if (var6 == 102) {
                     var3 = A((Graphics)null, var5, var12, var21, var10);
                  } else {
                     var3 = A((Graphics)null, var5, var12, var21);
                  }

                  xA = true;
                  var15 = var12 + var3;
                  var14 = ua + wa;
                  if ((var15 <= ua || var12 >= var14) && !var21) {
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

                     if (var8 && var7 > iA) {
                        vA = true;
                        if (zA < 0) {
                           zA = var7;
                        }
                     }

                     xA = true;
                     yA = var7;
                  }

                  var12 += var3;
                  break;
               case 103:
               case 104:
                  String[] var22 = lA[var11];
                  ++var11;
                  byte var4 = (byte)(var13[(var7 << 2) + 3] & 255);
                  var3 = A((Graphics)null, var22, var12, -1, var4);
                  var15 = var12 + var3;
                  var14 = ua + wa;
                  if (var15 > var14) {
                  }

                  if (var15 > ua && var12 < var14) {
                     byte var16 = (byte)(var13[(var7 << 2) + 3] >> 8 & 255);
                     A(var0, var22, var12, var16, var4);
                     var8 = true;
                     if (xA && yA < iA) {
                        wA = true;
                        ab = var7;
                     }
                  }

                  var12 += var3;
                  break;
               case 105:
                  var2 = var7 == iA;
                  var1 = var13[(var7 << 2) + 3];
                  var14 = A(var0, var5, var2, var12, var1);
                  var12 += var14;
                  break;
               case 106:
               case 107:
                  var2 = var7 == iA;
                  var1 = var13[(var7 << 2) + 3];
                  var12 += A(var0, var5, var12, var1, var9, var2);
                  ++var9;
                  break;
               case 108:
                  var14 = A(var0, var12);
                  var12 += var14;
                  break;
               case 109:
                  var2 = var7 == iA;
                  var1 = var13[(var7 << 2) + 3];
                  var12 += A(var0, var5, var1, var12, var2);
               }
            }
         }

         if (hA == 19 || hA == 21) {
            var0.setColor(A.i[5]);
            var0.drawLine(ta, ua, ta + va - 1, ua);
         }

         A(var0);
      }
   }

   static void U() {
      if (!jA.empty()) {
         int var1 = (Integer)jA.pop();
         int var0 = (Integer)jA.pop();
         iA = var1;
         LA(var0);
         if (fA[hA][var1 * 4 + 2] > 99 && fA[hA][var1 * 4 + 2] < 200) {
            iA = var1;
         }
      }

   }

   static void LA(int var0) {
      short var1 = (short)var0;
      KA(hA);
      hA = var1;
      B(var1);
   }

   public static void V() {
      if (B((int)0)) {
         bb = D(0);
         if (bb.length != 7) {
            bb = new byte[7];
         }
      } else {
         bb[0] = 0;
         bb[1] = 0;
         bb[2] = 0;
         bb[5] = 0;
         bb[6] = 0;
         bb[3] = 1;
         bb[4] = 0;
         W();
      }

   }

   public static void W() {
      A(0, bb);
   }

   public static void E(int var0, int var1) {
      if (var0 >= -1 && var0 < bb.length && (var1 == 0 || var1 == 1)) {
         if (var0 == 1 && var1 == 1) {
            bb[1] = 1;
            bb[2] = 0;
            bb[5] = 0;
         } else if (var0 == 2 && var1 == 1) {
            bb[1] = 0;
            bb[2] = 1;
            bb[5] = 0;
         } else if (var0 == 0 && var1 == 1) {
            bb[1] = 0;
            bb[2] = 0;
            bb[5] = 0;
         } else if (var0 == 5 && var1 == 1) {
            bb[1] = 0;
            bb[2] = 0;
            bb[5] = 1;
         } else {
            bb[var0] = (byte)var1;
         }

      }
   }

   public static boolean MA(int var0) {
      if (var0 >= -1 && var0 < bb.length) {
         if (var0 == 0) {
            return bb[1] == 0 && bb[2] == 0 && bb[5] == 0;
         } else {
            return bb[var0] == 1;
         }
      } else {
         return false;
      }
   }

   public HG() {
      db = this;
      if (cb == null) {
         cb = new A(this);
         A.i = E();
         A.j = F();
         Display.getDisplay(this).setCurrent(cb);
         this.D();
         A.e = new Thread(cb);
         A.e.start();
         V();
         cb.A(1);
      }

   }

   public void destroyApp(boolean var1) {
      this.notifyDestroyed();
   }

   public void pauseApp() {
      if (cb != null) {
         A.WB();
      }

   }

   protected void startApp() {
   }

   public void commandAction(Command var1, Displayable var2) {
   }

   static {
      l = new boolean[j.length];
      m = new String[j.length][];
      o = 0;
      p = "";
      q = (String[][])null;
      r = "";
      s = (int[][])null;
      y = 100;
      z = 100;
      aa = new String[]{".mid", ".amr", ".wav", ".mp3", ".ott", ".mmf", ".spf", ".wav"};
      ba = new String[]{"audio/midi", "audio/amr", "audio/x-wav", "audio/mpeg", "", "audio/mmf", "", "audio/x-wav"};
      ca = 0;
      ea = 0;
      fa = 0;
      ga = false;
      ha = -1;
      ia = false;
      ja = "";
      ka = true;
      la = 0;
      ma = new Vector();
      na = new Vector();
      oa = -1;
      pa = null;
      qa = new int[7];
      ra = 0;
      sa = 0;
      ta = 0;
      ua = 0;
      va = 0;
      wa = 0;
      xa = 0;
      ya = 0;
      za = 0;
      aA = 0;
      bA = 1;
      cA = 0;
      dA = 0;
      eA = false;
      fA = (short[][])null;
      gA = true;
      hA = -1;
      iA = 0;
      jA = new Stack();
      kA = null;
      lA = (String[][])null;
      mA = 0;
      nA = 0;
      pA = -1;
      qA = -1;
      rA = -1;
      sA = -1;
      tA = -1;
      uA = -1;
      vA = false;
      wA = false;
      xA = false;
      yA = 0;
      zA = -1;
      ab = -1;
      bb = new byte[7];
      cb = null;
      db = null;
   }
}
