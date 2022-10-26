public class Bird extends Animal {
    double weight;


    public Bird(String name,String color,int feet,boolean hastale,boolean canfly,double weight) {
        super(name,color,feet,hastale,canfly);
        this.weight=weight;


    }
    public void agirlik(){
        System.out.println(weight);
    }
    public void fly(){
        System.out.println(this.getName());
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Eating nearly finished");
        System.out.println("Eating finished");
    }
}
