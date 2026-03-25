public class HelloApp {
    public static void main(String[] args) {
 
        if (args.length == 0) {
            
            System.out.println("Hello, World!");
        } else {
            StringBuilder names = new StringBuilder();
            boolean isFirst = true; 
            
            
            for (String name : args) {
                
                
                if (!isFirst) {
                    names.append(", "); 
                }
                
                names.append(name);
                isFirst = false; 
            }
            
            System.out.println("Hello, " + names.toString() + "!");
        }
    }
}