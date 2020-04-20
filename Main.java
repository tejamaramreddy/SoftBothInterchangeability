class Main {
  public static void main(String[] args) {
    int a[] = {10, 20, 30};
    int b[] = {9, 14, 11};
    mergeSortedArrays(a, b);
  }

  public static void mergeSortedArrays(int[] a,int[] b){
    int result[] = new int[a.length + b.length];
    int i=0,j=0,k=0;
    while(i<a.length && j<b.length){
        result[k++] = a[i] < b[j] ? a[i++] : b[j++];
    }
    while(i < a.length){
      result[k++] = a[i++];
    }
    while(j < b.length){
      result[k++] = a[j++];
    }
    for(int x : result){
      System.out.println(x + " ");
    }
  }
}