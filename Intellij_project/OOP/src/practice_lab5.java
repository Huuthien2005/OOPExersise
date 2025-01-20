public class practice_lab5 {
    public static class Club{
        private String name;
        private int wins;//number of wins
        private int draws;// number of draws
        private int losses;// number of losses
        public Club(){
            this.name="";
            this.wins=0;
            this.draws=0;
            this.losses=0;
        }
        public Club(String name,int wins, int draws,int losses){
            this.name=name;
            this.wins=wins;
            this.draws=draws;
            this.losses=losses;
        }
        public Club(Club club){
            this.name=club.name;
            this.wins=club.wins;
            this.draws=club.draws;
            this.losses=club.losses;
        }
        public String getName() {
            return name;
        }
        public int getWins() {
            return wins;
        }
        public int getDraws() {
            return draws;
        }
        public int getLosses() {
            return losses;
        }
        public void setName(String name) {
            this.name = name;
        }
        public void setWins(int wins) {
            this.wins = wins;
        }
        public void setDraws(int draws) {
            this.draws = draws;
        }
        public void setLosses(int losses) {
            this.losses = losses;
        }
        public int numMatchesPlayed(){
            return wins+draws+losses;
        }
        public boolean isFinish(){
            if(numMatchesPlayed()==10)
                return true;
            return false;
        }
        public int getPoint(){
            return wins*3+draws;
        }
        public String toString(){
            return name+" club: "+wins+"/"+draws+"/"+losses+" - "+getPoint();
        }
    }
    public static void main(String[] args){
        Club club=new Club("Chelsea",1,2,0);
        System.out.println(club.toString());
    }
}
