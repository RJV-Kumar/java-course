class Demo {
    Demo() {
        System.out.println("Demo Constructor called");
    }

    public static void main(String[] args){
        //Calc obj = new Calc();
        //AdvCalc obj = new AdvCalc();
        ScientificCalc obj = new ScientificCalc();

        int r1 = obj.add(5, 3);
        int r2 = obj.subtract(5, 3);
        
        int r3 = new AdvCalc().multiply(5, 3);
        int r4 = obj.multiply(3, 3);
        
        double r5 = new ScientificCalc().power(2, 3);
        double r6 = obj.power(4, 3);

        System.out.println("Addition: " + r1);
        System.out.println("Subtraction: " + r2);
        System.out.println("Multiplication: " + r3 + " (extending AdvCalc) " + r4);
        System.out.println("Power: " + r5 + " (extending ScientificCalc) " + r6);
    }
}