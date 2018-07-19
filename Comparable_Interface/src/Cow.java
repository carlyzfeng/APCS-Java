// Must implement Comparable<Cow>.  The compareTo() method alone is not enough
// as Arrays.sort() in main() must be able to identify this object as something
// that has Comparable properties.
public class Cow implements Comparable<Cow> {
    private int weight;
    private String name;
  
    public Cow() {
        this(1800, "Anonymous Cow");
    }
  
    public Cow(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() { return weight; }
    public String getName() { return name; }
  
    public int compareTo(Cow otherCow) {
        // Has the positive/negative/zero consistency required of the compareTo method
        return (weight - otherCow.getWeight());
    }
   
    public String toString() {
        return (name);
    }
}
