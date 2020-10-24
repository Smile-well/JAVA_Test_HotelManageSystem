package instance;

/**
 * 未加锁的账户类：用来模拟多线程取钱钱不会少的情况
 */
public class Account_Unlock {
    private double balance;
    private int no;

    public Account_Unlock(double balance, int no) {
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
    public void doBalance (double money) {
        this.setBalance(this.getBalance()+money);
    }

}
