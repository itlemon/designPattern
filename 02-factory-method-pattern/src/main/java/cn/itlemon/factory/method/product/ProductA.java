package cn.itlemon.factory.method.product;

/**
 * @author jiangpingping <jiangpingping@kuaishou.com>
 * Created on 2021-01-30
 */
public class ProductA implements IProduct {
    @Override
    public void doSomething() {
        System.out.println("I am product A.");
    }
}