class ninja{
  String name,rank,jutsu,chakra;
  int speed,power;
  public ninja(String name,String rank, int speed, int power){// When constructing a ninja , he may not have chakra like rocklee or jutsu like rocklee 
  this.name=name;
  this.rank=rank;
  this.speed=speed;
  this.power=power;

  }

  public void performJutsu(){
    System.out.println("Performing generic jutsu");
  }

  public void showDetails(){
    System.out.println("\nName:"+name+"\nRank:"+rank+"\nSpeed:"+speed+"\nPower:"+power);
  }
  
  
}

class uchiha extends ninja{ // every uchiha is a ninja and will the generic attributes by default
          String dojutsu; // something that is special to a ninja i.e not all ninjas have dojutsu

         public uchiha(String name, String rank,int speed, int power){// uchihas are generally fast so no need to specify their power - their dojutsu may or may not have been activated
          super(name,rank,speed,power); // using the parent class - ninja 

         }

    public void performJutsu(){
      System.out.println("Using sharingan");
    }
    public void performJutsu(int num){
      super.performJutsu();
    }
         public void dojutsuActivate(){
           this.dojutsu="beginner";
         }
         public void dojutsuActivate(String dojutsu){
           this.dojutsu=dojutsu;
         }


         public void showDetails(){
           System.out.println("\nName:"+name+"\nRank:"+rank+"\nPower:"+power+"\nSpeed:"+speed+"\nDojutsu:"+dojutsu);
         }

}

class hyuga extends ninja{
  String dojutsu ;

    public hyuga(String name,String rank, int speed,int power){
      super(name,rank,speed,power);
    }

    public void performJutsu(){
      System.out.println("Using byukugan");
    }
    public void performJutsu(int num){
      super.performJutsu();
    }

    public void dojutsuActivate(){
      this.dojutsu="beginner";
    }
    public void dojutsuActivate(String dojutsu){
      this.dojutsu=dojutsu;
    }

    public void showDetails(){
      System.out.println("\nName:"+name+"\nRank:"+rank+"\nPower:"+power+"\nSpeed:"+speed+"\nDojutsu:"+dojutsu);
    }


}
public class oops{
  public static void main(String[] args) {
    ninja n1 = new ninja("sakura","Jonin",20,40);
    ninja n2 = new ninja("ino","chunin",30,35);
    ninja n3 = new ninja("temari","Jonin",40,50);
    ninja n4 = new ninja("rocklee","Jonin",85,87);

    n1.showDetails();
    n2.showDetails();
    n3.showDetails();
    n4.showDetails();

    n1.performJutsu();
    n2.performJutsu();
    n3.performJutsu();
    n4.performJutsu();

    uchiha u1 = new uchiha("itachi","delusion",500,101);
    uchiha u2 = new uchiha("kidSasuke","academy",7,10);

    hyuga h1 = new hyuga("neji","Jonin",70,78);
    hyuga h2 = new hyuga("himawari","academy",1,2);

    System.out.println("\nBefore activating Dojutsu: \n");

    u1.showDetails();
    System.out.println();
    u2.showDetails();

    u1.dojutsuActivate("MongekyoSharingan");
    u2.dojutsuActivate();

    System.out.println("\n After activating Dojusu: \n");

    u1.showDetails();
    System.out.println();
    u2.showDetails();

    System.out.println("\nBefore activating Dojutsu: \n");

    h1.showDetails();
    System.out.println();
    h2.showDetails();

    h1.dojutsuActivate("Blinding");
    h2.dojutsuActivate();

    System.out.println("\n After activating Dojutsu: \n");
    
    h1.showDetails();
    System.out.println();
    h2.showDetails();
    
    System.out.println("\n\nUchiha performing a jutus\n\n");
    u1.performJutsu();
    System.out.println("\n\nHyuga performing a jutus\n\n");
    h1.performJutsu();

    System.out.println("\nUchiha practise: \n");
    u1.performJutsu(1);
    System.out.println("\nhyuga practise: \n");
    h1.performJutsu(1);

  }
}
