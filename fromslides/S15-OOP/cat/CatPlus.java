public class Cat {
    // all values relate to a cat, in an object
    public String name;
    public int age;
    public boolean isGiantCat;
    
    public void simpleMeow() {
      System.out.println("Meoooooooow");
      } // simpleMeow()
    
    public void meow() {
      if (this.isGiantCat) {
        System.out.println("Roooooooaaaaarrrr!");
        } else {
        System.out.println("Meoooooooow");
        }
      } // meow()
      
    public void growOlder() {
      this.age++;
    } //growOlder()
    
    public void growOlderFast(int years) {
       this.age += years;
    } //growOlder()

} // Cat
