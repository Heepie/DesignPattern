package Concrete;

import Frame.Format;

public class HtmlFormatBuilder {
        private Format format;
        private HtmlFormatBuilder() {
                format = new Format("default", "default", "default");
        }
        
        public static HtmlFormatBuilder start() {
                return new HtmlFormatBuilder();
        }
        
        public HtmlFormatBuilder setTitle(String title) {
                format.setTitle("<title>" + title + "</title>");
                return this;
        }
        
        public HtmlFormatBuilder setContent1(String content1) {
                format.setContent1("<p>#1 " + content1 + "</p>");
                return this;
        }
        
        public HtmlFormatBuilder setContent2(String content2) {
                format.setContent2("<p>#2 " + content2 + "</p>");
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
