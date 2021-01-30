package cn.itlemon.factory.method.client;

import cn.itlemon.factory.method.creator.ProductAFactory;
import cn.itlemon.factory.method.creator.ProductBFactory;
import cn.itlemon.factory.method.creator.ProductCFactory;

/**
 * @author jiangpingping <jiangpingping@kuaishou.com>
 * Created on 2021-01-30
 */
public class FactoryMethodClient {

    public static void main(String[] args) {
        new ProductAFactory().makeProduct().doSomething();
        new ProductBFactory().makeProduct().doSomething();
        new ProductCFactory().makeProduct().doSomething();
    }

}
