
package memory_allocation;


public class Process {
    
    int processId;
    float startingAddress;
    float size;
    int allocated;
    
    
    public Process(){
        this.processId=0;
        this.startingAddress=0;
        this.size=0;
        
    }
    
    public Process(int processId,float size){
        this.processId=processId;
        //this.startingAddress=startingAddress;
        this.size=size;
    }
    
    
    
    
    
}
