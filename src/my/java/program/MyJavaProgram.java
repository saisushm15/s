/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.java.program;

/**
 *
 * @author konda babu
 */
public class MyJavaProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {  
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=5;j<=i*5-1;j+=5)
            {
               System.out.print(j +" ");
            }
           System.out.println();
        }
    }   
}
