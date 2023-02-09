public class Iphone extends Apple{
    private String brand;
    private int memory;

    public Iphone(String name ,String brand , int memory) {
        super(name);
        this.brand = brand;
        this.memory = memory;
    }

    public String getBrand (){
        return brand;
    }
    public int getMemory(){
        return memory;
    }

    @Override
    public String toString() {
        return "Iphone{" + "brand='" + brand + '\'' + ", memory=" + memory + '}';
    }
}
