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

    public static String getsProjectName() {
        return sProjectName;
    }

    public static void setsProjectName(String sProjectName) {
        GetAndSet.sProjectName = sProjectName;
        //System.out.println(sProjectName); TESTING
    }
    
    
}
