
class EnumerationExample {
    enum Code{
        Langa;
    }
    public static void main(String[] args) {
         //String Nanga = Code.Langa;
         Code var = Code.Langa;
         //System.out.println(Nanga == "Langa");  E R R O R -- Incomparable data types
         System.out.println(var);
         System.out.println("Name of the class is :: "+var.getClass().getSimpleName());
    }
}