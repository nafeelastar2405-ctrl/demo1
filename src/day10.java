/*import java.util.ArrayList;

public class day10 {
    static void main(){
        String[] students={"gopi","aish","prasanya","yalini","dharshini"};
        ArrayList<String>list=new ArrayList<>();
        list.add("gopi");
        list.add("aish");
        list.add("prasanya");
        list.add("yalini");
        list.add("dharshini");
        for (String s:list){
            System.out.println(s);
        }
        list.remove("yalini");
        System.out.println();
        for(String s: list) {
            System.out.println(s);
        }
    }

}*/
import java.util.LinkedList;

public class day10 {
    static void main() {
        LinkedList<String> queue = new LinkedList<String>();
        queue.add("gopi");
        queue.add("yaz");
        queue.add("pra");
        queue.add("aish");
        queue.add("dha");
        while(!queue.isEmpty()) {
            process(queue);
        }
    }
    static void process(LinkedList<String> queue){
        String removed=queue.removeFirst();
        System.out.println("Removed:"+removed);

    }
}