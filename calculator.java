public class calculator{
   float addition(float operand_1,float operand_2){
    return(operand_1+operand_2);
   }
   float substraction(float operand_1,float operand_2){
    return(operand_1 - operand_2);
   }
   float multiplication(float operand_1,float operand_2){
    return(operand_1 * operand_2);
   }
   float division(float operand_1,float operand_2){
    return(operand_1 / operand_2);
   }

   public static void main(String[] args) {
    float operand_1=10;
    float operand_2=5;
    calculator calc = new calculator();
    float add_result = calc.addition(operand_1, operand_2);
    System.out.println("Addition result is : " + add_result);
    float subs_result = calc.substraction(operand_1, operand_2);
    System.out.println("Subtraction result is : "+ subs_result);
    float multi_result =calc.multiplication(operand_1, operand_2);
    System.out.println("Multiplication Result is: " +multi_result);
    float division_result =calc.division(operand_1, operand_2);
    System.out.println("division Result is: " +division_result);

   }

    }
