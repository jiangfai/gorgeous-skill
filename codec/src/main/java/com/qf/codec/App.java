package com.qf.codec;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.codec.binary.Base64;
//使用Java8自带的进行,还可以使用Apache的Commons-codec
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        InputStream in=App.class.getResourceAsStream("ai.jpg");
        byte[] buffer=new byte[in.available()];
        in.read(buffer);
        //自带
        //String base64Str = Base64.getEncoder().encodeToString(buffer);
        //Apache
        String base64Str = Base64.encodeBase64String(buffer);
        System.out.println(base64Str);
    }
}
