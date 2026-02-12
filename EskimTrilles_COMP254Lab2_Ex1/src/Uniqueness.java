import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Uniqueness {
    //Returns true if there are no duplicate elements in the array.
    public static boolean unique1(int[] data) {
        int n = data.length;
        for (int j = 0; j < n-1; j++)
            for (int k = j + 1; k < n; k++)
                if (data[j] == data[k])
                    return false;               //found duplicate pair
        return true;                            //if we reach this, elements are unique
    }

    //Return true if there are no duplicate elements in the array.
    public static boolean unique2(int[] data) {
        int n = data.length;
        int[] temp = Arrays.copyOf(data, n);    //make a copy of data
        Arrays.sort(temp);                      //and sort the copy
        for(int j = 0; j < n - 1; j++)
            if (temp[j] == temp[j+1])           //check neighboring entries
                return false;                   //found duplicate pair
        return true;                            //if we reach this, elements are unique
    }


    public static void binarySearch(long minTime, long maxTime, int numberOfElements, String method) {

        long startTime;
        long endTime;
        boolean isUnique;
        long minute = 0;
        int startIndex = 0;
        int middleIndex = 0;
        int middleValue;
        int endIndex = 0;

        //list to hold the int - this list will be converted to array
        ArrayList<Integer> numberList = new ArrayList<>();

        //this will populate the list above according to the size provided
        for (int i = 0; i < numberOfElements ; i++) {
            numberList.add(i+1);
        }

        //this will be the array that will contain all the elements from the list
        //this will serve as the reference throughout the search
        int[] workingArray = new int[numberList.size()];

        //this will get all the elements from the list and save it to the
        //workingArray
        for (int i = 0; i < numberList.size(); i++) {
            workingArray[i] = numberList.get(i);
        }

        //this will capture the beginning index of the reference array
        endIndex = (workingArray.length - 1);

        //this will calculate the mean index of the working array to
        //get the middle index and capture the corresponding value
        //to be used as the initial size of the array. that array will be
        //used later by the unique methods
        if ((endIndex+startIndex) % 2 ==0){
            middleIndex = workingArray[((endIndex + startIndex) /2)];
        } else {
            middleIndex = workingArray[((endIndex + startIndex + 1) /2)];
        }


        //this will contain the logic for the binary search
        while (minute < minTime || minute > maxTime) {
            //this will hold the distance between the given start and end indexes
            int count = 0;

            //this will capture the middle value from the reference array
            //based from the computed index
            middleValue = workingArray[middleIndex];

            //this will create new array that will be used
            //for the two unique methods.
            //the initial size of this array depends on the value extracted from the
            //reference array, which is the middle value.
            //the succeeding sizes will still come from the reference array,
            //but further computation will be needed to get the correct index
            int[] numbersArray = new int[middleValue];

            //this will populate the array above
            for (int i = startIndex; i < middleValue; i++) {
                numbersArray[i] = numberList.get(i);
            }

            //this will record the time before the unique1 method runs
            startTime = System.currentTimeMillis();

            //this will call the unique1 or unique2 method with the created array as parameter

            if (method == "unique1") {
                isUnique = Uniqueness.unique1(numbersArray);
            } else {
                isUnique = Uniqueness.unique2(numbersArray);
            }

            //this will record the time when the method ends
            endTime = System.currentTimeMillis();

            //this will calculate the lapse time the method took while running
            minute = endTime - startTime;

            //this logic will decide which half of the array will be used
            //by the unique methods.
            //if the method took longer than desired, this block will be executed.
            //this mean, the n is too large and should move to the other half
            //of the array
            if (minute > maxTime) {
                //this will make new reference for new end
                //which is the middle
                endIndex = middleIndex;

                //this will record the size of the new start-end reference index
                count = endIndex + startIndex;

                //this will make sure that the mean will always be a whole number
                if (count % 2 == 0){
                    middleIndex = count / 2;
                } else {
                    middleIndex = (count + 1) / 2;
                }

                //this will capture the value of the middle index from the reference
                //array, and that value will be used for the next loop as the new size
                //of new array
                middleValue = workingArray[middleIndex];

                //this will run if the time the method took was less than the expected.
                //it means that the n size of the array used was smaller than the
                //middle value.
            } else if (minute < minTime) {

                //this moves the reference for the middle index as the start index
                //based on the reference array
                startIndex = middleIndex;

                //this will count the new size of between the end and start
                count = endIndex + startIndex;

                //this will make sure that the computed index mean is a whole number
                if (count % 2 == 0) {
                    middleIndex = count / 2;
                } else {
                    middleIndex = (count + 1) / 2;
                }

                //this will capture the value of the middle index from the reference
                //array, and that value will be used for the next loop as the new size
                //of new array
                middleValue = workingArray[middleIndex];
            } else {

                //once the desired time was achieved, this method will print the size
                //of the array used
                System.out.println("The largest n value to run for 1 minute is: " + workingArray[middleIndex]);
            }
            System.out.println("Time: " + minute);
        }
    }
}
