package optional;

public class Goods {
    private String id;
    private String name;
    private int price;

    public Goods(String id,String name,int price) {
        this.id=id;
        this.name=name;
        this.price=price;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
