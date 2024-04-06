package Composite_Lab_4_3;


public class ADetector extends ATemplate {

    @Override
    public LTypeEnum getType(String[] input) {
        LTypeEnum type = LTypeEnum.UNDEFINED;
        if(input.length == 14 && input[0].length() == 5)
            type = LTypeEnum.VERTICAL;
        else if(input.length == 8 && input[0].length() == 9)
            type = LTypeEnum.HORIZONTAL;
        else if(input.length == 14 && input[0].length() == 9)
            type = LTypeEnum.NONE;

        return type;
    }

    @Override
    public String[] detectLetter(LTypeEnum type, String[] array) {
        switch (type) {
            case UNDEFINED:
            case NONE:

                break;

            case HORIZONTAL: {
                String[] completeArray = new String[15];

                for (int i = 0; i < 8; i++) {
                    completeArray[i] = array[i];
                    completeArray[14 - i] = array[i];
                }

                array = completeArray;
            }
                break;

            case VERTICAL: {
                String[] completeArray = new String[14];

                String temp;
                for (int i = 0; i < 14; i++) {
                    temp = array[i];
                    for (int j = 3; j >= 0; j--) {
                        temp += array[i].charAt(j);
                    }
                    completeArray[i] = temp;
                }

                array = completeArray;
            }
                break;
        }

        return array;


    }

    @Override
    public void printLetter(String[] array) {
        for (String line : array) {
            System.out.println(line);
        }
    }
}
