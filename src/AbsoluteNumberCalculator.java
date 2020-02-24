public class AbsoluteNumberCalculator {
    public static int findAbsolute(int number){
        if (number>Integer.MAX_VALUE || number<Integer.MIN_VALUE){
            throw new RuntimeException("out of range exception");
        }
        return Math.abs(number);
    }
}
