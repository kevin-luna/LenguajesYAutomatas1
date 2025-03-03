/* PascalParserTokenManager.java */
/* Generated By:JavaCC: Do not edit this line. PascalParserTokenManager.java */
package parser;
import java.util.ArrayList;
import parser.ast.*;

/** Token Manager. */
@SuppressWarnings ("unused")
public class PascalParserTokenManager implements PascalParserConstants {

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1){
   switch (pos)
   {
      case 0:
         if ((active0 & 0x8000000000000L) != 0L)
            return 8;
         if ((active0 & 0x800000000000000L) != 0L)
            return 3;
         if ((active0 & 0x7ffffffff00L) != 0L)
         {
            jjmatchedKind = 43;
            return 33;
         }
         return -1;
      case 1:
         if ((active0 & 0x1068c000L) != 0L)
            return 33;
         if ((active0 & 0x7ffef973f00L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 1;
            }
            return 33;
         }
         return -1;
      case 2:
         if ((active0 & 0x7be0fc73500L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 2;
            return 33;
         }
         if ((active0 & 0x41e0100a00L) != 0L)
            return 33;
         return -1;
      case 3:
         if ((active0 & 0x61402030000L) != 0L)
            return 33;
         if ((active0 & 0x1aa0dc43500L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 3;
            }
            return 33;
         }
         return -1;
      case 4:
         if ((active0 & 0x18005043100L) != 0L)
            return 33;
         if ((active0 & 0x42a08c00400L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 43;
               jjmatchedPos = 4;
            }
            return 33;
         }
         return -1;
      case 5:
         if ((active0 & 0x8a08000400L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 5;
            return 33;
         }
         if ((active0 & 0x42000c00000L) != 0L)
            return 33;
         return -1;
      case 6:
         if ((active0 & 0x8a00000400L) != 0L)
            return 33;
         if ((active0 & 0x8000000L) != 0L)
         {
            jjmatchedKind = 43;
            jjmatchedPos = 6;
            return 33;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1){
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0(){
   switch(curChar)
   {
      case 40:
         return jjStartNfaWithStates_0(0, 59, 3);
      case 41:
         return jjStopAtPos(0, 60);
      case 42:
         return jjStopAtPos(0, 50);
      case 43:
         return jjStopAtPos(0, 48);
      case 44:
         return jjStopAtPos(0, 65);
      case 45:
         return jjStopAtPos(0, 49);
      case 46:
         jjmatchedKind = 66;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8L);
      case 47:
         return jjStartNfaWithStates_0(0, 51, 8);
      case 58:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0x0L);
      case 59:
         return jjStopAtPos(0, 63);
      case 60:
         jjmatchedKind = 55;
         return jjMoveStringLiteralDfa1_0(0x240000000000000L, 0x0L);
      case 61:
         return jjStopAtPos(0, 53);
      case 62:
         jjmatchedKind = 56;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L, 0x0L);
      case 91:
         return jjStopAtPos(0, 61);
      case 93:
         return jjStopAtPos(0, 62);
      case 65:
      case 97:
         return jjMoveStringLiteralDfa1_0(0x20002000L, 0x0L);
      case 66:
      case 98:
         return jjMoveStringLiteralDfa1_0(0x804000100L, 0x0L);
      case 67:
      case 99:
         return jjMoveStringLiteralDfa1_0(0x100a001000L, 0x0L);
      case 68:
      case 100:
         return jjMoveStringLiteralDfa1_0(0x100480000L, 0x0L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20200L, 0x0L);
      case 70:
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100000L, 0x0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa1_0(0x200008000L, 0x0L);
      case 77:
      case 109:
         return jjMoveStringLiteralDfa1_0(0x80000000L, 0x0L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4040000000L, 0x0L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa1_0(0x10004000L, 0x0L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa1_0(0x400L, 0x0L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa1_0(0x60400800000L, 0x0L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2000000000L, 0x0L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa1_0(0x210000L, 0x0L);
      case 85:
      case 117:
         return jjMoveStringLiteralDfa1_0(0x1000000L, 0x0L);
      case 86:
      case 118:
         return jjMoveStringLiteralDfa1_0(0x800L, 0x0L);
      case 87:
      case 119:
         return jjMoveStringLiteralDfa1_0(0x18000040000L, 0x0L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1){
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 46:
         if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(1, 67);
         break;
      case 61:
         if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         break;
      case 62:
         if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         break;
      case 65:
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000800L, active1, 0L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x60400800100L, active1, 0L);
      case 70:
      case 102:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 33);
         else if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(1, 15, 33);
         break;
      case 72:
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000050000L, active1, 0L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x4100000000L, active1, 0L);
      case 76:
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L, active1, 0L);
      case 78:
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x221000200L, active1, 0L);
      case 79:
      case 111:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 1;
         }
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(1, 21, 33);
         return jjMoveStringLiteralDfa2_0(active0, 0x8c8501000L, active1, 0L);
      case 82:
      case 114:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 33);
         return jjMoveStringLiteralDfa2_0(active0, 0x18004002400L, active1, 0L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000000L, active1, 0L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1){
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x61400000000L);
      case 68:
      case 100:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(2, 9, 33);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 33);
         else if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(2, 31, 33);
         break;
      case 69:
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x4010000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x18000040000L);
      case 76:
      case 108:
         if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 38, 33);
         break;
      case 78:
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x8001000L);
      case 79:
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000400L);
      case 80:
      case 112:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 82:
      case 114:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(2, 11, 33);
         else if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(2, 20, 33);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000002000L);
      case 83:
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x2020000L);
      case 84:
      case 116:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(2, 30, 33);
         return jjMoveStringLiteralDfa3_0(active0, 0x201000000L);
      case 86:
      case 118:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 33);
         break;
      case 87:
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x4002000L);
      case 68:
      case 100:
         if ((active0 & 0x20000000000L) != 0L)
         {
            jjmatchedKind = 41;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x40000000000L);
      case 69:
      case 101:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 33);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 33);
         return jjMoveStringLiteralDfa4_0(active0, 0x200800000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2001000100L);
      case 76:
      case 108:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 33);
         return jjMoveStringLiteralDfa4_0(active0, 0x800040000L);
      case 78:
      case 110:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 33);
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 82:
      case 114:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 36, 33);
         break;
      case 83:
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 84:
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x18008000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 69:
      case 101:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 33);
         else if ((active0 & 0x10000000000L) != 0L)
         {
            jjmatchedKind = 40;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x8800000000L);
      case 71:
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000000L);
      case 73:
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      case 75:
      case 107:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(4, 26, 33);
         break;
      case 76:
      case 108:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 33);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000000L);
      case 78:
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(4, 8, 33);
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      case 82:
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 84:
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 33);
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 89:
      case 121:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 65:
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000400L);
      case 69:
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 71:
      case 103:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 33);
         break;
      case 76:
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 78:
      case 110:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 42, 33);
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 79:
      case 111:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 33);
         break;
      case 84:
      case 116:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 77:
      case 109:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(6, 10, 33);
         break;
      case 78:
      case 110:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 33);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 39, 33);
         break;
      case 82:
      case 114:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(6, 33, 33);
         break;
      case 85:
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0){
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 69:
      case 101:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(7, 27, 33);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 33;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 44)
                        kind = 44;
                     { jjCheckNAddStates(0, 3); }
                  }
                  else if (curChar == 39)
                     { jjCheckNAddStates(4, 6); }
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 8;
                  else if (curChar == 40)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 33:
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  { jjCheckNAdd(15); }
                  break;
               case 1:
                  { jjAddStates(7, 8); }
                  break;
               case 3:
                  if (curChar == 42)
                     { jjCheckNAddTwoStates(4, 6); }
                  break;
               case 4:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(4, 6); }
                  break;
               case 5:
                  if (curChar == 41 && kind > 6)
                     kind = 6;
                  break;
               case 6:
                  if (curChar == 42)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if (curChar == 40)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 8:
                  if (curChar == 47)
                     { jjCheckNAddStates(9, 11); }
                  break;
               case 9:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     { jjCheckNAddStates(9, 11); }
                  break;
               case 10:
                  if ((0x2400L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 11:
                  if (curChar == 10 && kind > 7)
                     kind = 7;
                  break;
               case 12:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAddStates(0, 3); }
                  break;
               case 17:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 44)
                     kind = 44;
                  { jjCheckNAdd(17); }
                  break;
               case 18:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddStates(12, 14); }
                  break;
               case 20:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(21); }
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(21); }
                  break;
               case 22:
                  if (curChar == 46)
                     { jjCheckNAddTwoStates(23, 24); }
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(23); }
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     { jjCheckNAddTwoStates(24, 25); }
                  break;
               case 26:
                  if ((0x280000000000L & l) != 0L)
                     { jjCheckNAdd(27); }
                  break;
               case 27:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 45)
                     kind = 45;
                  { jjCheckNAdd(27); }
                  break;
               case 28:
                  if (curChar == 39)
                     { jjCheckNAddStates(4, 6); }
                  break;
               case 29:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     { jjCheckNAddTwoStates(29, 30); }
                  break;
               case 30:
                  if (curChar == 39 && kind > 46)
                     kind = 46;
                  break;
               case 31:
                  jjstateSet[jjnewStateCnt++] = 32;
                  break;
               case 32:
                  if (curChar == 39 && kind > 47)
                     kind = 47;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     { jjCheckNAddTwoStates(14, 15); }
                  }
                  else if (curChar == 123)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 33:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     { jjCheckNAdd(15); }
                  }
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 43)
                        kind = 43;
                     { jjCheckNAddTwoStates(14, 15); }
                  }
                  break;
               case 1:
                  if ((0xdfffffffffffffffL & l) != 0L)
                     { jjCheckNAddTwoStates(1, 2); }
                  break;
               case 2:
                  if (curChar == 125 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  { jjAddStates(15, 16); }
                  break;
               case 9:
                  { jjAddStates(9, 11); }
                  break;
               case 14:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  { jjCheckNAddTwoStates(14, 15); }
                  break;
               case 15:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 43)
                     kind = 43;
                  { jjCheckNAdd(15); }
                  break;
               case 19:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 25:
                  if ((0x2000000020L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 29:
                  { jjAddStates(17, 18); }
                  break;
               case 31:
                  jjstateSet[jjnewStateCnt++] = 32;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(7, 8); }
                  break;
               case 4:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(15, 16); }
                  break;
               case 9:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(9, 11); }
                  break;
               case 29:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     { jjAddStates(17, 18); }
                  break;
               case 31:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 32;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 33 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, null, null, null, null, null, "\53", "\55", "\52", "\57", "\72\75", 
