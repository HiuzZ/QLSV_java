/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.imageio.stream.FileImageInputStream;

/**
 *
 * @author ADMIN
 */
public class IOFile {
    public static <T> List <T> doc(String fname) throws ClassNotFoundException {
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream o = new ObjectInputStream(new FileInputStream(fname));
            list = (List<T>)o.readObject();
            o.close();
        }catch (IOException e) {
            System.out.println(e);
        }catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        return list;
    }
    
    public static <T> void viet(String fname, List<T> arr) throws FileNotFoundException, IOException {
        try {
            ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(fname));
            o.writeObject(arr);
            o.close();
        } catch(IOException e) {
            System.out.println(e);
        }
    }
    
}
