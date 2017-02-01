package Concrete;

import Frame.Format;

public class Main {
        public static void main(String[] args) {
                Format textFormat = TextFormatBuilder.start()
                                                                        .setTitle("Text")
                                                                        .setContent1("Item1")
                                                                        .setContent2("Item2")
                                                                        .build();
        
                System.out.println(textFormat.toString());
                
                Format htmlFormat = HtmlFormatBuilder.start()
                                                                        .setTitle("Html")
                                                                        .setContent1("Item1")
                                                                        .setContent2("Iteml2")
                                                                        .build();
                
                System.out.println(htmlFormat.toString());
        }

}
