
package pkg1505042_state;


public class Main {

    public static void main(String[] args) {
        VM vm = new VM();
        VMSt VMstate;
        VMstate = new DPNoCSt();
        System.out.println(VMstate);
        VMstate = new DPNCSt();
        System.out.println(VMstate);
        VMstate = new DNPBSt();
        System.out.println(VMstate);
        VMstate = new DNPInvSt();
        System.out.println(VMstate);
    }

}

