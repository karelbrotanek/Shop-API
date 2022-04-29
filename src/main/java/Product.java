public class Product {
    private int id;
    private String type;
    private String sku;
    private String name;
    private String shortDescription;

    public Product(int id, String type, String sku, String name, String shortDescription) {
        this.id = id;
        this.type = type;
        this.sku = sku;
        this.name = name;
        this.shortDescription = shortDescription;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
