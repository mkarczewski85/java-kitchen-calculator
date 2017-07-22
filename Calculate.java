

/**
 * Klasa Calculate sluzy jako przelicznik jednostek kuchennych.
 * Dostep odbywa sie za pomoca funkcji setters i getters
 *
 * @author Maciej Karczewski
 * @version 1.0
 */


public class Calculate {

    private double value;
    private double product;
    private String unit;
    private double vUnit;
    private double vGlass;
    private double vKilogram;
    private double vGram;
    private double vLiter;
    private double vMiniliter;
    private double vSpoon;
    private double vTeaspoon;

    //konstruktor wywolywany w OnCreate
    public Calculate() {
        value = 0;
        product = 0;
        vUnit = 0;
        unit = null;
    }

    //ustawianie jednostki w spinnerze1
    public void setUnit(String unit) {
        this.unit = unit;
        switch (unit) {
            case "glass":
                vUnit = 250;
                break;
            case "kilogram":
                vUnit = 1000;
                break;
            case "gram":
                vUnit = 1;
                break;
            case "liter":
                vUnit = 1000;
                break;
            case "miniliter":
                vUnit = 1000;
                break;
            case "spoon":
                vUnit = 15;
                break;
            case "teaspoon":
                vUnit = 5;
                break;
        }
    }

    //ustawianie produktu w spinnerze2
    public void setProduct(int p) {
        switch (p) {
            case 0:
                product = 1; //woda
                break;
            case 1:
                product = 1.56; //mąka graham
                break;
            case 2:
                product = 1.47; //maka krupczatka
                break;
            case 3:
                product = 1.85; //mąka kukurydziana
                break;
            case 4:
                product = 1.47; //mąka pszenna
                break;
            case 5:
                product = 1; //mąka ziemniaczana
                break;
            case 6:
                product = 1.136; //cukier kryształ
                break;
            case 7:
                product = 1.5625; //cukier puder
                break;
            case 8:
                product = 1.3889; //cukier waniliowy
                break;
            case 9:
                product = 1.3889; //kasza gryczana
                break;
            case 10:
                product = 1.3158; //kasza jęczmienna
                break;
            case 11:
                product = 1.5625; //kasza manna
                break;
            case 12:
                product = 1.6129; //kuskus
                break;
            case 13:
                product = 1.1628; //cieciorka
                break;
            case 14:
                product = 1.5152; //mak
                break;
            case 15:
                product = 1.25; //pszenica
                break;
            case 16:
                product = 1.087; //ryż
                break;
            case 17:
                product = 1.25; //soczewica
                break;
            case 18:
                product = 1.87; //margaryna
                break;
            case 19:
                product = 1.87; //masło
                break;
            case 20:
                product = 1.111; //olej
                break;
            case 21:
                product = 1.1628; //oliwa z oliwek
                break;
            case 22:
                product = 1; //mleko 2%
                break;
            case 23:
                product = 1.1628; //śmietana 18%
                break;
            case 24:
                product = 1; //ocet
                break;
            case 25:
                product = 1.25; //spirytus
                break;
            case 26:
                product = 1.02; //wino czerwone
                break;
            case 27:
                product = 1.02; //wino białe
                break;
            case 28:
                product = 1.087; //wódka 40%
                break;
            case 29:
                product = 2.2727; //kakao
                break;
            case 30:
                product = 1.9231; //kawa mielona
                break;
            case 31:
                product = 2.0833; //pieprz mielony
                break;
            case 32:
                product = 0.833; //sól
                break;
            case 33:
                product = 5; //zioła suszone
                break;
        }
    }

    //ustawianie wartości do przeliczenia w OnClickListener z EditText (po parsowaniu na double)
    public void setValue(double value) {
        this.value = value;
    }

    //obliczanie wartości dla szklanki
    private void calcGlass(String u) {
        switch (u) {
            case "glass":
                vGlass = value;
                break;
            case "kilogram":
                vGlass = (value * vUnit * product / 250);
                break;
            case "gram":
                vGlass = (value * vUnit * product / 250);
                break;
            case "liter":
                vGlass = (value * vUnit / 250);
                break;
            case "miniliter":
                vGlass = (value * vUnit / 1000 / 250);
                break;
            case "spoon":
                vGlass = (value * vUnit / 250);
                break;
            case "teaspoon":
                vGlass = (value * vUnit / 250);
                break;
        }
    }

    //obliczanie wartości dla kilograma
    private void calcKilogram(String u) {
        switch (u) {
            case "glass":
                vKilogram = (value * vUnit / product / 250 / 4);
                break;
            case "kilogram":
                vKilogram = value;
                break;
            case "gram":
                vKilogram = (value * vUnit / 1000);
                break;
            case "liter":
                vKilogram = (value * vUnit * product / 1000);
                break;
            case "miniliter":
                vKilogram = (value * vUnit / product / 1000 / 1000);
                break;
            case "spoon":
                vKilogram = (value * vUnit / product / 1000);
                break;
            case "teaspoon":
                vKilogram = (value * vUnit / product / 1000);
                break;
        }
    }

