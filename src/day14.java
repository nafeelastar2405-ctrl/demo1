
public class day14 {
    static class Student{
        String name;
        int regno;
        String department;
        Student(Builder builder){
            this.name= builder.name;
            this.regno= builder.regno;
            this.department= builder.department;
        }
        static class Builder{
            private String name;
            private int regno;
            private String department;
            public Builder name(String nameValue) {
                this.name = nameValue;
                return this;
            }
            public Builder regno(int regnoValue){
                this.regno=regnoValue;
                return this;
            }
            public Builder department(String departmentValue){
                this.department=departmentValue;
                return this;
            }
            public Student build() {
                return new Student(this);
            }

        }
    }
    static void main() {

        Student student = new Student.Builder()
                .name("Nafeela")
                .regno(43)
                .department("cs")
                .build();
        System.out.println(student.name);
    }
}