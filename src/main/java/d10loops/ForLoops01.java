package d10loops;

public class ForLoops01 {
    public static void main(String[] args) {

        /*Ornek 1: Verilen bir String'de ilk 'a' harfinden onceki tum character'leri console'a yazdiriniz
        ==> "Tramvay"==> "Tr"
        */

        //charAt() methoduna index verince size karakteri getirir
        //break anahtar kelimesi, bir döngüyü veya bir switch ifadesini erken bir şekilde sonlandırmak için kullanılır.

        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) { //i <= s.length()-1


            char ch =s.charAt(i);

            if (ch == 'a'){
                break; //a'yi gorunce donguyu kiracak
            }

            System.out.print(ch); //Tr
        }


        //Ornek 2: Verilen bir String’de kucuk harfleri console’a yazdirmayan kodu yaziniz
        //“Pwd12?Ab” ==> P12?A

        String s1 = "Pwd12?Ab";

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                continue; //islem yapma, donguye devam et, geri kalan kodlari yurutme, artirma azaltmaya git
            } else {
                System.out.println(ch);
            }


        }

        //--------------------------------------------------------------

        //ornek 3: Verilen bir String'i tersden yazan kodu yaziniz. Interview sorusu.
        //           String t = "Ali Can";  ==> "naC ilA"
        //Loop olustururken baslangic ve bitis degeri cok onemlidir

        //son index her zaman length()-1'tir
        String t = "Java";
        String ters = "";

        for (int i = t.length()-1 ; i>= 0 ; i--) {
            ters = ters + t.charAt(i);
        }
        System.out.println(ters);
        
    }
}
