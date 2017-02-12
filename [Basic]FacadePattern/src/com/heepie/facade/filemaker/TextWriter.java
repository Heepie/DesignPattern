package com.heepie.facade.filemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

class TextWriter {
        private Writer writer;
        
        static TextWriter start() {
                return new TextWriter();
        }
        
        TextWriter makeFile(String fileName) throws IOException {
                this.writer = new FileWriter(fileName);
                return this;
        }
        
        TextWriter writeContent(String title, String content) throws IOException {
                writer.write("=== " + title + " === \r\n");
                writer.write(content);
                return this;
        }
        
        TextWriter closeFile() throws IOException {
                writer.close();
                return this;
        }
}
