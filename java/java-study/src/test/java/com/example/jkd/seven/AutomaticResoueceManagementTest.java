package com.example.jkd.seven;

import org.junit.jupiter.api.Test;

import java.io.*;

public class AutomaticResoueceManagementTest {
    final String files = "E:\\\\Study\\\\IntelliJ_Workspace\\\\lecture-study\\\\java\\\\java-study\\\\src\\\\test\\\\java\\\\com\\\\example\\\\jkd\\\\seven\\\\test.txt";
    @Test
    void beforeClose(){
        FileInputStream fin = null;
        BufferedReader br = null;

        try{
            fin = new FileInputStream(files);
            br = new BufferedReader(new InputStreamReader(fin));

            String line = "";
            for(int i=1; (line = br.readLine()) != null; i++) {
                System.out.println("read file=" + line);
            }
        } catch(FileNotFoundException fnfe) {
            System.out.println("test.txt is not found");
        } catch(IOException ioe) {
            System.out.println("Can't read file");
        } finally {
            try{
                if(fin != null)
                    fin.close();
                if(br != null)
                    br.close();
            } catch (IOException ioe) {
                System.out.println("Failed to close files");
            }
        }
    }

    @Test
    void afterClose(){
        try(
                FileInputStream fin = new FileInputStream(files);
                BufferedReader br = new BufferedReader(new InputStreamReader(fin))
                ){

            String line = "";
            for(int i=1; (line = br.readLine()) != null; i++) {
                System.out.println("read file=" + line);
            }
        } catch(FileNotFoundException fnfe) {
            System.out.println("test.txt is not found");
        } catch(IOException ioe) {
            System.out.println("Can't read file");
        }
    }
}
