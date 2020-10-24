package instance;

/**
 * 加锁的账户类
 */
public class Account_Lock {
    private double balance;
    private int no;

    public Account_Lock(double balance, int no) {
        this.balance = balance;
        this.no = no;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    public void withdraw(double money) {
        /**
         * 拿的锁是当前共享的对象的（this）
         * 当线程1抢到了锁，其他线程就要在线程池等待线程1的执行
         */
        synchronized (this) {
            double before = this.getBalance();
            double after = before - money;
            //模拟网络延迟
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
    public void doBalance (double money) {
        this.setBalance(this.getBalance()+money);
    }
}
