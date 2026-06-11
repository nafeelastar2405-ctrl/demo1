/*void main(){
    String name="vetias";

    System.out.println(name.toUpperCase());
}
 */


void main() {
    System.out.print("Enter name");
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    System.out.print("Enter dept");
    String dept = sc.nextLine();
    System.out.print("enter age");
    String age = sc.nextLine();
    sc.nextLine();
    System.out.println("details");
    System.out.println("name:"+name);
    System.out.println("dept"+dept);
    System.out.println("age"+age);
    sc.close();


}






