import sun.management.counter.AbstractCounter;

public class AbstractTest01 {
    public static void main(String[] args) {
        //多态
        Account a = new CreditAccount();
        a.doSome2();
    }
}
//银行账户类
abstract class Account{
    public void doSome1(){

    }
    public abstract void doSome2();

}
//子类继承抽象类，子类可以实例化对象
class CreditAccount extends Account{
    // 因为继承抽象类，所以抽象方法也会被继承过来，
    // 但是抽象方法一定要存在在抽象类中，
    // 所以如果不方法的覆盖/重写，就会报错
    public void doSome2(){
        System.out.println("多态");
    }
}

