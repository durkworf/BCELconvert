public class BcelConvert {
    public static void main(String[] args) throws Exception{
        String bcel = "$$BCEL$$$xxxxxxxxxxxxxxxxxxxxxxxxxx;
        String classpath="/x/x/x/x/x.class";
        BcelUtil.decode(bcel,classpath);


        String classpath="/x/x/x/x/x.class";
        String db = BcelUtil.encode(classpath);
        System.out.println(db);
    }
}
