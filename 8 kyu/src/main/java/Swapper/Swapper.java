package Swapper;

class Swapper {
    //Swap Values
    public Object[] arguments;

    public Swapper(final Object[] arguments) {
        this.arguments = arguments;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0], arguments[1]};
        Object temp = args[0];
        arguments[0] = args[1];
        arguments[1] = temp;
    }
}
