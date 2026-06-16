import java.util.ArrayList;

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
            System.out.print(s);
        }
        list.remove("yalini");
        System.out.println();
        for(String s: list) {
            System.out.print(s);
        }
    }
}
