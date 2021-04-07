// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: LexicoCapas.flex

/*Seccion codigo de usuario*/
package Analyzers;
import java_cup.runtime.*;
import Objects.*;
import java.io.Reader;
import java.util.ArrayList;

// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
public class LexicoCapas implements java_cup.runtime.Scanner {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\1\u0100\1\u0200\1\u0300\1\u0400\1\u0500\1\u0600\1\u0700"+
    "\1\u0800\1\u0900\1\u0a00\1\u0b00\1\u0c00\1\u0d00\1\u0e00\1\u0f00"+
    "\1\u1000\1\u0100\1\u1100\1\u1200\1\u1300\1\u0100\1\u1400\1\u1500"+
    "\1\u1600\1\u1700\1\u1800\1\u1900\1\u1a00\1\u1b00\1\u0100\1\u1c00"+
    "\1\u1d00\1\u1e00\12\u1f00\1\u2000\1\u2100\1\u2200\1\u1f00\1\u2300"+
    "\1\u2400\2\u1f00\31\u0100\1\u2500\121\u0100\1\u2600\4\u0100\1\u2700"+
    "\1\u0100\1\u2800\1\u2900\1\u2a00\1\u2b00\1\u2c00\1\u2d00\53\u0100"+
    "\1\u2e00\41\u1f00\1\u0100\1\u2f00\1\u3000\1\u0100\1\u3100\1\u3200"+
    "\1\u3300\1\u3400\1\u3500\1\u3600\1\u3700\1\u3800\1\u3900\1\u0100"+
    "\1\u3a00\1\u3b00\1\u3c00\1\u3d00\1\u3e00\1\u3f00\1\u4000\1\u4100"+
    "\1\u4200\1\u4300\1\u4400\1\u4500\1\u4600\1\u4700\1\u4800\1\u4900"+
    "\1\u4a00\1\u4b00\1\u4c00\1\u4d00\1\u1f00\1\u4e00\1\u4f00\1\u5000"+
    "\1\u5100\3\u0100\1\u5200\1\u5300\1\u5400\12\u1f00\4\u0100\1\u5500"+
    "\17\u1f00\2\u0100\1\u5600\41\u1f00\2\u0100\1\u5700\1\u5800\2\u1f00"+
    "\1\u5900\1\u5a00\27\u0100\1\u5b00\4\u0100\1\u5c00\1\u5d00\42\u1f00"+
    "\1\u0100\1\u5e00\1\u5f00\11\u1f00\1\u6000\24\u1f00\1\u6100\1\u6200"+
    "\1\u1f00\1\u6300\1\u6400\1\u6500\1\u6600\2\u1f00\1\u6700\5\u1f00"+
    "\1\u6800\1\u6900\1\u6a00\5\u1f00\1\u6b00\1\u6c00\2\u1f00\1\u6d00"+
    "\1\u1f00\1\u6e00\14\u1f00\1\u6f00\4\u1f00\246\u0100\1\u7000\20\u0100"+
    "\1\u7100\1\u7200\25\u0100\1\u7300\34\u0100\1\u7400\14\u1f00\2\u0100"+
    "\1\u7500\5\u1f00\23\u0100\1\u7600\u0aec\u1f00\1\u7700\1\u7800\u02fe\u1f00";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\16\0\4\3"+
    "\1\1\2\3\1\5\1\0\7\3\1\6\3\3\12\7"+
    "\1\3\1\10\5\3\6\11\24\0\4\3\1\0\1\3"+
    "\32\0\1\12\1\13\1\14\1\3\41\0\2\3\4\0"+
    "\4\3\1\0\2\3\1\0\7\3\1\0\4\3\1\0"+
    "\5\3\27\0\1\3\37\0\1\3\u01ca\0\4\3\14\0"+
    "\16\3\5\0\7\3\1\0\1\3\1\0\21\3\165\0"+
    "\1\3\2\0\2\3\4\0\1\3\1\0\6\3\1\0"+
    "\1\3\3\0\1\3\1\0\1\3\24\0\1\3\123\0"+
    "\1\3\213\0\1\3\5\0\2\3\246\0\1\3\46\0"+
    "\2\3\1\0\6\3\51\0\6\3\1\0\1\3\55\0"+
    "\1\3\1\0\1\3\2\0\1\3\2\0\1\3\1\0"+
    "\10\3\33\0\4\3\4\0\15\3\6\0\5\3\1\0"+
    "\4\3\13\0\1\3\1\0\3\3\112\0\4\3\146\0"+
    "\1\3\11\0\1\3\12\0\1\3\23\0\2\3\1\0"+
    "\17\3\74\0\2\3\145\0\16\3\66\0\4\3\1\0"+
    "\2\3\61\0\22\3\34\0\4\3\13\0\65\3\25\0"+
    "\1\3\22\0\13\3\221\0\2\3\12\0\1\3\23\0"+
    "\1\3\10\0\2\3\2\0\2\3\26\0\1\3\7\0"+
    "\1\3\1\0\3\3\4\0\2\3\11\0\2\3\2\0"+
    "\2\3\4\0\10\3\1\0\4\3\2\0\1\3\5\0"+
    "\2\3\16\0\7\3\2\0\1\3\1\0\2\3\3\0"+
    "\1\3\6\0\4\3\2\0\2\3\26\0\1\3\7\0"+
    "\1\3\2\0\1\3\2\0\1\3\2\0\2\3\1\0"+
    "\1\3\5\0\4\3\2\0\2\3\3\0\3\3\1\0"+
    "\7\3\4\0\1\3\1\0\7\3\20\0\13\3\3\0"+
    "\1\3\11\0\1\3\3\0\1\3\26\0\1\3\7\0"+
    "\1\3\2\0\1\3\5\0\2\3\12\0\1\3\3\0"+
    "\1\3\3\0\2\3\1\0\17\3\4\0\2\3\12\0"+
    "\1\3\1\0\7\3\7\0\1\3\3\0\1\3\10\0"+
    "\2\3\2\0\2\3\26\0\1\3\7\0\1\3\2\0"+
    "\1\3\5\0\2\3\11\0\2\3\2\0\2\3\3\0"+
    "\7\3\3\0\4\3\2\0\1\3\5\0\2\3\12\0"+
    "\1\3\1\0\20\3\2\0\1\3\6\0\3\3\3\0"+
    "\1\3\4\0\3\3\2\0\1\3\1\0\1\3\2\0"+
    "\3\3\2\0\3\3\3\0\3\3\14\0\4\3\5\0"+
    "\3\3\3\0\1\3\4\0\2\3\1\0\6\3\1\0"+
    "\16\3\12\0\11\3\1\0\6\3\15\0\1\3\3\0"+
    "\1\3\27\0\1\3\20\0\3\3\10\0\1\3\3\0"+
    "\1\3\4\0\7\3\2\0\1\3\3\0\5\3\4\0"+
    "\2\3\12\0\20\3\4\0\1\3\10\0\1\3\3\0"+
    "\1\3\27\0\1\3\12\0\1\3\5\0\2\3\11\0"+
    "\1\3\3\0\1\3\4\0\7\3\2\0\7\3\1\0"+
    "\1\3\4\0\2\3\12\0\1\3\2\0\15\3\15\0"+
    "\1\3\3\0\1\3\63\0\1\3\3\0\1\3\5\0"+
    "\5\3\4\0\7\3\5\0\2\3\12\0\12\3\6\0"+
    "\1\3\3\0\1\3\22\0\3\3\30\0\1\3\11\0"+
    "\1\3\1\0\2\3\7\0\3\3\1\0\4\3\6\0"+
    "\1\3\1\0\1\3\10\0\6\3\12\0\2\3\2\0"+
    "\15\3\72\0\4\3\20\0\1\3\12\0\47\3\2\0"+
    "\1\3\1\0\1\3\5\0\1\3\30\0\1\3\1\0"+
    "\1\3\27\0\2\3\5\0\1\3\1\0\1\3\6\0"+
    "\2\3\12\0\2\3\4\0\40\3\1\0\27\3\2\0"+
    "\6\3\12\0\13\3\1\0\1\3\1\0\1\3\1\0"+
    "\4\3\12\0\1\3\44\0\4\3\24\0\1\3\22\0"+
    "\1\3\44\0\11\3\1\0\71\3\112\0\6\3\116\0"+
    "\2\3\46\0\1\3\1\0\5\3\1\0\2\3\53\0"+
    "\1\3\115\0\1\3\4\0\2\3\7\0\1\3\1\0"+
    "\1\3\4\0\2\3\51\0\1\3\4\0\2\3\41\0"+
    "\1\3\4\0\2\3\7\0\1\3\1\0\1\3\4\0"+
    "\2\3\17\0\1\3\71\0\1\3\4\0\2\3\103\0"+
    "\2\3\3\0\40\3\20\0\20\3\126\0\2\3\6\0"+
    "\3\3\u016c\0\2\3\21\0\1\3\32\0\5\3\113\0"+
    "\3\3\13\0\7\3\15\0\1\3\7\0\13\3\25\0"+
    "\13\3\24\0\14\3\15\0\1\3\3\0\1\3\2\0"+
    "\14\3\124\0\3\3\1\0\3\3\3\0\2\3\12\0"+
    "\41\3\4\0\1\3\12\0\6\3\131\0\7\3\53\0"+
    "\5\3\106\0\12\3\37\0\1\3\14\0\4\3\14\0"+
    "\12\3\50\0\2\3\5\0\13\3\54\0\4\3\32\0"+
    "\6\3\12\0\46\3\34\0\4\3\77\0\1\3\35\0"+
    "\2\3\13\0\6\3\12\0\15\3\1\0\10\3\16\0"+
    "\1\3\2\0\77\3\114\0\4\3\12\0\21\3\11\0"+
    "\14\3\164\0\14\3\70\0\10\3\12\0\3\3\61\0"+
    "\2\3\11\0\7\3\53\0\2\3\3\0\20\3\3\0"+
    "\1\3\47\0\5\3\372\0\1\3\33\0\2\3\6\0"+
    "\2\3\46\0\2\3\6\0\2\3\10\0\1\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\3\37\0\2\3\65\0"+
    "\1\3\7\0\1\3\1\0\3\3\3\0\1\3\7\0"+
    "\3\3\4\0\2\3\6\0\4\3\15\0\5\3\3\0"+
    "\1\3\7\0\16\3\5\0\32\3\5\0\20\3\2\0"+
    "\23\3\1\0\13\3\5\0\1\3\12\0\1\3\1\0"+
    "\15\3\1\0\20\3\15\0\3\3\40\0\20\3\15\0"+
    "\4\3\1\0\3\3\14\0\21\3\1\0\4\3\1\0"+
    "\2\3\12\0\1\3\1\0\3\3\5\0\6\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\3\4\0\1\3\13\0"+
    "\2\3\4\0\5\3\5\0\4\3\1\0\21\3\51\0"+
    "\u0177\3\57\0\1\3\57\0\1\3\205\0\6\3\11\0"+
    "\14\3\46\0\1\3\1\0\5\3\1\0\2\3\70\0"+
    "\7\3\1\0\17\3\30\0\11\3\7\0\1\3\7\0"+
    "\1\3\7\0\1\3\7\0\1\3\7\0\1\3\7\0"+
    "\1\3\7\0\1\3\7\0\1\3\40\0\57\3\1\0"+
    "\325\3\3\0\31\3\17\0\1\3\5\0\2\3\5\0"+
    "\4\3\126\0\2\3\2\0\2\3\3\0\1\3\132\0"+
    "\1\3\4\0\5\3\53\0\1\3\136\0\21\3\40\0"+
    "\60\3\320\0\100\3\375\0\3\3\215\0\103\3\56\0"+
    "\2\3\15\0\3\3\34\0\24\3\60\0\4\3\12\0"+
    "\1\3\163\0\45\3\11\0\2\3\147\0\2\3\65\0"+
    "\2\3\11\0\52\3\63\0\4\3\1\0\13\3\1\0"+
    "\7\3\64\0\14\3\106\0\12\3\12\0\6\3\30\0"+
    "\3\3\1\0\1\3\61\0\2\3\44\0\14\3\35\0"+
    "\3\3\101\0\16\3\13\0\6\3\37\0\1\3\67\0"+
    "\11\3\16\0\2\3\12\0\6\3\27\0\3\3\111\0"+
    "\30\3\3\0\2\3\20\0\2\3\5\0\12\3\6\0"+
    "\2\3\6\0\2\3\6\0\11\3\7\0\1\3\7\0"+
    "\1\3\53\0\1\3\16\0\6\3\173\0\1\3\2\0"+
    "\2\3\12\0\6\3\244\0\14\3\27\0\4\3\61\0"+
    "\4\3\156\0\2\3\152\0\46\3\7\0\14\3\5\0"+
    "\5\3\14\0\1\3\15\0\1\3\5\0\1\3\1\0"+
    "\1\3\2\0\1\3\2\0\1\3\154\0\41\3\153\0"+
    "\22\3\100\0\2\3\66\0\50\3\15\0\3\3\20\0"+
    "\20\3\20\0\3\3\2\0\30\3\3\0\31\3\1\0"+
    "\6\3\5\0\1\3\207\0\2\3\1\0\4\3\1\0"+
    "\13\3\12\0\7\3\32\0\4\3\1\0\1\3\32\0"+
    "\13\3\131\0\3\3\6\0\2\3\6\0\2\3\6\0"+
    "\2\3\3\0\3\3\2\0\3\3\2\0\22\3\3\0"+
    "\4\3\14\0\1\3\32\0\1\3\23\0\1\3\2\0"+
    "\1\3\17\0\2\3\16\0\42\3\173\0\105\3\65\0"+
    "\210\3\1\0\202\3\35\0\3\3\61\0\17\3\1\0"+
    "\37\3\40\0\15\3\36\0\5\3\53\0\5\3\36\0"+
    "\2\3\44\0\4\3\10\0\1\3\5\0\52\3\236\0"+
    "\2\3\12\0\6\3\44\0\4\3\44\0\4\3\50\0"+
    "\10\3\64\0\234\3\67\0\11\3\26\0\12\3\10\0"+
    "\230\3\6\0\2\3\1\0\1\3\54\0\1\3\2\0"+
    "\3\3\1\0\2\3\27\0\12\3\27\0\11\3\37\0"+
    "\101\3\23\0\1\3\2\0\12\3\26\0\12\3\32\0"+
    "\106\3\70\0\6\3\2\0\100\3\4\0\1\3\2\0"+
    "\5\3\10\0\1\3\3\0\1\3\35\0\2\3\3\0"+
    "\4\3\1\0\40\3\35\0\3\3\35\0\43\3\10\0"+
    "\1\3\36\0\31\3\66\0\12\3\26\0\12\3\23\0"+
    "\15\3\22\0\156\3\111\0\67\3\63\0\15\3\63\0"+
    "\15\3\50\0\10\3\12\0\u0146\3\52\0\1\3\2\0"+
    "\3\3\2\0\116\3\35\0\12\3\1\0\10\3\41\0"+
    "\137\3\25\0\33\3\27\0\11\3\107\0\37\3\12\0"+
    "\17\3\74\0\2\3\1\0\17\3\1\0\2\3\31\0"+
    "\7\3\12\0\6\3\65\0\1\3\12\0\4\3\4\0"+
    "\10\3\44\0\2\3\1\0\11\3\105\0\4\3\4\0"+
    "\1\3\15\0\1\3\1\0\43\3\22\0\1\3\45\0"+
    "\6\3\1\0\101\3\7\0\1\3\1\0\1\3\4\0"+
    "\1\3\17\0\1\3\12\0\7\3\73\0\5\3\12\0"+
    "\6\3\4\0\1\3\10\0\2\3\2\0\2\3\26\0"+
    "\1\3\7\0\1\3\2\0\1\3\5\0\1\3\12\0"+
    "\2\3\2\0\2\3\3\0\2\3\1\0\6\3\1\0"+
    "\5\3\7\0\2\3\7\0\3\3\5\0\213\3\113\0"+
    "\5\3\12\0\4\3\4\0\36\3\106\0\1\3\1\0"+
    "\10\3\12\0\246\3\66\0\2\3\11\0\27\3\6\0"+
    "\42\3\101\0\3\3\1\0\13\3\12\0\46\3\71\0"+
    "\7\3\12\0\66\3\33\0\2\3\17\0\4\3\12\0"+
    "\306\3\73\0\145\3\112\0\25\3\10\0\2\3\1\0"+
    "\2\3\10\0\1\3\2\0\1\3\36\0\1\3\2\0"+
    "\2\3\11\0\14\3\12\0\106\3\10\0\2\3\56\0"+
    "\2\3\10\0\1\3\2\0\33\3\77\0\10\3\1\0"+
    "\10\3\112\0\3\3\1\0\42\3\71\0\7\3\11\0"+
    "\1\3\55\0\1\3\11\0\17\3\12\0\30\3\36\0"+
    "\2\3\26\0\1\3\16\0\111\3\7\0\1\3\2\0"+
    "\1\3\54\0\3\3\1\0\1\3\2\0\1\3\11\0"+
    "\10\3\12\0\6\3\6\0\1\3\2\0\1\3\45\0"+
    "\1\3\2\0\1\3\6\0\7\3\12\0\u0136\3\27\0"+
    "\271\3\1\0\54\3\4\0\37\3\232\0\146\3\157\0"+
    "\21\3\304\0\274\3\57\0\1\3\11\0\307\3\107\0"+
    "\271\3\71\0\7\3\37\0\1\3\12\0\146\3\36\0"+
    "\2\3\5\0\13\3\67\0\11\3\4\0\14\3\12\0"+
    "\11\3\25\0\5\3\23\0\260\3\100\0\200\3\113\0"+
    "\4\3\71\0\7\3\21\0\100\3\2\0\1\3\2\0"+
    "\13\3\2\0\16\3\370\0\10\3\326\0\52\3\11\0"+
    "\367\3\37\0\61\3\3\0\21\3\4\0\10\3\u018c\0"+
    "\4\3\153\0\5\3\15\0\3\3\11\0\7\3\12\0"+
    "\3\3\2\0\1\3\4\0\301\3\5\0\3\3\26\0"+
    "\2\3\7\0\36\3\4\0\224\3\3\0\273\3\125\0"+
    "\1\3\107\0\1\3\2\0\2\3\1\0\2\3\2\0"+
    "\2\3\4\0\1\3\14\0\1\3\1\0\1\3\7\0"+
    "\1\3\101\0\1\3\4\0\2\3\10\0\1\3\7\0"+
    "\1\3\34\0\1\3\4\0\1\3\5\0\1\3\1\0"+
    "\3\3\7\0\1\3\u0154\0\2\3\31\0\1\3\31\0"+
    "\1\3\37\0\1\3\31\0\1\3\37\0\1\3\31\0"+
    "\1\3\37\0\1\3\31\0\1\3\37\0\1\3\31\0"+
    "\1\3\10\0\2\3\151\0\4\3\62\0\10\3\1\0"+
    "\16\3\1\0\26\3\5\0\1\3\17\0\120\3\7\0"+
    "\1\3\21\0\2\3\7\0\1\3\2\0\1\3\5\0"+
    "\325\3\55\0\3\3\16\0\2\3\12\0\4\3\1\0"+
    "\u0171\3\72\0\5\3\306\0\13\3\7\0\51\3\114\0"+
    "\4\3\12\0\u0156\3\1\0\117\3\4\0\1\3\33\0"+
    "\1\3\2\0\1\3\1\0\2\3\1\0\1\3\12\0"+
    "\1\3\4\0\1\3\1\0\1\3\1\0\6\3\1\0"+
    "\4\3\1\0\1\3\1\0\1\3\1\0\1\3\3\0"+
    "\1\3\2\0\1\3\1\0\2\3\1\0\1\3\1\0"+
    "\1\3\1\0\1\3\1\0\1\3\1\0\1\3\2\0"+
    "\1\3\1\0\2\3\4\0\1\3\7\0\1\3\4\0"+
    "\1\3\4\0\1\3\1\0\1\3\12\0\1\3\21\0"+
    "\5\3\3\0\1\3\5\0\1\3\21\0\u0134\3\12\0"+
    "\6\3\336\0\42\3\65\0\13\3\336\0\2\3\u0182\0"+
    "\16\3\u0131\0\37\3\36\0\342\3\113\0\266\3\1\0"+
    "\36\3\140\0\200\3\360\0\20\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[30976];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\3\1\4\1\5"+
    "\1\6\1\7\1\10\1\11\5\0\1\12";

