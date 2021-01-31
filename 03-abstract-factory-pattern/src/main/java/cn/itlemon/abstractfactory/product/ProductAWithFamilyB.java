package cn.itlemon.abstractfactory.product;

/**
 * @author itlemon
 * Created on 2021-01-31
 */
public class ProductAWithFamilyB extends ProductFamilyB implements IProductA {
    @Override
    public void doA() {
        System.out.println("The ProductA be part of FamilyB.");
    }
}
