package Composite_Lab_4_3;


public abstract class ATemplate {

    public final void reconstructLetter(String[] array) {
        LTypeEnum type = getType(array);
        array = detectLetter(type, array);
        printLetter(array);
    }

    public abstract LTypeEnum getType(String[] input);

    public abstract String[] detectLetter(LTypeEnum type, String[] array);

    public abstract void printLetter(String[] input);


}
