package project;

public class MiniExcel {

    private static Object[][] table;

    public MiniExcel() {
        table = new Object[32][255];
    }

    public static void sum(String UpperInput) {
        int i = (int) UpperInput.charAt(0) - 65;
        int j = Integer.parseInt(UpperInput.substring(1, UpperInput.indexOf("=")));
        int firstSummandI = (int) UpperInput.charAt(UpperInput.indexOf("=")+1) - 65;
        int firstSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("=")+2, UpperInput.indexOf("+")));
        int secondSummandI = (int) UpperInput.charAt(UpperInput.indexOf("+")+1) - 65;
        int secondSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("+")+2));
        if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            int firstTemp = (Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            int secondTemp = (Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setIntValueToTable(i, j, firstTemp + secondTemp);
        } else if(MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Double.class) {
            double firstTemp = (double) ((Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ)).intValue();
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp + secondTemp);
        } else if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Double.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (double) ((Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ)).intValue();
            MiniExcel.setDoubleValueToTable(i, j, firstTemp + secondTemp);
        } else {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp + secondTemp);
        }
    }

    public static void multiplic(String UpperInput) {
        int i = (int) UpperInput.charAt(0) - 65;
        int j = Integer.parseInt(UpperInput.substring(1, UpperInput.indexOf("=")));
        int firstSummandI = (int) UpperInput.charAt(UpperInput.indexOf("=")+1) - 65;
        int firstSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("=")+2, UpperInput.indexOf("*")));
        int secondSummandI = (int) UpperInput.charAt(UpperInput.indexOf("*")+1) - 65;
        int secondSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("*")+2));
        if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            int firstTemp = (Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            int secondTemp = (Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setIntValueToTable(i, j, firstTemp * secondTemp);
        } else if(MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Double.class) {
            double firstTemp = (double) ((Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ)).intValue();
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp * secondTemp);
        } else if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Double.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (double) ((Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ)).intValue();
            MiniExcel.setDoubleValueToTable(i, j, firstTemp * secondTemp);
        } else {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp * secondTemp);
        }
    }

    public static void subtract(String UpperInput) {
        int i = (int) UpperInput.charAt(0) - 65;
        int j = Integer.parseInt(UpperInput.substring(1, UpperInput.indexOf("=")));
        int firstSummandI = (int) UpperInput.charAt(UpperInput.indexOf("=")+1) - 65;
        int firstSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("=")+2, UpperInput.indexOf("-")));
        int secondSummandI = (int) UpperInput.charAt(UpperInput.indexOf("-")+1) - 65;
        int secondSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("-")+2), UpperInput.length());
        if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            int firstTemp = (Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            int secondTemp = (Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setIntValueToTable(i, j, firstTemp - secondTemp);
        } else if(MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Double.class) {
            double firstTemp = (double) ((Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ)).intValue();
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp - secondTemp);
        } else if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Double.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (double) ((Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ)).intValue();
            MiniExcel.setDoubleValueToTable(i, j, firstTemp - secondTemp);
        } else {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp - secondTemp);
        }
    }

    public static void divide(String UpperInput) {
        int i = (int) UpperInput.charAt(0) - 65;
        int j = Integer.parseInt(UpperInput.substring(1, UpperInput.indexOf("=")));
        int firstSummandI = (int) UpperInput.charAt(UpperInput.indexOf("=")+1) - 65;
        int firstSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("=")+2, UpperInput.indexOf("/")));
        int secondSummandI = (int) UpperInput.charAt(UpperInput.indexOf("/")+1) - 65;
        int secondSummandJ = Integer.parseInt(UpperInput.substring(UpperInput.indexOf("/")+2), UpperInput.length());
        if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            int firstTemp = (Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            int secondTemp = (Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setIntValueToTable(i, j, firstTemp / secondTemp);
        } else if(MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Integer.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Double.class) {
            double firstTemp = (double) ((Integer) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ)).intValue();
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp / secondTemp);
        } else if (MiniExcel.getValueFromTable(firstSummandI, firstSummandJ).getClass() == Double.class &&
                MiniExcel.getValueFromTable(secondSummandI, secondSummandJ).getClass() == Integer.class) {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (double) ((Integer) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ)).intValue();
            MiniExcel.setDoubleValueToTable(i, j, firstTemp / secondTemp);
        } else {
            double firstTemp = (Double) MiniExcel.getValueFromTable(firstSummandI, firstSummandJ);
            double secondTemp = (Double) MiniExcel.getValueFromTable(secondSummandI, secondSummandJ);
            MiniExcel.setDoubleValueToTable(i, j, firstTemp / secondTemp);
        }
    }

    public static Object getValueFromTable(int i, int j) {
        return table[i][j];
    }

    public static void setDoubleValueToTable(int i, int j, double number) {
        table[i][j] = number;
    }
    public static void setIntValueToTable(int i, int j, int number) {
        table[i][j] = number;
    }
}
