package cn.itlemon.factory.method.product;

/**
 * @author itlemon
 * Created on 2021-01-30
 */
public class ProductB implements IProduct {
    @Override
    public void doSomething() {
        System.out.println("I am product B.");
    }
}
