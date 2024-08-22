package Genericsday8.com;

public class Generics <T,V>{

    private T data;
    private V data1;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public V getData1() {
        return data1;
    }

    public void setData1(V data1) {
        this.data1 = data1;
    }

    public <T,V> void shout(T thingstoshout, V data1){
        System.out.println(thingstoshout + "!!!!");
        System.out.println(data1+ "!!!!");
    }
}
