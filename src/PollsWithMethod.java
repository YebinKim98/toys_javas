import Polls.PollsScanners;
import Polls.PoollInitailArrays;
import Polls.PoollStatistics;


public class PollsWithMethod {
    public static void main(String[] args) {
        try {
            PoollInitailArrays poollInitailArrays = new PoollInitailArrays();
        poollInitailArrays.arrays(); // arrays 호출
        PoollStatistics poollStatistics = new PoollStatistics();
        poollStatistics.statistics(); // statistics 호출
        PollsScanners pollsScanners = new PollsScanners();
        pollsScanners.scanners(); // scanners 호출
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
} 