public class day10_ex {
    static void main() {
        String name = null;
        try {
            System.out.println(name.charAt(0));
            System.out.println(66 / 0);

        } catch (ArithmeticException e) {
            System.out.println("Arthimetic Exception");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        }finally{
            System.out.println("This will always excute");
            name="";
        }
        System.out.println("still running");
        System.out.println("Name:"+name);
    }
}
