public class Animal {
    private String name;
    private String color;
    private int feet;
    private boolean hastale;
    private boolean canfly;

    public Animal(String name,String color,int feet,boolean hastale,boolean canfly){
        this.name=name;
        this.color=color;
        this.feet=feet;
        this.hastale=hastale;
        this.canfly=canfly;
        //eğer public yerine public void yazarsan hata alırsın

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public boolean isHastale() {
        return hastale;
    }

    public void setHastale(boolean hastale) {
        this.hastale = hastale;
    }

    public boolean isCanfly() {
        return canfly;
    }

    public void setCanfly(boolean canfly) {
        this.canfly = canfly;
    }

    public void eat(String food){
        System.out.println("eating "+food);
    }
}
