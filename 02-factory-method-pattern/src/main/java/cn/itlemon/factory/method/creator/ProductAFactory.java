package cn.itlemon.factory.method.creator;

import cn.itlemon.factory.method.product.IProduct;
import cn.itlemon.factory.method.product.ProductA;

/**
 * @author jiangpingping <jiangpingping@kuaishou.com>
 * Created on 2021-01-30
 */
public class ProductAFactory implements IFactory {
    @Override
    public IProduct makeProduct() {
        return new ProductA();
    }
}
