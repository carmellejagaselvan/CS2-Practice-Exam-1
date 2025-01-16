public class Alien {
    private int energyLevel;
    private int hostilityIndex;

    public Alien(int pEnergyLevel, int pHostilityIndex){
        energyLevel = pEnergyLevel;
        hostilityIndex = pHostilityIndex;
    }

    public int getEnergyLevel(){
        return energyLevel;
    }
    public void setEnergyLevel(int newEnergyLevel){
        this.energyLevel = newEnergyLevel;
    }

    public int getHostilityIndex(){
        return hostilityIndex;
    }
    public void setHostilityIndex(int newHostilityIndex){
        this.hostilityIndex = newHostilityIndex;
    }

    public void printInfo(){
        System.out.println("Energy Level: " + energyLevel);
        System.out.println("Hostility Index:" + hostilityIndex);
    }

}
