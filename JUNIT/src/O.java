//In the Assumption Class We have the called as assumeNotNull(Object object);
/*
 *assumeNotNull(Object... objects)
          If called with a null array or one or more null elements in objects, the test will halt and be ignored.         
*/
package src;

public class O {
    public static void assumeNotNull(Object... objects) {
        for (Object obj : objects) {
            if (obj == null) {
                throw new IllegalArgumentException("One or more objects are null. Test skipped.");
            }
        }
    }
}
