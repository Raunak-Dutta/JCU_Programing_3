public class Prac_1_3_ChairPatern {
    public static void main(String[]args){
        for(int i = 0; i<6; i++){
            if (i<3){
                System.out.println("X                        X");
            }
            else if (i == 3) {
                for(int j=0; j<26;j++){
                    System.out.print("X");
                    if(j == 5 || j == 17){
                        j++;
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
            else{
                for(int j=0; j<26;j++){
                    if(j == 6 || j == 18 || (j >=1 && j <= 4)|| (j >=20 && j < 25)|| (j >=8 && j < 17)){
                        //j++;
                        System.out.print(" ");
                    }
                    else System.out.print("X");

                }
                System.out.println();
            }
        }
    }
}
