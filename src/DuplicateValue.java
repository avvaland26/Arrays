public class DuplicateValue
{

    public static void main(String[] args) //main method

    {

        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};//initialise array
        System.out.println("Duplicate elements in given array: ");
        //Searching for duplicate element
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = i + 1; j < arr.length; j++)
            {
                if (arr[i] == arr[j])
                    System.out.println(arr[j]);
            }
        }
    }
}



