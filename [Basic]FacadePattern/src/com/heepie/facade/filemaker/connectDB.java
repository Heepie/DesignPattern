package com.heepie.facade.filemaker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class connectDB {
        private connectDB() {
        }
        
        static Properties getProperty(String dbName) throws FileNotFoundException, IOException {
                String fileName = dbName + ".txt";
                Properties prop = new Properties();
                prop.load(new FileInputStream(fileName));
                
                return prop;
        }
}
