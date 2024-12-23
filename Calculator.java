class Calculator {
    // adding
    public int adding(int num1, int num2) {
        int result = (num1+num2);
        return result;
    }
    
    // subtraction
    public int sub (int num1, int num2){
        int result = (num1 - num2);
        return result;
    }
    
    // multiplication
    public int multi ( int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    
    // divition
    public int divition (int num1, int num2 ){
        int result = (num1/ num2);
        return result;
    }
}

class Main {
    public static void main (String[] args) {
        Calculator obj = new Calculator();
        
        int addResult = obj.adding(3,3);
        int subReuslt = obj.sub(4, 2);
        int multi = obj.multi ( 10, 4);
        int divi = obj.divition(10, 3);
        
        
        System.out.println("Adding reuslt is " + addResult);
        System.out.println("Subtraction reuslt is " + subReuslt);
        System.out.println("Multiplication reuslt is " + multi);
        System.out.println("Divition reuslt is " + divi);
    }
}
