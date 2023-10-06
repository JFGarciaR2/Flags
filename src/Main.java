import javax.swing.*;
import java.awt.Color;


public class Main {
    public static final int COLOR_YELLOW = new Color(250,201,20).getRGB();
    public static final int COLOR_BLUE = new Color(17,13,99).getRGB();
    public static final int COLOR_RED = new Color(196,0,15).getRGB();
    public static final int COLOR_BLACK= new Color(5,5,5).getRGB();
    public static final int COLOR_WHITE = new Color(255,255,255).getRGB();
    public static final int COLOR_GREEN = new Color(35,138,51).getRGB();


    //COLOMBIA
    public static int[][] createCOLFLAG(int heigth, int width){

        int[][] flag = new int[heigth][width];

        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int)(heigth*0.5);

        for(int row = rowIni; row < rowEnd; row++){

            for(int cell=0; cell< flag[row].length; cell++){
                flag[row][cell] = COLOR_YELLOW;
            }
        }

        rowIni = (int)(heigth*0.5);
        rowEnd = (int)(heigth*0.75);

        for(int row = rowIni; row < rowEnd; row++){

            for(int cell=0; cell< flag[row].length; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int)(heigth*0.75);
        rowEnd = (int)(heigth);

        for(int row = rowIni; row < rowEnd; row++){

            for(int cell=0; cell< flag[row].length; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;
    }


    //VENEZUELA
    public static int[][] createVENFLAG(int heigth, int width) {

        int[][] flag = new int[heigth][width];

        int rowIni = 0;
        int rowEnd = 0;

        rowIni = 0;
        rowEnd = (int) (heigth * 0.4);

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_YELLOW;
            }
        }

        rowIni = (int) (rowEnd);
        rowEnd = (int) (heigth * (0.7));

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_BLUE;
            }
        }

        rowIni = (int)(rowEnd);
        rowEnd = (int) (heigth);

        for (int row = rowIni; row < rowEnd; row++) {

            for (int cell = 0; cell < flag[row].length; cell++) {
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;
    }


    //POLONIA

    public static int[][] createPOLFLAG(int heigth, int width){

        int[][]  flag = new int[heigth][width];
        int rowIni=0;
        int rowEnd=0;

        rowIni=0;
        rowEnd=(int)(heigth*0.5);

        for(int row=rowIni;row<rowEnd;row++){

            for(int cell=0;cell<flag[row].length;cell++){
                flag[row][cell] = COLOR_WHITE;

            }
        }

        rowIni=rowEnd;
        rowEnd=(int)(heigth);

        for(int row=rowIni;row<rowEnd;row++){

            for(int cell=0 ; cell < flag[row].length; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }
        return flag;
    }


    //PANAMA
    public static int[][] createPANFLAG(int heigth, int width){

        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = (int)(width*0.5);

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        cellIni = cellEnd;
        cellEnd = (int)(width);

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int)(heigth);
        cellIni = 0;
        cellEnd = (int)(width*0.5);

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=0; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        cellIni = cellEnd;
        cellEnd = (int)(width);

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }


    //CHILE
    public static int[][] createCHFLAG(int heigth, int width){

        int [][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = (int)(width*0.3);

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        cellIni = cellEnd;
        cellEnd = (int) (width);

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = (int)(heigth*0.5);
        rowEnd = (int)(heigth);
        cellIni = 0;
        cellEnd = (int)(width);

        for (int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        return flag;
    }


    //USA
    public static int[][] createUSAFLAG(int heigth, int width){

        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;
        int cont = 0;

        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = (int)(width*0.3);

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;

            }
        }

        cellIni = cellEnd;
        cellEnd = (int)(width);

        for(int row=rowIni; row<rowEnd; row++) {

            for (int cell = cellIni; cell < cellEnd; cell++) {
                if (cont % 2 == 0) {
                    flag[row][cell] = COLOR_RED;
                } else {
                    flag[row][cell] = COLOR_WHITE;
                }
            }
            cont++;
        }

        rowIni = rowEnd;
        rowEnd = (int)(heigth);
        cellIni = 0;
        cellEnd = (int)(width);
        cont = 0;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                if(cont%2==0){
                    flag[row][cell] = COLOR_RED;
                }
                else{
                    flag[row][cell] = COLOR_WHITE;
                }
            }
            cont++;
        }

        return flag;
    }


    //CHEQUIA
    public static int[][] createCZEFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;


        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int)(heigth);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                    flag[row][cell] = COLOR_BLUE;
                    flag[heigth-1-row][cell] = COLOR_BLUE;
            }
        }


        return flag;
    }

    //DINAMARK

    public static int[][] createDNKFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];

        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;


        //COLOR RED
        rowIni = 0;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        //COLOR WHITE |
        rowIni = 0;
        rowEnd = heigth;
        cellIni = (int)(width*0.3);
        cellEnd = cellIni+1;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<=cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR WHITE -
        rowIni = (int)(heigth*0.5)-1;
        rowEnd = rowIni+1;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<=rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }

    //FINLANDIA
    public static int[][] createFINFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];

        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        //COLOR WHITE
        rowIni = 0;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR BLUE |
        rowIni = 0;
        rowEnd = heigth;
        cellIni = (int)(width*0.3)-2;
        cellEnd = cellIni+3;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<=cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        //COLOR BLUE -
        rowIni = (int)(heigth*0.5)-2;
        rowEnd = rowIni+3;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<=rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }


    //NORUEGA
    public static int[][] createNORFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];

        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;


        //COLOR RED
        rowIni = 0;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        //COLOR WHITE |
        rowIni = 0;
        rowEnd = heigth;
        cellIni = (int)(width*0.3)-2;
        cellEnd = cellIni+3;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<=cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR WHITE -
        rowIni = (int)(heigth*0.5)-2;
        rowEnd = rowIni+3;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<=rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR BLUE |
        rowIni = 0;
        rowEnd = heigth;
        cellIni = (int)(width*0.3)-1;
        cellEnd = cellIni+1;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<=cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        //COLOR BLUE -
        rowIni = (int)(heigth*0.5)-1;
        rowEnd = rowIni+1;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<=rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        return flag;
    }


    //KUWAIT
    public static int[][] createKWTFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;


        rowIni = 0;
        rowEnd = (int)(heigth*0.35);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_GREEN;
            }
        }

        rowIni = rowEnd;
        rowEnd = (int)(heigth*0.7);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }


        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                    flag[row][cell] = COLOR_BLACK;
                    flag[heigth-1-row][cell] = COLOR_BLACK;
            }
        }

        return flag;
    }

    //SOUTHAFRICA
    public static int[][] createZAFFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];
        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;

        //COLOR RED
        rowIni = 0;
        rowEnd = (int)(heigth*0.35);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        //COLOR WHITE
        rowIni = rowEnd;
        rowEnd = (int)(heigth*0.7);
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR BLUE
        rowIni = rowEnd;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLUE;
            }
        }

        //COLOR WHITE >
        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 1;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
                flag[heigth-1-row][cell] = COLOR_WHITE;
            }
        }

        //COLOR GREEN >
        rowIni = 0;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_GREEN;
                flag[heigth-1-row][cell] = COLOR_GREEN;
            }
        }

        //COLOR GREEN --
        rowIni = (int)(heigth*0.5)-1;
        rowEnd = rowIni+2;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_GREEN;
            }
        }

        //COLOR YELLOW >
        rowIni = 2;
        rowEnd = (int)(heigth*0.5);
        cellIni = 0;
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_YELLOW;
                flag[heigth-1-row][cell] = COLOR_YELLOW;
            }
        }

        //COLOR BLACK >
        rowIni = 3;
        rowEnd = (int)(heigth*0.5);
        cellEnd = 0;

        for (int row=rowIni; row<rowEnd; row++){
            cellEnd++;
            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_BLACK;
                flag[heigth-1-row][cell] = COLOR_BLACK;
            }
        }

        return flag;
    }

    //SUIZA
    public static int[][] createCHEFLAG(int heigth, int width){
        int[][] flag = new int[heigth][width];

        int rowIni = 0;
        int rowEnd = 0;
        int cellIni = 0;
        int cellEnd = 0;


        //COLOR RED
        rowIni = 0;
        rowEnd = heigth;
        cellIni = 0;
        cellEnd = width;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_RED;
            }
        }

        //COLOR WHITE |
        rowIni = (int)(heigth*0.1);
        rowEnd = heigth-rowIni;
        cellIni = (int)(width*0.5)-2;
        cellEnd = cellIni+3;

        for(int row=rowIni; row<rowEnd; row++){

            for(int cell=cellIni; cell<=cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        //COLOR WHITE -
        rowIni = (int)(heigth*0.5)-2;
        rowEnd = rowIni+3;
        cellIni = (int)(width*0.25);
        cellEnd = (int)(width*0.75);

        for(int row=rowIni; row<=rowEnd; row++){

            for(int cell=cellIni; cell<cellEnd; cell++){
                flag[row][cell] = COLOR_WHITE;
            }
        }

        return flag;
    }



    public static void main(String[] args) {
        int[][] flag = {};

        
        flag = createCOLFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createVENFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createPOLFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createPANFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createCHFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createUSAFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createCZEFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createDNKFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createFINFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createNORFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
        flag = createKWTFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createZAFFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);

        flag = createCHEFLAG(20,40);
        JOptionPaneArrays.showColorArray2D(null,flag);
    }

}