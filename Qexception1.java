public class Qexception1 {
    public static void main(String[] args) {
        try{
        System.out.println(parseInt("1234"));
        System.out.println(parseInt("12a34"));
        }catch(NumberFormatException e){
            System.out.println("Invalid number format");
        }

    }
    static int parseInt(String str){
        for(char c:str.toCharArray()){
            if(!Character.isDigit(c)){
                throw new NumberFormatException("Invalid number format");
            }
        }
        return Integer.parseInt(str);
}
}
