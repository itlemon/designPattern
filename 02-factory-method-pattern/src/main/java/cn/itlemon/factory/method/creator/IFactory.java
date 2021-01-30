package cn.itlemon.factory.method.creator;

import cn.itlemon.factory.method.product.IProduct;

/**
 * @author jiangpingping <jiangpingping@kuaishou.com>
 * Created on 2021-01-30
 */
public interface IFactory {

    IProduct makeProduct();

}
