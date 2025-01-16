public class StarshipExplorer {

    public Alien alien1;
    public Alien[] aliens;

    public static void main(String[] args) {
        StarshipExplorer myCode = new StarshipExplorer();
    }

    private String alienLanguage = "Vrlnq*T xm!ow b*aF#nmpq*k^s jfy*e* *m&xlqw*e tT@br* lm*t oT%*ovnzr* oY#rwqs*y uo@L*oe^t aE!wqlm*u*r aD@rzxs* eB&vnyp Rlkzx*l W tnl@qp*e eXm*a#kyr*d aM^yplw o*e&mnbs*r eI!k*,srn* pC#txry*B cO@pb*elm Hlmpq*y P tn!*ojlwl rE#kxtm*n eF^l*cqrx tO&wtnq*e fC*!xtpm oK#xrnl nT@klpm cT@vrqp";

    public StarshipExplorer(){
        aliens = new Alien[50];
        alien1 = new Alien(4, 9);
        System.out.println("Hello World! Good luck on your exams!");

        for(int i=0; i<aliens.length; i=i+1){
            int randEL = (int)(Math.random()*75)+1;
            int randHI = (int)(Math.random()*101);
            aliens[i] = new Alien(randEL, randHI);
        }
        displayAliens();
        System.out.println(checkEnergy());
        System.out.println(decipher(alienLanguage));
    }



    public void displayAliens(){
        for(int i=0; i<aliens.length; i=i+1){
            aliens[i].printInfo();
        }
    }

    public boolean checkEnergy(){
        for(int i=0; i < aliens.length; i=i+1){
            for (int j=0; j<aliens.length; j++){
                if(aliens[i].getEnergyLevel() == aliens[j].getEnergyLevel() && i!=j){
                    return true;
                }
            }
        }
        return false;

    }

    public String decipher(String message){
        String decodedMessage = " ";
        int start = alienLanguage.indexOf("*");
        while (start != -1){
            decodedMessage+= alienLanguage.substring(start+1, start+2);
            start = alienLanguage.indexOf("*", start +1);
        }
        return decodedMessage;
    }
}