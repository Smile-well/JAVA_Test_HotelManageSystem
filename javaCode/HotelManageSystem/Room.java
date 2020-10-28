public class Room {
    private int no;
    //四种不同的房间类型
    private String type;
    //如果是true，表示可以入住
    private boolean status;

    //    含参数构造器
    public Room(int no, String type, boolean status) {
        this.no = no;
        this.type = type;
        this.status = status;
    }

    //  无参构造器
    public Room() {
    }


    //    getter and setter
    public int getNo() {
        return no;

    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getType() {
        return type;

    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean getStatus() {
        return status;

    }

    public void setStatus(boolean status) {
        this.status = status;

    }

//      重写toString方法，方便查询时输出信息
//      三目运算符判断status
    @Override
    public String toString() {
        return "[" + no + "," + type + "," + (status ? "可入住" : "不可入住") + "]";
    }
}
