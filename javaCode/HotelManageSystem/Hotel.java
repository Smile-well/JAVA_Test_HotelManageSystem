public class Hotel {
//    对象数组
    private Room[][] rooms;

//    利用无参构造器  建房子!!!!
//    房子可分为多层，每层有多个房间（二维数组）
    public Hotel() {

//        错误写法 空指针异常
//        Room rooms=new Room[4][10];

//         对象数组 动态初始化
        this.rooms=new Room[4][10];
        for (int i = 0; i < rooms.length; i++) {
            for(int j=0;j<rooms[i].length;j++){
//                将房间对象放入数组中，利用无参构造器初始化参数，并按照层数来区分房型
                if(i==0){
                    rooms[i][j]=new Room((i+1)*100+j+1,"单人间",true);
                }else if(i==1){
                    rooms[i][j]=new Room((i+1)*100+j+1,"双人间",true);
                }else if(i==2){
                    rooms[i][j]=new Room((i+1)*100+j+1,"钟点房",true);
                }else if(i==3){
                    rooms[i][j]=new Room((i+1)*100+j+1,"总统套房",true);
                }
            }
        }
    }


    public Room[][] getRooms() {
        return rooms;
    }

    public void setRooms(Room[][] rooms) {
        this.rooms = rooms;
    }

//    查询所有房间信息（其实就是输出二维数组）
    public void print(){
//          打印所有的房间信息
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]+" ");
                while((j+1)%5==0) {
                    System.out.println();
                    break;
                }
            }
            System.out.println();
        }
    }
//    入住（利用输入的房间号来修改房间状态）
    public void order(int roomNo){
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(false);
        System.out.println("订房成功！");
    }

//    退房（利用输入的房间号来修改房间状态）
    public void exit(int roomNo){
        Room room=rooms[roomNo/100-1][roomNo%100-1];
        room.setStatus(true);
        System.out.println("退房成功！欢迎下次光临！");
    }
}
