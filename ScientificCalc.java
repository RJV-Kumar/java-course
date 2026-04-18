class ScientificCalc extends AdvCalc {
    ScientificCalc() {
        System.out.println("Scientific Calculator Constructor called");
    }
    public double power(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}