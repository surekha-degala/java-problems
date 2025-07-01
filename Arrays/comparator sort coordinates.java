// User function Template for Java


class Point
{
    public int x;
    public int y;

    public Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public String toString()
    {
        return("("+this.x+","+this.y+") ");
    }
}

class Solution {
    public static void coordinatesSort(Point[] arr) {
        // Your code here
        Arrays.sort(arr, (p1, p2) -> {
            if (p1.x != p2.x) {
                return p1.x - p2.x;
            } else {
                return p1.y - p2.y;
            }
        });

        // Use lambda expressions to sort the array in the required way
    }
}
