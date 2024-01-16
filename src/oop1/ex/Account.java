package oop1.ex;

public class Account {
    int balance = 0;

    // 입금 메서드
    void deposit(int amount) {
        balance += amount;
        System.out.println("입금되었습니다. 현재 잔액 : " + balance);
    }

    // 출금 메서드
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금되었습니다. 현재 잔액 : " + balance);
        } else {
            System.out.println("잔액 부족");
            System.out.println("잔고 : " + balance);
        }
    }
}
