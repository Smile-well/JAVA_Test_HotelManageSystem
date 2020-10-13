public class MyStack {
    private Object elements[];
    private int index;

    public MyStack() {
        this.elements=new Object[10];
        this.index=-1;
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void Push(Object obj){
        if(this.index>=elements.length-1){
            System.out.println("当前栈满了，不能Push了");
            return;
        }else{
//            index++;
//            elements[index]=this.elements;
            elements[++index]=obj;
            System.out.println("压栈成功,压栈元素是"+elements[index]+'\n'+"当前栈帧为"+index);
        }

    }
    public void Pop(){
        if (this.index<0){
            System.out.println("栈空,没有元素可以Pop了");
            return;
        }else {
            System.out.println("元素"+elements[index]+"成功弹出");
            elements[index]=null;
            index--;
            System.out.println("当前栈帧为"+index);
        }

    }
}
