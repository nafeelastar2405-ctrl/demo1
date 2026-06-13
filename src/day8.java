/*public class day8 {
    record courseRecord(String courseName, String department) {
    }
    static void main(){
        courseRecord courseRecord=new courseRecord("java","BSC CS");
        System.out.println(courseRecord.courseName());
        System.out.println(courseRecord.department());

    }
}
}
 */
public  class day8 {

    enum LANGUAGES{
        EN("English"),
        GR("German"),
        JP("Japanese"),
        TM("Tamil");

        String value;

        LANGUAGES(String value){
            this.value=value;
        }
    }



    static void main() {
        System.out.println(LANGUAGES.TM.value);
        System.out.println(LANGUAGES.EN.value);
        System.out.println(LANGUAGES.GR.value);
        System.out.println(LANGUAGES.JP.value);
    }
}