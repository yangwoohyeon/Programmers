import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int extent = brown + yellow; // 전체 타일 개수

        for (int height = 1; height <= Math.sqrt(extent); height++) {
            if (extent % height == 0) { // 세로 길이가 약수인 경우
                int width = extent / height; // 가로 길이 계산

                // 조건 확인
                if ((width - 1) * 2 + (height - 1) * 2 == brown) {
                    return new int[]{width, height}; // 조건을 만족하면 반환
                }
            }
        }

        return new int[0]; // 조건을 만족하는 경우가 없으면 빈 배열 반환
    }
}