  private static int [] zzUnpackAction() {
    int [] result = new int[18];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\15\0\32\0\32\0\32\0\47\0\64\0\32"+
    "\0\101\0\32\0\32\0\32\0\116\0\133\0\150\0\165"+
    "\0\202\0\32";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[18];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11"+
    "\1\12\1\2\1\13\1\5\1\14\1\2\6\0\1\2"+
    "\1\0\1\2\22\0\1\4\21\0\1\15\1\0\1\15"+
    "\1\0\1\15\1\0\1\2\6\0\1\11\1\0\1\2"+
    "\12\0\1\16\1\0\1\16\1\0\1\16\10\0\1\17"+
    "\1\0\1\17\1\0\1\17\10\0\1\20\1\0\1\20"+
    "\1\0\1\20\10\0\1\21\1\0\1\21\1\0\1\21"+
    "\10\0\1\22\1\0\1\22\1\0\1\22\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[143];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\1\3\11\2\1\1\11\1\1\3\11\5\0"+
    "\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[18];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
      private Symbol symbol(int type, String lexema) {
        return new Symbol(type, new Token(lexema, yyline + 1, yycolumn + 1));
      }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public LexicoCapas(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
  yyclose();    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  @Override  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return symbol(sym.ID,yytext());
            }
            // fall through
          case 11: break;
          case 2:
            { /*Ignora el espacio*/
            }
            // fall through
          case 12: break;
          case 3:
            { /*Ignora el separador*/
            }
            // fall through
          case 13: break;
          case 4:
            { return symbol(sym.error,yytext());
            }
            // fall through
          case 14: break;
          case 5:
            { return symbol(sym.COMA,yytext());
            }
            // fall through
          case 15: break;
          case 6:
            { return symbol(sym.ENTERO,yytext()); System.out.println("Funciono");
            }
            // fall through
          case 16: break;
          case 7:
            { return symbol(sym.PUNTOCOMA,yytext());
            }
            // fall through
          case 17: break;
          case 8:
            { return symbol(sym.LLAVEA,yytext());
            }
            // fall through
          case 18: break;
          case 9:
            { return symbol(sym.LLAVEB,yytext());
            }
            // fall through
          case 19: break;
          case 10:
            { return symbol(sym.HEXADECIMAL,yytext());
            }
            // fall through
          case 20: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
