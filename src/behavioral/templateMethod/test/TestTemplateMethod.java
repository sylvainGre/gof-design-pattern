package behavioral.templateMethod.test;

import behavioral.templateMethod.model.GlassHouse;
import behavioral.templateMethod.model.HouseTemplate;
import behavioral.templateMethod.model.WoodenHouse;

public class TestTemplateMethod {
    public static void main(String[] args){

        HouseTemplate woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();
        System.out.println("==================================");
        HouseTemplate glassHouse = new GlassHouse();
        glassHouse.buildHouse();
    }
}
