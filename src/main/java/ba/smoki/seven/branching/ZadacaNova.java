package ba.smoki.seven.branching;

/***
 * <p>
 *     Nadograditi zadatak {@link ContinueWithLabelDemo}
 *     na način da ne daje odgovor samo: "Da li se riječ nalazi u rečenici"
 *     <p>
 *         Odgovor koji vi trebate dobiti je: "Koliko se puta riječ nalazi u rečenici ?"
 *     </p>
 * </p>
 */
public class ZadacaNova {
    public static void main(String[] args) {

        String recenica = "petar pan je u pantalonama pojeo panprike i zato je pan petar panova u pantalonama sa pancirima";
        String rijec = "pan";
        int panCount=0;
        int granica = recenica.length()-rijec.length();
        BROJANJE: for(int i = 0; i<=granica; i++){
            for(int j = 0; j<rijec.length(); j++){
                char slovoRecenice = recenica.charAt(i+j);
                char slovoRijeci = rijec.charAt(j);
                if(slovoRecenice != slovoRijeci){
                    continue BROJANJE;
                }
            }
            panCount++ ;
        }
        String message = "Rijec pan se nalazi " + panCount + " puta u recenici.";
        System.out.println(message);
    }
}