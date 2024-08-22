package day3.com;

public class Tv {
    String model;
    String os;
    String size;
    int mfgYear;
    String specs;
    String color;
    int changeChannelNo;

    public  Tv(){

    }
    public void displayAllVariables() {
        System.out.println(model);
        System.out.println(os);
        System.out.println(size);
        System.out.println(mfgYear);
        System.out.println(specs);
        System.out.println(color);
    }

    // This method below is known as concrete methods that don't need a return.
    public void watching() {
        System.out.println("iam watching tv");
    }

    public void streaming() {
        System.out.println("I am streaming Netflic");
    }
// to add methods or subtract methods. Also in  this method in order to get a return of something you take the word void out and */
    // put them in the parenthis which is known as parameterized methods.

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int c, int d, int e) {
        return c - d - e;
    }

    public void changeChannelNo(int newchannel){
        changeChannelNo=newchannel;
    }

//    change the color of the tv

    public void changecolor(String newcolor){
        color=newcolor;

    }

    public Tv(String model, String size1){
        model= model;
    }
}








