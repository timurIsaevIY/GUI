public class Bank {
    private String username;
    private int score;
    public String getUsername(){
        return username;
    }
    public int getScore(){
        return score;
    }
    public void setScore(int score){
        this.score=score;
    }
    public Bank(String username, int score){
        this.username=username;
        this.score=score;
    }
    public void recharge(Bank username, int score){
        this.score-=score;
        username.setScore(username.getScore()+score);
    }
    public void mergeAccounts(Bank username){
        if (this.username==username.getUsername()){
        this.score+= username.getScore();
        username=null;
        System.gc();}
        else {
            System.out.println("Different users");
        }
    }
    }

