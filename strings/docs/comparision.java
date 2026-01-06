// In this doc we will try to under the stings very carefully and in depth with proper understanding ...

package strings.docs;

public class comparision {

    public static void main(String[] args) {
        

        //------------------- COMPARISION----------------------------------------------------



        // string pool ----> this is basically a seperate mem. structure in heap mem. which stores the same values/objects ... for e.g.,
        
        String a = " sujal";
        // a ---> reference var. and " sujal" here is the object ...
        String b = " sujal";
        System.out.println( a == b);  // true ----> since objects are same here 



        // here objects are stored in the heap but not in the string pool...
        String name1 = new String("sujal"); // diff pointer  (645645)
        String name2 = new String("sujal"); // diff pointer ( 234234)

        System.out.println( name1 == name2); // false -----> since new keyword is used it tells to create a different new object ie diffrent object.. so when you want to check only values you can use just method `equals()` to check value. for e.g., 
        System.out.println( name1.equals(name2)); // true 




        
    }
    
}
