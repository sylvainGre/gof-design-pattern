package behavioral.templateMethod.model;

public abstract class HouseTemplate {
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built");
    }

    public abstract void buildWalls();

    private void buildWindows() {
        System.out.println("Building Glass window");
    }
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }

}
