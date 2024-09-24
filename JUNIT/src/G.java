// Basically I will learn About the @Rule Annotation 
// --@Rule : This Annotation Expectes Something so here in this Case Its Expecting the Exception if the 
//  
package src;

public class G {
   public int divide(int numerator , int denominator){
     if(denominator == 0){
       throw new IllegalArgumentException("Cannot Divide By Zero"); 
     }
     return numerator/denominator;
   }    
}
