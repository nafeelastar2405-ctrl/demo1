/*void main(){
    //int[] marks =new int[5];
    int[][] marks=new int[5][3];
    int[][] studentMarks= {
            {78, 90, 34},
            {89, 65, 89},
            {12, 34, 56},
            {66, 12, 89},
            {33, 77, 88}
    };
    for (int row=0;row < studentMarks.length;row++){

        for (int col=0;col<studentMarks[row].length;col++){

            System.out.print(studentMarks[row] [col]+" ");
        }
        System.out.println();
    }

        }*/
void main(){
    int [][] attendance =new int[5][3];
    int [][] studentattendance={
            {0,1,0},
            {1,0,0},
            {1,1,1},
            {1,0,1},
            {0,0,0}
    };
   for(int row=0;row<studentattendance.length; row++){
       System.out.println("student"+(1+row)+":");
       for (int column=0;column < studentattendance[row].length;column++){
           if(studentattendance[row][column]==1){
               System.out.println("class"+(1+column)+":present");
           }
           else{
               System.out.println("class"+(1+column)+":Absent");
           }
       }
       System.out.println(" ");
   }


}
