package Mulitiplication;
public class Table {
    public int num;
    public int times;

    public Table(int num){

    this.num=num;
    }
    public void times(int times)
    {
        for(int i=1;i<=times;i++){
            int result=num*i;
            System.out.println(result);
        }

    }
}
