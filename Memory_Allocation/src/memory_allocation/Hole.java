
package memory_allocation;


public class Hole {
    
   // int index;
    float startingAddress;
    float newSize;
    float originalSize;
    int allocated;
    
    public Hole(){
         //this.index=0;
        this.startingAddress=0;
        this.newSize=0;
        this.originalSize=0;
    }
    
    public Hole(float startingAddress,float originalSize,float newSize){
        //this.index=index;
        this.startingAddress=startingAddress;
        this.newSize=newSize;
        this.originalSize=originalSize;
        
    }
    
}
