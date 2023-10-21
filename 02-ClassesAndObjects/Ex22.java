public class Ex22 {
    public static void main(String[] args){
        int vechicleSpeed = 120;
        boolean isSpeedOk;
        isSpeedOk = vechicleSpeed >= 40 && vechicleSpeed <= 140;

        System.out.println("Vechicle speed: " + vechicleSpeed);
        System.out.println("Speed is valid: " + isSpeedOk);
    }
}
