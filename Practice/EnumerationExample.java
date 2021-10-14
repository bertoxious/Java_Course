
class EnumerationExample {

    enum Constant{
        APPLE(1), SAMSUNG(2), GOOGLE(3);
        int ranking;
        Constant(int r){
            ranking = r;
        }
    }
    enum Code{
        Langa;
    }
    public static void main(String[] args) {
         //String Nanga = Code.Langa;
         Code var = Code.Langa;
         //System.out.println(Nanga == "Langa");  E R R O R -- Incomparable data types
         System.out.println(var);
         System.out.println("Name of the class is :: " + var.getClass().getSimpleName());
         System.out.println(Constant.SAMSUNG.ranking);
    }
}