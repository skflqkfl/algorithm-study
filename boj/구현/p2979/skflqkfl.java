package boj.구현.p2979;

import java.util.*;

public class skflqkfl {

    private static final int MIN_TIME = 1;
    private static final int MAX_TIME = 100;
    private static int COUNT = 3;
    private static boolean log = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] price = new int[COUNT];
        int[] cnt = new int[MAX_TIME];
        int priceSum = 0;

        for(int i=0; i<COUNT; i++) {
            price[i] = scanner.nextInt();
        }

        for(int i=0; i<COUNT; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for(int j=a; j<b; j++) {
                cnt[j]++;
            }
        }

        for(int i=0; i<MAX_TIME; i++) {
            if(cnt[i] > 0) {
                priceSum += cnt[i] * price[cnt[i]-1];
            }
        }

        System.out.println(priceSum);
    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        List<Integer> priceList = new ArrayList<>();
//        List<Map<String, Object>> carList = new ArrayList<>();
//        priceList.add(0);
//        for (int i = 0; i < COUNT; i++) {
//            priceList.add(scanner.nextInt());
//        }
//
//        for (int i = 0; i < COUNT; i++) {
//            Map<String, Object> map = new HashMap<>();
//            map.put("startTime", scanner.nextInt());
//            map.put("endTime", scanner.nextInt());
//            carList.add(map);
//        }
//
//        int minStartTime = minStartTime(carList);
//        int maxEndTime = maxEndTime(carList);
//        int priceSum = 0;
//        int carCount = 0;
//
//        for (int i = minStartTime; i < maxEndTime; i++) {
//            carCount = 0;
//            for (Map<String, Object> map : carList) {
//                if (isThare(i, map)) carCount++;
//            }
//            priceSum += priceList.get(carCount) * carCount;
//            if(log) System.out.println("price : " + priceList.get(carCount) + " * carCount : " + carCount + " = priceSum : " + priceSum);
//        }
//
//        System.out.println(priceSum);
//    }
//
//    private static int maxEndTime(List<Map<String, Object>> list) {
//        int maxTime = MIN_TIME;
//        for (Map<String, Object> map : list) {
//            int time = (int) map.get("endTime");
//            if(maxTime < time) maxTime = time;
//        }
//        return maxTime;
//    }
//
//    private static int minStartTime(List<Map<String, Object>> list) {
//        int minTime = MAX_TIME;
//        for (Map<String, Object> map : list) {
//            int time = (int) map.get("startTime");
//            if(minTime > time) minTime = time;
//        }
//        return minTime;
//    }
//
//    private static boolean isThare(int time, Map<String, Object> map) {
//        return (time >= (int) map.get("startTime") && time < (int) map.get("endTime"));
//    }
}
