public class FlowofExecution { 
    
    public static void main(String[] args) {
    zippo("rattle", 13); //2
}
    public static void baffle(String blimp) {
    System.out.println(blimp);
    zippo("ping", -5); //3
}
    public static void zippo(String quince, int flag) {
    if (flag < 0) {
        System.out.println(quince + " zoop"); //4
    } else {
        System.out.println("ik"); //1
        baffle(quince);
        System.out.println("boo-wa-ha-ha"); //5
    } // quince is the parameter of blimp when baffle is invoked
}
} // output is: ik rattle ping zoop boo-wa-ha-ha