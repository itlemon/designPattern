package cn.itlemon.abstractfactory.product;

/**
 * 产品族A的产品A
 *
 * @author itlemon
 * Created on 2021-01-31
 */
public class ProductAWithFamilyA extends ProductFamilyA implements IProductA {
    @Override
    public void doA() {
        System.out.println("The productA be part of FamilyA.");
    }
}
