package com.heepie.facade.filemaker;

import java.io.IOException;
import java.util.Properties;

public class FileMaker {
        private FileMaker() {
        }
        
        public static void makeFile(String mailaddr, String fileName){
                try {
                        Properties mailprop = connectDB.getProperty("maildata");
                        String userName = mailprop.getProperty(mailaddr);
                        TextWriter.start()
                                          .makeFile(userName + ".txt")
                                          .writeContent(userName, "I can do everything")
                                          .closeFile();

                        System.out.println(userName + ".txt is created");
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
