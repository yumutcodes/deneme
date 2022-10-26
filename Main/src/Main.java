public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bird calikusu=new Bird("calikusu","red",4,true,true,78.3);
        System.out.println(calikusu.getName()+calikusu.getColor()+calikusu.getFeet()+calikusu.isCanfly()+calikusu.isHastale());
        calikusu.eat("salata");
        System.out.println(calikusu.weight);
        calikusu.agirlik();
        calikusu.fly();
        calikusu.setName("calmakusu");
        calikusu.fly();
        System.out.println(calikusu.getName());
        System.out.println("\n");


        Sheep Shaun=new Sheep("Shaun","White",4,false,false,23.42);
        Shaun.fly();
        Shaun.agirlik();
        System.out.println(Shaun.getColor());
    }
}