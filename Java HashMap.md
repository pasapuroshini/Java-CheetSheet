# HashMap
 Key value pairs.
 Access items by index number.
 The HashMap class has many useful methods. For example, to add items to it, use the put() method:
 ```
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");
    System.out.println(capitalCities);
  }
}
```
output:
```
{USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
```
Access an item:
```
capitalCities.get("England");
```
Remove an Item
```
capitalCities.remove("England");
  ```

To remove all items, use the clear() method:


```
capitalCities.clear();
```
To find out how many items there are, use the size() 

 ```
capitalCities.size();
```
```
// Print keys
for (String i : capitalCities.keySet()) {
  System.out.println(i);
}
```

```
// Print values
for (String i : capitalCities.values()) {
  System.out.println(i);
}
```
```
for (String i : capitalCities.keySet()) {
  System.out.println("key: " + i + " value: " + capitalCities.get(i));
}
```
