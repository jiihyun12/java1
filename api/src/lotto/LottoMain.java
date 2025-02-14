package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LottoMain {
    private String[] winningNumbers;
    private List<Job> participants = new ArrayList<>();

    public LottoMain() {
        winningNumbers = drawNumber(); // 당첨 번호 생성
    }

    // 랜덤 숫자 6개 추출 (이 메서드는 변경하지 않음)
    public String[] drawNumber() { 
        String[] randomNums = new String[6];

        for (int i = 0; i < 6; i++) {
            randomNums[i] = String.valueOf((int) Math.floor((Math.random() * 45 + 1)));
            for (int j = 0; j < i; j++) {
                if (randomNums[j].equals(randomNums[i])) {
                    i--;
                    break;
                }
            }
        }
        return randomNums;
    }

    // 참가자 등록
    public void addParticipant(Job participant) {
        participants.add(participant);
    }

    public void playLotto() {
        System.out.println("당첨 번호: " + Arrays.toString(winningNumbers));

        for (Job participant : participants) {
            if (!checkLotto(participant)) {
                continue;
            }

            String[] participantNumbers = drawNumber();
            int matchCount = countMatches(winningNumbers, participantNumbers);

            System.out.println(participant.getJob() + " 번호: " + Arrays.toString(participantNumbers));
            System.out.println(participant.getJob() + " 맞춘 개수: " + matchCount);

            participant.performAction(matchCount);
            
        }
    }

    public boolean checkLotto(Job participant) {
        if (!(participant instanceof Employee) && !(participant instanceof Researcher)) {
            System.out.println(participant.getJob() + "은(는) 로또를 구매할 수 없습니다.");
            return false;
        }
        return true;
    }

    public static int countMatches(String[] winningNumbers, String[] participantNumbers) {
        int count = 0;
        for (String num : participantNumbers) {
            for (String win : winningNumbers) {
                if (num.equals(win)) {
                    count++;
                }
            }
        }
        return count;
    }
}
