package lotto;

public class Employee extends Job {
    public Employee() {
        super("회사원");
    }

    @Override
    public void performAction(int matchCount) {
        if (matchCount == 6) {
            System.out.println("직장을 그만둔다.");
        } else if (matchCount == 5) {
            System.out.println("전액을 저축한다.");
        } else {
            System.out.println("꽝! 다음 기회에...");
        }
    }
}
