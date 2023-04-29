package ProductDemo;

public class Product {
    private String name;
    private double price;
    private String description;
    private String [] service;

    public Product(){

    }

    public Product(String name, String description){
        setName(name);
        setDescription(description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getService() {
        return service;
    }

    public void setService(String[] service) {
        this.service = service;
    }
}
