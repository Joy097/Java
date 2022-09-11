public class MyString {
    String s ;
      static char [] a ;
      MyString (String s) {
        this.s = s ;
        a = s.toCharArray () ;
      }
      
     
      int length () {
        return a.length ;
      }
      
    
      public void charAt (int n) {
        if (n >= 0 && n < a.length) {
          System.out.println (a [n]) ;
        }
        else {
          System.out.println ("Invalid") ;
        }
      }
      
   
      public void startsWith (String sec) {
        char [] a2 ;
        boolean s = false ;
        a2 = sec.toCharArray () ;
        if (a.length < a2.length) {
          System.out.println ("False") ;
        }
        else {
          int i = 0 ;
          while (i < a2.length) {
            if (a[i] == a2 [i]) {
              i ++ ;
              s = true ;
            }
            else {
              s = false ;
            }
          }
          System.out.println (s) ;
        }
      }
      
     
      void endsWith (String sec) {
        char [] a2 ;
        boolean s = false ;
        a2 = sec.toCharArray () ;
        if (a.length < a2.length) {
          System.out.println (s) ;
        }
        else {
          int i = a2.length - 1 ;
          int j = a.length - 1 ;
          while (i >= 0) {
            if (a[j] == a2 [i]) {
              i -- ;
              j -- ;
              s = true ;
            }
            else {
              s = false ;
            }
          }
          System.out.println (s) ;
        }
      }
      
      void replaceFirst (char oldChar,char newChar) {
        char a2 [] = new char [a.length] ;
        for (int i = 0 ; i < a.length ; i ++) {
          a2 [i] = a [i] ;
        }
        for (int i = 0 ; i < a2.length ; i ++) {
          if (a2 [i] == oldChar) {
            a2 [i] = newChar ;
            break ;
          }
        }
        for (int i = 0 ; i < a2.length ; i ++) {
          System.out.print (a2 [i]) ;
        }
      }
      
      
      void replaceAll (char oldChar,char newChar) {
        char a2 [] = new char [a.length] ;
        for (int i = 0 ; i < a.length ; i ++) {
          a2 [i] = a [i] ;
        }
        for (int i = 0 ; i < a2.length ; i ++) {
          if (a2 [i] == oldChar) {
            a2 [i] = newChar ;
          }
        }
        for (int i = 0 ; i < a2.length ; i ++) {
          System.out.print (a2 [i]) ;
        }
      }
      
      
      void replaceLast (char oldChar,char newChar) {
            char a2 [] = new char [a.length] ;
            for (int i = 0 ; i < a.length ; i ++) {
              a2 [i] = a [i] ;
            }
            for (int i = a2.length - 1 ; i >= 0 ; i --) {
              if (a2 [i] == oldChar) {
                a2 [i] = newChar ;
                break ;
              }
            }
            for (int i = 0 ; i < a2.length ; i ++) {
              System.out.print (a2 [i]) ;
            }
          }
      
      
      void toLowerCase () {
          String temp_s = s.toLowerCase () ;
          System.out.println (temp_s) ;
      }
      
      
      void toUpperCase () {
          String temp_s = s.toUpperCase () ;
          System.out.println (temp_s) ;
      }
      
      
      void equals (String s1) {
        if (s.equals(s1)) {
          System.out.println ("true") ;
        }
        else {
          System.out.println ("false") ;
        }
      }
      
      
      void equalsIgnoreCase (String s1) {
        if (s.equalsIgnoreCase (s1)) {
          System.out.println ("true") ;
        }
        else {
          System.out.println ("false") ;
        }
      }
      
     
      void compareTo (String temp_s) {
        int diff = s.compareTo (temp_s) ;
        System.out.println (diff) ;
      }
      
     
      void compareToIgnoreCase (String temp_s) {
        int diff = s.compareToIgnoreCase (temp_s) ;
        System.out.println (diff) ;
      }
      
     
      void substring (int n) {
        String temp_s = s.substring (n) ;
        System.out.println (temp_s) ;
      }
      
      
       void substring (int n1, int n2) {
        String temp_s = s.substring (n1 , n2) ;
        System.out.println (temp_s) ;
       }}
     
      
