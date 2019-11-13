public class Adam {

    public static void main(String[] args) {

        LengthOfString len = new LengthOfString();
        System.out.println(len.run("abcd"));
        System.out.println(len.run("GAITSDSECONDYEAR"));

        FirstUpper fu = new FirstUpper();
        System.out.println(fu.run("gaITSD"));
        System.out.println(fu.run("greatuncleBulgaria"));
        System.out.println(fu.run("testIng"));
    }
}
