package Concrete;

import Frame.Format;

public class TextFormatBuilder {
        private Format format;
        private TextFormatBuilder() {
                format = new Format("default", "default", "default");
        }
        
        public static TextFormatBuilder start() {
                return new TextFormatBuilder();
        }
        
        public TextFormatBuilder setTitle(String title) {
                format.setTitle("==" + title + "==");
                return this;
        }
        
        public TextFormatBuilder setContent1(String content1) {
                format.setContent1("#1 " + content1);
                return this;
        }
        
        public TextFormatBuilder setContent2(String content2) {
                format.setContent2("#2 " + content2);
                return this;
        }
        
        public Format build() {
                return format;
        }
        
        @Override
        public String toString() {
                return format.toString();
        }
}
