package day3.com;

public class day3 {
    public static void  main (String[]args) {

        Tv tcl = new Tv();
        tcl.model = "LCD";
        tcl.os = "webOS";
        tcl.size = "54inch";
        tcl.mfgYear = 2000;
        tcl.specs = "8k res";
        tcl.color = "red";

        tcl.displayAllVariables();
        tcl.watching();
        tcl.streaming();
        System.out.println(tcl.subtract(7,5,4));

//        tcl.changeChannel(46);
        tcl.changecolor("red");
        tcl.changeChannelNo(35);
        System.out.println(tcl.changeChannelNo);

//        Tv olg = new Tv (model: "LED", size1:"70inch"){
//        Tv olg2 = new Tv();
    }

}
