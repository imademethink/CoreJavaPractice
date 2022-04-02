package pkg00_DataTypes;

public class C02_NonPrimitive {
    public static void main(String[] args) {

        String name = "Pune";
        System.out.println("String value:   " + name);

        String[] languageArray = {"Java","Python","PHP"};
        System.out.println("String array values:       " + languageArray);
        System.out.println("String array 1st value:    " + languageArray[0]);
        for (int n =0; n < languageArray.length; n++)
        {
            System.out.println(languageArray[n]);
        }


        int[] marks = {85,65,-5};
        for (int i=0; i < marks.length; i++)
        {
            System.out.println(marks[i]);
        }

        System.out.println("String array values:       " + marks);
        System.out.println("String array 0th value:    " + marks[0]);
    }
}
