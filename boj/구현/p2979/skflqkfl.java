package boj.구현.p2979;

import java.util.*;

public class skflqkfl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Map<String, Object>> inputList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            inputList.add(Map.of("price", scanner.nextInt()));
        }

//        for(int i=0; i<2; i++) {
//            inputList.get(i).put("startTime", scanner.nextInt());
//            inputList.get(i).put("endTime", scanner.nextInt());
//        }

        inputList.get(0).get("price");
//        inputList.get(0).put("startTime", 1);

        inputList.forEach(m -> System.out.println(m.toString()));
    }
}
