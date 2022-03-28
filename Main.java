class Main {
  public static void main(String[] args) {
    String znak="*";// robimy sobie zmienna typu string której przypisujemy nasz znak
    for(int x=0;x<7;x++){// petla for zmienna x warunek trwania x<7 i inkrementacja czyli dodawanie 1
      for(int y=0;y<7*2;y++){ // tutaj to samo co wyzej tylko inny warunek i zawarty jeszcze w tej petli powyzej
        if(y<(7-x)||y>(7+x)){// jesli warunek jest spełiniony to drukuje na ekran pusty znak? a jeśeli nie to drukuje *, a i || to coś to suma logiczna czyli tak prościej dodawanie
          System.out.print("");
        }
        else{
          System.out.print(znak);
        }
      }
      System.out.println();// to nam robi przerwer tzn przechodzi do nowej lini
    }
  }
}