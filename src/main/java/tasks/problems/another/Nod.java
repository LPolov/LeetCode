package tasks.problems.another;

public class Nod {

   public int nod(int a, int b) {
      if (b % a == 0) {
         return a;
      }
      if (a > b) {
         return nod(a % b, b);
      } else return nod(b % a, a);
   }
}
