public class Ex21 {
    public static void main(String[] args){
       int heightCm, heightFt, heightIn;
       heightCm = 185;
       heightIn =  heightCm * 39 / 100;
       heightFt = heightIn / 12;
       heightIn -= heightFt * 12;

       System.out.println("My height in cm is : "+ heightCm + ", i.e. " + heightFt + " feet and " + heightIn + " inches");
    }
}
