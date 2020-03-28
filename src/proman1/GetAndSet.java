/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proman1;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author MC03353
 */
public class GetAndSet {
    private static String sPages, sAddInfo, sGame, sWebsite, sProjectName, sClientName, sProjectType, sPlatform, sGenre, sServerName;
    private static Date dDate;
    private static String[][] aProject = new String [10][];
    
    public static void setArray(){
        int iRow = 0;
        GetAndSet.aProject[iRow][0] = getProjectName()+"";
        GetAndSet.aProject[iRow][1] = getClientName()+"";
        GetAndSet.aProject[iRow][2] = getProjectType()+"";
        GetAndSet.aProject[iRow][3] = getAddInfo()+"";        
    }
    
    public static String getArray(){
        return Arrays.deepToString(aProject);
    }
    
    public static Date getDate(){
        dDate = Calendar.getInstance().getTime();
        return dDate;
    }
    
    public static void setAddInfo(String sAddInfo){
        GetAndSet.sAddInfo = sAddInfo;
    }
    
    public static void setAddInfo(String sPlatform, String sGenre){
        GetAndSet.sPlatform = sPlatform;
        GetAndSet.sGenre = sGenre;
    }
    
    public static String getAddInfo(){
        return sAddInfo;
    }
    
    public static void setPlatform(String sPlatform){
        GetAndSet.sPlatform = sPlatform;        
    }
    
    public static String getPlatform(){
        return sPlatform;
    }
        
    public static void setGame(String sPlatform, String sGenre){
        GetAndSet.sPlatform = sPlatform;
        GetAndSet.sGenre = sGenre;
    }
    
    public static String getGame(){
        sGame = "A " + sGenre + " game, on " + sPlatform;        
        return sGame;
    }
      
    public static void setWebsite(String sServerName, String sPages){
        GetAndSet.sServerName = sServerName;
        GetAndSet.sPages = sPages;
    }
    
    public static String getWebsite(){
        sWebsite = "A " + sPages + " page website, at address " + sServerName;
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
