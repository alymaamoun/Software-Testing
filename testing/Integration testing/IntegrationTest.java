/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package project;

import static Project.Main.mainCaller;
import static Project.Main.mainCallerDriver;
import Project.Matrix;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import static org.junit.Assert.*;


/**
 *
 * @author user
 */
public class MainTest  {
        @Test
        public void StubTesting() throws IOException {


            InputStream sysInBackup=System.in;
            ByteArrayInputStream newInStream=new ByteArrayInputStream("A + B \n  1 1 1 1 ".getBytes());

            System.setIn(newInStream);

            
            
            mainCaller();
            newInStream=new ByteArrayInputStream("".getBytes());
            System.setIn(newInStream);
            System.setIn(sysInBackup);
        }
        
        
                @Test
        public void DriverTesting() throws IOException {
            mainCallerDriver();
        }



 
}
