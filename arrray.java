public class arrray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // if array is not defind the value or you want to enter the values from the
        // user then
        // you need to use the new key word as follows
        int arr2[] = new int[4];
        arr2[0] = 4;
        arr2[3] = 2;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        // array of string
        String arr3[] = { "soham", "rohit", "mohit" };
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
        // two d array
        // int arr4[][]= {
        // {2,3},
        // {5,6},
        // {7,8},
        // };
        // array using new keyword
        int arr4[][] = new int[3][2];
        arr4[0][0] = 2;
        arr4[0][1] = 3;
        arr4[1][0] = 5;
        arr4[1][1] = 6;
        arr4[2][0] = 7;
        arr4[2][1] = 8;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
        // jagged array :- array with fixed colume and unfixed rows and wisevarsa
        int arr5[][] = {
                { 8, 7, 6, 3, 4 },
                { 7, 9 },
                { 1, 2, 3, 4 }
        };
        // by using new keyword
        // int arr5[][]= new int[3][];
        // arr5[0] = new int[5];
        // arr5[0] = new int[2];
        // arr5[0] = new int[4];//memory allocted using new keyword to jagged array
        // for assiing value use above trick
        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++)// dinamic value detection
            {// hear i is int which is used in the for loop
                System.out.print(arr5[i][j] + " ");
            }
            System.out.println();
        }
        // inhanced for loop /for eatch loop
        int arr6[] = { 3, 4, 5, 6 };
        for (int i : arr6) {
            System.out.println(i);
        }
        // for each for two dimentional array
        int arr7[][] = {
                { 8, 7, 6, 3, 4 },
                { 7, 9, 6, 6, 4 },
                { 1, 2, 3, 4, 6 }
        };
        for (int[] a : arr7) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();

            // difrance in length and lenght()
            // length property
            int arr8[] = { 3, 5, 6, 7 };
            System.out.println(arr8.length);
            System.out.println(arr7.length);
            System.out.println(arr7[0].length);
            // length() method
            String soham = "soham";
            System.out.println(soham.length());
            
            //ArrayIndexOutOfBound exception
            System.out.println(arr8[4]);//this will give exception
            System.out.println(arr8[arr8.length -1]);// for not gatting exception

            

        }
    }
}
