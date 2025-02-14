package lotto;

public class Researcher extends Job {
    public Researcher() {
        super("연구원");
    }

    @Override
    public void performAction(int matchCount) {
        if (matchCount == 6) {
            System.out.println("연구에 투자한다.");
        } else if (matchCount == 5) {
            System.out.println("지인에게 밥을 산다.");
        } else {
            System.out.println("꽝! 다음 기회에...");
        }
    }
}
