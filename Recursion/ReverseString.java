// 013
public class ReverseString {
    public static void main(String[] args) {
        System.out.print(reverse("welcome"));
    }
    public static String reverse(String s) {
        if(s.length() <= 1 || s == null)
            return s;
        return reverse(s.substring(1) + s.charAt(0));
    }
}

/**
 *  reverse("welcome")                          ->                                               emoclew
 *  |- reverse("elcome" + 'w')                  ->                                      emoclew ^
 *      |- reverse("lcome" + 'e')               ->                              emocle  ^
 *          |- reverse("come" + 'l')            ->                      emocl   ^
 *              |- reverse("ome" + 'c')         ->              emoc    ^
 *                  |- reverse("me" + 'o')      ->      emo     ^
 *                      |- reverse("e" + 'm')   ->  em  ^
 *
 */