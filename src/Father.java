/**
 * @author 贲阳林
 */

    public  class Father{
        public void doSomething(){
            System.out.println("Father's doing something");
            this.doSomething();
        }



    public static void main(String[] args) {
        Father x =new Son();
        x.doSomething();
    }
}
class Son extends Father {
    @Override
    public void doSomething(){
        System.out.println("Son's doing something");
        super.doSomething();
    }
}
