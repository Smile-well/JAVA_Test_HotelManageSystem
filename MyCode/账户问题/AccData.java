package demo;

public class AccData {
	private String id;
	private double banlance;
	private double rate;

	public AccData() {
	}

	public AccData(String id,double banlance,double rate) {
		this.id=id;
		this.banlance=banlance;
		this.rate=rate;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getBanlance() {
		return banlance;
	}

	public void setBanlance(double banlance) {
		this.banlance = banlance;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void dep(double money) {
		this.setBanlance(getBanlance()+money);
		System.out.println("存钱成功,存入"+money+"元");
	}
	
	public void withdraw(double money) {
		if(money>this.getBanlance()) {
			System.out.println("余额不足");
			return;
		}
		else {
			setBanlance(getBanlance()-money);
			System.out.println("取钱成功,取钱"+money+"元");
		}
	}
}















	
	
	
	