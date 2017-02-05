public class Main {
        public static void main(String[] args) {
                Folder
                root = new Folder("root"),
                heepie = new Folder("heepie"),
                music = new Folder("music"),
                computer = new Folder("computer"),
                volunteerWork = new Folder("volunteerWork");
                
                File
                resume = new File("resume"),
                tabScore = new File("tabScore"),
                scale = new File("scale"),
                java = new File("java"),
                github = new File("github"),
                church = new File("church"),
                children = new File("children");
                
                root.add(heepie);
                        heepie.add(resume);
                        heepie.add(music);
                                music.add(tabScore);
                                music.add(scale);
                        heepie.add(computer);
                                computer.add(java);
                                computer.add(github);
                        heepie.add(volunteerWork);
                                volunteerWork.add(church);
                                volunteerWork.add(children);
                                
                scan(root);
        }

        // to scan Component(Folder, File)
        public static void scan(Component component) {
                System.out.println(component.getClass() + "|" + component.getName());
                if (component instanceof Folder) {
                        for(Component i:((Folder) component).getList()) {
                                scan(i);
                        }
                 } 
        }
}
