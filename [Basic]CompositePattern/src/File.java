public class File extends Component {
        public File(String name) {
                super(name);
        }

        private Object content;

        public Object getContent() {
                return content;
        }

        public void setContent(final Object content) {
                this.content = content;
        }
}
