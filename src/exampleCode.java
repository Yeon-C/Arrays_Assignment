public class exampleCode {

    // the original block of code has some errors, such as the alligator bracket and "examplesArray (not exampleArray)"
    // index would return as an error
    public static void main(String[] args) {
        
        double[ ] exampleArray = {1,5,6,5,4,1}; 

        double maximum = exampleArray[0]; 

        int index = 0; 

        for (int i = 1; i < exampleArray.length ; i++){ 

             if (exampleArray[ i ] > maximum) {

                  maximum = exampleArray[ i ]; 

                  index = i; 

             }

        }
        System.out.println(index);
        //Essentially, this code updates the value of index whenever it is greater than the previous entry in the exampleArray.
        //index will return 2 as 6 is the biggest number in exampleArray (it is in the 2nd position)
    }
    }
