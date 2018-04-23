/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.wordify;

import com.mycompany.word.Wordify;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

import java.math.BigInteger;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 *
 * @author golan
 */
@Named(value = "managedBean")
@SessionScoped
public class ManagedBean implements Serializable {

    /**
     * Creates a new instance of ManagedBean
     */
    private BigInteger num;

    
    private String word;
    

    public ManagedBean() {

    }

    /**
     * @return the number
     */
   

    /**
     * @return the word
     */
    public void geWord() {

        Wordify wd = new Wordify();

        setWord(wd.testTrillions(getNum()));
       // System.out.println(wd.testTrillions(num));

    }

    /**
     * @param word the word to set
     */
    public void setWord(String word) {
        this.word = word;
    }

    /**
     * @return the word
     */
    public String getWord() {
        return word;
    }

    /**
     * @return the input
     */
    

    /**
     * @return the num
     */
    public BigInteger getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(BigInteger num) {
        this.num = num;
    }
    public void downloadFileFromURL() throws Throwable {
URL website = new URL("http://www.oracle.com/technetwork/java/faq-135477.html#webmail");
ReadableByteChannel rbc = Channels.newChannel(website.openStream());
FileOutputStream fos = new FileOutputStream("information.txt");
fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
  }

}
