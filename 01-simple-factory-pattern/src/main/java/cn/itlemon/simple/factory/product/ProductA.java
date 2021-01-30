package cn.itlemon.simple.factory.product;

/**
 * @author itlemon
 * Created on 2021-01-30
 */
public class ProductA implements IProduct{

    @Override
    public void doSomething() {
        System.out.println("I am product A.");
    }

}
