package programmers;

import java.util.*;

class MAAA {
    public static void main(String[] args) {
        new Q42586().solution(new int[]{93, 30, 55}, new int[]{1, 30, 5});
    }
}

public class Q42586 {
    int[] solution(int[] progresses, int[] speeds) {
        Queue queue = new LinkedList<Integer>();

        ArrayList<Integer> ansArr = new ArrayList<>();

        int index = 0;
        int day = 1;

        do {
            if (!queue.isEmpty()) {
                queue.clear();
            }

            for (int i = index; i < progresses.length; i++) {
                progresses[i] = progresses[i] + speeds[i];
                queue.add(progresses[i]);
            }

            int count = 0;

            for (int i = index; i < progresses.length; i++) {
                if (progresses[i] >= 100) {
                    queue.poll();
                    count++;
                    index++;
                } else {
                    break;
                }
            }

            if (count != 0) {
                ansArr.add(count);
            }
            day++;
        } while (!queue.isEmpty());

        int[] answer = new int[ansArr.size()];

        for (var i = 0; i < ansArr.size(); i++) {
            answer[i] = ansArr.get(i);
        }

        return answer;
    }
}
