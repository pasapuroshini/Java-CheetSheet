# HashSet
A HashSet is a collection of items where every item is unique, and it is found in the java.util package:
```
import java.util.HashSet; // Import the HashSet class

HashSet<String> cars = new HashSet<String>();
```
Add Items
```
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
```
Check If an Item Exists
```
cars.contains("Mazda");
```
Remove an Item
```
cars.remove("Volvo");
```

To remove all items, use the clear() method:
```
cars.clear();
```

```
cars.size();
```















