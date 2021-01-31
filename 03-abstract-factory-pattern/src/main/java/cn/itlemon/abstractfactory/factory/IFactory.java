package cn.itlemon.abstractfactory.factory;

import cn.itlemon.abstractfactory.product.IProductA;
import cn.itlemon.abstractfactory.product.IProductB;

/**
 * 抽象工厂
 *
 * @author itlemon
 * Created on 2021-01-31
 */
public interface IFactory {

    /**
     * 生产产品A
     *
     * @return 产品A
     */
    IProductA makeProductA();

    /**
     * 生产产品B
     *
     * @return 产品B
     */
    IProductB makeProductB();

}
