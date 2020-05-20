


class Leftmostindexofanelementinanrepetitivearray {

    public static void main (String args[]){
        int arr[]={2,3,3,3,3,3,3,3};
        Leftmostindexofanelementinanrepetitivearray lm= new Leftmostindexofanelementinanrepetitivearray();

        int index=lm.findLeftMostIndex(arr,arr.length,3);
        System.out.println("Value of Index :"+index);
    }

    private int  findLeftMostIndex(int arr[], int n,int x){
        int l=0; //left index
        int h=n-1;  //rightmost index
        int mid=0;  //mid index

        while(l<=h){
             mid=l+(h-l)/2;
            if (arr[mid]==x && (mid==0 || arr[mid-1]!=x))
                return  mid;
            else if(arr[mid]>=x)
                 h=mid-1;
            else
                l=mid+1;
        }
        return -1;
    }

}
