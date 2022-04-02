package pkg00_DataTypes;

public class C06_String {
    public static void main(String[] args) {
        String name = "Taylor";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.equals("Tayler"));
        System.out.println(name.equalsIgnoreCase("TAYLOR"));
        System.out.println(name.contains("ay"));
        System.out.println(name.substring(1,4));
        String [] afterSplit = name.split("lo");
        System.out.println(afterSplit[0] + "  " + afterSplit[1]);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.concat(" is a name of a person"));
        System.out.println(name);

    }
}
