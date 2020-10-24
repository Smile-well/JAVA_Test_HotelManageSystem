package instance;

import static java.lang.Thread.currentThread;

public class AccountThread_Lock implements Runnable {
    private Account_Lock account;

    public AccountThread_Lock(Account_Lock account) {
        this.account = account;
    }

    @Override
    public void run() {
        double money = 5000;
        account.withdraw(money);
        System.out.println("加锁的"+currentThread().getName()+"对账户"+account.getNo()+"取款"+money+",余额"+account.getBalance());
    }
}
