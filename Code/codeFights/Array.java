public class Array
{
int[][] rotateImage(int[][] a) {


    int[][] myArray = new int [a[0].length][a.length];
    
    for( int i = 0; i < a.length ; i++)
    {
        for( int j = 0; j < a[0].length ; j++)
        {
            myArray[a[0].length-j-1][a.length-i-1] = a[i][j];
        }
    }
    return myArray;
}
}