    //obliczanie wartości dla grama
    private void calcGram(String u) {
        switch (u) {
            case "glass":
                vGram = (value * vUnit / product);
                break;
            case "kilogram":
                vGram = (value * vUnit * 1);
                break;
            case "gram":
                vGram = value;
                break;
            case "liter":
                vGram = (value * vUnit * product / 1);
                break;
            case "miniliter":
                vGram = (value * vUnit / product / 1000);
                break;
            case "spoon":
                vGram = (value * vUnit / product);
                break;
            case "teaspoon":
                vGram = (value * vUnit / product / 1);
                break;
        }
    }

    //obliczanie wartości dla litra
    private void calcLiter(String u) {
        switch (u) {
            case "glass":
                vLiter = (value * vUnit / 250 / 4);
                break;
            case "kilogram":
                vLiter = (value * vUnit * product / 1000);
                break;
            case "gram":
                vLiter = (value * vUnit * product / 1000);
                break;
            case "liter":
                vLiter = value;
                break;
            case "miniliter":
                vLiter = (value * vUnit);
                break;
            case "spoon":
                vLiter = (value * vUnit / 1000);
                break;
            case "teaspoon":
                vLiter = (value * vUnit / 1000);
                break;
        }
    }

    //obliczanie wartości dla minilitra
    private void calcMiniliter(String u) {
        switch (u) {
            case "glass":
                vMiniliter = (value * vUnit);
                break;
            case "kilogram":
                vMiniliter = (value * vUnit * product / 1);
                break;
            case "gram":
                vMiniliter = (value * vUnit * product);
                break;
            case "liter":
                vMiniliter = (value * vUnit);
                break;
            case "miniliter":
                vMiniliter = value;
                break;
            case "spoon":
                vMiniliter = (value * vUnit);
                break;
            case "teaspoon":
                vMiniliter = (value * vUnit);
                break;
        }
    }

    //obliczanie wartości dla łyżki
    private void calcSpoon(String u) {
        switch (u) {
            case "glass":
                vSpoon = (value * vUnit / 15);
                break;
            case "kilogram":
                vSpoon = (value * vUnit * product / 15);
                break;
            case "gram":
                vSpoon = (value * vUnit * product / 15);
                break;
            case "liter":
                vSpoon = (value * vUnit / 15);
                break;
            case "miniliter":
                vSpoon = (value * vUnit / 1000 / 15);
                break;
            case "spoon":
                vSpoon = value;
                break;
            case "teaspoon":
                vSpoon = (value * vUnit / 15);
                break;
        }
    }

    //obliczanie wartości dla łyżeczki
    private void calcTeaspoon(String u) {
        switch (u) {
            case "glass":
                vTeaspoon = (value * vUnit / 5);
                break;
            case "kilogram":
                vTeaspoon = (value * vUnit * product / 5);
                break;
            case "gram":
                vTeaspoon = (value * vUnit * product / 5);
                break;
            case "liter":
                vTeaspoon = (value * vUnit / 5);
                break;
            case "miniliter":
                vTeaspoon = (value * vUnit / 1000 / 5);
                break;
            case "spoon":
                vTeaspoon = (value * vUnit / 5);
                break;
            case "teaspoon":
                vTeaspoon = value;
                break;
        }
    }

    //podawanie zaokrąglonej wartości dla szklanki do wyświetlenia na TextView (po sparsowaniu na String)
    public double getGlass() {
        calcGlass(unit);
        return Math.floor(vGlass * 1000) / 1000d;
    }

    //podawanie zaokrąglonej wartości dla kilograma do wyświetlenia na TextView (po sparsowaniu na String)
    public double getKilogram() {
        calcKilogram(unit);
        return Math.floor(vKilogram * 1000) / 1000d;
    }

    //podawanie zaokrąglonej wartości dla grama do wyświetlenia na TextView (po sparsowaniu na String)
    public double getGram() {
        calcGram(unit);
        return Math.floor(vGram * 10) / 10d;
    }

    //podawanie zaokrąglonej wartości dla litra do wyświetlenia na TextView (po sparsowaniu na String)
    public double getLiter() {
        calcLiter(unit);
        return Math.floor(vLiter * 1000) / 1000d;
    }

    //podawanie zaokrąglonej wartości dla minilitra do wyświetlenia na TextView (po sparsowaniu na String)
    public double getMiniliter() {
        calcMiniliter(unit);
        return Math.floor(vMiniliter * 10) / 10d;
    }

    //podawanie zaokrąglonej wartości dla łyżki do wyświetlenia na TextView (po sparsowaniu na String)
    public double getSpoon() {
        calcSpoon(unit);
        return Math.floor(vSpoon * 10) / 10d;
    }

    //podawanie zaokrąglonej wartości dla łyżeczki do wyświetlenia na TextView (po sparsowaniu na String)
    public double getTeaspoon() {
        calcTeaspoon(unit);
        return Math.floor(vTeaspoon * 10) / 10d;
    }
}
