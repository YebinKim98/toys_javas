package Polls;

public class PoollStatistics {
        public String[] statistics(){ // end_arrays 에 질문, 번호 선택 함수
        String[] end_arrays = new String[4];
        PoollInitailArrays poollInitailArrays = new PoollInitailArrays();
        String[] arrays = poollInitailArrays.arrays();
        for (int first = 0; first < arrays.length; first = first + 2){
            if (first == 0){
                end_arrays[first] = arrays[first] +"\n" + arrays[first+1];
            }
            else {
                end_arrays[first/2] = arrays[first] + "\n" + arrays[first+1];
            }
        }
        
        return end_arrays;
    }
}