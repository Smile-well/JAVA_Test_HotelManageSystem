import java.util.Scanner;

public class HotelManageSystem {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        System.out.println("欢迎使用酒店管理系统！");
        System.out.println("请输入对应的功能编号：");
        System.out.println("[1]查看房间[2]订房[3]退房[0]退出系统");

        while (true) {
            System.out.println("请输入功能编号：");
            Scanner s = new Scanner(System.in);
            int i = s.nextInt();

            if (i == 1) {
                //查看房间列表
                hotel.print();

                System.out.println("请输入对应的功能编号：");
                System.out.println("[1]查看房间[2]订房[3]退房[0]退出系统");
            } else if (i == 2) {
                //订房
                System.out.println("请输入房间编号：");
                int roomNo = s.nextInt();
                hotel.order(roomNo);
                System.out.println("请输入对应的功能编号：");
                System.out.println("[1]查看房间[2]订房[3]退房[0]退出系统");
            } else if (i == 3) {
                //退房
                System.out.println("请输入房间编号：");
                int roomNo = s.nextInt();
                hotel.exit(roomNo);

                System.out.println("请输入对应的功能编号：");
                System.out.println("[1]查看房间[2]订房[3]退房[0]退出系统");
            } else if (i == 0) {
                System.out.println("成功退出！");
                return;
            } else {
                System.out.println("编号错误，请重新输入：");
            }
        }
    }
}
