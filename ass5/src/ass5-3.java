class Furniture {
    private String name;
    private String style;
    private String material;
    private float price;

    public Furniture(String name, String style, String material, float price) {
        this.name = name;
        this.style = style;
        this.material = material;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getMaterial() {
        return material;
    }

    public float getPrice() {
        return price;
    }
}
abstract class FurnitureFactory {
    public abstract Furniture createChair();
    public abstract Furniture createTable();
    public abstract Furniture createSofa();
}
class ModernWoodFactory extends FurnitureFactory {
    public Furniture createChair() {
        return new Furniture("Modern Chair", "Modern", "Wood", 120.0f);
    }
    public Furniture createTable() {
        return new Furniture("Modern Table", "Modern", "Wood", 220.0f);
    }
    public Furniture createSofa() {
        return new Furniture("Modern Sofa", "Modern", "Wood", 320.0f);
    }
}

class TraditionalMetalFactory extends FurnitureFactory {
    public Furniture createChair() {
        return new Furniture("Traditional Chair", "Traditional", "Metal", 130.0f);
    }
    public Furniture createTable() {
        return new Furniture("Traditional Table", "Traditional", "Metal", 230.0f);
    }
    public Furniture createSofa() {
        return new Furniture("Traditional Sofa", "Traditional", "Metal", 330.0f);
    }
}

class IndustrialGlassFactory extends FurnitureFactory {
    public Furniture createChair() {
        return new Furniture("Industrial Chair", "Industrial", "Glass", 140.0f);
    }
    public Furniture createTable() {
        return new Furniture("Industrial Table", "Industrial", "Glass", 240.0f);
    }
    public Furniture createSofa() {
        return new Furniture("Industrial Sofa", "Industrial", "Glass", 340.0f);
    }
}
class FurnitureCreator {
    private FurnitureFactory factory;

    public void setFactory(FurnitureFactory factory) {
        this.factory = factory;
    }

    public Furniture createChair() {
        return factory.createChair();
    }

    public Furniture createTable() {
        return factory.createTable();
    }

    public Furniture createSofa() {
        return factory.createSofa();
    }
}


