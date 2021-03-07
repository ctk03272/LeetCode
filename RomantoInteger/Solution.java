class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char now = s.charAt(i);
            char next;
            if (now == 'I') {
                if (i + 1 < length) {
                    next = s.charAt(i + 1);
                    if (next == 'V') {
                        answer += 4;
                        i++;
                    } else if (next == 'X') {
                        answer += 9;
                        i++;
                    } else {
                        answer += 1;
                    }
                } else {
                    answer += 1;
                }
            } else if (now == 'V') {
                answer += 5;
            } else if (now == 'X') {
                if (i + 1 < length) {
                    next = s.charAt(i + 1);
                    if (next == 'L') {
                        answer += 40;
                        i++;
                    } else if (next == 'C') {
                        answer += 90;
                        i++;
                    } else {
                        answer += 10;
                    }
                } else {
                    answer += 10;
