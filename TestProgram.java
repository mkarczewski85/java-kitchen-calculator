import java.util.*;
import java.text.*;

public class TestProgram {

    public static void units() {
        Calculate cal = new Calculate();

        System.out.print("Wprowadz wartosc: ");
        Scanner in = new Scanner(System.in);
        double val = in.nextDouble();
        cal.setValue(val);

        System.out.println("1. Szklanka\n2. Kilogram\n3. Gram\n4. Litr\n5. Minilitr\n6. Lyzka\n7. Lyzeczka");
        System.out.print("Wyznacz jednostke: ");
        int uChoose = in.nextInt();
        switch (uChoose) {
            case 1:
                cal.setUnit("glass");
                break;
            case 2:
                cal.setUnit("kilogram");
                break;
            case 3:
                cal.setUnit("gram");
                break;
            case 4:
                cal.setUnit("liter");
                break;
            case 5:
                cal.setUnit("miniliter");
                break;
            case 6:
                cal.setUnit("spoon");
                break;
            case 7:
                cal.setUnit("teaspoon");
                break;
        }

        System.out.println("1. Woda\n2. Maka graham\n3. Maka krupczatka\n4. Maka kukurydziana\n5. Maka pszenna\n6. Maka ziemniaczana\n" +
                "7. Cukier krysztal\n8. Cukier puder\n9. Cukier waniliowy\n10. Kasza gryczana\n11. Kasza jeczmienna\n12. Kasza manna\n" +
                "13. Kuskus\n14. Cieciorka\n15. Mak\n16. Pszenica\n17. Ryz\n18. Soczewica\n19. Margaryna\n20. Maslo\n21. Olej\n" +
                "22. Oliwa z oliwek\n23. Mleko 2%\n24. Smietana 18%\n25. Ocet\n26. Spirytus\n27. Wino czerwone\n28. Wino biale\n" +
                "29. Wodka 40%\n30. Kakao\n31. Kawa mielona\n32. Pieprz mielony\n33. Sol\n34. Ziola mielone");
        System.out.print("Wyznacz produkt: ");
        int pChoose = in.nextInt();
        switch (pChoose) {
            case 1:
                cal.setProduct(0);
                break;
            case 2:
                cal.setProduct(1);
                break;
            case 3:
                cal.setProduct(2);
                break;
            case 4:
                cal.setProduct(3);
                break;
            case 5:
                cal.setProduct(4);
                break;
            case 6:
                cal.setProduct(5);
                break;
            case 7:
                cal.setProduct(6);
                break;
            case 8:
                cal.setProduct(7);
                break;
            case 9:
                cal.setProduct(8);
                break;
            case 10:
                cal.setProduct(9);
                break;
            case 11:
                cal.setProduct(10);
                break;
            case 12:
                cal.setProduct(11);
                break;
            case 13:
                cal.setProduct(12);
                break;
            case 14:
                cal.setProduct(13);
                break;
            case 15:
                cal.setProduct(14);
                break;
            case 16:
                cal.setProduct(15);
                break;
            case 17:
                cal.setProduct(16);
                break;
            case 18:
                cal.setProduct(17);
                break;
            case 19:
                cal.setProduct(18);
                break;
            case 20:
                cal.setProduct(19);
                break;
            case 21:
                cal.setProduct(20);
                break;
            case 22:
                cal.setProduct(21);
                break;
            case 23:
                cal.setProduct(22);
                break;
            case 24:
                cal.setProduct(23);
                break;
            case 25:
                cal.setProduct(24);
                break;
            case 26:
                cal.setProduct(25);
                break;
            case 27:
                cal.setProduct(26);
                break;
            case 28:
                cal.setProduct(27);
                break;
            case 29:
                cal.setProduct(28);
                break;
            case 30:
                cal.setProduct(29);
                break;
            case 31:
                cal.setProduct(30);
                break;
            case 32:
                cal.setProduct(31);
                break;
            case 33:
                cal.setProduct(32);
                break;
            case 34:
                cal.setProduct(33);
                break;
        }

        System.out.println("Oto wyniki:");
        System.out.println("Szklanka: " + cal.getGlass());
        System.out.println("Kilogram: " + cal.getKilogram());
        System.out.println("Gram: " + cal.getGram());
        System.out.println("Litr: " + cal.getLiter());
        System.out.println("Miniliter: " + cal.getMiniliter());
        System.out.println("Lyzka: " + cal.getSpoon());
        System.out.println("Lyzeczka: " + cal.getTeaspoon());
    }

