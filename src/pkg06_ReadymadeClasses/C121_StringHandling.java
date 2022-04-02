package pkg06_ReadymadeClasses;
public class C121_StringHandling {
    public static void main(String[] args) {

        String name = "JonJonyJacobJony";
        String ary[] = name.split(" ");
        System.out.println(name.equalsIgnoreCase("jon"));
        System.out.println(name.contains("Jony"));
        System.out.println(name.concat("Good"));
        name = name.concat("Good");
        System.out.println(name);





        StringBuffer sb = new StringBuffer("Domino");
        System.out.println(   sb            );
        System.out.println(   sb.length()   );

        sb.append(" Pizza");
        System.out.println(   sb            );

        sb.insert(0, "My ");
        System.out.println(   sb            );

        // My Domino Pizza
        // azziP onimoD yM
        // yM onimoD azziP
        sb.reverse();
        System.out.println(   sb            );

        sb.reverse();
        System.out.println(   sb            );

        sb.replace(0, 2, "Your");
        System.out.println(   sb            );

        sb.delete(0,5);
        System.out.println(   sb            );

        System.out.println(   sb.indexOf("Q")  );
        System.out.println(   sb.lastIndexOf("P")  );
    }

}
