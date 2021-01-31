package cn.itlemon.abstractfactory.client;

import cn.itlemon.abstractfactory.factory.FactoryA;
import cn.itlemon.abstractfactory.factory.FactoryB;
import cn.itlemon.abstractfactory.factory.IFactory;

/**
 * @author itlemon
 * Created on 2021-01-31
 */
public class AbstractFactoryClient {

    public static void main(String[] args) {
        IFactory factoryA = new FactoryA();
        factoryA.makeProductA().doA();
        factoryA.makeProductB().doB();
        IFactory factoryB = new FactoryB();
        factoryB.makeProductA().doA();
        factoryB.makeProductB().doB();
    }

}
