package cn.itlemon.simple.factory.client;

import cn.itlemon.simple.factory.creator.ProductSimpleFactory;
import cn.itlemon.simple.factory.product.IProduct;
import cn.itlemon.simple.factory.product.ProductA;

/**
 * @author itlemon
 * Created on 2021-01-30
 */
public class SimpleFactoryClient {

    public static void main(String[] args) {
        IProduct product = ProductSimpleFactory.makeProduct(ProductA.class);
        if (product != null) {
            product.doSomething();
        }
    }
}
