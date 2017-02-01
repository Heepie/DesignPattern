package Frame;
public class Format {
        private String title, content1, content2;

        public Format(String title, String content1, String content2) {
                this.title = title;
                this.content1 = content1;
                this.content2 = content2;
        }
        
        public String getTitle() {
                return title;
        }

        public void setTitle(String title) {
                this.title = title;
        }

        public String getContent1() {
                return content1;
        }

        public void setContent1(String content1) {
                this.content1 = content1;
        }

        public String getContent2() {
                return content2;
        }

        public void setContent2(String content2) {
                this.content2 = content2;
        }
        
        @Override
        public String toString() {
                return title + "\n" + content1 + "\n" + content2;
        }
}
