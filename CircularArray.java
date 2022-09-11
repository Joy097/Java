public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    //TO DO
    cir = new Object[lin.length];
    start=st;
    size = sz;
    for(int i=0;i<size;i++){
      cir[st]=lin[i];
      st=(st+1)%cir.length;
      
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
        //TO DO
    for(int i=0;i<cir.length;i++){
    System.out.print(cir[i]+" ");
    }
    System.out.println();
  }
  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    //To DO
   
    for(int i=start;i<size+start;i++){
      System.out.print(cir[i%cir.length]+" ");

  }
    System.out.println();
  }
  
  public void printBackward(){
   //TODo
    for(int i=size+start-1;i>=start;i--){
      System.out.print(cir[i%cir.length]+" "); 
   
  }
  }
  
  // With no null cells
  public void linearize(){
    //TO DO   
    int st=0;
    Object[]lin = new Object[size];
    for(int i=start;i<size+start;i++){
      lin[st]=cir[i%cir.length];
      ++st;
  }
    cir=lin;
   
    
}
  
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    
    //TO DO
     Object[] n = new Object[newcapacity];
    int x = start;
    int y = start;
    for(int i = 0 ; i<size ; i++){
      n[y] = cir[x];
      x = (x+1)%cir.length;
      y++;
    }
    cir = n;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
        Object[] n = new Object[newcapacity];
    
    int j = start;
    for(int i = 0 ; i<size ; i++){
      n[i] = cir[j];
      j = (j+1)%cir.length; 
    }
    cir = n;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
   public void insertByLeftShift(Object elem, int pos){
     Object[] nw = new Object[cir.length];
    if(size==cir.length || size>cir.length){
      resizeStartUnchanged(size+3);
    }
    int index = (start+pos)%cir.length;
    int ns = size-pos;
    int i = (start+size-1)%cir.length;//Index of Last Value
   int j = (start+size)%cir.length;//next av. pos
    for(int k = 0 ; k<ns ; k++){
      cir[j] = cir[i];
      i--;
      if(i<0){
        i = i+cir.length;
      }
      j--;
      if(j<0){
        j = j + cir.length;
      }
    }
    cir[index] = elem;
    size++;
  }    
    
  
  public void insertByRightShift(Object elem, int pos){  
    Object[] nw = new Object [cir.length];    
    if(size==cir.length || size>cir.length){
      resizeStartUnchanged(size+3);
    }
    int index = (start+pos)%cir.length;
    int ns = size-pos;
    int i = (start-1)%cir.length;
   int j = (i+1)%cir.length;
    for(int k = 0 ; k<ns ; k++){
      cir[i] = cir[j];
      i++;
      j++;    
    }
    cir[index] = elem;
    size++;
    start--;
  }
   
  public void removeByLeftShift(int pos){
    //TO DO
    int index = (start+pos)%cir.length;
    int ns = size - pos;
    for(int k = 0 ; k<=ns ; k++){
      cir[index] = cir[(index+1)%cir.length];
      index++;
      if(index>=cir.length){
        index= index%cir.length;
      }
    }
    size--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
     int index = (start+pos)%cir.length;
    int ns = size - pos;
    for(int k = 0 ; k<=ns ; k++){
      cir[index] = cir[index-1];
      index--;
    }
    cir[start] = null;
    start++;
    size--;
  }
  
  
  //This method will check whether the array is palindrome or not
  public void palindromeCheck(){
   int l = start;
    int k = (start+size-1)%cir.length;
    int check = 0;
    for(int i = 0 ; i<size/2 ; i++){
      if(cir[l] == cir[k]){
        check+=0;
      }
      else {
        check+=1;
      }
      l++;
      if(l>cir.length){
        l = (start+size)%cir.length;
      }
     k--;
      if(k<0){
        k = cir.length-1;
      }
    }
    if (check==0){
      System.out.println("This array is a palindrome");
    }
    else if (check!=0){
      System.out.println("This array is NOT a palindrome");
    }
  }
  
  
  //This method will sort the values by keeping the start unchanged
  public void sort(){
  for(int i = 0 ; i<size ; i++){
      for(int j = i+1 ; j<size ; j++){
       if((int) cir[(j+start)%cir.length]<(int)cir[(i+start)%cir.length]){
          Object temp = cir[(start+i)%cir.length];
          cir[(start+i)%cir.length] = cir[(start+j)%cir.length];
          cir[(start+j)%cir.length] = temp;
        }
      }
    }
  }
  
  //This method will check the given array across the base array and if they are equivalent interms of values return true, or else return false
  public boolean equivalent(CircularArray k){
    boolean check = false;
    int s1 = start;
    int s2 = k.start;
    for (int i = 0 ; i<size ; i++){
     if (cir[s1]==k.cir[s2]){
        check = true;
      }
      else{
        check = false;
        break;
      }
      s1 = (s1+1)%cir.length;
      s2 = (s2+1)%k.cir.length;
    } 
    return check;
  }}
                          
