class DemoOv {
 void disp(double a, double b) {
 System.out.println("Method A");
 }
 void disp(int a, double b, double c) {
 System.out.println("Method B");
 }
 void disp(int a, float b) {
 System.out.println("Method C");
 }
 public double myMethod(int num1, int num2) {
 System.out.println("First myMethod of class Demo");
 return num1+num2;
 }
 public int myMethod2(int var1, int var2) {
 System.out.println("Second myMethod of class Demo");
 return var1-var2;
 }
 public static void main(String args[]) {
 DemoOv obj = new DemoOv();
 obj.disp(100, 20.67f);
 obj.disp(100.0, 20.67);
 obj.disp(100, 20.67);
 obj.disp(100, (float) 20.67);
 obj.disp(100, 20.67f, 20.7);
 double rd=obj.myMethod(10,10);
 int ri=obj.myMethod2(20,12);
 } 
}
/** Output:
 * β) Method C
 * γ) Method A
 * δ) Method A
 * ε) Method C
 * στ)Method B
 */
