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
    private static String sGame, sWebsite, sApp,sProjectName, sClientName, sProjectType, sPlatform, sGenre, sServerName;
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
        
    }
    
    public static void setGame(String sPlatform, String sGenre){
        GetAndSet.sPlatform = sPlatform;
        GetAndSet.sGenre = sGenre;
    }
    
    public static String getGame(){
        sGame = "A " + sGenre + " game, on " + sPlatform;        
        return sGame;
    }
      
    public static void setWebsite(String sServerName, int iPages){
        GetAndSet.sServerName = sServerName;
        GetAndSet.iPages = iPages;
    }
    
    public static String getWebsite(){
        sWebsite = "A " + iPages + "page website, at address " + sServerName;
        return sWebsite;
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
