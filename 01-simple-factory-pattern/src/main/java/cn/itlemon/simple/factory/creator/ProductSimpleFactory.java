package cn.itlemon.simple.factory.creator;

import cn.itlemon.simple.factory.product.IProduct;

/**
 * 产品的简单工厂
 *
 * @author itlemon
 * Created on 2021-01-30
 */
public class ProductSimpleFactory {

    private ProductSimpleFactory() {
    }

    public static IProduct makeProduct(Class<? extends IProduct> product) {
        try {
            if (product != null) {
                return product.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
