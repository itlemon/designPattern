package cn.itlemon.abstractfactory.factory;

import cn.itlemon.abstractfactory.product.IProductA;
import cn.itlemon.abstractfactory.product.IProductB;
import cn.itlemon.abstractfactory.product.ProductAWithFamilyA;
import cn.itlemon.abstractfactory.product.ProductBWithFamilyA;

/**
 * 工厂A，可生产产品族A的产品A和产品B
 *
 * @author itlemon
 * Created on 2021-01-31
 */
public class FactoryA implements IFactory {
    @Override
    public IProductA makeProductA() {
        return new ProductAWithFamilyA();
    }

    @Override
    public IProductB makeProductB() {
        return new ProductBWithFamilyA();
    }
}
