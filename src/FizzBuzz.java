public class FizzBuzz<isDivisible5, isDivisible3> {

    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public static String displayFizzBuzz(int number) {

        boolean isDivisible5 = number % 5 == 0;
        boolean isDivisible3 = number % 3 == 0;




        if (isDivisible5 && isDivisible3) {
            return FIZZ + BUZZ;
        } else if (isDivisible5) {
            return BUZZ;
        } else if (isDivisible3) {
            return FIZZ;
        } else {
            return  changeToWord(number);
        }


    }

    private static String changeToWord(int number) {
        int hundred = (number - (number % 100)) / 100;
        int unit = ((number - (hundred * 100)) % 10);
        int dozen = (number - hundred * 100 - unit) / 10;
        int num4 = number - hundred * 100;
        String sHundred = "";
        String sDozen = "";
        String sUnit = "";
        sHundred = changeHundred(hundred);
        if (num4 == 11) {
           sDozen = "eleven";
        } else {
            if (num4 == 12) {
                sDozen = "twelve";
            } else {
                if (num4 == 13) {
                    sDozen= "thirteen";
                } else {
                    if (num4 == 14) {
                        sDozen= "fourteen";
                    } else {
                        if (num4 == 15) {
                            sDozen="fifteen";
                        } else {
                            if (num4 == 16) {
                                sDozen = "sixteen";
                            } else {
                                if (num4 == 17) {
                                    sDozen="seventeen";
                                } else {
                                    if (num4 == 18) {
                                        sDozen="eighteen";
                                    } else {
                                        if (num4 == 19) {
                                            sDozen="nineteen";
                                        } else {
                                            sDozen = changeDozenTenToTwenty(dozen);
                                            sUnit = changeUnit(unit);
                                        }
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        return sHundred + sDozen + sUnit;
    }

    private static String changeDozenTenToTwenty(int dozen) {
        String sDozen;
        switch (dozen) {
            case 2:
                sDozen="twenty ";
                break;
            case 3:
                sDozen="thirty ";
                break;
            case 4:
                sDozen="forty ";
                break;
            case 5:
                sDozen="fifty ";
                break;
            case 6:
                sDozen="sixty ";
                break;
            case 7:
                sDozen="seventy ";
                break;
            case 8:
                sDozen="eighty ";
                break;
            case 9:
                sDozen="ninety ";
                break;
            case 10:
                sDozen="ten";
                break;
            default:
                sDozen="";
        }
        return sDozen;
    }

    private static String changeUnit(int unit) {
        String sUnit;
        switch (unit) {
            case 1:
                sUnit="one";
                break;
            case 2:
                sUnit="two";
                break;
            case 3:
                sUnit="three";
                break;
            case 4:
                sUnit="four";
                break;
            case 5:
                sUnit="five";
                break;
            case 6:
                sUnit="six";
                break;
            case 7:
                sUnit="seven";
                break;
            case 8:
                sUnit="eight";
                break;
            case 9:
                sUnit="nine";
                break;
            case 10:
                sUnit="ten";
                break;
            default:
                sUnit="";
        }
        return sUnit;
    }

    private static String changeHundred(int hundred) {
        String sHundred;
        switch (hundred) {
            case 1:
                sHundred ="one hundred and ";
                break;
            case 2:
               sHundred = "two hundred and ";
                break;
            case 3:
                sHundred = "three hundred and ";
                break;
            case 4:
               sHundred = "four hundred and ";
                break;
            case 5:
                sHundred = "five hundred and ";
                break;
            case 6:
                sHundred = "six hundred and ";
                break;
            case 7:
                sHundred = "seven hundred and ";
                break;
            case 8:
                sHundred = "eight hundred and";
                break;
            case 9:
                sHundred = "nine hundred and ";
                break;
            default:
                sHundred = "";
        }
        return sHundred;
    }

}

