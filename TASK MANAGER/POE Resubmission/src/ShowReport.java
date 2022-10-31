/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ST10183099
 */
public class ShowReport {
     public static int[] duration;
   
    
     public static String[] taskID;
    public static String[]  taskName;
    public static String[] taskStatus;
    public static String[] devName;
    
    public static void delete(String tName){
        String[] newTaskName=new String[taskName.length-1];
        int[] newDuration=new int[duration.length-1];
        String[] newTaskID=new String[taskID.length-1];
        String[] newTaskStatus=new String[taskStatus.length-1];
        String[] newDevName=new String[devName.length-1];
        
        
        int p=0;
        int pos=0;
        //We going through each character using for looping to set the task name
        for(int i=0;i<taskName.length;i++){
            if(taskName[i].equals(tName)){
                
                 pos=i;
            }
            else{
               newTaskName[p]=taskName[i];
                p++;
            }
            
        }
        int j=0;
        //Same here where we looping to set a duration
        for(int t=0;t<duration.length;t++){
            if(t!=pos){
                newDuration[j]=duration[t];
                newTaskID[j]=taskID[t];
                newTaskStatus[j]=taskStatus[t];
                newDevName[j]=devName[t];
                
                
                j++;
            }
            
        }
        
        duration=newDuration;
        taskID=newTaskID;
        taskStatus=newTaskStatus;
        devName=newDevName;
        taskName=newTaskName;
        
        
    }
    public static String statusOfDone(){
        //Here we adding all the data of the task creation to place it
        String fullDetails="";
        for(int i=0;i<taskStatus.length;i++){
            if(taskStatus[i].equalsIgnoreCase("Done")){
                fullDetails+=devName[i]+"  "+taskName[i]+"  "+duration[i]+"\n";
            }
            
        }
        return fullDetails;
    }
    
    public static String longestDuration(){
        //Here we using search to find a specific task that has the longest duration
        int max=duration[0];
        int position=0;
        for(int i=0;i<duration.length;i++){
            if(max<duration[i]){
                max=duration[i];
                position=i;
            }
            
        
        }
        return devName[position]+"  "+max;
    
    }
    
    public static String searchTaskName(String tName){
        //Using the search funtion again to find a task by it's name
        String details="";
        for(int i=0;i<taskName.length;i++){
            if(tName.equalsIgnoreCase(taskName[i])){
                details+=taskName[i]+"   "+devName[i]+"   "+taskStatus[i]+"\n";
            }
        }
        return details;
    
    }
    
    public static String searchDeveloper(String developerName){
        //Using the search funtion again to find a task by it's developer name
         String details="";
        for(int i=0;i<devName.length;i++){
            if(developerName.equalsIgnoreCase(devName[i])){
                details+=devName[i]+"   "+taskName[i]+"   "+taskStatus[i]+"\n";
            }
        }
        return details;
        
    }
    
    
    public static String fullReport(){
        //We taking all the data of the task creation and place it in a full display report
          String details="";
        for(int i=0;i<devName.length;i++){
           
                 details+="Task Name "+taskName[i]+"\n"+"Developer Name "+devName[i]+"\n"+"Task ID "+taskID[i]+"\n"+"Task Duration "+duration[i]+"\n"+"Task Status "+taskStatus[i]+"\n";
            
        }
        return details;
        
    }
    
    
}
