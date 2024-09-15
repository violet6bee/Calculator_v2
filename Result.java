public class Result {
    public void  decisions (double number1, String operator, double number2){
        switch (operator) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Делить на ноль нельзя");
                } else {
                    System.out.println(number1 / number2);
                }
                break;
            default:
                System.out.println("Такого оператора " + operator + " не существует. Перезапустите программу.");
        } 
    }
}
