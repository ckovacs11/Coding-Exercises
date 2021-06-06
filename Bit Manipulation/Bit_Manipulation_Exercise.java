//Java bitwise operations with examples
public class Bit_Manipulation_Exercise {
    private int bitwiseOr(int x, int y) {
        int result = x | y;
        return result;

    }
    private int bitwiseAnd(int x, int y) {
        int result = x & y;
        return result;
    }
    //inversion of the operand, int is 32bits
    private int bitwiseComplement(int x) {
        int result = ~x;
        return result;
    }
    //if bits in corresponding positions are different
    private int bitwiseXor(int x, int y) {
        int result = x ^ y;
        return result;
    }
    //bit shift left 1
    private int bitwiseLeftShiftOne(int x) {
        int result = x << 1;
        return result;
    }
    public static void main(String[] args) {

        Bit_Manipulation_Exercise bme = new Bit_Manipulation_Exercise();
        System.out.println(bme.bitwiseOr(1, 2)); //10 | 01 = 11, or 3
        System.out.println(bme.bitwiseAnd(4, 5)); //100 & 101 = 100, or 4
        int complementResult = bme.bitwiseComplement(2);
        System.out.println(complementResult + " and the binary representation: " + Integer.toBinaryString(complementResult));//11111111111111111111111111111101
        System.out.println(bme.bitwiseXor(4, 5)); // 100 ^ 101 = 001
        System.out.println(bme.bitwiseLeftShiftOne(5)); //101 << 1 = 1010, or 10
        


    
    }

}


