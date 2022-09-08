package StringCryptography;

public class StringCryptography {
    private int length;
    private int ceilBC;
    private int floorAR;
    private String encrypted;
    private String decrypted;

    public String encryption(char []string){
       length = string.length;
        ceilBC = (int)Math.ceil(Math.sqrt(length));
        floorAR = (int)Math.floor(Math.sqrt(length));
        encrypted ="";

        if (ceilBC * floorAR < length){
            if (Math.min(ceilBC, floorAR)== ceilBC){
//                ceilBC = ceilBC + 1;
                ceilBC++;
            }
            else {
//                floorAR = floorAR + 1;

                floorAR++;
            }
        }

//        Matrix for the Encrypted String
        char[][]arr = new char[floorAR][ceilBC];
        int k = 0;
//        fill the matrix row-wise
        for (int j = 0; j < floorAR; j++) {
            for (int i = 0; i < ceilBC; i++){
                if (k < length){
                    arr[j][i] = string[k];
                }
                k++;
            }
        }
//        loop to generate encrypted String
        for (int j = 0; j < ceilBC; j++){
            for (int i = 0; i < floorAR; i++){
                encrypted = encrypted + arr[i][j];
            }
        }
        return encrypted;
    }

    public String decryption(char []string){
        length = string.length;
        ceilBC = (int)Math.ceil(Math.sqrt(length));
        floorAR = (int)Math.floor(Math.sqrt(length));
        encrypted ="";

        if (ceilBC * floorAR < length){
            if (Math.min(ceilBC, floorAR)== ceilBC){
//                ceilBC = ceilBC + 1;
                ceilBC++;
            }
            else {
//                floorAR = floorAR + 1;

                floorAR++;
            }
        }

        char[][]arr = new char[floorAR][ceilBC];
        int k = 0;

//        fill the matrix column-wise
        for (int j = 0; j < ceilBC; j++){
            for (int i = 0; i < floorAR; i++) {
                if (k < length){
                    arr[j][i] = string[k];
                }
                k++;
            }
        }

//        loop to generate decrypted String
        for (int j = 0; j < floorAR; j++) {
            for (int i = 0; i < ceilBC; i++){
                decrypted = decrypted + arr[i][j];
            }
        }
        return decrypted;
    }

}
