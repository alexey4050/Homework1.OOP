public class Bread extends Product {
    public Bread(String name, int price, double weight){
        super(name, price);
        this.setWeigth(weight);
    }
    private Double weigth;

    public Double getWeigth(){
        return weigth;
    }
    private void setWeigth(Double weigth){
        this.weigth = weigth;
    }
    public String toString() {
        return String.format("%s - %s", super.toString(),weigth);
    }

}
