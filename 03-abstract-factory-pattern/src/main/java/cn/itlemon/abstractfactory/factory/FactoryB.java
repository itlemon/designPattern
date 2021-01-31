package cn.itlemon.abstractfactory.factory;

import cn.itlemon.abstractfactory.product.IProductA;
import cn.itlemon.abstractfactory.product.IProductB;
import cn.itlemon.abstractfactory.product.ProductAWithFamilyB;
import cn.itlemon.abstractfactory.product.ProductBWithFamilyB;

/**
 * 工厂A，可生产产品族A的产品A和产品B
 *
 * @author itlemon
 * Created on 2021-01-31
 */
public class FactoryB implements IFactory {

    @Override
    public IProductA makeProductA() {
        return new ProductAWithFamilyB();
    }

    @Override
    public IProductB makeProductB() {
        return new ProductBWithFamilyB();
    }
}
