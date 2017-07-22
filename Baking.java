
/**
 * Klasa Baking sluzy do przeliczania roznicy powierzchni blach lub tortownic do pieczenia ciast.
 * Dostep odbywa sie za pomoca funkcji getters i setters.
 *
 * @author Maciej Karczewski
 * @version 1.0
 */

public class Baking {
    private String type1;
    private String type2;
    private double radius1;
    private double radius2;
    private double sheetFrom1;
    private double sheetFrom2;
    private double sheetTo1;
    private double sheetTo2;
    private double areaFrom;
    private double areaTo;

    public Baking() { //konstruktor
        type1 = null;
        type2 = null;
        radius1 = 0;
        radius2 = 0;
        sheetFrom1 = 0;
        sheetFrom2 = 0;
        sheetTo1 = 0;
        sheetTo2 = 0;
    }

    //ustawianie typu formy z oryginalnego przepisu, wartości 'sheet' i 'pan'
    public void setType1(String type1) {
        this.type1 = type1;
    }

    //ustawianie typu formy używanej przez użytkownika, wartości 'sheet' i 'pan'
    public void setType2(String type2) {
        this.type2 = type2;
    }

    //ustawnianie wartości promienia tortownicy z oryginalnego przepisu
    public void setRadius1(double radius1) {
        this.radius1 = radius1;
    }

    //ustawnianie wartości promienia tortownicy używanej przez użytkownika
    public void setRadius2(double radius2) {
        this.radius2 = radius2;
    }

    //ustawianie wartości boku blachy z oryginalnego przepisu
    public void setSheetFrom1(double sheetFrom1) {
        this.sheetFrom1 = sheetFrom1;
    }

    //ustawianie wartości boku blachy z oryginalnego przepisu
    public void setSheetFrom2(double sheetFrom2) {
        this.sheetFrom2 = sheetFrom2;
    }

    //ustawianie wartości boku blachy używanej przez użytkownika
    public void setSheetTo1(double sheetTo1) {
        this.sheetTo1 = sheetTo1;
    }

    //ustawianie wartości boku blachy używanej przez użytkownika
    public void setSheetTo2(double sheetTo2) {
        this.sheetTo2 = sheetTo2;
    }

    //metoda obliczająca powierzchnię formy z oryginalnego przepisu
    private void calcArea1(String t) {
        switch (t) {
            case "sheet":
                areaFrom = sheetFrom1 * sheetFrom2;
                break;
            case "pan":
                areaFrom = 3.14159 * radius1 * radius1 / 4;
                break;
        }
    }

    //metoda obliczająca powierzchnię formy używanej przez użytkownika
    private void calcArea2(String t) {
        switch (t) {
            case "sheet":
                areaTo = sheetTo1 * sheetTo2;
                break;
            case "pan":
                areaTo = 3.14159 * radius2 * radius2 / 4;
                break;
        }
    }

    //metoda publiczna podająca wynik w postaci procentowej różnicy między powerzchniami obu form
    public double getResult() {
        calcArea1(type1);
        calcArea2(type2);
        return (int) areaTo / areaFrom * 100; //wynik procentowy (wystarczy podzielić przez 100, aby uzyskać mnożnik)
    }
}
