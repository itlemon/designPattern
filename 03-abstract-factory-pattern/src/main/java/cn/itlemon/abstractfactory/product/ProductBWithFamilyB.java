package cn.itlemon.abstractfactory.product;

/**
 * @author itlemon
 * Created on 2021-01-31
 */
public class ProductBWithFamilyB extends ProductFamilyB implements IProductB {
    @Override
    public void doB() {
        System.out.println("The ProductB be part of FamilyB.");
    }
}
