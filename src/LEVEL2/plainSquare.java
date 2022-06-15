package LEVEL2;

import java.math.BigInteger;

public class plainSquare {
    public long solution(int w, int h) {
    int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();
    return ((long) w * (long) h) - ((((long) w / gcd) + ((long) h / gcd) - 1) * gcd);
  }

  public static void main(String[] args) {
    plainSquare pl = new plainSquare();
    Integer w = 12;
    Integer h = 12;

    pl.solution(w, h);
  }
}
