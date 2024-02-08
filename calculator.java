public class calculator{
   float addition(float operand_1,float operand_2){
    return(operand_1+operand_2);
   }
 /**
  * The function "substraction" takes two float operands and returns their difference.
  * 
  * @param operand_1 The first operand for the subtraction operation.
  * @param operand_2 The second operand in the subtraction operation.
  * @return the result of subtracting operand_2 from operand_1.
  */
   float substraction(float operand_1,float operand_2){
    return(operand_1 - operand_2);
   }
   // The code you provided defines two methods in the `calculator` class: `multiplication` and
   // `division`.
   float multiplication(float operand_1,float operand_2){
    return(operand_1 * operand_2);
   }
   float division(float operand_1,float operand_2){
    return(operand_1 / operand_2);
   }
   float square (float operand_1){
    return (operand_1*operand_1);
   }
   float cube(float operand_1){
    return(operand_1*operand_1*operand_1);
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
    float square_result =calc.square(operand_1);
    System.out.println("square Result is: " +square_result);
    float cube_result =calc.cube(operand_1);
    System.out.println("cube Result is: " +cube_result);

   }

    }
