class Solution {
    public int solution(String name) {
        int answer = 0;
        int length = name.length();
        int move = length - 1; // 기본적으로 끝까지 가는 거리

        for (int i = 0; i < length; i++) {
            // ▲ 1. 상하 이동 (알파벳 변경)
            char c = name.charAt(i);
            answer += Math.min(c - 'A', 'Z' - c + 1);

            // ▼ 2. 좌우 이동 (최적 거리 찾기)
            int next = i + 1;
            while (next < length && name.charAt(next) == 'A') {
                next++; // 연속된 'A' 찾기
            }

            // 되돌아가는 경우 고려
            move = Math.min(move, (i * 2) + (length - next));
            move = Math.min(move, (length - next) * 2 + i);
        }

        answer += move; // 최소 커서 이동 횟수 추가
        return answer;
    }
}
