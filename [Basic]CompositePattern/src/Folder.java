import java.util.ArrayList;

public class Folder extends Component {
        public Folder(String name) {
                super(name);
        }

        ArrayList<Component> list = new ArrayList<>();
        
        public Folder add(Component obj) {
                list.add(obj);
                return this;
        }
        
        public ArrayList<Component> getList() {
                return list;
        }
}
