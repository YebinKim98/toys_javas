package Polls;
import java.util.Scanner;

public class PollsScanners {

    public int[] scanners() {
        int[] end = new int[4]; // 선택 번호 받을 배열 4개 생성
        PoollStatistics poollStatistics = new PoollStatistics();
        PoollInitailArrays poollInitailArrays = new PoollInitailArrays();
        poollInitailArrays.arrays();
        String[] str = poollStatistics.statistics();
        Scanner in = new Scanner(System.in);
        for (int first = 0; first < str.length; first++){ // 답 입력 부분
            System.out.println(str[first]);
            System.out.print("답 입력 : ");
            end[first] = in.nextInt();
        }
        System.out.println("------설문 종료------");
        System.out.println();
        System.out.println("------설문 결과------");
        for (int second = 0; second< str.length; second++) { // 총 입력 부분 한번에 출력
            System.out.print("고른 번호 : ");
            System.out.print(end[second] + " ");
        }
        in.close();
        return end;
    }
}
