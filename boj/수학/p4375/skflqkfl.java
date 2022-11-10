package boj.수학.p4375;
import java.math.BigInteger;
import java.util.*;

public class skflqkfl {

    static boolean isPrintLog = false;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.forEachRemaining(N -> {
            int length = getTarget(N).toString().length();
            System.out.println(length);
        });

    }

    private static BigInteger getTarget(String strN) {

        int N = Integer.parseInt(strN);
        BigInteger fuckingEleven = BigInteger.ZERO;

        while (true) {

            fuckingEleven = fuckingEleven.multiply(BigInteger.TEN).add(BigInteger.ONE);

            /**/if (isPrintLog) System.out.println("N = " + N + ", fuckingEleven = " + fuckingEleven);

            if (isTargetValue(N, fuckingEleven)) break;

        }

        return fuckingEleven;
    }

    private static boolean isTargetValue(int N, BigInteger fuckingEleven) {
        return fuckingEleven.mod(BigInteger.valueOf(N)).equals(BigInteger.valueOf(0));
    }
}