"\75", "\74\76", "\74", "\76", "\74\75", "\76\75", "\50", "\51", "\133", "\135", 
"\73", "\72", "\54", "\56", "\56\56", };
protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}
static final int[] jjnextStates = {
   17, 18, 19, 22, 29, 30, 31, 1, 2, 9, 10, 12, 18, 19, 22, 4, 
   6, 29, 30, 
};

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(Exception e)
   {
      jjmatchedKind = 0;
      jjmatchedPos = -1;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void MoreLexicalActions()
{
   jjimageLen += (lengthOfMatch = jjmatchedPos + 1);
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

    /** Constructor. */
    public PascalParserTokenManager(SimpleCharStream stream){

      if (SimpleCharStream.staticFlag)
            throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");

    input_stream = stream;
  }

  /** Constructor. */
  public PascalParserTokenManager (SimpleCharStream stream, int lexState){
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Reinitialise parser. */
  
  public void ReInit(SimpleCharStream stream)
  {


    jjmatchedPos =
    jjnewStateCnt =
    0;
    curLexState = defaultLexState;
    input_stream = stream;
    ReInitRounds();
  }

  private void ReInitRounds()
  {
    int i;
    jjround = 0x80000001;
    for (i = 33; i-- > 0;)
      jjrounds[i] = 0x80000000;
  }

  /** Reinitialise parser. */
  public void ReInit(SimpleCharStream stream, int lexState)
  
  {
    ReInit(stream);
    SwitchTo(lexState);
  }

  /** Switch to specified lex state. */
  public void SwitchTo(int lexState)
  {
    if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
    else
      curLexState = lexState;
  }


/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};

/** Lex State array. */
public static final int[] jjnewLexState = {
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
   -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
};
static final long[] jjtoToken = {
   0xffffffffffffff01L, 0xfL, 
};
static final long[] jjtoSkip = {
   0xfeL, 0x0L, 
};
static final long[] jjtoSpecial = {
   0x0L, 0x0L, 
};
static final long[] jjtoMore = {
   0x0L, 0x0L, 
};
    protected SimpleCharStream  input_stream;

    private final int[] jjrounds = new int[33];
    private final int[] jjstateSet = new int[2 * 33];
    private final StringBuilder jjimage = new StringBuilder();
    private StringBuilder image = jjimage;
    private int jjimageLen;
    private int lengthOfMatch;
    protected int curChar;
}