    public static void sheets() {

        Baking bak = new Baking();
        System.out.println("1. Blacha\n2. Tortownica");
        System.out.print("Wybierz rodzaj formy z oryginalnego przepisu: ");
        Scanner in = new Scanner(System.in);
        int type1 = in.nextInt();
        switch (type1) {
            case 1: {
                bak.setType1("sheet");
                System.out.print("Podaj dlugosc pierwszego boku: ");
                double from1 = in.nextDouble();
                bak.setSheetFrom1(from1);
                System.out.print("Podaj dlugosc drugiego boku: ");
                double from2 = in.nextDouble();
                bak.setSheetFrom2(from2);
                break;
            }
            case 2: {
                bak.setType1("pan");
                System.out.print("Podaj promien tortownicy: ");
                double rad1 = in.nextDouble();
                bak.setRadius1(rad1);
                break;
            }
        }

        System.out.println("1. Blacha\n2. Tortownica");
        System.out.print("Wybierz rodzaj uzywanej przez ciebie formy: ");
        int type2 = in.nextInt();
        switch (type2) {
            case 1: {
                bak.setType2("sheet");
                System.out.print("Podaj dlugosc pierwszego boku: ");
                double to1 = in.nextDouble();
                bak.setSheetTo1(to1);
                System.out.print("Podaj dlugosc drugiego boku: ");
                double to2 = in.nextDouble();
                bak.setSheetTo2(to2);
                break;
            }
            case 2: {
                bak.setType2("pan");
                System.out.print("Podaj promien tortownicy: ");
                double rad2 = in.nextDouble();
                bak.setRadius2(rad2);
                break;
            }
        }
        //iterated arrayList ze składnikami, jednostkami oraz wartościami
        ArrayList<String> ingredients = new ArrayList<String>();
        ArrayList<String> units = new ArrayList<String>();
        ArrayList<Double> values = new ArrayList<Double>();

        System.out.print("Podaj liczbe skladnikow: ");
        int num = in.nextInt();
        String ing;
        int unit;
        double val;

        for (int i = 1; i <= num; i++) {
            System.out.print("Podaj skladnik nr " + i + ": ");
            ing = in.next();
            ingredients.add(ing);
            System.out.print("Podaj wartosc: ");
            val = in.nextDouble();
            values.add(val);
            System.out.println("1. kilogram, 2. gram, 3. litr, 4. mililitr, 5. szklanka, 6. sztuka");
            System.out.print("Podaj jednostkę: ");
            unit = in.nextInt();
            switch (unit) {
                case 1:
                    units.add("kg");
                    break;
                case 2:
                    units.add("g");
                    break;
                case 3:
                    units.add("l");
                    break;
                case 4:
                    units.add("ml");
                    break;
                case 5:
                    units.add("szkl.");
                    break;
                case 6:
                    units.add("szt.");
                    break;
            }
        }
        //prezentacja wyników
        int value = (int) bak.getResult();
        double multiplier = (double) value / 100;
        System.out.println("Nalezy uzyc " + value + " proc. ilosci skladnikow (" + multiplier + " krotnosc)");
        DecimalFormat f = new DecimalFormat("#.##");
        for (int i = 0; i < num; i++) { //po numerze składnika wyświetlana jest jego nazwa, wartość z uwzględnieniem mnożnika oraz jednostka
            System.out.println((i + 1) + ". " + ingredients.get(i) + " " + f.format(values.get(i) * multiplier) + " " + units.get(i));
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Przelicznik jednostek kuchennych\n2. Przelicznik form do pieczenia\n3. Wyjscie");
            System.out.print("Wybierz aplikacje: ");
            Scanner chooser = new Scanner(System.in);
            int appChoose = chooser.nextInt();
            switch (appChoose) {
                case 1:
                    units();
                    break;
                case 2:
                    sheets();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Nie ma takiej opcji. Wybierz ponownie");
                    break;
            }
        }
    }
}
