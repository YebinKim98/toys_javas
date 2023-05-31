import Polls.PollsScanners;
import Polls.PoollStatistics;


public class PollsWithMethod {
    public static void main(String[] args) {
        PoollStatistics poollStatistics = new PoollStatistics();
        poollStatistics.statistics();
        PollsScanners pollsScanners = new PollsScanners();
        pollsScanners.scanners();
    }
}