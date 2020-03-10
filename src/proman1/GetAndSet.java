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
    private static String sBuild, sProjectName, sClientName, sProjectType, sPlatform, sGenre, sServerName;
    private static int iPages;
    
    public static void setAdditionalInfo(String sPlatform){
        GetAndSet.sPlatform = sPlatform;        
    }
    
    public static String getPlatform(){
        return sPlatform;
    }
    
    public static void setAdditionalInfo(String sPlatform, String sGenre){
        GetAndSet.sPlatform = sPlatform;
        GetAndSet.sGenre = sGenre;
        GetAndSet.sPlatform = "";
    }
    
    public static String getGame(){
        sBuild = sPlatform + " " + sGenre;        
        return sBuild;
    }
    
    public static void setAdditionalInfo(String sServerName, int iPages){
        GetAndSet.sServerName = sServerName;
        GetAndSet.iPages = iPages;
        GetAndSet.sPlatform = "";
    }
    
    public static String getWebsite(){
        return sBuild;
    }
    
    public static String getProjectType() {
        return sProjectType;
    }

    public static void setProjectType(String sProjectType) {
        GetAndSet.sProjectType = sProjectType;
    }

    public static String getClientName(){
        String ClientName = null;
        if (ClientName == null){
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
