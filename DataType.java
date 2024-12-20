
class DataType {

    public static void main(String a[]) {
        // Data type
        int i = 10;
        byte by = 100;
        short s = 20;
        long l = 3025470l;
        float f = 20.0f;
        double d = 30.0;
        char c = 'A';
        boolean b = true;

        c++; // character letter will be incremented by 1
        i++;
        System.out.println(i);

        // type conversion
        byte byteNum = 100;
        int intNumber = byteNum; // convert type byte to int
        // System.out.println(intNumber);

        // convert int to byte
        int intNum = 210;
        // byte byteNumber = intNum; // error: incompatible types: possible lossy conversion from int to byte`
        byte byteNumber = (byte) intNum;

        System.out.println(byteNumber);

    }
}
