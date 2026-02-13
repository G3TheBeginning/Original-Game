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
   public static final Random a = new Random();
   public static String b;
   public static int g = -1;
   public static int i = 0;
   public static ByteArrayOutputStream a;
   public static DataOutputStream a;
   public static ByteArrayInputStream a;
   public static DataInputStream a;
   public static String[] d = new String[]{"MAIN", "DIALOGUE_INITRIA", "DIALOGUE_KHORINIS", "DIALOGUE_MISC", "QUESTS"};
   public static byte[] c = new byte[]{1, 2, 2, 2, 2};
   public static boolean[] a;
   public static String[][] b;
   public static byte[] d;
   public static byte a;
   public static String a;
   public static String[][] a;
   public static String c;
   public static int[][] b;
   public static Object[] a;
   public static int[][] a;
   public static byte[] b;
   public static int[] a;
   public static long[] a;
   public static short b;
   public static short a;
   public static final String[] c;
   public static final String[] a;
   public static int u;
   public static <undefinedtype> a;
   public static boolean a;
   public static boolean k;
   public static boolean h;
   public static boolean o;
   public static boolean p;
   public static boolean b;
   public static boolean j;
   public static boolean m;
   public static int w;
   public static int k;
   public static boolean f;
   public static int x;
   public static boolean c;
   public static long a;
   public static String d;
   public static boolean d;
   public static int m;
   public static Vector a;
   public static Vector b;
   public static int b;
   public static int[] b;
   public static int[] c;
   public static int l;
   public static int q;
   public static int F;
   public static int A;
   public static int n;
   public static int f;
   public static int a;
   public static int c;
   public static int G;
   public static int B;
   public static int h;
   public static int C;
   public static int v;
   public static boolean e;
   public static short[][] a;
   public static boolean l;
   public static short c;
   public static int j;
   public static Stack a;
   public static String[] b;
   public static String[][] c;
   public static int p;
   public static int e;
   public static byte[] a;
   public static int E;
   public static int s;
   public static int z;
   public static int r;
   public static int y;
   public static int t;
   public static boolean i;
   public static boolean n;
   public static boolean g;
   public static int d;
   public static int o;
   public static int D;
   private static byte[] e;
   public static c a;
   public static HG a;

   public static final DataInputStream a(String var0) throws NullPointerException {
      DataInputStream var1 = null;

      try {
         InputStream var2;
         if ((var2 = a.getClass().getResourceAsStream(var0)) != null) {
            var1 = new DataInputStream(var2);
         }
      } catch (Exception var3) {
      }

      if (var1 == null) {
         throw new NullPointerException();
      } else {
         return var1;
      }
   }

   public static final String[] a(String var0, Font var1, int var2, int var3) {
      var0.length();
      int var5 = 0;
      boolean var6 = false;
      boolean var7 = false;
      int var8 = 0;
      boolean var9 = false;
      String var10 = "";
      String var11 = null;
      String var12 = "";
      boolean var13 = false;
      if (var3 > 0) {
         var2 -= var3 * var1.charWidth(' ');
      }

      int var16;
      while(var0.length() > 0) {
         int var17 = var0.length();

         int var14;
         for(var14 = 0; var14 < a.length; ++var14) {
            if ((var16 = var0.indexOf(a[var14])) < var17 && var16 != -1) {
               var17 = var16;
            }
         }

         if (var17 == var0.length()) {
            var11 = var0.substring(0, var17);
            var0 = "";
         } else {
            var11 = var0.substring(0, var17 + 1);
            var0 = var0.substring(var17 + 1, var0.length());
         }

         int var18;
         if (var11.length() <= 1) {
            var18 = var1.charsWidth(var11.toCharArray(), 0, var11.length());
         } else {
            var18 = var1.charsWidth(var11.trim().toCharArray(), 0, var11.trim().length());
         }

         int var19 = 0;
         if (var11.trim().length() != var11.length()) {
            var19 = var1.charWidth(' ');
         }

         if (var5 + var18 < var2 && var10.indexOf(10) == -1) {
            var10 = var10 + var11;
            var5 += var18 + var19;
         } else {
            var14 = 0;
            if (var18 > var2) {
               label163:
               while(true) {
                  while(true) {
                     if (var14 >= var11.length()) {
                        break label163;
                     }

                     if (var5 + var1.charWidth(var11.charAt(var14)) >= var2) {
                        if (var14 > 1) {
                           var10 = var10 + var11.substring(0, var14 - 1);
                           var11 = var11.substring(var14 - 1, var11.length());
                           var18 = var1.charsWidth(var11.trim().toCharArray(), 0, var11.trim().length());
                        }

                        if (var18 < var2) {
                           if (var10.indexOf(10) == 0) {
                              ++var8;
                           }

                           var12 = var12 + var10;
                           if (var10.indexOf(10) == -1 || var10.indexOf(10) == 0) {
                              var12 = var12 + '\n';
                           }

                           var10 = var11;
                           var5 = var18 + var19;
                           ++var8;
                           break label163;
                        }

                        if (var10.indexOf(10) == 0) {
                           ++var8;
                        }

                        var12 = var12 + var10;
                        if (var10.indexOf("\n") == -1 || var10.indexOf(10) == 0) {
                           var12 = var12 + '\n';
                        }

                        var10 = "";
                        ++var8;
                        var5 = 0;
                        var14 = 0;
                     } else {
                        var5 += var1.charWidth(var11.charAt(var14));
                        ++var14;
                     }
                  }
               }
            } else {
               if (var10.length() > 0) {
                  if (var10.indexOf(10) == -1 && var11.indexOf(10) != 0) {
                     var10 = var10 + '\n';
                  }

                  var12 = var12 + var10;
                  if (var11.indexOf(10) != 0 || var0.indexOf(10) == 0 && var11.indexOf(10) == 0 || var10.indexOf(10) != -1) {
                     if (var11.indexOf(10) != -1 && var10.indexOf(10) == -1) {
                        --var8;
                     }

                     ++var8;
                  }
               }

               var10 = var11;
               var5 = var18 + var19;
            }
         }

         if (var0.length() == 0 && var11.length() > 0) {
            var12 = var12 + var10;
         }
      }

      String[] var20 = new String[var8 + 1];
      var11 = "";
      int var15;
      if (var3 > 0) {
         for(var15 = 0; var15 < var3; ++var15) {
            var11 = var11 + ' ';
         }
      }

      var16 = 0;

      for(var15 = 0; var16 != -1 && var8 + 1 != var15; ++var15) {
         if ((var16 = var12.indexOf("\n")) == -1) {
            var10 = var12.substring(0, var12.length());
         } else {
            var10 = var12.substring(0, var16);
         }

         var20[var15] = var10.trim();
         if (var3 > 0) {
            var20[var15] = var11 + var20[var15];
         }

         if (var16 >= var12.length() || var16 == -1) {
            var12 = "";
            break;
         }

         var12 = var12.substring(var16 + 1, var12.length());
      }

      if (var8 > 0 && var12.length() > 0) {
         if (var3 > 0) {
            var20[var15] = var11 + var12;
         } else {
            var20[var15] = var12;
         }
      }

      return var20;
   }

   public static final int b(int var0, int var1) {
      if (var1 == var0) {
         return var0;
      } else {
         int var2;
         if (var1 < var0) {
            var2 = var0;
            var0 = var1;
            var1 = var2;
         }

         var2 = var1 - var0 + 1;
         return var0 + (a.nextInt() & Integer.MAX_VALUE) % var2;
      }
   }

   public static final int e(int var0) {
      return var0 <= 0 ? 0 : (a.nextInt() & Integer.MAX_VALUE) % var0;
   }

   public static final int c() {
      return a.nextInt() & Integer.MAX_VALUE;
   }

   public static final void b() {
      InputStream var0 = null;
      b = null;

      try {
         var0 = a.getClass().getResourceAsStream("/mi");
         byte[] var1 = new byte[2];
         var0.read(var1, 0, 2);
         int var2;
         if ((var2 = (var1[0] & 255) << 8 | var1[1] & 255) > 0) {
            var1 = new byte[var2];
            if (var0.read(var1, 0, var2) == var2) {
               b = new String(var1);
            }
         }
      } catch (Exception var12) {
      } finally {
         try {
            var0.close();
         } catch (Exception var11) {
         }

      }

      if (b != null) {
         int var14;
         if ((var14 = a((int)0, (int)383)) == -1) {
            var14 = a[0].length / 4 - 1;
         }

         a(0, var14 + 1, 388, 5, 101, -1);
      }

   }

   public static final boolean a() {
      boolean var0 = false;
      if (b != null) {
         try {
            var0 = a.platformRequest(b);
         } catch (Exception var2) {
         }
      }

      return var0;
   }

   public static final int[] a() {
      int[] var0 = null;

      try {
         DataInputStream var1;
         g = (var1 = new DataInputStream(a("c"))).readInt();
         var0 = new int[g];

         for(int var2 = 0; var2 < g; ++var2) {
            var0[var2] = var1.readInt();
         }
      } catch (Exception var3) {
      }

      return var0;
   }

   public static final Font[] a() {
      Font[] var0 = null;
      var0 = new Font[3];

      for(int var1 = 0; var1 < 3; ++var1) {
         var0[var1] = Font.getDefaultFont();
      }

      try {
         DataInputStream var9;
         short var2 = (var9 = new DataInputStream(a("f"))).readShort();

         for(int var3 = 0; var3 < var2; ++var3) {
            short var4 = var9.readShort();
            byte var5 = 0;
            byte var6 = 0;
            int var7 = 0;
            if ((var4 >> 0 & 1) == 1) {
               var5 = 32;
            } else if ((var4 >> 2 & 1) == 1) {
               var5 = 64;
            }

            if ((var4 >> 4 & 1) == 1) {
               var6 = 8;
            } else if ((var4 >> 5 & 1) == 1) {
               var6 = 16;
            }

            if ((var4 >> 6 & 1) == 1) {
               var7 = 1;
            }

            if ((var4 >> 7 & 1) == 1) {
               var7 |= 2;
            }

            if ((var4 >> 8 & 1) == 1) {
               var7 |= 4;
            }

            var0[var3] = Font.getFont(var5, var7, var6);
         }
      } catch (Exception var8) {
      }

      return var0;
   }

   public static final int[] b() throws IOException {
      int[] var1 = new int[a.readShort()];

      for(int var2 = 0; var2 < var1.length; ++var2) {
         var1[var2] = a.readInt();
      }

      return var1;
   }

   public static final void a(int[] var0) throws IOException {
      a.writeShort(var0.length);

      for(int var1 = 0; var1 < var0.length; ++var1) {
         a.writeInt(var0[var1]);
      }

   }

   public static final boolean c(int var0) {
      RecordStore var1 = null;
      boolean var2 = false;

      try {
         var1 = RecordStore.openRecordStore("RECSTR" + var0, false);
      } catch (Exception var5) {
         return false;
      }

      if (var1 != null) {
         try {
            var1.closeRecordStore();
         } catch (Exception var4) {
         }
      }

      return true;
   }

   public static final void d(int var0) {
      if (c(var0)) {
         try {
            RecordStore var1;
            if ((var1 = RecordStore.openRecordStore("RECSTR" + var0, false)).getNumRecords() == 1) {
               var1.deleteRecord(1);
            }

            var1.closeRecordStore();
            RecordStore.deleteRecordStore("RECSTR" + var0);
         } catch (Exception var2) {
         }
      }
   }

   public static final byte[] a(int var0) {
      Object var1 = null;
      i = -1;
      RecordStore var3 = null;

      byte[] var7;
      try {
         var7 = (var3 = RecordStore.openRecordStore("RECSTR" + var0, false)).getRecord(1);
         i = 0;
      } catch (Exception var6) {
         var7 = null;
         i = -1;
      }

      if (var3 != null) {
         try {
            var3.closeRecordStore();
         } catch (Exception var5) {
         }
      }

      return var7;
   }

   public static final int a(int var0, byte[] var1) {
      i = 0;
      RecordStore var2 = null;
      boolean var3 = false;

      try {
         if ((var2 = RecordStore.openRecordStore("RECSTR" + var0, true)).getNumRecords() < 1) {
            var2.addRecord(var1, 0, 1);
            var3 = true;
         }

         if (var2.getSizeAvailable() < var1.length * 2) {
            i = -2;
         } else {
            var2.setRecord(1, var1, 0, var1.length);
            var3 = false;
         }
      } catch (RecordStoreNotFoundException var6) {
         i = -2;
      } catch (Exception var7) {
         i = -1;
      }

      if (var2 != null) {
         try {
            var2.closeRecordStore();
            if (var3) {
               d(var0);
            }
         } catch (Exception var5) {
         }
      }

      return i;
   }

   public static final void k() {
      if (a == null) {
         a = new ByteArrayOutputStream();
      } else {
         a.reset();
      }

      if (a == null) {
         a = new DataOutputStream(a);
      }

   }

   public static final void e(int var0) {
      byte[] var1;
      if (a != null && (var1 = a.toByteArray()).length > 0) {
         a(var0, var1);
      }

   }

   public static final void h(int var0) {
      k();
      byte[] var1;
      if ((var1 = a(var0)) != null) {
         a = new ByteArrayInputStream(var1);
         a = new DataInputStream(a);
      }

   }

   public static final int b() {
      boolean var0 = false;
      InputStream var1 = null;

      try {
         var1 = a.getClass().getResourceAsStream("/ldf");
      } catch (Exception var19) {
         return -1;
      }

      if (var1 == null) {
         return -1;
      } else {
         try {
            var1.read();
            a = (byte)var1.read();
            byte[] var22 = new byte[(byte)var1.read()];
            var1.read(var22);
            a = new String(var22);
            if (a == 3) {
               byte var4;
               a = new String[var4 = (byte)var1.read()][2];
               boolean var5 = false;
               Object var6 = null;
               boolean var7 = false;
               Object var8 = null;

               for(int var9 = 0; var9 < var4; ++var9) {
                  byte[] var23 = new byte[(byte)var1.read()];
                  var1.read(var23);
                  a[var9][0] = new String(var23);
                  byte[] var24 = new byte[(byte)var1.read()];
                  var1.read(var24);
                  a[var9][1] = new String(var24);
               }
            }

            return 0;
         } catch (Exception var20) {
            boolean var3 = false;
         } finally {
            try {
               var1.close();
            } catch (Exception var18) {
               return -1;
            }
         }

         return -1;
      }
   }

   public static final int a(String var0) {
      int var1 = 0;
      switch(a) {
      case 0:
         var1 = -1;
         break;
      case 1:
         c = a;
         break;
      case 2:
         c = var0;
         break;
      case 3:
         int var2 = 0;

         for(boolean var3 = true; var2 < a.length && var3; ++var2) {
            if (a[var2][0].compareTo(var0) == 0) {
               c = a[var2][1];
               var3 = false;
            }
         }
      }

      if (var1 != -1) {
         var1 = a();
      }

      return var1;
   }

   public static final int a() {
      byte var0 = 0;

      for(int var1 = 0; var1 < d.length; ++var1) {
         if (b[var1] == null) {
            if ((c[var1] == 1 || c[var1] != 0 && a[var1]) && a(var1) == -1) {
               var0 = -1;
               break;
            }
         } else if (c[var1] != 1 && !a[var1]) {
            b[var1] = null;
         }
      }

      return var0;
   }

   public static final int a(int var0) {
      InputStream var1 = null;
      boolean var2 = false;

      try {
         if (c == null) {
            c = a;
         }

         String var3 = "/" + c + "." + d[var0] + "." + "lng";
         if ((var1 = a.getClass().getResourceAsStream(var3)) == null) {
            boolean var22 = false;
            return -1;
         }

         byte[] var4 = new byte[2];
         var1.read(var4, 0, 2);
         int var5;
         boolean var6;
         if ((var5 = ((var4[1] & 255) << 8 | var4[0] & 255) - 2) < 0) {
            var6 = false;
            return -1;
         }

         var4 = new byte[var5];
         if (var1.read(var4, 0, var5) == var5) {
            int var23 = (var4[2] & 255) << 8 | var4[1] & 255;
            d = var4;
            b[var0] = new String[var23];

            for(int var7 = 0; var7 < var23; ++var7) {
               b[var0][var7] = c(var7);
            }

            return 0;
         }

         b[var0] = new String[0];
         var6 = false;
      } catch (Exception var20) {
         return 0;
      } finally {
         try {
            var1.close();
         } catch (Exception var19) {
         }

         d = null;
      }

      return -1;
   }

   public static final String c(int var0) {
      String var1 = "";
      boolean var2 = false;
      if (a == 0) {
         return "null_3";
      } else {
         ++var0;
         if ((var0 *= 2) >= 0 && var0 < d.length) {
            int var3 = (d[var0 + 4] & 255) << 8 | d[var0 + 3] & 255;
            int var4;
            if ((var4 = (d[var0 + 2] & 255) << 8 | d[var0 + 1] & 255) >= d.length) {
               return "";
            } else {
               byte[] var5 = new byte[var3 - var4];
               System.arraycopy(d, var4, var5, 0, var5.length);
               switch(d[0]) {
               case 0:
                  var1 = (new String(var5, 0, var5.length)).replace('\r', '\n');
                  break;
               case 1:
                  StringBuffer var9 = new StringBuffer(var5.length / 2);

                  for(int var7 = 0; var7 < var5.length - 1; var7 += 2) {
                     var9.append((char)((var5[var7 + 1] & 255) << 8 | var5[var7] & 255));
                  }

                  var1 = var9.toString().replace('\r', '\n');
                  break;
               case 2:
                  byte[] var6;
                  (var6 = new byte[var5.length + 2])[0] = (byte)(var5.length >>> 8);
                  var6[1] = (byte)var5.length;
                  System.arraycopy(var5, 0, var6, 2, var5.length);

                  try {
                     var1 = (new DataInputStream(new ByteArrayInputStream(var6))).readUTF().replace('\r', '\n');
                  } catch (Exception var8) {
                  }
               }

               return var1;
            }
         } else {
            return "";
         }
      }
   }

   public static final String a(int var0) {
      String var1 = "";
      int var2 = var0 & '\uffff';
      int var3 = (var0 & 16711680) >> 16;
      if (b != null && var3 >= 0 && var3 < b.length) {
         if (b[var3] == null) {
            if (c[var3] == 4) {
               a(var3);
               if (b[var3] != null) {
                  var1 = a(var0);
               }
            }
         } else if (var2 >= 0 && var2 < b[var3].length && b[var3][var2] != null) {
            var1 = b[var3][var2];
         }
      }

      return var1;
   }

   public static final void r(int var0) {
      if (var0 >= 0) {
         int var1 = b[var0][0];
         int var2 = b[var0][1];
         int var3 = b[var0][2];
         boolean var4 = false;
         boolean var5 = true;
         if (a[var0][1] != -1) {
            var5 = false;
         }

         int var6;
         if (var5) {
            for(var6 = 0; var6 < u; ++var6) {
               if (a[var6][1] == var2) {
                  var5 = false;
                  a[var0][0] = var1;
                  a[var0][1] = a[var6][1];
                  a[var0][2] = var6;
                  break;
               }
            }
         }

         if (var5) {
            String var18 = "";
            if (var2 < 10) {
               var18 = "0";
            }

            String var7 = "/" + var18 + var2 + c[var3];
            String var8 = a[var3];
            InputStream var9 = null;

            try {
               var9 = a.getClass().getResourceAsStream(var7);
            } catch (Exception var17) {
            }

            try {
               var9.available();
               a[var0] = Manager.createPlayer(var9, var8);
            } catch (Exception var16) {
            }

            Player var10 = (Player)a[var0];

            try {
               var10.realize();
            } catch (Exception var15) {
            }

            try {
               var10.prefetch();
            } catch (Exception var14) {
            }

            if (!j) {
               try {
                  var10.addPlayerListener(a);
               } catch (Exception var13) {
               }
            }

            a[var0] = var10;
            a[var0][0] = var1;
            a[var0][2] = var0;
            a[var0][1] = var2;

            try {
               var9.close();
            } catch (Exception var12) {
            }
         }

         if (a[a[var0][2]] == null) {
            for(var6 = 0; var6 < u; ++var6) {
               if (a[var6][1] == a[var0][1]) {
                  a[var6][2] = -1;
                  a[var6][1] = -1;
                  a[var6][0] = -1;
               }
            }

            ++w;
            if (w <= 2) {
               r(var0);
            }
         }
      }

   }

   public static final void l(int var0) {
      Player var1 = null;
      int var2 = h(var0);
      int var3 = Integer.MIN_VALUE;
      if (var2 >= 0) {
         int var5;
         for(int var4 = 0; var4 < u; ++var4) {
            if (b[var4] == 0) {
               var5 = b[var4][3];
               if (var3 < var5) {
                  var3 = var5;
               }
            }
         }

         boolean var16 = false;
         if (var2 >= 0) {
            var5 = b[var2][3];
            if (h) {
               var16 = var5 >= var3;
            } else {
               var16 = var5 > var3;
            }
         }

         if (var16) {
            c(var0);
            var5 = a[var2][2];

            boolean var6;
            for(var6 = false; !var6 && k < 3; ++k) {
               if (var5 < 0) {
                  r(var2);
                  var5 = a[var2][2];
               }

               if (var5 >= 0 && a[var5] != null) {
                  var1 = (Player)a[var5];
                  if (a) {
                     var6 = var1.getState() == 200 || var1.getState() == 300;
                  } else {
                     var6 = var1.getState() == 300;
                  }

                  if (!var6) {
                     boolean var7 = false;
                     h();
                  }
               }
            }

            k = 0;
            if (var6) {
               int var17;
               try {
                  if ((var17 = var1.getState()) != 300 && var17 != 0) {
                     var1.prefetch();
                  }
               } catch (Exception var15) {
                  return;
               }

               try {
                  if (o) {
                     var1.setMediaTime(0L);
                  }
               } catch (Exception var14) {
               }

               try {
                  var1.setLoopCount(1);
                  var1.start();
                  b[var2] = 0;
               } catch (Exception var13) {
               }

               try {
                  VolumeControl var18 = (VolumeControl)var1.getControl("VolumeControl");
                  int var10;
                  if ((b[var2][4] >> 5 & 1) == 1) {
                     var10 = 0 + 255 * a / 125;
                     var18.setLevel(var10);
                  } else {
                     var10 = 0 + 255 * b / 125;
                     var18.setLevel(var10);
                  }
               } catch (Exception var12) {
               }

               try {
                  if (p) {
                     var1.setMediaTime(0L);
                  }
               } catch (Exception var11) {
               }

               if (j) {
                  if ((var17 = b[var2][7]) > 0) {
                     a[var2] = System.currentTimeMillis() + (long)var17;
                     return;
                  }

                  a[var2] = System.currentTimeMillis() + var1.getDuration() / 1000L;
               }
            }
         }
      }

   }

   public static final void t(int var0) {
      Player var1 = null;
      if (var0 >= 0) {
         int var2 = h(var0);
         int var3;
         if ((var3 = a[var2][2]) >= 0) {
            var1 = (Player)a[var3];

            try {
               if (var1.getState() != 0) {
                  var1.stop();
               }
            } catch (Exception var8) {
            }

            b[var2] = 1;
            if (a) {
               try {
                  if (var1.getState() != 0) {
                     var1.deallocate();
                  }
               } catch (Exception var7) {
               }
            }

            if ((b[var2][4] >> 1 & 1) != 1) {
               try {
                  if (var1.getState() == 300) {
                     var1.deallocate();
                  }

                  if (var1.getState() == 200 || var1.getState() == 100) {
                     var1.close();
                  }
               } catch (Exception var9) {
               }

               a[var2] = null;
               a[var2][0] = -1;
               a[var2][1] = -1;
               a[var2][2] = -1;
               b[var2] = -1;
            }
         }
      }

   }

   public final void playerUpdate(Player var1, String var2, Object var3) {
      if (!j && !c) {
         int var4 = -1;

         int var5;
         for(var5 = 0; var5 < u; ++var5) {
            Player var6 = (Player)a[var5];
            if (var1 == var6) {
               var4 = var5;
               break;
            }
         }

         var5 = -1;
         int var9 = -1;

         for(int var7 = 0; var7 < u; ++var7) {
            int var8 = a[var7][2];
            if (var4 == var8 && b[var7] == 0) {
               var9 = h(var5 = a[var7][0]);
               break;
            }
         }

         if (var9 >= 0) {
            if (var2 == "stopped") {
               s(var5);
               return;
            }

            if (var2 == "endOfMedia") {
               s(var5);
               b[var9] = 2;
               a(var9);
            }
         }
      }

   }

   public static final void j() {
      f();
      u = b.length;
      if (a == null) {
         a = new Object[u];
         a = new int[u][4];
         b = new byte[u];
         a = new int[u];
         a = new long[u];
      }

      for(int var0 = 0; var0 < u; ++var0) {
         a[var0][0] = -1;
         a[var0][1] = -1;
         a[var0][2] = -1;
         b[var0] = -1;
         a[var0] = -1;
         a[var0] = -1L;
         a[var0] = null;
      }

      System.gc();
      boolean var5 = false;

      for(int var1 = 0; var1 < u; ++var1) {
         int var2;
         boolean var3 = ((var2 = b[var1][4]) >> 2 & 1) == 1;
         if ((var2 >> 0 & 1) == 1 && a[var1] == null) {
            r(var1);
         }

         if (var3 || j) {
            var5 = true;
         }

         b.a = 25 * var1 / u + 75;
      }

      if (var5 && a == null) {
         a = new Thread() {
            public static Vector a;
            public static boolean b = false;
            public static boolean a = false;
            public static boolean c = false;
            public static int a = 0;

            public static final void a(int var0) {
               if (a == null) {
                  a = new Vector(1, 1);
               }

               if (c) {
                  a = false;
               }

               a.addElement(new Integer(var0));
            }

            public static final void b(int var0) {
               if (var0 >= 0) {
                  HG.t(var0);
               }

            }

            public final void run() {
               while(true) {
                  try {
                     ++a;
                     c = false;
                     b = true;
                     int var1 = 0;
                     if (a != null) {
                        var1 = a.size();
                     }

                     int var4;
                     if (HG.j) {
                        long var2 = System.currentTimeMillis();

                        for(var4 = 0; var4 < HG.u; ++var4) {
                           if (HG.a[var4] > 0L && var2 >= HG.a[var4] && HG.b[var4] != 1) {
                              HG.a[var4] = -1L;
                              int var5 = HG.a[var4][0];
                              if (HG.b[var4] == 0) {
                                 HG.s(var5);
                                 HG.b[var4] = 2;
                                 HG.a(var4);
                              }
                           }
                        }
                     }

                     if (var1 > 0 && !HG.c && !a) {
                        for(int var7 = 0; var7 < var1; ++var7) {
                           var4 = (Integer)a.elementAt(0);
                           if (!a) {
                              HG.u(var4);
                           }

                           a.removeElementAt(0);
                        }
                     }

                     if (HG.c) {
                        HG.n();
                     }

                     c = true;
                     sleep(100L);
                  } catch (Exception var6) {
                  }
               }
            }
         };
         a.start();
      }

      f = true;
   }

   public static final void m(int var0) {
      int var1;
      if (var0 >= 0 && (var1 = h(var0)) >= 0) {
         int var2;
         if (((var2 = b[var1][4]) >> 3 & 1) == 1 && !b(1) && !b(5) || (var2 >> 3 & 1) != 1 && !b(2) && b[var1][1] != 0 && !b(5) || b(0)) {
            return;
         }

         boolean var3 = (var2 >> 2 & 1) == 1 || j;
         int var4 = var0;
         if (b[var1][5] >= 0) {
            Vector var5 = new Vector(1, 1);
            int var6 = b[var1][5];

            int var7;
            for(var7 = 0; var7 < u; ++var7) {
               if (b[var1][5] >= 0 && b[var7][5] == var6) {
                  var5.addElement(new Integer(b[var7][0]));
               }
            }

            if ((var7 = var5.size()) > 1) {
               var4 = (Integer)var5.elementAt(e(var7));
            }
         }

         boolean var9 = true;
         if (k && b[var1] == 0) {
            var9 = false;
         }

         if (var9) {
            if (var3) {
               if (!null.b) {
                  a = new Thread() {
                     public static Vector a;
                     public static boolean b = false;
                     public static boolean a = false;
                     public static boolean c = false;
                     public static int a = 0;

                     public static final void a(int var0) {
                        if (a == null) {
                           a = new Vector(1, 1);
                        }

                        if (c) {
                           a = false;
                        }

                        a.addElement(new Integer(var0));
                     }

                     public static final void b(int var0) {
                        if (var0 >= 0) {
                           HG.t(var0);
                        }

                     }

                     public final void run() {
                        while(true) {
                           try {
                              ++a;
                              c = false;
                              b = true;
                              int var1 = 0;
                              if (a != null) {
                                 var1 = a.size();
                              }

                              int var4;
                              if (HG.j) {
                                 long var2 = System.currentTimeMillis();

                                 for(var4 = 0; var4 < HG.u; ++var4) {
                                    if (HG.a[var4] > 0L && var2 >= HG.a[var4] && HG.b[var4] != 1) {
                                       HG.a[var4] = -1L;
                                       int var5 = HG.a[var4][0];
                                       if (HG.b[var4] == 0) {
                                          HG.s(var5);
                                          HG.b[var4] = 2;
                                          HG.a(var4);
                                       }
                                    }
                                 }
                              }

                              if (var1 > 0 && !HG.c && !a) {
                                 for(int var7 = 0; var7 < var1; ++var7) {
                                    var4 = (Integer)a.elementAt(0);
                                    if (!a) {
                                       HG.u(var4);
                                    }

                                    a.removeElementAt(0);
                                 }
                              }

                              if (HG.c) {
                                 HG.n();
                              }

                              c = true;
                              sleep(100L);
                           } catch (Exception var6) {
                           }
                        }
                     }
                  };
                  a.start();
               }

               null.a(var4);
            } else {
               u(var4);
            }

            if (b[var1] != 0) {
               b[var1] = 4;
            }
         }
      }

   }

   public static final void c(int var0) {
      int var1;
      if ((var1 = h(var0)) >= 0) {
         int var2 = b[var1][3];
         boolean var4 = (b[var1][4] >> 3 & 1) == 1;

         for(int var5 = 0; var5 < u; ++var5) {
            boolean var6 = false;
            if (h) {
               var6 = b[var5][3] <= var2;
            } else {
               var6 = b[var5][3] < var2;
            }

            if (b[var5] != 0 && b[var5] != 4) {
               var6 = false;
            }

            if (b[var5] == 2) {
               var6 = true;
            }

            if (var6) {
               int var7 = a[var5][0];
               int var8;
               boolean var9 = ((var8 = b[var5][4]) >> 3 & 1) == 1;
               boolean var10 = (var8 >> 4 & 1) == 1;
               boolean var11 = false;
               if (var10) {
                  if (var9 && var4 || !var9 && !var4) {
                     var11 = true;
                  }
               } else {
                  var11 = true;
               }

               if (var11) {
                  b(var7, var0);
               }
            }
         }
      }

   }

   public static final void b(int var0, int var1) {
      boolean var2 = true;
      int var3;
      if ((var3 = h(var0)) > 0) {
         if (k && var0 == var1 && (b[var3] == 0 || b[var3] == 4)) {
            var2 = false;
         }

         if (m) {
            int var4 = b[var3][2];
            int var5 = b[h(var1)][2];
            if (var4 == 0 && var5 == 7) {
               var2 = false;
            }
         }

         if (var2) {
            if (b) {
               h();
               return;
            }

            b[var3] = 1;
            s(var0);
         }
      }

   }

   public static final void s(int var0) {
      if (var0 >= 0) {
         int var1 = h(var0);
         if ((b[var1][4] >> 2 & 1) == 1 || j) {
            null.b(var0);
            return;
         }

         t(var0);
      }

   }

   public static final boolean a(int var0) {
      boolean var1 = false;
      int var2 = a[var0][0];
      if (var0 >= 0) {
         boolean var4 = (b[var0][4] >> 3 & 1) == 1;
         boolean var5 = b[var0] == 2;
         if (b[var0][6] > 0) {
            b[var0] = 2;
            m(b[var0][6]);
            return true;
         }

         if (var4 && var5) {
            int var6 = var2;
            if (b[var0][5] >= 0) {
               int var7 = b[var0][5];
               Vector var8 = new Vector(1, 1);

               int var9;
               for(var9 = 0; var9 < u; ++var9) {
                  if (b[var0][5] >= 0 && b[var9][5] == var7 && var2 != b[var9][0]) {
                     var8.addElement(new Integer(b[var9][0]));
                  }
               }

               if ((var9 = var8.size()) > 1) {
                  while(var6 == var2) {
                     var6 = (Integer)var8.elementAt(e(var9));
                  }
               }
            }

            if (var6 < 0) {
               var6 = b[var0][0];
            }

            b[var0] = 2;
            m(var6);
            var1 = true;
         }
      }

      return var1;
   }

   public static final void h() {
      for(int var0 = 0; var0 < u; ++var0) {
         s(a[var0][0]);
      }

   }

   public static final void u(int var0) {
      if (!c) {
         if (b) {
            boolean var1 = true;
            if (x >= 0) {
               int var2 = h(x);
               int var3 = h(var0);
               int var4 = b[var2][3];
               int var5 = b[var3][3];
               boolean var6 = false;
               if (h) {
                  var6 = var5 < var4;
               } else {
                  var6 = var5 <= var4;
               }

               if (var6) {
                  var1 = false;
               }
            }

            if (var1) {
               x = var0;
               return;
            }
         } else {
            l(var0);
         }
      }

   }

   public static final void a() {
      if (x >= 0) {
         boolean var0 = false;
         l(x);
         x = -1;
      }

   }

   public static final void n() {
      if (!c) {
         a = System.currentTimeMillis();
      }

      c = true;

      for(int var0 = 0; var0 < u; ++var0) {
         if (b[var0] == 0 || b[var0] == 4) {
            int var1 = a[var0][0];
            a[var0] = var1;
            s(var1);
            b[var0] = 3;
         }
      }

   }

   public static final void c() {
      c = false;

      for(int var0 = 0; var0 < u; ++var0) {
         if (b[var0] == 3) {
            int var1 = a[var0];
            if (j) {
               long var4 = System.currentTimeMillis() - a;
               if (a[var0] > 0L) {
                  long[] var10000 = a;
                  var10000[var0] += var4;
               }
            }

            m(var1);
         }
      }

   }

   public static final int h(int var0) {
      int var1 = -1;

      int var2;
      for(var2 = 0; var2 < u; ++var2) {
         if (a[var2][0] == var0) {
            var1 = var2;
            break;
         }
      }

      if (var1 == -1) {
         for(var2 = 0; var2 < u; ++var2) {
            if (b[var2][0] == var0) {
               var1 = var2;
               break;
            }
         }
      }

      return var1;
   }

   public static final int b(int var0) {
      int var1 = h(var0);
      byte var2 = -1;
      if (var1 >= 0) {
         var2 = b[var1];
      }

      return var2;
   }

   private static final void f() {
      int var0 = 0;
      int[][] var1;
      int[] var2 = new int[(var1 = new int[][]{{0, 0, 0, 0, 0, -1, 1, 19814}, {1, 1, 0, 0, 8, -1, -1, 48410}, {2, 2, 0, 0, 8, -1, -1, 66431}, {3, 3, 0, 0, 8, -1, -1, 145382}, {4, 4, 0, 0, 8, -1, -1, 99005}, {5, 5, 0, 0, 8, -1, -1, 37399}, {6, 6, 0, 0, 8, -1, -1, 58859}, {7, 10, 0, 6, 0, -1, -1, 2116}, {8, 11, 0, 6, 0, -1, -1, 3749}, {9, 20, 0, 0, 0, -1, -1, 906}, {10, 21, 0, 0, 0, -1, -1, 699}, {11, 22, 0, 0, 0, -1, -1, 1247}, {12, 23, 0, 0, 0, -1, -1, 1247}, {13, 24, 0, 0, 0, -1, -1, 1871}, {14, 25, 0, 0, 0, -1, -1, 1410}, {15, 26, 0, 0, 0, -1, -1, 2139}, {16, 27, 0, 0, 0, -1, -1, 1410}, {17, 28, 0, 0, 0, -1, -1, 2139}, {18, 30, 0, 0, 0, -1, -1, 1087}, {19, 31, 0, 0, 0, -1, -1, 518}, {20, 32, 0, 0, 0, -1, -1, 1087}, {21, 33, 0, 0, 0, -1, -1, 647}, {22, 34, 0, 1, 0, -1, -1, 831}, {23, 35, 0, 5, 0, -1, -1, 1088}, {24, 35, 0, 5, 0, -1, -1, 1088}, {25, 35, 0, 5, 0, -1, -1, 1088}, {26, 35, 0, 5, 0, -1, -1, 1088}, {27, 35, 0, 5, 0, -1, -1, 1088}, {28, 35, 0, 5, 0, -1, -1, 1088}, {29, 35, 0, 5, 0, -1, -1, 1088}, {30, 43, 0, 9, 0, -1, -1, 4747}, {31, 50, 0, 0, 0, -1, -1, 704}, {32, 51, 0, 0, 0, -1, -1, 862}, {33, 52, 0, 0, 0, -1, -1, 702}}).length];
      String var3 = null;
      Object var4 = null;

      int var5;
      for(var5 = 0; var5 < var1.length; ++var5) {
         if (var1[var5][1] < 10) {
            var3 = "/0" + var1[var5][1] + c[var1[var5][2]];
         } else {
            var3 = "/" + var1[var5][1] + c[var1[var5][2]];
         }

         if ("".getClass().getResourceAsStream(var3) == null) {
            var2[var5] = 0;
         } else {
            var2[var5] = 1;
            ++var0;
         }
      }

      b = new int[var0][8];
      var0 = 0;

      for(var5 = 0; var5 < var1.length; ++var5) {
         if (var2[var5] == 1) {
            System.arraycopy(var1[var5], 0, b[var0], 0, var1[var5].length);
            ++var0;
         }
      }

   }

   public static final void a(String var0, String var1, boolean var2) {
      boolean var3 = false;
      int var4 = n - 16;
      String[] var5 = null;
      Font var6 = c.a[2];
      if (var1.length() > 0) {
         var5 = a(var0 + " " + var1, var6, var4, 0);
      } else {
         var5 = a(var0, var6, var4, 0);
      }

      int var8 = var5.length;
      if (var5.length > 1) {
         var5 = a(var0, var6, var4, 0);

         for(int var7 = 0; var7 < var5.length; ++var7) {
            a.addElement(var5[var7]);
            if (var7 < var8 - 1) {
               b.addElement("");
            } else {
               b.addElement(var1);
            }
         }

         if (var8 > var5.length) {
            a.addElement("");
            b.addElement(var1);
         }
      } else {
         a.addElement(var0);
         b.addElement(var1);
      }

      if (var2) {
         b = b.size() - 1;
      }

   }

   public static final String b(int var0) {
      String var1 = null;
      if (var0 < 0) {
         var1 = " (" + var0 + ")";
      } else {
         var1 = " (+" + var0 + ")";
      }

      return var1;
   }

   public static final void i(int var0) {
      String var1 = null;
      b = -1;
      d = true;
      a.removeAllElements();
      b.removeAllElements();
      d = a(51 + m);
      c.ak = 126;
      switch(m) {
      case 0:
         a(a((int)58), "" + c.O[18], false);
         a(a((int)51), "" + c.O[17], false);
         int var2;
         if ((var2 = c.f(c.O[18])) >= 0) {
            a(a((int)66), "" + var2, false);
         } else {
            a(a((int)63), "", false);
         }

         a(a((int)57), "" + c.O[19], false);
         return;
      case 1:
         var1 = b((short)((c.O[12] & -65536) >> 16) - (short)(c.O[54] & '\uffff'));
         a(a((int)55), (short)(c.O[12] & '\uffff') + "/" + (short)((c.O[12] & -65536) >> 16) + var1, false);
         var1 = b((short)((c.O[13] & -65536) >> 16) - (short)((c.O[54] & -65536) >> 16));
         a(a((int)61), (short)(c.O[13] & '\uffff') + "/" + (short)((c.O[13] & -65536) >> 16) + var1, false);
         var1 = b((short)(c.O[14] & '\uffff') - (short)((c.O[14] & -65536) >> 16));
         a(a((int)33), "" + (short)(c.O[14] & '\uffff') + var1, false);
         var1 = b((short)(c.O[15] & '\uffff') - (short)((c.O[15] & -65536) >> 16));
         a(a((int)34), "" + (short)(c.O[15] & '\uffff') + var1, false);
         return;
      case 2:
         int var3 = (short)(c.O[20] & '\uffff') - (short)((c.O[20] & -65536) >> 16);
         int var4 = (short)(c.O[21] & '\uffff') - (short)((c.O[21] & -65536) >> 16);
         int var5 = (short)(c.O[22] & '\uffff') - (short)((c.O[22] & -65536) >> 16);
         int var6 = (short)(c.O[23] & '\uffff') - (short)((c.O[23] & -65536) >> 16);
         switch(c.l(c.a())) {
         case 0:
            var3 += c.O[51];
            break;
         case 1:
            var4 += c.O[51];
            break;
         case 2:
            var5 += c.O[51];
            break;
         case 3:
            var6 += c.O[51];
         }

         var1 = b(var3);
         a(a((int)67), "" + (short)(c.O[20] & '\uffff') + var1, false);
         var1 = b(var4);
         a(a((int)72), "" + (short)(c.O[21] & '\uffff') + var1, false);
         var1 = b(var5);
         a(a((int)43), "" + (short)(c.O[22] & '\uffff') + var1, false);
         var1 = b(var6);
         a(a((int)44), "" + (short)(c.O[23] & '\uffff') + var1, false);
         var1 = b((short)(c.O[25] & '\uffff') - (short)((c.O[25] & -65536) >> 16));
         a(a((int)46), "" + (short)(c.O[25] & '\uffff') + var1, false);
         return;
      case 3:
         a(a((int)68), "", false);
         a("  " + a((int)47), "" + c.O[27], false);
         a("  " + a((int)70), "" + c.O[28], false);
      default:
      }
   }

   public static final void a(int[] var0, int[] var1) {
      boolean var2 = true;
      if (((var0[3] & 64) != 0 || (var0[3] & 128) != 0) && !(var2 = c.a(var0))) {
         a("\n" + a((int)292), "", false);
         a(a(64 + (short)(var1[10] & '\uffff')), "" + (short)((var1[10] & -65536) >> 16), true);
      }

      int var3 = 0;

      int var4;
      for(var4 = 0; var4 < c.length; ++var4) {
         c[var4] = -1;
      }

      int var5;
      for(var4 = 0; var4 < 2; ++var4) {
         if (var0[6 + var4] != -1) {
            var5 = c.g[(short)((var0[6 + var4] & -65536) >> 16)][3];
            c[var4] = (short)var5 & '\uffff' | (short)(var0[6 + var4] & '\uffff') << 16 & -65536;
            ++var3;
         }
      }

      for(var4 = 0; var4 < 5; ++var4) {
         if (var1[5 + var4] != -1) {
            c[2 + var4] = var1[5 + var4];
            ++var3;
         }
      }

      if (var3 != 0) {
         a("\n" + a((int)60), "", false);

         for(var4 = 0; var4 < c.length; ++var4) {
            if (c[var4] != -1) {
               short var20 = (short)(c[var4] & '\uffff');
               short var6;
               if ((var6 = (short)((c[var4] & -65536) >> 16)) < 0) {
                  a(a(29 + var20), "" + var6, false);
               } else {
                  a(a(29 + var20), "+" + var6, false);
               }
            }
         }
      }

      int var7;
      int var8;
      if ((var0[3] & 64) != 0) {
         c.a(0, c.O[42], false);
         c.c(var0, true);
         var5 = c.a(var4 = c.l(var0), c.O);
         int var21 = c.c((short)(c.O[14] & '\uffff'), c.a(var4, c.O), c.n(var0));
         var7 = c.a((short)(c.O[14] & '\uffff'), c.a(var4, c.O), c.n(var0));
         var8 = c.v(var0);
         int var9 = c.c(var5, (short)(c.O[15] & '\uffff'));
         int var10 = c.a(c.o(var0) + (short)(c.O[26] & '\uffff'), (short)(c.O[14] & '\uffff'), (short)(c.O[15] & '\uffff'), var5);
         int var11 = c.k(var0) * 10 / 4096;
         c.c(var0, false);
         c.a(0, c.O[42], true);
         int var13 = c.a(c.l(c.a()), c.O);
         int var14 = c.c((short)(c.O[14] & '\uffff'), c.a(var4, c.O), c.n(c.a()));
         int var15 = c.a((short)(c.O[14] & '\uffff'), c.a(var4, c.O), c.n(c.a()));
         int var16 = c.v(c.a());
         int var17 = c.c(var13, (short)(c.O[15] & '\uffff'));
         int var18 = c.a(c.o(c.a()) + (short)(c.O[26] & '\uffff'), (short)(c.O[14] & '\uffff'), (short)(c.O[15] & '\uffff'), var13);
         int var19 = c.k(c.a()) * 10 / 4096;
         a("\n" + a((int)290), "" + var21 + b(var21 - var14), false);
         a(a((int)291), "" + var7 + b(var7 - var15), false);
         a(a((int)289), "" + var9 + b(var9 - var17), false);
         a(a((int)287), "" + var8 + b(var8 - var16), false);
         a(a((int)69), "" + var11 + b(var11 - var19), false);
         a(a((int)288), "" + var10 + b(var10 - var18), false);
         if (var2) {
            a("\n" + a(64 + (short)(var1[10] & '\uffff')), "" + (short)((var1[10] & -65536) >> 16), false);
         }
      }

      if ((var0[3] & 128) != 0) {
         c.a(1, c.O[41], false);
         c.c(var0, true);
         var4 = c.O[27];
         var5 = c.O[28];
         c.c(var0, false);
         c.a(1, c.O[41], true);
         var7 = c.O[27];
         var8 = c.O[28];
         a("\n" + a((int)68), "", false);
         a(a((int)47), "" + var4 + b(var4 - var7), false);
         a(a((int)70), "" + var5 + b(var5 - var8), false);
         if (var2) {
            a("\n" + a(64 + (short)(var1[10] & '\uffff')), "" + (short)((var1[10] & -65536) >> 16), false);
         }
      }

   }

   public static final void f(int var0) {
      a.removeAllElements();
      b.removeAllElements();
      boolean var1 = false;
      d = a.a(b);
      b = -1;
      d = false;
      int[] var2 = c.a(b);
      if ((b[3] & 64) != 0) {
         a(a(var2[15] + 73), "", false);
         a(a((int)252), "" + a.a(b), false);
         a(b, var2);
      } else if ((b[3] & 128) != 0) {
         a(a((int)252), "" + a.a(b), false);
         a(b, var2);
      } else if ((b[3] & 8192) != 0) {
         a(a(77 + var2[10]), "", false);
         a(a((int)252), "" + a.a(b), false);
         a(b, var2);
      } else if ((b[3] & 256) != 0) {
         a(a(var2[0] + 1), "", false);
         if (var2[3] != 0) {
            if (var2[3] > 0) {
               a(a(29 + var2[6]), "+" + var2[3], false);
            } else {
               a(a(29 + var2[6]), "" + var2[3], false);
            }
         }

         a(a((int)252), "" + a.a(b), false);
      } else if ((b[3] & 1024) != 0) {
         a(a(var2[10]), "", false);
      } else {
         if ((b[3] & 512) != 0) {
            a(a(var2[3]), "", false);
         }

      }
   }

   public static final int f(int var0) {
      int var1 = 0;
      int var2 = 4;
      v |= 1;
      short[] var3 = a[var0];
      int var4 = a.c[c.ag][3];
      boolean var5 = false;
      boolean var6 = false;
      int var13;
      if ((var4 & 32) == 0 && (var4 & 4096) == 0) {
         short var14 = (short)(a.c[c.ag][0] & '\uffff');
         short var8 = (short)((a.c[c.ag][0] & -65536) >> 16);

         for(var13 = a.a[var8][var14]; var13 >= 0 && (a.c[var13][3] & 10176) <= 0; var13 = (short)(a.c[var13][1] & '\uffff')) {
         }
      } else {
         int var7 = a.a(c.ag, (int[])null) + G;
         var13 = (short)(c.D[var7] & '\uffff');
      }

      boolean var15 = (var4 & 32) != 0 && (a.c[c.ag][13] & 2) == 0;
      boolean var16 = (var4 & 32) != 0 && (a.c[c.ag][13] & 2) != 0;
      c.ak = 126;
      if (var15) {
         d = true;
         d = a(232 + G);
         c.ak = 113;
      } else if (var16) {
         d = false;
         d = a.a(a.c[c.ag]);
      } else {
         d = false;
         d = a((int)221);
      }

      int var9 = 0;

      for(int var10 = 0; var10 < 30; ++var10) {
         if (var13 < 0) {
            var3[var2 + 0] = -1;
            var3[var2 + 1] = -1;
            var3[var2 + 2] = 4;
            var3[var2 + 3] = -1;
            if (j == var10 + 1) {
               j = -1;
            }
         } else {
            int[] var11 = c.a(a.c[var13]);
            short var12 = (short)var13;
            if (((a.c[var13][3] & 64) != 0 || (a.c[var13][3] & 128) != 0) && !c.a(a.c[var13])) {
               var12 = (short)(var12 | '耀');
            }

            var3[var2 + 0] = (short)var11[0];
            var3[var2 + 1] = 21;
            var3[var2 + 2] = 105;
            var3[var2 + 3] = var12;

            for(var13 = (short)(a.c[var13][1] & '\uffff'); var13 >= 0 && (a.c[var13][3] & 10176) <= 0; var13 = (short)(a.c[var13][1] & '\uffff')) {
            }

            ++var1;
            var9 = var10 + 1;
            if (j == -1) {
               j = var10 + 1;
            }
         }

         var2 += 4;
      }

      a[var0] = var3;
      if (var1 == 0 && (a.c[c.ag][3] & 4096) != 0) {
         d = a((int)228);
         d = false;
      }

      if (j == -1) {
         j = var9;
      }

      return var1;
   }

   public static final void d() {
      v |= 2;
      short[] var0 = a[19];
      int[][] var1 = c.a[a];
      int[][] var2 = (int[][])null;
      d = a(232 + a);
      d = true;
      c.ak = 126;
      switch(a) {
      case 0:
         var2 = c.e;
         break;
      case 1:
         var2 = c.p;
         break;
      case 2:
         a.s();
         var2 = c.r;
         break;
      case 3:
         var2 = c.h;
         break;
      case 4:
         var2 = c.u;
         break;
      case 5:
         var2 = c.c;
      }

      int var3 = 4;
      int var4 = 0;
      boolean var5 = false;

      for(int var6 = 0; var6 < var1.length; ++var6) {
         if (var1[var6][4] == -1) {
            var0[var3 + 0] = -1;
            var0[var3 + 1] = -1;
            var0[var3 + 2] = 4;
            var0[var3 + 3] = -1;
            if (j == var6 + 1) {
               j = -1;
            }
         } else {
            short var7 = (short)var6;
            if ((a == 0 || a == 1) && !c.a(var1[var6])) {
               var7 = (short)(var7 | '耀');
            }

            var0[var3 + 0] = (short)var2[var1[var6][4]][0];
            var0[var3 + 1] = 12;
            var0[var3 + 2] = 105;
            var0[var3 + 3] = var7;
            var4 = var6 + 1;
            if (j == -1) {
               j = var6 + 1;
            }
         }

         var3 += 4;
      }

      var3 += 4;
      if ((v & 1) != 0) {
         var0[var3 + 1] = 11;
      } else {
         var0[var3 + 1] = 6;
      }

      a[19] = var0;
      if (j == -1) {
         j = var4;
      }

   }

   public static final void n(int var0) {
      short[] var1 = a[var0];
      d = a.a(b);
      d = false;
      boolean var2 = false;
      if ((a.c[c.ag][3] & 32) != 0 && (a.c[c.ag][13] & 2) == 0) {
         var1[4] = 218;
         var1[7] = 45;
      } else {
         var1[4] = 250;
         var1[7] = 43;
      }
   }

   public static final void p(int var0) {
      short[] var1 = a[var0];
      d = a.a(b);
      d = false;
      boolean var2 = false;
      var1[4] = 217;
      var1[5] = 14;
      var1[6] = 109;
      var1[7] = 40;
      if ((a != 0 || c != c.O[42]) && (a != 1 || c != c.O[41]) && (a != 3 || c != (short)(c.O[43] & '\uffff') && c != (short)((c.O[43] & -65536) >> 16) && c != c.O[44]) && (a != 4 || c != c.O[45])) {
         if (a != 2 && a != 5) {
            var1[4] = 217;
         } else if (a == 2 || a == 5) {
            if (a != 5 && c.r[b[4]][3] != 0) {
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

      if (a != 5 && a != 4 && c.O[11] != 0) {
         if ((v & 1) != 0) {
            if ((a.c[c.ag][3] & 32) != 0 && (a.c[c.ag][13] & 2) == 0) {
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

      if (a != 1 && a != 5 && (v & 1) == 0 && (a != 2 || c.r[b[4]][3] != 0)) {
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

   public static final void k(int var0) {
      short[] var1 = a[var0];
      d = a(244 + (h - 1));
      c.ak = 126;
      d = true;
      int var2 = 3;

      int var3;
      for(var3 = 0; var3 < c.s.length; ++var3) {
         c.s[var3][3] = -1;
         if ((short)(c.s[var3][0] & '\uffff') == h) {
            ++var2;
         }
      }

      if (var1.length != var2 * 4) {
         var1 = new short[var2 * 4];
      }

      byte var6 = 0;
      var1[0] = -1;
      var1[1] = -1;
      var1[2] = 6;
      var1[3] = 1;
      var3 = var6 + 4;
      int var4 = 1;

      int var5;
      for(var5 = 0; var5 < c.s.length; ++var5) {
         if ((short)(c.s[var5][0] & '\uffff') == h && (short)((c.s[var5][0] & -65536) >> 16) == 1) {
            var1[var3 + 0] = (short)c.s[var5][1];
            var1[var3 + 1] = 28;
            var1[var3 + 2] = 109;
            var1[var3 + 3] = 37;
            var3 += 4;
            c.s[var5][3] = var4++;
         }
      }

      for(var5 = 0; var5 < c.s.length; ++var5) {
         if ((short)(c.s[var5][0] & '\uffff') == h && (short)((c.s[var5][0] & -65536) >> 16) == 0) {
            var1[var3 + 0] = (short)c.s[var5][1];
            var1[var3 + 1] = 28;
            var1[var3 + 2] = 109;
            var1[var3 + 3] = 37;
            var3 += 4;
            c.s[var5][3] = var4++;
         }
      }

      var1[var3 + 0] = 136;
      var1[var3 + 1] = 11;
      var1[var3 + 2] = 3;
      var1[var3 + 3] = 1;
      var3 += 4;
      var1[var3 + 0] = 136;
      var1[var3 + 1] = 6;
      var1[var3 + 2] = 2;
      var1[var3 + 3] = 0;
      a[var0] = var1;
   }

   public static final void o(int var0) {
      d = a(c.s[C][1]);
      d = false;
   }

   public static final void a(int var0) {
      short[] var1 = a[var0];
      boolean var2 = false;
      if (c.O[11] != -1 && (short)(c.O[12] & '\uffff') > 0) {
         var1[12] = 247;
         var1[13] = 37;
         var1[14] = 101;
         var1[15] = -1;
      } else {
         var1[12] = -1;
         var1[13] = -1;
         var1[14] = 4;
         var1[15] = -1;
      }

      a(var1, 16, (short)36, (short)38);
      a[var0] = var1;
   }

   public static final void a(short[] var0, int var1, short var2, short var3) {
      if (c.d >= 0L && c.a >= 0L) {
         if (c.d > c.a) {
            var0[var1 + 0] = 373;
            var0[var1 + 1] = var3;
         } else {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
         }

         var0[var1 + 2] = 101;
         var0[var1 + 3] = -1;
         var1 += 4;
         if (c.d > c.a) {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
         } else {
            var0[var1 + 0] = 373;
            var0[var1 + 1] = var3;
         }

         var0[var1 + 2] = 101;
         var0[var1 + 3] = -1;
      } else {
         if (c.a >= 0L) {
            var0[var1 + 0] = 374;
            var0[var1 + 1] = var2;
            var0[var1 + 2] = 101;
         } else if (c.d >= 0L) {
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

   public static final void b(int var0) {
      a(a[var0], 4, (short)30, (short)39);
   }

   public static final void a(Graphics var0, String var1) {
      var0.setColor(c.m[5]);
      c.a((String)var1, 2, 2, var0);
   }

   public static final int a(Graphics var0, String var1, int var2, boolean var3, int var4) {
      int var5;
      int var6 = (var5 = c.a[2].getHeight()) + 5;
      if (var0 != null && var1 != null) {
         Object var7 = null;
         boolean var8 = false;
         int var9 = c.b[1717] / c.b[1721];
         int var10 = 5 + F;
         int var11 = (var6 >> 1) - 1;
         int var12 = var9 + 10 + 0;
         if (var3) {
            var0.setColor(c.m[10]);
            var0.fillRect(F, var2, n, var5 + 2);
            var0.setColor(c.m[5]);
            c.c(1, F + var12, var2, n - var12, var5, 281);
            c.a((String)var1, 1, 2, var0);
            a(var2, var6, j);
         } else if (var2 > -var6 && var2 <= c.l) {
            var0.setColor(c.m[5]);
            c.c(0, F + var12, var2, n - var12, var5, 281);
            c.a((String)var1, 0, 2, var0);
         }

         if (var2 > -var6 && var2 <= c.l) {
            var0.setClip(F, A, n, f);
            c.a(var10, var2 + var11, 156, a[var4], var0);
         }
      }

      return var6;
   }

   public static final int a(Graphics var0, String var1, int var2, int var3, int var4, boolean var5) {
      if (var0 != null) {
         int var6 = c.aA - (c.b[1386] + c.b[1529] + 2 * c.b[1518]);
         int var7 = c.b[1650] / c.b[1655];
         int var8 = c.b[1651] / c.b[1656];
         int var9 = (var6 - var7 * e) / (e + 1);
         int var10 = (var7 += var9) * e + var9;
         int var11 = (c.aA - var10 >> 1) + var4 * var7 + var9;
         var2 = c.l - (c.b[1387] + c.b[1607] - 7);
         int var12 = c.l - (var8 + 5);
         if (var2 > var12) {
            var2 = var12;
         }

         var0.setClip(0, 0, c.aA, c.l);
         c.a(var11, var2, 150, var3, var0);
         if (var5) {
            c.a(var11, var2, 150, 59, var0);
            c.a = var1;
            c.s(var0);
         }
      }

      return 0;
   }

   public static final int a(Graphics var0, String[] var1, int var2, int var3, int var4) {
      boolean var5 = false;
      if (var1 == null) {
         return 0;
      } else {
         int var6 = c.a[2].getHeight();
         int var7 = var1.length;
         int var11 = var6 * var7;
         if (var0 != null) {
            int var8 = var2;
            int var9 = F;
            if (c > 17) {
               var8 = var2 + 5;
               var9 += 8;
            } else {
               var9 += 3;
            }

            if (var3 <= 0) {
               var0.setColor(c.m[5]);
            } else {
               var0.setColor(c.m[var3]);
            }

            var0.setFont(c.a[2]);

            for(int var10 = 0; var10 < var7; ++var10) {
               if (var8 >= A && var8 + var6 <= A + f) {
                  var0.drawString(var1[var10], var9 + 0, var8 + 0, 20);
               }

               var8 += var6;
            }
         }

         return c > 17 ? var11 + var4 + 5 : var11 + var4;
      }
   }

   public static final int a(Graphics var0, String[] var1, int var2) {
      int var3 = c.a[2].getHeight();
      int var4 = var1.length;
      if (var0 != null) {
         int var5 = var2;
         int var6 = c.aA >> 1;
         var0.setColor(c.m[26]);
         var0.setFont(c.a[2]);

         for(int var7 = 0; var7 < var4; ++var7) {
            if (var5 >= A && var5 + var3 <= A + f) {
               var0.drawString(var1[var7], var6 + 0, var5 + 0, 17);
            }

            var5 += var3;
         }
      }

      return var3 * var4;
   }

   public static final int a(Graphics var0, int var1) {
      int var2 = a.size();
      int var3 = c.a[2].getHeight();
      if (var0 != null) {
         int var4 = var1 + 5;
         var0.setClip(F, A, n, f - 2);
         var0.setFont(c.a[2]);

         for(int var5 = 0; var5 < var2; ++var5) {
            if (var4 >= A + 5 && var4 + var3 <= A + f) {
               var0.drawString((String)a.elementAt(var5), F + 8 + 0, var4 + 0, 20);
               if (b == var5) {
                  var0.setColor(c.m[16]);
               } else {
                  var0.setColor(c.m[5]);
               }

               var0.drawString((String)b.elementAt(var5), F + n - 8 + 0, var4 + 0, 24);
            }

            var4 += var3;
         }
      }

      return var3 * var2 + 5 + 10;
   }

   public static final int a(Graphics var0, String var1, int var2, int var3, boolean var4) {
      int var5;
      int var6 = (var5 = c.a[1].getHeight()) + 5;
      if (var0 != null && var1 != null) {
         var0.setClip(F, A + 1, n, f - 2);
         int var7 = c.b[1650] / c.b[1655];
         int var8 = c.b[1651] / c.b[1656];
         int var9 = (var5 + 5 - var8 >> 1) + 1;
         var0.setFont(c.a[1]);
         if (var4) {
            var0.setColor(c.m[10]);
            var0.fillRect(F, var3, n, var5 + 5);
            var0.setColor(c.m[5]);
            var0.drawRect(F, var3, n - 1, var5 + 5);
            c.a(F + 3, var3 + var9, 150, var2, var0);
            c.c(1, F + 2 + var7 + 5, var3 + 1, n - var7 - 5 - 6, var5 + 5, 409);
            c.a((String)var1, 1, 1, var0);
            a(var3, var6, j);
         } else if (var3 > -var6 && var3 <= c.l) {
            var0.setColor(c.m[9]);
            var0.fillRect(F, var3, n, var5 + 5);
            var0.setColor(c.m[5]);
            var0.drawRect(F, var3, n - 1, var5 + 5);
            c.a(F + 3, var3 + var9, 150, var2, var0);
            c.c(0, F + 2 + var7 + 5, var3 + 1, n - var7 - 5 - 6, var5 + 5, 281);
            c.a((String)var1, 0, 1, var0);
         }
      }

      return var6;
   }

   public static final int a(Graphics var0, String var1, boolean var2, int var3, int var4) {
      int var5;
      int var6 = (var5 = c.a[1].getHeight()) + 5;
      if (var0 != null && var1 != null) {
         boolean var7 = (var4 & '耀') != 0;
         var4 &= 32767;
         int var8 = c.m[9];
         int var9 = c.m[10];
         int var10 = 0;
         int var11 = c.b[1650] / c.b[1655];
         int var12 = c.b[1651] / c.b[1656];
         if (c == 19) {
            var1 = a.a(c.a[a][var4]);
            int[] var13;
            var10 = (var13 = c.a(c.a[a][var4]))[2];
            if (a == 0 && var4 == c.O[42]) {
               var8 = c.m[11];
               var9 = c.m[12];
            } else if (a == 2 && c.a[a][var4][6] > 1) {
               var1 = c.a[a][var4][6] + "x " + var1;
            } else if (a == 1 && var4 == c.O[41]) {
               var8 = c.m[11];
               var9 = c.m[12];
            } else if (a == 4 && var4 == c.O[45]) {
               var8 = c.m[11];
               var9 = c.m[12];
            } else if (a == 3) {
               if (var13[10] == 1 && c.O[44] == var4) {
                  var8 = c.m[11];
                  var9 = c.m[12];
               } else if (var13[10] == 0 && ((short)(c.O[43] & '\uffff') == var4 || (short)((c.O[43] & -65536) >> 16) == var4)) {
                  var8 = c.m[11];
                  var9 = c.m[12];
               }
            }
         } else if (c == 21) {
            var1 = a.a(a.c[var4]);
            var10 = c.a(a.c[var4])[2];
            if ((a.c[var4][3] & 256) != 0 && a.c[var4][6] > 1) {
               var1 = a.c[var4][6] + "x " + var1;
            }
         }

         var0.setFont(c.a[1]);
         int var14;
         if (var2) {
            var0.setColor(var9);
            var0.fillRect(F, var3, n, var5 + 5);
            var0.setColor(c.m[5]);
            var0.drawRect(F, var3, n - 1, var5 + 5);
            var14 = (var5 + 5 - var12 >> 1) + 1;
            c.a(F + 3, var3 + var14, 150, var10, var0);
            c.c(1, F + 2 + var11 + 5, var3 + 1, n - var11 - 5 - 4, var5 + 5, 409);
            if (var7) {
               var0.setColor(c.m[16]);
            }

            c.a((String)var1, 1, 1, var0);
            a(var3, var6, j);
         } else if (var3 > -var6 && var3 <= c.l) {
            var0.setColor(var8);
            var0.fillRect(F, var3, n, var5 + 5);
            var0.setColor(c.m[5]);
            var0.drawRect(F, var3, n - 1, var5 + 5);
            var14 = (var5 + 5 - var12 >> 1) + 1;
            c.a(F + 3, var3 + var14, 150, var10, var0);
            c.c(0, F + 2 + var11 + 5, var3 + 1, n - var11 - 5 - 4, var5 + 5, 281);
            if (var7) {
               var0.setColor(c.m[16]);
            }

            c.a((String)var1, 0, 1, var0);
         }
      }

      return var6;
   }

   public static final int a(Graphics var0) {
      var0.setClip(0, 0, c.aA, c.l);
      if (var0 != null) {
         boolean var1 = false;
         boolean var2 = false;
         int var3 = 0;
         int var4 = 2;
         int var5 = 135;
         int var6 = 135;
         int var7;
         if (l) {
            var7 = j;
            short[] var8 = a[c];
            if (var7 >= 0) {
               short var9;
               var1 = (var9 = var8[(var7 << 2) + 2]) != 103 && var9 != 104 && var9 != 108;
            }

            var2 = a.size() > 0;
            if (z >= 0) {
               var3 = z;
               var5 = y;
               var1 = true;
            }

            if (r >= 0) {
               var4 = r;
               var6 = t;
               var2 = true;
            }

            if (s == 35) {
               var2 = false;
            }

            if (E == 35) {
               var1 = false;
            }
         }

         boolean var11 = false;
         int var12;
         if (c <= 17) {
            var12 = 10 + (c.b[var5 * 11 + 0] / c.b[var5 * 11 + 5] >> 1);
            var7 = c.l - 10;
         } else {
            var7 = c.l;
            var12 = c.b[1606] >> 1;
         }

         if (var1) {
            c.a(var12, var7, var5, var3, var0);
         }

         if (var2) {
            c.a(c.aA - var12, var7, var6, var4, var0);
         }

         var7 = A + f + 2;
         int var13 = c.b[1639] / c.b[1644];
         int var10;
         if ((var10 = l - A) < 0) {
            c.a((c.aA >> 1) - var13, var7, 149, 0, var0);
         }

         if (var10 > f - q) {
            c.a(c.aA >> 1, var7, 149, 1, var0);
         }
      }

      return 0;
   }

   public static final void b(Graphics var0) {
      var0.setClip(0, 0, c.aA, c.l);
      var0.setColor(c.m[8]);
      var0.fillRect(0, 0, c.aA, c.l);
      int var1 = c.b[1738] / c.b[1743];
      boolean var2 = false;
      int var3 = c.aA - 10;
      int var4 = c.l - 10;
      boolean var5 = false;
      int var6 = 5;
      if (c != 0) {
         var6 = c.b[1728] >> 1;
         var4 = c.l - var6 - 5;
      }

      var0.setColor(c.m[3]);
      var0.drawRect(7, var6 + 2, var3 - 3, var4 - 3);
      var0.setColor(c.m[6]);
      var0.drawRect(6, var6 + 1, var3 - 3, var4 - 3);
      var0.setColor(c.m[5]);
      var0.drawRect(5, var6, var3 - 3, var4 - 3);
      c.a(5, var6, 158, 0, var0);
      c.a(5 + var3 - var1, var6, 158, 1, var0);
      var6 += 3;
      if (c == 0) {
         var6 += 5;
         c.a(c.aA >> 1, var6, 159, 0, var0);
         var6 += c.b[1750] + 5;
      } else {
         var6 = 6 + c.b[1728];
         var4 = c.l - 10;
         var3 = c.aA - 26;
         c.a(c.aA >> 1, 3, 157, 0, var0);
         var0.setColor(c.m[4]);
         int var7 = c.a[2].getHeight() + 5;
         var0.fillRect(13, var6, var3, var7);
         var0.setColor(c.m[6]);
         var0.drawRect(13, var6, var3, var7);
         var0.drawRect(14, var6 + 1, var3 - 1, var7 - 1);
         var0.setColor(c.m[5]);
         var0.drawRect(13, var6, var3 - 1, var7 - 1);
         var6 += var7 - 1;
      }

      var3 = c.aA - 26;
      var4 -= var6 + c.b[1486] + 3;
      var0.setColor(c.m[3]);
      var0.fillRect(13, var6, var3, var4);
      var0.setColor(c.m[6]);
      var0.drawRect(13, var6, var3, var4);
      var0.drawRect(14, var6 + 1, var3 - 1, var4 - 1);
      var0.setColor(c.m[5]);
      var0.drawRect(13, var6, var3 - 1, var4 - 1);
      c.a(13, var6, 152, 0, var0);
      c.a(13 + var3, var6, 152, 0, 0, 2, var0);
      var6 += var4;
      int var8;
      c.a(var8 = c.aA >> 1, var6, 152, 0, var0);
      c.a(var8, var6, 152, 0, 0, 2, var0);
   }

   public static final int a(Graphics var0, String var1, int var2, boolean var3) {
      int var4;
      int var5 = (var4 = c.a[2].getHeight()) + 5;
      if (var0 != null && var1 != null) {
         var0.setFont(c.a[2]);
         if (var3) {
            var0.setColor(c.m[10]);
            var0.fillRect(F, var2, n, var4 + 2);
            var0.setColor(c.m[5]);
            c.c(1, F, var2, n, var4, 284);
            c.a((String)var1, 1, 2, var0);
            a(var2, var5, j);
         } else if (var2 > -var5 && var2 <= c.l) {
            var0.setColor(c.m[5]);
            c.c(0, F, var2, n, var4, 284);
            c.a((String)var1, 0, 2, var0);
         }
      }

      return var5;
   }

   public static final void q(int var0) {
      int var1;
      int var11;
      boolean var13;
      switch(var0) {
      case 1:
         e = true;
         l = false;
         v = 0;
         j = -1;
         c.y();
         c.x();
         c.k();
         c.a.a(a, 13, 7, 3, false);
         (new Thread(c.a)).start();
         return;
      case 2:
         a.g(4);
         a.destroyApp(false);
         return;
      case 3:
         a.removeAllElements();
         l = false;
         v = 0;
         j = -1;
         c.y();
         return;
      case 4:
         c.e(2);
      case 34:
         e = false;
         a.removeAllElements();
         a.m();
         a.g(5);
         g(0);
         h();
         m(1);
         l = true;
         return;
      case 5:
         if (b != null) {
            if (a()) {
               a.g(4);
               return;
            }

            g(0);
            return;
         }

         g(13);
         break;
      case 6:
         l();
         return;
      case 7:
         o();
         if (b(0)) {
            h();
         } else if (b(2)) {
            if (b(0) != 0) {
               h();
            }
         } else if (e) {
            if (c.e > 0) {
               if (b(2) != 0) {
                  h();
                  m(2);
               }
            } else if (b(c.ab) != 0) {
               h();
               m(c.ab);
            }
         } else if (b(1) != 0 && b(0) != 0) {
            h();
            m(1);
         }

         l();
         return;
      case 8:
         p();
         l();
         return;
      case 9:
         if (b(0)) {
            a((int)1, (int)1);
            o();
         }

         a.g(2);
         return;
      case 10:
         a((int)0, (int)1);
         o();
         a.g(2);
         return;
      case 11:
         l = false;
         v = 0;
         j = -1;
         c.y();
         return;
      case 12:
         c = a[c][j * 4 + 3] & 32767;
         b = c.a[a][c];
         a.push(new Integer(c));
         a.push(new Integer(j));
         g(20);
         return;
      case 13:
         int[] var19;
         if (((var19 = c.a[a][c])[3] & 256) != 0) {
            c.a(a((int)224) + "\n" + a((int)242) + ": @x@@", a.a(var19), 26, 101, 1, var19[6], 0);
            return;
         }

         c.a(a, c, 1, false, true);
         if (c != 19 && c != 21) {
            l();
            return;
         }

         a(c);
         return;
      case 14:
         c.d(a, c);
         if (c != 19 && c != 21) {
            l();
            return;
         }

         a(c);
         return;
      case 15:
         l = false;
         v = 0;
         j = -1;
         c.f();
         c.r = true;
         return;
      case 16:
      case 17:
      case 18:
      case 20:
      case 41:
      case 42:
      case 43:
      case 44:
      case 45:
      case 46:
      case 47:
      case 48:
      case 49:
      case 50:
      case 51:
      case 52:
      case 53:
      case 54:
      case 55:
      case 56:
      case 57:
      case 58:
      case 59:
      case 60:
      case 61:
      case 62:
      case 63:
      case 64:
      case 65:
      case 66:
      case 67:
      case 68:
      case 69:
      case 70:
      case 71:
      case 72:
      case 73:
      case 74:
      case 75:
      case 76:
      case 77:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 83:
      case 84:
      case 85:
      case 86:
      case 87:
      case 88:
      case 89:
      case 90:
      case 91:
      case 92:
      case 93:
      case 94:
      case 95:
      case 96:
      case 97:
      case 98:
      case 99:
      default:
         break;
      case 19:
         var13 = false;
         boolean var12 = false;
         int var15 = a.c[c.ag][3];
         boolean var18 = false;
         if ((var15 & 32) == 0 && (var15 & 4096) == 0) {
            short var17 = (short)(a.c[c.ag][0] & '\uffff');
            short var6 = (short)((a.c[c.ag][0] & -65536) >> 16);

            for(var1 = a.a[var6][var17]; var1 >= 0 && (a.c[var1][3] & 10176) <= 0; var1 = (short)(a.c[var1][1] & '\uffff')) {
            }
         } else {
            int var5 = a.a(c.ag, (int[])null) + G;
            var1 = (short)(c.D[var5] & '\uffff');
         }

         var11 = var1;
         int var20 = 0;
         short var7 = -1;

         while(var1 != -1) {
            if (B == var20) {
               var7 = (short)(a.c[var1][2] & '\uffff');
               break;
            }

            ++var20;

            for(var1 = (short)(a.c[var1][1] & '\uffff'); var1 >= 0 && (a.c[var1][3] & 10176) <= 0; var1 = (short)(a.c[var1][1] & '\uffff')) {
            }
         }

         if ((a.c[c.ag][3] & 32) != 0 && (a.c[c.ag][13] & 2) == 0) {
            String var21 = a((int)219) + "\n" + a((int)252) + ": ";
            if ((a.c[var7][3] & 256) != 0) {
               c.a(var21 + "@1@@\n" + a((int)242) + ": @x@@", a.a(a.c[var7]), 24, 101, 1, a.c[var7][6], a.a(a.c[var7]));
            } else {
               c.a(var21 + a.a(a.c[var7]), a.a(a.c[var7]), 24, 101);
            }

            if (c != 19 && c != 21) {
               l();
               return;
            }
         } else {
            if ((10176 & a.c[c.ag][3]) <= 0) {
               if (c.a(false)) {
                  l();
                  return;
               }

               q(11);
               return;
            }

            c.i(var7);
            int var8;
            if ((var8 = f(21)) == 0) {
               q(11);
               return;
            }

            if (var8 == 1) {
               int[] var10000 = a.c[var11];
               var10000[3] &= -524289;
               var10000 = a.c[var11];
               var10000[3] &= -1048577;
            }

            if (c != 19 && c != 21) {
               c.c((short)(c.O[0] & '\uffff'), (short)((c.O[0] & -65536) >> 16));
               l();
               return;
            }
         }
         break;
      case 21:
         var11 = a[c][j * 4 + 3] & 32767;
         b = a.c[var11];
         B = j - 1;
         a.push(new Integer(c));
         a.push(new Integer(j));
         g(22);
         return;
      case 22:
         var13 = false;
         int[] var9 = c.a[a][c];
         if ((a.c[c.ag][3] & 32) != 0 && (a.c[c.ag][13] & 2) == 0) {
            String var14 = a((int)249) + "\n" + a((int)252) + ": ";
            int var16;
            if ((var16 = a.a(var9)) % 2 != 0) {
               ++var16;
            }

            var16 = var16 * 40 / 100;
            if ((var9[3] & 256) != 0) {
               c.a(var14 + "@1@@\n" + a((int)242) + ": @x@@", a.a(var9), 23, 101, 1, var9[6], var16);
            } else {
               c.a(var14 + var16, a.a(var9), 23, 101);
            }
         } else if ((10176 & a.c[c.ag][3]) > 0) {
            if ((var9[3] & 256) == 0) {
               c.L = 1;
               q(29);
               return;
            }

            c.a(a((int)224) + "\n" + a((int)242) + ": @x@@", a.a(var9), 29, 101, 1, var9[6], 0);
         } else {
            if ((var9[3] & 256) == 0) {
               if (c != 19 && c != 21) {
                  l();
               }

               c.a(false);
               return;
            }

            c.a(a((int)224) + "\n" + a((int)242) + ": @x@@", a.a(var9), 25, 101, 1, var9[6], a.a(var9));
         }

         if (c != 19 && c != 21) {
            l();
            return;
         }
         break;
      case 23:
         c.a(true);
         return;
      case 24:
         c.a(true);
         return;
      case 25:
         c.a(false);
         return;
      case 26:
         c.a(a, c, c.L, false, true);
         if (c != 19 && c != 21) {
            l();
            return;
         }

         a(c);
         return;
      case 27:
         a.push(new Integer(c));
         a.push(new Integer(j));
         g(24);
         return;
      case 28:
         for(var1 = 0; var1 < c.s.length; ++var1) {
            if (c.s[var1][3] == j) {
               C = var1;
               break;
            }
         }

         a.push(new Integer(c));
         a.push(new Integer(j));
         g(26);
         return;
      case 29:
         short var10 = (short)(c.O[0] & '\uffff');
         short var2 = (short)((c.O[0] & -65536) >> 16);
         short var3 = (short)(a.c[c.ag][0] & '\uffff');
         short var4 = (short)((a.c[c.ag][0] & -65536) >> 16);
         c.O[0] = (short)var3 & '\uffff' | (short)var4 << 16 & -65536;
         c.a(a, c, c.L, false, true);
         c.O[0] = (short)var10 & '\uffff' | (short)var2 << 16 & -65536;
         if (c != 19 && c != 21) {
            l();
            return;
         }

         a(c);
         return;
      case 30:
         e = true;
         l = false;
         v = 0;
         j = -1;
         c.H = 5;
         c.x();
         c.k();
         c.d(2);
         c.a.a(a, c.O[11], (short)(c.O[0] & '\uffff'), (short)((c.O[0] & -65536) >> 16), false);
         (new Thread(c.a)).start();
         return;
      case 31:
         if (!c.o(2) && !c.o(3)) {
            q(1);
            return;
         }

         a.push(new Integer(c));
         a.push(new Integer(j));
         g(1);
         return;
      case 32:
         c.e(2);
         return;
      case 33:
         if ((short)(c.O[12] & '\uffff') <= 0) {
            q(34);
            return;
         }

         a.push(new Integer(c));
         a.push(new Integer(j));
         if (c.O[11] == -1) {
            g(16);
            return;
         }

         g(15);
         return;
      case 35:
         return;
      case 36:
         c.b(312, 238, 30, 6);
         return;
      case 37:
         c.b(462, 247, 32, 6);
         return;
      case 38:
         c.b(313, 238, 39, 6);
         return;
      case 39:
         e = true;
         l = false;
         v = 0;
         j = -1;
         c.H = 5;
         c.x();
         c.k();
         c.d(3);
         c.a.a(a, c.O[11], (short)(c.O[0] & '\uffff'), (short)((c.O[0] & -65536) >> 16), false);
         (new Thread(c.a)).start();
         return;
      case 40:
         g(15);
         return;
      case 100:
         c.V[0] = 1;
         c.g(c.V, c.g);
         c.V = null;
         c.g = -1;
         c.a(10, 0, 0, 0, 0, true);
         c.a.a(a, c.M, c.Q, c.ae, false);
         (new Thread(c.a)).start();
         return;
      case 101:
         if (c.V != null) {
            c.V[0] = 0;
            c.V = null;
            c.g = -1;
         }

         c.t = false;
         return;
      case 102:
         c.a(10, 0, 0, 0, 0, true);
         c.a.a(a, c.M, c.Q, c.ae, true);
         (new Thread(c.a)).start();
         return;
      case 103:
         var1 = c.k[c.M][9];
         c.k[c.M][var1++] = 1;
         c.k[c.M][9] = var1;
         c.k[c.M][0] = 1;
         return;
      case 104:
         var1 = c.k[c.M][9];
         c.k[c.M][var1++] = 0;
         c.k[c.M][9] = var1;
         c.k[c.M][0] = 1;
         return;
      case 105:
         c.k[c.M][0] = 1;
         return;
      }

   }

   public static final int g(int var0) {
      int var1 = 0;
      short[] var2 = a[var0];
      p = j(var0);
      int var3 = 0;
      boolean var4 = false;
      boolean var5 = false;

      for(int var6 = 0; var6 < p; ++var6) {
         String[] var8;
         switch(var2[(var6 << 2) + 2]) {
         case 50:
            var8 = c[var3++];
            var1 += a((Graphics)null, var8, 0);
            break;
         case 100:
         case 101:
            var1 += a((Graphics)null, (String)null, 0, false);
            break;
         case 102:
            var1 += a((Graphics)null, (String)null, 0, false, 0);
            break;
         case 103:
         case 104:
            var8 = c[var3++];
            var1 += a((Graphics)null, var8, 0, -1, (byte)(var2[(var6 << 2) + 3] & 255));
            break;
         case 105:
            var1 += a((Graphics)null, (String)null, false, 0, 0);
            break;
         case 108:
            var1 += a((Graphics)null, 0);
            break;
         case 109:
            var1 += a((Graphics)null, (String)null, 0, 0, false);
         }
      }

      return var1;
   }

   public static final boolean a(short var0) {
      short[] var1;
      short var2 = (var1 = a[var0])[3];
      short var3 = var1[2];
      boolean var4 = false;
      int var5;
      if (var3 == 6 && var2 == 1) {
         F = c.b[1617] / c.b[1622];
         A = c.a(true) + 3;
         n = c.aA - (c.b[1617] / c.b[1622] + c.b[1617] / c.b[1622]);
         f = c.l - (c.a(true) + 3 + c.b[1607] + c.b[1387] + c.b[1617] / c.b[1622] + c.b[1640] + 5);
         var5 = c.b[1650] / c.b[1655] + 5;
         c.a(0, F + var5, A, n, f);
         c.a(1, F + var5, A, n, f);
      } else if (c == 0) {
         F = 17;
         A = 20 + c.b[1750] + c.b[1486];
         n = c.aA - 2 * F;
         f = c.l - 10 - 5 - c.b[1486] - A - (c.b[1640] + 5);
         c.a(0, F, A, n, f);
         c.a(1, F, A, n, f);
      } else {
         var5 = c.a[2].getHeight() + 5;
         F = 17;
         A = c.b[1728] + 8 + var5 + c.b[1486];
         n = c.aA - 2 * F;
         f = c.l - 10 - (A + c.b[1486] + 4) - (c.b[1640] + 5);
         c.c(2, F + 2, c.b[1728] + 6, n - 4, var5, 28);
         c.a(0, F, A, n, f);
         c.a(1, F, A, n, f);
      }

      switch(var0) {
      case 1:
         b(var0);
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
      case 15:
      case 16:
      case 17:
      default:
         break;
      case 14:
         a((int)var0);
         break;
      case 18:
         v = 0;
         break;
      case 19:
         d();
         var4 = true;
         break;
      case 20:
         p(var0);
         break;
      case 21:
         f(var0);
         var4 = true;
         break;
      case 22:
         n(var0);
         break;
      case 23:
         v |= 8;
         i(var0);
         break;
      case 24:
         f(var0);
         break;
      case 25:
         v |= 4;
         k(var0);
         break;
      case 26:
         o(var0);
      }

      i();
      return var4;
   }

   public static final void i() {
      c.f(0, 0, 0);
      c.f(1, -2, 0);
      c.f(2, -2, 0);
   }

   public static final String[] a(int var0, Font var1, int var2) {
      String[] var3 = null;
      switch(var0) {
      case 1:
         char[] var8 = (new String("11-01-2008")).toCharArray();
         var3 = a("(c) 20" + var8[8] + var8[9] + ",\n" + a((int)473) + "\n" + a((int)13) + "\nv " + a.getAppProperty("MIDlet-Version"), var1, var2, 0);
         break;
      case 2:
         var3 = a(a((int)303) + ", " + a((int)293) + ":\n" + a((int)201) + "\n\n" + a((int)300) + ", " + a((int)297) + ":\n" + a((int)195) + "\n\n" + a((int)302) + ", " + a((int)295) + ":\n" + a((int)199) + "\n\n" + a((int)304) + ", " + a((int)296) + ":\n" + a((int)203) + "\n\n" + a((int)306) + ", " + a((int)294) + ":\n" + a((int)207) + "\n\n" + a((int)299) + ":\n" + a((int)193) + "\n\n" + a((int)301) + ":\n" + a((int)197) + "\n\n" + a((int)305) + ":\n" + a((int)205) + "\n\n" + a((int)307) + ":\n" + a((int)209) + "\n\n" + a((int)309) + ":\n" + a((int)213) + "\n\n" + a((int)308) + ":\n" + a((int)189) + "\n\n" + a((int)310) + ":\n" + a((int)191) + "\n\n" + a((int)311) + ":\n" + a((int)211), var1, var2, 0);
         break;
      case 3:
         var3 = a(a((int)303) + ", " + a((int)293) + ":\n" + a((int)200) + "\n\n" + a((int)300) + ", " + a((int)297) + ":\n" + a((int)194) + "\n\n" + a((int)302) + ", " + a((int)295) + ":\n" + a((int)198) + "\n\n" + a((int)304) + ", " + a((int)296) + ":\n" + a((int)202) + "\n\n" + a((int)306) + ", " + a((int)294) + ":\n" + a((int)206) + "\n\n" + a((int)309) + ":\n" + a((int)212) + "\n\n" + a((int)310) + ":\n" + a((int)190) + "\n\n" + a((int)311) + ":\n" + a((int)210) + "\n\n\n" + a((int)298) + ":\n" + a((int)407), var1, var2, 0);
         break;
      case 4:
         if ((short)(c.s[C][0] & '\uffff') == 1) {
            var3 = a(a(c.s[C][1] + c.s[C][2]), var1, var2, 0);
         }
         break;
      case 5:
         int var4;
         int var5 = (var4 = c.s[C][1]) + c.s[C][2];
         if ((short)(c.s[C][0] & '\uffff') == 1) {
            --var5;
         }

         String var6 = "";

         for(int var7 = var5; var7 > var4; --var7) {
            if ((short)(c.s[C][0] & '\uffff') != 1 && var7 == var5) {
               var6 = var6 + a(var7);
            } else {
               var6 = var6 + "\n" + a(var7);
            }

            if (var7 > var4 + 1) {
               var6 = var6 + "\n";
            }
         }

         if (var6.length() > 0) {
            var3 = a(var6, var1, var2, 0);
         }
         break;
      case 6:
         var3 = a(a((int)299) + ":\n" + a((int)192) + "\n\n" + a((int)301) + ":\n" + a((int)196) + "\n\n" + a((int)305) + ":\n" + a((int)204) + "\n\n" + a((int)307) + ":\n" + a((int)208) + "\n\n" + a((int)308) + ":\n" + a((int)188), var1, var2, 0);
      }

      return var3;
   }

   public static final void a(int var0, int var1, int var2) {
      int var3 = var0 + var1;
      int var4 = A + f;
      int var5;
      if (var3 > var4) {
         var5 = var3 - var4;
         l -= var5;
      } else if (var0 < A) {
         var5 = A - var0;
         l += var5;
      }

      var5 = d(c);
      if (var2 == var5) {
         l = A;
      }

   }

   public static final byte a(int var0) {
      byte var1 = 0;
      switch(var0) {
      case 0:
         if (b(0)) {
            var1 = 1;
         }
         break;
      case 1:
         if (b(1)) {
            var1 = 1;
         }
         break;
      case 2:
         if (b(2)) {
            var1 = 1;
         }
         break;
      case 3:
         if (b(3)) {
            var1 = 1;
         }
         break;
      case 4:
         if (!b(3)) {
            var1 = 1;
         }
      case 5:
      case 6:
      default:
         break;
      case 7:
         if (b(5)) {
            var1 = 1;
         }
         break;
      case 8:
         if (b(6)) {
            var1 = 1;
         }
         break;
      case 9:
         if (!b(6)) {
            var1 = 1;
         }
      }

      return var1;
   }

   public static final void c(int var0, int var1) {
      switch(var0) {
      case 0:
         if (var1 == 1) {
            a((int)0, (int)1);
            return;
         }
         break;
      case 1:
         if (var1 == 1) {
            a((int)1, (int)1);
            return;
         }
         break;
      case 2:
         if (var1 == 1) {
            a((int)2, (int)1);
            return;
         }
         break;
      case 3:
         if (var1 == 1) {
            a((int)3, (int)1);
            return;
         }
         break;
      case 4:
         if (var1 == 1) {
            a((int)3, (int)0);
            return;
         }
      case 5:
      case 6:
      case 7:
      default:
         break;
      case 8:
         if (var1 == 1) {
            a((int)6, (int)1);
            return;
         }
         break;
      case 9:
         if (var1 == 1) {
            a((int)6, (int)0);
         }
      }

   }

   public static final int j(int var0) {
      short var1 = 0;
      int var3 = a[var0].length / 4;
      boolean var4 = false;

      for(int var5 = 0; var5 < var3; ++var5) {
         boolean var6 = false;
         ++var1;
      }

      return var1;
   }

   public static final int i(int var0) {
      short var1 = 0;
      short[] var2;
      int var3 = (var2 = a[var0]).length / 4;
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         short var6 = var2[var4 + 2];
         var4 += 4;
         if (var6 > 99 && var6 < 200) {
            ++var1;
         }
      }

      return var1;
   }

   public static final String a(short var0, short var1) {
      String var2 = "";
      int var4;
      if ((var4 = a[var0][(var1 << 2) + 0]) >= 0) {
         if (var0 == 25) {
            var4 |= 262144;
         }

         var2 = a(var4);
      }

      return var2;
   }

   public static final int d(int var0) {
      int var1 = -1;
      boolean var2 = false;
      short[] var3 = a[var0];
      boolean var4 = false;

      for(int var5 = 0; !var4; ++var5) {
         int var6;
         if ((var6 = (var5 << 2) + 2) <= var3.length) {
            short var7;
            if ((var7 = var3[var6]) > 99 && var7 < 200) {
               var1 = var5;
               var4 = true;
            }
         } else {
            var4 = true;
         }
      }

      return var1;
   }

   public static final int c(int var0) {
      int var1 = -1;

      short[] var2;
      for(int var4 = (var2 = a[var0]).length / 4 - 1; var4 >= 0; --var4) {
         short var5;
         if ((var5 = var2[(var4 << 2) + 2]) > 99 && var5 < 200) {
            var1 = var4;
            break;
         }
      }

      return var1;
   }

   public static final int a(int var0, int var1) {
      if (var0 >= 0 && var0 < a.length) {
         short[] var2 = a[var0];

         for(int var3 = 0; var3 < var2.length; var3 += 4) {
            if (var2[var3 + 0] == var1) {
               return var3 / 4;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   public static final void a(int var0, int var1, int var2, int var3, int var4, int var5) {
      if (var0 >= 0 && var0 < a.length) {
         short[] var6 = a[var0];
         int var7;
         if ((var7 = var1 * 4) >= 0 && var7 <= var6.length) {
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
            a[var0] = var8;
         }
      }
   }

   public static final void e() {
      if (i(c) > 0) {
         short[] var1;
         short var2 = (var1 = a[c])[j * 4 + 2];
         int var3 = var1.length / 4;
         if (var2 == 103 || var2 == 104 || var2 == 108) {
            int var4 = q - A - f;
            if (-l < var4) {
               l -= c.a[2].getHeight();
            }

            if (i) {
               if (o >= 0) {
                  j = o;
                  return;
               }

               ++j;
            }

            return;
         }

         ++j;
         if (j >= var3) {
            j = 0;
            l = A;
         }

         if ((var2 = var1[j * 4 + 2]) <= 99 || var2 >= 200) {
            e();
         }
      }

      i();
   }

   public static final void m() {
      boolean var0 = i(c) > 0;
      int var1 = j;
      if (var0) {
         short[] var2;
         short var3 = (var2 = a[c])[j * 4 + 2];
         boolean var4 = false;
         if (var3 != 103 && var3 != 104 && var3 != 108) {
            if (D >= 0 && D < j) {
               j = D;
            } else {
               --j;
            }
         } else {
            if (l < A) {
               l += c.a[2].getHeight();
            } else {
               --j;
            }

            if (n && var1 == j) {
               --j;
            }
         }

         int var5 = d(c);
         int var6 = c(c);
         if (j < var5) {
            j = var6;
         }

         if ((var3 = var2[j * 4 + 2]) <= 99 || var3 >= 200) {
            m();
         }
      }

   }

   public static final void g() {
      int var0 = a[c].length / 4;
      if (j >= 0 && j < var0) {
         short[] var1 = a[c];
         int var2 = j * 4;
         short var3 = var1[var2 + 1];
         short var4 = var1[var2 + 3];
         switch(var1[var2 + 2]) {
         case 100:
         case 107:
            a.push(new Integer(c));
            a.push(new Integer(j));
            g(var3);
            return;
         case 101:
         case 105:
         case 106:
         case 109:
            q(var3);
            return;
         case 102:
            int var6 = -1;

            int var7;
            for(var7 = 0; var7 <= j; ++var7) {
               if (a[c][(var7 << 2) + 2] == 102) {
                  ++var6;
               }
            }

            var7 = j(c);
            short var8 = var4;
            if (var4 >= 0) {
               int var9 = 0;

               for(int var10 = 0; var10 < var7; ++var10) {
                  short[] var11;
                  if ((var11 = a[c])[(var10 << 2) + 2] == 102) {
                     if (var11[(var10 << 2) + 3] == var8) {
                        a[var9] = 0;
                     }

                     ++var9;
                  }
               }
            }

            a[var6] = 1;
            c(var3, 1);
         case 103:
         case 104:
         case 108:
         }
      }

   }

   public static final void a(short var0) {
      boolean var1 = a(var0);
      l = A;
      Object var2 = null;
      short[] var9 = a[c];
      p = j(var0);
      if (b == null || b.length != p) {
         b = new String[p];
      }

      int var3 = 0;
      int var4 = 0;
      e = 0;
      E = -1;
      s = -1;
      z = -1;
      r = -1;
      y = -1;
      t = -1;

      for(short var5 = 0; var5 < p; ++var5) {
         switch(var9[(var5 << 2) + 2]) {
         case 2:
            s = var9[(var5 << 2) + 1];
            r = var9[(var5 << 2) + 3];
            t = var9[(var5 << 2) + 0];
            break;
         case 3:
            E = var9[(var5 << 2) + 1];
            z = var9[(var5 << 2) + 3];
            y = var9[(var5 << 2) + 0];
         case 4:
         case 5:
         case 6:
            break;
         case 50:
         case 103:
         case 104:
            ++var3;
            break;
         case 102:
            ++var4;
         case 109:
         default:
            b[var5] = a(var0, var5);
            break;
         case 106:
         case 107:
            ++e;
            b[var5] = a(var0, var5);
         }
      }

      short var8;
      int var10;
      if (var4 > 0) {
         if (a == null || a.length != var4) {
            a = new byte[var4];
         }

         var10 = 0;

         for(int var6 = 0; var6 < p; ++var6) {
            if (var9[(var6 << 2) + 2] == 102) {
               var8 = var9[(var6 << 2) + 1];
               a[var10] = a((int)var8);
               ++var10;
            }
         }
      }

      if (var3 > 0) {
         c = new String[var3][];
         var10 = 0;

         for(short var11 = 0; var11 < p; ++var11) {
            short var7;
            if ((var7 = var9[(var11 << 2) + 2]) != 103 && var7 != 50) {
               if (var7 == 104) {
                  var8 = var9[(var11 << 2) + 1];
                  c[var10] = a(var8, c.a[2], n - 8 - 8);
                  ++var10;
               }
            } else {
               c[var10] = a(a(var0, var11), c.a[2], n - 6, 0);
               ++var10;
            }
         }
      }

      q = g(var0);
      if (!var1) {
         j = d(var0);
      }

      if (j < 0 || j * 4 + 2 >= a[var0].length || a[var0][j * 4 + 2] <= 99 || a[var0][j * 4 + 2] >= 200) {
         j = d(var0);
      }

   }

   public static final void j(int var0) {
      b = null;
      c = (String[][])null;
      p = 0;
   }

   public static final void a(Graphics var0) {
      if (c.y) {
         c.o(var0);
      } else if (c != -1) {
         if (c <= 17) {
            b(var0);
         }

         short[] var1 = a[c];
         int var2 = l;
         int var3 = 0;
         int var4 = 0;
         int var5 = 0;
         i = false;
         n = false;
         boolean var6 = false;
         g = false;
         o = -1;
         D = -1;

         for(int var7 = 0; var7 < p; ++var7) {
            String var8 = null;
            short var9;
            if ((var9 = var1[(var7 << 2) + 2]) >= 0) {
               if (b != null && b[var7] != null) {
                  var8 = b[var7];
               } else {
                  var8 = "null";
               }

               boolean var10 = false;
               var0.setClip(F, A, n, f);
               boolean var11;
               short var12;
               int var13;
               int var14;
               int var15;
               String[] var20;
               short var21;
               int var23;
               boolean var24;
               switch(var9) {
               case 1:
                  a(var0, var8);
               case 2:
               case 3:
               case 4:
                  break;
               case 5:
                  var21 = var1[(var7 << 2) + 3];
                  c.b((Graphics)var0, var21);
                  break;
               case 6:
                  var24 = ((var21 = var1[(var7 << 2) + 3]) & 2) == 2 || (var21 & 1) == 1;
                  boolean var25 = (var21 & 4) == 4 || (var21 & 1) == 1;
                  boolean var26 = (var21 & 8) == 8 || (var21 & 1) == 1;
                  if (var24) {
                     c.a(var0, var25, var26, true, c.ak);
                     if ((v & 1) != 0) {
                        var0.setClip(0, 0, c.aA, c.l);
                        var0.setColor(c.m[5]);
                        var15 = c.b[1518] + c.b[1386] - 1 + 7;
                        int var27 = c.aA - var15 - 1 - 7;
                        int var17 = c.a[2].getHeight() + 5 + 5;
                        int var18 = c.l - var17 - (c.b[1387] - var17 >> 1) - c.b[1607];
                        c.c(10, var15 + 4, var18 + 4, var27 - 8, var17 - 8, 156);
                        c.a((String)(a((int)406) + a((int)309)), 10, 2, var0);
                     }
                  }
                  break;
               case 50:
                  var20 = c[var3];
                  ++var3;
                  var23 = a(var0, var20, var2);
                  var2 += var23;
                  break;
               case 102:
               default:
                  var11 = var7 == j;
                  var24 = false;
                  if (var9 == 102) {
                     var23 = a((Graphics)null, var8, var2, var11, var4);
                  } else {
                     var23 = a((Graphics)null, var8, var2, var11);
                  }

                  g = true;
                  var13 = var2 + var23;
                  var14 = A + f;
                  if ((var13 <= A || var2 >= var14) && !var11) {
                     if (var9 == 102) {
                        ++var4;
                     }
                  } else {
                     if (var9 == 102) {
                        a(var0, var8, var2, var11, var4);
                        ++var4;
                     } else {
                        a(var0, var8, var2, var11);
                     }

                     if (var6 && var7 > j) {
                        i = true;
                        if (o < 0) {
                           o = var7;
                        }
                     }

                     g = true;
                     d = var7;
                  }

                  var2 += var23;
                  break;
               case 103:
               case 104:
                  var20 = c[var3];
                  ++var3;
                  byte var22 = (byte)(var1[(var7 << 2) + 3] & 255);
                  var13 = a((Graphics)null, var20, var2, -1, var22);
                  var14 = var2 + var13;
                  var15 = A + f;
                  if (var14 > A && var2 < var15) {
                     byte var16 = (byte)(var1[(var7 << 2) + 3] >> 8 & 255);
                     a(var0, var20, var2, var16, var22);
                     var6 = true;
                     if (g && d < j) {
                        n = true;
                        D = var7;
                     }
                  }

                  var2 += var13;
                  break;
               case 105:
                  var11 = var7 == j;
                  var12 = var1[(var7 << 2) + 3];
                  var13 = a(var0, var8, var11, var2, var12);
                  var2 += var13;
                  break;
               case 106:
               case 107:
                  var11 = var7 == j;
                  var12 = var1[(var7 << 2) + 3];
                  var2 += a(var0, var8, var2, var12, var5, var11);
                  ++var5;
                  break;
               case 108:
                  int var19 = a(var0, var2);
                  var2 += var19;
                  break;
               case 109:
                  var11 = var7 == j;
                  var12 = var1[(var7 << 2) + 3];
                  var2 += a(var0, var8, var12, var2, var11);
               }
            }
         }

         if (c == 19 || c == 21) {
            var0.setColor(c.m[5]);
            var0.drawLine(F, A, F + n - 1, A);
         }

         a(var0);
      }
   }

   public static final void l() {
      if (!a.empty()) {
         int var0 = (Integer)a.pop();
         int var1 = (Integer)a.pop();
         j = var0;
         g(var1);
         if (a[c][var0 * 4 + 2] > 99 && a[c][var0 * 4 + 2] < 200) {
            j = var0;
         }
      }

   }

   public static final void g(int var0) {
      short var1 = (short)var0;
      j(c);
      c = var1;
      a(var1);
   }

   public static final void p() {
      if (c(0)) {
         e = a((int)0);
         if (e.length != 7) {
            e = new byte[7];
            return;
         }
      } else {
         e[0] = 0;
         e[1] = 0;
         e[2] = 0;
         e[5] = 0;
         e[6] = 0;
         e[3] = 1;
         e[4] = 0;
         o();
      }

   }

   public static final void o() {
      a(0, e);
   }

   public static final void a(int var0, int var1) {
      if (var0 >= -1 && var0 < e.length && (var1 == 0 || var1 == 1)) {
         if (var0 == 1 && var1 == 1) {
            e[1] = 1;
            e[2] = 0;
            e[5] = 0;
         } else if (var0 == 2 && var1 == 1) {
            e[1] = 0;
            e[2] = 1;
            e[5] = 0;
         } else if (var0 == 0 && var1 == 1) {
            e[1] = 0;
            e[2] = 0;
            e[5] = 0;
         } else if (var0 == 5 && var1 == 1) {
            e[1] = 0;
            e[2] = 0;
            e[5] = 1;
         } else {
            e[var0] = (byte)var1;
         }
      }
   }

   public static final boolean b(int var0) {
      if (var0 >= -1 && var0 < e.length) {
         if (var0 == 0) {
            return e[1] == 0 && e[2] == 0 && e[5] == 0;
         } else {
            return e[var0] == 1;
         }
      } else {
         return false;
      }
   }

   public HG() {
      a = this;
      if (a == null) {
         a = new c(this);
         c.m = a();
         c.a = a();
         Display.getDisplay(this).setCurrent(a);
         c.a = new Thread(a);
         c.a.start();
         p();
         a.g(1);
      }

   }

   public final void destroyApp(boolean var1) {
      this.notifyDestroyed();
   }

   public final void pauseApp() {
      if (a != null) {
         c.G();
      }

   }

   public final void startApp() {
   }

   public final void commandAction(Command var1, Displayable var2) {
   }

   static {
      a = new boolean[d.length];
      b = new String[d.length][];
      a = 0;
      a = "";
      a = (String[][])null;
      c = "";
      b = (int[][])null;
      b = 100;
      a = 100;
      c = new String[]{".mid", ".amr", ".wav", ".mp3", ".ott", ".mmf", ".spf", ".wav"};
      a = new String[]{"audio/midi", "audio/amr", "audio/x-wav", "audio/mpeg", "", "audio/mmf", "", "audio/x-wav"};
      u = 0;
      a = false;
      k = false;
      h = false;
      o = false;
      p = false;
      b = false;
      j = false;
      m = false;
      w = 0;
      k = 0;
      f = false;
      x = -1;
      c = false;
      a = 0L;
      d = "";
      d = true;
      m = 0;
      a = new Vector();
      b = new Vector();
      b = -1;
      b = null;
      c = new int[7];
      l = 0;
      q = 0;
      F = 0;
      A = 0;
      n = 0;
      f = 0;
      a = 0;
      c = 0;
      G = 0;
      B = 0;
      h = 1;
      C = 0;
      v = 0;
      e = false;
      a = (short[][])null;
      l = true;
      c = -1;
      j = 0;
      a = new Stack();
      b = null;
      c = (String[][])null;
      p = 0;
      e = 0;
      E = -1;
      s = -1;
      z = -1;
      r = -1;
      y = -1;
      t = -1;
      i = false;
      n = false;
      g = false;
      d = 0;
      o = -1;
      D = -1;
      e = new byte[7];
      a = null;
      a = null;
   }
}
