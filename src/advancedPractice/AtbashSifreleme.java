package advancedPractice;

public class AtbashSifreleme {
    /*
     Atbash Şifresi
     Atbash şifresi, bir kelimenin her harfinin alfabedeki
    "ayna" harfiyle değiştirildiği bir şifreleme yöntemidir:
     A <=> Z; B <=> Y; C <=> X; vb.

     Bir dize alan ve ona Atbash şifresini uygulayan bir işlev oluşturun.

    Örnekler
     atbash("apple") ➞ "zkkov"

    atbash("Hello world!") ➞ "Svool dliow!"

     atbash("Christmas is the 25th of December") ➞ "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"
     notlar
     Büyük harf kullanımı korunmalıdır.
       Alfabetik olmayan karakterler değiştirilmemelidir.*/

    /*   ASCII büyük harfler 65-90
       ASCII küçük harfler 97-122
     */
    public static <arrkk> void main(String[] args) {
        String str = "Ay@@han KEskin!!";
        int sayac = 0;
        char[] arrk = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] arrb = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        StringBuilder sb1 = new StringBuilder(str.length());

        for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) > 64 || str.charAt(i) < 91) {
               for (int j = 0; j < arrk.length; j++) {
                    if (arrk[j] == str.charAt(i)) {
                        sb1.append(arrk[(25 - j)]);
                        sayac++;
                    }
                }
            }
            if (str.charAt(i) > 96 || str.charAt(i) < 123) {
               for (int j = 0; j < arrb.length; j++) {
                    if (arrb[j] == str.charAt(i)) {
                        sb1.append(arrb[(25 - j)]);
                        sayac++;
                    }
                }
            }
            if(sayac==0){
                sb1.append(str.substring(i,i+1));
            }
           sayac=0;
        }
        System.out.println(sb1);
    }
}





