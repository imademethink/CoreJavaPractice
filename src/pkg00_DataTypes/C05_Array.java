package pkg00_DataTypes;

public class C05_Array {

    public static void main(String[] args) {

        // No explicit values
        int [] indexValue = new int [10];

        // With explicit values
        int [] examMarks = {78, 98, 99};

        System.out.println(examMarks);
        System.out.println(examMarks[0]);
        //System.out.println(examMarks[-1]);
        //System.out.println(examMarks[44]);

        String [] examSubjects = {"English", "Maths", "History", "Science"};
        System.out.println(examSubjects);
        System.out.println(examSubjects[0]);
        // Modify array element
        examSubjects[0] = "German";
        System.out.println(examSubjects[0]);

        for (int index = 0; index < examSubjects.length; index++){
            System.out.println(examSubjects[index]);
        }
















        String [][] array2dExample =
                {
                        {"name", "gender", "address"},
                        {"jon",	 "male",   "london"},
                        {"lucy", "female", "newyork"},
                        {"sam",  "male",   "paris"}
                };


        // 2D or multi dimensional
        // row x column or   3 x 4 array
        int [][] pixelValue =
                {
                  {18, 40, 11, 54},    // row 0
                  {20, 32, -35, 14},    // row 1
                  {99, 90, 79, 31}    // row 2
                };
        System.out.println(pixelValue[1][2]);

        // outer loop or loop for row
        for (int row = 0; row < pixelValue.length; row++){

            // inner loop or loop for column
            for (int col = 0; col < pixelValue[row].length; col++){

                System.out.println(pixelValue[row][col]);

            }
        }


    }

}
