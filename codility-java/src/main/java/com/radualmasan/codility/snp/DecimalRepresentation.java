package com.radualmasan.codility.snp;

public class DecimalRepresentation {

    private static final String DECIMAL_SEPARATOR = ".";

    public String get(int dividend, int divisor) {
        String representation = "" + dividend / divisor;

        int remainder = dividend % divisor;
        if (remainder > 0) {
            String decimals = "";

            int rStart = -1;
            int rEnd = -1;
            boolean repeating = false;

            do {
                remainder *= 10;

                if (remainder < divisor) {
                    decimals += "0";

                } else {
                    int decimal = remainder / divisor;
                    remainder %= divisor;
                    decimals += decimal;

                    if (rStart == -1) {
                        rStart = decimals.substring(0, decimals.length() - 1).indexOf("" + decimal);
                        rEnd = rStart == -1 ? -1 : decimals.length() - 1;
                    }

                    if (rStart > -1)
                        if (decimals.substring(rEnd).equals(decimals.substring(rStart, rEnd)))
                            repeating = true;

                        else if (decimals.length() - rEnd > rEnd - rStart - 1) {
                            rStart = -1;
                            rEnd = -1;
                        }
                }

            } while (remainder != 0 && !repeating);

            representation += DECIMAL_SEPARATOR;
            if (rStart > -1) {
                representation += decimals.substring(0, rStart);
                representation += "(";
                representation += decimals.substring(rStart, rEnd);
                representation += ")";

            } else
                representation += decimals;
        }

        return representation;
    }
}

// 0.107 1
