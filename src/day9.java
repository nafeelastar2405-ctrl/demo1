public class day9 {
    static class college implements AutoCloseable {
        college(){
            System.out.println("college");
        }

        @Override
        public void close() throws Exception {
            System.out.println("college Close");
        }
    }

    static class department extends college {
        department(){
            System.out.println("department");
        }

        @Override
        public void close() throws Exception {
            System.out.println("department Close");
            super.close();
        }
    }

    static class year extends department{
        year(){
            System.out.println("year");
        }

        @Override
        public void close() throws Exception {
            System.out.println("year Close");
            super.close();
        }
    }

    static void main() throws Exception {
        try(year year = new year()){

        }
    }
}
