package Polls;

public class PoollInitailArrays {
    public String[] arrays() {
        String[] polls = {
                "1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?",
                "(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우그렇다",
                "2. 강의의 내용은 체계적이고 성의있게 구성되었는가?",
                "(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우그렇다",
                "3. 교수는 강의 내용에 대해 전문적 지식이 있었는가?",
                "(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우그렇다",
                "4. 강의 진행 속도는 적절하였는가?",
                "(1)전혀 아니다 (2)아니다 (3)그렇다 (4)매우그렇다"
        }; // 질문,보기 배열
        return polls;
    }
    public int[] sum() {
        int[] all_sum = new int[4];
        return all_sum;
    }
}
