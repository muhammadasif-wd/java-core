
class Operator {

    public static void main(String[] args) {
        byte a = 10;
        byte b = 40;
        int result = a + b;
        if (result >= 50) {
            System.out.println("WOW NICE! You Got Half Century Price $50,000 rupee");
        } else if (result < 20 && result > 15) {
            System.out.println("WOW NICE AND OPERATOR WORKING");
        } else if (result < 30 && result > 5 || result < 10) {
            System.out.println("Nice! OR Operator working");
        } else if (result == 30) {
            System.out.println("MAGIC! You win lottery");
        } else if (result != 30) {
            System.out.println("WOW! SORRY FOR THIS SITUATION");
        }
        System.out.println(result);

        // switch catch using
        int switchNumber = 5;
        switch (switchNumber) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Saturday");
        }
    }

}
