public class Array {
    public static void main(String[] args) {
        int [] rollNumber = new int[3];

        for(int i=0; i<rollNumber.length; i++)
        {
            rollNumber[i] = i;
        }
        
        for(int i=0; i<rollNumber.length; i++)
        {
                System.out.println(rollNumber[i]);
        }


        // 2D array
        int [][] marks = new int[3][3];

        for(int i=0; i<marks.length; i++)
            for(int j=0; j<marks[i].length; j++)
                    marks[i][j] = i*j;
                
        for(int i=0; i<marks.length; i++)
        {
           for(int j=0; j<marks[i].length; j++)
                    System.out.print(marks[i][j]);
            System.out.println();
        }
    }    
}
