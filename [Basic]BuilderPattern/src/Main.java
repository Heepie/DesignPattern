public class Main {
        public static void main(String[] args) {
                
                // If there are a lot of parms, you can confuse parms.
//                Computer computer = new Computer("i7", "8G", "256 SSD");
        
//                System.out.println(computer.toString());
                Computer computer = ComputerBuilder
                                                                        .start()
                                                                        .setCpu("i7")
                                                                        .setRam("16G")
                                                                        .setStorage("128 SSD")
                                                                        .build();
                
                System.out.println(computer.toString());
                
        }
}
