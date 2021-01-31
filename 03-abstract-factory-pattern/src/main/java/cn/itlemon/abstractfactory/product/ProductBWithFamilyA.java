package cn.itlemon.abstractfactory.product;

/**
 * 产品族A的产品B
 * @author itlemon
 * Created on 2021-01-31
 */
public class ProductBWithFamilyA extends ProductFamilyA implements IProductB {
    @Override
    public void doB() {
        System.out.println("The ProductB be part of FamilyA.");
    }
}
