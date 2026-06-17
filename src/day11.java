import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/*import java.util.HashSet;
import java.util.Set;

public class day11 {
    public static void main(String[]args){
        Set<String>set=new HashSet<>();
        set.add("Student 1");
        set.add("Student 2");
        set.add("Student 1");
        set.add("Student 2");
        set.add("Student 3");
        System.out.println(set);
        for (String s:set){
            System.out.println(s);

        }
    }
}*/
import java.util.HashMap;
import java.util.HashSet;
         public class day11 {
             public static void main(String[] args) {
                 HashMap<String, Object> person = new HashMap<>();
                 person.put("ram", "89");
                 person.put("john", "78");
                 System.out.println(person.get("percent"));
                 person.entrySet().forEach(entry -> {
                     System.out.println(entry.getKey() + " : " + entry.getValue());
                 });
             }
         }

