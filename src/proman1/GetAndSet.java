/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proman1;

/**
 *
 * @author MC03353
 */
public class GetAndSet {
    private static String sProjectName = null;
    private static String sClientName = null;
    private static String sProjectType = null;

    public static String getsProjectType() {
        return sProjectType;
    }

    public static void setsProjectType(String sProjectType) {
        GetAndSet.sProjectType = sProjectType;
    }

    public static String getClientName(){
        String getClientName = null;
        if (getClientName == null){
            sClientName = "";
            return sClientName;      
        }
        return sClientName;
    }
    
    public static void setClientName(String sClientName){
        GetAndSet.sClientName = sClientName;
    }
    
    public static String getProjectName() {
        String getProjectName = null;
        if (getProjectName == null) {
            sProjectName = "";
            return sProjectName;
        } 
        return sProjectName;
    }

    public static void setProjectName(String sProjectName) {
        GetAndSet.sProjectName = sProjectName;
    }   
}
