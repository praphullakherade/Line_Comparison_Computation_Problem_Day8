public class LineComparisonComputation{

        public static void main(String args[]) {

                System.out.println("Welcome To Line Comparision Program");
                int X1=6,Y1=2,X2=2,Y2=8;
                Double lengthOfLine = Math.sqrt((X2-X1)*(X2-X1) + (Y2-Y1) *(Y2-Y1)) ;
                System.out.println("Length of line "+"("+X1+","+Y1+"),"+"("+X2+","+Y2+") is "+lengthOfLine);

                int X3=12,Y3=4,X4=4,Y4=16;
                Double lengthOfLine1 = Math.sqrt((X4-X3)*(X4-X3) + (Y4-Y3) *(Y4-Y3)) ;
                System.out.println("Length of Line "+"("+X3+","+Y3+"),"+"("+X4+","+Y4+") is "+lengthOfLine1);
                
                System.out.println( lengthOfLine == lengthOfLine1);//false
                //Compare is greater than (1) or less than (-1)
                System.out.println(lengthOfLine + " .compareTo " + lengthOfLine1 + ": " + lengthOfLine.compareTo(lengthOfLine1));
        }
}
