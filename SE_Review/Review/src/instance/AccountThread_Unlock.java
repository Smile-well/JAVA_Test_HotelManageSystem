package instance;

import static java.lang.Thread.currentThread;

public class AccountThread_Unlock implements Runnable {
    private Account_Unlock account;

    public AccountThread_Unlock(Account_Unlock account) {
        this.account = account;
    }

    @Override
    public void run() {
        double money = 5000;
        account.withdraw(money);
        System.out.println("未加锁的"+currentThread().getName()+"对账户"+account.getNo()+"取款"+money+",余额"+account.getBalance());
    }
}