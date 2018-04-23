public class BetterCat {
    // all values relate to a cat, in an object
    private String name;
    private int age;
    private boolean isGiantCat;

    // mutators
    public void setName(String newName) {
      this.name = newName;
    }
  
    // accessors
    public String getName() {
      return this.name;
    }
    
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
    
    public void growOlderFaster(int years) {
       this.age += years;
    } //growOlder()

} // Cat
