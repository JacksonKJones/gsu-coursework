public class NumberGrid {
    public static void main(String[] args) {
    int row = 7;
    int column = 20;
    int number = 0;
    //Declares Number of Rows and Columns
    //Declares number as a variable
    for (int i = 1; i <= row; i++){
        for (int j = 1; j <= column; j++) {
            number = i + (j*row) - row;
            if(number >= 10) {
                System.out.print(number + "  "); 
            }
            else {
       System.out.print(number + "   ");
            }
        //Prints Number and then spaces them from each other
       }
       System.out.println("");
   }
   //Creates Rows
  }
  }