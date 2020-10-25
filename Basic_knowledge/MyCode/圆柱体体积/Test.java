package test_1;

public class Test {

	public static void main(String[] args) {
//		创建父类对象对子类无影响
//		CircleData c1=new CircleData();
//		c1.setRadius(3);		
		
		CylinderData cylinder=new CylinderData();
		

		cylinder.setLength(6);
		cylinder.setRadius(3);
		
		System.out.println("r="+cylinder.getRadius());
		System.out.println("h="+cylinder.getLength());
		
		System.out.println("底面积是:" + cylinder.findArea());		
		System.out.println("体积："+cylinder.findVolume());
		
	}

}

